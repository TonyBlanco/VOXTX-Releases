package Q2;

import O2.A0;
import O2.AbstractC0892k;
import O2.C0917s1;
import O2.C0927w;
import O2.C0936z0;
import O2.D1;
import Q2.B;
import Q2.InterfaceC1039z;
import Q2.X;
import V2.AbstractC1057n;
import V2.InterfaceC1058o;
import android.os.Handler;
import android.os.SystemClock;
import com.google.ads.interactivemedia.v3.internal.u1;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.InterfaceC1683D;
import r5.AbstractC2679h;

/* JADX INFO: loaded from: classes3.dex */
public abstract class I extends AbstractC0892k implements InterfaceC1683D {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public U2.g f7587A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public SimpleDecoderOutputBuffer f7588B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public InterfaceC1058o f7589C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public InterfaceC1058o f7590D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f7591E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f7592F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f7593G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public long f7594H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f7595I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f7596J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f7597K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f7598L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public long f7599M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final long[] f7600N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f7601O;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC1039z.a f7602q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final B f7603r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final U2.g f7604s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public U2.e f7605t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C0936z0 f7606u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f7607v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f7608w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f7609x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f7610y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public U2.d f7611z;

    public static final class b {
        public static void a(B b9, Object obj) {
            b9.e(u1.a(obj));
        }
    }

    public final class c implements B.c {
        public c() {
        }

        @Override // Q2.B.c
        public void a(boolean z9) {
            I.this.f7602q.C(z9);
        }

        @Override // Q2.B.c
        public void b(Exception exc) {
            AbstractC1681B.e("DecoderAudioRenderer", "Audio sink error", exc);
            I.this.f7602q.l(exc);
        }

        @Override // Q2.B.c
        public void c(long j9) {
            I.this.f7602q.B(j9);
        }

        @Override // Q2.B.c
        public /* synthetic */ void d() {
            C.c(this);
        }

        @Override // Q2.B.c
        public void e(int i9, long j9, long j10) {
            I.this.f7602q.D(i9, j9, j10);
        }

        @Override // Q2.B.c
        public /* synthetic */ void f() {
            C.a(this);
        }

        @Override // Q2.B.c
        public void g() {
            I.this.c0();
        }

        @Override // Q2.B.c
        public /* synthetic */ void h() {
            C.b(this);
        }
    }

    public I(Handler handler, InterfaceC1039z interfaceC1039z, B b9) {
        super(1);
        this.f7602q = new InterfaceC1039z.a(handler, interfaceC1039z);
        this.f7603r = b9;
        b9.k(new c());
        this.f7604s = U2.g.l();
        this.f7591E = 0;
        this.f7593G = true;
        i0(-9223372036854775807L);
        this.f7600N = new long[10];
    }

    public I(Handler handler, InterfaceC1039z interfaceC1039z, C1022h c1022h, InterfaceC1027m... interfaceC1027mArr) {
        this(handler, interfaceC1039z, new X.f().h((C1022h) AbstractC2679h.a(c1022h, C1022h.f7852c)).j(interfaceC1027mArr).g());
    }

    public I(Handler handler, InterfaceC1039z interfaceC1039z, InterfaceC1027m... interfaceC1027mArr) {
        this(handler, interfaceC1039z, null, interfaceC1027mArr);
    }

    private void X() throws C0927w {
        if (this.f7591E != 0) {
            g0();
            a0();
            return;
        }
        this.f7587A = null;
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = this.f7588B;
        if (simpleDecoderOutputBuffer != null) {
            simpleDecoderOutputBuffer.release();
            this.f7588B = null;
        }
        this.f7611z.flush();
        this.f7592F = false;
    }

