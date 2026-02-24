package C4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import w4.C2926n;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p {
    public static boolean a(Context context, int i9) {
        if (!b(context, i9, "com.google.android.gms")) {
            return false;
        }
        try {
            return C2926n.a(context).b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            if (!Log.isLoggable("UidVerifier", 3)) {
                return false;
            }
            Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            return false;
        }
    }

    public static boolean b(Context context, int i9, String str) {
        return E4.e.a(context).g(i9, str);
    }
}
