package M4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.amazonaws.services.s3.internal.Constants;
import com.google.android.gms.internal.measurement.zzpz;
import com.google.android.gms.internal.measurement.zzqu;
import com.google.android.gms.internal.measurement.zzrj;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
import java.util.Locale;
import org.achartengine.chart.TimeChart;

/* JADX INFO: renamed from: M4.q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0805q1 extends G1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f5003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f5004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f5006f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f5007g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f5008h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f5009i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f5010j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f5011k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5012l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f5013m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f5014n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f5015o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f5016p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f5017q;

    public C0805q1(C0776l2 c0776l2, long j9) {
        super(c0776l2);
        this.f5016p = 0L;
        this.f5017q = null;
        this.f5009i = j9;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:0|2|(1:4)(22:92|6|(1:10)(2:11|(1:13))|86|14|(4:16|(1:18)(1:20)|90|21)|26|(1:31)(1:30)|32|SW:33|35|44|(1:46)|88|47|(1:49)(1:50)|51|(3:53|(1:55)(1:56)|57)|(3:61|(1:63)(1:64)|65)|68|(2:71|(1:73)(4:74|(3:77|(1:95)(1:96)|75)|94|80))(1:80)|(2:82|83)(2:84|85))|5|26|(2:28|31)(0)|32|SW:33|35|44|(0)|88|47|(0)(0)|51|(0)|(0)|68|(0)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0173, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0196, code lost:
    
        r11.f4245a.d().r().c("Fetching Google App Id failed with exception. appId", M4.C0858z1.z(r0), r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014c A[Catch: IllegalStateException -> 0x0173, TryCatch #1 {IllegalStateException -> 0x0173, blocks: (B:47:0x012a, B:51:0x0144, B:53:0x014c, B:57:0x016a, B:56:0x0166, B:61:0x0177, B:63:0x018d, B:65:0x0192, B:64:0x0190), top: B:88:0x012a }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0177 A[Catch: IllegalStateException -> 0x0173, TryCatch #1 {IllegalStateException -> 0x0173, blocks: (B:47:0x012a, B:51:0x0144, B:53:0x014c, B:57:0x016a, B:56:0x0166, B:61:0x0177, B:63:0x018d, B:65:0x0192, B:64:0x0190), top: B:88:0x012a }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0206  */
    @Override // M4.G1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() {
        /*
            Method dump skipped, instruction units count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.C0805q1.l():void");
    }

    @Override // M4.G1
    public final boolean n() {
        return true;
    }

    public final int o() {
        i();
        return this.f5012l;
    }

    public final int p() {
        i();
        return this.f5005e;
    }

    public final f5 q(String str) {
        String str2;
        C0846x1 c0846x1Y;
        String str3;
        String str4;
        List list;
        long j9;
        String str5;
        long j10;
        long j11;
        ApplicationInfo applicationInfoC;
        h();
        String strS = s();
        String strT = t();
        i();
        String str6 = this.f5004d;
        i();
        long j12 = this.f5005e;
        i();
        com.google.android.gms.common.internal.r.m(this.f5006f);
        String str7 = this.f5006f;
        this.f4245a.z().q();
        i();
        h();
        long j13 = this.f5008h;
        if (j13 == 0) {
            a5 a5VarN = this.f4245a.N();
            Context contextC = this.f4245a.c();
            String packageName = this.f4245a.c().getPackageName();
            a5VarN.h();
            com.google.android.gms.common.internal.r.m(contextC);
            com.google.android.gms.common.internal.r.g(packageName);
            PackageManager packageManager = contextC.getPackageManager();
            MessageDigest messageDigestT = a5.t();
            long jS0 = -1;
            if (messageDigestT == null) {
                a5VarN.f4245a.d().r().a("Could not get MD5 instance");
            } else {
                if (packageManager != null) {
                    try {
                        if (a5VarN.W(contextC, packageName)) {
                            jS0 = 0;
                        } else {
                            Signature[] signatureArr = E4.e.a(contextC).e(a5VarN.f4245a.c().getPackageName(), 64).signatures;
                            if (signatureArr == null || signatureArr.length <= 0) {
                                a5VarN.f4245a.d().w().a("Could not get signatures");
                            } else {
                                jS0 = a5.s0(messageDigestT.digest(signatureArr[0].toByteArray()));
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e9) {
                        a5VarN.f4245a.d().r().b("Package name not found", e9);
                        j13 = 0;
                    }
                }
                j13 = 0;
                this.f5008h = j13;
            }
            j13 = jS0;
            this.f5008h = j13;
        }
        long j14 = j13;
        boolean zO = this.f4245a.o();
        boolean z9 = !this.f4245a.F().f4416q;
        h();
        if (this.f4245a.o()) {
            zzrj.zzc();
            if (this.f4245a.z().B(null, AbstractC0781m1.f4893e0)) {
                this.f4245a.d().v().a("Disabled IID for tests.");
            } else {
                try {
                    Class<?> clsLoadClass = this.f4245a.c().getClassLoader().loadClass("TryRoom");
                    if (clsLoadClass != null) {
                        try {
                            Object objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, this.f4245a.c());
                            if (objInvoke == null) {
                                str2 = null;
                            } else {
                                try {
                                    str2 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                                } catch (Exception unused) {
                                    c0846x1Y = this.f4245a.d().x();
                                    str3 = "Failed to retrieve Firebase Instance Id";
                                    c0846x1Y.a(str3);
                                    str2 = null;
                                }
                            }
                        } catch (Exception unused2) {
                            c0846x1Y = this.f4245a.d().y();
                            str3 = "Failed to obtain Firebase Analytics instance";
                        }
                    }
                } catch (ClassNotFoundException unused3) {
                }
            }
            str2 = null;
        } else {
            str2 = null;
        }
        C0776l2 c0776l2 = this.f4245a;
        long jA = c0776l2.F().f4404e.a();
        long jMin = jA == 0 ? c0776l2.f4807G : Math.min(c0776l2.f4807G, jA);
        i();
        int i9 = this.f5012l;
        boolean zA = this.f4245a.z().A();
        P1 p1F = this.f4245a.F();
        p1F.h();
        boolean z10 = p1F.o().getBoolean("deferred_analytics_collection", false);
        i();
        String str8 = this.f5014n;
        Boolean boolValueOf = this.f4245a.z().t("google_analytics_default_allow_ad_personalization_signals") == null ? null : Boolean.valueOf(!r3.booleanValue());
        long j15 = this.f5009i;
        List list2 = this.f5010j;
        String strI = this.f4245a.F().q().i();
        if (this.f5011k == null) {
            this.f5011k = this.f4245a.N().q();
        }
        String str9 = this.f5011k;
        zzqu.zzc();
        if (this.f4245a.z().B(null, AbstractC0781m1.f4915p0)) {
            h();
            j9 = 0;
            if (this.f5016p == 0) {
                str4 = str8;
                list = list2;
            } else {
                str4 = str8;
                list = list2;
                long jA2 = this.f4245a.a().a() - this.f5016p;
                if (this.f5015o != null && jA2 > TimeChart.DAY && this.f5017q == null) {
                    v();
                }
            }
            if (this.f5015o == null) {
                v();
            }
            str5 = this.f5015o;
        } else {
            str4 = str8;
            list = list2;
            j9 = 0;
            str5 = null;
        }
        C0749h c0749hZ = this.f4245a.z();
        C0776l2 c0776l22 = c0749hZ.f4245a;
        Boolean boolT = c0749hZ.t("google_analytics_sgtm_upload_enabled");
        boolean zBooleanValue = boolT == null ? false : boolT.booleanValue();
        zzpz.zzc();
        if (this.f4245a.z().B(null, AbstractC0781m1.f4858F0)) {
            a5 a5VarN2 = this.f4245a.N();
            String strS2 = s();
            if (a5VarN2.f4245a.c().getPackageManager() == null) {
                j11 = j9;
            } else {
                try {
                    try {
                        applicationInfoC = E4.e.a(a5VarN2.f4245a.c()).c(strS2, 0);
                    } catch (PackageManager.NameNotFoundException unused4) {
                        a5VarN2.f4245a.b();
                        a5VarN2.f4245a.d().u().b("PackageManager failed to find running app: app_id", strS2);
                    }
                } catch (PackageManager.NameNotFoundException unused5) {
                }
                int i10 = applicationInfoC != null ? applicationInfoC.targetSdkVersion : 0;
                j11 = i10;
            }
            j10 = j11;
        } else {
            j10 = j9;
        }
        return new f5(strS, strT, str6, j12, str7, 79000L, j14, str, zO, z9, str2, 0L, jMin, i9, zA, z10, str4, boolValueOf, j15, list, (String) null, strI, str9, str5, zBooleanValue, j10);
    }

    public final String r() {
        i();
        return this.f5014n;
    }

    public final String s() {
        i();
        com.google.android.gms.common.internal.r.m(this.f5003c);
        return this.f5003c;
    }

    public final String t() {
        h();
        i();
        com.google.android.gms.common.internal.r.m(this.f5013m);
        return this.f5013m;
    }

    public final List u() {
        return this.f5010j;
    }

    public final void v() {
        String str;
        h();
        if (this.f4245a.F().q().j(J2.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            this.f4245a.N().u().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            this.f4245a.d().q().a("Analytics Storage consent is not granted");
            str = null;
        }
        this.f4245a.d().q().a(String.format("Resetting session stitching token to %s", str == null ? Constants.NULL_VERSION_ID : "not null"));
        this.f5015o = str;
        this.f5016p = this.f4245a.a().a();
    }

    public final boolean w(String str) {
        String str2 = this.f5017q;
        boolean z9 = false;
        if (str2 != null && !str2.equals(str)) {
            z9 = true;
        }
        this.f5017q = str;
        return z9;
    }
}
