package M4;

import android.content.pm.PackageManager;
import android.util.Pair;
import h4.C1858a;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: M4.l4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0778l4 extends E4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f4836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final L1 f4837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final L1 f4838f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final L1 f4839g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final L1 f4840h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final L1 f4841i;

    public C0778l4(S4 s42) {
        super(s42);
        this.f4836d = new HashMap();
        P1 p1F = this.f4245a.F();
        p1F.getClass();
        this.f4837e = new L1(p1F, "last_delete_stale", 0L);
        P1 p1F2 = this.f4245a.F();
        p1F2.getClass();
        this.f4838f = new L1(p1F2, "backoff", 0L);
        P1 p1F3 = this.f4245a.F();
        p1F3.getClass();
        this.f4839g = new L1(p1F3, "last_upload", 0L);
        P1 p1F4 = this.f4245a.F();
        p1F4.getClass();
        this.f4840h = new L1(p1F4, "last_upload_attempt", 0L);
        P1 p1F5 = this.f4245a.F();
        p1F5.getClass();
        this.f4841i = new L1(p1F5, "midnight_offset", 0L);
    }

    @Override // M4.E4
    public final boolean l() {
        return false;
    }

    public final Pair m(String str) {
        C0772k4 c0772k4;
        C1858a.C0341a c0341aA;
        h();
        long jB = this.f4245a.a().b();
        C0772k4 c0772k42 = (C0772k4) this.f4836d.get(str);
        if (c0772k42 != null && jB < c0772k42.f4780c) {
            return new Pair(c0772k42.f4778a, Boolean.valueOf(c0772k42.f4779b));
        }
        C1858a.c(true);
        long jR = this.f4245a.z().r(str, AbstractC0781m1.f4888c) + jB;
        try {
            long jR2 = this.f4245a.z().r(str, AbstractC0781m1.f4890d);
            if (jR2 > 0) {
                try {
                    c0341aA = C1858a.a(this.f4245a.c());
                } catch (PackageManager.NameNotFoundException unused) {
                    if (c0772k42 != null && jB < c0772k42.f4780c + jR2) {
                        return new Pair(c0772k42.f4778a, Boolean.valueOf(c0772k42.f4779b));
                    }
                    c0341aA = null;
                }
            } else {
                c0341aA = C1858a.a(this.f4245a.c());
            }
        } catch (Exception e9) {
            this.f4245a.d().q().b("Unable to get advertising id", e9);
            c0772k4 = new C0772k4("", false, jR);
        }
        if (c0341aA == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String strA = c0341aA.a();
        c0772k4 = strA != null ? new C0772k4(strA, c0341aA.b(), jR) : new C0772k4("", c0341aA.b(), jR);
        this.f4836d.put(str, c0772k4);
        C1858a.c(false);
        return new Pair(c0772k4.f4778a, Boolean.valueOf(c0772k4.f4779b));
    }

    public final Pair n(String str, K2 k22) {
        return k22.j(J2.AD_STORAGE) ? m(str) : new Pair("", Boolean.FALSE);
    }

    public final String o(String str, boolean z9) {
        h();
        String str2 = z9 ? (String) m(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestT = a5.t();
        if (messageDigestT == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestT.digest(str2.getBytes())));
    }
}
