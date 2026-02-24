package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class us implements aae {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1333s f24761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f24762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f24763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1333s f24764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final zg f24765e = new zg();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private aae f24766f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f24767g;

    public us(int i9, int i10, C1333s c1333s) {
        this.f24762b = i9;
        this.f24763c = i10;
        this.f24764d = c1333s;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aae
    public final /* synthetic */ int a(InterfaceC1310k interfaceC1310k, int i9, boolean z9) {
        return fz.h(this, interfaceC1310k, i9, z9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aae
    public final void b(C1333s c1333s) {
        C1333s c1333s2 = this.f24764d;
        if (c1333s2 != null) {
            c1333s = c1333s.d(c1333s2);
        }
        this.f24761a = c1333s;
        aae aaeVar = this.f24766f;
        int i9 = cq.f22640a;
        aaeVar.b(c1333s);
    }

    public final void c(zo zoVar, long j9) {
        if (zoVar == null) {
            this.f24766f = this.f24765e;
            return;
        }
        this.f24767g = j9;
        aae aaeVarC = zoVar.c(this.f24763c);
        this.f24766f = aaeVarC;
        C1333s c1333s = this.f24761a;
        if (c1333s != null) {
            aaeVarC.b(c1333s);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aae
    public final /* synthetic */ void e(cj cjVar, int i9) {
        fz.i(this, cjVar, i9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aae
    public final void f(long j9, int i9, int i10, int i11, aad aadVar) {
        long j10 = this.f24767g;
        if (j10 != -9223372036854775807L && j9 >= j10) {
            this.f24766f = this.f24765e;
        }
        aae aaeVar = this.f24766f;
        int i12 = cq.f22640a;
        aaeVar.f(j9, i9, i10, i11, aadVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aae
    public final int h(InterfaceC1310k interfaceC1310k, int i9, boolean z9) throws IOException {
        aae aaeVar = this.f24766f;
        int i10 = cq.f22640a;
        return aaeVar.a(interfaceC1310k, i9, z9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aae
    public final void i(cj cjVar, int i9) {
        aae aaeVar = this.f24766f;
        int i10 = cq.f22640a;
        aaeVar.e(cjVar, i9);
    }
}
