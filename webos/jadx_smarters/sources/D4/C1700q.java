package d4;

import B3.C0512u;
import B3.C0515x;
import O2.C0909p1;
import O2.C0917s1;
import O2.C0921u;
import O2.C0936z0;
import O2.H0;
import O2.InterfaceC0920t1;
import O2.Q1;
import O2.R0;
import O2.V1;
import P2.AbstractC0985b;
import P2.InterfaceC0986c;
import Q2.C1019e;
import android.os.SystemClock;
import android.text.TextUtils;
import e4.C1737C;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import org.apache.commons.codec.language.bm.Rule;
import q3.C2540a;
import s5.AbstractC2743y;

/* JADX INFO: renamed from: d4.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1700q implements InterfaceC0986c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final NumberFormat f39800e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q1.d f39802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Q1.b f39803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f39804d;

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        f39800e = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public C1700q() {
        this("EventLogger");
    }

    public C1700q(Z3.u uVar) {
        this("EventLogger");
    }

    public C1700q(String str) {
        this.f39801a = str;
        this.f39802b = new Q1.d();
        this.f39803c = new Q1.b();
        this.f39804d = SystemClock.elapsedRealtime();
    }

    public static String A0(int i9) {
        return i9 != 0 ? i9 != 1 ? "?" : "SOURCE_UPDATE" : "PLAYLIST_CHANGED";
    }

    public static String B0(boolean z9) {
        return z9 ? "[X]" : "[ ]";
    }

    public static String S(int i9) {
        return i9 != 0 ? i9 != 1 ? i9 != 2 ? i9 != 3 ? "?" : "PLAYLIST_CHANGED" : "SEEK" : "AUTO" : "REPEAT";
    }

    public static String b(int i9) {
        return i9 != 0 ? i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 != 4 ? i9 != 5 ? "?" : "INTERNAL" : "REMOVE" : "SKIP" : "SEEK_ADJUSTMENT" : "SEEK" : "AUTO_TRANSITION";
    }

    public static String v0(int i9) {
        return i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 != 4 ? i9 != 5 ? "?" : "END_OF_MEDIA_ITEM" : "REMOTE" : "AUDIO_BECOMING_NOISY" : "AUDIO_FOCUS_LOSS" : "USER_REQUEST";
    }

    public static String w0(int i9) {
        return i9 != 0 ? i9 != 1 ? "?" : "TRANSIENT_AUDIO_FOCUS_LOSS" : "NONE";
    }

    public static String x0(int i9) {
        return i9 != 0 ? i9 != 1 ? i9 != 2 ? "?" : Rule.ALL : "ONE" : "OFF";
    }

    public static String y0(int i9) {
        return i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 != 4 ? "?" : "ENDED" : "READY" : "BUFFERING" : "IDLE";
    }

    public static String z0(long j9) {
        return j9 == -9223372036854775807L ? "?" : f39800e.format(j9 / 1000.0f);
    }

    @Override // P2.InterfaceC0986c
    public void A(InterfaceC0986c.a aVar, boolean z9) {
        D0(aVar, "isPlaying", Boolean.toString(z9));
    }

    @Override // P2.InterfaceC0986c
    public void B(InterfaceC0986c.a aVar, int i9, long j9, long j10) {
        F0(aVar, "audioTrackUnderrun", i9 + ", " + j9 + ", " + j10, null);
    }

    @Override // P2.InterfaceC0986c
    public void C(InterfaceC0986c.a aVar, H0 h02, int i9) {
        E0("mediaItem [" + x(aVar) + ", reason=" + S(i9) + "]");
    }

    public final void C0(InterfaceC0986c.a aVar, String str) {
        E0(v(aVar, str, null, null));
    }

    @Override // P2.InterfaceC0986c
    public void D(InterfaceC0986c.a aVar, Object obj, long j9) {
        D0(aVar, "renderedFirstFrame", String.valueOf(obj));
    }

    public final void D0(InterfaceC0986c.a aVar, String str, String str2) {
        E0(v(aVar, str, str2, null));
    }

    @Override // P2.InterfaceC0986c
    public void E(InterfaceC0986c.a aVar, U2.e eVar) {
        C0(aVar, "videoDisabled");
    }

    public void E0(String str) {
        AbstractC1681B.b(this.f39801a, str);
    }

    @Override // P2.InterfaceC0986c
    public void F(InterfaceC0986c.a aVar, C0909p1 c0909p1) {
        G0(aVar, "playerFailed", c0909p1);
    }

    public final void F0(InterfaceC0986c.a aVar, String str, String str2, Throwable th) {
        H0(v(aVar, str, str2, th));
    }

    @Override // P2.InterfaceC0986c
    public void G(InterfaceC0986c.a aVar, C0515x c0515x) {
        D0(aVar, "upstreamDiscarded", C0936z0.k(c0515x.f663c));
    }

    public final void G0(InterfaceC0986c.a aVar, String str, Throwable th) {
        H0(v(aVar, str, null, th));
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void H(InterfaceC0986c.a aVar, R0 r02) {
        AbstractC0985b.H(this, aVar, r02);
    }

    public void H0(String str) {
        AbstractC1681B.d(this.f39801a, str);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void I(InterfaceC0986c.a aVar, Exception exc) {
        AbstractC0985b.b(this, aVar, exc);
    }

    public final void I0(InterfaceC0986c.a aVar, String str, Exception exc) {
        F0(aVar, "internalError", str, exc);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void J(InterfaceC0986c.a aVar, C0921u c0921u) {
        AbstractC0985b.p(this, aVar, c0921u);
    }

    public final void J0(C2540a c2540a, String str) {
        for (int i9 = 0; i9 < c2540a.f(); i9++) {
            E0(str + c2540a.e(i9));
        }
    }

    @Override // P2.InterfaceC0986c
    public void K(InterfaceC0986c.a aVar, int i9) {
        D0(aVar, "playbackSuppressionReason", w0(i9));
    }

    @Override // P2.InterfaceC0986c
    public void L(InterfaceC0986c.a aVar) {
        C0(aVar, "drmSessionReleased");
    }

    @Override // P2.InterfaceC0986c
    public void M(InterfaceC0986c.a aVar, C1019e c1019e) {
        D0(aVar, "audioAttributes", c1019e.f7791a + "," + c1019e.f7792c + "," + c1019e.f7793d + "," + c1019e.f7794e);
    }

    @Override // P2.InterfaceC0986c
    public void N(InterfaceC0986c.a aVar, String str) {
        D0(aVar, "videoDecoderReleased", str);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void O(InterfaceC0986c.a aVar, int i9, int i10, int i11, float f9) {
        AbstractC0985b.j0(this, aVar, i9, i10, i11, f9);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void P(InterfaceC0986c.a aVar, boolean z9) {
        AbstractC0985b.F(this, aVar, z9);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void Q(InterfaceC0986c.a aVar) {
        AbstractC0985b.O(this, aVar);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void R(InterfaceC0986c.a aVar, C0936z0 c0936z0) {
        AbstractC0985b.h0(this, aVar, c0936z0);
    }

    @Override // P2.InterfaceC0986c
    public void T(InterfaceC0986c.a aVar, U2.e eVar) {
        C0(aVar, "videoEnabled");
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void U(InterfaceC0986c.a aVar, Exception exc) {
        AbstractC0985b.b0(this, aVar, exc);
    }

    @Override // P2.InterfaceC0986c
    public void V(InterfaceC0986c.a aVar, int i9) {
        D0(aVar, "state", y0(i9));
    }

    @Override // P2.InterfaceC0986c
    public void W(InterfaceC0986c.a aVar, Exception exc) {
        I0(aVar, "drmSessionManagerError", exc);
    }

    @Override // P2.InterfaceC0986c
    public void X(InterfaceC0986c.a aVar, int i9) {
        D0(aVar, "drmSessionAcquired", "state=" + i9);
    }

    @Override // P2.InterfaceC0986c
    public void Y(InterfaceC0986c.a aVar, C0515x c0515x) {
        D0(aVar, "downstreamFormat", C0936z0.k(c0515x.f663c));
    }

    @Override // P2.InterfaceC0986c
    public void Z(InterfaceC0986c.a aVar, String str) {
        D0(aVar, "audioDecoderReleased", str);
    }

    @Override // P2.InterfaceC0986c
    public void a(InterfaceC0986c.a aVar, C0936z0 c0936z0, U2.h hVar) {
        D0(aVar, "videoInputFormat", C0936z0.k(c0936z0));
    }

    @Override // P2.InterfaceC0986c
    public void a0(InterfaceC0986c.a aVar, C0512u c0512u, C0515x c0515x, IOException iOException, boolean z9) {
        I0(aVar, "loadError", iOException);
    }

    @Override // P2.InterfaceC0986c
    public void b0(InterfaceC0986c.a aVar, boolean z9) {
        D0(aVar, "shuffleModeEnabled", Boolean.toString(z9));
    }

    @Override // P2.InterfaceC0986c
    public void c(InterfaceC0986c.a aVar) {
        C0(aVar, "drmKeysRestored");
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void c0(InterfaceC0986c.a aVar, long j9) {
        AbstractC0985b.j(this, aVar, j9);
    }

    @Override // P2.InterfaceC0986c
    public void d(InterfaceC0986c.a aVar, C0512u c0512u, C0515x c0515x) {
    }

    @Override // P2.InterfaceC0986c
    public void d0(InterfaceC0986c.a aVar, C2540a c2540a) {
        E0("metadata [" + x(aVar));
        J0(c2540a, "  ");
        E0("]");
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void e(InterfaceC0986c.a aVar, int i9) {
        AbstractC0985b.Q(this, aVar, i9);
    }

    @Override // P2.InterfaceC0986c
    public void e0(InterfaceC0986c.a aVar, int i9) {
        int iN = aVar.f7008b.n();
        int iU = aVar.f7008b.u();
        E0("timeline [" + x(aVar) + ", periodCount=" + iN + ", windowCount=" + iU + ", reason=" + A0(i9));
        for (int i10 = 0; i10 < Math.min(iN, 3); i10++) {
            aVar.f7008b.k(i10, this.f39803c);
            E0("  period [" + z0(this.f39803c.o()) + "]");
        }
        if (iN > 3) {
            E0("  ...");
        }
        for (int i11 = 0; i11 < Math.min(iU, 3); i11++) {
            aVar.f7008b.s(i11, this.f39802b);
            E0("  window [" + z0(this.f39802b.f()) + ", seekable=" + this.f39802b.f5751i + ", dynamic=" + this.f39802b.f5752j + "]");
        }
        if (iU > 3) {
            E0("  ...");
        }
        E0("]");
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
    public void g(InterfaceC0986c.a aVar, boolean z9) {
        D0(aVar, "loading", Boolean.toString(z9));
    }

    @Override // P2.InterfaceC0986c
    public void g0(InterfaceC0986c.a aVar, String str, long j9) {
        D0(aVar, "audioDecoderInitialized", str);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void h(InterfaceC0986c.a aVar, Z3.z zVar) {
        AbstractC0985b.Y(this, aVar, zVar);
    }

    @Override // P2.InterfaceC0986c
    public void h0(InterfaceC0986c.a aVar, int i9, long j9) {
        D0(aVar, "droppedFrames", Integer.toString(i9));
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void i(InterfaceC0986c.a aVar) {
        AbstractC0985b.T(this, aVar);
    }

    @Override // P2.InterfaceC0986c
    public void i0(InterfaceC0986c.a aVar, int i9, long j9, long j10) {
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void j(InterfaceC0986c.a aVar, Exception exc) {
        AbstractC0985b.k(this, aVar, exc);
    }

    @Override // P2.InterfaceC0986c
    public void j0(InterfaceC0986c.a aVar, boolean z9, int i9) {
        D0(aVar, "playWhenReady", z9 + ", " + v0(i9));
    }

    @Override // P2.InterfaceC0986c
    public void k(InterfaceC0986c.a aVar, V1 v12) {
        C2540a c2540a;
        E0("tracks [" + x(aVar));
        AbstractC2743y abstractC2743yC = v12.c();
        for (int i9 = 0; i9 < abstractC2743yC.size(); i9++) {
            V1.a aVar2 = (V1.a) abstractC2743yC.get(i9);
            E0("  group [");
            for (int i10 = 0; i10 < aVar2.f5916a; i10++) {
                E0("    " + B0(aVar2.j(i10)) + " Track:" + i10 + ", " + C0936z0.k(aVar2.c(i10)) + ", supported=" + k0.b0(aVar2.d(i10)));
            }
            E0("  ]");
        }
        boolean z9 = false;
        for (int i11 = 0; !z9 && i11 < abstractC2743yC.size(); i11++) {
            V1.a aVar3 = (V1.a) abstractC2743yC.get(i11);
            for (int i12 = 0; !z9 && i12 < aVar3.f5916a; i12++) {
                if (aVar3.j(i12) && (c2540a = aVar3.c(i12).f6465k) != null && c2540a.f() > 0) {
                    E0("  Metadata [");
                    J0(c2540a, "    ");
                    E0("  ]");
                    z9 = true;
                }
            }
        }
        E0("]");
    }

    @Override // P2.InterfaceC0986c
    public void k0(InterfaceC0986c.a aVar) {
        C0(aVar, "drmKeysLoaded");
    }

    @Override // P2.InterfaceC0986c
    public void l(InterfaceC0986c.a aVar, C0936z0 c0936z0, U2.h hVar) {
        D0(aVar, "audioInputFormat", C0936z0.k(c0936z0));
    }

    @Override // P2.InterfaceC0986c
    public void l0(InterfaceC0986c.a aVar, boolean z9) {
        D0(aVar, "skipSilenceEnabled", Boolean.toString(z9));
    }

    @Override // P2.InterfaceC0986c
    public void m(InterfaceC0986c.a aVar) {
        C0(aVar, "drmKeysRemoved");
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
    public void o(InterfaceC0986c.a aVar, int i9, int i10) {
        D0(aVar, "surfaceSize", i9 + ", " + i10);
    }

    @Override // P2.InterfaceC0986c
    public void o0(InterfaceC0986c.a aVar, C1737C c1737c) {
        D0(aVar, "videoSize", c1737c.f40178a + ", " + c1737c.f40179c);
    }

    @Override // P2.InterfaceC0986c
    public void p(InterfaceC0986c.a aVar, InterfaceC0920t1.e eVar, InterfaceC0920t1.e eVar2, int i9) {
        StringBuilder sb = new StringBuilder();
        sb.append("reason=");
        sb.append(b(i9));
        sb.append(", PositionInfo:old [");
        sb.append("mediaItem=");
        sb.append(eVar.f6252d);
        sb.append(", period=");
        sb.append(eVar.f6255g);
        sb.append(", pos=");
        sb.append(eVar.f6256h);
        if (eVar.f6258j != -1) {
            sb.append(", contentPos=");
            sb.append(eVar.f6257i);
            sb.append(", adGroup=");
            sb.append(eVar.f6258j);
            sb.append(", ad=");
            sb.append(eVar.f6259k);
        }
        sb.append("], PositionInfo:new [");
        sb.append("mediaItem=");
        sb.append(eVar2.f6252d);
        sb.append(", period=");
        sb.append(eVar2.f6255g);
        sb.append(", pos=");
        sb.append(eVar2.f6256h);
        if (eVar2.f6258j != -1) {
            sb.append(", contentPos=");
            sb.append(eVar2.f6257i);
            sb.append(", adGroup=");
            sb.append(eVar2.f6258j);
            sb.append(", ad=");
            sb.append(eVar2.f6259k);
        }
        sb.append("]");
        D0(aVar, "positionDiscontinuity", sb.toString());
    }

    @Override // P2.InterfaceC0986c
    public void p0(InterfaceC0986c.a aVar, C0512u c0512u, C0515x c0515x) {
    }

    @Override // P2.InterfaceC0986c
    public void q(InterfaceC0986c.a aVar, U2.e eVar) {
        C0(aVar, "audioEnabled");
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
    public void s0(InterfaceC0986c.a aVar, U2.e eVar) {
        C0(aVar, "audioDisabled");
    }

    @Override // P2.InterfaceC0986c
    public void t(InterfaceC0986c.a aVar, C0917s1 c0917s1) {
        D0(aVar, "playbackParameters", c0917s1.toString());
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void t0(InterfaceC0986c.a aVar, String str, long j9, long j10) {
        AbstractC0985b.d0(this, aVar, str, j9, j10);
    }

    @Override // P2.InterfaceC0986c
    public void u(InterfaceC0986c.a aVar, String str, long j9) {
        D0(aVar, "videoDecoderInitialized", str);
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void u0(InterfaceC0920t1 interfaceC0920t1, InterfaceC0986c.b bVar) {
        AbstractC0985b.z(this, interfaceC0920t1, bVar);
    }

    public final String v(InterfaceC0986c.a aVar, String str, String str2, Throwable th) {
        String str3 = str + " [" + x(aVar);
        if (th instanceof C0909p1) {
            str3 = str3 + ", errorCode=" + ((C0909p1) th).d();
        }
        if (str2 != null) {
            str3 = str3 + ", " + str2;
        }
        String strF = AbstractC1681B.f(th);
        if (!TextUtils.isEmpty(strF)) {
            str3 = str3 + "\n  " + strF.replace("\n", "\n  ") + '\n';
        }
        return str3 + "]";
    }

    @Override // P2.InterfaceC0986c
    public /* synthetic */ void w(InterfaceC0986c.a aVar, InterfaceC0920t1.b bVar) {
        AbstractC0985b.m(this, aVar, bVar);
    }

    public final String x(InterfaceC0986c.a aVar) {
        String str = "window=" + aVar.f7009c;
        if (aVar.f7010d != null) {
            str = str + ", period=" + aVar.f7008b.f(aVar.f7010d.f271a);
            if (aVar.f7010d.b()) {
                str = (str + ", adGroup=" + aVar.f7010d.f272b) + ", ad=" + aVar.f7010d.f273c;
            }
        }
        return "eventTime=" + z0(aVar.f7007a - this.f39804d) + ", mediaPos=" + z0(aVar.f7011e) + ", " + str;
    }

    @Override // P2.InterfaceC0986c
    public void y(InterfaceC0986c.a aVar, C0512u c0512u, C0515x c0515x) {
    }

    @Override // P2.InterfaceC0986c
    public void z(InterfaceC0986c.a aVar, int i9) {
        D0(aVar, "repeatMode", x0(i9));
    }
}
