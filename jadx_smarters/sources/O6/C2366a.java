package o6;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import g6.c;

/* JADX INFO: renamed from: o6.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2366a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f46126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f46127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f46128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f46129d;

    public C2366a(Context context, String str, c cVar) {
        Context contextA = a(context);
        this.f46126a = contextA;
        this.f46127b = contextA.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f46128c = cVar;
        this.f46129d = c();
    }

    public static Context a(Context context) {
        return Build.VERSION.SDK_INT < 24 ? context : E.b.createDeviceProtectedStorageContext(context);
    }

    public synchronized boolean b() {
        return this.f46129d;
    }

    public final boolean c() {
        return this.f46127b.contains("firebase_data_collection_default_enabled") ? this.f46127b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    public final boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f46126a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f46126a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
