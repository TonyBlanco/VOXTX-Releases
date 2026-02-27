package B3;

import B3.C;
import B3.T;
import B3.d0;
import C3.e;
import O2.C0936z0;
import O2.H0;
import a4.InterfaceC1088b;
import android.content.Context;
import android.net.Uri;
import b4.C1227s;
import b4.InterfaceC1224o;
import b4.w;
import com.google.android.exoplayer2.extractor.g;
import com.google.android.gms.common.api.a;
import d3.AbstractC1677n;
import d3.C1669f;
import d3.InterfaceC1672i;
import d3.InterfaceC1673j;
import d3.InterfaceC1674k;
import d3.InterfaceC1678o;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import s5.AbstractC2743y;

/* JADX INFO: renamed from: B3.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0509q implements C.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC1224o.a f607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C.a f608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e.b f609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC1088b f610e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b4.F f611f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f612g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f613h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f614i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f615j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f616k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f617l;

    /* JADX INFO: renamed from: B3.q$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC1678o f618a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f619b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set f620c = new HashSet();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Map f621d = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public InterfaceC1224o.a f622e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public V2.B f623f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public b4.F f624g;

        public a(InterfaceC1678o interfaceC1678o) {
            this.f618a = interfaceC1678o;
        }

        public final void f() {
            n(0);
            n(1);
            n(2);
            n(3);
            n(4);
        }

        public C.a g(int i9) {
            C.a aVar = (C.a) this.f621d.get(Integer.valueOf(i9));
            if (aVar != null) {
                return aVar;
            }
            r5.r rVarN = n(i9);
            if (rVarN == null) {
                return null;
            }
            C.a aVar2 = (C.a) rVarN.get();
            V2.B b9 = this.f623f;
            if (b9 != null) {
                aVar2.d(b9);
            }
            b4.F f9 = this.f624g;
            if (f9 != null) {
                aVar2.a(f9);
            }
            this.f621d.put(Integer.valueOf(i9), aVar2);
            return aVar2;
        }

        public int[] h() {
            f();
            return w5.f.l(this.f620c);
        }

        public final /* synthetic */ C.a m(InterfaceC1224o.a aVar) {
            return new T.b(aVar, this.f618a);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final r5.r n(int r5) {
            /*
                r4 = this;
                java.util.Map r0 = r4.f619b
                java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
                boolean r0 = r0.containsKey(r1)
                if (r0 == 0) goto L19
                java.util.Map r0 = r4.f619b
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r5 = r0.get(r5)
                r5.r r5 = (r5.r) r5
                return r5
            L19:
                b4.o$a r0 = r4.f622e
                java.lang.Object r0 = d4.AbstractC1684a.e(r0)
                b4.o$a r0 = (b4.InterfaceC1224o.a) r0
                java.lang.Class<B3.C$a> r1 = B3.C.a.class
                r2 = 0
                if (r5 == 0) goto L61
                r3 = 1
                if (r5 == r3) goto L55
                r3 = 2
                if (r5 == r3) goto L48
                r3 = 3
                if (r5 == r3) goto L3c
                r1 = 4
                if (r5 == r1) goto L33
                goto L6d
            L33:
                B3.p r1 = new B3.p     // Catch: java.lang.ClassNotFoundException -> L3a
                r1.<init>()     // Catch: java.lang.ClassNotFoundException -> L3a
            L38:
                r2 = r1
                goto L6d
            L3a:
                goto L6d
            L3c:
                java.lang.Class<com.google.android.exoplayer2.source.rtsp.RtspMediaSource$Factory> r0 = com.google.android.exoplayer2.source.rtsp.RtspMediaSource.Factory.class
                java.lang.Class r0 = r0.asSubclass(r1)     // Catch: java.lang.ClassNotFoundException -> L3a
                B3.o r1 = new B3.o     // Catch: java.lang.ClassNotFoundException -> L3a
                r1.<init>()     // Catch: java.lang.ClassNotFoundException -> L3a
                goto L38
            L48:
                java.lang.Class<com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory> r3 = com.google.android.exoplayer2.source.hls.HlsMediaSource.Factory.class
                java.lang.Class r1 = r3.asSubclass(r1)     // Catch: java.lang.ClassNotFoundException -> L3a
                B3.n r3 = new B3.n     // Catch: java.lang.ClassNotFoundException -> L3a
                r3.<init>()     // Catch: java.lang.ClassNotFoundException -> L3a
            L53:
                r2 = r3
                goto L6d
            L55:
                java.lang.Class<com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory> r3 = com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource.Factory.class
                java.lang.Class r1 = r3.asSubclass(r1)     // Catch: java.lang.ClassNotFoundException -> L3a
                B3.m r3 = new B3.m     // Catch: java.lang.ClassNotFoundException -> L3a
                r3.<init>()     // Catch: java.lang.ClassNotFoundException -> L3a
                goto L53
            L61:
                java.lang.Class<com.google.android.exoplayer2.source.dash.DashMediaSource$Factory> r3 = com.google.android.exoplayer2.source.dash.DashMediaSource.Factory.class
                java.lang.Class r1 = r3.asSubclass(r1)     // Catch: java.lang.ClassNotFoundException -> L3a
                B3.l r3 = new B3.l     // Catch: java.lang.ClassNotFoundException -> L3a
                r3.<init>()     // Catch: java.lang.ClassNotFoundException -> L3a
                goto L53
            L6d:
                java.util.Map r0 = r4.f619b
                java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
                r0.put(r1, r2)
                if (r2 == 0) goto L81
                java.util.Set r0 = r4.f620c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r0.add(r5)
            L81:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: B3.C0509q.a.n(int):r5.r");
        }

        public void o(InterfaceC1224o.a aVar) {
            if (aVar != this.f622e) {
                this.f622e = aVar;
                this.f619b.clear();
                this.f621d.clear();
            }
        }

        public void p(V2.B b9) {
            this.f623f = b9;
            Iterator it = this.f621d.values().iterator();
            while (it.hasNext()) {
                ((C.a) it.next()).d(b9);
            }
        }

        public void q(b4.F f9) {
            this.f624g = f9;
            Iterator it = this.f621d.values().iterator();
            while (it.hasNext()) {
                ((C.a) it.next()).a(f9);
            }
        }
    }

    /* JADX INFO: renamed from: B3.q$b */
    public static final class b implements InterfaceC1672i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C0936z0 f625a;

        public b(C0936z0 c0936z0) {
            this.f625a = c0936z0;
        }

        @Override // d3.InterfaceC1672i
        public void a(long j9, long j10) {
        }

        @Override // d3.InterfaceC1672i
        public void b(InterfaceC1674k interfaceC1674k) {
            d3.w wVarE = interfaceC1674k.e(0, 3);
            interfaceC1674k.n(new g.b(-9223372036854775807L));
            interfaceC1674k.q();
            wVarE.d(this.f625a.b().g0("text/x-unknown").K(this.f625a.f6467m).G());
        }

        @Override // d3.InterfaceC1672i
        public int d(InterfaceC1673j interfaceC1673j, d3.t tVar) {
            return interfaceC1673j.b(a.e.API_PRIORITY_OTHER) == -1 ? -1 : 0;
        }

        @Override // d3.InterfaceC1672i
        public boolean h(InterfaceC1673j interfaceC1673j) {
            return true;
        }

        @Override // d3.InterfaceC1672i
        public void release() {
        }
    }

    public C0509q(Context context) {
        this(new w.a(context));
    }

    public C0509q(Context context, InterfaceC1678o interfaceC1678o) {
        this(new w.a(context), interfaceC1678o);
    }

    public C0509q(InterfaceC1224o.a aVar) {
        this(aVar, new C1669f());
    }

    public C0509q(InterfaceC1224o.a aVar, InterfaceC1678o interfaceC1678o) {
        this.f607b = aVar;
        a aVar2 = new a(interfaceC1678o);
        this.f606a = aVar2;
        aVar2.o(aVar);
        this.f612g = -9223372036854775807L;
        this.f613h = -9223372036854775807L;
        this.f614i = -9223372036854775807L;
        this.f615j = -3.4028235E38f;
        this.f616k = -3.4028235E38f;
    }

    public static /* synthetic */ C.a f(Class cls) {
        return k(cls);
    }

    public static /* synthetic */ C.a g(Class cls, InterfaceC1224o.a aVar) {
        return l(cls, aVar);
    }

    public static /* synthetic */ InterfaceC1672i[] h(C0936z0 c0936z0) {
        P3.l lVar = P3.l.f7242a;
        return new InterfaceC1672i[]{lVar.a(c0936z0) ? new P3.m(lVar.b(c0936z0), c0936z0) : new b(c0936z0)};
    }

    public static C i(H0 h02, C c9) {
        H0.d dVar = h02.f5532g;
        if (dVar.f5561a == 0 && dVar.f5562c == Long.MIN_VALUE && !dVar.f5564e) {
            return c9;
        }
        long jP0 = d4.k0.P0(h02.f5532g.f5561a);
        long jP02 = d4.k0.P0(h02.f5532g.f5562c);
        H0.d dVar2 = h02.f5532g;
        return new C0497e(c9, jP0, jP02, !dVar2.f5565f, dVar2.f5563d, dVar2.f5564e);
    }

    public static C.a k(Class cls) {
        try {
            return (C.a) cls.getConstructor(null).newInstance(null);
        } catch (Exception e9) {
            throw new IllegalStateException(e9);
        }
    }

    public static C.a l(Class cls, InterfaceC1224o.a aVar) {
        try {
            return (C.a) cls.getConstructor(InterfaceC1224o.a.class).newInstance(aVar);
        } catch (Exception e9) {
            throw new IllegalStateException(e9);
        }
    }

    @Override // B3.C.a
    public C b(H0 h02) {
        AbstractC1684a.e(h02.f5528c);
        String scheme = h02.f5528c.f5625a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            return ((C.a) AbstractC1684a.e(this.f608c)).b(h02);
        }
        H0.h hVar = h02.f5528c;
        int iY0 = d4.k0.y0(hVar.f5625a, hVar.f5626c);
        C.a aVarG = this.f606a.g(iY0);
        AbstractC1684a.j(aVarG, "No suitable media source factory found for content type: " + iY0);
        H0.g.a aVarB = h02.f5530e.b();
        if (h02.f5530e.f5607a == -9223372036854775807L) {
            aVarB.k(this.f612g);
        }
        if (h02.f5530e.f5610e == -3.4028235E38f) {
            aVarB.j(this.f615j);
        }
        if (h02.f5530e.f5611f == -3.4028235E38f) {
            aVarB.h(this.f616k);
        }
        if (h02.f5530e.f5608c == -9223372036854775807L) {
            aVarB.i(this.f613h);
        }
        if (h02.f5530e.f5609d == -9223372036854775807L) {
            aVarB.g(this.f614i);
        }
        H0.g gVarF = aVarB.f();
        if (!gVarF.equals(h02.f5530e)) {
            h02 = h02.b().f(gVarF).a();
        }
        C cB = aVarG.b(h02);
        AbstractC2743y abstractC2743y = ((H0.h) d4.k0.j(h02.f5528c)).f5631h;
        if (!abstractC2743y.isEmpty()) {
            C[] cArr = new C[abstractC2743y.size() + 1];
            cArr[0] = cB;
            for (int i9 = 0; i9 < abstractC2743y.size(); i9++) {
                if (this.f617l) {
                    final C0936z0 c0936z0G = new C0936z0.b().g0(((H0.k) abstractC2743y.get(i9)).f5654c).X(((H0.k) abstractC2743y.get(i9)).f5655d).i0(((H0.k) abstractC2743y.get(i9)).f5656e).e0(((H0.k) abstractC2743y.get(i9)).f5657f).W(((H0.k) abstractC2743y.get(i9)).f5658g).U(((H0.k) abstractC2743y.get(i9)).f5659h).G();
                    T.b bVar = new T.b(this.f607b, new InterfaceC1678o() { // from class: B3.k
                        @Override // d3.InterfaceC1678o
                        public /* synthetic */ InterfaceC1672i[] a(Uri uri, Map map) {
                            return AbstractC1677n.a(this, uri, map);
                        }

                        @Override // d3.InterfaceC1678o
                        public final InterfaceC1672i[] b() {
                            return C0509q.h(c0936z0G);
                        }
                    });
                    b4.F f9 = this.f611f;
                    if (f9 != null) {
                        bVar.a(f9);
                    }
                    cArr[i9 + 1] = bVar.b(H0.e(((H0.k) abstractC2743y.get(i9)).f5653a.toString()));
                } else {
                    d0.b bVar2 = new d0.b(this.f607b);
                    b4.F f10 = this.f611f;
                    if (f10 != null) {
                        bVar2.b(f10);
                    }
                    cArr[i9 + 1] = bVar2.a((H0.k) abstractC2743y.get(i9), -9223372036854775807L);
                }
            }
            cB = new L(cArr);
        }
        return j(h02, i(h02, cB));
    }

    @Override // B3.C.a
    public int[] c() {
        return this.f606a.h();
    }

    public final C j(H0 h02, C c9) {
        String str;
        AbstractC1684a.e(h02.f5528c);
        H0.b bVar = h02.f5528c.f5628e;
        if (bVar == null) {
            return c9;
        }
        e.b bVar2 = this.f609d;
        InterfaceC1088b interfaceC1088b = this.f610e;
        if (bVar2 == null || interfaceC1088b == null) {
            str = "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.";
        } else {
            C3.e eVarA = bVar2.a(bVar);
            if (eVarA != null) {
                C1227s c1227s = new C1227s(bVar.f5537a);
                Object obj = bVar.f5538c;
                return new C3.h(c9, c1227s, obj != null ? obj : AbstractC2743y.D(h02.f5527a, h02.f5528c.f5625a, bVar.f5537a), this, eVarA, interfaceC1088b);
            }
            str = "Playing media without ads, as no AdsLoader was provided.";
        }
        AbstractC1681B.j("DMediaSourceFactory", str);
        return c9;
    }

    public C0509q m(InterfaceC1224o.a aVar) {
        this.f607b = aVar;
        this.f606a.o(aVar);
        return this;
    }

    @Override // B3.C.a
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public C0509q d(V2.B b9) {
        this.f606a.p((V2.B) AbstractC1684a.f(b9, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    @Override // B3.C.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public C0509q a(b4.F f9) {
        this.f611f = (b4.F) AbstractC1684a.f(f9, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f606a.q(f9);
        return this;
    }

    public C0509q p(e.b bVar, InterfaceC1088b interfaceC1088b) {
        this.f609d = (e.b) AbstractC1684a.e(bVar);
        this.f610e = (InterfaceC1088b) AbstractC1684a.e(interfaceC1088b);
        return this;
    }

    public C0509q q(C.a aVar) {
        this.f608c = aVar;
        return this;
    }
}
