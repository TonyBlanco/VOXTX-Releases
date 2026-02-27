package org.jsoup.parser;

/* JADX INFO: loaded from: classes4.dex */
public class ParseError {
    private String errorMsg;
    private int pos;

    public ParseError(int i9, String str) {
        this.pos = i9;
        this.errorMsg = str;
    }

    public ParseError(int i9, String str, Object... objArr) {
        this.errorMsg = String.format(str, objArr);
        this.pos = i9;
    }

    public String getErrorMessage() {
        return this.errorMsg;
    }

    public int getPosition() {
        return this.pos;
    }

    public String toString() {
        return this.pos + ": " + this.errorMsg;
    }
}
