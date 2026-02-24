package Q5;

import Q5.B;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends B.e.d.a.b.AbstractC0103e.AbstractC0105b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8345e;

    public static final class b extends B.e.d.a.b.AbstractC0103e.AbstractC0105b.AbstractC0106a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f8346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f8347b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f8348c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f8349d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f8350e;

        @Override // Q5.B.e.d.a.b.AbstractC0103e.AbstractC0105b.AbstractC0106a
        public B.e.d.a.b.AbstractC0103e.AbstractC0105b a() {
            String str = "";
            if (this.f8346a == null) {
                str = " pc";
            }
            if (this.f8347b == null) {
                str = str + " symbol";
            }
            if (this.f8349d == null) {
                str = str + " offset";
            }
            if (this.f8350e == null) {
                str = str + " importance";
            }
            if (str.isEmpty()) {
                return new s(this.f8346a.longValue(), this.f8347b, this.f8348c, this.f8349d.longValue(), this.f8350e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // Q5.B.e.d.a.b.AbstractC0103e.AbstractC0105b.AbstractC0106a
        public B.e.d.a.b.AbstractC0103e.AbstractC0105b.AbstractC0106a b(String str) {
            this.f8348c = str;
            return this;
        }

        @Override // Q5.B.e.d.a.b.AbstractC0103e.AbstractC0105b.AbstractC0106a
        public B.e.d.a.b.AbstractC0103e.AbstractC0105b.AbstractC0106a c(int i9) {
            this.f8350e = Integer.valueOf(i9);
            return this;
        }

        @Override // Q5.B.e.d.a.b.AbstractC0103e.AbstractC0105b.AbstractC0106a
        public B.e.d.a.b.AbstractC0103e.AbstractC0105b.AbstractC0106a d(long j9) {
            this.f8349d = Long.valueOf(j9);
            return this;
        }

        @Override // Q5.B.e.d.a.b.AbstractC0103e.AbstractC0105b.AbstractC0106a
        public B.e.d.a.b.AbstractC0103e.AbstractC0105b.AbstractC0106a e(long j9) {
            this.f8346a = Long.valueOf(j9);
            return this;
        }

        @Override // Q5.B.e.d.a.b.AbstractC0103e.AbstractC0105b.AbstractC0106a
        public B.e.d.a.b.AbstractC0103e.AbstractC0105b.AbstractC0106a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            this.f8347b = str;
            return this;
        }
    }

    public s(long j9, String str, String str2, long j10, int i9) {
        this.f8341a = j9;
        this.f8342b = str;
        this.f8343c = str2;
        this.f8344d = j10;
        this.f8345e = i9;
    }

    @Override // Q5.B.e.d.a.b.AbstractC0103e.AbstractC0105b
    public String b() {
        return this.f8343c;
    }

    @Override // Q5.B.e.d.a.b.AbstractC0103e.AbstractC0105b
    public int c() {
        return this.f8345e;
    }

    @Override // Q5.B.e.d.a.b.AbstractC0103e.AbstractC0105b
    public long d() {
        return this.f8344d;
    }

    @Override // Q5.B.e.d.a.b.AbstractC0103e.AbstractC0105b
    public long e() {
        return this.f8341a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e.d.a.b.AbstractC0103e.AbstractC0105b)) {
            return false;
        }
        B.e.d.a.b.AbstractC0103e.AbstractC0105b abstractC0105b = (B.e.d.a.b.AbstractC0103e.AbstractC0105b) obj;
        return this.f8341a == abstractC0105b.e() && this.f8342b.equals(abstractC0105b.f()) && ((str = this.f8343c) != null ? str.equals(abstractC0105b.b()) : abstractC0105b.b() == null) && this.f8344d == abstractC0105b.d() && this.f8345e == abstractC0105b.c();
    }

    @Override // Q5.B.e.d.a.b.AbstractC0103e.AbstractC0105b
    public String f() {
        return this.f8342b;
    }

    public int hashCode() {
        long j9 = this.f8341a;
        int iHashCode = (((((int) (j9 ^ (j9 >>> 32))) ^ 1000003) * 1000003) ^ this.f8342b.hashCode()) * 1000003;
        String str = this.f8343c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j10 = this.f8344d;
        return this.f8345e ^ ((iHashCode2 ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003);
    }

    public String toString() {
        return "Frame{pc=" + this.f8341a + ", symbol=" + this.f8342b + ", file=" + this.f8343c + ", offset=" + this.f8344d + ", importance=" + this.f8345e + "}";
    }
}
