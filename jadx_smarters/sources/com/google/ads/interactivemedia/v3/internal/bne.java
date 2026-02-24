package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.Currency;

/* JADX INFO: loaded from: classes3.dex */
final class bne extends bkl {
    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final /* bridge */ /* synthetic */ Object read(boh bohVar) throws IOException {
        String strH = bohVar.h();
        try {
            return Currency.getInstance(strH);
        } catch (IllegalArgumentException e9) {
            throw new bkf("Failed parsing '" + strH + "' as Currency; at path " + bohVar.f(), e9);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final /* bridge */ /* synthetic */ void write(boj bojVar, Object obj) throws IOException {
        bojVar.l(((Currency) obj).getCurrencyCode());
    }
}
