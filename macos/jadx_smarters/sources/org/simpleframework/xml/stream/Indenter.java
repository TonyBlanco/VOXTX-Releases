package org.simpleframework.xml.stream;

import org.apache.http.message.TokenParser;

/* JADX INFO: loaded from: classes4.dex */
class Indenter {
    private Cache cache;
    private int count;
    private int indent;
    private int index;

    public static class Cache {
        private int count;
        private String[] list;

        public Cache(int i9) {
            this.list = new String[i9];
        }

        private void resize(int i9) {
            String[] strArr = new String[i9];
            int i10 = 0;
            while (true) {
                String[] strArr2 = this.list;
                if (i10 >= strArr2.length) {
                    this.list = strArr;
                    return;
                } else {
                    strArr[i10] = strArr2[i10];
                    i10++;
                }
            }
        }

        public String get(int i9) {
            String[] strArr = this.list;
            if (i9 < strArr.length) {
                return strArr[i9];
            }
            return null;
        }

        public void set(int i9, String str) {
            if (i9 >= this.list.length) {
                resize(i9 * 2);
            }
            if (i9 > this.count) {
                this.count = i9;
            }
            this.list[i9] = str;
        }

        public int size() {
            return this.count;
        }
    }

    public Indenter() {
        this(new Format());
    }

    public Indenter(Format format) {
        this(format, 16);
    }

    private Indenter(Format format, int i9) {
        this.indent = format.getIndent();
        this.cache = new Cache(i9);
    }

    private String create() {
        int i9 = this.count;
        char[] cArr = new char[i9 + 1];
        if (i9 <= 0) {
            return "\n";
        }
        cArr[0] = '\n';
        for (int i10 = 1; i10 <= this.count; i10++) {
            cArr[i10] = TokenParser.SP;
        }
        return new String(cArr);
    }

    private String indent(int i9) {
        if (this.indent <= 0) {
            return "";
        }
        String strCreate = this.cache.get(i9);
        if (strCreate == null) {
            strCreate = create();
            this.cache.set(i9, strCreate);
        }
        return this.cache.size() > 0 ? strCreate : "";
    }

    public String pop() {
        int i9 = this.index - 1;
        this.index = i9;
        String strIndent = indent(i9);
        int i10 = this.indent;
        if (i10 > 0) {
            this.count -= i10;
        }
        return strIndent;
    }

    public String push() {
        int i9 = this.index;
        this.index = i9 + 1;
        String strIndent = indent(i9);
        int i10 = this.indent;
        if (i10 > 0) {
            this.count += i10;
        }
        return strIndent;
    }

    public String top() {
        return indent(this.index);
    }
}
