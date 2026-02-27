package F2;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f1900b = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f1901a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e f1902a = null;

        public b a() {
            return new b(this.f1902a);
        }

        public a b(e eVar) {
            this.f1902a = eVar;
            return this;
        }
    }

    public b(e eVar) {
        this.f1901a = eVar;
    }

    public static a b() {
        return new a();
    }

    public e a() {
        return this.f1901a;
    }
}
