package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final U f14612a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final U f14613b = new V();

    public static U a() {
        return f14612a;
    }

    public static U b() {
        return f14613b;
    }

    public static U c() {
        try {
            return (U) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
