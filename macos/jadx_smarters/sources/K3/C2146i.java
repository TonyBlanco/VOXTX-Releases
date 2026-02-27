package k3;

import Q2.b0;
import com.google.android.exoplayer2.extractor.g;
import d3.u;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.M;
import d4.k0;

/* JADX INFO: renamed from: k3.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2146i implements InterfaceC2144g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f43571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f43572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f43573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f43574f;

    public C2146i(long j9, int i9, long j10) {
        this(j9, i9, j10, -1L, null);
    }

    public C2146i(long j9, int i9, long j10, long j11, long[] jArr) {
        this.f43569a = j9;
        this.f43570b = i9;
        this.f43571c = j10;
        this.f43574f = jArr;
        this.f43572d = j11;
        this.f43573e = j11 != -1 ? j9 + j11 : -1L;
    }

    public static C2146i a(long j9, long j10, b0.a aVar, M m9) {
        int iL;
        int i9 = aVar.f7774g;
        int i10 = aVar.f7771d;
        int iQ = m9.q();
        if ((iQ & 1) != 1 || (iL = m9.L()) == 0) {
            return null;
        }
        long jC1 = k0.c1(iL, ((long) i9) * 1000000, i10);
        if ((iQ & 6) != 6) {
            return new C2146i(j10, aVar.f7770c, jC1);
        }
        long J9 = m9.J();
        long[] jArr = new long[100];
        for (int i11 = 0; i11 < 100; i11++) {
            jArr[i11] = m9.H();
        }
        if (j9 != -1) {
            long j11 = j10 + J9;
            if (j9 != j11) {
                AbstractC1681B.j("XingSeeker", "XING data size mismatch: " + j9 + ", " + j11);
            }
        }
        return new C2146i(j10, aVar.f7770c, jC1, J9, jArr);
    }

    public final long b(int i9) {
        return (this.f43571c * ((long) i9)) / 100;
    }

    @Override // k3.InterfaceC2144g
    public long c(long j9) {
        long j10 = j9 - this.f43569a;
        if (!g() || j10 <= this.f43570b) {
            return 0L;
        }
        long[] jArr = (long[]) AbstractC1684a.i(this.f43574f);
        double d9 = (j10 * 256.0d) / this.f43572d;
        int i9 = k0.i(jArr, (long) d9, true, true);
        long jB = b(i9);
        long j11 = jArr[i9];
        int i10 = i9 + 1;
        long jB2 = b(i10);
        return jB + Math.round((j11 == (i9 == 99 ? 256L : jArr[i10]) ? 0.0d : (d9 - j11) / (r0 - j11)) * (jB2 - jB));
    }

    @Override // com.google.android.exoplayer2.extractor.g
    public g.a e(long j9) {
        if (!g()) {
            return new g.a(new u(0L, this.f43569a + ((long) this.f43570b)));
        }
        long jS = k0.s(j9, 0L, this.f43571c);
        double d9 = (jS * 100.0d) / this.f43571c;
        double d10 = 0.0d;
        if (d9 > 0.0d) {
            if (d9 >= 100.0d) {
                d10 = 256.0d;
            } else {
                int i9 = (int) d9;
                double d11 = ((long[]) AbstractC1684a.i(this.f43574f))[i9];
                d10 = d11 + ((d9 - ((double) i9)) * ((i9 == 99 ? 256.0d : r3[i9 + 1]) - d11));
            }
        }
        return new g.a(new u(jS, this.f43569a + k0.s(Math.round((d10 / 256.0d) * this.f43572d), this.f43570b, this.f43572d - 1)));
    }

    @Override // k3.InterfaceC2144g
    public long f() {
        return this.f43573e;
    }

    @Override // com.google.android.exoplayer2.extractor.g
    public boolean g() {
        return this.f43574f != null;
    }

    @Override // com.google.android.exoplayer2.extractor.g
    public long i() {
        return this.f43571c;
    }
}
