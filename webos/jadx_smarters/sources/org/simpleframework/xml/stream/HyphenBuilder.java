package org.simpleframework.xml.stream;

/* JADX INFO: loaded from: classes4.dex */
class HyphenBuilder implements Style {

    public class Parser extends Splitter {
        private Parser(String str) {
            super(str);
        }

        @Override // org.simpleframework.xml.stream.Splitter
        public void commit(char[] cArr, int i9, int i10) {
            this.builder.append(cArr, i9, i10);
            if (i9 + i10 < this.count) {
                this.builder.append('-');
            }
        }

        @Override // org.simpleframework.xml.stream.Splitter
        public void parse(char[] cArr, int i9, int i10) {
            cArr[i9] = toLower(cArr[i9]);
        }
    }

    @Override // org.simpleframework.xml.stream.Style
    public String getAttribute(String str) {
        if (str != null) {
            return new Parser(str).process();
        }
        return null;
    }

    @Override // org.simpleframework.xml.stream.Style
    public String getElement(String str) {
        if (str != null) {
            return new Parser(str).process();
        }
        return null;
    }
}
