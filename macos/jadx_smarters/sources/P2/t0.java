package P2;

import B3.C;
import B3.C0512u;
import B3.C0515x;
import O2.AbstractC0904o;
import O2.C0897l1;
import O2.C0909p1;
import O2.C0917s1;
import O2.C0921u;
import O2.C0927w;
import O2.C0936z0;
import O2.H0;
import O2.InterfaceC0920t1;
import O2.Q1;
import O2.R0;
import O2.V1;
import P2.InterfaceC0986c;
import P2.u0;
import Q2.B;
import Q2.C1019e;
import V2.C1051h;
import V2.C1056m;
import V2.InterfaceC1058o;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import b4.C;
import b4.C1209B;
import b4.T;
import com.facebook.ads.AdError;
import com.google.ads.interactivemedia.v3.internal.M0;
import com.google.ads.interactivemedia.v3.internal.Q0;
import com.google.ads.interactivemedia.v3.internal.T0;
import com.google.ads.interactivemedia.v3.internal.U0;
import com.google.ads.interactivemedia.v3.internal.V0;
import com.google.ads.interactivemedia.v3.internal.X0;
import d4.AbstractC1684a;
import e4.C1737C;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import p3.C2408n;
import p3.u;
import q3.C2540a;
import s5.AbstractC2743y;

