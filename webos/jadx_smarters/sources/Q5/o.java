package Q5;

import Q5.B;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends B.e.d.a.b.AbstractC0097a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8314d;

    public static final class b extends B.e.d.a.b.AbstractC0097a.AbstractC0098a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f8315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Long f8316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f8317c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f8318d;

        @Override // Q5.B.e.d.a.b.AbstractC0097a.AbstractC0098a
        public B.e.d.a.b.AbstractC0097a a() {
            String str = "";
            if (this.f8315a == null) {
                str = " baseAddress";
            }
            if (this.f8316b == null) {
                str = str + " size";
            }
            if (this.f8317c == null) {
                str = str + " name";
            }
            if (str.isEmpty()) {
                return new o(this.f8315a.longValue(), this.f8316b.longValue(), this.f8317c, this.f8318d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // Q5.B.e.d.a.b.AbstractC0097a.AbstractC0098a
        public B.e.d.a.b.AbstractC0097a.AbstractC0098a b(long j9) {
            this.f8315a = Long.valueOf(j9);
            return this;
        }

        @Override // Q5.B.e.d.a.b.AbstractC0097a.AbstractC0098a
        public B.e.d.a.b.AbstractC0097a.AbstractC0098a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f8317c = str;
            return this;
        }

        @Override // Q5.B.e.d.a.b.AbstractC0097a.AbstractC0098a
        public B.e.d.a.b.AbstractC0097a.AbstractC0098a d(long j9) {
            this.f8316b = Long.valueOf(j9);
            return this;
        }

        @Override // Q5.B.e.d.a.b.AbstractC0097a.AbstractC0098a
        public B.e.d.a.b.AbstractC0097a.AbstractC0098a e(String str) {
            this.f8318d = str;
            return this;
        }
    }

    public o(long j9, long j10, String str, String str2) {
        this.f8311a = j9;
        this.f8312b = j10;
        this.f8313c = str;
        this.f8314d = str2;
    }

    @Override // Q5.B.e.d.a.b.AbstractC0097a
    public long b() {
        return this.f8311a;
    }

    @Override // Q5.B.e.d.a.b.AbstractC0097a
    public String c() {
        return this.f8313c;
    }

    @Override // Q5.B.e.d.a.b.AbstractC0097a
    public long d() {
        return this.f8312b;
    }

    @Override // Q5.B.e.d.a.b.AbstractC0097a
    public String e() {
        return this.f8314d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e.d.a.b.AbstractC0097a)) {
            return false;
        }
        B.e.d.a.b.AbstractC0097a abstractC0097a = (B.e.d.a.b.AbstractC0097a) obj;
        if (this.f8311a == abstractC0097a.b() && this.f8312b == abstractC0097a.d() && this.f8313c.equals(abstractC0097a.c())) {
            String str = this.f8314d;
            String strE = abstractC0097a.e();
            if (str == null) {
                if (strE == null) {
                    return true;
                }
            } else if (str.equals(strE)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j9 = this.f8311a;
        long j10 = this.f8312b;
        int iHashCode = (((((((int) (j9 ^ (j9 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f8313c.hashCode()) * 1000003;
        String str = this.f8314d;
        return (str == null ? 0 : str.hashCode()) ^ iHashCode;
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f8311a + ", size=" + this.f8312b + ", name=" + this.f8313c + ", uuid=" + this.f8314d + "}";
    }
}
