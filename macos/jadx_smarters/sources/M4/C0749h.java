package M4;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: M4.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0749h extends E2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f4716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC0743g f4717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f4718d;

    public C0749h(C0776l2 c0776l2) {
        super(c0776l2);
        this.f4717c = new InterfaceC0743g() { // from class: M4.f
            @Override // M4.InterfaceC0743g
            public final String e(String str, String str2) {
                return null;
            }
        };
    }

    public static final long I() {
        return ((Long) AbstractC0781m1.f4894f.a(null)).longValue();
    }

    public static final long i() {
        return ((Long) AbstractC0781m1.f4857F.a(null)).longValue();
    }

    public final boolean A() {
        Boolean boolT = t("google_analytics_adid_collection_enabled");
        return boolT == null || boolT.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean B(java.lang.String r4, M4.C0775l1 r5) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto Le
        L3:
            java.lang.Object r4 = r5.a(r0)
        L7:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        Le:
            M4.g r1 = r3.f4717c
            java.lang.String r2 = r5.b()
            java.lang.String r4 = r1.e(r4, r2)
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto L1f
            goto L3
        L1f:
            java.lang.String r0 = "1"
            boolean r4 = r0.equals(r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.Object r4 = r5.a(r4)
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.C0749h.B(java.lang.String, M4.l1):boolean");
    }

    public final boolean C(String str) {
        return "1".equals(this.f4717c.e(str, "gaia_collection_enabled"));
    }

    public final boolean D() {
        Boolean boolT = t("google_analytics_automatic_screen_reporting_enabled");
        return boolT == null || boolT.booleanValue();
    }

    public final boolean E() {
        this.f4245a.b();
        Boolean boolT = t("firebase_analytics_collection_deactivated");
        return boolT != null && boolT.booleanValue();
    }

    public final boolean F(String str) {
        return "1".equals(this.f4717c.e(str, "measurement.event_sampling_enabled"));
    }

    public final boolean G() {
        if (this.f4716b == null) {
            Boolean boolT = t("app_measurement_lite");
            this.f4716b = boolT;
            if (boolT == null) {
                this.f4716b = Boolean.FALSE;
            }
        }
        return this.f4716b.booleanValue() || !this.f4245a.s();
    }

    public final boolean H() {
        if (this.f4718d == null) {
            synchronized (this) {
                try {
                    if (this.f4718d == null) {
                        ApplicationInfo applicationInfo = this.f4245a.c().getApplicationInfo();
                        String strA = C4.n.a();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            boolean z9 = false;
                            if (str != null && str.equals(strA)) {
                                z9 = true;
                            }
                            this.f4718d = Boolean.valueOf(z9);
                        }
                        if (this.f4718d == null) {
                            this.f4718d = Boolean.TRUE;
                            this.f4245a.d().r().a("My process not in the list of running processes");
                        }
                    }
                } finally {
                }
            }
        }
        return this.f4718d.booleanValue();
    }

    public final String j(String str, String str2) {
        C0846x1 c0846x1R;
        String str3;
        try {
            String str4 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            com.google.android.gms.common.internal.r.m(str4);
            return str4;
        } catch (ClassNotFoundException e9) {
            e = e9;
            c0846x1R = this.f4245a.d().r();
            str3 = "Could not find SystemProperties class";
            c0846x1R.b(str3, e);
            return "";
        } catch (IllegalAccessException e10) {
            e = e10;
            c0846x1R = this.f4245a.d().r();
            str3 = "Could not access SystemProperties.get()";
            c0846x1R.b(str3, e);
            return "";
        } catch (NoSuchMethodException e11) {
            e = e11;
            c0846x1R = this.f4245a.d().r();
            str3 = "Could not find SystemProperties.get() method";
            c0846x1R.b(str3, e);
            return "";
        } catch (InvocationTargetException e12) {
            e = e12;
            c0846x1R = this.f4245a.d().r();
            str3 = "SystemProperties.get() threw an exception";
            c0846x1R.b(str3, e);
            return "";
        }
    }

    public final double k(String str, C0775l1 c0775l1) {
        if (str != null) {
            String strE = this.f4717c.e(str, c0775l1.b());
            if (!TextUtils.isEmpty(strE)) {
                try {
                    return ((Double) c0775l1.a(Double.valueOf(Double.parseDouble(strE)))).doubleValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Double) c0775l1.a(null)).doubleValue();
    }

    public final int l(String str) {
        return p(str, AbstractC0781m1.f4865J, 500, AdError.SERVER_ERROR_CODE);
    }

    public final int m() {
        return this.f4245a.N().X(201500000, true) ? 100 : 25;
    }

    public final int n(String str) {
        return p(str, AbstractC0781m1.f4867K, 25, 100);
    }

    public final int o(String str, C0775l1 c0775l1) {
        if (str != null) {
            String strE = this.f4717c.e(str, c0775l1.b());
            if (!TextUtils.isEmpty(strE)) {
                try {
                    return ((Integer) c0775l1.a(Integer.valueOf(Integer.parseInt(strE)))).intValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Integer) c0775l1.a(null)).intValue();
    }

    public final int p(String str, C0775l1 c0775l1, int i9, int i10) {
        return Math.max(Math.min(o(str, c0775l1), i10), i9);
    }

    public final long q() {
        this.f4245a.b();
        return 79000L;
    }

    public final long r(String str, C0775l1 c0775l1) {
        if (str != null) {
            String strE = this.f4717c.e(str, c0775l1.b());
            if (!TextUtils.isEmpty(strE)) {
                try {
                    return ((Long) c0775l1.a(Long.valueOf(Long.parseLong(strE)))).longValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Long) c0775l1.a(null)).longValue();
    }

    public final Bundle s() {
        try {
            if (this.f4245a.c().getPackageManager() == null) {
                this.f4245a.d().r().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoC = E4.e.a(this.f4245a.c()).c(this.f4245a.c().getPackageName(), 128);
            if (applicationInfoC != null) {
                return applicationInfoC.metaData;
            }
            this.f4245a.d().r().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e9) {
            this.f4245a.d().r().b("Failed to load metadata: Package name not found", e9);
            return null;
        }
    }

    public final Boolean t(String str) {
        com.google.android.gms.common.internal.r.g(str);
        Bundle bundleS = s();
        if (bundleS == null) {
            this.f4245a.d().r().a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleS.containsKey(str)) {
            return Boolean.valueOf(bundleS.getBoolean(str));
        }
        return null;
    }

    public final String u() {
        return j("debug.firebase.analytics.app", "");
    }

    public final String v() {
        return j("debug.deferred.deeplink", "");
    }

    public final String w() {
        this.f4245a.b();
        return "FA";
    }

    public final String x(String str, C0775l1 c0775l1) {
        return (String) c0775l1.a(str == null ? null : this.f4717c.e(str, c0775l1.b()));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List y(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            com.google.android.gms.common.internal.r.g(r4)
            android.os.Bundle r0 = r3.s()
            r1 = 0
            if (r0 != 0) goto L1d
            M4.l2 r4 = r3.f4245a
            M4.z1 r4 = r4.d()
            M4.x1 r4 = r4.r()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
        L1b:
            r4 = r1
            goto L2c
        L1d:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L24
            goto L1b
        L24:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L2c:
            if (r4 == 0) goto L58
            M4.l2 r0 = r3.f4245a     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.Context r0 = r0.c()     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L48
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L48
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            if (r4 != 0) goto L43
            return r1
        L43:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            return r4
        L48:
            r4 = move-exception
            M4.l2 r0 = r3.f4245a
            M4.z1 r0 = r0.d()
            M4.x1 r0 = r0.r()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.b(r2, r4)
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.C0749h.y(java.lang.String):java.util.List");
    }

    public final void z(InterfaceC0743g interfaceC0743g) {
        this.f4717c = interfaceC0743g;
    }
}
