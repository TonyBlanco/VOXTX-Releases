package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class biu implements azo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final biz f21522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bag f21523b;

    public biu(biz bizVar, bag bagVar) {
        this.f21522a = bizVar;
        this.f21523b = bagVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azo
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrA = this.f21522a.a(bArr);
        return bjh.y(bArrA, this.f21523b.a(bjh.y(bArr2, bArrA, Arrays.copyOf(ByteBuffer.allocate(8).putLong(0L).array(), 8))));
    }
}
