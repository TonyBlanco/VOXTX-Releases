package D;

import android.os.Bundle;
import android.os.IBinder;

/* JADX INFO: renamed from: D.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0524g {

    /* JADX INFO: renamed from: D.g$a */
    public static class a {
        public static IBinder a(Bundle bundle, String str) {
            return bundle.getBinder(str);
        }

        public static void b(Bundle bundle, String str, IBinder iBinder) {
            bundle.putBinder(str, iBinder);
        }
    }

    public static IBinder a(Bundle bundle, String str) {
        return a.a(bundle, str);
    }

    public static void b(Bundle bundle, String str, IBinder iBinder) {
        a.b(bundle, str, iBinder);
    }
}
