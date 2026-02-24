package org.simpleframework.xml.stream;

import java.io.BufferedWriter;
import java.io.Writer;
import org.apache.http.message.TokenParser;

/* JADX INFO: loaded from: classes4.dex */
class Formatter {
    private OutputBuffer buffer = new OutputBuffer();
    private Indenter indenter;
    private Tag last;
    private String prolog;
    private Writer result;
    private static final char[] NAMESPACE = {'x', 'm', 'l', 'n', 's'};
    private static final char[] LESS = {'&', 'l', 't', ';'};
    private static final char[] GREATER = {'&', 'g', 't', ';'};
    private static final char[] DOUBLE = {'&', 'q', 'u', 'o', 't', ';'};
    private static final char[] SINGLE = {'&', 'a', 'p', 'o', 's', ';'};
    private static final char[] AND = {'&', 'a', 'm', 'p', ';'};
    private static final char[] OPEN = {'<', '!', '-', '-', TokenParser.SP};
    private static final char[] CLOSE = {TokenParser.SP, '-', '-', '>'};

    public enum Tag {
        COMMENT,
        START,
        TEXT,
        END
    }

    public Formatter(Writer writer, Format format) {
        this.result = new BufferedWriter(writer, 1024);
        this.indenter = new Indenter(format);
        this.prolog = format.getProlog();
    }

    private void append(char c9) throws Exception {
        this.buffer.append(c9);
    }

    private void append(String str) throws Exception {
        this.buffer.append(str);
    }

    private void append(char[] cArr) throws Exception {
        this.buffer.append(cArr);
    }

    private void data(String str) throws Exception {
        write("<![CDATA[");
        write(str);
        write("]]>");
    }

    private void escape(char c9) throws Exception {
        char[] cArrSymbol = symbol(c9);
        if (cArrSymbol != null) {
            write(cArrSymbol);
        } else {
            write(c9);
        }
    }

    private void escape(String str) throws Exception {
        int length = str.length();
        for (int i9 = 0; i9 < length; i9++) {
            escape(str.charAt(i9));
        }
    }

    private boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    private boolean isText(char c9) {
        if (c9 == '\t' || c9 == '\n' || c9 == '\r' || c9 == ' ') {
            return true;
        }
        return c9 > ' ' && c9 <= '~' && c9 != 247;
    }

    private char[] symbol(char c9) {
        if (c9 == '\"') {
            return DOUBLE;
        }
        if (c9 == '<') {
            return LESS;
        }
        if (c9 == '>') {
            return GREATER;
        }
        if (c9 == '&') {
            return AND;
        }
        if (c9 != '\'') {
            return null;
        }
        return SINGLE;
    }

    private String unicode(char c9) {
        return Integer.toString(c9);
    }

    private void write(char c9) throws Exception {
        this.buffer.write(this.result);
        this.buffer.clear();
        this.result.write(c9);
    }

    private void write(String str) throws Exception {
        this.buffer.write(this.result);
        this.buffer.clear();
        this.result.write(str);
    }

    private void write(String str, String str2) throws Exception {
        this.buffer.write(this.result);
        this.buffer.clear();
        if (!isEmpty(str2)) {
            this.result.write(str2);
            this.result.write(58);
        }
        this.result.write(str);
    }

    private void write(char[] cArr) throws Exception {
        this.buffer.write(this.result);
        this.buffer.clear();
        this.result.write(cArr);
    }

    public void flush() throws Exception {
        this.buffer.write(this.result);
        this.buffer.clear();
        this.result.flush();
    }

    public void writeAttribute(String str, String str2, String str3) throws Exception {
        if (this.last != Tag.START) {
            throw new NodeException("Start element required");
        }
        write(TokenParser.SP);
        write(str, str3);
        write('=');
        write(TokenParser.DQUOTE);
        escape(str2);
        write(TokenParser.DQUOTE);
    }

    public void writeComment(String str) throws Exception {
        String pVar = this.indenter.top();
        if (this.last == Tag.START) {
            append('>');
        }
        if (pVar != null) {
            append(pVar);
            append(OPEN);
            append(str);
            append(CLOSE);
        }
        this.last = Tag.COMMENT;
    }

    public void writeEnd(String str, String str2) throws Exception {
        String strPop = this.indenter.pop();
        Tag tag = this.last;
        Tag tag2 = Tag.START;
        if (tag != tag2) {
            if (tag != Tag.TEXT) {
                write(strPop);
            }
            if (this.last != tag2) {
                write('<');
                write('/');
                write(str, str2);
            }
            this.last = Tag.END;
        }
        write('/');
        write('>');
        this.last = Tag.END;
    }

    public void writeNamespace(String str, String str2) throws Exception {
        if (this.last != Tag.START) {
            throw new NodeException("Start element required");
        }
        write(TokenParser.SP);
        write(NAMESPACE);
        if (!isEmpty(str2)) {
            write(':');
            write(str2);
        }
        write('=');
        write(TokenParser.DQUOTE);
        escape(str);
        write(TokenParser.DQUOTE);
    }

    public void writeProlog() throws Exception {
        String str = this.prolog;
        if (str != null) {
            write(str);
            write("\n");
        }
    }

    public void writeStart(String str, String str2) throws Exception {
        String strPush = this.indenter.push();
        Tag tag = this.last;
        Tag tag2 = Tag.START;
        if (tag == tag2) {
            append('>');
        }
        flush();
        append(strPush);
        append('<');
        if (!isEmpty(str2)) {
            append(str2);
            append(':');
        }
        append(str);
        this.last = tag2;
    }

    public void writeText(String str) throws Exception {
        writeText(str, Mode.ESCAPE);
    }

    public void writeText(String str, Mode mode) throws Exception {
        if (this.last == Tag.START) {
            write('>');
        }
        if (mode == Mode.DATA) {
            data(str);
        } else {
            escape(str);
        }
        this.last = Tag.TEXT;
    }
}
