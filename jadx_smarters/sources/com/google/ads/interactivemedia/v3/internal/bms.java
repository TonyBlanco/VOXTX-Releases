package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class bms extends bkl {
    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final /* bridge */ /* synthetic */ Object read(boh bohVar) throws IOException {
        if (bohVar.r() == 9) {
            bohVar.m();
            return null;
        }
        String strH = bohVar.h();
        if (strH.length() == 1) {
            return Character.valueOf(strH.charAt(0));
        }
        throw new bkf("Expecting character, got: " + strH + "; at " + bohVar.f());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final /* bridge */ /* synthetic */ void write(boj bojVar, Object obj) throws IOException {
        Character ch = (Character) obj;
        bojVar.l(ch == null ? null : ch.toString());
    }
}
