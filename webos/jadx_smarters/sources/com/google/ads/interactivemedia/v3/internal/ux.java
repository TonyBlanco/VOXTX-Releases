package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class ux implements uf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uz f24790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ uz f24791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ue f24792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f24793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f24794e;

    public ux(uz uzVar, uz uzVar2, ue ueVar, int i9) {
        this.f24791b = uzVar;
        this.f24790a = uzVar2;
        this.f24792c = ueVar;
        this.f24793d = i9;
    }

    private final void e() {
        if (this.f24794e) {
            return;
        }
        uz uzVar = this.f24791b;
        tj tjVar = uzVar.f24802h;
        int[] iArr = uzVar.f24797c;
        int i9 = this.f24793d;
        tjVar.o(iArr[i9], uzVar.f24798d[i9], 0, uzVar.f24813s);
        this.f24794e = true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uf
    public final int a(go goVar, ef efVar, int i9) {
        if (this.f24791b.n()) {
            return -3;
        }
        e();
        return this.f24792c.o(goVar, efVar, i9, this.f24791b.f24796b);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uf
    public final int b(long j9) {
        uz uzVar = this.f24791b;
        if (uzVar.n()) {
            return 0;
        }
        int iL = this.f24792c.l(j9, uzVar.f24796b);
        this.f24792c.G(iL);
        if (iL > 0) {
            e();
        }
        return iL;
    }

    public final void c() {
        af.w(this.f24791b.f24799e[this.f24793d]);
        this.f24791b.f24799e[this.f24793d] = false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uf
    public final void d() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uf
    public final boolean g() {
        uz uzVar = this.f24791b;
        return !uzVar.n() && this.f24792c.K(uzVar.f24796b);
    }
}
