package q5;

/* JADX INFO: renamed from: q5.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2553C implements InterfaceC2557d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f46910c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile InterfaceC2557d f46911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f46912b = f46910c;

    public C2553C(InterfaceC2557d interfaceC2557d) {
        this.f46911a = interfaceC2557d;
    }

    public static InterfaceC2557d b(InterfaceC2557d interfaceC2557d) {
        interfaceC2557d.getClass();
        return interfaceC2557d instanceof C2553C ? interfaceC2557d : new C2553C(interfaceC2557d);
    }

    @Override // q5.InterfaceC2557d
    public final Object a() {
        Object objA = this.f46912b;
        Object obj = f46910c;
        if (objA == obj) {
            synchronized (this) {
                try {
                    objA = this.f46912b;
                    if (objA == obj) {
                        objA = this.f46911a.a();
                        Object obj2 = this.f46912b;
                        if (obj2 != obj && obj2 != objA) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objA + ". This is likely due to a circular dependency.");
                        }
                        this.f46912b = objA;
                        this.f46911a = null;
                    }
                } finally {
                }
            }
        }
        return objA;
    }
}
