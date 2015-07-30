# What is gwtcodemirror #
gwtcodemirror is a Wrapper for the original [CodeMirror](http://codemirror.net).

Current used Version is codemirror v3.16.

## It supports ##
  * All Modes of CodeMirror
  * Enable/Disable of the Editor
  * Feel free to request more Features if u need them

## How to add it to your project ##

check out the Project (not on Central Maven-Repository yet)
and add the following to your pom.xml in dependencies
```
<dependency>
    <groupId>com.googlecode.gwtcodemirror</groupId>
    <artifactId>gwtcodemirror</artifactId>
    <version>0.0.1-SNAPSHOT</version>
</dependency>
```

Add the inherits to your **.gwt.xml of the Modes/Languages you needed
```
    <!-- Mode-Pattern -->
    <inherits name='com.googlecode.gwtcodemirror.GwtCodeMirror_xxx'/>

    <!-- For example for JS -->
    <inherits name='com.googlecode.gwtcodemirror.GwtCodeMirror_JAVASCRIPT'/>

    <!-- Or for all Modes (WARN: over 70 js will be needed to download by the client) -->
    <inherits name='com.googlecode.gwtcodemirror.GwtCodeMirror_ALL'/>

```**

You can see the Names via Javadoc in the [Mode-enum](https://code.google.com/p/gwtcodemirror/source/browse/gwtcodemirror/src/main/java/com/googlecode/gwtcodemirror/client/Mode.java) of the Project.

## Setup of the Widget ##
```
    CodemirrorEditor editor=new CodemirrorEditor();
    // See at this enum the needed inherit for your *.gwt.xml
    editor.setMode(Mode.JAVASCRIPT);
    editor.setValue("MYSCRIPT");
```