package com.googlecode.gwtcodemirror.client;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.core.client.Callback;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.ScriptInjector;

public class CodeMirrorInitializer {
	public interface FinishedHandler {
		void onFinished();
	}

	private CodeMirrorInitializer() {
	}

	private static boolean rootInjected = false;
	private static ArrayList<Mode> injected = new ArrayList<>();

	public static void addSupport(Mode... mode) {
		addSupport(null, mode);
	}

	public static void addSupport(FinishedHandler handler, Mode... mode) {
		if (injected.contains(mode))
			return;
		ArrayList<String> toInject = new ArrayList<>();
		if (!rootInjected) {
			rootInjected = true;
			toInject.add("codemirror/codemirror.js");
		}
		for (Mode m : mode) {
			toInject.add(m.getJsPath());
			injected.add(m);
		}
		inject(handler, toInject);
	}

	private static void inject(final FinishedHandler handler, final List<String> p_jsList) {
		final String js = GWT.getModuleBaseForStaticFiles() + p_jsList.remove(0);

		ScriptInjector.fromUrl(js).setCallback(new Callback<Void, Exception>() {
			@Override
			public void onFailure(Exception e) {
				throw new RuntimeException("Initialisation of " + js + " failed", e);
			}

			@Override
			public void onSuccess(Void ok) {
				if (!p_jsList.isEmpty())
					inject(handler, p_jsList);
				else if (handler != null)
					handler.onFinished();
			}
		}).setWindow(ScriptInjector.TOP_WINDOW).inject();
	}
}
