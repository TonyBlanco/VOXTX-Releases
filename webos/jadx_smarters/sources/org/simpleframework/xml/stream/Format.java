package org.simpleframework.xml.stream;

/* JADX INFO: loaded from: classes4.dex */
public class Format {
    private final int indent;
    private final String prolog;
    private final Style style;
    private final Verbosity verbosity;

    public Format() {
        this(3);
    }

    public Format(int i9) {
        this(i9, (String) null, new IdentityStyle());
    }

    public Format(int i9, String str) {
        this(i9, str, new IdentityStyle());
    }

    public Format(int i9, String str, Style style) {
        this(i9, str, style, Verbosity.HIGH);
    }

    public Format(int i9, String str, Style style, Verbosity verbosity) {
        this.verbosity = verbosity;
        this.prolog = str;
        this.indent = i9;
        this.style = style;
    }

    public Format(int i9, Style style) {
        this(i9, (String) null, style);
    }

    public Format(int i9, Style style, Verbosity verbosity) {
        this(i9, null, style, verbosity);
    }

    public Format(int i9, Verbosity verbosity) {
        this(i9, new IdentityStyle(), verbosity);
    }

    public Format(String str) {
        this(3, str);
    }

    public Format(Style style) {
        this(3, style);
    }

    public Format(Style style, Verbosity verbosity) {
        this(3, style, verbosity);
    }

    public Format(Verbosity verbosity) {
        this(3, verbosity);
    }

    public int getIndent() {
        return this.indent;
    }

    public String getProlog() {
        return this.prolog;
    }

    public Style getStyle() {
        return this.style;
    }

    public Verbosity getVerbosity() {
        return this.verbosity;
    }
}
