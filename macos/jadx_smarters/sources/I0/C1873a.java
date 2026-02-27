package i0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;

/* JADX INFO: renamed from: i0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1873a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C1873a f41782c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f41783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f41784b;

    /* JADX INFO: renamed from: i0.a$a, reason: collision with other inner class name */
    public static class C0344a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Resources f41785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f41786b;

        public C0344a(Resources resources, String str) {
            this.f41785a = resources;
            this.f41786b = str;
        }

        public boolean a(String str, boolean z9) {
            int identifier = this.f41785a.getIdentifier(str, "bool", this.f41786b);
            return identifier > 0 ? this.f41785a.getBoolean(identifier) : z9;
        }
    }

    public C1873a(Context context) {
        a(b(context));
    }

    public static C1873a c(Context context) {
        if (f41782c == null) {
            f41782c = new C1873a(context);
        }
        return f41782c;
    }

    public static boolean e(ResolveInfo resolveInfo) {
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        return (activityInfo == null || (activityInfo.applicationInfo.flags & 1) == 0) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(i0.C1873a.C0344a r3) {
        /*
            r2 = this;
            boolean r0 = androidx.leanback.widget.P.b()
            r1 = 0
            if (r0 == 0) goto L14
            r2.f41783a = r1
            if (r3 == 0) goto L16
            java.lang.String r0 = "leanback_prefer_static_shadows"
            boolean r0 = r3.a(r0, r1)
        L11:
            r2.f41783a = r0
            goto L16
        L14:
            r0 = 1
            goto L11
        L16:
            r2.f41784b = r1
            if (r3 == 0) goto L22
            java.lang.String r0 = "leanback_outline_clipping_disabled"
            boolean r3 = r3.a(r0, r1)
            r2.f41784b = r3
        L22:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.C1873a.a(i0.a$a):void");
    }

    public final C0344a b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Resources resourcesForApplication = null;
        String str = null;
        for (ResolveInfo resolveInfo : packageManager.queryBroadcastReceivers(new Intent("android.support.v17.leanback.action.PARTNER_CUSTOMIZATION"), 0)) {
            String str2 = resolveInfo.activityInfo.packageName;
            if (str2 != null && e(resolveInfo)) {
                try {
                    resourcesForApplication = packageManager.getResourcesForApplication(str2);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            str = str2;
            if (resourcesForApplication != null) {
                break;
            }
        }
        if (resourcesForApplication == null) {
            return null;
        }
        return new C0344a(resourcesForApplication, str);
    }

    public boolean d() {
        return this.f41784b;
    }

    public boolean f() {
        return this.f41783a;
    }
}
