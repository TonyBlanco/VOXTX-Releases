package a1;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f11454a = Q0.k.f("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z9) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z9 ? 1 : 2, 1);
            Q0.k.c().a(f11454a, String.format("%s %s", cls.getName(), z9 ? "enabled" : "disabled"), new Throwable[0]);
        } catch (Exception e9) {
            Q0.k.c().a(f11454a, String.format("%s could not be %s", cls.getName(), z9 ? "enabled" : "disabled"), e9);
        }
    }
}
