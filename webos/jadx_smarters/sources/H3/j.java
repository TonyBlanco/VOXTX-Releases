package H3;

import H3.f;
import J3.f;
import O2.C0936z0;
import P2.v0;
import V2.C1056m;
import android.net.Uri;
import b4.AbstractC1218i;
import b4.C1227s;
import b4.InterfaceC1224o;
import d3.C1666c;
import d3.InterfaceC1673j;
import d4.AbstractC1684a;
import d4.M;
import d4.Z;
import d4.b0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.internal.http2.Http2;
import q3.C2540a;
import r5.AbstractC2673b;
import s5.AbstractC2717A;
import s5.AbstractC2743y;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends D3.n {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final AtomicInteger f2462O = new AtomicInteger();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final M f2463A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final boolean f2464B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final boolean f2465C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final v0 f2466D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final long f2467E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public k f2468F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public q f2469G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f2470H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f2471I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public volatile boolean f2472J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f2473K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public AbstractC2743y f2474L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f2475M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f2476N;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f2477l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f2478m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Uri f2479n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f2480o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f2481p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC1224o f2482q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C1227s f2483r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final k f2484s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f2485t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f2486u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Z f2487v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final h f2488w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final List f2489x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C1056m f2490y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final v3.h f2491z;

    public j(h hVar, InterfaceC1224o interfaceC1224o, C1227s c1227s, C0936z0 c0936z0, boolean z9, InterfaceC1224o interfaceC1224o2, C1227s c1227s2, boolean z10, Uri uri, List list, int i9, Object obj, long j9, long j10, long j11, int i10, boolean z11, int i11, boolean z12, boolean z13, Z z14, long j12, C1056m c1056m, k kVar, v3.h hVar2, M m9, boolean z15, v0 v0Var) {
        super(interfaceC1224o, c1227s, c0936z0, i9, obj, j9, j10, j11);
        this.f2464B = z9;
        this.f2481p = i10;
        this.f2476N = z11;
        this.f2478m = i11;
        this.f2483r = c1227s2;
        this.f2482q = interfaceC1224o2;
        this.f2471I = c1227s2 != null;
        this.f2465C = z10;
        this.f2479n = uri;
        this.f2485t = z13;
        this.f2487v = z14;
        this.f2467E = j12;
        this.f2486u = z12;
        this.f2488w = hVar;
        this.f2489x = list;
        this.f2490y = c1056m;
        this.f2484s = kVar;
        this.f2491z = hVar2;
        this.f2463A = m9;
        this.f2480o = z15;
        this.f2466D = v0Var;
        this.f2474L = AbstractC2743y.z();
        this.f2477l = f2462O.getAndIncrement();
    }

    public static InterfaceC1224o i(InterfaceC1224o interfaceC1224o, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return interfaceC1224o;
        }
        AbstractC1684a.e(bArr2);
        return new a(interfaceC1224o, bArr, bArr2);
    }

    public static j j(h hVar, InterfaceC1224o interfaceC1224o, C0936z0 c0936z0, long j9, J3.f fVar, f.e eVar, Uri uri, List list, int i9, Object obj, boolean z9, t tVar, long j10, j jVar, byte[] bArr, byte[] bArr2, boolean z10, v0 v0Var, AbstractC1218i abstractC1218i) {
        C1227s c1227s;
        InterfaceC1224o interfaceC1224oI;
        boolean z11;
        v3.h hVar2;
        M m9;
        k kVar;
        f.e eVar2 = eVar.f2455a;
        C1227s c1227sA = new C1227s.b().i(b0.e(fVar.f3191a, eVar2.f3154a)).h(eVar2.f3162j).g(eVar2.f3163k).b(eVar.f2458d ? 8 : 0).e(AbstractC2717A.k()).a();
        boolean z12 = bArr != null;
        InterfaceC1224o interfaceC1224oI2 = i(interfaceC1224o, bArr, z12 ? l((String) AbstractC1684a.e(eVar2.f3161i)) : null);
        f.d dVar = eVar2.f3155c;
        if (dVar != null) {
            boolean z13 = bArr2 != null;
            byte[] bArrL = z13 ? l((String) AbstractC1684a.e(dVar.f3161i)) : null;
            C1227s c1227s2 = new C1227s(b0.e(fVar.f3191a, dVar.f3154a), dVar.f3162j, dVar.f3163k);
            z11 = z13;
            interfaceC1224oI = i(interfaceC1224o, bArr2, bArrL);
            c1227s = c1227s2;
        } else {
            c1227s = null;
            interfaceC1224oI = null;
            z11 = false;
        }
        long j11 = j9 + eVar2.f3158f;
        long j12 = j11 + eVar2.f3156d;
        int i10 = fVar.f3134j + eVar2.f3157e;
        if (jVar != null) {
            C1227s c1227s3 = jVar.f2483r;
            boolean z14 = c1227s == c1227s3 || (c1227s != null && c1227s3 != null && c1227s.f17598a.equals(c1227s3.f17598a) && c1227s.f17604g == jVar.f2483r.f17604g);
            boolean z15 = uri.equals(jVar.f2479n) && jVar.f2473K;
            v3.h hVar3 = jVar.f2491z;
            M m10 = jVar.f2463A;
            kVar = (z14 && z15 && !jVar.f2475M && jVar.f2478m == i10) ? jVar.f2468F : null;
            hVar2 = hVar3;
            m9 = m10;
        } else {
            hVar2 = new v3.h();
            m9 = new M(10);
            kVar = null;
        }
        return new j(hVar, interfaceC1224oI2, c1227sA, c0936z0, z12, interfaceC1224oI, c1227s, z11, uri, list, i9, obj, j11, j12, eVar.f2456b, eVar.f2457c, !eVar.f2458d, i10, eVar2.f3164l, z9, tVar.a(i10), j10, eVar2.f3159g, kVar, hVar2, m9, z10, v0Var);
    }

    public static byte[] l(String str) {
        if (AbstractC2673b.e(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    public static boolean p(f.e eVar, J3.f fVar) {
        f.e eVar2 = eVar.f2455a;
        return eVar2 instanceof f.b ? ((f.b) eVar2).f3147m || (eVar.f2457c == 0 && fVar.f3193c) : fVar.f3193c;
    }

    public static boolean w(j jVar, Uri uri, J3.f fVar, f.e eVar, long j9) {
        if (jVar == null) {
            return false;
        }
        if (uri.equals(jVar.f2479n) && jVar.f2473K) {
            return false;
        }
        return !p(eVar, fVar) || j9 + eVar.f2455a.f3158f < jVar.f1383i;
    }

    @Override // b4.G.e
    public void a() {
        k kVar;
        AbstractC1684a.e(this.f2469G);
        if (this.f2468F == null && (kVar = this.f2484s) != null && kVar.d()) {
            this.f2468F = this.f2484s;
            this.f2471I = false;
        }
        s();
        if (this.f2472J) {
            return;
        }
        if (!this.f2486u) {
            r();
        }
        this.f2473K = !this.f2472J;
    }

    @Override // b4.G.e
    public void c() {
        this.f2472J = true;
    }

    @Override // D3.n
    public boolean h() {
        return this.f2473K;
    }

    public final void k(InterfaceC1224o interfaceC1224o, C1227s c1227s, boolean z9, boolean z10) {
        C1227s c1227sE;
        long position;
        long j9;
        if (z9) {
            z = this.f2470H != 0;
            c1227sE = c1227s;
        } else {
            c1227sE = c1227s.e(this.f2470H);
        }
        try {
            C1666c c1666cU = u(interfaceC1224o, c1227sE, z10);
            if (z) {
                c1666cU.q(this.f2470H);
            }
            while (!this.f2472J && this.f2468F.a(c1666cU)) {
                try {
                    try {
                    } catch (EOFException e9) {
                        if ((this.f1379e.f6460f & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                            throw e9;
                        }
                        this.f2468F.c();
                        position = c1666cU.getPosition();
                        j9 = c1227s.f17604g;
                    }
                } catch (Throwable th) {
                    this.f2470H = (int) (c1666cU.getPosition() - c1227s.f17604g);
                    throw th;
                }
            }
            position = c1666cU.getPosition();
            j9 = c1227s.f17604g;
            this.f2470H = (int) (position - j9);
        } finally {
            b4.r.a(interfaceC1224o);
        }
    }

    public int m(int i9) {
        AbstractC1684a.g(!this.f2480o);
        if (i9 >= this.f2474L.size()) {
            return 0;
        }
        return ((Integer) this.f2474L.get(i9)).intValue();
    }

    public void n(q qVar, AbstractC2743y abstractC2743y) {
        this.f2469G = qVar;
        this.f2474L = abstractC2743y;
    }

    public void o() {
        this.f2475M = true;
    }

    public boolean q() {
        return this.f2476N;
    }

    public final void r() {
        k(this.f1384j, this.f1377c, this.f2464B, true);
    }

    public final void s() {
        if (this.f2471I) {
            AbstractC1684a.e(this.f2482q);
            AbstractC1684a.e(this.f2483r);
            k(this.f2482q, this.f2483r, this.f2465C, false);
            this.f2470H = 0;
            this.f2471I = false;
        }
    }

    public final long t(InterfaceC1673j interfaceC1673j) {
        interfaceC1673j.f();
        try {
            this.f2463A.Q(10);
            interfaceC1673j.s(this.f2463A.e(), 0, 10);
        } catch (EOFException unused) {
        }
        if (this.f2463A.K() != 4801587) {
            return -9223372036854775807L;
        }
        this.f2463A.V(3);
        int iG = this.f2463A.G();
        int i9 = iG + 10;
        if (i9 > this.f2463A.b()) {
            byte[] bArrE = this.f2463A.e();
            this.f2463A.Q(i9);
            System.arraycopy(bArrE, 0, this.f2463A.e(), 0, 10);
        }
        interfaceC1673j.s(this.f2463A.e(), 10, iG);
        C2540a c2540aE = this.f2491z.e(this.f2463A.e(), iG);
        if (c2540aE == null) {
            return -9223372036854775807L;
        }
        int iF = c2540aE.f();
        for (int i10 = 0; i10 < iF; i10++) {
            C2540a.b bVarE = c2540aE.e(i10);
            if (bVarE instanceof v3.l) {
                v3.l lVar = (v3.l) bVarE;
                if ("com.apple.streaming.transportStreamTimestamp".equals(lVar.f51325c)) {
                    System.arraycopy(lVar.f51326d, 0, this.f2463A.e(), 0, 8);
                    this.f2463A.U(0);
                    this.f2463A.T(8);
                    return this.f2463A.A() & 8589934591L;
                }
            }
        }
        return -9223372036854775807L;
    }

    public final C1666c u(InterfaceC1224o interfaceC1224o, C1227s c1227s, boolean z9) throws IOException {
        q qVar;
        long jB;
        long jA = interfaceC1224o.a(c1227s);
        if (z9) {
            try {
                this.f2487v.i(this.f2485t, this.f1382h, this.f2467E);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e9) {
                throw new IOException(e9);
            }
        }
        C1666c c1666c = new C1666c(interfaceC1224o, c1227s.f17604g, jA);
        if (this.f2468F == null) {
            long jT = t(c1666c);
            c1666c.f();
            k kVar = this.f2484s;
            k kVarF = kVar != null ? kVar.f() : this.f2488w.a(c1227s.f17598a, this.f1379e, this.f2489x, this.f2487v, interfaceC1224o.e(), c1666c, this.f2466D);
            this.f2468F = kVarF;
            if (kVarF.e()) {
                qVar = this.f2469G;
                jB = jT != -9223372036854775807L ? this.f2487v.b(jT) : this.f1382h;
            } else {
                qVar = this.f2469G;
                jB = 0;
            }
            qVar.p0(jB);
            this.f2469G.b0();
            this.f2468F.b(this.f2469G);
        }
        this.f2469G.m0(this.f2490y);
        return c1666c;
    }

    public void v() {
        this.f2476N = true;
    }
}
