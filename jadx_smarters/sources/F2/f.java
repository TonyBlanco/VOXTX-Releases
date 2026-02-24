package F2;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f1918c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1920b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f1921a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f1922b = 0;

        public f a() {
            return new f(this.f1921a, this.f1922b);
        }

        public a b(long j9) {
            this.f1922b = j9;
            return this;
        }

        public a c(long j9) {
            this.f1921a = j9;
            return this;
        }
    }

    public f(long j9, long j10) {
        this.f1919a = j9;
        this.f1920b = j10;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f1920b;
    }

    public long b() {
        return this.f1919a;
    }
}
