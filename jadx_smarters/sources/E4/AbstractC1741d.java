package e4;

import O2.A0;
import O2.AbstractC0892k;
import O2.C0927w;
import O2.C0936z0;
import V2.AbstractC1057n;
import V2.InterfaceC1058o;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.Y;
import d4.a0;
import d4.k0;
import e4.InterfaceC1735A;

/* JADX INFO: renamed from: e4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1741d extends AbstractC0892k {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f40207A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Object f40208B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Surface f40209C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public l f40210D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public m f40211E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public InterfaceC1058o f40212F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public InterfaceC1058o f40213G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f40214H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f40215I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f40216J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f40217K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f40218L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public long f40219M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public long f40220N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f40221O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f40222P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f40223Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public C1737C f40224R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public long f40225S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f40226T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f40227U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f40228V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public long f40229W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public long f40230X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public U2.e f40231Y;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f40232q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f40233r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final InterfaceC1735A.a f40234s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Y f40235t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final U2.g f40236u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C0936z0 f40237v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C0936z0 f40238w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public U2.d f40239x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public U2.g f40240y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public VideoDecoderOutputBuffer f40241z;

    public AbstractC1741d(long j9, Handler handler, InterfaceC1735A interfaceC1735A, int i9) {
        super(2);
        this.f40232q = j9;
        this.f40233r = i9;
        this.f40220N = -9223372036854775807L;
        U();
        this.f40235t = new Y();
        this.f40236u = U2.g.l();
        this.f40234s = new InterfaceC1735A.a(handler, interfaceC1735A);
        this.f40214H = 0;
        this.f40207A = -1;
    }

    private void T() {
        this.f40216J = false;
    }

    private void U() {
        this.f40224R = null;
    }

    private boolean W(long j9, long j10) throws C0927w {
        if (this.f40241z == null) {
            VideoDecoderOutputBuffer videoDecoderOutputBuffer = (VideoDecoderOutputBuffer) this.f40239x.b();
            this.f40241z = videoDecoderOutputBuffer;
            if (videoDecoderOutputBuffer == null) {
                return false;
            }
            U2.e eVar = this.f40231Y;
            int i9 = eVar.f9690f;
            int i10 = videoDecoderOutputBuffer.skippedOutputBufferCount;
            eVar.f9690f = i9 + i10;
            this.f40228V -= i10;
        }
        if (!this.f40241z.isEndOfStream()) {
            boolean zQ0 = q0(j9, j10);
            if (zQ0) {
                o0(this.f40241z.timeUs);
                this.f40241z = null;
            }
            return zQ0;
        }
        if (this.f40214H == 2) {
            r0();
            e0();
        } else {
            this.f40241z.release();
            this.f40241z = null;
            this.f40223Q = true;
        }
        return false;
    }

    private boolean Y() throws C0927w {
        U2.d dVar = this.f40239x;
        if (dVar == null || this.f40214H == 2 || this.f40222P) {
            return false;
        }
        if (this.f40240y == null) {
            U2.g gVar = (U2.g) dVar.d();
            this.f40240y = gVar;
            if (gVar == null) {
                return false;
            }
        }
        if (this.f40214H == 1) {
            this.f40240y.setFlags(4);
            this.f40239x.c(this.f40240y);
            this.f40240y = null;
            this.f40214H = 2;
            return false;
        }
        A0 a0B = B();
        int iP = P(a0B, this.f40240y, 0);
        if (iP == -5) {
            k0(a0B);
            return true;
        }
        if (iP != -4) {
            if (iP == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        if (this.f40240y.isEndOfStream()) {
            this.f40222P = true;
            this.f40239x.c(this.f40240y);
            this.f40240y = null;
            return false;
        }
        if (this.f40221O) {
            this.f40235t.a(this.f40240y.f9701f, this.f40237v);
            this.f40221O = false;
        }
        this.f40240y.i();
        U2.g gVar2 = this.f40240y;
        gVar2.f9697a = this.f40237v;
        p0(gVar2);
        this.f40239x.c(this.f40240y);
        this.f40228V++;
        this.f40215I = true;
        this.f40231Y.f9687c++;
        this.f40240y = null;
        return true;
    }

    private static boolean b0(long j9) {
        return j9 < -30000;
    }

    private static boolean c0(long j9) {
        return j9 < -500000;
    }

    private void e0() throws C0927w {
        CryptoConfig cryptoConfigD;
        if (this.f40239x != null) {
            return;
        }
        u0(this.f40213G);
        InterfaceC1058o interfaceC1058o = this.f40212F;
        if (interfaceC1058o != null) {
            cryptoConfigD = interfaceC1058o.d();
            if (cryptoConfigD == null && this.f40212F.getError() == null) {
                return;
            }
        } else {
            cryptoConfigD = null;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f40239x = V(this.f40237v, cryptoConfigD);
            v0(this.f40207A);
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            this.f40234s.k(this.f40239x.getName(), jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
            this.f40231Y.f9685a++;
        } catch (U2.f e9) {
            AbstractC1681B.e("DecoderVideoRenderer", "Video codec error", e9);
            this.f40234s.C(e9);
            throw y(e9, this.f40237v, 4001);
        } catch (OutOfMemoryError e10) {
            throw y(e10, this.f40237v, 4001);
        }
    }

    private void f0() {
        if (this.f40226T > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f40234s.n(this.f40226T, jElapsedRealtime - this.f40225S);
            this.f40226T = 0;
            this.f40225S = jElapsedRealtime;
        }
    }

    private void g0() {
        this.f40218L = true;
        if (this.f40216J) {
            return;
        }
        this.f40216J = true;
        this.f40234s.A(this.f40208B);
    }

    private void i0() {
        if (this.f40216J) {
            this.f40234s.A(this.f40208B);
        }
    }

    private void j0() {
        C1737C c1737c = this.f40224R;
        if (c1737c != null) {
            this.f40234s.D(c1737c);
        }
    }

    private void u0(InterfaceC1058o interfaceC1058o) {
        AbstractC1057n.a(this.f40212F, interfaceC1058o);
        this.f40212F = interfaceC1058o;
    }

    private void w0() {
        this.f40220N = this.f40232q > 0 ? SystemClock.elapsedRealtime() + this.f40232q : -9223372036854775807L;
    }

    private void y0(InterfaceC1058o interfaceC1058o) {
        AbstractC1057n.a(this.f40213G, interfaceC1058o);
        this.f40213G = interfaceC1058o;
    }

    public boolean A0(long j9, long j10) {
        return b0(j9);
    }

    public boolean B0(long j9, long j10) {
        return b0(j9) && j10 > 100000;
    }

    public void C0(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        this.f40231Y.f9690f++;
        videoDecoderOutputBuffer.release();
    }

    public void D0(int i9, int i10) {
        U2.e eVar = this.f40231Y;
        eVar.f9692h += i9;
        int i11 = i9 + i10;
        eVar.f9691g += i11;
        this.f40226T += i11;
        int i12 = this.f40227U + i11;
        this.f40227U = i12;
        eVar.f9693i = Math.max(i12, eVar.f9693i);
        int i13 = this.f40233r;
        if (i13 <= 0 || this.f40226T < i13) {
            return;
        }
        f0();
    }

    @Override // O2.AbstractC0892k
    public void G() {
        this.f40237v = null;
        U();
        T();
        try {
            y0(null);
            r0();
        } finally {
            this.f40234s.m(this.f40231Y);
        }
    }

    @Override // O2.AbstractC0892k
    public void H(boolean z9, boolean z10) {
        U2.e eVar = new U2.e();
        this.f40231Y = eVar;
        this.f40234s.o(eVar);
        this.f40217K = z10;
        this.f40218L = false;
    }

    @Override // O2.AbstractC0892k
    public void I(long j9, boolean z9) throws C0927w {
        this.f40222P = false;
        this.f40223Q = false;
        T();
        this.f40219M = -9223372036854775807L;
        this.f40227U = 0;
        if (this.f40239x != null) {
            Z();
        }
        if (z9) {
            w0();
        } else {
            this.f40220N = -9223372036854775807L;
        }
        this.f40235t.c();
    }

    @Override // O2.AbstractC0892k
    public void M() {
        this.f40226T = 0;
        this.f40225S = SystemClock.elapsedRealtime();
        this.f40229W = SystemClock.elapsedRealtime() * 1000;
    }

    @Override // O2.AbstractC0892k
    public void N() {
        this.f40220N = -9223372036854775807L;
        f0();
    }

    @Override // O2.AbstractC0892k
    public void O(C0936z0[] c0936z0Arr, long j9, long j10) {
        this.f40230X = j10;
        super.O(c0936z0Arr, j9, j10);
    }

    public abstract U2.h S(String str, C0936z0 c0936z0, C0936z0 c0936z02);

    public abstract U2.d V(C0936z0 c0936z0, CryptoConfig cryptoConfig);

    public void X(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        D0(0, 1);
        videoDecoderOutputBuffer.release();
    }

    public void Z() throws C0927w {
        this.f40228V = 0;
        if (this.f40214H != 0) {
            r0();
            e0();
            return;
        }
        this.f40240y = null;
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = this.f40241z;
        if (videoDecoderOutputBuffer != null) {
            videoDecoderOutputBuffer.release();
            this.f40241z = null;
        }
        this.f40239x.flush();
        this.f40215I = false;
    }

    public final boolean a0() {
        return this.f40207A != -1;
    }

    @Override // O2.C1
    public boolean d() {
        return this.f40223Q;
    }

    public boolean d0(long j9) throws C0927w {
        int iR = R(j9);
        if (iR == 0) {
            return false;
        }
        this.f40231Y.f9694j++;
        D0(iR, this.f40228V);
        Z();
        return true;
    }

    @Override // O2.C1
    public boolean e() {
        if (this.f40237v != null && ((F() || this.f40241z != null) && (this.f40216J || !a0()))) {
            this.f40220N = -9223372036854775807L;
            return true;
        }
        if (this.f40220N == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f40220N) {
            return true;
        }
        this.f40220N = -9223372036854775807L;
        return false;
    }

    public final void h0(int i9, int i10) {
        C1737C c1737c = this.f40224R;
        if (c1737c != null && c1737c.f40178a == i9 && c1737c.f40179c == i10) {
            return;
        }
        C1737C c1737c2 = new C1737C(i9, i10);
        this.f40224R = c1737c2;
        this.f40234s.D(c1737c2);
    }

    public void k0(A0 a02) throws C0927w {
        U2.h hVar;
        InterfaceC1735A.a aVar;
        C0936z0 c0936z0;
        this.f40221O = true;
        C0936z0 c0936z02 = (C0936z0) AbstractC1684a.e(a02.f5499b);
        y0(a02.f5498a);
        C0936z0 c0936z03 = this.f40237v;
        this.f40237v = c0936z02;
        U2.d dVar = this.f40239x;
        if (dVar == null) {
            e0();
            aVar = this.f40234s;
            c0936z0 = this.f40237v;
            hVar = null;
        } else {
            hVar = this.f40213G != this.f40212F ? new U2.h(dVar.getName(), c0936z03, c0936z02, 0, 128) : S(dVar.getName(), c0936z03, c0936z02);
            if (hVar.f9710d == 0) {
                if (this.f40215I) {
                    this.f40214H = 1;
                } else {
                    r0();
                    e0();
                }
            }
            aVar = this.f40234s;
            c0936z0 = this.f40237v;
        }
        aVar.p(c0936z0, hVar);
    }

    public final void l0() {
        j0();
        T();
        if (getState() == 2) {
            w0();
        }
    }

    public final void m0() {
        U();
        T();
    }

    @Override // O2.AbstractC0892k, O2.C0932x1.b
    public void n(int i9, Object obj) {
        if (i9 == 1) {
            x0(obj);
        } else if (i9 == 7) {
            this.f40211E = (m) obj;
        } else {
            super.n(i9, obj);
        }
    }

    public final void n0() {
        j0();
        i0();
    }

    public void o0(long j9) {
        this.f40228V--;
    }

    public void p0(U2.g gVar) {
    }

    public final boolean q0(long j9, long j10) {
        if (this.f40219M == -9223372036854775807L) {
            this.f40219M = j9;
        }
        long j11 = this.f40241z.timeUs - j9;
        if (!a0()) {
            if (!b0(j11)) {
                return false;
            }
            C0(this.f40241z);
            return true;
        }
        long j12 = this.f40241z.timeUs - this.f40230X;
        C0936z0 c0936z0 = (C0936z0) this.f40235t.j(j12);
        if (c0936z0 != null) {
            this.f40238w = c0936z0;
        }
        long jElapsedRealtime = (SystemClock.elapsedRealtime() * 1000) - this.f40229W;
        boolean z9 = getState() == 2;
        if (this.f40218L ? this.f40216J : !z9 && !this.f40217K) {
            if (!z9 || !B0(j11, jElapsedRealtime)) {
                if (!z9 || j9 == this.f40219M || (z0(j11, j10) && d0(j9))) {
                    return false;
                }
                if (A0(j11, j10)) {
                    X(this.f40241z);
                    return true;
                }
                if (j11 < 30000) {
                    s0(this.f40241z, j12, this.f40238w);
                    return true;
                }
                return false;
            }
        }
        s0(this.f40241z, j12, this.f40238w);
        return true;
    }

    public void r0() {
        this.f40240y = null;
        this.f40241z = null;
        this.f40214H = 0;
        this.f40215I = false;
        this.f40228V = 0;
        U2.d dVar = this.f40239x;
        if (dVar != null) {
            this.f40231Y.f9686b++;
            dVar.release();
            this.f40234s.l(this.f40239x.getName());
            this.f40239x = null;
        }
        u0(null);
    }

    public void s0(VideoDecoderOutputBuffer videoDecoderOutputBuffer, long j9, C0936z0 c0936z0) {
        m mVar = this.f40211E;
        if (mVar != null) {
            mVar.a(j9, System.nanoTime(), c0936z0, null);
        }
        this.f40229W = k0.P0(SystemClock.elapsedRealtime() * 1000);
        int i9 = videoDecoderOutputBuffer.mode;
        boolean z9 = i9 == 1 && this.f40209C != null;
        boolean z10 = i9 == 0 && this.f40210D != null;
        if (!z10 && !z9) {
            X(videoDecoderOutputBuffer);
            return;
        }
        h0(videoDecoderOutputBuffer.width, videoDecoderOutputBuffer.height);
        if (z10) {
            this.f40210D.setOutputBuffer(videoDecoderOutputBuffer);
        } else {
            t0(videoDecoderOutputBuffer, this.f40209C);
        }
        this.f40227U = 0;
        this.f40231Y.f9689e++;
        g0();
    }

    public abstract void t0(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface);

    @Override // O2.C1
    public void u(long j9, long j10) throws C0927w {
        if (this.f40223Q) {
            return;
        }
        if (this.f40237v == null) {
            A0 a0B = B();
            this.f40236u.clear();
            int iP = P(a0B, this.f40236u, 2);
            if (iP != -5) {
                if (iP == -4) {
                    AbstractC1684a.g(this.f40236u.isEndOfStream());
                    this.f40222P = true;
                    this.f40223Q = true;
                    return;
                }
                return;
            }
            k0(a0B);
        }
        e0();
        if (this.f40239x != null) {
            try {
                a0.a("drainAndFeed");
                while (W(j9, j10)) {
                }
                while (Y()) {
                }
                a0.c();
                this.f40231Y.c();
            } catch (U2.f e9) {
                AbstractC1681B.e("DecoderVideoRenderer", "Video codec error", e9);
                this.f40234s.C(e9);
                throw y(e9, this.f40237v, 4003);
            }
        }
    }

    public abstract void v0(int i9);

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x0(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof android.view.Surface
            r1 = 0
            if (r0 == 0) goto L10
            r0 = r3
            android.view.Surface r0 = (android.view.Surface) r0
            r2.f40209C = r0
            r2.f40210D = r1
            r0 = 1
        Ld:
            r2.f40207A = r0
            goto L23
        L10:
            boolean r0 = r3 instanceof e4.l
            r2.f40209C = r1
            if (r0 == 0) goto L1d
            r0 = r3
            e4.l r0 = (e4.l) r0
            r2.f40210D = r0
            r0 = 0
            goto Ld
        L1d:
            r2.f40210D = r1
            r3 = -1
            r2.f40207A = r3
            r3 = r1
        L23:
            java.lang.Object r0 = r2.f40208B
            if (r0 == r3) goto L3c
            r2.f40208B = r3
            if (r3 == 0) goto L38
            U2.d r3 = r2.f40239x
            if (r3 == 0) goto L34
            int r3 = r2.f40207A
            r2.v0(r3)
        L34:
            r2.l0()
            goto L41
        L38:
            r2.m0()
            goto L41
        L3c:
            if (r3 == 0) goto L41
            r2.n0()
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.AbstractC1741d.x0(java.lang.Object):void");
    }

    public boolean z0(long j9, long j10) {
        return c0(j9);
    }
}
