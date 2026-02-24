package E4;

import C4.m;
import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f1695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f1696b;

    public static synchronized boolean a(Context context) {
        Boolean boolValueOf;
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f1695a;
        if (context2 != null && (bool = f1696b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f1696b = null;
        if (!m.i()) {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f1696b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                boolValueOf = Boolean.FALSE;
                f1696b = boolValueOf;
            }
            f1695a = applicationContext;
            return f1696b.booleanValue();
        }
        boolValueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        f1696b = boolValueOf;
        f1695a = applicationContext;
        return f1696b.booleanValue();
    }
}
