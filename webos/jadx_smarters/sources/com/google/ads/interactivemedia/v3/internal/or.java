package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class or extends vc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f23935a;

    public or(cy cyVar, dc dcVar, C1333s c1333s, int i9, byte[] bArr) {
        super(cyVar, dcVar, c1333s, i9, bArr);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vc
    public final void a(byte[] bArr, int i9) {
        this.f23935a = Arrays.copyOf(bArr, i9);
    }

    public final byte[] b() {
        return this.f23935a;
    }
}
