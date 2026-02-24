package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class bnq extends bkl {
    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final /* bridge */ /* synthetic */ Object read(boh bohVar) throws IOException {
        if (bohVar.r() == 9) {
            bohVar.m();
            return null;
        }
        try {
            int iB = bohVar.b();
            if (iB <= 65535 && iB >= -32768) {
                return Short.valueOf((short) iB);
            }
            throw new bkf("Lossy conversion from " + iB + " to short; at path " + bohVar.f());
        } catch (NumberFormatException e9) {
            throw new bkf(e9);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final /* bridge */ /* synthetic */ void write(boj bojVar, Object obj) throws IOException {
        if (((Number) obj) == null) {
            bojVar.g();
        } else {
            bojVar.i(r4.shortValue());
        }
    }
}
