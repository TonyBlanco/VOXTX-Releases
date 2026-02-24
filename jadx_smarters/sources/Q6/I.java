package q6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f46960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f46961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f46962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f46964e = 0;

    public I(Context context) {
        this.f46960a = context;
    }

    public static String c(A5.f fVar) {
        String strD = fVar.p().d();
        if (strD != null) {
            return strD;
        }
        String strC = fVar.p().c();
        if (!strC.startsWith("1:")) {
            return strC;
        }
        String[] strArrSplit = strC.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    public synchronized String a() {
        try {
            if (this.f46961b == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f46961b;
    }

    public synchronized String b() {
        try {
            if (this.f46962c == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f46962c;
    }

    public synchronized int d() {
        PackageInfo packageInfoF;
        try {
            if (this.f46963d == 0 && (packageInfoF = f("com.google.android.gms")) != null) {
                this.f46963d = packageInfoF.versionCode;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f46963d;
    }

    public synchronized int e() {
        int i9 = this.f46964e;
        if (i9 != 0) {
            return i9;
        }
        PackageManager packageManager = this.f46960a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i10 = 1;
        if (!C4.m.i()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.f46964e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.f46964e = 2;
            return 2;
        }
        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        if (C4.m.i()) {
            this.f46964e = 2;
            i10 = 2;
        } else {
            this.f46964e = 1;
        }
        return i10;
    }

    public final PackageInfo f(String str) {
        try {
            return this.f46960a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e9) {
            Log.w("FirebaseMessaging", "Failed to find package ".concat(e9.toString()));
            return null;
        }
    }

    public boolean g() {
        return e() != 0;
    }

    public final synchronized void h() {
        PackageInfo packageInfoF = f(this.f46960a.getPackageName());
        if (packageInfoF != null) {
            this.f46961b = Integer.toString(packageInfoF.versionCode);
            this.f46962c = packageInfoF.versionName;
        }
    }
}
