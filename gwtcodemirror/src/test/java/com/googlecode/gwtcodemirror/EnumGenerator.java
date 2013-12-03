package com.googlecode.gwtcodemirror;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class EnumGenerator {
	private static File modes = new File("src/main/resources/com/googlecode/gwtcodemirror/public/codemirror/mode/");
	private static File gwtXmlParent = new File("src/main/java/com/googlecode/gwtcodemirror/");
	private static File modeEnumFile = new File("src/main/java/com/googlecode/gwtcodemirror/client/Mode.java");

	private static StringBuilder gwtXmlAll = new StringBuilder("<?xml version='1.0' encoding='UTF-8'?>\n<module>");
	private static StringBuilder modeEnum = new StringBuilder();

	public static void main(String[] args) throws IOException {
		assert (modes.exists()) : "No Modes exists " + modes.getAbsolutePath();

		// Remove old Files
		for (File m : gwtXmlParent.listFiles())
			if (m.getName().contains("_"))
				m.delete();

		// Search for Modes
		for (File m : modes.listFiles())
			if (m.isDirectory())
				addScript(modes, m);

		// Add all_Configs File
		{
			gwtXmlAll.append("\n</module>");
			File gwtXmlFile = new File(gwtXmlParent, "GwtCodeMirror_ALL.gwt.xml");
			gwtXmlFile.createNewFile();
			PrintWriter out = new PrintWriter(gwtXmlFile);
			out.print(gwtXmlAll.toString());
			out.flush();
			out.close();
		}
		// Add Enum
		{
			modeEnumFile.createNewFile();
			PrintWriter out = new PrintWriter(modeEnumFile);
			out.append("\npackage com.googlecode.gwtcodemirror.client;");
			out.append("\npublic enum Mode {");
			out.append(modeEnum.toString());
			out.append("\n\t;");
			out.append("\n\tprivate final String mimeType;");
			out.append("\n\tMode(String mimeType) {");
			out.append("\n\t\tthis.mimeType = mimeType;");
			out.append("\n\t}");
			out.append("\n\tpublic String getMimeType() {");
			out.append("\n\t\treturn mimeType;");
			out.append("\n\t}");
			out.append("\n}");
			out.flush();
			out.close();
		}
	}

	protected static void addScript(File root, File modeFolder) throws IOException {
		// Recursive search through all subfolders
		for (File m : modeFolder.listFiles())
			if (m.isDirectory())
				addScript(root, m);

		File indexFile = new File(modeFolder, "index.html");
		File jsFile = new File(modeFolder, modeFolder.getName() + ".js");
		if (indexFile.exists() && jsFile.exists()) {

			String indexContent = readFile(indexFile);

			String mode = getByCodeBlock(indexContent);
			if (mode == null)
				mode = getByModeString(indexContent);
			if (mode == null)
				System.err.println("Ignoring " + modeFolder.getName() + " because no Codeblock or other Hints for the language found in indexfile");

			String name = modeFolder.getAbsolutePath().substring(root.getAbsolutePath().length() + 1);
			name = name.replace("\\", "/").replace("/", "_").toUpperCase();

			System.out.println("Adding " + name + " :: " + mode);

			String gwtXml = "<?xml version='1.0' encoding='UTF-8'?>\n<module>" + "\n\t<inherits name='com.googlecode.gwtcodemirror.GwtCodeMirror'/>" //
					+ "\n\t<script src='codemirror/mode" //
					+ jsFile.getAbsolutePath().substring(root.getAbsolutePath().length()).replace("\\", "/") //
					+ "' />\n</module>";

			gwtXmlAll.append("\n\t<inherits name='com.googlecode.gwtcodemirror.GwtCodeMirror_" + name + "'/>");

			modeEnum.append("\n\t/**\n\t * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_" + name + ".gwt.xml to make this work\n\t */");
			modeEnum.append("\n\t" + name + "(\"" + mode + "\"),");
			File gwtXmlFile = new File(gwtXmlParent, "GwtCodeMirror_" + name + ".gwt.xml");
			gwtXmlFile.createNewFile();
			PrintWriter out = new PrintWriter(gwtXmlFile);
			out.print(gwtXml);
			out.flush();
			out.close();
		}
	}

	private static String getByModeString(String content) {
		String ret = getByModeString(content, '"');
		if (ret == null)
			ret = getByModeString(content, '\'');
		return ret;
	}

	private static String getByModeString(String content, char stringmarker) {
		String ret = getByModeString(content, stringmarker, "mode: ");
		if (ret == null)
			ret = getByModeString(content, stringmarker, "mode: {name: ");
		if (ret == null)
			ret = getByModeString(content, stringmarker, "mode:\r\n        {name: ");
		return ret;
	}

	private static String getByModeString(String content, char stringmarker, String prefixWithoutStringMarker) {
		String prefix = prefixWithoutStringMarker + stringmarker;
		String toFind = prefix;// + "text/";
		int index = content.indexOf(toFind);
		if (index >= 0) {
			int end = content.indexOf(stringmarker, index + toFind.length());
			if (end >= 0) {
				String found = content.substring(index + prefix.length(), end);
				System.err.println("Needed fallback and found " + found);
				return found;
			}
		}
		return null;
	}

	private static String getByCodeBlock(String content) {
		if (!content.contains("<code>")) {
			return null;
		}
		int modeIndexOf = content.indexOf("<code>");
		String mode = content.substring(modeIndexOf + 6, content.indexOf("</code>", modeIndexOf));
		if (mode.contains("{")) {
			modeIndexOf = content.indexOf("<code>", modeIndexOf + 1);
			mode = content.substring(modeIndexOf + 6, content.indexOf("</code>", modeIndexOf));
		}
		if (mode.startsWith("<a")) {
			mode = mode.substring(mode.indexOf(">") + 1);
			mode = mode.substring(0, mode.indexOf("<"));
		}
		return mode;
	}

	private static String readFile(File file) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = null;
		StringBuilder stringBuilder = new StringBuilder();
		String ls = System.getProperty("line.separator");

		while ((line = reader.readLine()) != null) {
			stringBuilder.append(line);
			stringBuilder.append(ls);
		}

		return stringBuilder.toString();
	}
}
