package pl.droidsonroids.gif;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f46733a;

    public static Context a() {
        if (f46733a == null) {
            try {
                f46733a = (Context) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", null).invoke(null, null);
            } catch (Exception e9) {
                throw new IllegalStateException("LibraryLoader not initialized. Call LibraryLoader.initialize() before using library classes.", e9);
            }
        }
        return f46733a;
    }

    public static void b() {
        try {
            System.loadLibrary("pl_droidsonroids_gif");
        } catch (UnsatisfiedLinkError unused) {
            O8.c.a(a(), "pl_droidsonroids_gif");
        }
    }
}
