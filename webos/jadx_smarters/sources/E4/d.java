package E4;

import C4.m;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1697a;

    public d(Context context) {
        this.f1697a = context;
    }

    public int a(String str) {
        return this.f1697a.checkCallingOrSelfPermission(str);
    }

    public int b(String str, String str2) {
        return this.f1697a.getPackageManager().checkPermission(str, str2);
    }

    public ApplicationInfo c(String str, int i9) {
        return this.f1697a.getPackageManager().getApplicationInfo(str, i9);
    }

    public CharSequence d(String str) {
        Context context = this.f1697a;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    public PackageInfo e(String str, int i9) {
        return this.f1697a.getPackageManager().getPackageInfo(str, i9);
    }

    public boolean f() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return b.a(this.f1697a);
        }
        if (!m.i() || (nameForUid = this.f1697a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f1697a.getPackageManager().isInstantApp(nameForUid);
    }

    public final boolean g(int i9, String str) {
        if (m.d()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.f1697a.getSystemService("appops");
                if (appOpsManager == null) {
                    throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
                }
                appOpsManager.checkPackage(i9, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        }
        String[] packagesForUid = this.f1697a.getPackageManager().getPackagesForUid(i9);
        if (str != null && packagesForUid != null) {
            for (String str2 : packagesForUid) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
