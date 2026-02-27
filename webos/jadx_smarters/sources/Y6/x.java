package Y6;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {
    public static void a() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Must be called from the main thread.");
        }
    }
}
