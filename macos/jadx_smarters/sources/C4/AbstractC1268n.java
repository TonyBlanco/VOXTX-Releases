package c4;

import android.net.Uri;

/* JADX INFO: renamed from: c4.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC1268n {
    public static long a(InterfaceC1269o interfaceC1269o) {
        return interfaceC1269o.a("exo_len", -1L);
    }

    public static Uri b(InterfaceC1269o interfaceC1269o) {
        String strB = interfaceC1269o.b("exo_redir", null);
        if (strB == null) {
            return null;
        }
        return Uri.parse(strB);
    }
}
