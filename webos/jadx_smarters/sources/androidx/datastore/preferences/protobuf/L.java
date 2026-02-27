package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final J f14587a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final J f14588b = new K();

    public static J a() {
        return f14587a;
    }

    public static J b() {
        return f14588b;
    }

    public static J c() {
        try {
            return (J) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
