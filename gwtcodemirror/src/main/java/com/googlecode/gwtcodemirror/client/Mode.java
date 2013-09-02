
package com.googlecode.gwtcodemirror.client;
public enum Mode {
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_APL.gwt.xml to make this work
	 */
	APL("text/apl"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_ASTERISK.gwt.xml to make this work
	 */
	ASTERISK("text/x-asterisk"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_CLIKE.gwt.xml to make this work
	 */
	CLIKE("keywords"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_CLOJURE.gwt.xml to make this work
	 */
	CLOJURE("text/x-clojure"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_COFFEESCRIPT.gwt.xml to make this work
	 */
	COFFEESCRIPT("text/x-coffeescript"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_COMMONLISP.gwt.xml to make this work
	 */
	COMMONLISP("text/x-common-lisp"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_CSS.gwt.xml to make this work
	 */
	CSS("text/css"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_D.gwt.xml to make this work
	 */
	D("text/x-d"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_DIFF.gwt.xml to make this work
	 */
	DIFF("text/x-diff"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_ECL.gwt.xml to make this work
	 */
	ECL("text/x-ecl"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_ERLANG.gwt.xml to make this work
	 */
	ERLANG("text/x-erlang"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_GAS.gwt.xml to make this work
	 */
	GAS("architecture"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_GO.gwt.xml to make this work
	 */
	GO("text/x-go"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_GROOVY.gwt.xml to make this work
	 */
	GROOVY("text/x-groovy"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_HAML.gwt.xml to make this work
	 */
	HAML("text/x-haml"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_HASKELL.gwt.xml to make this work
	 */
	HASKELL("text/x-haskell"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_HAXE.gwt.xml to make this work
	 */
	HAXE("text/x-haxe"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_HTMLEMBEDDED.gwt.xml to make this work
	 */
	HTMLEMBEDDED("application/x-aspx"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_HTMLMIXED.gwt.xml to make this work
	 */
	HTMLMIXED("scriptTypes"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_HTTP.gwt.xml to make this work
	 */
	HTTP("message/http"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_JADE.gwt.xml to make this work
	 */
	JADE("text/x-jade"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_JAVASCRIPT.gwt.xml to make this work
	 */
	JAVASCRIPT("json"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_LESS.gwt.xml to make this work
	 */
	LESS("text/x-less"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_LIVESCRIPT.gwt.xml to make this work
	 */
	LIVESCRIPT("text/x-livescript"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_LUA.gwt.xml to make this work
	 */
	LUA("specials"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_MARKDOWN.gwt.xml to make this work
	 */
	MARKDOWN("text/x-markdown"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_MIRC.gwt.xml to make this work
	 */
	MIRC("text/mirc"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_NGINX.gwt.xml to make this work
	 */
	NGINX("text/nginx"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_NTRIPLES.gwt.xml to make this work
	 */
	NTRIPLES("text/n-triples"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_OCAML.gwt.xml to make this work
	 */
	OCAML("text/x-ocaml"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_PASCAL.gwt.xml to make this work
	 */
	PASCAL("text/x-pascal"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_PERL.gwt.xml to make this work
	 */
	PERL("text/x-perl"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_PHP.gwt.xml to make this work
	 */
	PHP("application/x-httpd-php"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_PIG.gwt.xml to make this work
	 */
	PIG("text/x-pig"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_PROPERTIES.gwt.xml to make this work
	 */
	PROPERTIES("text/x-properties"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_PYTHON.gwt.xml to make this work
	 */
	PYTHON("text/x-python"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_Q.gwt.xml to make this work
	 */
	Q("text/x-q"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_R.gwt.xml to make this work
	 */
	R("text/x-rsrc"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_RPM_CHANGES.gwt.xml to make this work
	 */
	RPM_CHANGES("text/x-rpm-changes"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_RPM_SPEC.gwt.xml to make this work
	 */
	RPM_SPEC("text/x-rpm-spec"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_RST.gwt.xml to make this work
	 */
	RST("python"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_RUBY.gwt.xml to make this work
	 */
	RUBY("text/x-ruby"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_RUST.gwt.xml to make this work
	 */
	RUST("text/x-rustsrc"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_SASS.gwt.xml to make this work
	 */
	SASS("text/x-sass"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_SCHEME.gwt.xml to make this work
	 */
	SCHEME("text/x-scheme"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_SHELL.gwt.xml to make this work
	 */
	SHELL("text/x-sh"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_SIEVE.gwt.xml to make this work
	 */
	SIEVE("application/sieve"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_SMALLTALK.gwt.xml to make this work
	 */
	SMALLTALK("text/x-stsrc"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_SMARTY.gwt.xml to make this work
	 */
	SMARTY("text/x-smarty"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_SMARTYMIXED.gwt.xml to make this work
	 */
	SMARTYMIXED("text/x-smarty"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_SPARQL.gwt.xml to make this work
	 */
	SPARQL("application/x-sparql-query"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_SQL.gwt.xml to make this work
	 */
	SQL("text/x-sql"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_STEX.gwt.xml to make this work
	 */
	STEX("text/x-stex"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_TCL.gwt.xml to make this work
	 */
	TCL("text/x-tcl"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_TIDDLYWIKI.gwt.xml to make this work
	 */
	TIDDLYWIKI("text/x-tiddlywiki"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_TURTLE.gwt.xml to make this work
	 */
	TURTLE("text/turtle"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_VB.gwt.xml to make this work
	 */
	VB("text/x-vb"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_VBSCRIPT.gwt.xml to make this work
	 */
	VBSCRIPT("text/vbscript"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_VELOCITY.gwt.xml to make this work
	 */
	VELOCITY("text/velocity"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_VERILOG.gwt.xml to make this work
	 */
	VERILOG("keywords"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_XML.gwt.xml to make this work
	 */
	XML("htmlMode (boolean)"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_XQUERY.gwt.xml to make this work
	 */
	XQUERY("application/xquery"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_YAML.gwt.xml to make this work
	 */
	YAML("text/x-yaml"),
	/**
	 * You need to inherit com.googlecode.gwtcodemirror.GwtCodeMirror_Z80.gwt.xml to make this work
	 */
	Z80("text/x-z80"),
	;
	private final String mimeType;
	Mode(String mimeType) {
		this.mimeType = mimeType;
	}
	public String getMimeType() {
		return mimeType;
	}
}