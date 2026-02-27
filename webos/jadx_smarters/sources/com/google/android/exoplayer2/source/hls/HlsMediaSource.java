package com.google.android.exoplayer2.source.hls;

import B3.AbstractC0493a;
import B3.C;
import B3.C0502j;
import B3.InterfaceC0501i;
import B3.InterfaceC0517z;
import B3.J;
import B3.b0;
import H3.g;
import H3.h;
import H3.i;
import H3.l;
import J3.c;
import J3.e;
import J3.f;
import J3.j;
import J3.k;
import O2.AbstractC0928w0;
import O2.H0;
import V2.B;
import V2.C1055l;
import V2.y;
import android.os.Looper;
import b4.AbstractC1217h;
import b4.C1208A;
import b4.F;
import b4.InterfaceC1211b;
import b4.InterfaceC1224o;
import b4.S;
import d4.AbstractC1684a;
import d4.k0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsMediaSource extends AbstractC0493a implements k.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h f25577i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final H0.h f25578j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final g f25579k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC0501i f25580l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y f25581m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final F f25582n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f25583o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f25584p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f25585q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k f25586r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f25587s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final H0 f25588t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f25589u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public H0.g f25590v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public S f25591w;

    public static final class Factory implements C.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f25592a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public h f25593b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public j f25594c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public k.a f25595d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public InterfaceC0501i f25596e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public B f25597f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public F f25598g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f25599h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f25600i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f25601j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f25602k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f25603l;

        public Factory(g gVar) {
            this.f25592a = (g) AbstractC1684a.e(gVar);
            this.f25597f = new C1055l();
            this.f25594c = new J3.a();
            this.f25595d = c.f3096q;
            this.f25593b = h.f2459a;
            this.f25598g = new C1208A();
            this.f25596e = new C0502j();
            this.f25600i = 1;
            this.f25602k = -9223372036854775807L;
            this.f25599h = true;
        }

        public Factory(InterfaceC1224o.a aVar) {
            this(new H3.c(aVar));
        }

        @Override // B3.C.a
        public int[] c() {
            return new int[]{2};
        }

        @Override // B3.C.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public HlsMediaSource b(H0 h02) {
            AbstractC1684a.e(h02.f5528c);
            j jVar = this.f25594c;
            List list = h02.f5528c.f5629f;
            j eVar = !list.isEmpty() ? new e(jVar, list) : jVar;
            g gVar = this.f25592a;
            h hVar = this.f25593b;
            InterfaceC0501i interfaceC0501i = this.f25596e;
            y yVarA = this.f25597f.a(h02);
            F f9 = this.f25598g;
            return new HlsMediaSource(h02, gVar, hVar, interfaceC0501i, null, yVarA, f9, this.f25595d.a(this.f25592a, f9, eVar), this.f25602k, this.f25599h, this.f25600i, this.f25601j, this.f25603l);
        }

        @Override // B3.C.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Factory d(B b9) {
            this.f25597f = (B) AbstractC1684a.f(b9, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // B3.C.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Factory a(F f9) {
            this.f25598g = (F) AbstractC1684a.f(f9, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }
    }

    static {
        AbstractC0928w0.a("goog.exo.hls");
    }

    public HlsMediaSource(H0 h02, g gVar, h hVar, InterfaceC0501i interfaceC0501i, AbstractC1217h abstractC1217h, y yVar, F f9, k kVar, long j9, boolean z9, int i9, boolean z10, long j10) {
        this.f25578j = (H0.h) AbstractC1684a.e(h02.f5528c);
        this.f25588t = h02;
        this.f25590v = h02.f5530e;
        this.f25579k = gVar;
        this.f25577i = hVar;
        this.f25580l = interfaceC0501i;
        this.f25581m = yVar;
        this.f25582n = f9;
        this.f25586r = kVar;
        this.f25587s = j9;
        this.f25583o = z9;
        this.f25584p = i9;
        this.f25585q = z10;
        this.f25589u = j10;
    }

    public static f.b q0(List list, long j9) {
        f.b bVar = null;
        for (int i9 = 0; i9 < list.size(); i9++) {
            f.b bVar2 = (f.b) list.get(i9);
            long j10 = bVar2.f3158f;
            if (j10 > j9 || !bVar2.f3147m) {
                if (j10 > j9) {
                    break;
                }
            } else {
                bVar = bVar2;
            }
        }
        return bVar;
    }

    public static f.d r0(List list, long j9) {
        return (f.d) list.get(k0.g(list, Long.valueOf(j9), true, true));
    }

    public static long u0(f fVar, long j9) {
        long j10;
        f.C0052f c0052f = fVar.f3146v;
        long j11 = fVar.f3129e;
        if (j11 != -9223372036854775807L) {
            j10 = fVar.f3145u - j11;
        } else {
            long j12 = c0052f.f3168d;
            if (j12 == -9223372036854775807L || fVar.f3138n == -9223372036854775807L) {
                long j13 = c0052f.f3167c;
                j10 = j13 != -9223372036854775807L ? j13 : fVar.f3137m * 3;
            } else {
                j10 = j12;
            }
        }
        return j10 + j9;
    }

    @Override // B3.C
    public InterfaceC0517z E(C.b bVar, InterfaceC1211b interfaceC1211b, long j9) {
        J.a aVarF0 = f0(bVar);
        return new l(this.f25577i, this.f25586r, this.f25579k, this.f25591w, null, this.f25581m, b0(bVar), this.f25582n, aVarF0, interfaceC1211b, this.f25580l, this.f25583o, this.f25584p, this.f25585q, i0(), this.f25589u);
    }

    @Override // J3.k.e
    public void M(f fVar) {
        long jX1 = fVar.f3140p ? k0.x1(fVar.f3132h) : -9223372036854775807L;
        int i9 = fVar.f3128d;
        long j9 = (i9 == 2 || i9 == 1) ? jX1 : -9223372036854775807L;
        i iVar = new i((J3.g) AbstractC1684a.e(this.f25586r.e()), fVar);
        m0(this.f25586r.i() ? o0(fVar, j9, jX1, iVar) : p0(fVar, j9, jX1, iVar));
    }

    @Override // B3.C
    public void P() {
        this.f25586r.l();
    }

    @Override // B3.C
    public void Y(InterfaceC0517z interfaceC0517z) {
        ((l) interfaceC0517z).C();
    }

    @Override // B3.C
    public H0 e() {
        return this.f25588t;
    }

    @Override // B3.AbstractC0493a
    public void l0(S s9) {
        this.f25591w = s9;
        this.f25581m.b((Looper) AbstractC1684a.e(Looper.myLooper()), i0());
        this.f25581m.prepare();
        this.f25586r.a(this.f25578j.f5625a, f0(null), this);
    }

    @Override // B3.AbstractC0493a
    public void n0() {
        this.f25586r.stop();
        this.f25581m.release();
    }

    public final b0 o0(f fVar, long j9, long j10, i iVar) {
        long jD = fVar.f3132h - this.f25586r.d();
        long j11 = fVar.f3139o ? jD + fVar.f3145u : -9223372036854775807L;
        long jS0 = s0(fVar);
        long j12 = this.f25590v.f5607a;
        v0(fVar, k0.s(j12 != -9223372036854775807L ? k0.P0(j12) : u0(fVar, jS0), jS0, fVar.f3145u + jS0));
        return new b0(j9, j10, -9223372036854775807L, j11, fVar.f3145u, jD, t0(fVar, jS0), true, !fVar.f3139o, fVar.f3128d == 2 && fVar.f3130f, iVar, this.f25588t, this.f25590v);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final B3.b0 p0(J3.f r25, long r26, long r28, H3.i r30) {
        /*
            r24 = this;
            r0 = r25
            long r1 = r0.f3129e
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L31
            java.util.List r1 = r0.f3142r
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L16
            goto L31
        L16:
            boolean r1 = r0.f3131g
            if (r1 != 0) goto L2e
            long r1 = r0.f3129e
            long r3 = r0.f3145u
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L23
            goto L2e
        L23:
            java.util.List r3 = r0.f3142r
            J3.f$d r1 = r0(r3, r1)
            long r1 = r1.f3158f
        L2b:
            r16 = r1
            goto L34
        L2e:
            long r1 = r0.f3129e
            goto L2b
        L31:
            r1 = 0
            goto L2b
        L34:
            B3.b0 r1 = new B3.b0
            r3 = r1
            long r10 = r0.f3145u
            r12 = r10
            r0 = r24
            O2.H0 r2 = r0.f25588t
            r22 = r2
            r23 = 0
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r14 = 0
            r18 = 1
            r19 = 0
            r20 = 1
            r4 = r26
            r6 = r28
            r21 = r30
            r3.<init>(r4, r6, r8, r10, r12, r14, r16, r18, r19, r20, r21, r22, r23)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.HlsMediaSource.p0(J3.f, long, long, H3.i):B3.b0");
    }

    public final long s0(f fVar) {
        if (fVar.f3140p) {
            return k0.P0(k0.g0(this.f25587s)) - fVar.e();
        }
        return 0L;
    }

    public final long t0(f fVar, long j9) {
        long jP0 = fVar.f3129e;
        if (jP0 == -9223372036854775807L) {
            jP0 = (fVar.f3145u + j9) - k0.P0(this.f25590v.f5607a);
        }
        if (fVar.f3131g) {
            return jP0;
        }
        f.b bVarQ0 = q0(fVar.f3143s, jP0);
        if (bVarQ0 != null) {
            return bVarQ0.f3158f;
        }
        if (fVar.f3142r.isEmpty()) {
            return 0L;
        }
        f.d dVarR0 = r0(fVar.f3142r, jP0);
        f.b bVarQ02 = q0(dVarR0.f3153n, jP0);
        return bVarQ02 != null ? bVarQ02.f3158f : dVarR0.f3158f;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v0(J3.f r6, long r7) {
        /*
            r5 = this;
            O2.H0 r0 = r5.f25588t
            O2.H0$g r0 = r0.f5530e
            float r1 = r0.f5610e
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L28
            float r0 = r0.f5611f
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L28
            J3.f$f r6 = r6.f3146v
            long r0 = r6.f3167c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L28
            long r0 = r6.f3168d
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L28
            r6 = 1
            goto L29
        L28:
            r6 = 0
        L29:
            O2.H0$g$a r0 = new O2.H0$g$a
            r0.<init>()
            long r7 = d4.k0.x1(r7)
            O2.H0$g$a r7 = r0.k(r7)
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r6 == 0) goto L3d
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L41
        L3d:
            O2.H0$g r0 = r5.f25590v
            float r0 = r0.f5610e
        L41:
            O2.H0$g$a r7 = r7.j(r0)
            if (r6 == 0) goto L48
            goto L4c
        L48:
            O2.H0$g r6 = r5.f25590v
            float r8 = r6.f5611f
        L4c:
            O2.H0$g$a r6 = r7.h(r8)
            O2.H0$g r6 = r6.f()
            r5.f25590v = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.HlsMediaSource.v0(J3.f, long):void");
    }
}
