package org.simpleframework.xml.stream;

/* JADX INFO: loaded from: classes4.dex */
class CamelCaseBuilder implements Style {
    protected final boolean attribute;
    protected final boolean element;

    public class Attribute extends Splitter {
        private boolean capital;

        private Attribute(String str) {
            super(str);
        }

        @Override // org.simpleframework.xml.stream.Splitter
        public void commit(char[] cArr, int i9, int i10) {
            this.builder.append(cArr, i9, i10);
        }

        @Override // org.simpleframework.xml.stream.Splitter
        public void parse(char[] cArr, int i9, int i10) {
            if (CamelCaseBuilder.this.attribute || this.capital) {
                cArr[i9] = toUpper(cArr[i9]);
            }
            this.capital = true;
        }
    }

    public class Element extends Attribute {
        private boolean capital;

        private Element(String str) {
            super(str);
        }

        @Override // org.simpleframework.xml.stream.CamelCaseBuilder.Attribute, org.simpleframework.xml.stream.Splitter
        public void parse(char[] cArr, int i9, int i10) {
            if (CamelCaseBuilder.this.element || this.capital) {
                cArr[i9] = toUpper(cArr[i9]);
            }
            this.capital = true;
        }
    }

    public CamelCaseBuilder(boolean z9, boolean z10) {
        this.attribute = z10;
        this.element = z9;
    }

    @Override // org.simpleframework.xml.stream.Style
    public String getAttribute(String str) {
        if (str != null) {
            return new Attribute(str).process();
        }
        return null;
    }

    @Override // org.simpleframework.xml.stream.Style
    public String getElement(String str) {
        if (str != null) {
            return new Element(str).process();
        }
        return null;
    }
}
