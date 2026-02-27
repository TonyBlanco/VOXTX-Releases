package w4;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import okio.Segment;

/* JADX INFO: renamed from: w4.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2925m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f51666a = 12451000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f51668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f51669d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f51667b = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f51670e = new AtomicBoolean();

    public static void a(Context context) {
        if (f51667b.getAndSet(true)) {
            return;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
            if (notificationManager != null) {
                notificationManager.cancel(10436);
            }
        } catch (SecurityException e9) {
            Log.d("GooglePlayServicesUtil", "Suppressing Security Exception %s in cancelAvailabilityErrorNotifications.", e9);
        }
    }

    public static void b(Context context, int i9) throws C2923k, C2922j {
        int iJ = C2921i.h().j(context, i9);
        if (iJ != 0) {
            Intent intentD = C2921i.h().d(context, iJ, "e");
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + iJ);
            if (intentD != null) {
                throw new C2923k(iJ, "Google Play Services not available", intentD);
            }
            throw new C2922j(iJ);
        }
    }

    public static int c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    public static String d(int i9) {
        return C2914b.M(i9);
    }

    public static Context e(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static Resources f(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean g(Context context) {
        if (!f51669d) {
            try {
                try {
                    PackageInfo packageInfoE = E4.e.a(context).e("com.google.android.gms", 64);
                    C2926n.a(context);
                    if (packageInfoE == null || C2926n.e(packageInfoE, false) || !C2926n.e(packageInfoE, true)) {
                        f51668c = false;
                    } else {
                        f51668c = true;
                    }
                } catch (PackageManager.NameNotFoundException e9) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e9);
                }
                f51669d = true;
            } catch (Throwable th) {
                f51669d = true;
                throw th;
            }
        }
        return f51668c || !C4.i.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int h(android.content.Context r10, int r11) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.AbstractC2925m.h(android.content.Context, int):int");
    }

    public static boolean i(Context context, int i9) {
        if (i9 == 18) {
            return true;
        }
        if (i9 == 1) {
            return m(context, "com.google.android.gms");
        }
        return false;
    }

    public static boolean j(Context context) {
        if (!C4.m.c()) {
            return false;
        }
        Object systemService = context.getSystemService("user");
        com.google.android.gms.common.internal.r.m(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    public static boolean k(int i9) {
        return i9 == 1 || i9 == 2 || i9 == 3 || i9 == 9;
    }

    public static boolean l(Context context, int i9, String str) {
        return C4.p.b(context, i9, str);
    }

    public static boolean m(Context context, String str) {
        ApplicationInfo applicationInfo;
        boolean zEquals = str.equals("com.google.android.gms");
        if (C4.m.f()) {
            try {
                Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, Segment.SIZE);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return zEquals ? applicationInfo.enabled : applicationInfo.enabled && !j(context);
    }
}
