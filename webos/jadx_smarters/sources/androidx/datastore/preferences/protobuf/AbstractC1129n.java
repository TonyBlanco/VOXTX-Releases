package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1129n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f14709a = c();

    public static C1130o a() {
        if (f14709a != null) {
            try {
                return b("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return C1130o.f14713e;
    }

    public static final C1130o b(String str) {
        return (C1130o) f14709a.getDeclaredMethod(str, null).invoke(null, null);
    }

    public static Class c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