    private void b0(A0 a02) throws C0927w {
        C0936z0 c0936z0 = (C0936z0) AbstractC1684a.e(a02.f5499b);
        j0(a02.f5498a);
        C0936z0 c0936z02 = this.f7606u;
        this.f7606u = c0936z0;
        this.f7607v = c0936z0.f6449C;
        this.f7608w = c0936z0.f6450D;
        U2.d dVar = this.f7611z;
        if (dVar == null) {
            a0();
            this.f7602q.q(this.f7606u, null);
            return;
        }
        U2.h hVar = this.f7590D != this.f7589C ? new U2.h(dVar.getName(), c0936z02, c0936z0, 0, 128) : T(dVar.getName(), c0936z02, c0936z0);
        if (hVar.f9710d == 0) {
            if (this.f7592F) {
                this.f7591E = 1;
            } else {
                g0();
                a0();
                this.f7593G = true;
            }
        }
        this.f7602q.q(this.f7606u, hVar);
    }

    private void g0() {
        this.f7587A = null;
        this.f7588B = null;
        this.f7591E = 0;
        this.f7592F = false;
        U2.d dVar = this.f7611z;
        if (dVar != null) {
            this.f7605t.f9686b++;
            dVar.release();
            this.f7602q.n(this.f7611z.getName());
            this.f7611z = null;
        }
        h0(null);
    }

    @Override // O2.AbstractC0892k
    public void G() {
        this.f7606u = null;
        this.f7593G = true;
        i0(-9223372036854775807L);
        try {
            j0(null);
            g0();
            this.f7603r.reset();
        } finally {
            this.f7602q.o(this.f7605t);
        }
    }

    @Override // O2.AbstractC0892k
    public void H(boolean z9, boolean z10) {
        U2.e eVar = new U2.e();
        this.f7605t = eVar;
        this.f7602q.p(eVar);
        if (A().f5516a) {
            this.f7603r.s();
        } else {
            this.f7603r.h();
        }
        this.f7603r.i(D());
    }

    @Override // O2.AbstractC0892k
    public void I(long j9, boolean z9) throws C0927w {
        if (this.f7609x) {
            this.f7603r.n();
        } else {
            this.f7603r.flush();
        }
        this.f7594H = j9;
        this.f7595I = true;
        this.f7596J = true;
        this.f7597K = false;
        this.f7598L = false;
        if (this.f7611z != null) {
            X();
        }
    }

    @Override // O2.AbstractC0892k
    public void M() {
        this.f7603r.play();
    }

    @Override // O2.AbstractC0892k
    public void N() {
        m0();
        this.f7603r.pause();
    }

    @Override // O2.AbstractC0892k
    public void O(C0936z0[] c0936z0Arr, long j9, long j10) {
        super.O(c0936z0Arr, j9, j10);
        this.f7610y = false;
        if (this.f7599M == -9223372036854775807L) {
            i0(j10);
            return;
        }
        int i9 = this.f7601O;
        if (i9 == this.f7600N.length) {
            AbstractC1681B.j("DecoderAudioRenderer", "Too many stream changes, so dropping offset: " + this.f7600N[this.f7601O - 1]);
        } else {
            this.f7601O = i9 + 1;
        }
        this.f7600N[this.f7601O - 1] = j10;
    }

    public U2.h T(String str, C0936z0 c0936z0, C0936z0 c0936z02) {
        return new U2.h(str, c0936z0, c0936z02, 0, 1);
    }

    public abstract U2.d U(C0936z0 c0936z0, CryptoConfig cryptoConfig);

    public final boolean V() throws C0927w {
        if (this.f7588B == null) {
            SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = (SimpleDecoderOutputBuffer) this.f7611z.b();
            this.f7588B = simpleDecoderOutputBuffer;
            if (simpleDecoderOutputBuffer == null) {
                return false;
            }
            int i9 = simpleDecoderOutputBuffer.skippedOutputBufferCount;
            if (i9 > 0) {
                this.f7605t.f9690f += i9;
                this.f7603r.r();
            }
            if (this.f7588B.isFirstSample()) {
                f0();
            }
        }
        if (this.f7588B.isEndOfStream()) {
            if (this.f7591E == 2) {
                g0();
                a0();
                this.f7593G = true;
            } else {
                this.f7588B.release();
                this.f7588B = null;
                try {
                    e0();
                } catch (B.e e9) {
                    throw z(e9, e9.f7531d, e9.f7530c, 5002);
                }
            }
            return false;
        }
        if (this.f7593G) {
            this.f7603r.u(Y(this.f7611z).b().P(this.f7607v).Q(this.f7608w).G(), 0, null);
            this.f7593G = false;
        }
        B b9 = this.f7603r;
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer2 = this.f7588B;
        if (!b9.l(simpleDecoderOutputBuffer2.data, simpleDecoderOutputBuffer2.timeUs, 1)) {
            return false;
        }
        this.f7605t.f9689e++;
        this.f7588B.release();
        this.f7588B = null;
        return true;
    }

