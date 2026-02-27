package Q2;

import O2.A0;
import O2.C0917s1;
import O2.C0927w;
import O2.C0936z0;
import O2.C1;
import O2.D1;
import Q2.B;
import Q2.InterfaceC1039z;
import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.ads.interactivemedia.v3.internal.u1;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.InterfaceC1683D;
import java.nio.ByteBuffer;
import java.util.List;
import org.apache.commons.logging.LogFactory;
import p3.AbstractC2392B;
import p3.InterfaceC2407m;
import s5.AbstractC2743y;
import tv.danmaku.ijk.media.player.misc.IMediaFormat;

/* JADX INFO: loaded from: classes3.dex */
public class a0 extends p3.u implements InterfaceC1683D {

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public final Context f7734L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public final InterfaceC1039z.a f7735M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public final B f7736N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public int f7737O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public boolean f7738P0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public C0936z0 f7739Q0;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public C0936z0 f7740R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public long f7741S0;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public boolean f7742T0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public boolean f7743U0;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public boolean f7744V0;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public boolean f7745W0;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public C1.a f7746X0;

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
            a0.this.f7735M0.C(z9);
        }

        @Override // Q2.B.c
        public void b(Exception exc) {
            AbstractC1681B.e("MediaCodecAudioRenderer", "Audio sink error", exc);
            a0.this.f7735M0.l(exc);
        }

        @Override // Q2.B.c
        public void c(long j9) {
            a0.this.f7735M0.B(j9);
        }

        @Override // Q2.B.c
        public void d() {
            if (a0.this.f7746X0 != null) {
                a0.this.f7746X0.a();
            }
        }

        @Override // Q2.B.c
        public void e(int i9, long j9, long j10) {
            a0.this.f7735M0.D(i9, j9, j10);
        }

        @Override // Q2.B.c
        public void f() {
            a0.this.K();
        }

        @Override // Q2.B.c
        public void g() {
            a0.this.C1();
        }

        @Override // Q2.B.c
        public void h() {
            if (a0.this.f7746X0 != null) {
                a0.this.f7746X0.b();
            }
        }
    }

    public a0(Context context, InterfaceC2407m.b bVar, p3.w wVar, boolean z9, Handler handler, InterfaceC1039z interfaceC1039z, B b9) {
        super(1, bVar, wVar, z9, 44100.0f);
        this.f7734L0 = context.getApplicationContext();
        this.f7736N0 = b9;
        this.f7735M0 = new InterfaceC1039z.a(handler, interfaceC1039z);
        b9.k(new c());
    }

    public static List A1(p3.w wVar, C0936z0 c0936z0, boolean z9, B b9) {
        p3.t tVarX;
        return c0936z0.f6467m == null ? AbstractC2743y.z() : (!b9.a(c0936z0) || (tVarX = AbstractC2392B.x()) == null) ? AbstractC2392B.v(wVar, c0936z0, z9, false) : AbstractC2743y.A(tVarX);
    }

    private void D1() {
        long jP = this.f7736N0.p(d());
        if (jP != Long.MIN_VALUE) {
            if (!this.f7743U0) {
                jP = Math.max(this.f7741S0, jP);
            }
            this.f7741S0 = jP;
            this.f7743U0 = false;
        }
    }

    public static boolean w1(String str) {
        if (d4.k0.f39777a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(d4.k0.f39779c)) {
            String str2 = d4.k0.f39778b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    public static boolean x1() {
        if (d4.k0.f39777a == 23) {
            String str = d4.k0.f39780d;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    private int y1(p3.t tVar, C0936z0 c0936z0) {
        int i9;
        if (!"OMX.google.raw.decoder".equals(tVar.f46299a) || (i9 = d4.k0.f39777a) >= 24 || (i9 == 23 && d4.k0.I0(this.f7734L0))) {
            return c0936z0.f6468n;
        }
        return -1;
    }

    public MediaFormat B1(C0936z0 c0936z0, String str, int i9, float f9) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(IMediaFormat.KEY_MIME, str);
        mediaFormat.setInteger("channel-count", c0936z0.f6480z);
        mediaFormat.setInteger("sample-rate", c0936z0.f6447A);
        d4.E.e(mediaFormat, c0936z0.f6469o);
        d4.E.d(mediaFormat, "max-input-size", i9);
        int i10 = d4.k0.f39777a;
        if (i10 >= 23) {
            mediaFormat.setInteger(LogFactory.PRIORITY_KEY, 0);
            if (f9 != -1.0f && !x1()) {
                mediaFormat.setFloat("operating-rate", f9);
            }
        }
        if (i10 <= 28 && "audio/ac4".equals(c0936z0.f6467m)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i10 >= 24 && this.f7736N0.j(d4.k0.i0(4, c0936z0.f6480z, c0936z0.f6447A)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i10 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        return mediaFormat;
    }

    public void C1() {
        this.f7743U0 = true;
    }

    @Override // p3.u, O2.AbstractC0892k
    public void G() {
        this.f7744V0 = true;
        this.f7739Q0 = null;
        try {
            this.f7736N0.flush();
            try {
                super.G();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.G();
                throw th;
            } finally {
            }
        }
    }

    @Override // p3.u, O2.AbstractC0892k
    public void H(boolean z9, boolean z10) {
        super.H(z9, z10);
        this.f7735M0.p(this.f46324G0);
        if (A().f5516a) {
            this.f7736N0.s();
        } else {
            this.f7736N0.h();
        }
        this.f7736N0.i(D());
    }

    @Override // p3.u, O2.AbstractC0892k
    public void I(long j9, boolean z9) throws C0927w {
        super.I(j9, z9);
        if (this.f7745W0) {
            this.f7736N0.n();
        } else {
            this.f7736N0.flush();
        }
        this.f7741S0 = j9;
        this.f7742T0 = true;
        this.f7743U0 = true;
    }

    @Override // O2.AbstractC0892k
    public void J() {
        this.f7736N0.release();
    }

    @Override // p3.u
    public void K0(Exception exc) {
        AbstractC1681B.e("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f7735M0.k(exc);
    }

    @Override // p3.u, O2.AbstractC0892k
    public void L() {
        try {
            super.L();
        } finally {
            if (this.f7744V0) {
                this.f7744V0 = false;
                this.f7736N0.reset();
            }
        }
    }

    @Override // p3.u
    public void L0(String str, InterfaceC2407m.a aVar, long j9, long j10) {
        this.f7735M0.m(str, j9, j10);
    }

    @Override // p3.u, O2.AbstractC0892k
    public void M() {
        super.M();
        this.f7736N0.play();
    }

    @Override // p3.u
    public void M0(String str) {
        this.f7735M0.n(str);
    }

    @Override // p3.u, O2.AbstractC0892k
    public void N() {
        D1();
        this.f7736N0.pause();
        super.N();
    }

    @Override // p3.u
    public U2.h N0(A0 a02) throws C0927w {
        this.f7739Q0 = (C0936z0) AbstractC1684a.e(a02.f5499b);
        U2.h hVarN0 = super.N0(a02);
        this.f7735M0.q(this.f7739Q0, hVarN0);
        return hVarN0;
    }

    @Override // p3.u
    public void O0(C0936z0 c0936z0, MediaFormat mediaFormat) throws C0927w {
        int i9;
        C0936z0 c0936z02 = this.f7740R0;
        int[] iArr = null;
        if (c0936z02 != null) {
            c0936z0 = c0936z02;
        } else if (q0() != null) {
            C0936z0 c0936z0G = new C0936z0.b().g0("audio/raw").a0("audio/raw".equals(c0936z0.f6467m) ? c0936z0.f6448B : (d4.k0.f39777a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? d4.k0.h0(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding")).P(c0936z0.f6449C).Q(c0936z0.f6450D).J(mediaFormat.getInteger("channel-count")).h0(mediaFormat.getInteger("sample-rate")).G();
            if (this.f7738P0 && c0936z0G.f6480z == 6 && (i9 = c0936z0.f6480z) < 6) {
                iArr = new int[i9];
                for (int i10 = 0; i10 < c0936z0.f6480z; i10++) {
                    iArr[i10] = i10;
                }
            }
            c0936z0 = c0936z0G;
        }
        try {
            this.f7736N0.u(c0936z0, 0, iArr);
        } catch (B.a e9) {
            throw y(e9, e9.f7523a, 5001);
        }
    }

    @Override // p3.u
    public void P0(long j9) {
        this.f7736N0.q(j9);
    }

    @Override // p3.u
    public void R0() {
        super.R0();
        this.f7736N0.r();
    }

    @Override // p3.u
    public void S0(U2.g gVar) {
        if (!this.f7742T0 || gVar.isDecodeOnly()) {
            return;
        }
        if (Math.abs(gVar.f9701f - this.f7741S0) > 500000) {
            this.f7741S0 = gVar.f9701f;
        }
        this.f7742T0 = false;
    }

    @Override // p3.u
    public U2.h U(p3.t tVar, C0936z0 c0936z0, C0936z0 c0936z02) {
        U2.h hVarF = tVar.f(c0936z0, c0936z02);
        int i9 = hVarF.f9711e;
        if (D0(c0936z02)) {
            i9 |= 32768;
        }
        if (y1(tVar, c0936z02) > this.f7737O0) {
            i9 |= 64;
        }
        int i10 = i9;
        return new U2.h(tVar.f46299a, c0936z0, c0936z02, i10 != 0 ? 0 : hVarF.f9710d, i10);
    }

    @Override // p3.u
    public boolean V0(long j9, long j10, InterfaceC2407m interfaceC2407m, ByteBuffer byteBuffer, int i9, int i10, int i11, long j11, boolean z9, boolean z10, C0936z0 c0936z0) throws C0927w {
        AbstractC1684a.e(byteBuffer);
        if (this.f7740R0 != null && (i10 & 2) != 0) {
            ((InterfaceC2407m) AbstractC1684a.e(interfaceC2407m)).m(i9, false);
            return true;
        }
        if (z9) {
            if (interfaceC2407m != null) {
                interfaceC2407m.m(i9, false);
            }
            this.f46324G0.f9690f += i11;
            this.f7736N0.r();
            return true;
        }
        try {
            if (!this.f7736N0.l(byteBuffer, j11, i11)) {
                return false;
            }
            if (interfaceC2407m != null) {
                interfaceC2407m.m(i9, false);
            }
            this.f46324G0.f9689e += i11;
            return true;
        } catch (B.b e9) {
            throw z(e9, this.f7739Q0, e9.f7525c, 5001);
        } catch (B.e e10) {
            throw z(e10, c0936z0, e10.f7530c, 5002);
        }
    }

    @Override // p3.u
    public void a1() throws C0927w {
        try {
            this.f7736N0.o();
        } catch (B.e e9) {
            throw z(e9, e9.f7531d, e9.f7530c, 5002);
        }
    }

    @Override // d4.InterfaceC1683D
    public void b(C0917s1 c0917s1) {
        this.f7736N0.b(c0917s1);
    }

    @Override // d4.InterfaceC1683D
    public C0917s1 c() {
        return this.f7736N0.c();
    }

    @Override // p3.u, O2.C1
    public boolean d() {
        return super.d() && this.f7736N0.d();
    }

    @Override // p3.u, O2.C1
    public boolean e() {
        return this.f7736N0.f() || super.e();
    }

    @Override // O2.C1, O2.E1
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // O2.AbstractC0892k, O2.C0932x1.b
    public void n(int i9, Object obj) {
        if (i9 == 2) {
            this.f7736N0.setVolume(((Float) obj).floatValue());
        }
        if (i9 == 3) {
            this.f7736N0.t((C1019e) obj);
            return;
        }
        if (i9 == 6) {
            this.f7736N0.m((F) obj);
            return;
        }
        switch (i9) {
            case 9:
                this.f7736N0.v(((Boolean) obj).booleanValue());
                break;
            case 10:
                this.f7736N0.g(((Integer) obj).intValue());
                break;
            case 11:
                this.f7746X0 = (C1.a) obj;
                break;
            case 12:
                if (d4.k0.f39777a >= 23) {
                    b.a(this.f7736N0, obj);
                }
                break;
            default:
                super.n(i9, obj);
                break;
        }
    }

    @Override // p3.u
    public boolean n1(C0936z0 c0936z0) {
        return this.f7736N0.a(c0936z0);
    }

    @Override // p3.u
    public int o1(p3.w wVar, C0936z0 c0936z0) {
        boolean z9;
        if (!d4.F.o(c0936z0.f6467m)) {
            return D1.a(0);
        }
        int i9 = d4.k0.f39777a >= 21 ? 32 : 0;
        boolean z10 = true;
        boolean z11 = c0936z0.f6454H != 0;
        boolean zP1 = p3.u.p1(c0936z0);
        int i10 = 8;
        if (zP1 && this.f7736N0.a(c0936z0) && (!z11 || AbstractC2392B.x() != null)) {
            return D1.b(4, 8, i9);
        }
        if ((!"audio/raw".equals(c0936z0.f6467m) || this.f7736N0.a(c0936z0)) && this.f7736N0.a(d4.k0.i0(2, c0936z0.f6480z, c0936z0.f6447A))) {
            List listA1 = A1(wVar, c0936z0, false, this.f7736N0);
            if (listA1.isEmpty()) {
                return D1.a(1);
            }
            if (!zP1) {
                return D1.a(2);
            }
            p3.t tVar = (p3.t) listA1.get(0);
            boolean zO = tVar.o(c0936z0);
            if (zO) {
                z10 = zO;
                z9 = true;
            } else {
                for (int i11 = 1; i11 < listA1.size(); i11++) {
                    p3.t tVar2 = (p3.t) listA1.get(i11);
                    if (tVar2.o(c0936z0)) {
                        tVar = tVar2;
                        z9 = false;
                        break;
                    }
                }
                z10 = zO;
                z9 = true;
            }
            int i12 = z10 ? 4 : 3;
            if (z10 && tVar.r(c0936z0)) {
                i10 = 16;
            }
            return D1.c(i12, i10, i9, tVar.f46306h ? 64 : 0, z9 ? 128 : 0);
        }
        return D1.a(1);
    }

    @Override // d4.InterfaceC1683D
    public long r() {
        if (getState() == 2) {
            D1();
        }
        return this.f7741S0;
    }

    @Override // p3.u
    public float t0(float f9, C0936z0 c0936z0, C0936z0[] c0936z0Arr) {
        int iMax = -1;
        for (C0936z0 c0936z02 : c0936z0Arr) {
            int i9 = c0936z02.f6447A;
            if (i9 != -1) {
                iMax = Math.max(iMax, i9);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return f9 * iMax;
    }

    @Override // p3.u
    public List v0(p3.w wVar, C0936z0 c0936z0, boolean z9) {
        return AbstractC2392B.w(A1(wVar, c0936z0, z9, this.f7736N0), c0936z0);
    }

    @Override // p3.u
    public InterfaceC2407m.a w0(p3.t tVar, C0936z0 c0936z0, MediaCrypto mediaCrypto, float f9) {
        this.f7737O0 = z1(tVar, c0936z0, E());
        this.f7738P0 = w1(tVar.f46299a);
        MediaFormat mediaFormatB1 = B1(c0936z0, tVar.f46301c, this.f7737O0, f9);
        this.f7740R0 = (!"audio/raw".equals(tVar.f46300b) || "audio/raw".equals(c0936z0.f6467m)) ? null : c0936z0;
        return InterfaceC2407m.a.a(tVar, mediaFormatB1, c0936z0, mediaCrypto);
    }

    @Override // O2.AbstractC0892k, O2.C1
    public InterfaceC1683D x() {
        return this;
    }

    public int z1(p3.t tVar, C0936z0 c0936z0, C0936z0[] c0936z0Arr) {
        int iY1 = y1(tVar, c0936z0);
        if (c0936z0Arr.length == 1) {
            return iY1;
        }
        for (C0936z0 c0936z02 : c0936z0Arr) {
            if (tVar.f(c0936z0, c0936z02).f9710d != 0) {
                iY1 = Math.max(iY1, y1(tVar, c0936z02));
            }
        }
        return iY1;
    }
}
