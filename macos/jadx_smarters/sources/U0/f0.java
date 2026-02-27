package u0;

import android.media.MediaRouter;

/* JADX INFO: loaded from: classes.dex */
public abstract class f0 {

    public static final class a {
        public static CharSequence a(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getDescription();
        }

        public static boolean b(Object obj) {
            return ((MediaRouter.RouteInfo) obj).isConnecting();
        }
    }

    public static final class b {
        public static void a(Object obj, CharSequence charSequence) {
            ((MediaRouter.UserRouteInfo) obj).setDescription(charSequence);
        }
    }

    public static void a(Object obj, int i9, Object obj2, int i10) {
        ((MediaRouter) obj).addCallback(i9, (MediaRouter.Callback) obj2, i10);
    }

    public static Object b(Object obj) {
        return ((MediaRouter) obj).getDefaultRoute();
    }
}
