package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
final class bmv extends bkl {
    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final /* bridge */ /* synthetic */ Object read(boh bohVar) throws IOException {
        if (bohVar.r() == 9) {
            bohVar.m();
            return null;
        }
        String strH = bohVar.h();
        try {
            return new BigInteger(strH);
        } catch (NumberFormatException e9) {
            throw new bkf("Failed parsing '" + strH + "' as BigInteger; at path " + bohVar.f(), e9);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final /* synthetic */ void write(boj bojVar, Object obj) throws IOException {
        bojVar.k((BigInteger) obj);
    }
}
