package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class sd implements uf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uf f24492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ se f24493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24494c;

    public sd(se seVar, uf ufVar) {
        this.f24493b = seVar;
        this.f24492a = ufVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uf
    public final int a(go goVar, ef efVar, int i9) {
        if (this.f24493b.j()) {
            return -3;
        }
        if (this.f24494c) {
            efVar.c(4);
            return -4;
        }
        int iA = this.f24492a.a(goVar, efVar, i9);
        if (iA == -5) {
            C1333s c1333s = goVar.f23064b;
            af.s(c1333s);
            int i10 = c1333s.f24451B;
            if (i10 != 0 || c1333s.f24452C != 0) {
                int i11 = this.f24493b.f24496b != Long.MIN_VALUE ? 0 : c1333s.f24452C;
                r rVarB = c1333s.b();
                rVarB.N(i10);
                rVarB.O(i11);
                goVar.f23064b = rVarB.v();
            }
            return -5;
        }
        se seVar = this.f24493b;
        long j9 = seVar.f24496b;
        if (j9 == Long.MIN_VALUE || ((iA != -4 || efVar.f22776d < j9) && !(iA == -3 && seVar.bo() == Long.MIN_VALUE && !efVar.f22775c))) {
            return iA;
        }
        efVar.b();
        efVar.c(4);
        this.f24494c = true;
        return -4;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uf
    public final int b(long j9) {
        if (this.f24493b.j()) {
            return -3;
        }
        return this.f24492a.b(j9);
    }

    public final void c() {
        this.f24494c = false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uf
    public final void d() throws IOException {
        this.f24492a.d();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uf
    public final boolean g() {
        return !this.f24493b.j() && this.f24492a.g();
    }
}
