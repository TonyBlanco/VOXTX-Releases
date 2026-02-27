package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class bjs<T> extends bkl<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private bkl f21569a;

    public final void a(bkl bklVar) {
        if (this.f21569a != null) {
            throw new AssertionError();
        }
        this.f21569a = bklVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final T read(boh bohVar) throws IOException {
        bkl bklVar = this.f21569a;
        if (bklVar != null) {
            return (T) bklVar.read(bohVar);
        }
        throw new IllegalStateException();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final void write(boj bojVar, T t9) throws IOException {
        bkl bklVar = this.f21569a;
        if (bklVar == null) {
            throw new IllegalStateException();
        }
        bklVar.write(bojVar, t9);
    }
}
