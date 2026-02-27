package B3;

import B3.C;
import O2.H0;
import O2.Q1;
import b4.InterfaceC1211b;

/* JADX INFO: renamed from: B3.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0514w extends k0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f649n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Q1.d f650o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Q1.b f651p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a f652q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C0513v f653r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f654s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f655t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f656u;

    /* JADX INFO: renamed from: B3.w$a */
    public static final class a extends AbstractC0510s {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final Object f657j = new Object();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Object f658h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Object f659i;

        public a(Q1 q12, Object obj, Object obj2) {
            super(q12);
            this.f658h = obj;
            this.f659i = obj2;
        }

        public static a A(Q1 q12, Object obj, Object obj2) {
            return new a(q12, obj, obj2);
        }

        public static a z(H0 h02) {
            return new a(new b(h02), Q1.d.f5736s, f657j);
        }

        @Override // B3.AbstractC0510s, O2.Q1
        public int f(Object obj) {
            Object obj2;
            Q1 q12 = this.f626g;
            if (f657j.equals(obj) && (obj2 = this.f659i) != null) {
                obj = obj2;
            }
            return q12.f(obj);
        }

        @Override // B3.AbstractC0510s, O2.Q1
        public Q1.b l(int i9, Q1.b bVar, boolean z9) {
            this.f626g.l(i9, bVar, z9);
            if (d4.k0.c(bVar.f5717c, this.f659i) && z9) {
                bVar.f5717c = f657j;
            }
            return bVar;
        }

        @Override // B3.AbstractC0510s, O2.Q1
        public Object r(int i9) {
            Object objR = this.f626g.r(i9);
            return d4.k0.c(objR, this.f659i) ? f657j : objR;
        }

        @Override // B3.AbstractC0510s, O2.Q1
        public Q1.d t(int i9, Q1.d dVar, long j9) {
            this.f626g.t(i9, dVar, j9);
            if (d4.k0.c(dVar.f5744a, this.f658h)) {
                dVar.f5744a = Q1.d.f5736s;
            }
            return dVar;
        }

        public a y(Q1 q12) {
            return new a(q12, this.f658h, this.f659i);
        }
    }

    /* JADX INFO: renamed from: B3.w$b */
    public static final class b extends Q1 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final H0 f660g;

        public b(H0 h02) {
            this.f660g = h02;
        }

        @Override // O2.Q1
        public int f(Object obj) {
            return obj == a.f657j ? 0 : -1;
        }

        @Override // O2.Q1
        public Q1.b l(int i9, Q1.b bVar, boolean z9) {
            bVar.z(z9 ? 0 : null, z9 ? a.f657j : null, 0, -9223372036854775807L, 0L, C3.b.f1036h, true);
            return bVar;
        }

        @Override // O2.Q1
        public int n() {
            return 1;
        }

        @Override // O2.Q1
        public Object r(int i9) {
            return a.f657j;
        }

        @Override // O2.Q1
        public Q1.d t(int i9, Q1.d dVar, long j9) {
            dVar.j(Q1.d.f5736s, this.f660g, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            dVar.f5755m = true;
            return dVar;
        }

        @Override // O2.Q1
        public int u() {
            return 1;
        }
    }

    public C0514w(C c9, boolean z9) {
        super(c9);
        this.f649n = z9 && c9.S();
        this.f650o = new Q1.d();
        this.f651p = new Q1.b();
        Q1 q1U = c9.U();
        if (q1U == null) {
            this.f652q = a.z(c9.e());
        } else {
            this.f652q = a.A(q1U, null, null);
            this.f656u = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // B3.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C0(O2.Q1 r15) {
        /*
            r14 = this;
            boolean r0 = r14.f655t
            if (r0 == 0) goto L19
            B3.w$a r0 = r14.f652q
            B3.w$a r15 = r0.y(r15)
            r14.f652q = r15
            B3.v r15 = r14.f653r
            if (r15 == 0) goto Lae
            long r0 = r15.o()
            r14.K0(r0)
            goto Lae
        L19:
            boolean r0 = r15.v()
            if (r0 == 0) goto L36
            boolean r0 = r14.f656u
            if (r0 == 0) goto L2a
            B3.w$a r0 = r14.f652q
            B3.w$a r15 = r0.y(r15)
            goto L32
        L2a:
            java.lang.Object r0 = O2.Q1.d.f5736s
            java.lang.Object r1 = B3.C0514w.a.f657j
            B3.w$a r15 = B3.C0514w.a.A(r15, r0, r1)
        L32:
            r14.f652q = r15
            goto Lae
        L36:
            O2.Q1$d r0 = r14.f650o
            r1 = 0
            r15.s(r1, r0)
            O2.Q1$d r0 = r14.f650o
            long r2 = r0.e()
            O2.Q1$d r0 = r14.f650o
            java.lang.Object r0 = r0.f5744a
            B3.v r4 = r14.f653r
            if (r4 == 0) goto L74
            long r4 = r4.q()
            B3.w$a r6 = r14.f652q
            B3.v r7 = r14.f653r
            B3.C$b r7 = r7.f640a
            java.lang.Object r7 = r7.f271a
            O2.Q1$b r8 = r14.f651p
            r6.m(r7, r8)
            O2.Q1$b r6 = r14.f651p
            long r6 = r6.t()
            long r6 = r6 + r4
            B3.w$a r4 = r14.f652q
            O2.Q1$d r5 = r14.f650o
            O2.Q1$d r1 = r4.s(r1, r5)
            long r4 = r1.e()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 == 0) goto L74
            r12 = r6
            goto L75
        L74:
            r12 = r2
        L75:
            O2.Q1$d r9 = r14.f650o
            O2.Q1$b r10 = r14.f651p
            r11 = 0
            r8 = r15
            android.util.Pair r1 = r8.o(r9, r10, r11, r12)
            java.lang.Object r2 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            boolean r1 = r14.f656u
            if (r1 == 0) goto L94
            B3.w$a r0 = r14.f652q
            B3.w$a r15 = r0.y(r15)
            goto L98
        L94:
            B3.w$a r15 = B3.C0514w.a.A(r15, r0, r2)
        L98:
            r14.f652q = r15
            B3.v r15 = r14.f653r
            if (r15 == 0) goto Lae
            r14.K0(r3)
            B3.C$b r15 = r15.f640a
            java.lang.Object r0 = r15.f271a
            java.lang.Object r0 = r14.I0(r0)
            B3.C$b r15 = r15.c(r0)
            goto Laf
        Lae:
            r15 = 0
        Laf:
            r0 = 1
            r14.f656u = r0
            r14.f655t = r0
            B3.w$a r0 = r14.f652q
            r14.m0(r0)
            if (r15 == 0) goto Lc6
            B3.v r0 = r14.f653r
            java.lang.Object r0 = d4.AbstractC1684a.e(r0)
            B3.v r0 = (B3.C0513v) r0
            r0.a(r15)
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.C0514w.C0(O2.Q1):void");
    }

    @Override // B3.k0
    public void F0() {
        if (this.f649n) {
            return;
        }
        this.f654s = true;
        E0();
    }

    @Override // B3.C
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public C0513v E(C.b bVar, InterfaceC1211b interfaceC1211b, long j9) {
        C0513v c0513v = new C0513v(bVar, interfaceC1211b, j9);
        c0513v.y(this.f596l);
        if (this.f655t) {
            c0513v.a(bVar.c(I0(bVar.f271a)));
        } else {
            this.f653r = c0513v;
            if (!this.f654s) {
                this.f654s = true;
                E0();
            }
        }
        return c0513v;
    }

    public final Object H0(Object obj) {
        return (this.f652q.f659i == null || !this.f652q.f659i.equals(obj)) ? obj : a.f657j;
    }

    public final Object I0(Object obj) {
        return (this.f652q.f659i == null || !obj.equals(a.f657j)) ? obj : this.f652q.f659i;
    }

    public Q1 J0() {
        return this.f652q;
    }

    public final void K0(long j9) {
        C0513v c0513v = this.f653r;
        int iF = this.f652q.f(c0513v.f640a.f271a);
        if (iF == -1) {
            return;
        }
        long j10 = this.f652q.k(iF, this.f651p).f5719e;
        if (j10 != -9223372036854775807L && j9 >= j10) {
            j9 = Math.max(0L, j10 - 1);
        }
        c0513v.w(j9);
    }

    @Override // B3.AbstractC0499g, B3.C
    public void P() {
    }

    @Override // B3.C
    public void Y(InterfaceC0517z interfaceC0517z) {
        ((C0513v) interfaceC0517z).x();
        if (interfaceC0517z == this.f653r) {
            this.f653r = null;
        }
    }

    @Override // B3.AbstractC0499g, B3.AbstractC0493a
    public void n0() {
        this.f655t = false;
        this.f654s = false;
        super.n0();
    }

    @Override // B3.k0
    public C.b w0(C.b bVar) {
        return bVar.c(H0(bVar.f271a));
    }
}
