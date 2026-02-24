package K3;

import android.net.Uri;
import b4.C1227s;
import d4.k0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i {
    public static C1227s a(int i9) {
        return new C1227s(Uri.parse(k0.D("%s:%d", "rtp://0.0.0.0", Integer.valueOf(i9))));
    }
}
