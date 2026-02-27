package C4;

import android.content.Context;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f1137a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    public static boolean a(Context context, Throwable th) {
        try {
            com.google.android.gms.common.internal.r.m(context);
            com.google.android.gms.common.internal.r.m(th);
            return false;
        } catch (Exception e9) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e9);
            return false;
        }
    }
}
