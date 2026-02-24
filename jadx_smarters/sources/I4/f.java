package I4;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.internal.flags.zzd;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static SharedPreferences f2844a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (f2844a == null) {
                    f2844a = (SharedPreferences) zzd.zza(new e(context));
                }
                sharedPreferences = f2844a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sharedPreferences;
    }
}
