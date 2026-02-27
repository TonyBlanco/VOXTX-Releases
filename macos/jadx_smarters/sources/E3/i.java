package E3;

import B3.Y;
import O2.A0;
import O2.C0936z0;
import d4.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0936z0 f1687a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f1689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1690e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public F3.f f1691f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1692g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1693h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s3.c f1688c = new s3.c();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f1694i = -9223372036854775807L;

    public i(F3.f fVar, C0936z0 c0936z0, boolean z9) {
        this.f1687a = c0936z0;
        this.f1691f = fVar;
        this.f1689d = fVar.f1964b;
        d(fVar, z9);
    }

    @Override // B3.Y
    public void a() {
    }

    public String b() {
        return this.f1691f.a();
    }

    public void c(long j9) {
        int iE = k0.e(this.f1689d, j9, true, false);
        this.f1693h = iE;
        if (!this.f1690e || iE != this.f1689d.length) {
            j9 = -9223372036854775807L;
        }
        this.f1694i = j9;
    }

    public void d(F3.f fVar, boolean z9) {
        int i9 = this.f1693h;
        long j9 = i9 == 0 ? -9223372036854775807L : this.f1689d[i9 - 1];
        this.f1690e = z9;
        this.f1691f = fVar;
        long[] jArr = fVar.f1964b;
        this.f1689d = jArr;
        long j10 = this.f1694i;
        if (j10 != -9223372036854775807L) {
            c(j10);
        } else if (j9 != -9223372036854775807L) {
            this.f1693h = k0.e(jArr, j9, false, false);
        }
    }

    @Override // B3.Y
    public boolean e() {
        return true;
    }

    @Override // B3.Y
    public int n(long j9) {
        int iMax = Math.max(this.f1693h, k0.e(this.f1689d, j9, true, false));
        int i9 = iMax - this.f1693h;
        this.f1693h = iMax;
        return i9;
    }

    @Override // B3.Y
    public int q(A0 a02, U2.g gVar, int i9) {
        int i10 = this.f1693h;
        boolean z9 = i10 == this.f1689d.length;
        if (z9 && !this.f1690e) {
            gVar.setFlags(4);
            return -4;
        }
        if ((i9 & 2) != 0 || !this.f1692g) {
            a02.f5499b = this.f1687a;
            this.f1692g = true;
            return -5;
        }
        if (z9) {
            return -3;
        }
        if ((i9 & 1) == 0) {
            this.f1693h = i10 + 1;
        }
        if ((i9 & 4) == 0) {
            byte[] bArrA = this.f1688c.a(this.f1691f.f1963a[i10]);
            gVar.e(bArrA.length);
            gVar.f9699d.put(bArrA);
        }
        gVar.f9701f = this.f1689d[i10];
        gVar.setFlags(1);
        return -4;
    }
}
