package w4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;

/* JADX INFO: renamed from: w4.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2926n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C2926n f51671c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f51672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile String f51673b;

    public C2926n(Context context) {
        this.f51672a = context.getApplicationContext();
    }

    public static C2926n a(Context context) {
        com.google.android.gms.common.internal.r.m(context);
        synchronized (C2926n.class) {
            try {
                if (f51671c == null) {
                    E.d(context);
                    f51671c = new C2926n(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f51671c;
    }

    public static final AbstractBinderC2912A d(PackageInfo packageInfo, AbstractBinderC2912A... abstractBinderC2912AArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            B b9 = new B(packageInfo.signatures[0].toByteArray());
            for (int i9 = 0; i9 < abstractBinderC2912AArr.length; i9++) {
                if (abstractBinderC2912AArr[i9].equals(b9)) {
                    return abstractBinderC2912AArr[i9];
                }
            }
        }
        return null;
    }

    public static final boolean e(PackageInfo packageInfo, boolean z9) {
        PackageInfo packageInfo2;
        if (!z9) {
            packageInfo2 = packageInfo;
        } else if (packageInfo != null) {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z9 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            packageInfo2 = packageInfo;
        } else {
            packageInfo2 = null;
        }
        if (packageInfo != null && packageInfo2.signatures != null) {
            AbstractBinderC2912A[] abstractBinderC2912AArr = D.f51616a;
            if ((z9 ? d(packageInfo2, abstractBinderC2912AArr) : d(packageInfo2, abstractBinderC2912AArr[0])) != null) {
                return true;
            }
        }
        return false;
    }

    public boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (e(packageInfo, false)) {
            return true;
        }
        if (e(packageInfo, true)) {
            if (AbstractC2925m.g(this.f51672a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public boolean c(int i9) {
        O oC;
        int length;
        String[] packagesForUid = this.f51672a.getPackageManager().getPackagesForUid(i9);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            oC = null;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    com.google.android.gms.common.internal.r.m(oC);
                    break;
                }
                oC = f(packagesForUid[i10], false, false);
                if (oC.f51640a) {
                    break;
                }
                i10++;
            }
        } else {
            oC = O.c("no pkgs");
        }
        oC.e();
        return oC.f51640a;
    }

    public final O f(String str, boolean z9, boolean z10) {
        O oC;
        ApplicationInfo applicationInfo;
        String str2 = "null pkg";
        if (str == null) {
            return O.c("null pkg");
        }
        if (str.equals(this.f51673b)) {
            return O.b();
        }
        if (E.e()) {
            oC = E.b(str, AbstractC2925m.g(this.f51672a), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.f51672a.getPackageManager().getPackageInfo(str, 64);
                boolean zG = AbstractC2925m.g(this.f51672a);
                if (packageInfo != null) {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        str2 = "single cert required";
                    } else {
                        B b9 = new B(packageInfo.signatures[0].toByteArray());
                        String str3 = packageInfo.packageName;
                        O oA = E.a(str3, b9, zG, false);
                        if (!oA.f51640a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !E.a(str3, b9, false, true).f51640a) {
                            oC = oA;
                        } else {
                            str2 = "debuggable release cert app rejected";
                        }
                    }
                    oC = O.c(str2);
                } else {
                    oC = O.c(str2);
                }
            } catch (PackageManager.NameNotFoundException e9) {
                return O.d("no pkg ".concat(str), e9);
            }
        }
        if (oC.f51640a) {
            this.f51673b = str;
        }
        return oC;
    }
}
