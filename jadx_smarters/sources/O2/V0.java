package O2;

import B3.C;
import B3.InterfaceC0517z;
import O2.Q1;
import P2.InterfaceC0984a;
import android.util.Pair;
import b4.InterfaceC1211b;
import d4.AbstractC1684a;
import d4.InterfaceC1705w;
import s5.AbstractC2743y;

/* JADX INFO: loaded from: classes3.dex */
public final class V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q1.b f5894a = new Q1.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q1.d f5895b = new Q1.d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0984a f5896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1705w f5897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f5898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5899f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5900g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public S0 f5901h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public S0 f5902i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public S0 f5903j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5904k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f5905l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f5906m;

    public V0(InterfaceC0984a interfaceC0984a, InterfaceC1705w interfaceC1705w) {
        this.f5896c = interfaceC0984a;
        this.f5897d = interfaceC1705w;
    }

    public static C.b E(Q1 q12, Object obj, long j9, long j10, Q1.d dVar, Q1.b bVar) {
        q12.m(obj, bVar);
        q12.s(bVar.f5718d, dVar);
        Object objE = obj;
        for (int iF = q12.f(obj); z(bVar) && iF <= dVar.f5759q; iF++) {
            q12.l(iF, bVar, true);
            objE = AbstractC1684a.e(bVar.f5717c);
        }
        q12.m(objE, bVar);
        int i9 = bVar.i(j9);
        return i9 == -1 ? new C.b(objE, j10, bVar.g(j9)) : new C.b(objE, i9, bVar.q(i9), j10);
    }

    public static boolean z(Q1.b bVar) {
        int iF = bVar.f();
        if (iF == 0) {
            return false;
        }
        if ((iF == 1 && bVar.w(0)) || !bVar.x(bVar.u())) {
            return false;
        }
        long jN = 0;
        if (bVar.i(0L) != -1) {
            return false;
        }
        if (bVar.f5719e == 0) {
            return true;
        }
        int i9 = iF - (bVar.w(iF + (-1)) ? 2 : 1);
        for (int i10 = 0; i10 <= i9; i10++) {
            jN += bVar.n(i10);
        }
        return bVar.f5719e <= jN;
    }

    public final /* synthetic */ void A(AbstractC2743y.a aVar, C.b bVar) {
        this.f5896c.e0(aVar.k(), bVar);
    }

    public final void B() {
        final AbstractC2743y.a aVarP = AbstractC2743y.p();
        for (S0 s0J = this.f5901h; s0J != null; s0J = s0J.j()) {
            aVarP.a(s0J.f5869f.f5880a);
        }
        S0 s02 = this.f5902i;
        final C.b bVar = s02 == null ? null : s02.f5869f.f5880a;
        this.f5897d.i(new Runnable() { // from class: O2.U0
            @Override // java.lang.Runnable
            public final void run() {
                this.f5890a.A(aVarP, bVar);
            }
        });
    }

    public void C(long j9) {
        S0 s02 = this.f5903j;
        if (s02 != null) {
            s02.s(j9);
        }
    }

    public boolean D(S0 s02) {
        boolean z9 = false;
        AbstractC1684a.g(s02 != null);
        if (s02.equals(this.f5903j)) {
            return false;
        }
        this.f5903j = s02;
        while (s02.j() != null) {
            s02 = s02.j();
            if (s02 == this.f5902i) {
                this.f5902i = this.f5901h;
                z9 = true;
            }
            s02.t();
            this.f5904k--;
        }
        this.f5903j.w(null);
        B();
        return z9;
    }

    public C.b F(Q1 q12, Object obj, long j9) {
        long jG = G(q12, obj);
        q12.m(obj, this.f5894a);
        q12.s(this.f5894a.f5718d, this.f5895b);
        boolean z9 = false;
        for (int iF = q12.f(obj); iF >= this.f5895b.f5758p; iF--) {
            q12.l(iF, this.f5894a, true);
            boolean z10 = this.f5894a.f() > 0;
            z9 |= z10;
            Q1.b bVar = this.f5894a;
            if (bVar.i(bVar.f5719e) != -1) {
                obj = AbstractC1684a.e(this.f5894a.f5717c);
            }
            if (z9 && (!z10 || this.f5894a.f5719e != 0)) {
                break;
            }
        }
        return E(q12, obj, j9, jG, this.f5895b, this.f5894a);
    }

    public final long G(Q1 q12, Object obj) {
        int iF;
        int i9 = q12.m(obj, this.f5894a).f5718d;
        Object obj2 = this.f5905l;
        if (obj2 != null && (iF = q12.f(obj2)) != -1 && q12.k(iF, this.f5894a).f5718d == i9) {
            return this.f5906m;
        }
        S0 s0J = this.f5901h;
        while (true) {
            if (s0J == null) {
                s0J = this.f5901h;
                while (s0J != null) {
                    int iF2 = q12.f(s0J.f5865b);
                    if (iF2 == -1 || q12.k(iF2, this.f5894a).f5718d != i9) {
                        s0J = s0J.j();
                    }
                }
                long j9 = this.f5898e;
                this.f5898e = 1 + j9;
                if (this.f5901h == null) {
                    this.f5905l = obj;
                    this.f5906m = j9;
                }
                return j9;
            }
            if (s0J.f5865b.equals(obj)) {
                break;
            }
            s0J = s0J.j();
        }
        return s0J.f5869f.f5880a.f274d;
    }

    public boolean H() {
        S0 s02 = this.f5903j;
        return s02 == null || (!s02.f5869f.f5888i && s02.q() && this.f5903j.f5869f.f5884e != -9223372036854775807L && this.f5904k < 100);
    }

    public final boolean I(Q1 q12) {
        S0 s0J = this.f5901h;
        if (s0J == null) {
            return true;
        }
        int iF = q12.f(s0J.f5865b);
        while (true) {
            iF = q12.i(iF, this.f5894a, this.f5895b, this.f5899f, this.f5900g);
            while (s0J.j() != null && !s0J.f5869f.f5886g) {
                s0J = s0J.j();
            }
            S0 s0J2 = s0J.j();
            if (iF == -1 || s0J2 == null || q12.f(s0J2.f5865b) != iF) {
                break;
            }
            s0J = s0J2;
        }
        boolean zD = D(s0J);
        s0J.f5869f = t(q12, s0J.f5869f);
        return !zD;
    }

    public boolean J(Q1 q12, long j9, long j10) {
        T0 t0T;
        S0 s0J = this.f5901h;
        S0 s02 = null;
        while (s0J != null) {
            T0 t02 = s0J.f5869f;
            if (s02 != null) {
                T0 t0J = j(q12, s02, j9);
                if (t0J != null && e(t02, t0J)) {
                    t0T = t0J;
                }
                return !D(s02);
            }
            t0T = t(q12, t02);
            s0J.f5869f = t0T.a(t02.f5882c);
            if (!d(t02.f5884e, t0T.f5884e)) {
                s0J.A();
                long j11 = t0T.f5884e;
                return (D(s0J) || (s0J == this.f5902i && !s0J.f5869f.f5885f && ((j10 > Long.MIN_VALUE ? 1 : (j10 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j10 > ((j11 > (-9223372036854775807L) ? 1 : (j11 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : s0J.z(j11)) ? 1 : (j10 == ((j11 > (-9223372036854775807L) ? 1 : (j11 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : s0J.z(j11)) ? 0 : -1)) >= 0))) ? false : true;
            }
            s02 = s0J;
            s0J = s0J.j();
        }
        return true;
    }

    public boolean K(Q1 q12, int i9) {
        this.f5899f = i9;
        return I(q12);
    }

    public boolean L(Q1 q12, boolean z9) {
        this.f5900g = z9;
        return I(q12);
    }

    public S0 b() {
        S0 s02 = this.f5901h;
        if (s02 == null) {
            return null;
        }
        if (s02 == this.f5902i) {
            this.f5902i = s02.j();
        }
        this.f5901h.t();
        int i9 = this.f5904k - 1;
        this.f5904k = i9;
        if (i9 == 0) {
            this.f5903j = null;
            S0 s03 = this.f5901h;
            this.f5905l = s03.f5865b;
            this.f5906m = s03.f5869f.f5880a.f274d;
        }
        this.f5901h = this.f5901h.j();
        B();
        return this.f5901h;
    }

    public S0 c() {
        S0 s02 = this.f5902i;
        AbstractC1684a.g((s02 == null || s02.j() == null) ? false : true);
        this.f5902i = this.f5902i.j();
        B();
        return this.f5902i;
    }

    public final boolean d(long j9, long j10) {
        return j9 == -9223372036854775807L || j9 == j10;
    }

    public final boolean e(T0 t02, T0 t03) {
        return t02.f5881b == t03.f5881b && t02.f5880a.equals(t03.f5880a);
    }

    public void f() {
        if (this.f5904k == 0) {
            return;
        }
        S0 s0J = (S0) AbstractC1684a.i(this.f5901h);
        this.f5905l = s0J.f5865b;
        this.f5906m = s0J.f5869f.f5880a.f274d;
        while (s0J != null) {
            s0J.t();
            s0J = s0J.j();
        }
        this.f5901h = null;
        this.f5903j = null;
        this.f5902i = null;
        this.f5904k = 0;
        B();
    }

    public S0 g(E1[] e1Arr, Z3.C c9, InterfaceC1211b interfaceC1211b, C0894k1 c0894k1, T0 t02, Z3.D d9) {
        S0 s02 = this.f5903j;
        S0 s03 = new S0(e1Arr, s02 == null ? 1000000000000L : (s02.l() + this.f5903j.f5869f.f5884e) - t02.f5881b, c9, interfaceC1211b, c0894k1, t02, d9);
        S0 s04 = this.f5903j;
        if (s04 != null) {
            s04.w(s03);
        } else {
            this.f5901h = s03;
            this.f5902i = s03;
        }
        this.f5905l = null;
        this.f5903j = s03;
        this.f5904k++;
        B();
        return s03;
    }

    public final T0 h(C0912q1 c0912q1) {
        return m(c0912q1.f6191a, c0912q1.f6192b, c0912q1.f6193c, c0912q1.f6208r);
    }

    public final T0 i(Q1 q12, S0 s02, long j9) {
        T0 t02;
        long j10;
        long j11;
        Object obj;
        long j12;
        long j13;
        long j14;
        T0 t03 = s02.f5869f;
        int i9 = q12.i(q12.f(t03.f5880a.f271a), this.f5894a, this.f5895b, this.f5899f, this.f5900g);
        if (i9 == -1) {
            return null;
        }
        int i10 = q12.l(i9, this.f5894a, true).f5718d;
        Object objE = AbstractC1684a.e(this.f5894a.f5717c);
        long j15 = t03.f5880a.f274d;
        if (q12.s(i10, this.f5895b).f5758p == i9) {
            t02 = t03;
            Pair pairP = q12.p(this.f5895b, this.f5894a, i10, -9223372036854775807L, Math.max(0L, j9));
            if (pairP == null) {
                return null;
            }
            Object obj2 = pairP.first;
            long jLongValue = ((Long) pairP.second).longValue();
            S0 s0J = s02.j();
            if (s0J == null || !s0J.f5865b.equals(obj2)) {
                j14 = this.f5898e;
                this.f5898e = 1 + j14;
            } else {
                j14 = s0J.f5869f.f5880a.f274d;
            }
            j10 = j14;
            j11 = -9223372036854775807L;
            obj = obj2;
            j12 = jLongValue;
        } else {
            t02 = t03;
            j10 = j15;
            j11 = 0;
            obj = objE;
            j12 = 0;
        }
        C.b bVarE = E(q12, obj, j12, j10, this.f5895b, this.f5894a);
        if (j11 == -9223372036854775807L || t02.f5882c == -9223372036854775807L) {
            j13 = j12;
        } else {
            boolean zU = u(t02.f5880a.f271a, q12);
            if (bVarE.b() && zU) {
                j11 = t02.f5882c;
            } else if (zU) {
                j13 = t02.f5882c;
            }
            j13 = j12;
        }
        return m(q12, bVarE, j11, j13);
    }

    public final T0 j(Q1 q12, S0 s02, long j9) {
        T0 t02 = s02.f5869f;
        long jL = (s02.l() + t02.f5884e) - j9;
        return t02.f5886g ? i(q12, s02, jL) : k(q12, s02, jL);
    }

    public final T0 k(Q1 q12, S0 s02, long j9) {
        T0 t02 = s02.f5869f;
        C.b bVar = t02.f5880a;
        q12.m(bVar.f271a, this.f5894a);
        if (!bVar.b()) {
            int i9 = bVar.f275e;
            if (i9 != -1 && this.f5894a.w(i9)) {
                return i(q12, s02, j9);
            }
            int iQ = this.f5894a.q(bVar.f275e);
            boolean z9 = this.f5894a.x(bVar.f275e) && this.f5894a.l(bVar.f275e, iQ) == 3;
            if (iQ == this.f5894a.d(bVar.f275e) || z9) {
                return o(q12, bVar.f271a, p(q12, bVar.f271a, bVar.f275e), t02.f5884e, bVar.f274d);
            }
            return n(q12, bVar.f271a, bVar.f275e, iQ, t02.f5884e, bVar.f274d);
        }
        int i10 = bVar.f272b;
        int iD = this.f5894a.d(i10);
        if (iD == -1) {
            return null;
        }
        int iR = this.f5894a.r(i10, bVar.f273c);
        if (iR < iD) {
            return n(q12, bVar.f271a, i10, iR, t02.f5882c, bVar.f274d);
        }
        long jLongValue = t02.f5882c;
        if (jLongValue == -9223372036854775807L) {
            Q1.d dVar = this.f5895b;
            Q1.b bVar2 = this.f5894a;
            Pair pairP = q12.p(dVar, bVar2, bVar2.f5718d, -9223372036854775807L, Math.max(0L, j9));
            if (pairP == null) {
                return null;
            }
            jLongValue = ((Long) pairP.second).longValue();
        }
        return o(q12, bVar.f271a, Math.max(p(q12, bVar.f271a, bVar.f272b), jLongValue), t02.f5882c, bVar.f274d);
    }

    public S0 l() {
        return this.f5903j;
    }

    public final T0 m(Q1 q12, C.b bVar, long j9, long j10) {
        q12.m(bVar.f271a, this.f5894a);
        boolean zB = bVar.b();
        Object obj = bVar.f271a;
        return zB ? n(q12, obj, bVar.f272b, bVar.f273c, j9, bVar.f274d) : o(q12, obj, j10, j9, bVar.f274d);
    }

    public final T0 n(Q1 q12, Object obj, int i9, int i10, long j9, long j10) {
        C.b bVar = new C.b(obj, i9, i10, j10);
        long jE = q12.m(bVar.f271a, this.f5894a).e(bVar.f272b, bVar.f273c);
        long jK = i10 == this.f5894a.q(i9) ? this.f5894a.k() : 0L;
        return new T0(bVar, (jE == -9223372036854775807L || jK < jE) ? jK : Math.max(0L, jE - 1), j9, -9223372036854775807L, jE, this.f5894a.x(bVar.f272b), false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final O2.T0 o(O2.Q1 r26, java.lang.Object r27, long r28, long r30, long r32) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O2.V0.o(O2.Q1, java.lang.Object, long, long, long):O2.T0");
    }

    public final long p(Q1 q12, Object obj, int i9) {
        q12.m(obj, this.f5894a);
        long j9 = this.f5894a.j(i9);
        return j9 == Long.MIN_VALUE ? this.f5894a.f5719e : j9 + this.f5894a.n(i9);
    }

    public T0 q(long j9, C0912q1 c0912q1) {
        S0 s02 = this.f5903j;
        return s02 == null ? h(c0912q1) : j(c0912q1.f6191a, s02, j9);
    }

    public S0 r() {
        return this.f5901h;
    }

    public S0 s() {
        return this.f5902i;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public O2.T0 t(O2.Q1 r19, O2.T0 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            B3.C$b r3 = r2.f5880a
            boolean r12 = r0.v(r3)
            boolean r13 = r0.x(r1, r3)
            boolean r14 = r0.w(r1, r3, r12)
            B3.C$b r4 = r2.f5880a
            java.lang.Object r4 = r4.f271a
            O2.Q1$b r5 = r0.f5894a
            r1.m(r4, r5)
            boolean r1 = r3.b()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = -1
            if (r1 != 0) goto L35
            int r1 = r3.f275e
            if (r1 != r6) goto L2e
            goto L35
        L2e:
            O2.Q1$b r7 = r0.f5894a
            long r7 = r7.j(r1)
            goto L36
        L35:
            r7 = r4
        L36:
            boolean r1 = r3.b()
            if (r1 == 0) goto L48
            O2.Q1$b r1 = r0.f5894a
            int r4 = r3.f272b
            int r5 = r3.f273c
            long r4 = r1.e(r4, r5)
        L46:
            r9 = r4
            goto L5c
        L48:
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 == 0) goto L55
            r4 = -9223372036854775808
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 != 0) goto L53
            goto L55
        L53:
            r9 = r7
            goto L5c
        L55:
            O2.Q1$b r1 = r0.f5894a
            long r4 = r1.p()
            goto L46
        L5c:
            boolean r1 = r3.b()
            if (r1 == 0) goto L6c
            O2.Q1$b r1 = r0.f5894a
            int r4 = r3.f272b
            boolean r1 = r1.x(r4)
            r11 = r1
            goto L7d
        L6c:
            int r1 = r3.f275e
            if (r1 == r6) goto L7b
            O2.Q1$b r4 = r0.f5894a
            boolean r1 = r4.x(r1)
            if (r1 == 0) goto L7b
            r1 = 1
            r11 = 1
            goto L7d
        L7b:
            r1 = 0
            r11 = 0
        L7d:
            O2.T0 r15 = new O2.T0
            long r4 = r2.f5881b
            long r1 = r2.f5882c
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: O2.V0.t(O2.Q1, O2.T0):O2.T0");
    }

    public final boolean u(Object obj, Q1 q12) {
        int iF = q12.m(obj, this.f5894a).f();
        int iU = this.f5894a.u();
        return iF > 0 && this.f5894a.x(iU) && (iF > 1 || this.f5894a.j(iU) != Long.MIN_VALUE);
    }

    public final boolean v(C.b bVar) {
        return !bVar.b() && bVar.f275e == -1;
    }

    public final boolean w(Q1 q12, C.b bVar, boolean z9) {
        int iF = q12.f(bVar.f271a);
        return !q12.s(q12.k(iF, this.f5894a).f5718d, this.f5895b).f5752j && q12.w(iF, this.f5894a, this.f5895b, this.f5899f, this.f5900g) && z9;
    }

    public final boolean x(Q1 q12, C.b bVar) {
        if (v(bVar)) {
            return q12.s(q12.m(bVar.f271a, this.f5894a).f5718d, this.f5895b).f5759q == q12.f(bVar.f271a);
        }
        return false;
    }

    public boolean y(InterfaceC0517z interfaceC0517z) {
        S0 s02 = this.f5903j;
        return s02 != null && s02.f5864a == interfaceC0517z;
    }
}
