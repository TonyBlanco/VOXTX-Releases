package k6;

import k6.m;

/* JADX INFO: renamed from: k6.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2150a extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f43588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f43589c;

    /* JADX INFO: renamed from: k6.a$b */
    public static final class b extends m.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f43590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Long f43591b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Long f43592c;

        @Override // k6.m.a
        public m a() {
            String str = "";
            if (this.f43590a == null) {
                str = " token";
            }
            if (this.f43591b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f43592c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new C2150a(this.f43590a, this.f43591b.longValue(), this.f43592c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // k6.m.a
        public m.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f43590a = str;
            return this;
        }

        @Override // k6.m.a
        public m.a c(long j9) {
            this.f43592c = Long.valueOf(j9);
            return this;
        }

        @Override // k6.m.a
        public m.a d(long j9) {
            this.f43591b = Long.valueOf(j9);
            return this;
        }
    }

    public C2150a(String str, long j9, long j10) {
        this.f43587a = str;
        this.f43588b = j9;
        this.f43589c = j10;
    }

    @Override // k6.m
    public String b() {
        return this.f43587a;
    }

    @Override // k6.m
    public long c() {
        return this.f43589c;
    }

    @Override // k6.m
    public long d() {
        return this.f43588b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f43587a.equals(mVar.b()) && this.f43588b == mVar.d() && this.f43589c == mVar.c();
    }

    public int hashCode() {
        int iHashCode = (this.f43587a.hashCode() ^ 1000003) * 1000003;
        long j9 = this.f43588b;
        long j10 = this.f43589c;
        return ((iHashCode ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f43587a + ", tokenExpirationTimestamp=" + this.f43588b + ", tokenCreationTimestamp=" + this.f43589c + "}";
    }
}
