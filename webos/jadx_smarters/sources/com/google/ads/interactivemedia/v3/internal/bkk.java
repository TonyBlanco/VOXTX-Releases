package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class bkk extends bkl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ bkl f21606a;

    public bkk(bkl bklVar) {
        this.f21606a = bklVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final Object read(boh bohVar) throws IOException {
        if (bohVar.r() != 9) {
            return this.f21606a.read(bohVar);
        }
        bohVar.m();
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final void write(boj bojVar, Object obj) throws IOException {
        if (obj == null) {
            bojVar.g();
        } else {
            this.f21606a.write(bojVar, obj);
        }
    }
}
