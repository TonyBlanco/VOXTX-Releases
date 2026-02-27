package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class aam extends aaj {
    public static final aal c(cj cjVar) {
        String strS = cjVar.s();
        af.s(strS);
        String strS2 = cjVar.s();
        af.s(strS2);
        return new aal(strS, strS2, cjVar.o(), cjVar.o(), Arrays.copyOfRange(cjVar.H(), cjVar.c(), cjVar.d()));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aaj
    public final ao b(ByteBuffer byteBuffer) {
        return new ao(c(new cj(byteBuffer.array(), byteBuffer.limit())));
    }
}
