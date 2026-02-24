package r5;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f49731a = Logger.getLogger(l.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f49732b = b();

    public static final class b implements k {
        public b() {
        }
    }

    public static String a(String str) {
        if (d(str)) {
            return null;
        }
        return str;
    }

    public static k b() {
        return new b();
    }

    public static String c(String str) {
        return str == null ? "" : str;
    }

    public static boolean d(String str) {
        return str == null || str.isEmpty();
    }
}
