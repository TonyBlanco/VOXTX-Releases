package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class bkx extends bkl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f21623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f21624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ bjt f21625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ bof f21626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ bky f21627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private bkl f21628f;

    public bkx(bky bkyVar, boolean z9, boolean z10, bjt bjtVar, bof bofVar) {
        this.f21627e = bkyVar;
        this.f21623a = z9;
        this.f21624b = z10;
        this.f21625c = bjtVar;
        this.f21626d = bofVar;
    }

    private final bkl a() {
        bkl bklVar = this.f21628f;
        if (bklVar != null) {
            return bklVar;
        }
        bkl bklVarC = this.f21625c.c(this.f21627e, this.f21626d);
        this.f21628f = bklVarC;
        return bklVarC;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final Object read(boh bohVar) throws IOException {
        if (!this.f21623a) {
            return a().read(bohVar);
        }
        bohVar.o();
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final void write(boj bojVar, Object obj) throws IOException {
        if (this.f21624b) {
            bojVar.g();
        } else {
            a().write(bojVar, obj);
        }
    }
}
