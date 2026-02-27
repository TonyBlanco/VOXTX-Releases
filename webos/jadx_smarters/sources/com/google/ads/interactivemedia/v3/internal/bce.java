package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes3.dex */
public final class bce extends bcc {
    public bce(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bcc
    public final bca a(byte[] bArr, int i9) throws InvalidKeyException {
        return new bcd(bArr, i9);
    }
}
