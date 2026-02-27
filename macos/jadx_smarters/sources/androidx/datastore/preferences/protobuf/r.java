package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC1131p f14749a = new C1132q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC1131p f14750b = c();

    public static AbstractC1131p a() {
        AbstractC1131p abstractC1131p = f14750b;
        if (abstractC1131p != null) {
            return abstractC1131p;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static AbstractC1131p b() {
        return f14749a;
    }

    public static AbstractC1131p c() {
        try {
            return (AbstractC1131p) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
