package F2;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f1913c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1915b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f1916a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f1917b = 0;

        public e a() {
            return new e(this.f1916a, this.f1917b);
        }

        public a b(long j9) {
            this.f1916a = j9;
            return this;
        }

        public a c(long j9) {
            this.f1917b = j9;
            return this;
        }
    }

    public e(long j9, long j10) {
        this.f1914a = j9;
        this.f1915b = j10;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f1914a;
    }

    public long b() {
        return this.f1915b;
    }
}
