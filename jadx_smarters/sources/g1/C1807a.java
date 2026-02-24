package g1;

/* JADX INFO: renamed from: g1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1807a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f41161a;

    /* JADX INFO: renamed from: g1.a$a, reason: collision with other inner class name */
    public static final class C0329a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f41162a;

        public /* synthetic */ C0329a(AbstractC1820n abstractC1820n) {
        }

        public C1807a a() {
            String str = this.f41162a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            C1807a c1807a = new C1807a(null);
            c1807a.f41161a = str;
            return c1807a;
        }

        public C0329a b(String str) {
            this.f41162a = str;
            return this;
        }
    }

    public /* synthetic */ C1807a(AbstractC1827v abstractC1827v) {
    }

    public static C0329a b() {
        return new C0329a(null);
    }

    public String a() {
        return this.f41161a;
    }
}
