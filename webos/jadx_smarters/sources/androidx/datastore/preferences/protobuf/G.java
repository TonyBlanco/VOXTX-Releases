package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class G implements f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final N f14575b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N f14576a;

    public static class a implements N {
        @Override // androidx.datastore.preferences.protobuf.N
        public M a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // androidx.datastore.preferences.protobuf.N
        public boolean b(Class cls) {
            return false;
        }
    }

    public static class b implements N {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public N[] f14577a;

        public b(N... nArr) {
            this.f14577a = nArr;
        }

        @Override // androidx.datastore.preferences.protobuf.N
        public M a(Class cls) {
            for (N n9 : this.f14577a) {
                if (n9.b(cls)) {
                    return n9.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // androidx.datastore.preferences.protobuf.N
        public boolean b(Class cls) {
            for (N n9 : this.f14577a) {
                if (n9.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public G() {
        this(b());
    }

    public G(N n9) {
        this.f14576a = (N) AbstractC1139y.b(n9, "messageInfoFactory");
    }

    public static N b() {
        return new b(C1136v.c(), c());
    }

    public static N c() {
        try {
            return (N) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f14575b;
        }
    }

    public static boolean d(M m9) {
        return m9.c() == Z.PROTO2;
    }

    public static e0 e(Class cls, M m9) {
        return AbstractC1137w.class.isAssignableFrom(cls) ? d(m9) ? S.M(cls, m9, W.b(), E.b(), g0.L(), r.b(), L.b()) : S.M(cls, m9, W.b(), E.b(), g0.L(), null, L.b()) : d(m9) ? S.M(cls, m9, W.a(), E.a(), g0.G(), r.a(), L.a()) : S.M(cls, m9, W.a(), E.a(), g0.H(), null, L.a());
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public e0 a(Class cls) {
        l0 l0VarG;
        AbstractC1131p abstractC1131pA;
        g0.I(cls);
        M mA = this.f14576a.a(cls);
        if (!mA.a()) {
            return e(cls, mA);
        }
        if (AbstractC1137w.class.isAssignableFrom(cls)) {
            l0VarG = g0.L();
            abstractC1131pA = r.b();
        } else {
            l0VarG = g0.G();
            abstractC1131pA = r.a();
        }
        return T.l(l0VarG, abstractC1131pA, mA.b());
    }
}