    public final boolean W() throws C0927w {
        U2.d dVar = this.f7611z;
        if (dVar == null || this.f7591E == 2 || this.f7597K) {
            return false;
        }
        if (this.f7587A == null) {
            U2.g gVar = (U2.g) dVar.d();
            this.f7587A = gVar;
            if (gVar == null) {
                return false;
            }
        }
        if (this.f7591E == 1) {
            this.f7587A.setFlags(4);
            this.f7611z.c(this.f7587A);
            this.f7587A = null;
            this.f7591E = 2;
            return false;
        }
        A0 a0B = B();
        int iP = P(a0B, this.f7587A, 0);
        if (iP == -5) {
            b0(a0B);
            return true;
        }
        if (iP != -4) {
            if (iP == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        if (this.f7587A.isEndOfStream()) {
            this.f7597K = true;
            this.f7611z.c(this.f7587A);
            this.f7587A = null;
            return false;
        }
        if (!this.f7610y) {
            this.f7610y = true;
            this.f7587A.addFlag(134217728);
        }
        this.f7587A.i();
        U2.g gVar2 = this.f7587A;
        gVar2.f9697a = this.f7606u;
        d0(gVar2);
        this.f7611z.c(this.f7587A);
        this.f7592F = true;
        this.f7605t.f9687c++;
        this.f7587A = null;
        return true;
    }

    public abstract C0936z0 Y(U2.d dVar);

    public final int Z(C0936z0 c0936z0) {
        return this.f7603r.j(c0936z0);
    }

    @Override // O2.E1
    public final int a(C0936z0 c0936z0) {
        if (!d4.F.o(c0936z0.f6467m)) {
            return D1.a(0);
        }
        int iL0 = l0(c0936z0);
        if (iL0 <= 2) {
            return D1.a(iL0);
        }
        return D1.b(iL0, 8, d4.k0.f39777a >= 21 ? 32 : 0);
    }

    public final void a0() throws C0927w {
        CryptoConfig cryptoConfigD;
        if (this.f7611z != null) {
            return;
        }
        h0(this.f7590D);
        InterfaceC1058o interfaceC1058o = this.f7589C;
        if (interfaceC1058o != null) {
            cryptoConfigD = interfaceC1058o.d();
            if (cryptoConfigD == null && this.f7589C.getError() == null) {
                return;
            }
        } else {
            cryptoConfigD = null;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            d4.a0.a("createAudioDecoder");
            this.f7611z = U(this.f7606u, cryptoConfigD);
            d4.a0.c();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            this.f7602q.m(this.f7611z.getName(), jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
            this.f7605t.f9685a++;
        } catch (U2.f e9) {
            AbstractC1681B.e("DecoderAudioRenderer", "Audio codec error", e9);
            this.f7602q.k(e9);
            throw y(e9, this.f7606u, 4001);
        } catch (OutOfMemoryError e10) {
            throw y(e10, this.f7606u, 4001);
        }
    }

    @Override // d4.InterfaceC1683D
    public void b(C0917s1 c0917s1) {
        this.f7603r.b(c0917s1);
    }

    @Override // d4.InterfaceC1683D
    public C0917s1 c() {
        return this.f7603r.c();
    }

    public void c0() {
        this.f7596J = true;
    }

    @Override // O2.C1
    public boolean d() {
        return this.f7598L && this.f7603r.d();
    }

    public void d0(U2.g gVar) {
        if (!this.f7595I || gVar.isDecodeOnly()) {
            return;
        }
        if (Math.abs(gVar.f9701f - this.f7594H) > 500000) {
            this.f7594H = gVar.f9701f;
        }
        this.f7595I = false;
    }

    @Override // O2.C1
    public boolean e() {
        return this.f7603r.f() || (this.f7606u != null && (F() || this.f7588B != null));
    }

    public final void e0() {
        this.f7598L = true;
        this.f7603r.o();
    }

    public final void f0() {
        this.f7603r.r();
        if (this.f7601O != 0) {
            i0(this.f7600N[0]);
            int i9 = this.f7601O - 1;
            this.f7601O = i9;
            long[] jArr = this.f7600N;
            System.arraycopy(jArr, 1, jArr, 0, i9);
        }
    }

    public final void h0(InterfaceC1058o interfaceC1058o) {
        AbstractC1057n.a(this.f7589C, interfaceC1058o);
        this.f7589C = interfaceC1058o;
    }

    public final void i0(long j9) {
        this.f7599M = j9;
        if (j9 != -9223372036854775807L) {
            this.f7603r.q(j9);
        }
    }

    public final void j0(InterfaceC1058o interfaceC1058o) {
        AbstractC1057n.a(this.f7590D, interfaceC1058o);
        this.f7590D = interfaceC1058o;
    }

    public final boolean k0(C0936z0 c0936z0) {
        return this.f7603r.a(c0936z0);
    }

    public abstract int l0(C0936z0 c0936z0);

    public final void m0() {
        long jP = this.f7603r.p(d());
        if (jP != Long.MIN_VALUE) {
            if (!this.f7596J) {
                jP = Math.max(this.f7594H, jP);
            }
            this.f7594H = jP;
            this.f7596J = false;
        }
    }

    @Override // O2.AbstractC0892k, O2.C0932x1.b
    public void n(int i9, Object obj) {
        if (i9 == 2) {
            this.f7603r.setVolume(((Float) obj).floatValue());
            return;
        }
        if (i9 == 3) {
            this.f7603r.t((C1019e) obj);
            return;
        }
        if (i9 == 6) {
            this.f7603r.m((F) obj);
            return;
        }
        if (i9 == 12) {
            if (d4.k0.f39777a >= 23) {
                b.a(this.f7603r, obj);
            }
        } else if (i9 == 9) {
            this.f7603r.v(((Boolean) obj).booleanValue());
        } else if (i9 != 10) {
            super.n(i9, obj);
        } else {
            this.f7603r.g(((Integer) obj).intValue());
        }
    }

    @Override // d4.InterfaceC1683D
    public long r() {
        if (getState() == 2) {
            m0();
        }
        return this.f7594H;
    }

    @Override // O2.C1
    public void u(long j9, long j10) throws C0927w {
        if (this.f7598L) {
            try {
                this.f7603r.o();
                return;
            } catch (B.e e9) {
                throw z(e9, e9.f7531d, e9.f7530c, 5002);
            }
        }
        if (this.f7606u == null) {
            A0 a0B = B();
            this.f7604s.clear();
            int iP = P(a0B, this.f7604s, 2);
            if (iP != -5) {
                if (iP == -4) {
                    AbstractC1684a.g(this.f7604s.isEndOfStream());
                    this.f7597K = true;
                    try {
                        e0();
                        return;
                    } catch (B.e e10) {
                        throw y(e10, null, 5002);
                    }
                }
                return;
            }
            b0(a0B);
        }
        a0();
        if (this.f7611z != null) {
            try {
                d4.a0.a("drainAndFeed");
                while (V()) {
                }
                while (W()) {
                }
                d4.a0.c();
                this.f7605t.c();
            } catch (B.a e11) {
                throw y(e11, e11.f7523a, 5001);
            } catch (B.b e12) {
                throw z(e12, e12.f7526d, e12.f7525c, 5001);
            } catch (B.e e13) {
                throw z(e13, e13.f7531d, e13.f7530c, 5002);
            } catch (U2.f e14) {
                AbstractC1681B.e("DecoderAudioRenderer", "Audio codec error", e14);
                this.f7602q.k(e14);
                throw y(e14, this.f7606u, 4003);
            }
        }
    }

    @Override // O2.AbstractC0892k, O2.C1
    public InterfaceC1683D x() {
        return this;
    }
}
