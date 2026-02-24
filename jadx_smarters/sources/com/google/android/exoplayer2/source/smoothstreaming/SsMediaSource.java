package com.google.android.exoplayer2.source.smoothstreaming;

import B3.AbstractC0493a;
import B3.C;
import B3.C0502j;
import B3.C0512u;
import B3.C0515x;
import B3.InterfaceC0501i;
import B3.InterfaceC0517z;
import B3.J;
import B3.b0;
import N3.a;
import O2.AbstractC0928w0;
import O2.H0;
import V2.B;
import V2.C1055l;
import V2.y;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import b4.AbstractC1217h;
import b4.C1208A;
import b4.F;
import b4.G;
import b4.H;
import b4.I;
import b4.InterfaceC1211b;
import b4.InterfaceC1224o;
import b4.S;
import com.google.android.exoplayer2.source.smoothstreaming.a;
import com.google.android.exoplayer2.source.smoothstreaming.b;
import d4.AbstractC1684a;
import d4.k0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import z3.C3024D;

/* JADX INFO: loaded from: classes3.dex */
public final class SsMediaSource extends AbstractC0493a implements G.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public N3.a f25745A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Handler f25746B;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f25747i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Uri f25748j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final H0.h f25749k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final H0 f25750l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final InterfaceC1224o.a f25751m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b.a f25752n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC0501i f25753o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f25754p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final F f25755q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f25756r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final J.a f25757s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final I.a f25758t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f25759u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public InterfaceC1224o f25760v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public G f25761w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public H f25762x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public S f25763y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f25764z;

    public static final class Factory implements C.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b.a f25765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC1224o.a f25766b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public InterfaceC0501i f25767c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public B f25768d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public F f25769e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f25770f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public I.a f25771g;

        public Factory(InterfaceC1224o.a aVar) {
            this(new a.C0247a(aVar), aVar);
        }

        public Factory(b.a aVar, InterfaceC1224o.a aVar2) {
            this.f25765a = (b.a) AbstractC1684a.e(aVar);
            this.f25766b = aVar2;
            this.f25768d = new C1055l();
            this.f25769e = new C1208A();
            this.f25770f = 30000L;
            this.f25767c = new C0502j();
        }

        @Override // B3.C.a
        public int[] c() {
            return new int[]{1};
        }

        @Override // B3.C.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public SsMediaSource b(H0 h02) {
            AbstractC1684a.e(h02.f5528c);
            I.a bVar = this.f25771g;
            if (bVar == null) {
                bVar = new N3.b();
            }
            List list = h02.f5528c.f5629f;
            return new SsMediaSource(h02, null, this.f25766b, !list.isEmpty() ? new C3024D(bVar, list) : bVar, this.f25765a, this.f25767c, null, this.f25768d.a(h02), this.f25769e, this.f25770f);
        }

        @Override // B3.C.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Factory d(B b9) {
            this.f25768d = (B) AbstractC1684a.f(b9, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // B3.C.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Factory a(F f9) {
            this.f25769e = (F) AbstractC1684a.f(f9, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }
    }

    static {
        AbstractC0928w0.a("goog.exo.smoothstreaming");
    }

    public SsMediaSource(H0 h02, N3.a aVar, InterfaceC1224o.a aVar2, I.a aVar3, b.a aVar4, InterfaceC0501i interfaceC0501i, AbstractC1217h abstractC1217h, y yVar, F f9, long j9) {
        AbstractC1684a.g(aVar == null || !aVar.f5294d);
        this.f25750l = h02;
        H0.h hVar = (H0.h) AbstractC1684a.e(h02.f5528c);
        this.f25749k = hVar;
        this.f25745A = aVar;
        this.f25748j = hVar.f5625a.equals(Uri.EMPTY) ? null : k0.C(hVar.f5625a);
        this.f25751m = aVar2;
        this.f25758t = aVar3;
        this.f25752n = aVar4;
        this.f25753o = interfaceC0501i;
        this.f25754p = yVar;
        this.f25755q = f9;
        this.f25756r = j9;
        this.f25757s = f0(null);
        this.f25747i = aVar != null;
        this.f25759u = new ArrayList();
    }

    @Override // B3.C
    public InterfaceC0517z E(C.b bVar, InterfaceC1211b interfaceC1211b, long j9) {
        J.a aVarF0 = f0(bVar);
        c cVar = new c(this.f25745A, this.f25752n, this.f25763y, this.f25753o, null, this.f25754p, b0(bVar), this.f25755q, aVarF0, this.f25762x, interfaceC1211b);
        this.f25759u.add(cVar);
        return cVar;
    }

    @Override // B3.C
    public void P() {
        this.f25762x.a();
    }

    @Override // B3.C
    public void Y(InterfaceC0517z interfaceC0517z) {
        ((c) interfaceC0517z).t();
        this.f25759u.remove(interfaceC0517z);
    }

    @Override // B3.C
    public H0 e() {
        return this.f25750l;
    }

    @Override // B3.AbstractC0493a
    public void l0(S s9) {
        this.f25763y = s9;
        this.f25754p.b(Looper.myLooper(), i0());
        this.f25754p.prepare();
        if (this.f25747i) {
            this.f25762x = new H.a();
            s0();
            return;
        }
        this.f25760v = this.f25751m.a();
        G g9 = new G("SsMediaSource");
        this.f25761w = g9;
        this.f25762x = g9;
        this.f25746B = k0.x();
        u0();
    }

    @Override // B3.AbstractC0493a
    public void n0() {
        this.f25745A = this.f25747i ? this.f25745A : null;
        this.f25760v = null;
        this.f25764z = 0L;
        G g9 = this.f25761w;
        if (g9 != null) {
            g9.l();
            this.f25761w = null;
        }
        Handler handler = this.f25746B;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f25746B = null;
        }
        this.f25754p.release();
    }

    @Override // b4.G.b
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public void t(I i9, long j9, long j10, boolean z9) {
        C0512u c0512u = new C0512u(i9.f17518a, i9.f17519c, i9.f(), i9.d(), j9, j10, i9.b());
        this.f25755q.d(i9.f17518a);
        this.f25757s.p(c0512u, i9.f17520d);
    }

    @Override // b4.G.b
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public void W(I i9, long j9, long j10) {
        C0512u c0512u = new C0512u(i9.f17518a, i9.f17519c, i9.f(), i9.d(), j9, j10, i9.b());
        this.f25755q.d(i9.f17518a);
        this.f25757s.s(c0512u, i9.f17520d);
        this.f25745A = (N3.a) i9.e();
        this.f25764z = j9 - j10;
        s0();
        t0();
    }

    @Override // b4.G.b
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public G.c j(I i9, long j9, long j10, IOException iOException, int i10) {
        C0512u c0512u = new C0512u(i9.f17518a, i9.f17519c, i9.f(), i9.d(), j9, j10, i9.b());
        long jC = this.f25755q.c(new F.c(c0512u, new C0515x(i9.f17520d), iOException, i10));
        G.c cVarH = jC == -9223372036854775807L ? G.f17501g : G.h(false, jC);
        boolean z9 = !cVarH.c();
        this.f25757s.w(c0512u, i9.f17520d, iOException, z9);
        if (z9) {
            this.f25755q.d(i9.f17518a);
        }
        return cVarH;
    }

    public final void s0() {
        b0 b0Var;
        for (int i9 = 0; i9 < this.f25759u.size(); i9++) {
            ((c) this.f25759u.get(i9)).w(this.f25745A);
        }
        long jMax = Long.MIN_VALUE;
        long jMax2 = Long.MAX_VALUE;
        for (a.b bVar : this.f25745A.f5296f) {
            if (bVar.f5312k > 0) {
                jMax2 = Math.min(jMax2, bVar.e(0));
                jMax = Math.max(jMax, bVar.e(bVar.f5312k - 1) + bVar.c(bVar.f5312k - 1));
            }
        }
        if (jMax2 == Long.MAX_VALUE) {
            long j9 = this.f25745A.f5294d ? -9223372036854775807L : 0L;
            N3.a aVar = this.f25745A;
            boolean z9 = aVar.f5294d;
            b0Var = new b0(j9, 0L, 0L, 0L, true, z9, z9, aVar, this.f25750l);
        } else {
            N3.a aVar2 = this.f25745A;
            if (aVar2.f5294d) {
                long j10 = aVar2.f5298h;
                if (j10 != -9223372036854775807L && j10 > 0) {
                    jMax2 = Math.max(jMax2, jMax - j10);
                }
                long j11 = jMax2;
                long j12 = jMax - j11;
                long jP0 = j12 - k0.P0(this.f25756r);
                if (jP0 < 5000000) {
                    jP0 = Math.min(5000000L, j12 / 2);
                }
                b0Var = new b0(-9223372036854775807L, j12, j11, jP0, true, true, true, this.f25745A, this.f25750l);
            } else {
                long j13 = aVar2.f5297g;
                long j14 = j13 != -9223372036854775807L ? j13 : jMax - jMax2;
                b0Var = new b0(jMax2 + j14, j14, jMax2, 0L, true, false, false, this.f25745A, this.f25750l);
            }
        }
        m0(b0Var);
    }

    public final void t0() {
        if (this.f25745A.f5294d) {
            this.f25746B.postDelayed(new Runnable() { // from class: M3.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4179a.u0();
                }
            }, Math.max(0L, (this.f25764z + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    public final void u0() {
        if (this.f25761w.i()) {
            return;
        }
        I i9 = new I(this.f25760v, this.f25748j, 4, this.f25758t);
        this.f25757s.y(new C0512u(i9.f17518a, i9.f17519c, this.f25761w.n(i9, this, this.f25755q.b(i9.f17520d))), i9.f17520d);
    }
}
