package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes4.dex */
enum MethodType {
    GET(3),
    IS(2),
    SET(3),
    NONE(0);

    private int prefix;

    MethodType(int i9) {
        this.prefix = i9;
    }

    public int getPrefix() {
        return this.prefix;
    }
}
