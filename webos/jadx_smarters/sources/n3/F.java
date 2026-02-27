package n3;

import d3.InterfaceC1673j;
import d4.AbstractC1681B;
import d4.M;
import d4.Z;
import d4.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44931a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f44934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f44935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f44936f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z f44932b = new Z(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f44937g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f44938h = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f44939i = -9223372036854775807L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M f44933c = new M();

    public F(int i9) {
        this.f44931a = i9;
    }

    public final int a(InterfaceC1673j interfaceC1673j) {
        this.f44933c.R(k0.f39782f);
        this.f44934d = true;
        interfaceC1673j.f();
        return 0;
    }

    public long b() {
        return this.f44939i;
    }

    public Z c() {
        return this.f44932b;
    }

    public boolean d() {
        return this.f44934d;
    }

    public int e(InterfaceC1673j interfaceC1673j, d3.t tVar, int i9) {
        if (i9 <= 0) {
            return a(interfaceC1673j);
        }
        if (!this.f44936f) {
            return h(interfaceC1673j, tVar, i9);
        }
        if (this.f44938h == -9223372036854775807L) {
            return a(interfaceC1673j);
        }
        if (!this.f44935e) {
            return f(interfaceC1673j, tVar, i9);
        }
        long j9 = this.f44937g;
        if (j9 == -9223372036854775807L) {
            return a(interfaceC1673j);
        }
        long jB = this.f44932b.b(this.f44938h) - this.f44932b.b(j9);
        this.f44939i = jB;
        if (jB < 0) {
            AbstractC1681B.j("TsDurationReader", "Invalid duration: " + this.f44939i + ". Using TIME_UNSET instead.");
            this.f44939i = -9223372036854775807L;
        }
        return a(interfaceC1673j);
    }

    public final int f(InterfaceC1673j interfaceC1673j, d3.t tVar, int i9) {
        int iMin = (int) Math.min(this.f44931a, interfaceC1673j.getLength());
        long j9 = 0;
        if (interfaceC1673j.getPosition() != j9) {
            tVar.f39608a = j9;
            return 1;
        }
        this.f44933c.Q(iMin);
        interfaceC1673j.f();
        interfaceC1673j.s(this.f44933c.e(), 0, iMin);
        this.f44937g = g(this.f44933c, i9);
        this.f44935e = true;
        return 0;
    }

    public final long g(M m9, int i9) {
        int iG = m9.g();
        for (int iF = m9.f(); iF < iG; iF++) {
            if (m9.e()[iF] == 71) {
                long jC = J.c(m9, iF, i9);
                if (jC != -9223372036854775807L) {
                    return jC;
                }
            }
        }
        return -9223372036854775807L;
    }

    public final int h(InterfaceC1673j interfaceC1673j, d3.t tVar, int i9) {
        long length = interfaceC1673j.getLength();
        int iMin = (int) Math.min(this.f44931a, length);
        long j9 = length - ((long) iMin);
        if (interfaceC1673j.getPosition() != j9) {
            tVar.f39608a = j9;
            return 1;
        }
        this.f44933c.Q(iMin);
        interfaceC1673j.f();
        interfaceC1673j.s(this.f44933c.e(), 0, iMin);
        this.f44938h = i(this.f44933c, i9);
        this.f44936f = true;
        return 0;
    }

    public final long i(M m9, int i9) {
        int iF = m9.f();
        int iG = m9.g();
        for (int i10 = iG - 188; i10 >= iF; i10--) {
            if (J.b(m9.e(), iF, iG, i10)) {
                long jC = J.c(m9, i10, i9);
                if (jC != -9223372036854775807L) {
                    return jC;
                }
            }
        }
        return -9223372036854775807L;
    }
}
