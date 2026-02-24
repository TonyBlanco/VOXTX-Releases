package org.simpleframework.xml.stream;

/* JADX INFO: loaded from: classes4.dex */
abstract class Splitter {
    protected StringBuilder builder = new StringBuilder();
    protected int count;
    protected int off;
    protected char[] text;

    public Splitter(String str) {
        char[] charArray = str.toCharArray();
        this.text = charArray;
        this.count = charArray.length;
    }

    private boolean acronym() {
        int i9 = this.off;
        int i10 = 0;
        while (i9 < this.count && isUpper(this.text[i9])) {
            i10++;
            i9++;
        }
        if (i10 > 1) {
            if (i9 < this.count && isUpper(this.text[i9 - 1])) {
                i9--;
            }
            char[] cArr = this.text;
            int i11 = this.off;
            commit(cArr, i11, i9 - i11);
            this.off = i9;
        }
        return i10 > 1;
    }

    private boolean isDigit(char c9) {
        return Character.isDigit(c9);
    }

    private boolean isLetter(char c9) {
        return Character.isLetter(c9);
    }

    private boolean isSpecial(char c9) {
        return !Character.isLetterOrDigit(c9);
    }

    private boolean isUpper(char c9) {
        return Character.isUpperCase(c9);
    }

    private boolean number() {
        int i9 = this.off;
        int i10 = 0;
        while (i9 < this.count && isDigit(this.text[i9])) {
            i10++;
            i9++;
        }
        if (i10 > 0) {
            char[] cArr = this.text;
            int i11 = this.off;
            commit(cArr, i11, i9 - i11);
        }
        this.off = i9;
        return i10 > 0;
    }

    private void token() {
        int i9 = this.off;
        while (i9 < this.count) {
            char c9 = this.text[i9];
            if (!isLetter(c9) || (i9 > this.off && isUpper(c9))) {
                break;
            } else {
                i9++;
            }
        }
        int i10 = this.off;
        if (i9 > i10) {
            parse(this.text, i10, i9 - i10);
            char[] cArr = this.text;
            int i11 = this.off;
            commit(cArr, i11, i9 - i11);
        }
        this.off = i9;
    }

    public abstract void commit(char[] cArr, int i9, int i10);

    public abstract void parse(char[] cArr, int i9, int i10);

    public String process() {
        while (this.off < this.count) {
            while (true) {
                int i9 = this.off;
                if (i9 >= this.count || !isSpecial(this.text[i9])) {
                    break;
                }
                this.off++;
            }
            if (!acronym()) {
                token();
                number();
            }
        }
        return this.builder.toString();
    }

    public char toLower(char c9) {
        return Character.toLowerCase(c9);
    }

    public char toUpper(char c9) {
        return Character.toUpperCase(c9);
    }
}
