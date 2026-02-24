package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class sx implements td, tc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final te f24554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f24555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private tg f24556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private td f24557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private tc f24558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f24559f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final wr f24560g;

    public sx(te teVar, wr wrVar, long j9) {
        this.f24554a = teVar;
        this.f24560g = wrVar;
        this.f24555b = j9;
    }

    private final long u(long j9) {
        long j10 = this.f24559f;
        return j10 != -9223372036854775807L ? j10 : j9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td
    public final long a(long j9, hl hlVar) {
        td tdVar = this.f24557d;
        int i9 = cq.f22640a;
        return tdVar.a(j9, hlVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tc
    public final void bl(td tdVar) {
        tc tcVar = this.f24558e;
        int i9 = cq.f22640a;
        tcVar.bl(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td
    public final void bm() throws IOException {
        td tdVar = this.f24557d;
        if (tdVar != null) {
            tdVar.bm();
            return;
        }
        tg tgVar = this.f24556c;
        if (tgVar != null) {
            tgVar.h();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td, com.google.ads.interactivemedia.v3.internal.uh
    public final long bo() {
        td tdVar = this.f24557d;
        int i9 = cq.f22640a;
        return tdVar.bo();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td, com.google.ads.interactivemedia.v3.internal.uh
    public final long c() {
        td tdVar = this.f24557d;
        int i9 = cq.f22640a;
        return tdVar.c();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td
    public final long d() {
        td tdVar = this.f24557d;
        int i9 = cq.f22640a;
        return tdVar.d();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td
    public final long e(long j9) {
        td tdVar = this.f24557d;
        int i9 = cq.f22640a;
        return tdVar.e(j9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td
    public final long f(we[] weVarArr, boolean[] zArr, uf[] ufVarArr, boolean[] zArr2, long j9) {
        long j10;
        long j11 = this.f24559f;
        if (j11 == -9223372036854775807L || j9 != this.f24555b) {
            j10 = j9;
        } else {
            this.f24559f = -9223372036854775807L;
            j10 = j11;
        }
        td tdVar = this.f24557d;
        int i9 = cq.f22640a;
        return tdVar.f(weVarArr, zArr, ufVarArr, zArr2, j10);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ug
    public final /* bridge */ /* synthetic */ void g(uh uhVar) {
        tc tcVar = this.f24558e;
        int i9 = cq.f22640a;
        tcVar.g(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td
    public final um h() {
        td tdVar = this.f24557d;
        int i9 = cq.f22640a;
        return tdVar.h();
    }

    public final long j() {
        return this.f24559f;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td
    public final void k(tc tcVar, long j9) {
        this.f24558e = tcVar;
        td tdVar = this.f24557d;
        if (tdVar != null) {
            tdVar.k(this, u(this.f24555b));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td, com.google.ads.interactivemedia.v3.internal.uh
    public final void l(long j9) {
        td tdVar = this.f24557d;
        int i9 = cq.f22640a;
        tdVar.l(j9);
    }

    public final long m() {
        return this.f24555b;
    }

    public final void n(te teVar) {
        long jU = u(this.f24555b);
        tg tgVar = this.f24556c;
        af.s(tgVar);
        td tdVarQ = tgVar.q(teVar, this.f24560g, jU);
        this.f24557d = tdVarQ;
        if (this.f24558e != null) {
            tdVarQ.k(this, jU);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td, com.google.ads.interactivemedia.v3.internal.uh
    public final boolean o(long j9) {
        td tdVar = this.f24557d;
        return tdVar != null && tdVar.o(j9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td, com.google.ads.interactivemedia.v3.internal.uh
    public final boolean p() {
        td tdVar = this.f24557d;
        return tdVar != null && tdVar.p();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.td
    public final void q(long j9) {
        td tdVar = this.f24557d;
        int i9 = cq.f22640a;
        tdVar.q(j9);
    }

    public final void r(long j9) {
        this.f24559f = j9;
    }

    public final void s() {
        if (this.f24557d != null) {
            tg tgVar = this.f24556c;
            af.s(tgVar);
            tgVar.o(this.f24557d);
        }
    }

    public final void t(tg tgVar) {
        af.w(this.f24556c == null);
        this.f24556c = tgVar;
    }
}
