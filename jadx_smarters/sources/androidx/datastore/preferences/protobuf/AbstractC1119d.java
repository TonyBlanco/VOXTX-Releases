package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1119d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f14626a = a("libcore.io.Memory");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f14627b;

    static {
        f14627b = a("org.robolectric.Robolectric") != null;
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class b() {
        return f14626a;
    }

    public static boolean c() {
        return (f14626a == null || f14627b) ? false : true;
    }
}
