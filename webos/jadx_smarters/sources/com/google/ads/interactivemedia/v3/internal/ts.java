package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class ts implements uf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ tv f24614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f24615b;

    public ts(tv tvVar, int i9) {
        this.f24614a = tvVar;
        this.f24615b = i9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uf
    public final int a(go goVar, ef efVar, int i9) {
        return this.f24614a.g(this.f24615b, goVar, efVar, i9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uf
    public final int b(long j9) {
        return this.f24614a.j(this.f24615b, j9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uf
    public final void d() throws IOException {
        this.f24614a.G(this.f24615b);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uf
    public final boolean g() {
        return this.f24614a.J(this.f24615b);
    }
}
