package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes4.dex */
class Template {
    protected char[] buf;
    protected String cache;
    protected int count;

    public Template() {
        this(16);
    }

    public Template(int i9) {
        this.buf = new char[i9];
    }

    public void append(char c9) {
        ensureCapacity(this.count + 1);
        char[] cArr = this.buf;
        int i9 = this.count;
        this.count = i9 + 1;
        cArr[i9] = c9;
    }

    public void append(String str) {
        ensureCapacity(this.count + str.length());
        str.getChars(0, str.length(), this.buf, this.count);
        this.count += str.length();
    }

    public void append(String str, int i9, int i10) {
        ensureCapacity(this.count + i10);
        str.getChars(i9, i10, this.buf, this.count);
        this.count += i10;
    }

    public void append(Template template) {
        append(template.buf, 0, template.count);
    }

    public void append(Template template, int i9, int i10) {
        append(template.buf, i9, i10);
    }

    public void append(char[] cArr, int i9, int i10) {
        ensureCapacity(this.count + i10);
        System.arraycopy(cArr, i9, this.buf, this.count, i10);
        this.count += i10;
    }

    public void clear() {
        this.cache = null;
        this.count = 0;
    }

    public void ensureCapacity(int i9) {
        char[] cArr = this.buf;
        if (cArr.length < i9) {
            char[] cArr2 = new char[Math.max(i9, cArr.length * 2)];
            System.arraycopy(this.buf, 0, cArr2, 0, this.count);
            this.buf = cArr2;
        }
    }

    public int length() {
        return this.count;
    }

    public String toString() {
        return new String(this.buf, 0, this.count);
    }
}
