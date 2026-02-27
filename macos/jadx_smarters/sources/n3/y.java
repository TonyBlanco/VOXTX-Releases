package n3;

import d3.InterfaceC1673j;
import d4.AbstractC1681B;
import d4.M;
import d4.Z;
import d4.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f45255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f45256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f45257e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z f45253a = new Z(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f45258f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f45259g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f45260h = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f45254b = new M();

    public static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    public static long l(M m9) {
        int iF = m9.f();
        if (m9.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        m9.l(bArr, 0, 9);
        m9.U(iF);
        if (a(bArr)) {
            return m(bArr);
        }
        return -9223372036854775807L;
    }

    public static long m(byte[] bArr) {
        byte b9 = bArr[0];
        long j9 = (((((long) b9) & 56) >> 3) << 30) | ((((long) b9) & 3) << 28) | ((((long) bArr[1]) & 255) << 20);
        byte b10 = bArr[2];
        return j9 | (((((long) b10) & 248) >> 3) << 15) | ((((long) b10) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    public final int b(InterfaceC1673j interfaceC1673j) {
        this.f45254b.R(k0.f39782f);
        this.f45255c = true;
        interfaceC1673j.f();
        return 0;
    }

    public long c() {
        return this.f45260h;
    }

    public Z d() {
        return this.f45253a;
    }

    public boolean e() {
        return this.f45255c;
    }

    public final int f(byte[] bArr, int i9) {
        return (bArr[i9 + 3] & 255) | ((bArr[i9] & 255) << 24) | ((bArr[i9 + 1] & 255) << 16) | ((bArr[i9 + 2] & 255) << 8);
    }

    public int g(InterfaceC1673j interfaceC1673j, d3.t tVar) {
        if (!this.f45257e) {
            return j(interfaceC1673j, tVar);
        }
        if (this.f45259g == -9223372036854775807L) {
            return b(interfaceC1673j);
        }
        if (!this.f45256d) {
            return h(interfaceC1673j, tVar);
        }
        long j9 = this.f45258f;
        if (j9 == -9223372036854775807L) {
            return b(interfaceC1673j);
        }
        long jB = this.f45253a.b(this.f45259g) - this.f45253a.b(j9);
        this.f45260h = jB;
        if (jB < 0) {
            AbstractC1681B.j("PsDurationReader", "Invalid duration: " + this.f45260h + ". Using TIME_UNSET instead.");
            this.f45260h = -9223372036854775807L;
        }
        return b(interfaceC1673j);
    }

    public final int h(InterfaceC1673j interfaceC1673j, d3.t tVar) {
        int iMin = (int) Math.min(20000L, interfaceC1673j.getLength());
        long j9 = 0;
        if (interfaceC1673j.getPosition() != j9) {
            tVar.f39608a = j9;
            return 1;
        }
        this.f45254b.Q(iMin);
        interfaceC1673j.f();
        interfaceC1673j.s(this.f45254b.e(), 0, iMin);
        this.f45258f = i(this.f45254b);
        this.f45256d = true;
        return 0;
    }

    public final long i(M m9) {
        int iG = m9.g();
        for (int iF = m9.f(); iF < iG - 3; iF++) {
            if (f(m9.e(), iF) == 442) {
                m9.U(iF + 4);
                long jL = l(m9);
                if (jL != -9223372036854775807L) {
                    return jL;
                }
            }
        }
        return -9223372036854775807L;
    }

    public final int j(InterfaceC1673j interfaceC1673j, d3.t tVar) {
        long length = interfaceC1673j.getLength();
        int iMin = (int) Math.min(20000L, length);
        long j9 = length - ((long) iMin);
        if (interfaceC1673j.getPosition() != j9) {
            tVar.f39608a = j9;
            return 1;
        }
        this.f45254b.Q(iMin);
        interfaceC1673j.f();
        interfaceC1673j.s(this.f45254b.e(), 0, iMin);
        this.f45259g = k(this.f45254b);
        this.f45257e = true;
        return 0;
    }

    public final long k(M m9) {
        int iF = m9.f();
        for (int iG = m9.g() - 4; iG >= iF; iG--) {
            if (f(m9.e(), iG) == 442) {
                m9.U(iG + 4);
                long jL = l(m9);
                if (jL != -9223372036854775807L) {
                    return jL;
                }
            }
        }
        return -9223372036854775807L;
    }
}
