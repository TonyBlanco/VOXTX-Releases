package com.google.ads.interactivemedia.v3.internal;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zg implements aae {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f25257a = new byte[4096];

    @Override // com.google.ads.interactivemedia.v3.internal.aae
    public final /* synthetic */ int a(InterfaceC1310k interfaceC1310k, int i9, boolean z9) {
        return fz.h(this, interfaceC1310k, i9, z9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aae
    public final void b(C1333s c1333s) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aae
    public final /* synthetic */ void e(cj cjVar, int i9) {
        fz.i(this, cjVar, i9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aae
    public final void f(long j9, int i9, int i10, int i11, aad aadVar) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aae
    public final int h(InterfaceC1310k interfaceC1310k, int i9, boolean z9) throws IOException {
        int iA = interfaceC1310k.a(this.f25257a, 0, Math.min(4096, i9));
        if (iA != -1) {
            return iA;
        }
        if (z9) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aae
    public final void i(cj cjVar, int i9) {
        cjVar.G(i9);
    }
}
