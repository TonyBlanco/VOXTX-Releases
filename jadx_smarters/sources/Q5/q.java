package Q5;

import Q5.B;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends B.e.d.a.b.AbstractC0101d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8331c;

    public static final class b extends B.e.d.a.b.AbstractC0101d.AbstractC0102a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f8332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f8333b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Long f8334c;

        @Override // Q5.B.e.d.a.b.AbstractC0101d.AbstractC0102a
        public B.e.d.a.b.AbstractC0101d a() {
            String str = "";
            if (this.f8332a == null) {
                str = " name";
            }
            if (this.f8333b == null) {
                str = str + " code";
            }
            if (this.f8334c == null) {
                str = str + " address";
            }
            if (str.isEmpty()) {
                return new q(this.f8332a, this.f8333b, this.f8334c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // Q5.B.e.d.a.b.AbstractC0101d.AbstractC0102a
        public B.e.d.a.b.AbstractC0101d.AbstractC0102a b(long j9) {
            this.f8334c = Long.valueOf(j9);
            return this;
        }

        @Override // Q5.B.e.d.a.b.AbstractC0101d.AbstractC0102a
        public B.e.d.a.b.AbstractC0101d.AbstractC0102a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null code");
            }
            this.f8333b = str;
            return this;
        }

        @Override // Q5.B.e.d.a.b.AbstractC0101d.AbstractC0102a
        public B.e.d.a.b.AbstractC0101d.AbstractC0102a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f8332a = str;
            return this;
        }
    }

    public q(String str, String str2, long j9) {
        this.f8329a = str;
        this.f8330b = str2;
        this.f8331c = j9;
    }

    @Override // Q5.B.e.d.a.b.AbstractC0101d
    public long b() {
        return this.f8331c;
    }

    @Override // Q5.B.e.d.a.b.AbstractC0101d
    public String c() {
        return this.f8330b;
    }

    @Override // Q5.B.e.d.a.b.AbstractC0101d
    public String d() {
        return this.f8329a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e.d.a.b.AbstractC0101d)) {
            return false;
        }
        B.e.d.a.b.AbstractC0101d abstractC0101d = (B.e.d.a.b.AbstractC0101d) obj;
        return this.f8329a.equals(abstractC0101d.d()) && this.f8330b.equals(abstractC0101d.c()) && this.f8331c == abstractC0101d.b();
    }

    public int hashCode() {
        int iHashCode = (((this.f8329a.hashCode() ^ 1000003) * 1000003) ^ this.f8330b.hashCode()) * 1000003;
        long j9 = this.f8331c;
        return iHashCode ^ ((int) (j9 ^ (j9 >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f8329a + ", code=" + this.f8330b + ", address=" + this.f8331c + "}";
    }
}
