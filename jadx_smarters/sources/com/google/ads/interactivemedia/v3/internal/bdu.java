package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
final class bdu {
    private bdu(byte[] bArr, byte[] bArr2) {
        bjj.b(bArr);
        bjj.b(bArr2);
    }

    private bdu(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        bjj.b(bArr);
        bjj.b(bArr2);
    }

    public static bdu a(byte[] bArr) throws GeneralSecurityException {
        return new bdu(bArr, bjh.c(bArr));
    }

    public static bdu b(byte[] bArr, byte[] bArr2, int i9) throws GeneralSecurityException {
        bjh.m(bjh.r(i9, 1, bArr2), bjh.q(i9, bArr));
        return new bdu(bArr, bArr2, null);
    }
}
