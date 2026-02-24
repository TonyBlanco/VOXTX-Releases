package org.simpleframework.xml.stream;

/* JADX INFO: loaded from: classes4.dex */
public class CamelCaseStyle implements Style {
    private final Builder builder;
    private final Style style;

    public CamelCaseStyle() {
        this(true, false);
    }

    public CamelCaseStyle(boolean z9) {
        this(z9, false);
    }

    public CamelCaseStyle(boolean z9, boolean z10) {
        CamelCaseBuilder camelCaseBuilder = new CamelCaseBuilder(z9, z10);
        this.style = camelCaseBuilder;
        this.builder = new Builder(camelCaseBuilder);
    }

    @Override // org.simpleframework.xml.stream.Style
    public String getAttribute(String str) {
        return this.builder.getAttribute(str);
    }

    @Override // org.simpleframework.xml.stream.Style
    public String getElement(String str) {
        return this.builder.getElement(str);
    }

    public void setAttribute(String str, String str2) {
        this.builder.setAttribute(str, str2);
    }

    public void setElement(String str, String str2) {
        this.builder.setElement(str, str2);
    }
}
