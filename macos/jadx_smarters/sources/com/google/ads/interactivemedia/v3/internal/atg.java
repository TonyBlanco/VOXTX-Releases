package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class atg implements bkm {
    @Override // com.google.ads.interactivemedia.v3.internal.bkm
    public final bkl a(bjt bjtVar, bof bofVar) {
        Class clsC = bofVar.c();
        atf atfVar = (atf) clsC.getAnnotation(atf.class);
        if (atfVar == null || clsC == atfVar.a()) {
            return null;
        }
        return bjtVar.b(atfVar.a());
    }
}