/* JADX INFO: loaded from: classes3.dex */
public final class t0 implements InterfaceC0986c, u0.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f7122A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u0 f7124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PlaybackSession f7125c;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f7131i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PlaybackMetrics.Builder f7132j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f7133k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C0909p1 f7136n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b f7137o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b f7138p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public b f7139q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C0936z0 f7140r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C0936z0 f7141s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C0936z0 f7142t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f7143u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f7144v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f7145w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f7146x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f7147y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f7148z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Q1.d f7127e = new Q1.d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Q1.b f7128f = new Q1.b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f7130h = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f7129g = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f7126d = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7134l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f7135m = 0;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7150b;

        public a(int i9, int i10) {
            this.f7149a = i9;
            this.f7150b = i10;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C0936z0 f7151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7152b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f7153c;

        public b(C0936z0 c0936z0, int i9, String str) {
            this.f7151a = c0936z0;
            this.f7152b = i9;
            this.f7153c = str;
        }
    }

    public t0(Context context, PlaybackSession playbackSession) {
        this.f7123a = context.getApplicationContext();
        this.f7125c = playbackSession;
        r0 r0Var = new r0();
        this.f7124b = r0Var;
        r0Var.c(this);
    }

    public static int A0(C1056m c1056m) {
        for (int i9 = 0; i9 < c1056m.f10009e; i9++) {
            UUID uuid = c1056m.f(i9).f10011c;
            if (uuid.equals(AbstractC0904o.f6140d)) {
                return 3;
            }
            if (uuid.equals(AbstractC0904o.f6141e)) {
                return 2;
            }
            if (uuid.equals(AbstractC0904o.f6139c)) {
                return 6;
            }
        }
        return 1;
    }

    public static a B0(C0909p1 c0909p1, Context context, boolean z9) {
        int i9;
        boolean z10;
        if (c0909p1.f6177a == 1001) {
            return new a(20, 0);
        }
        if (c0909p1 instanceof C0927w) {
            C0927w c0927w = (C0927w) c0909p1;
            z10 = c0927w.f6351j == 1;
            i9 = c0927w.f6355n;
        } else {
            i9 = 0;
            z10 = false;
        }
        Throwable th = (Throwable) AbstractC1684a.e(c0909p1.getCause());
        if (!(th instanceof IOException)) {
            if (z10 && (i9 == 0 || i9 == 1)) {
                return new a(35, 0);
            }
            if (z10 && i9 == 3) {
                return new a(15, 0);
            }
            if (z10 && i9 == 2) {
                return new a(23, 0);
            }
            if (th instanceof u.b) {
                return new a(13, d4.k0.a0(((u.b) th).f46382e));
            }
            if (th instanceof C2408n) {
                return new a(14, d4.k0.a0(((C2408n) th).f46298c));
            }
            if (th instanceof OutOfMemoryError) {
                return new a(14, 0);
            }
            if (th instanceof B.b) {
                return new a(17, ((B.b) th).f7524a);
            }
            if (th instanceof B.e) {
                return new a(18, ((B.e) th).f7529a);
            }
            if (d4.k0.f39777a < 16 || !(th instanceof MediaCodec.CryptoException)) {
                return new a(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) th).getErrorCode();
            return new a(y0(errorCode), errorCode);
        }
        if (th instanceof C.e) {
            return new a(5, ((C.e) th).f17480e);
        }
        if ((th instanceof C.d) || (th instanceof C0897l1)) {
            return new a(z9 ? 10 : 11, 0);
        }
        boolean z11 = th instanceof C.c;
        if (z11 || (th instanceof T.a)) {
            if (d4.I.d(context).f() == 1) {
                return new a(3, 0);
            }
            Throwable cause = th.getCause();
            return cause instanceof UnknownHostException ? new a(6, 0) : cause instanceof SocketTimeoutException ? new a(7, 0) : (z11 && ((C.c) th).f17478d == 1) ? new a(4, 0) : new a(8, 0);
        }
        if (c0909p1.f6177a == 1002) {
            return new a(21, 0);
        }
        if (!(th instanceof InterfaceC1058o.a)) {
            if (!(th instanceof C1209B.c) || !(th.getCause() instanceof FileNotFoundException)) {
                return new a(9, 0);
            }
            Throwable cause2 = ((Throwable) AbstractC1684a.e(th.getCause())).getCause();
            return (d4.k0.f39777a >= 21 && (cause2 instanceof ErrnoException) && ((ErrnoException) cause2).errno == OsConstants.EACCES) ? new a(32, 0) : new a(31, 0);
        }
        Throwable th2 = (Throwable) AbstractC1684a.e(th.getCause());
        int i10 = d4.k0.f39777a;
        if (i10 < 21 || !(th2 instanceof MediaDrm.MediaDrmStateException)) {
            return (i10 < 23 || !X0.a(th2)) ? (i10 < 18 || !(th2 instanceof NotProvisionedException)) ? (i10 < 18 || !(th2 instanceof DeniedByServerException)) ? th2 instanceof V2.W ? new a(23, 0) : th2 instanceof C1051h.e ? new a(28, 0) : new a(30, 0) : new a(29, 0) : new a(24, 0) : new a(27, 0);
        }
        int iA0 = d4.k0.a0(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo());
        return new a(y0(iA0), iA0);
    }

    public static Pair C0(String str) {
        String[] strArrI1 = d4.k0.i1(str, "-");
        return Pair.create(strArrI1[0], strArrI1.length >= 2 ? strArrI1[1] : null);
    }

    public static int E0(Context context) {
        switch (d4.I.d(context).f()) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
            case 8:
            default:
                return 1;
            case 7:
                return 3;
            case 9:
                return 8;
            case 10:
                return 7;
        }
    }

    public static int F0(H0 h02) {
        H0.h hVar = h02.f5528c;
        if (hVar == null) {
            return 0;
        }
        int iY0 = d4.k0.y0(hVar.f5625a, hVar.f5626c);
        if (iY0 == 0) {
            return 3;
        }
        if (iY0 != 1) {
            return iY0 != 2 ? 1 : 4;
        }
        return 5;
    }

    public static int G0(int i9) {
        if (i9 == 1) {
            return 2;
        }
        if (i9 != 2) {
            return i9 != 3 ? 1 : 4;
        }
        return 3;
    }

    public static t0 w0(Context context) {
        MediaMetricsManager mediaMetricsManagerA = M0.a(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerA == null) {
            return null;
        }
        return new t0(context, mediaMetricsManagerA.createPlaybackSession());
    }

    public static int y0(int i9) {
        switch (d4.k0.Z(i9)) {
            case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                return 24;
            case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /* 6003 */:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    public static C1056m z0(AbstractC2743y abstractC2743y) {
        C1056m c1056m;
        s5.c0 it = abstractC2743y.iterator();
        while (it.hasNext()) {
            V1.a aVar = (V1.a) it.next();
            for (int i9 = 0; i9 < aVar.f5916a; i9++) {
                if (aVar.j(i9) && (c1056m = aVar.c(i9).f6470p) != null) {
                    return c1056m;
                }
            }
        }
        return null;
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void A(InterfaceC0986c.a aVar, boolean z9) {
        AbstractC0985b.B(this, aVar, z9);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void B(InterfaceC0986c.a aVar, int i9, long j9, long j10) {
        AbstractC0985b.l(this, aVar, i9, j9, j10);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void C(InterfaceC0986c.a aVar, H0 h02, int i9) {
        AbstractC0985b.G(this, aVar, h02, i9);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void D(InterfaceC0986c.a aVar, Object obj, long j9) {
        AbstractC0985b.R(this, aVar, obj, j9);
    }

    public LogSessionId D0() {
        return this.f7125c.getSessionId();
    }

    @Override // P2.InterfaceC0986c
    public void E(InterfaceC0986c.a aVar, U2.e eVar) {
        this.f7146x += eVar.f9691g;
        this.f7147y += eVar.f9689e;
    }

    @Override // P2.InterfaceC0986c
    public void F(InterfaceC0986c.a aVar, C0909p1 c0909p1) {
        this.f7136n = c0909p1;
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void G(InterfaceC0986c.a aVar, C0515x c0515x) {
        AbstractC0985b.a0(this, aVar, c0515x);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void H(InterfaceC0986c.a aVar, R0 r02) {
        AbstractC0985b.H(this, aVar, r02);
    }

    public final void H0(InterfaceC0986c.b bVar) {
        for (int i9 = 0; i9 < bVar.d(); i9++) {
            int iB = bVar.b(i9);
            InterfaceC0986c.a aVarC = bVar.c(iB);
            if (iB == 0) {
                this.f7124b.d(aVarC);
            } else if (iB == 11) {
                this.f7124b.e(aVarC, this.f7133k);
            } else {
                this.f7124b.f(aVarC);
            }
        }
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void I(InterfaceC0986c.a aVar, Exception exc) {
        AbstractC0985b.b(this, aVar, exc);
    }

    public final void I0(long j9) {
        int iE0 = E0(this.f7123a);
        if (iE0 != this.f7135m) {
            this.f7135m = iE0;
            this.f7125c.reportNetworkEvent(com.google.ads.interactivemedia.v3.internal.R0.a().setNetworkType(iE0).setTimeSinceCreatedMillis(j9 - this.f7126d).build());
        }
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void J(InterfaceC0986c.a aVar, C0921u c0921u) {
        AbstractC0985b.p(this, aVar, c0921u);
    }

    public final void J0(long j9) {
        C0909p1 c0909p1 = this.f7136n;
        if (c0909p1 == null) {
            return;
        }
        a aVarB0 = B0(c0909p1, this.f7123a, this.f7144v == 4);
        this.f7125c.reportPlaybackErrorEvent(Q0.a().setTimeSinceCreatedMillis(j9 - this.f7126d).setErrorCode(aVarB0.f7149a).setSubErrorCode(aVarB0.f7150b).setException(c0909p1).build());
        this.f7122A = true;
        this.f7136n = null;
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void K(InterfaceC0986c.a aVar, int i9) {
        AbstractC0985b.M(this, aVar, i9);
    }

    public final void K0(InterfaceC0920t1 interfaceC0920t1, InterfaceC0986c.b bVar, long j9) {
        if (interfaceC0920t1.getPlaybackState() != 2) {
            this.f7143u = false;
        }
        if (interfaceC0920t1.n() == null) {
            this.f7145w = false;
        } else if (bVar.a(10)) {
            this.f7145w = true;
        }
        int iS0 = S0(interfaceC0920t1);
        if (this.f7134l != iS0) {
            this.f7134l = iS0;
            this.f7122A = true;
            this.f7125c.reportPlaybackStateEvent(T0.a().setState(this.f7134l).setTimeSinceCreatedMillis(j9 - this.f7126d).build());
        }
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void L(InterfaceC0986c.a aVar) {
        AbstractC0985b.x(this, aVar);
    }

    public final void L0(InterfaceC0920t1 interfaceC0920t1, InterfaceC0986c.b bVar, long j9) {
        if (bVar.a(2)) {
            V1 v1P = interfaceC0920t1.p();
            boolean zE = v1P.e(2);
            boolean zE2 = v1P.e(1);
            boolean zE3 = v1P.e(3);
            if (zE || zE2 || zE3) {
                if (!zE) {
                    Q0(j9, null, 0);
                }
                if (!zE2) {
                    M0(j9, null, 0);
                }
                if (!zE3) {
                    O0(j9, null, 0);
                }
            }
        }
        if (v0(this.f7137o)) {
            b bVar2 = this.f7137o;
            C0936z0 c0936z0 = bVar2.f7151a;
            if (c0936z0.f6473s != -1) {
                Q0(j9, c0936z0, bVar2.f7152b);
                this.f7137o = null;
            }
        }
        if (v0(this.f7138p)) {
            b bVar3 = this.f7138p;
            M0(j9, bVar3.f7151a, bVar3.f7152b);
            this.f7138p = null;
        }
        if (v0(this.f7139q)) {
            b bVar4 = this.f7139q;
            O0(j9, bVar4.f7151a, bVar4.f7152b);
            this.f7139q = null;
        }
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void M(InterfaceC0986c.a aVar, C1019e c1019e) {
        AbstractC0985b.a(this, aVar, c1019e);
    }

    public final void M0(long j9, C0936z0 c0936z0, int i9) {
        if (d4.k0.c(this.f7141s, c0936z0)) {
            return;
        }
        int i10 = (this.f7141s == null && i9 == 0) ? 1 : i9;
        this.f7141s = c0936z0;
        R0(0, j9, c0936z0, i10);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void N(InterfaceC0986c.a aVar, String str) {
        AbstractC0985b.e0(this, aVar, str);
    }

    public final void N0(InterfaceC0920t1 interfaceC0920t1, InterfaceC0986c.b bVar) {
        C1056m c1056mZ0;
        if (bVar.a(0)) {
            InterfaceC0986c.a aVarC = bVar.c(0);
            if (this.f7132j != null) {
                P0(aVarC.f7008b, aVarC.f7010d);
            }
        }
        if (bVar.a(2) && this.f7132j != null && (c1056mZ0 = z0(interfaceC0920t1.p().c())) != null) {
            s0.a(d4.k0.j(this.f7132j)).setDrmType(A0(c1056mZ0));
        }
        if (bVar.a(1011)) {
            this.f7148z++;
        }
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void O(InterfaceC0986c.a aVar, int i9, int i10, int i11, float f9) {
        AbstractC0985b.j0(this, aVar, i9, i10, i11, f9);
    }

    public final void O0(long j9, C0936z0 c0936z0, int i9) {
        if (d4.k0.c(this.f7142t, c0936z0)) {
            return;
        }
        int i10 = (this.f7142t == null && i9 == 0) ? 1 : i9;
        this.f7142t = c0936z0;
        R0(2, j9, c0936z0, i10);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void P(InterfaceC0986c.a aVar, boolean z9) {
        AbstractC0985b.F(this, aVar, z9);
    }

    public final void P0(Q1 q12, C.b bVar) {
        int iF;
        PlaybackMetrics.Builder builder = this.f7132j;
        if (bVar == null || (iF = q12.f(bVar.f271a)) == -1) {
            return;
        }
        q12.k(iF, this.f7128f);
        q12.s(this.f7128f.f5718d, this.f7127e);
        builder.setStreamType(F0(this.f7127e.f5746d));
        Q1.d dVar = this.f7127e;
        if (dVar.f5757o != -9223372036854775807L && !dVar.f5755m && !dVar.f5752j && !dVar.i()) {
            builder.setMediaDurationMillis(this.f7127e.f());
        }
        builder.setPlaybackType(this.f7127e.i() ? 2 : 1);
        this.f7122A = true;
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void Q(InterfaceC0986c.a aVar) {
        AbstractC0985b.O(this, aVar);
    }

    public final void Q0(long j9, C0936z0 c0936z0, int i9) {
        if (d4.k0.c(this.f7140r, c0936z0)) {
            return;
        }
        int i10 = (this.f7140r == null && i9 == 0) ? 1 : i9;
        this.f7140r = c0936z0;
        R0(1, j9, c0936z0, i10);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void R(InterfaceC0986c.a aVar, C0936z0 c0936z0) {
        AbstractC0985b.h0(this, aVar, c0936z0);
    }

    public final void R0(int i9, long j9, C0936z0 c0936z0, int i10) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = U0.a(i9).setTimeSinceCreatedMillis(j9 - this.f7126d);
        if (c0936z0 != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(G0(i10));
            String str = c0936z0.f6466l;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = c0936z0.f6467m;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = c0936z0.f6464j;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i11 = c0936z0.f6463i;
            if (i11 != -1) {
                timeSinceCreatedMillis.setBitrate(i11);
            }
            int i12 = c0936z0.f6472r;
            if (i12 != -1) {
                timeSinceCreatedMillis.setWidth(i12);
            }
            int i13 = c0936z0.f6473s;
            if (i13 != -1) {
                timeSinceCreatedMillis.setHeight(i13);
            }
            int i14 = c0936z0.f6480z;
            if (i14 != -1) {
                timeSinceCreatedMillis.setChannelCount(i14);
            }
            int i15 = c0936z0.f6447A;
            if (i15 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i15);
            }
            String str4 = c0936z0.f6458d;
            if (str4 != null) {
                Pair pairC0 = C0(str4);
                timeSinceCreatedMillis.setLanguage((String) pairC0.first);
                Object obj = pairC0.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f9 = c0936z0.f6474t;
            if (f9 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f9);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f7122A = true;
        this.f7125c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @Override // P2.u0.a
    public void S(InterfaceC0986c.a aVar, String str, boolean z9) {
        C.b bVar = aVar.f7010d;
        if ((bVar == null || !bVar.b()) && str.equals(this.f7131i)) {
            x0();
        }
        this.f7129g.remove(str);
        this.f7130h.remove(str);
    }

    public final int S0(InterfaceC0920t1 interfaceC0920t1) {
        int playbackState = interfaceC0920t1.getPlaybackState();
        if (this.f7143u) {
            return 5;
        }
        if (this.f7145w) {
            return 13;
        }
        if (playbackState == 4) {
            return 11;
        }
        if (playbackState == 2) {
            int i9 = this.f7134l;
            if (i9 == 0 || i9 == 2) {
                return 2;
            }
            if (interfaceC0920t1.E()) {
                return interfaceC0920t1.v() != 0 ? 10 : 6;
            }
            return 7;
        }
        if (playbackState == 3) {
            if (interfaceC0920t1.E()) {
                return interfaceC0920t1.v() != 0 ? 9 : 3;
            }
            return 4;
        }
        if (playbackState != 1 || this.f7134l == 0) {
            return this.f7134l;
        }
        return 12;
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void T(InterfaceC0986c.a aVar, U2.e eVar) {
        AbstractC0985b.f0(this, aVar, eVar);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void U(InterfaceC0986c.a aVar, Exception exc) {
        AbstractC0985b.b0(this, aVar, exc);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void V(InterfaceC0986c.a aVar, int i9) {
        AbstractC0985b.L(this, aVar, i9);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void W(InterfaceC0986c.a aVar, Exception exc) {
        AbstractC0985b.w(this, aVar, exc);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void X(InterfaceC0986c.a aVar, int i9) {
        AbstractC0985b.v(this, aVar, i9);
    }

    @Override // P2.InterfaceC0986c
    public void Y(InterfaceC0986c.a aVar, C0515x c0515x) {
        if (aVar.f7010d == null) {
            return;
        }
        b bVar = new b((C0936z0) AbstractC1684a.e(c0515x.f663c), c0515x.f664d, this.f7124b.a(aVar.f7008b, (C.b) AbstractC1684a.e(aVar.f7010d)));
        int i9 = c0515x.f662b;
        if (i9 != 0) {
            if (i9 == 1) {
                this.f7138p = bVar;
                return;
            } else if (i9 != 2) {
                if (i9 != 3) {
                    return;
                }
                this.f7139q = bVar;
                return;
            }
        }
        this.f7137o = bVar;
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void Z(InterfaceC0986c.a aVar, String str) {
        AbstractC0985b.e(this, aVar, str);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void a(InterfaceC0986c.a aVar, C0936z0 c0936z0, U2.h hVar) {
        AbstractC0985b.i0(this, aVar, c0936z0, hVar);
    }

    @Override // P2.InterfaceC0986c
    public void a0(InterfaceC0986c.a aVar, C0512u c0512u, C0515x c0515x, IOException iOException, boolean z9) {
        this.f7144v = c0515x.f661a;
    }

    @Override // P2.u0.a
    public void b(InterfaceC0986c.a aVar, String str) {
        C.b bVar = aVar.f7010d;
        if (bVar == null || !bVar.b()) {
            x0();
            this.f7131i = str;
            this.f7132j = V0.a().setPlayerName("ExoPlayerLib").setPlayerVersion("2.19.0");
            P0(aVar.f7008b, aVar.f7010d);
        }
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void b0(InterfaceC0986c.a aVar, boolean z9) {
        AbstractC0985b.U(this, aVar, z9);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void c(InterfaceC0986c.a aVar) {
        AbstractC0985b.t(this, aVar);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void c0(InterfaceC0986c.a aVar, long j9) {
        AbstractC0985b.j(this, aVar, j9);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void d(InterfaceC0986c.a aVar, C0512u c0512u, C0515x c0515x) {
        AbstractC0985b.E(this, aVar, c0512u, c0515x);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void d0(InterfaceC0986c.a aVar, C2540a c2540a) {
        AbstractC0985b.I(this, aVar, c2540a);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void e(InterfaceC0986c.a aVar, int i9) {
        AbstractC0985b.Q(this, aVar, i9);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void e0(InterfaceC0986c.a aVar, int i9) {
        AbstractC0985b.X(this, aVar, i9);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void f(InterfaceC0986c.a aVar) {
        AbstractC0985b.u(this, aVar);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void f0(InterfaceC0986c.a aVar, boolean z9, int i9) {
        AbstractC0985b.P(this, aVar, z9, i9);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void g(InterfaceC0986c.a aVar, boolean z9) {
        AbstractC0985b.A(this, aVar, z9);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void g0(InterfaceC0986c.a aVar, String str, long j9) {
        AbstractC0985b.c(this, aVar, str, j9);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void h(InterfaceC0986c.a aVar, Z3.z zVar) {
        AbstractC0985b.Y(this, aVar, zVar);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void h0(InterfaceC0986c.a aVar, int i9, long j9) {
        AbstractC0985b.y(this, aVar, i9, j9);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void i(InterfaceC0986c.a aVar) {
        AbstractC0985b.T(this, aVar);
    }

    @Override // P2.InterfaceC0986c
    public void i0(InterfaceC0986c.a aVar, int i9, long j9, long j10) {
        C.b bVar = aVar.f7010d;
        if (bVar != null) {
            String strA = this.f7124b.a(aVar.f7008b, (C.b) AbstractC1684a.e(bVar));
            Long l9 = (Long) this.f7130h.get(strA);
            Long l10 = (Long) this.f7129g.get(strA);
            this.f7130h.put(strA, Long.valueOf((l9 == null ? 0L : l9.longValue()) + j9));
            this.f7129g.put(strA, Long.valueOf((l10 != null ? l10.longValue() : 0L) + ((long) i9)));
        }
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void j(InterfaceC0986c.a aVar, Exception exc) {
        AbstractC0985b.k(this, aVar, exc);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void j0(InterfaceC0986c.a aVar, boolean z9, int i9) {
        AbstractC0985b.J(this, aVar, z9, i9);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void k(InterfaceC0986c.a aVar, V1 v12) {
        AbstractC0985b.Z(this, aVar, v12);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void k0(InterfaceC0986c.a aVar) {
        AbstractC0985b.r(this, aVar);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void l(InterfaceC0986c.a aVar, C0936z0 c0936z0, U2.h hVar) {
        AbstractC0985b.i(this, aVar, c0936z0, hVar);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void l0(InterfaceC0986c.a aVar, boolean z9) {
        AbstractC0985b.V(this, aVar, z9);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void m(InterfaceC0986c.a aVar) {
        AbstractC0985b.s(this, aVar);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void m0(InterfaceC0986c.a aVar, int i9, boolean z9) {
        AbstractC0985b.q(this, aVar, i9, z9);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void n(InterfaceC0986c.a aVar, long j9, int i9) {
        AbstractC0985b.g0(this, aVar, j9, i9);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void n0(InterfaceC0986c.a aVar, C0936z0 c0936z0) {
        AbstractC0985b.h(this, aVar, c0936z0);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void o(InterfaceC0986c.a aVar, int i9, int i10) {
        AbstractC0985b.W(this, aVar, i9, i10);
    }

    @Override // P2.InterfaceC0986c
    public void o0(InterfaceC0986c.a aVar, C1737C c1737c) {
        b bVar = this.f7137o;
        if (bVar != null) {
            C0936z0 c0936z0 = bVar.f7151a;
            if (c0936z0.f6473s == -1) {
                this.f7137o = new b(c0936z0.b().n0(c1737c.f40178a).S(c1737c.f40179c).G(), bVar.f7152b, bVar.f7153c);
            }
        }
    }

    @Override // P2.InterfaceC0986c
    public void p(InterfaceC0986c.a aVar, InterfaceC0920t1.e eVar, InterfaceC0920t1.e eVar2, int i9) {
        if (i9 == 1) {
            this.f7143u = true;
        }
        this.f7133k = i9;
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void p0(InterfaceC0986c.a aVar, C0512u c0512u, C0515x c0515x) {
        AbstractC0985b.C(this, aVar, c0512u, c0515x);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void q(InterfaceC0986c.a aVar, U2.e eVar) {
        AbstractC0985b.g(this, aVar, eVar);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void q0(InterfaceC0986c.a aVar, List list) {
        AbstractC0985b.o(this, aVar, list);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void r(InterfaceC0986c.a aVar, P3.f fVar) {
        AbstractC0985b.n(this, aVar, fVar);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void r0(InterfaceC0986c.a aVar, C0909p1 c0909p1) {
        AbstractC0985b.N(this, aVar, c0909p1);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void s(InterfaceC0986c.a aVar, String str, long j9, long j10) {
        AbstractC0985b.d(this, aVar, str, j9, j10);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void s0(InterfaceC0986c.a aVar, U2.e eVar) {
        AbstractC0985b.f(this, aVar, eVar);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void t(InterfaceC0986c.a aVar, C0917s1 c0917s1) {
        AbstractC0985b.K(this, aVar, c0917s1);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void t0(InterfaceC0986c.a aVar, String str, long j9, long j10) {
        AbstractC0985b.d0(this, aVar, str, j9, j10);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void u(InterfaceC0986c.a aVar, String str, long j9) {
        AbstractC0985b.c0(this, aVar, str, j9);
    }

    @Override // P2.InterfaceC0986c
    public void u0(InterfaceC0920t1 interfaceC0920t1, InterfaceC0986c.b bVar) {
        if (bVar.d() == 0) {
            return;
        }
        H0(bVar);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        N0(interfaceC0920t1, bVar);
        J0(jElapsedRealtime);
        L0(interfaceC0920t1, bVar, jElapsedRealtime);
        I0(jElapsedRealtime);
        K0(interfaceC0920t1, bVar, jElapsedRealtime);
        if (bVar.a(1028)) {
            this.f7124b.g(bVar.c(1028));
        }
    }

    @Override // P2.u0.a
    public void v(InterfaceC0986c.a aVar, String str, String str2) {
    }

    public final boolean v0(b bVar) {
        return bVar != null && bVar.f7153c.equals(this.f7124b.b());
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void w(InterfaceC0986c.a aVar, InterfaceC0920t1.b bVar) {
        AbstractC0985b.m(this, aVar, bVar);
    }

    @Override // P2.u0.a
    public void x(InterfaceC0986c.a aVar, String str) {
    }

    public final void x0() {
        PlaybackMetrics.Builder builder = this.f7132j;
        if (builder != null && this.f7122A) {
            builder.setAudioUnderrunCount(this.f7148z);
            this.f7132j.setVideoFramesDropped(this.f7146x);
            this.f7132j.setVideoFramesPlayed(this.f7147y);
            Long l9 = (Long) this.f7129g.get(this.f7131i);
            this.f7132j.setNetworkTransferDurationMillis(l9 == null ? 0L : l9.longValue());
            Long l10 = (Long) this.f7130h.get(this.f7131i);
            this.f7132j.setNetworkBytesRead(l10 == null ? 0L : l10.longValue());
            this.f7132j.setStreamSource((l10 == null || l10.longValue() <= 0) ? 0 : 1);
            this.f7125c.reportPlaybackMetrics(this.f7132j.build());
        }
        this.f7132j = null;
        this.f7131i = null;
        this.f7148z = 0;
        this.f7146x = 0;
        this.f7147y = 0;
        this.f7140r = null;
        this.f7141s = null;
        this.f7142t = null;
        this.f7122A = false;
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void y(InterfaceC0986c.a aVar, C0512u c0512u, C0515x c0515x) {
        AbstractC0985b.D(this, aVar, c0512u, c0515x);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void z(InterfaceC0986c.a aVar, int i9) {
        AbstractC0985b.S(this, aVar, i9);
    }
}
