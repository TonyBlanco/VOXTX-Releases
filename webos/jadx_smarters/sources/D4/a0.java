package d4;

import android.os.Trace;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a0 {
    public static void a(String str) {
        if (k0.f39777a >= 18) {
            b(str);
        }
    }

    public static void b(String str) {
        Trace.beginSection(str);
    }

    public static void c() {
        if (k0.f39777a >= 18) {
            d();
        }
    }

    public static void d() {
        Trace.endSection();
    }
}
