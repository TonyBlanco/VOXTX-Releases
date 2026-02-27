package i1;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Must be invoked from the main thread.");
        }
    }
}
