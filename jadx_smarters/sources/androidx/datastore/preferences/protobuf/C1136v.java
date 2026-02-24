package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1136v implements N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1136v f14763a = new C1136v();

    public static C1136v c() {
        return f14763a;
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public M a(Class cls) {
        if (!AbstractC1137w.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (M) AbstractC1137w.u(cls.asSubclass(AbstractC1137w.class)).m();
        } catch (Exception e9) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e9);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public boolean b(Class cls) {
        return AbstractC1137w.class.isAssignableFrom(cls);
    }
}
