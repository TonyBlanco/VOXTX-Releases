package t4;

import android.content.Context;

/* JADX INFO: renamed from: t4.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2793u {
    public static boolean a(Context context) {
        return E.b.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
    }
}
