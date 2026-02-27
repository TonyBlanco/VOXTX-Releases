package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes3.dex */
final class bov extends boz {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f21866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f21867d;

    public bov(byte[] bArr, int i9, int i10) {
        super(bArr);
        bpb.q(i9, i9 + i10, bArr.length);
        this.f21866c = i9;
        this.f21867d = i10;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.boz, com.google.ads.interactivemedia.v3.internal.bpb
    public final byte a(int i9) {
        bpb.z(i9, this.f21867d);
        return this.f21868a[this.f21866c + i9];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.boz, com.google.ads.interactivemedia.v3.internal.bpb
    public final byte b(int i9) {
        return this.f21868a[this.f21866c + i9];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.boz
    public final int c() {
        return this.f21866c;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.boz, com.google.ads.interactivemedia.v3.internal.bpb
    public final int d() {
        return this.f21867d;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.boz, com.google.ads.interactivemedia.v3.internal.bpb
    public final void e(byte[] bArr, int i9, int i10, int i11) {
        System.arraycopy(this.f21868a, this.f21866c + i9, bArr, i10, i11);
    }

    public Object writeReplace() {
        return bpb.x(B());
    }
}
