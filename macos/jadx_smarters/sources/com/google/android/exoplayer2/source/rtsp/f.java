package com.google.android.exoplayer2.source.rtsp;

import B3.InterfaceC0517z;
import B3.X;
import B3.Y;
import B3.g0;
import B3.i0;
import K3.o;
import K3.x;
import O2.A0;
import O2.C0936z0;
import O2.H1;
import Z3.s;
import android.net.Uri;
import android.os.Handler;
import b4.G;
import b4.InterfaceC1211b;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;
import com.google.android.exoplayer2.source.rtsp.a;
import com.google.android.exoplayer2.source.rtsp.b;
import com.google.android.exoplayer2.source.rtsp.d;
import com.google.android.exoplayer2.source.rtsp.g;
import d3.InterfaceC1674k;
import d3.w;
import d4.AbstractC1684a;
import d4.k0;
import java.io.IOException;
import java.net.BindException;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import s5.AbstractC2743y;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements InterfaceC0517z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1211b f25668a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f25669c = k0.x();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f25670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.google.android.exoplayer2.source.rtsp.d f25671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f25672f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f25673g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f25674h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a.InterfaceC0243a f25675i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public InterfaceC0517z.a f25676j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public AbstractC2743y f25677k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public IOException f25678l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public RtspMediaSource.c f25679m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f25680n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f25681o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f25682p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f25683q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f25684r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f25685s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f25686t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f25687u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f25688v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f25689w;

    public final class b implements InterfaceC1674k, G.b, X.d, d.f, d.e {
        public b() {
        }

        @Override // com.google.android.exoplayer2.source.rtsp.d.e
        public void a(long j9, AbstractC2743y abstractC2743y) {
            ArrayList arrayList = new ArrayList(abstractC2743y.size());
            for (int i9 = 0; i9 < abstractC2743y.size(); i9++) {
                arrayList.add((String) AbstractC1684a.e(((x) abstractC2743y.get(i9)).f3777c.getPath()));
            }
            for (int i10 = 0; i10 < f.this.f25673g.size(); i10++) {
                if (!arrayList.contains(((d) f.this.f25673g.get(i10)).c().getPath())) {
                    f.this.f25674h.a();
                    if (f.this.U()) {
                        f.this.f25684r = true;
                        f.this.f25681o = -9223372036854775807L;
                        f.this.f25680n = -9223372036854775807L;
                        f.this.f25682p = -9223372036854775807L;
                    }
                }
            }
            for (int i11 = 0; i11 < abstractC2743y.size(); i11++) {
                x xVar = (x) abstractC2743y.get(i11);
                com.google.android.exoplayer2.source.rtsp.b bVarR = f.this.R(xVar.f3777c);
                if (bVarR != null) {
                    bVarR.h(xVar.f3775a);
                    bVarR.g(xVar.f3776b);
                    if (f.this.U() && f.this.f25681o == f.this.f25680n) {
                        bVarR.f(j9, xVar.f3775a);
                    }
                }
            }
            if (!f.this.U()) {
                if (f.this.f25682p == -9223372036854775807L || !f.this.f25689w) {
                    return;
                }
                f fVar = f.this;
                fVar.l(fVar.f25682p);
                f.this.f25682p = -9223372036854775807L;
                return;
            }
            long j10 = f.this.f25681o;
            long j11 = f.this.f25680n;
            f.this.f25681o = -9223372036854775807L;
            f fVar2 = f.this;
            if (j10 == j11) {
                fVar2.f25680n = -9223372036854775807L;
            } else {
                fVar2.l(fVar2.f25680n);
            }
        }

        @Override // com.google.android.exoplayer2.source.rtsp.d.f
        public void b(String str, Throwable th) {
            f.this.f25678l = th == null ? new IOException(str) : new IOException(str, th);
        }

        @Override // com.google.android.exoplayer2.source.rtsp.d.e
        public void c(RtspMediaSource.c cVar) {
            if (!(cVar instanceof RtspMediaSource.d) || f.this.f25689w) {
                f.this.f25679m = cVar;
            } else {
                f.this.Z();
            }
        }

        @Override // com.google.android.exoplayer2.source.rtsp.d.e
        public void d() {
            long jX1;
            long j9;
            long j10 = f.this.f25681o;
            f fVar = f.this;
            if (j10 != -9223372036854775807L) {
                j9 = fVar.f25681o;
            } else {
                if (fVar.f25682p == -9223372036854775807L) {
                    jX1 = 0;
                    f.this.f25671e.u0(jX1);
                }
                j9 = f.this.f25682p;
            }
            jX1 = k0.x1(j9);
            f.this.f25671e.u0(jX1);
        }

        @Override // d3.InterfaceC1674k
        public w e(int i9, int i10) {
            return ((e) AbstractC1684a.e((e) f.this.f25672f.get(i9))).f25697c;
        }

        @Override // com.google.android.exoplayer2.source.rtsp.d.f
        public void f(K3.w wVar, AbstractC2743y abstractC2743y) {
            for (int i9 = 0; i9 < abstractC2743y.size(); i9++) {
                o oVar = (o) abstractC2743y.get(i9);
                f fVar = f.this;
                e eVar = fVar.new e(oVar, i9, fVar.f25675i);
                f.this.f25672f.add(eVar);
                eVar.k();
            }
            f.this.f25674h.b(wVar);
        }

        @Override // b4.G.b
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void t(com.google.android.exoplayer2.source.rtsp.b bVar, long j9, long j10, boolean z9) {
        }

        @Override // b4.G.b
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void W(com.google.android.exoplayer2.source.rtsp.b bVar, long j9, long j10) {
            if (f.this.g() == 0) {
                if (f.this.f25689w) {
                    return;
                }
                f.this.Z();
                return;
            }
            int i9 = 0;
            while (true) {
                if (i9 >= f.this.f25672f.size()) {
                    break;
                }
                e eVar = (e) f.this.f25672f.get(i9);
                if (eVar.f25695a.f25692b == bVar) {
                    eVar.c();
                    break;
                }
                i9++;
            }
            f.this.f25671e.s0();
        }

        @Override // d3.InterfaceC1674k
        public void n(com.google.android.exoplayer2.extractor.g gVar) {
        }

        @Override // b4.G.b
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public G.c j(com.google.android.exoplayer2.source.rtsp.b bVar, long j9, long j10, IOException iOException, int i9) {
            if (!f.this.f25686t) {
                f.this.f25678l = iOException;
            } else if (!(iOException.getCause() instanceof BindException)) {
                f.this.f25679m = new RtspMediaSource.c(bVar.f25622c.f3754b.toString(), iOException);
            } else if (f.e(f.this) < 3) {
                return G.f17498d;
            }
            return G.f17500f;
        }

        @Override // d3.InterfaceC1674k
        public void q() {
            Handler handler = f.this.f25669c;
            final f fVar = f.this;
            handler.post(new Runnable() { // from class: K3.l
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.exoplayer2.source.rtsp.f.E(fVar);
                }
            });
        }

        @Override // B3.X.d
        public void r(C0936z0 c0936z0) {
            Handler handler = f.this.f25669c;
            final f fVar = f.this;
            handler.post(new Runnable() { // from class: K3.m
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.exoplayer2.source.rtsp.f.E(fVar);
                }
            });
        }
    }

    public interface c {
        void a();

        void b(K3.w wVar);
    }

    public final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f25691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.rtsp.b f25692b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f25693c;

        public d(o oVar, int i9, a.InterfaceC0243a interfaceC0243a) {
            this.f25691a = oVar;
            this.f25692b = new com.google.android.exoplayer2.source.rtsp.b(i9, oVar, new b.a() { // from class: K3.n
                @Override // com.google.android.exoplayer2.source.rtsp.b.a
                public final void a(String str, com.google.android.exoplayer2.source.rtsp.a aVar) {
                    this.f3752a.f(str, aVar);
                }
            }, f.this.f25670d, interfaceC0243a);
        }

        public Uri c() {
            return this.f25692b.f25622c.f3754b;
        }

        public String d() {
            AbstractC1684a.i(this.f25693c);
            return this.f25693c;
        }

        public boolean e() {
            return this.f25693c != null;
        }

        public final /* synthetic */ void f(String str, com.google.android.exoplayer2.source.rtsp.a aVar) {
            this.f25693c = str;
            g.b bVarL = aVar.l();
            if (bVarL != null) {
                f.this.f25671e.n0(aVar.getLocalPort(), bVarL);
                f.this.f25689w = true;
            }
            f.this.W();
        }
    }

    public final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f25695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final G f25696b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final X f25697c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f25698d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f25699e;

        public e(o oVar, int i9, a.InterfaceC0243a interfaceC0243a) {
            this.f25695a = f.this.new d(oVar, i9, interfaceC0243a);
            this.f25696b = new G("ExoPlayer:RtspMediaPeriod:RtspLoaderWrapper " + i9);
            X xL = X.l(f.this.f25668a);
            this.f25697c = xL;
            xL.d0(f.this.f25670d);
        }

        public void c() {
            if (this.f25698d) {
                return;
            }
            this.f25695a.f25692b.c();
            this.f25698d = true;
            f.this.d0();
        }

        public long d() {
            return this.f25697c.z();
        }

        public boolean e() {
            return this.f25697c.K(this.f25698d);
        }

        public int f(A0 a02, U2.g gVar, int i9) {
            return this.f25697c.S(a02, gVar, i9, this.f25698d);
        }

        public void g() {
            if (this.f25699e) {
                return;
            }
            this.f25696b.l();
            this.f25697c.T();
            this.f25699e = true;
        }

        public void h() {
            AbstractC1684a.g(this.f25698d);
            this.f25698d = false;
            f.this.d0();
            k();
        }

        public void i(long j9) {
            if (this.f25698d) {
                return;
            }
            this.f25695a.f25692b.e();
            this.f25697c.V();
            this.f25697c.b0(j9);
        }

        public int j(long j9) {
            int iE = this.f25697c.E(j9, this.f25698d);
            this.f25697c.e0(iE);
            return iE;
        }

        public void k() {
            this.f25696b.n(this.f25695a.f25692b, f.this.f25670d, 0);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.f$f, reason: collision with other inner class name */
    public final class C0245f implements Y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f25701a;

        public C0245f(int i9) {
            this.f25701a = i9;
        }

        @Override // B3.Y
        public void a() throws RtspMediaSource.c {
            if (f.this.f25679m != null) {
                throw f.this.f25679m;
            }
        }

        @Override // B3.Y
        public boolean e() {
            return f.this.T(this.f25701a);
        }

        @Override // B3.Y
        public int n(long j9) {
            return f.this.b0(this.f25701a, j9);
        }

        @Override // B3.Y
        public int q(A0 a02, U2.g gVar, int i9) {
            return f.this.X(this.f25701a, a02, gVar, i9);
        }
    }

    public f(InterfaceC1211b interfaceC1211b, a.InterfaceC0243a interfaceC0243a, Uri uri, c cVar, String str, SocketFactory socketFactory, boolean z9) {
        this.f25668a = interfaceC1211b;
        this.f25675i = interfaceC0243a;
        this.f25674h = cVar;
        b bVar = new b();
        this.f25670d = bVar;
        this.f25671e = new com.google.android.exoplayer2.source.rtsp.d(bVar, bVar, str, uri, socketFactory, z9);
        this.f25672f = new ArrayList();
        this.f25673g = new ArrayList();
        this.f25681o = -9223372036854775807L;
        this.f25680n = -9223372036854775807L;
        this.f25682p = -9223372036854775807L;
    }

    public static /* synthetic */ void E(f fVar) {
        fVar.V();
    }

    public static AbstractC2743y Q(AbstractC2743y abstractC2743y) {
        AbstractC2743y.a aVar = new AbstractC2743y.a();
        for (int i9 = 0; i9 < abstractC2743y.size(); i9++) {
            aVar.a(new g0(Integer.toString(i9), (C0936z0) AbstractC1684a.e(((e) abstractC2743y.get(i9)).f25697c.F())));
        }
        return aVar.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V() {
        if (this.f25685s || this.f25686t) {
            return;
        }
        for (int i9 = 0; i9 < this.f25672f.size(); i9++) {
            if (((e) this.f25672f.get(i9)).f25697c.F() == null) {
                return;
            }
        }
        this.f25686t = true;
        this.f25677k = Q(AbstractC2743y.r(this.f25672f));
        ((InterfaceC0517z.a) AbstractC1684a.e(this.f25676j)).e(this);
    }

    private boolean c0() {
        return this.f25684r;
    }

    public static /* synthetic */ int e(f fVar) {
        int i9 = fVar.f25688v;
        fVar.f25688v = i9 + 1;
        return i9;
    }

    public final com.google.android.exoplayer2.source.rtsp.b R(Uri uri) {
        for (int i9 = 0; i9 < this.f25672f.size(); i9++) {
            if (!((e) this.f25672f.get(i9)).f25698d) {
                d dVar = ((e) this.f25672f.get(i9)).f25695a;
                if (dVar.c().equals(uri)) {
                    return dVar.f25692b;
                }
            }
        }
        return null;
    }

    @Override // B3.InterfaceC0517z
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public AbstractC2743y k(List list) {
        return AbstractC2743y.z();
    }

    public boolean T(int i9) {
        return !c0() && ((e) this.f25672f.get(i9)).e();
    }

    public final boolean U() {
        return this.f25681o != -9223372036854775807L;
    }

    public final void W() {
        boolean zE = true;
        for (int i9 = 0; i9 < this.f25673g.size(); i9++) {
            zE &= ((d) this.f25673g.get(i9)).e();
        }
        if (zE && this.f25687u) {
            this.f25671e.r0(this.f25673g);
        }
    }

    public int X(int i9, A0 a02, U2.g gVar, int i10) {
        if (c0()) {
            return -3;
        }
        return ((e) this.f25672f.get(i9)).f(a02, gVar, i10);
    }

    public void Y() {
        for (int i9 = 0; i9 < this.f25672f.size(); i9++) {
            ((e) this.f25672f.get(i9)).g();
        }
        k0.o(this.f25671e);
        this.f25685s = true;
    }

    public final void Z() {
        this.f25689w = true;
        this.f25671e.o0();
        a.InterfaceC0243a interfaceC0243aB = this.f25675i.b();
        if (interfaceC0243aB == null) {
            this.f25679m = new RtspMediaSource.c("No fallback data channel factory for TCP retry");
            return;
        }
        ArrayList arrayList = new ArrayList(this.f25672f.size());
        ArrayList arrayList2 = new ArrayList(this.f25673g.size());
        for (int i9 = 0; i9 < this.f25672f.size(); i9++) {
            e eVar = (e) this.f25672f.get(i9);
            if (eVar.f25698d) {
                arrayList.add(eVar);
            } else {
                e eVar2 = new e(eVar.f25695a.f25691a, i9, interfaceC0243aB);
                arrayList.add(eVar2);
                eVar2.k();
                if (this.f25673g.contains(eVar.f25695a)) {
                    arrayList2.add(eVar2.f25695a);
                }
            }
        }
        AbstractC2743y abstractC2743yR = AbstractC2743y.r(this.f25672f);
        this.f25672f.clear();
        this.f25672f.addAll(arrayList);
        this.f25673g.clear();
        this.f25673g.addAll(arrayList2);
        for (int i10 = 0; i10 < abstractC2743yR.size(); i10++) {
            ((e) abstractC2743yR.get(i10)).c();
        }
    }

    public final boolean a0(long j9) {
        for (int i9 = 0; i9 < this.f25672f.size(); i9++) {
            if (!((e) this.f25672f.get(i9)).f25697c.Z(j9, false)) {
                return false;
            }
        }
        return true;
    }

    @Override // B3.InterfaceC0517z, B3.Z
    public boolean b() {
        return !this.f25683q;
    }

    public int b0(int i9, long j9) {
        if (c0()) {
            return -3;
        }
        return ((e) this.f25672f.get(i9)).j(j9);
    }

    @Override // B3.InterfaceC0517z, B3.Z
    public long c() {
        return g();
    }

    @Override // B3.InterfaceC0517z
    public long d(long j9, H1 h12) {
        return j9;
    }

    public final void d0() {
        this.f25683q = true;
        for (int i9 = 0; i9 < this.f25672f.size(); i9++) {
            this.f25683q &= ((e) this.f25672f.get(i9)).f25698d;
        }
    }

    @Override // B3.InterfaceC0517z, B3.Z
    public boolean f(long j9) {
        return b();
    }

    @Override // B3.InterfaceC0517z, B3.Z
    public long g() {
        if (this.f25683q || this.f25672f.isEmpty()) {
            return Long.MIN_VALUE;
        }
        long j9 = this.f25680n;
        if (j9 != -9223372036854775807L) {
            return j9;
        }
        boolean z9 = true;
        long jMin = Long.MAX_VALUE;
        for (int i9 = 0; i9 < this.f25672f.size(); i9++) {
            e eVar = (e) this.f25672f.get(i9);
            if (!eVar.f25698d) {
                jMin = Math.min(jMin, eVar.d());
                z9 = false;
            }
        }
        if (z9 || jMin == Long.MIN_VALUE) {
            return 0L;
        }
        return jMin;
    }

    @Override // B3.InterfaceC0517z, B3.Z
    public void h(long j9) {
    }

    @Override // B3.InterfaceC0517z
    public long i(s[] sVarArr, boolean[] zArr, Y[] yArr, boolean[] zArr2, long j9) {
        for (int i9 = 0; i9 < sVarArr.length; i9++) {
            if (yArr[i9] != null && (sVarArr[i9] == null || !zArr[i9])) {
                yArr[i9] = null;
            }
        }
        this.f25673g.clear();
        for (int i10 = 0; i10 < sVarArr.length; i10++) {
            s sVar = sVarArr[i10];
            if (sVar != null) {
                g0 g0VarK = sVar.k();
                int iIndexOf = ((AbstractC2743y) AbstractC1684a.e(this.f25677k)).indexOf(g0VarK);
                this.f25673g.add(((e) AbstractC1684a.e((e) this.f25672f.get(iIndexOf))).f25695a);
                if (this.f25677k.contains(g0VarK) && yArr[i10] == null) {
                    yArr[i10] = new C0245f(iIndexOf);
                    zArr2[i10] = true;
                }
            }
        }
        for (int i11 = 0; i11 < this.f25672f.size(); i11++) {
            e eVar = (e) this.f25672f.get(i11);
            if (!this.f25673g.contains(eVar.f25695a)) {
                eVar.c();
            }
        }
        this.f25687u = true;
        if (j9 != 0) {
            this.f25680n = j9;
            this.f25681o = j9;
            this.f25682p = j9;
        }
        W();
        return j9;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    @Override // B3.InterfaceC0517z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long l(long r6) {
        /*
            r5 = this;
            long r0 = r5.g()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L11
            boolean r0 = r5.f25689w
            if (r0 != 0) goto L11
            r5.f25682p = r6
            return r6
        L11:
            r0 = 0
            r5.v(r6, r0)
            r5.f25680n = r6
            boolean r1 = r5.U()
            if (r1 == 0) goto L38
            com.google.android.exoplayer2.source.rtsp.d r0 = r5.f25671e
            int r0 = r0.l0()
            r1 = 1
            if (r0 == r1) goto L37
            r1 = 2
            if (r0 != r1) goto L31
            r5.f25681o = r6
            com.google.android.exoplayer2.source.rtsp.d r0 = r5.f25671e
            r0.p0(r6)
            return r6
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>()
            throw r6
        L37:
            return r6
        L38:
            boolean r1 = r5.a0(r6)
            if (r1 == 0) goto L3f
            return r6
        L3f:
            r5.f25681o = r6
            boolean r1 = r5.f25683q
            if (r1 == 0) goto L6a
            r1 = 0
        L46:
            java.util.List r2 = r5.f25672f
            int r2 = r2.size()
            if (r1 >= r2) goto L5c
            java.util.List r2 = r5.f25672f
            java.lang.Object r2 = r2.get(r1)
            com.google.android.exoplayer2.source.rtsp.f$e r2 = (com.google.android.exoplayer2.source.rtsp.f.e) r2
            r2.h()
            int r1 = r1 + 1
            goto L46
        L5c:
            boolean r1 = r5.f25689w
            if (r1 == 0) goto L6a
            com.google.android.exoplayer2.source.rtsp.d r1 = r5.f25671e
            long r2 = d4.k0.x1(r6)
            r1.u0(r2)
            goto L6f
        L6a:
            com.google.android.exoplayer2.source.rtsp.d r1 = r5.f25671e
            r1.p0(r6)
        L6f:
            java.util.List r1 = r5.f25672f
            int r1 = r1.size()
            if (r0 >= r1) goto L85
            java.util.List r1 = r5.f25672f
            java.lang.Object r1 = r1.get(r0)
            com.google.android.exoplayer2.source.rtsp.f$e r1 = (com.google.android.exoplayer2.source.rtsp.f.e) r1
            r1.i(r6)
            int r0 = r0 + 1
            goto L6f
        L85:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.rtsp.f.l(long):long");
    }

    @Override // B3.InterfaceC0517z
    public long m() {
        if (!this.f25684r) {
            return -9223372036854775807L;
        }
        this.f25684r = false;
        return 0L;
    }

    @Override // B3.InterfaceC0517z
    public void p() throws IOException {
        IOException iOException = this.f25678l;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // B3.InterfaceC0517z
    public void s(InterfaceC0517z.a aVar, long j9) {
        this.f25676j = aVar;
        try {
            this.f25671e.t0();
        } catch (IOException e9) {
            this.f25678l = e9;
            k0.o(this.f25671e);
        }
    }

    @Override // B3.InterfaceC0517z
    public i0 u() {
        AbstractC1684a.g(this.f25686t);
        return new i0((g0[]) ((AbstractC2743y) AbstractC1684a.e(this.f25677k)).toArray(new g0[0]));
    }

    @Override // B3.InterfaceC0517z
    public void v(long j9, boolean z9) {
        if (U()) {
            return;
        }
        for (int i9 = 0; i9 < this.f25672f.size(); i9++) {
            e eVar = (e) this.f25672f.get(i9);
            if (!eVar.f25698d) {
                eVar.f25697c.q(j9, z9, true);
            }
        }
    }
}
