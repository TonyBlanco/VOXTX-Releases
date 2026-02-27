package r4;

import android.text.format.DateUtils;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.internal.r;
import java.text.DateFormat;
import java.util.Date;
import n4.C2281m;
import n4.C2284p;
import p4.C2434i;

/* JADX INFO: renamed from: r4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2662c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C2434i f49704a;

    public static C2662c f() {
        return new C2662c();
    }

    public static final String p(long j9) {
        return j9 >= 0 ? DateUtils.formatElapsedTime(j9 / 1000) : "-".concat(String.valueOf(DateUtils.formatElapsedTime((-j9) / 1000)));
    }

    public final int a() {
        C2434i c2434i = this.f49704a;
        if (c2434i == null || !c2434i.q()) {
            return 0;
        }
        C2434i c2434i2 = this.f49704a;
        if (!c2434i2.s() && c2434i2.t()) {
            return 0;
        }
        int iG = (int) (c2434i2.g() - e());
        if (c2434i2.r0()) {
            int iD = d();
            iG = Math.min(Math.max(iG, iD), c());
        }
        return Math.min(Math.max(iG, 0), b());
    }

    public final int b() {
        long jG;
        MediaInfo mediaInfoL;
        C2434i c2434i = this.f49704a;
        long jLongValue = 1;
        if (c2434i != null && c2434i.q()) {
            C2434i c2434i2 = this.f49704a;
            if (c2434i2.s()) {
                Long lI = i();
                if (lI == null && (lI = g()) == null) {
                    jG = c2434i2.g();
                    jLongValue = Math.max(jG, 1L);
                } else {
                    jLongValue = lI.longValue();
                }
            } else {
                if (c2434i2.t()) {
                    C2284p c2284pI = c2434i2.i();
                    if (c2284pI != null && (mediaInfoL = c2284pI.L()) != null) {
                        jG = mediaInfoL.S();
                    }
                } else {
                    jG = c2434i2.p();
                }
                jLongValue = Math.max(jG, 1L);
            }
        }
        return Math.max((int) (jLongValue - e()), 1);
    }

    public final int c() {
        C2434i c2434i = this.f49704a;
        if (c2434i == null || !c2434i.q() || !this.f49704a.s()) {
            return b();
        }
        if (!this.f49704a.r0()) {
            return 0;
        }
        long jLongValue = ((Long) r.m(g())).longValue() - e();
        return Math.min(Math.max((int) jLongValue, 0), b());
    }

    public final int d() {
        C2434i c2434i = this.f49704a;
        if (c2434i == null || !c2434i.q() || !this.f49704a.s() || !this.f49704a.r0()) {
            return 0;
        }
        long jLongValue = ((Long) r.m(h())).longValue() - e();
        return Math.min(Math.max((int) jLongValue, 0), b());
    }

    public final long e() {
        C2434i c2434i = this.f49704a;
        if (c2434i == null || !c2434i.q() || !this.f49704a.s()) {
            return 0L;
        }
        C2434i c2434i2 = this.f49704a;
        Long lJ = j();
        if (lJ != null) {
            return lJ.longValue();
        }
        Long lH = h();
        return lH != null ? lH.longValue() : c2434i2.g();
    }

    public final Long g() {
        C2434i c2434i;
        n4.r rVarL;
        C2434i c2434i2 = this.f49704a;
        if (c2434i2 == null || !c2434i2.q() || !this.f49704a.s() || !this.f49704a.r0() || (rVarL = (c2434i = this.f49704a).l()) == null || rVarL.Q() == null) {
            return null;
        }
        return Long.valueOf(c2434i.e());
    }

    public final Long h() {
        C2434i c2434i;
        n4.r rVarL;
        C2434i c2434i2 = this.f49704a;
        if (c2434i2 == null || !c2434i2.q() || !this.f49704a.s() || !this.f49704a.r0() || (rVarL = (c2434i = this.f49704a).l()) == null || rVarL.Q() == null) {
            return null;
        }
        return Long.valueOf(c2434i.f());
    }

    public final Long i() {
        C2281m c2281mO;
        Long lJ;
        C2434i c2434i = this.f49704a;
        if (c2434i == null || !c2434i.q() || !this.f49704a.s() || (c2281mO = o()) == null || !c2281mO.e("com.google.android.gms.cast.metadata.SECTION_DURATION") || (lJ = j()) == null) {
            return null;
        }
        return Long.valueOf(lJ.longValue() + c2281mO.K("com.google.android.gms.cast.metadata.SECTION_DURATION"));
    }

    public final Long j() {
        C2434i c2434i = this.f49704a;
        if (c2434i != null && c2434i.q() && this.f49704a.s()) {
            C2434i c2434i2 = this.f49704a;
            MediaInfo mediaInfoJ = c2434i2.j();
            C2281m c2281mO = o();
            if (mediaInfoJ != null && c2281mO != null && c2281mO.e("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA") && (c2281mO.e("com.google.android.gms.cast.metadata.SECTION_DURATION") || c2434i2.r0())) {
                return Long.valueOf(c2281mO.K("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA"));
            }
        }
        return null;
    }

    public final Long k() {
        MediaInfo mediaInfoJ;
        C2434i c2434i = this.f49704a;
        if (c2434i == null || !c2434i.q() || !this.f49704a.s() || (mediaInfoJ = this.f49704a.j()) == null || mediaInfoJ.R() == -1) {
            return null;
        }
        return Long.valueOf(mediaInfoJ.R());
    }

    public final String l(long j9) {
        C2434i c2434i = this.f49704a;
        if (c2434i == null || !c2434i.q()) {
            return null;
        }
        C2434i c2434i2 = this.f49704a;
        if (((c2434i2 == null || !c2434i2.q() || !this.f49704a.s() || k() == null) ? 1 : 2) - 1 != 1) {
            return (c2434i2.s() && j() == null) ? p(j9) : p(j9 - e());
        }
        return DateFormat.getTimeInstance().format(new Date(((Long) r.m(k())).longValue() + j9));
    }

    public final boolean m() {
        return n(((long) a()) + e());
    }

    public final boolean n(long j9) {
        C2434i c2434i = this.f49704a;
        return c2434i != null && c2434i.q() && this.f49704a.r0() && (((long) c()) + e()) - j9 < 10000;
    }

    public final C2281m o() {
        MediaInfo mediaInfoJ;
        C2434i c2434i = this.f49704a;
        if (c2434i == null || !c2434i.q() || (mediaInfoJ = this.f49704a.j()) == null) {
            return null;
        }
        return mediaInfoJ.Q();
    }
}
