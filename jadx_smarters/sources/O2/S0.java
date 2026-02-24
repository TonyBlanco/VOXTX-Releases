package O2;

import B3.C;
import B3.C0496d;
import B3.InterfaceC0517z;
import b4.InterfaceC1211b;
import d4.AbstractC1681B;
import d4.AbstractC1684a;

/* JADX INFO: loaded from: classes3.dex */
public final class S0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0517z f5864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B3.Y[] f5866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public T0 f5869f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5870g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f5871h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final E1[] f5872i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Z3.C f5873j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0894k1 f5874k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public S0 f5875l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public B3.i0 f5876m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Z3.D f5877n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f5878o;

    public S0(E1[] e1Arr, long j9, Z3.C c9, InterfaceC1211b interfaceC1211b, C0894k1 c0894k1, T0 t02, Z3.D d9) {
        this.f5872i = e1Arr;
        this.f5878o = j9;
        this.f5873j = c9;
        this.f5874k = c0894k1;
        C.b bVar = t02.f5880a;
        this.f5865b = bVar.f271a;
        this.f5869f = t02;
        this.f5876m = B3.i0.f587e;
        this.f5877n = d9;
        this.f5866c = new B3.Y[e1Arr.length];
        this.f5871h = new boolean[e1Arr.length];
        this.f5864a = e(bVar, c0894k1, interfaceC1211b, t02.f5881b, t02.f5883d);
    }

    public static InterfaceC0517z e(C.b bVar, C0894k1 c0894k1, InterfaceC1211b interfaceC1211b, long j9, long j10) {
        InterfaceC0517z interfaceC0517zH = c0894k1.h(bVar, interfaceC1211b, j9);
        return j10 != -9223372036854775807L ? new C0496d(interfaceC0517zH, true, 0L, j10) : interfaceC0517zH;
    }

    public static void u(C0894k1 c0894k1, InterfaceC0517z interfaceC0517z) {
        try {
            if (interfaceC0517z instanceof C0496d) {
                interfaceC0517z = ((C0496d) interfaceC0517z).f523a;
            }
            c0894k1.z(interfaceC0517z);
        } catch (RuntimeException e9) {
            AbstractC1681B.e("MediaPeriodHolder", "Period release failed.", e9);
        }
    }

    public void A() {
        InterfaceC0517z interfaceC0517z = this.f5864a;
        if (interfaceC0517z instanceof C0496d) {
            long j9 = this.f5869f.f5883d;
            if (j9 == -9223372036854775807L) {
                j9 = Long.MIN_VALUE;
            }
            ((C0496d) interfaceC0517z).w(0L, j9);
        }
    }

    public long a(Z3.D d9, long j9, boolean z9) {
        return b(d9, j9, z9, new boolean[this.f5872i.length]);
    }

    public long b(Z3.D d9, long j9, boolean z9, boolean[] zArr) {
        int i9 = 0;
        while (true) {
            boolean z10 = true;
            if (i9 >= d9.f11081a) {
                break;
            }
            boolean[] zArr2 = this.f5871h;
            if (z9 || !d9.b(this.f5877n, i9)) {
                z10 = false;
            }
            zArr2[i9] = z10;
            i9++;
        }
        g(this.f5866c);
        f();
        this.f5877n = d9;
        h();
        long jI = this.f5864a.i(d9.f11083c, this.f5871h, this.f5866c, zArr, j9);
        c(this.f5866c);
        this.f5868e = false;
        int i10 = 0;
        while (true) {
            B3.Y[] yArr = this.f5866c;
            if (i10 >= yArr.length) {
                return jI;
            }
            if (yArr[i10] != null) {
                AbstractC1684a.g(d9.c(i10));
                if (this.f5872i[i10].getTrackType() != -2) {
                    this.f5868e = true;
                }
            } else {
                AbstractC1684a.g(d9.f11083c[i10] == null);
            }
            i10++;
        }
    }

    public final void c(B3.Y[] yArr) {
        int i9 = 0;
        while (true) {
            E1[] e1Arr = this.f5872i;
            if (i9 >= e1Arr.length) {
                return;
            }
            if (e1Arr[i9].getTrackType() == -2 && this.f5877n.c(i9)) {
                yArr[i9] = new B3.r();
            }
            i9++;
        }
    }

    public void d(long j9) {
        AbstractC1684a.g(r());
        this.f5864a.f(y(j9));
    }

    public final void f() {
        if (!r()) {
            return;
        }
        int i9 = 0;
        while (true) {
            Z3.D d9 = this.f5877n;
            if (i9 >= d9.f11081a) {
                return;
            }
            boolean zC = d9.c(i9);
            Z3.s sVar = this.f5877n.f11083c[i9];
            if (zC && sVar != null) {
                sVar.disable();
            }
            i9++;
        }
    }

    public final void g(B3.Y[] yArr) {
        int i9 = 0;
        while (true) {
            E1[] e1Arr = this.f5872i;
            if (i9 >= e1Arr.length) {
                return;
            }
            if (e1Arr[i9].getTrackType() == -2) {
                yArr[i9] = null;
            }
            i9++;
        }
    }

    public final void h() {
        if (!r()) {
            return;
        }
        int i9 = 0;
        while (true) {
            Z3.D d9 = this.f5877n;
            if (i9 >= d9.f11081a) {
                return;
            }
            boolean zC = d9.c(i9);
            Z3.s sVar = this.f5877n.f11083c[i9];
            if (zC && sVar != null) {
                sVar.enable();
            }
            i9++;
        }
    }

    public long i() {
        if (!this.f5867d) {
            return this.f5869f.f5881b;
        }
        long jG = this.f5868e ? this.f5864a.g() : Long.MIN_VALUE;
        return jG == Long.MIN_VALUE ? this.f5869f.f5884e : jG;
    }

    public S0 j() {
        return this.f5875l;
    }

    public long k() {
        if (this.f5867d) {
            return this.f5864a.c();
        }
        return 0L;
    }

    public long l() {
        return this.f5878o;
    }

    public long m() {
        return this.f5869f.f5881b + this.f5878o;
    }

    public B3.i0 n() {
        return this.f5876m;
    }

    public Z3.D o() {
        return this.f5877n;
    }

    public void p(float f9, Q1 q12) {
        this.f5867d = true;
        this.f5876m = this.f5864a.u();
        Z3.D dV = v(f9, q12);
        T0 t02 = this.f5869f;
        long jMax = t02.f5881b;
        long j9 = t02.f5884e;
        if (j9 != -9223372036854775807L && jMax >= j9) {
            jMax = Math.max(0L, j9 - 1);
        }
        long jA = a(dV, jMax, false);
        long j10 = this.f5878o;
        T0 t03 = this.f5869f;
        this.f5878o = j10 + (t03.f5881b - jA);
        this.f5869f = t03.b(jA);
    }

    public boolean q() {
        return this.f5867d && (!this.f5868e || this.f5864a.g() == Long.MIN_VALUE);
    }

    public final boolean r() {
        return this.f5875l == null;
    }

    public void s(long j9) {
        AbstractC1684a.g(r());
        if (this.f5867d) {
            this.f5864a.h(y(j9));
        }
    }

    public void t() {
        f();
        u(this.f5874k, this.f5864a);
    }

    public Z3.D v(float f9, Q1 q12) {
        Z3.D dK = this.f5873j.k(this.f5872i, n(), this.f5869f.f5880a, q12);
        for (Z3.s sVar : dK.f11083c) {
            if (sVar != null) {
                sVar.f(f9);
            }
        }
        return dK;
    }

    public void w(S0 s02) {
        if (s02 == this.f5875l) {
            return;
        }
        f();
        this.f5875l = s02;
        h();
    }

    public void x(long j9) {
        this.f5878o = j9;
    }

    public long y(long j9) {
        return j9 - l();
    }

    public long z(long j9) {
        return j9 + l();
    }
}
