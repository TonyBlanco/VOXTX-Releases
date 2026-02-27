package org.jsoup.nodes;

/* JADX INFO: loaded from: classes4.dex */
public class BooleanAttribute extends Attribute {
    public BooleanAttribute(String str) {
        super(str, "");
    }

    @Override // org.jsoup.nodes.Attribute
    public boolean isBooleanAttribute() {
        return true;
    }
}
