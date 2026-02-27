package K;

import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: K.a$a, reason: collision with other inner class name */
    public static class C0053a {
        public static boolean a(ConnectivityManager connectivityManager) {
            return connectivityManager.isActiveNetworkMetered();
        }
    }

    public static boolean a(ConnectivityManager connectivityManager) {
        return C0053a.a(connectivityManager);
    }
}
