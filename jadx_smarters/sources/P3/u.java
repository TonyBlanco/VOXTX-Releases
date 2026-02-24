package p3;

import O2.A0;
import O2.AbstractC0892k;
import O2.AbstractC0904o;
import O2.C0927w;
import O2.C0936z0;
import P2.v0;
import Q2.c0;
import U2.g;
import V2.AbstractC1057n;
import V2.H;
import V2.InterfaceC1058o;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.SystemClock;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.G;
import d4.Y;
import d4.a0;
import d4.k0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import p3.AbstractC2392B;
import p3.InterfaceC2407m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u extends AbstractC0892k {

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public static final byte[] f46310K0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ArrayDeque f46311A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public long f46312A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final c0 f46313B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public boolean f46314B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public C0936z0 f46315C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public boolean f46316C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public C0936z0 f46317D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public boolean f46318D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public InterfaceC1058o f46319E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public boolean f46320E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public InterfaceC1058o f46321F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public C0927w f46322F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public MediaCrypto f46323G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public U2.e f46324G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f46325H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public c f46326H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public long f46327I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public long f46328I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public float f46329J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public boolean f46330J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public float f46331K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public InterfaceC2407m f46332L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public C0936z0 f46333M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public MediaFormat f46334N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f46335O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public float f46336P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public ArrayDeque f46337Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public b f46338R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public t f46339S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f46340T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f46341U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f46342V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f46343W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f46344X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f46345Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f46346Z;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f46347e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f46348f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f46349g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f46350h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public C2404j f46351i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public long f46352j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f46353k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f46354l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public ByteBuffer f46355m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f46356n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f46357o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f46358p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC2407m.b f46359q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f46360q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w f46361r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f46362r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f46363s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f46364s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f46365t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f46366t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final U2.g f46367u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f46368u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final U2.g f46369v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f46370v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final U2.g f46371w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f46372w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C2403i f46373x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f46374x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f46375y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f46376y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final MediaCodec.BufferInfo f46377z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public long f46378z0;

    public static final class a {
        public static void a(InterfaceC2407m.a aVar, v0 v0Var) {
            LogSessionId logSessionIdA = v0Var.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            aVar.f46292b.setString("log-session-id", logSessionIdA.getStringId());
        }
    }

    public static class b extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46379a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f46380c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final t f46381d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f46382e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final b f46383f;

        public b(C0936z0 c0936z0, Throwable th, boolean z9, int i9) {
            this("Decoder init failed: [" + i9 + "], " + c0936z0, th, c0936z0.f6467m, z9, null, b(i9), null);
        }

        public b(C0936z0 c0936z0, Throwable th, boolean z9, t tVar) {
            this("Decoder init failed: " + tVar.f46299a + ", " + c0936z0, th, c0936z0.f6467m, z9, tVar, k0.f39777a >= 21 ? d(th) : null, null);
        }

        public b(String str, Throwable th, String str2, boolean z9, t tVar, String str3, b bVar) {
            super(str, th);
            this.f46379a = str2;
            this.f46380c = z9;
            this.f46381d = tVar;
            this.f46382e = str3;
            this.f46383f = bVar;
        }

        public static String b(int i9) {
            return "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + (i9 < 0 ? "neg_" : "") + Math.abs(i9);
        }

        public static String d(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        public final b c(b bVar) {
            return new b(getMessage(), getCause(), this.f46379a, this.f46380c, this.f46381d, this.f46382e, bVar);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f46384e = new c(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f46385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f46386b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f46387c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Y f46388d = new Y();

        public c(long j9, long j10, long j11) {
            this.f46385a = j9;
            this.f46386b = j10;
            this.f46387c = j11;
        }
    }

    public u(int i9, InterfaceC2407m.b bVar, w wVar, boolean z9, float f9) {
        super(i9);
        this.f46359q = bVar;
        this.f46361r = (w) AbstractC1684a.e(wVar);
        this.f46363s = z9;
        this.f46365t = f9;
        this.f46367u = U2.g.l();
        this.f46369v = new U2.g(0);
        this.f46371w = new U2.g(2);
        C2403i c2403i = new C2403i();
        this.f46373x = c2403i;
        this.f46375y = new ArrayList();
        this.f46377z = new MediaCodec.BufferInfo();
        this.f46329J = 1.0f;
        this.f46331K = 1.0f;
        this.f46327I = -9223372036854775807L;
        this.f46311A = new ArrayDeque();
        g1(c.f46384e);
        c2403i.e(0);
        c2403i.f9699d.order(ByteOrder.nativeOrder());
        this.f46313B = new c0();
        this.f46336P = -1.0f;
        this.f46340T = 0;
        this.f46366t0 = 0;
        this.f46353k0 = -1;
        this.f46354l0 = -1;
        this.f46352j0 = -9223372036854775807L;
        this.f46378z0 = -9223372036854775807L;
        this.f46312A0 = -9223372036854775807L;
        this.f46328I0 = -9223372036854775807L;
        this.f46368u0 = 0;
        this.f46370v0 = 0;
    }

    public static boolean F0(IllegalStateException illegalStateException) {
        if (k0.f39777a >= 21 && G0(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    public static boolean G0(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    public static boolean H0(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    private void U0() throws C0927w {
        int i9 = this.f46370v0;
        if (i9 == 1) {
            m0();
            return;
        }
        if (i9 == 2) {
            m0();
            r1();
        } else if (i9 == 3) {
            Y0();
        } else {
            this.f46316C0 = true;
            a1();
        }
    }

    public static boolean W(String str, C0936z0 c0936z0) {
        return k0.f39777a < 21 && c0936z0.f6469o.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    public static boolean X(String str) {
        if (k0.f39777a < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(k0.f39779c)) {
            String str2 = k0.f39778b;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    public static boolean Y(String str) {
        int i9 = k0.f39777a;
        if (i9 > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (i9 <= 19) {
                String str2 = k0.f39778b;
                if (("hb2000".equals(str2) || "stvm8".equals(str2)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean Z(String str) {
        return k0.f39777a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    public static boolean a0(t tVar) {
        String str = tVar.f46299a;
        int i9 = k0.f39777a;
        return (i9 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i9 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i9 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) || ("Amazon".equals(k0.f39779c) && "AFTS".equals(k0.f39780d) && tVar.f46305g));
    }

    public static boolean b0(String str) {
        int i9 = k0.f39777a;
        return i9 < 18 || (i9 == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i9 == 19 && k0.f39780d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    public static boolean c0(String str, C0936z0 c0936z0) {
        return k0.f39777a <= 18 && c0936z0.f6480z == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    public static boolean d0(String str) {
        return k0.f39777a == 29 && "c2.android.aac.decoder".equals(str);
    }

    private void j1(InterfaceC1058o interfaceC1058o) {
        AbstractC1057n.a(this.f46321F, interfaceC1058o);
        this.f46321F = interfaceC1058o;
    }

    private boolean l0() throws C0927w {
        int i9;
        if (this.f46332L == null || (i9 = this.f46368u0) == 2 || this.f46314B0) {
            return false;
        }
        if (i9 == 0 && m1()) {
            h0();
        }
        if (this.f46353k0 < 0) {
            int iK = this.f46332L.k();
            this.f46353k0 = iK;
            if (iK < 0) {
                return false;
            }
            this.f46369v.f9699d = this.f46332L.e(iK);
            this.f46369v.clear();
        }
        if (this.f46368u0 == 1) {
            if (!this.f46350h0) {
                this.f46374x0 = true;
                this.f46332L.g(this.f46353k0, 0, 0, 0L, 4);
                d1();
            }
            this.f46368u0 = 2;
            return false;
        }
        if (this.f46348f0) {
            this.f46348f0 = false;
            ByteBuffer byteBuffer = this.f46369v.f9699d;
            byte[] bArr = f46310K0;
            byteBuffer.put(bArr);
            this.f46332L.g(this.f46353k0, 0, bArr.length, 0L, 0);
            d1();
            this.f46372w0 = true;
            return true;
        }
        if (this.f46366t0 == 1) {
            for (int i10 = 0; i10 < this.f46333M.f6469o.size(); i10++) {
                this.f46369v.f9699d.put((byte[]) this.f46333M.f6469o.get(i10));
            }
            this.f46366t0 = 2;
        }
        int iPosition = this.f46369v.f9699d.position();
        A0 a0B = B();
        try {
            int iP = P(a0B, this.f46369v, 0);
            if (h() || this.f46369v.isLastSample()) {
                this.f46312A0 = this.f46378z0;
            }
            if (iP == -3) {
                return false;
            }
            if (iP == -5) {
                if (this.f46366t0 == 2) {
                    this.f46369v.clear();
                    this.f46366t0 = 1;
                }
                N0(a0B);
                return true;
            }
            if (this.f46369v.isEndOfStream()) {
                if (this.f46366t0 == 2) {
                    this.f46369v.clear();
                    this.f46366t0 = 1;
                }
                this.f46314B0 = true;
                if (!this.f46372w0) {
                    U0();
                    return false;
                }
                try {
                    if (!this.f46350h0) {
                        this.f46374x0 = true;
                        this.f46332L.g(this.f46353k0, 0, 0, 0L, 4);
                        d1();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e9) {
                    throw y(e9, this.f46315C, k0.Z(e9.getErrorCode()));
                }
            }
            if (!this.f46372w0 && !this.f46369v.isKeyFrame()) {
                this.f46369v.clear();
                if (this.f46366t0 == 2) {
                    this.f46366t0 = 1;
                }
                return true;
            }
            boolean zJ = this.f46369v.j();
            if (zJ) {
                this.f46369v.f9698c.b(iPosition);
            }
            if (this.f46341U && !zJ) {
                G.b(this.f46369v.f9699d);
                if (this.f46369v.f9699d.position() == 0) {
                    return true;
                }
                this.f46341U = false;
            }
            U2.g gVar = this.f46369v;
            long jD = gVar.f9701f;
            C2404j c2404j = this.f46351i0;
            if (c2404j != null) {
                jD = c2404j.d(this.f46315C, gVar);
                this.f46378z0 = Math.max(this.f46378z0, this.f46351i0.b(this.f46315C));
            }
            long j9 = jD;
            if (this.f46369v.isDecodeOnly()) {
                this.f46375y.add(Long.valueOf(j9));
            }
            if (this.f46318D0) {
                (!this.f46311A.isEmpty() ? (c) this.f46311A.peekLast() : this.f46326H0).f46388d.a(j9, this.f46315C);
                this.f46318D0 = false;
            }
            this.f46378z0 = Math.max(this.f46378z0, j9);
            this.f46369v.i();
            if (this.f46369v.hasSupplementalData()) {
                z0(this.f46369v);
            }
            S0(this.f46369v);
            try {
                if (zJ) {
                    this.f46332L.c(this.f46353k0, 0, this.f46369v.f9698c, j9, 0);
                } else {
                    this.f46332L.g(this.f46353k0, 0, this.f46369v.f9699d.limit(), j9, 0);
                }
                d1();
                this.f46372w0 = true;
                this.f46366t0 = 0;
                this.f46324G0.f9687c++;
                return true;
            } catch (MediaCodec.CryptoException e10) {
                throw y(e10, this.f46315C, k0.Z(e10.getErrorCode()));
            }
        } catch (g.a e11) {
            K0(e11);
            X0(0);
            m0();
            return true;
        }
    }

    public static boolean p1(C0936z0 c0936z0) {
        int i9 = c0936z0.f6454H;
        return i9 == 0 || i9 == 2;
    }

    public final boolean A0() {
        return this.f46354l0 >= 0;
    }

    public final void B0(C0936z0 c0936z0) {
        f0();
        String str = c0936z0.f6467m;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.f46373x.u(32);
        } else {
            this.f46373x.u(1);
        }
        this.f46358p0 = true;
    }

    public final void C0(t tVar, MediaCrypto mediaCrypto) {
        String str = tVar.f46299a;
        int i9 = k0.f39777a;
        float fT0 = i9 < 23 ? -1.0f : t0(this.f46331K, this.f46315C, E());
        float f9 = fT0 > this.f46365t ? fT0 : -1.0f;
        T0(this.f46315C);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        InterfaceC2407m.a aVarW0 = w0(tVar, this.f46315C, mediaCrypto, f9);
        if (i9 >= 31) {
            a.a(aVarW0, D());
        }
        try {
            a0.a("createCodec:" + str);
            this.f46332L = this.f46359q.a(aVarW0);
            a0.c();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!tVar.o(this.f46315C)) {
                AbstractC1681B.j("MediaCodecRenderer", k0.D("Format exceeds selected codec's capabilities [%s, %s]", C0936z0.k(this.f46315C), str));
            }
            this.f46339S = tVar;
            this.f46336P = f9;
            this.f46333M = this.f46315C;
            this.f46340T = V(str);
            this.f46341U = W(str, this.f46333M);
            this.f46342V = b0(str);
            this.f46343W = d0(str);
            this.f46344X = Y(str);
            this.f46345Y = Z(str);
            this.f46346Z = X(str);
            this.f46347e0 = c0(str, this.f46333M);
            this.f46350h0 = a0(tVar) || s0();
            if (this.f46332L.h()) {
                this.f46364s0 = true;
                this.f46366t0 = 1;
                this.f46348f0 = this.f46340T != 0;
            }
            if ("c2.android.mp3.decoder".equals(tVar.f46299a)) {
                this.f46351i0 = new C2404j();
            }
            if (getState() == 2) {
                this.f46352j0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.f46324G0.f9685a++;
            L0(str, aVarW0, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
        } catch (Throwable th) {
            a0.c();
            throw th;
        }
    }

    public final boolean D0(C0936z0 c0936z0) {
        return this.f46321F == null && n1(c0936z0);
    }

    public final boolean E0(long j9) {
        int size = this.f46375y.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (((Long) this.f46375y.get(i9)).longValue() == j9) {
                this.f46375y.remove(i9);
                return true;
            }
        }
        return false;
    }

    @Override // O2.AbstractC0892k
    public void G() {
        this.f46315C = null;
        g1(c.f46384e);
        this.f46311A.clear();
        o0();
    }

    @Override // O2.AbstractC0892k
    public void H(boolean z9, boolean z10) {
        this.f46324G0 = new U2.e();
    }

    @Override // O2.AbstractC0892k
    public void I(long j9, boolean z9) throws C0927w {
        this.f46314B0 = false;
        this.f46316C0 = false;
        this.f46320E0 = false;
        if (this.f46358p0) {
            this.f46373x.clear();
            this.f46371w.clear();
            this.f46360q0 = false;
        } else {
            n0();
        }
        if (this.f46326H0.f46388d.l() > 0) {
            this.f46318D0 = true;
        }
        this.f46326H0.f46388d.c();
        this.f46311A.clear();
    }

    public final void I0() throws C0927w {
        C0936z0 c0936z0;
        if (this.f46332L != null || this.f46358p0 || (c0936z0 = this.f46315C) == null) {
            return;
        }
        if (D0(c0936z0)) {
            B0(this.f46315C);
            return;
        }
        f1(this.f46321F);
        String str = this.f46315C.f6467m;
        InterfaceC1058o interfaceC1058o = this.f46319E;
        if (interfaceC1058o != null) {
            CryptoConfig cryptoConfigD = interfaceC1058o.d();
            if (this.f46323G == null) {
                if (cryptoConfigD == null) {
                    if (this.f46319E.getError() == null) {
                        return;
                    }
                } else if (cryptoConfigD instanceof H) {
                    H h9 = (H) cryptoConfigD;
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(h9.f9882a, h9.f9883b);
                        this.f46323G = mediaCrypto;
                        this.f46325H = !h9.f9884c && mediaCrypto.requiresSecureDecoderComponent(str);
                    } catch (MediaCryptoException e9) {
                        throw y(e9, this.f46315C, 6006);
                    }
                }
            }
            if (H.f9881d && (cryptoConfigD instanceof H)) {
                int state = this.f46319E.getState();
                if (state == 1) {
                    InterfaceC1058o.a aVar = (InterfaceC1058o.a) AbstractC1684a.e(this.f46319E.getError());
                    throw y(aVar, this.f46315C, aVar.f10015a);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            J0(this.f46323G, this.f46325H);
        } catch (b e10) {
            throw y(e10, this.f46315C, 4001);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x004a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J0(android.media.MediaCrypto r8, boolean r9) throws p3.u.b {
        /*
            r7 = this;
            java.util.ArrayDeque r0 = r7.f46337Q
            r1 = 0
            if (r0 != 0) goto L3a
            java.util.List r0 = r7.p0(r9)     // Catch: p3.AbstractC2392B.c -> L18
            java.util.ArrayDeque r2 = new java.util.ArrayDeque     // Catch: p3.AbstractC2392B.c -> L18
            r2.<init>()     // Catch: p3.AbstractC2392B.c -> L18
            r7.f46337Q = r2     // Catch: p3.AbstractC2392B.c -> L18
            boolean r3 = r7.f46363s     // Catch: p3.AbstractC2392B.c -> L18
            if (r3 == 0) goto L1a
            r2.addAll(r0)     // Catch: p3.AbstractC2392B.c -> L18
            goto L2c
        L18:
            r8 = move-exception
            goto L2f
        L1a:
            boolean r2 = r0.isEmpty()     // Catch: p3.AbstractC2392B.c -> L18
            if (r2 != 0) goto L2c
            java.util.ArrayDeque r2 = r7.f46337Q     // Catch: p3.AbstractC2392B.c -> L18
            r3 = 0
            java.lang.Object r0 = r0.get(r3)     // Catch: p3.AbstractC2392B.c -> L18
            p3.t r0 = (p3.t) r0     // Catch: p3.AbstractC2392B.c -> L18
            r2.add(r0)     // Catch: p3.AbstractC2392B.c -> L18
        L2c:
            r7.f46338R = r1     // Catch: p3.AbstractC2392B.c -> L18
            goto L3a
        L2f:
            p3.u$b r0 = new p3.u$b
            O2.z0 r1 = r7.f46315C
            r2 = -49998(0xffffffffffff3cb2, float:NaN)
            r0.<init>(r1, r8, r9, r2)
            throw r0
        L3a:
            java.util.ArrayDeque r0 = r7.f46337Q
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lb6
            java.util.ArrayDeque r0 = r7.f46337Q
            java.lang.Object r0 = r0.peekFirst()
            p3.t r0 = (p3.t) r0
        L4a:
            p3.m r2 = r7.f46332L
            if (r2 != 0) goto Lb3
            java.util.ArrayDeque r2 = r7.f46337Q
            java.lang.Object r2 = r2.peekFirst()
            p3.t r2 = (p3.t) r2
            boolean r3 = r7.l1(r2)
            if (r3 != 0) goto L5d
            return
        L5d:
            r7.C0(r2, r8)     // Catch: java.lang.Exception -> L61
            goto L4a
        L61:
            r3 = move-exception
            java.lang.String r4 = "MediaCodecRenderer"
            if (r2 != r0) goto L76
            java.lang.String r3 = "Preferred decoder instantiation failed. Sleeping for 50ms then retrying."
            d4.AbstractC1681B.j(r4, r3)     // Catch: java.lang.Exception -> L74
            r5 = 50
            java.lang.Thread.sleep(r5)     // Catch: java.lang.Exception -> L74
            r7.C0(r2, r8)     // Catch: java.lang.Exception -> L74
            goto L4a
        L74:
            r3 = move-exception
            goto L77
        L76:
            throw r3     // Catch: java.lang.Exception -> L74
        L77:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to initialize decoder: "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            d4.AbstractC1681B.k(r4, r5, r3)
            java.util.ArrayDeque r4 = r7.f46337Q
            r4.removeFirst()
            p3.u$b r4 = new p3.u$b
            O2.z0 r5 = r7.f46315C
            r4.<init>(r5, r3, r9, r2)
            r7.K0(r4)
            p3.u$b r2 = r7.f46338R
            if (r2 != 0) goto La1
            r7.f46338R = r4
            goto La7
        La1:
            p3.u$b r2 = p3.u.b.a(r2, r4)
            r7.f46338R = r2
        La7:
            java.util.ArrayDeque r2 = r7.f46337Q
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto Lb0
            goto L4a
        Lb0:
            p3.u$b r8 = r7.f46338R
            throw r8
        Lb3:
            r7.f46337Q = r1
            return
        Lb6:
            p3.u$b r8 = new p3.u$b
            O2.z0 r0 = r7.f46315C
            r2 = -49999(0xffffffffffff3cb1, float:NaN)
            r8.<init>(r0, r1, r9, r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.u.J0(android.media.MediaCrypto, boolean):void");
    }

    public abstract void K0(Exception exc);

    @Override // O2.AbstractC0892k
    public void L() {
        try {
            f0();
            Z0();
        } finally {
            j1(null);
        }
    }

    public abstract void L0(String str, InterfaceC2407m.a aVar, long j9, long j10);

    @Override // O2.AbstractC0892k
    public void M() {
    }

    public abstract void M0(String str);

    @Override // O2.AbstractC0892k
    public void N() {
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public U2.h N0(O2.A0 r12) throws O2.C0927w {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.u.N0(O2.A0):U2.h");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        if (r5 >= r1) goto L13;
     */
    @Override // O2.AbstractC0892k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void O(O2.C0936z0[] r16, long r17, long r19) {
        /*
            r15 = this;
            r0 = r15
            p3.u$c r1 = r0.f46326H0
            long r1 = r1.f46387c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L21
            p3.u$c r1 = new p3.u$c
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = r1
            r9 = r17
            r11 = r19
            r6.<init>(r7, r9, r11)
            r15.g1(r1)
            goto L68
        L21:
            java.util.ArrayDeque r1 = r0.f46311A
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L57
            long r1 = r0.f46378z0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L39
            long r5 = r0.f46328I0
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 < 0) goto L57
        L39:
            p3.u$c r1 = new p3.u$c
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r1
            r11 = r17
            r13 = r19
            r8.<init>(r9, r11, r13)
            r15.g1(r1)
            p3.u$c r1 = r0.f46326H0
            long r1 = r1.f46387c
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L68
            r15.R0()
            goto L68
        L57:
            java.util.ArrayDeque r1 = r0.f46311A
            p3.u$c r9 = new p3.u$c
            long r3 = r0.f46378z0
            r2 = r9
            r5 = r17
            r7 = r19
            r2.<init>(r3, r5, r7)
            r1.add(r9)
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.u.O(O2.z0[], long, long):void");
    }

    public abstract void O0(C0936z0 c0936z0, MediaFormat mediaFormat);

    public void P0(long j9) {
    }

    public void Q0(long j9) {
        this.f46328I0 = j9;
        while (!this.f46311A.isEmpty() && j9 >= ((c) this.f46311A.peek()).f46385a) {
            g1((c) this.f46311A.poll());
            R0();
        }
    }

    public void R0() {
    }

    public final void S() throws C0927w {
        String str;
        AbstractC1684a.g(!this.f46314B0);
        A0 a0B = B();
        this.f46371w.clear();
        do {
            this.f46371w.clear();
            int iP = P(a0B, this.f46371w, 0);
            if (iP == -5) {
                N0(a0B);
                return;
            }
            if (iP != -4) {
                if (iP != -3) {
                    throw new IllegalStateException();
                }
                return;
            }
            if (this.f46371w.isEndOfStream()) {
                this.f46314B0 = true;
                return;
            }
            if (this.f46318D0) {
                C0936z0 c0936z0 = (C0936z0) AbstractC1684a.e(this.f46315C);
                this.f46317D = c0936z0;
                O0(c0936z0, null);
                this.f46318D0 = false;
            }
            this.f46371w.i();
            C0936z0 c0936z02 = this.f46315C;
            if (c0936z02 != null && (str = c0936z02.f6467m) != null && str.equals("audio/opus")) {
                this.f46313B.a(this.f46371w);
            }
        } while (this.f46373x.o(this.f46371w));
        this.f46360q0 = true;
    }

    public abstract void S0(U2.g gVar);

    public final boolean T(long j9, long j10) throws C0927w {
        AbstractC1684a.g(!this.f46316C0);
        if (this.f46373x.t()) {
            C2403i c2403i = this.f46373x;
            if (!V0(j9, j10, null, c2403i.f9699d, this.f46354l0, 0, c2403i.s(), this.f46373x.q(), this.f46373x.isDecodeOnly(), this.f46373x.isEndOfStream(), this.f46317D)) {
                return false;
            }
            Q0(this.f46373x.r());
            this.f46373x.clear();
        }
        if (this.f46314B0) {
            this.f46316C0 = true;
            return false;
        }
        if (this.f46360q0) {
            AbstractC1684a.g(this.f46373x.o(this.f46371w));
            this.f46360q0 = false;
        }
        if (this.f46362r0) {
            if (this.f46373x.t()) {
                return true;
            }
            f0();
            this.f46362r0 = false;
            I0();
            if (!this.f46358p0) {
                return false;
            }
        }
        S();
        if (this.f46373x.t()) {
            this.f46373x.i();
        }
        return this.f46373x.t() || this.f46314B0 || this.f46362r0;
    }

    public void T0(C0936z0 c0936z0) {
    }

    public abstract U2.h U(t tVar, C0936z0 c0936z0, C0936z0 c0936z02);

    public final int V(String str) {
        int i9 = k0.f39777a;
        if (i9 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = k0.f39780d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i9 >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = k0.f39778b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    public abstract boolean V0(long j9, long j10, InterfaceC2407m interfaceC2407m, ByteBuffer byteBuffer, int i9, int i10, int i11, long j11, boolean z9, boolean z10, C0936z0 c0936z0);

    public final void W0() {
        this.f46376y0 = true;
        MediaFormat mediaFormatB = this.f46332L.b();
        if (this.f46340T != 0 && mediaFormatB.getInteger("width") == 32 && mediaFormatB.getInteger("height") == 32) {
            this.f46349g0 = true;
            return;
        }
        if (this.f46347e0) {
            mediaFormatB.setInteger("channel-count", 1);
        }
        this.f46334N = mediaFormatB;
        this.f46335O = true;
    }

    public final boolean X0(int i9) throws C0927w {
        A0 a0B = B();
        this.f46367u.clear();
        int iP = P(a0B, this.f46367u, i9 | 4);
        if (iP == -5) {
            N0(a0B);
            return true;
        }
        if (iP != -4 || !this.f46367u.isEndOfStream()) {
            return false;
        }
        this.f46314B0 = true;
        U0();
        return false;
    }

    public final void Y0() throws C0927w {
        Z0();
        I0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void Z0() {
        try {
            InterfaceC2407m interfaceC2407m = this.f46332L;
            if (interfaceC2407m != null) {
                interfaceC2407m.release();
                this.f46324G0.f9686b++;
                M0(this.f46339S.f46299a);
            }
            this.f46332L = null;
            try {
                MediaCrypto mediaCrypto = this.f46323G;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.f46332L = null;
            try {
                MediaCrypto mediaCrypto2 = this.f46323G;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    @Override // O2.E1
    public final int a(C0936z0 c0936z0) throws C0927w {
        try {
            return o1(this.f46361r, c0936z0);
        } catch (AbstractC2392B.c e9) {
            throw y(e9, c0936z0, 4002);
        }
    }

    public void a1() {
    }

    public void b1() {
        d1();
        e1();
        this.f46352j0 = -9223372036854775807L;
        this.f46374x0 = false;
        this.f46372w0 = false;
        this.f46348f0 = false;
        this.f46349g0 = false;
        this.f46356n0 = false;
        this.f46357o0 = false;
        this.f46375y.clear();
        this.f46378z0 = -9223372036854775807L;
        this.f46312A0 = -9223372036854775807L;
        this.f46328I0 = -9223372036854775807L;
        C2404j c2404j = this.f46351i0;
        if (c2404j != null) {
            c2404j.c();
        }
        this.f46368u0 = 0;
        this.f46370v0 = 0;
        this.f46366t0 = this.f46364s0 ? 1 : 0;
    }

    public void c1() {
        b1();
        this.f46322F0 = null;
        this.f46351i0 = null;
        this.f46337Q = null;
        this.f46339S = null;
        this.f46333M = null;
        this.f46334N = null;
        this.f46335O = false;
        this.f46376y0 = false;
        this.f46336P = -1.0f;
        this.f46340T = 0;
        this.f46341U = false;
        this.f46342V = false;
        this.f46343W = false;
        this.f46344X = false;
        this.f46345Y = false;
        this.f46346Z = false;
        this.f46347e0 = false;
        this.f46350h0 = false;
        this.f46364s0 = false;
        this.f46366t0 = 0;
        this.f46325H = false;
    }

    @Override // O2.C1
    public boolean d() {
        return this.f46316C0;
    }

    public final void d1() {
        this.f46353k0 = -1;
        this.f46369v.f9699d = null;
    }

    @Override // O2.C1
    public boolean e() {
        return this.f46315C != null && (F() || A0() || (this.f46352j0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f46352j0));
    }

    public C2408n e0(Throwable th, t tVar) {
        return new C2408n(th, tVar);
    }

    public final void e1() {
        this.f46354l0 = -1;
        this.f46355m0 = null;
    }

    public final void f0() {
        this.f46362r0 = false;
        this.f46373x.clear();
        this.f46371w.clear();
        this.f46360q0 = false;
        this.f46358p0 = false;
        this.f46313B.d();
    }

    public final void f1(InterfaceC1058o interfaceC1058o) {
        AbstractC1057n.a(this.f46319E, interfaceC1058o);
        this.f46319E = interfaceC1058o;
    }

    public final boolean g0() {
        if (this.f46372w0) {
            this.f46368u0 = 1;
            if (this.f46342V || this.f46344X) {
                this.f46370v0 = 3;
                return false;
            }
            this.f46370v0 = 1;
        }
        return true;
    }

    public final void g1(c cVar) {
        this.f46326H0 = cVar;
        long j9 = cVar.f46387c;
        if (j9 != -9223372036854775807L) {
            this.f46330J0 = true;
            P0(j9);
        }
    }

    public final void h0() throws C0927w {
        if (!this.f46372w0) {
            Y0();
        } else {
            this.f46368u0 = 1;
            this.f46370v0 = 3;
        }
    }

    public final void h1() {
        this.f46320E0 = true;
    }

    public final boolean i0() throws C0927w {
        if (this.f46372w0) {
            this.f46368u0 = 1;
            if (this.f46342V || this.f46344X) {
                this.f46370v0 = 3;
                return false;
            }
            this.f46370v0 = 2;
        } else {
            r1();
        }
        return true;
    }

    public final void i1(C0927w c0927w) {
        this.f46322F0 = c0927w;
    }

    public final boolean j0(long j9, long j10) throws C0927w {
        boolean z9;
        boolean zV0;
        int iL;
        if (!A0()) {
            if (this.f46345Y && this.f46374x0) {
                try {
                    iL = this.f46332L.l(this.f46377z);
                } catch (IllegalStateException unused) {
                    U0();
                    if (this.f46316C0) {
                        Z0();
                    }
                    return false;
                }
            } else {
                iL = this.f46332L.l(this.f46377z);
            }
            if (iL < 0) {
                if (iL == -2) {
                    W0();
                    return true;
                }
                if (this.f46350h0 && (this.f46314B0 || this.f46368u0 == 2)) {
                    U0();
                }
                return false;
            }
            if (this.f46349g0) {
                this.f46349g0 = false;
                this.f46332L.m(iL, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.f46377z;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                U0();
                return false;
            }
            this.f46354l0 = iL;
            ByteBuffer byteBufferN = this.f46332L.n(iL);
            this.f46355m0 = byteBufferN;
            if (byteBufferN != null) {
                byteBufferN.position(this.f46377z.offset);
                ByteBuffer byteBuffer = this.f46355m0;
                MediaCodec.BufferInfo bufferInfo2 = this.f46377z;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.f46346Z) {
                MediaCodec.BufferInfo bufferInfo3 = this.f46377z;
                if (bufferInfo3.presentationTimeUs == 0 && (bufferInfo3.flags & 4) != 0) {
                    long j11 = this.f46378z0;
                    if (j11 != -9223372036854775807L) {
                        bufferInfo3.presentationTimeUs = j11;
                    }
                }
            }
            this.f46356n0 = E0(this.f46377z.presentationTimeUs);
            long j12 = this.f46312A0;
            long j13 = this.f46377z.presentationTimeUs;
            this.f46357o0 = j12 == j13;
            s1(j13);
        }
        if (this.f46345Y && this.f46374x0) {
            try {
                InterfaceC2407m interfaceC2407m = this.f46332L;
                ByteBuffer byteBuffer2 = this.f46355m0;
                int i9 = this.f46354l0;
                MediaCodec.BufferInfo bufferInfo4 = this.f46377z;
                z9 = false;
                try {
                    zV0 = V0(j9, j10, interfaceC2407m, byteBuffer2, i9, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.f46356n0, this.f46357o0, this.f46317D);
                } catch (IllegalStateException unused2) {
                    U0();
                    if (this.f46316C0) {
                        Z0();
                    }
                    return z9;
                }
            } catch (IllegalStateException unused3) {
                z9 = false;
            }
        } else {
            z9 = false;
            InterfaceC2407m interfaceC2407m2 = this.f46332L;
            ByteBuffer byteBuffer3 = this.f46355m0;
            int i10 = this.f46354l0;
            MediaCodec.BufferInfo bufferInfo5 = this.f46377z;
            zV0 = V0(j9, j10, interfaceC2407m2, byteBuffer3, i10, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.f46356n0, this.f46357o0, this.f46317D);
        }
        if (zV0) {
            Q0(this.f46377z.presentationTimeUs);
            boolean z10 = (this.f46377z.flags & 4) != 0;
            e1();
            if (!z10) {
                return true;
            }
            U0();
        }
        return z9;
    }

    public final boolean k0(t tVar, C0936z0 c0936z0, InterfaceC1058o interfaceC1058o, InterfaceC1058o interfaceC1058o2) {
        CryptoConfig cryptoConfigD;
        CryptoConfig cryptoConfigD2;
        if (interfaceC1058o == interfaceC1058o2) {
            return false;
        }
        if (interfaceC1058o2 != null && interfaceC1058o != null && (cryptoConfigD = interfaceC1058o2.d()) != null && (cryptoConfigD2 = interfaceC1058o.d()) != null && cryptoConfigD.getClass().equals(cryptoConfigD2.getClass())) {
            if (!(cryptoConfigD instanceof H)) {
                return false;
            }
            H h9 = (H) cryptoConfigD;
            if (!interfaceC1058o2.a().equals(interfaceC1058o.a()) || k0.f39777a < 23) {
                return true;
            }
            UUID uuid = AbstractC0904o.f6141e;
            if (!uuid.equals(interfaceC1058o.a()) && !uuid.equals(interfaceC1058o2.a())) {
                return !tVar.f46305g && (h9.f9884c ? false : interfaceC1058o2.h(c0936z0.f6467m));
            }
        }
        return true;
    }

    public final boolean k1(long j9) {
        return this.f46327I == -9223372036854775807L || SystemClock.elapsedRealtime() - j9 < this.f46327I;
    }

    public boolean l1(t tVar) {
        return true;
    }

    public final void m0() {
        try {
            this.f46332L.flush();
        } finally {
            b1();
        }
    }

    public boolean m1() {
        return false;
    }

    public final boolean n0() throws C0927w {
        boolean zO0 = o0();
        if (zO0) {
            I0();
        }
        return zO0;
    }

    public boolean n1(C0936z0 c0936z0) {
        return false;
    }

    public boolean o0() {
        if (this.f46332L == null) {
            return false;
        }
        int i9 = this.f46370v0;
        if (i9 == 3 || this.f46342V || ((this.f46343W && !this.f46376y0) || (this.f46344X && this.f46374x0))) {
            Z0();
            return true;
        }
        if (i9 == 2) {
            int i10 = k0.f39777a;
            AbstractC1684a.g(i10 >= 23);
            if (i10 >= 23) {
                try {
                    r1();
                } catch (C0927w e9) {
                    AbstractC1681B.k("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e9);
                    Z0();
                    return true;
                }
            }
        }
        m0();
        return false;
    }

    public abstract int o1(w wVar, C0936z0 c0936z0);

    public final List p0(boolean z9) {
        List listV0 = v0(this.f46361r, this.f46315C, z9);
        if (listV0.isEmpty() && z9) {
            listV0 = v0(this.f46361r, this.f46315C, false);
            if (!listV0.isEmpty()) {
                AbstractC1681B.j("MediaCodecRenderer", "Drm session requires secure decoder for " + this.f46315C.f6467m + ", but no secure decoder available. Trying to proceed with " + listV0 + InstructionFileId.DOT);
            }
        }
        return listV0;
    }

    public final InterfaceC2407m q0() {
        return this.f46332L;
    }

    public final boolean q1(C0936z0 c0936z0) throws C0927w {
        if (k0.f39777a >= 23 && this.f46332L != null && this.f46370v0 != 3 && getState() != 0) {
            float fT0 = t0(this.f46331K, c0936z0, E());
            float f9 = this.f46336P;
            if (f9 == fT0) {
                return true;
            }
            if (fT0 == -1.0f) {
                h0();
                return false;
            }
            if (f9 == -1.0f && fT0 <= this.f46365t) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fT0);
            this.f46332L.i(bundle);
            this.f46336P = fT0;
        }
        return true;
    }

    public final t r0() {
        return this.f46339S;
    }

    public final void r1() throws C0927w {
        CryptoConfig cryptoConfigD = this.f46321F.d();
        if (cryptoConfigD instanceof H) {
            try {
                this.f46323G.setMediaDrmSession(((H) cryptoConfigD).f9883b);
            } catch (MediaCryptoException e9) {
                throw y(e9, this.f46315C, 6006);
            }
        }
        f1(this.f46321F);
        this.f46368u0 = 0;
        this.f46370v0 = 0;
    }

    @Override // O2.AbstractC0892k, O2.C1
    public void s(float f9, float f10) throws C0927w {
        this.f46329J = f9;
        this.f46331K = f10;
        q1(this.f46333M);
    }

    public boolean s0() {
        return false;
    }

    public final void s1(long j9) {
        C0936z0 c0936z0 = (C0936z0) this.f46326H0.f46388d.j(j9);
        if (c0936z0 == null && this.f46330J0 && this.f46334N != null) {
            c0936z0 = (C0936z0) this.f46326H0.f46388d.i();
        }
        if (c0936z0 != null) {
            this.f46317D = c0936z0;
        } else if (!this.f46335O || this.f46317D == null) {
            return;
        }
        O0(this.f46317D, this.f46334N);
        this.f46335O = false;
        this.f46330J0 = false;
    }

    @Override // O2.AbstractC0892k, O2.E1
    public final int t() {
        return 8;
    }

    public abstract float t0(float f9, C0936z0 c0936z0, C0936z0[] c0936z0Arr);

    @Override // O2.C1
    public void u(long j9, long j10) throws C0927w {
        boolean z9 = false;
        if (this.f46320E0) {
            this.f46320E0 = false;
            U0();
        }
        C0927w c0927w = this.f46322F0;
        if (c0927w != null) {
            this.f46322F0 = null;
            throw c0927w;
        }
        try {
            if (this.f46316C0) {
                a1();
                return;
            }
            if (this.f46315C != null || X0(2)) {
                I0();
                if (this.f46358p0) {
                    a0.a("bypassRender");
                    while (T(j9, j10)) {
                    }
                } else {
                    if (this.f46332L == null) {
                        this.f46324G0.f9688d += R(j9);
                        X0(1);
                        this.f46324G0.c();
                    }
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    a0.a("drainAndFeed");
                    while (j0(j9, j10) && k1(jElapsedRealtime)) {
                    }
                    while (l0() && k1(jElapsedRealtime)) {
                    }
                }
                a0.c();
                this.f46324G0.c();
            }
        } catch (IllegalStateException e9) {
            if (!F0(e9)) {
                throw e9;
            }
            K0(e9);
            if (k0.f39777a >= 21 && H0(e9)) {
                z9 = true;
            }
            if (z9) {
                Z0();
            }
            throw z(e0(e9, r0()), this.f46315C, z9, 4003);
        }
    }

    public final MediaFormat u0() {
        return this.f46334N;
    }

    public abstract List v0(w wVar, C0936z0 c0936z0, boolean z9);

    public abstract InterfaceC2407m.a w0(t tVar, C0936z0 c0936z0, MediaCrypto mediaCrypto, float f9);

    public final long x0() {
        return this.f46326H0.f46387c;
    }

    public float y0() {
        return this.f46329J;
    }

    public void z0(U2.g gVar) {
    }
}
