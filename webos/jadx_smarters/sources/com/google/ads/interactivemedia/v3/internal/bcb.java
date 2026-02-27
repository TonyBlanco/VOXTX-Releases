package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes3.dex */
public final class bcb extends bcc {
    public bcb(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bcc
    public final bca a(byte[] bArr, int i9) throws InvalidKeyException {
        return new bbz(bArr, i9);
    }
}
