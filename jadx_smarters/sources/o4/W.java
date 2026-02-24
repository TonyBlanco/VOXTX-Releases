package o4;

import android.content.Context;
import android.preference.PreferenceManager;

/* JADX INFO: loaded from: classes3.dex */
public abstract class W {
    public static void a(Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("googlecast-introOverlayShown", true).apply();
    }
}
