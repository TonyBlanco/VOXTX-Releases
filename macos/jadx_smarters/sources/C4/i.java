package C4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import w4.AbstractC2925m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Boolean f1139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f1140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Boolean f1141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Boolean f1142d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f1142d == null) {
            boolean z9 = false;
            if (m.i() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z9 = true;
            }
            f1142d = Boolean.valueOf(z9);
        }
        return f1142d.booleanValue();
    }

    public static boolean b() {
        int i9 = AbstractC2925m.f51666a;
        return "user".equals(Build.TYPE);
    }

    public static boolean c(Context context) {
        return g(context.getPackageManager());
    }

    public static boolean d(Context context) {
        if (c(context) && !m.h()) {
            return true;
        }
        if (e(context)) {
            return !m.i() || m.l();
        }
        return false;
    }

    public static boolean e(Context context) {
        if (f1140b == null) {
            boolean z9 = false;
            if (m.f() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z9 = true;
            }
            f1140b = Boolean.valueOf(z9);
        }
        return f1140b.booleanValue();
    }

    public static boolean f(Context context) {
        if (f1141c == null) {
            boolean z9 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z9 = false;
            }
            f1141c = Boolean.valueOf(z9);
        }
        return f1141c.booleanValue();
    }

    public static boolean g(PackageManager packageManager) {
        if (f1139a == null) {
            boolean z9 = false;
            if (m.e() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z9 = true;
            }
            f1139a = Boolean.valueOf(z9);
        }
        return f1139a.booleanValue();
    }
}
