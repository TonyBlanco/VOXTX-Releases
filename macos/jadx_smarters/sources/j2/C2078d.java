package j2;

import android.content.Context;
import j2.InterfaceC2077c;

/* JADX INFO: renamed from: j2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2078d {
    public InterfaceC2077c a(Context context, InterfaceC2077c.a aVar) {
        return context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 ? new C2079e(context, aVar) : new C2083i();
    }
}
