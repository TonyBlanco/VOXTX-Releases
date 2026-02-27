package Q5;

import Q5.B;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends B.e.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B.e.d.a f8283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B.e.d.c f8284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final B.e.d.AbstractC0107d f8285e;

    public static final class b extends B.e.d.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f8286a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f8287b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public B.e.d.a f8288c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public B.e.d.c f8289d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public B.e.d.AbstractC0107d f8290e;

        public b() {
        }

        public b(B.e.d dVar) {
            this.f8286a = Long.valueOf(dVar.e());
            this.f8287b = dVar.f();
            this.f8288c = dVar.b();
            this.f8289d = dVar.c();
            this.f8290e = dVar.d();
        }

        @Override // Q5.B.e.d.b
        public B.e.d a() {
            String str = "";
            if (this.f8286a == null) {
                str = " timestamp";
            }
            if (this.f8287b == null) {
                str = str + " type";
            }
            if (this.f8288c == null) {
                str = str + " app";
            }
            if (this.f8289d == null) {
                str = str + " device";
            }
            if (str.isEmpty()) {
                return new l(this.f8286a.longValue(), this.f8287b, this.f8288c, this.f8289d, this.f8290e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // Q5.B.e.d.b
        public B.e.d.b b(B.e.d.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f8288c = aVar;
            return this;
        }

        @Override // Q5.B.e.d.b
        public B.e.d.b c(B.e.d.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null device");
            }
            this.f8289d = cVar;
            return this;
        }

        @Override // Q5.B.e.d.b
        public B.e.d.b d(B.e.d.AbstractC0107d abstractC0107d) {
            this.f8290e = abstractC0107d;
            return this;
        }

        @Override // Q5.B.e.d.b
        public B.e.d.b e(long j9) {
            this.f8286a = Long.valueOf(j9);
            return this;
        }

        @Override // Q5.B.e.d.b
        public B.e.d.b f(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f8287b = str;
            return this;
        }
    }

    public l(long j9, String str, B.e.d.a aVar, B.e.d.c cVar, B.e.d.AbstractC0107d abstractC0107d) {
        this.f8281a = j9;
        this.f8282b = str;
        this.f8283c = aVar;
        this.f8284d = cVar;
        this.f8285e = abstractC0107d;
    }

    @Override // Q5.B.e.d
    public B.e.d.a b() {
        return this.f8283c;
    }

    @Override // Q5.B.e.d
    public B.e.d.c c() {
        return this.f8284d;
    }

    @Override // Q5.B.e.d
    public B.e.d.AbstractC0107d d() {
        return this.f8285e;
    }

    @Override // Q5.B.e.d
    public long e() {
        return this.f8281a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e.d)) {
            return false;
        }
        B.e.d dVar = (B.e.d) obj;
        if (this.f8281a == dVar.e() && this.f8282b.equals(dVar.f()) && this.f8283c.equals(dVar.b()) && this.f8284d.equals(dVar.c())) {
            B.e.d.AbstractC0107d abstractC0107d = this.f8285e;
            B.e.d.AbstractC0107d abstractC0107dD = dVar.d();
            if (abstractC0107d == null) {
                if (abstractC0107dD == null) {
                    return true;
                }
            } else if (abstractC0107d.equals(abstractC0107dD)) {
                return true;
            }
        }
        return false;
    }

    @Override // Q5.B.e.d
    public String f() {
        return this.f8282b;
    }

    @Override // Q5.B.e.d
    public B.e.d.b g() {
        return new b(this);
    }

    public int hashCode() {
        long j9 = this.f8281a;
        int iHashCode = (((((((((int) (j9 ^ (j9 >>> 32))) ^ 1000003) * 1000003) ^ this.f8282b.hashCode()) * 1000003) ^ this.f8283c.hashCode()) * 1000003) ^ this.f8284d.hashCode()) * 1000003;
        B.e.d.AbstractC0107d abstractC0107d = this.f8285e;
        return (abstractC0107d == null ? 0 : abstractC0107d.hashCode()) ^ iHashCode;
    }

    public String toString() {
        return "Event{timestamp=" + this.f8281a + ", type=" + this.f8282b + ", app=" + this.f8283c + ", device=" + this.f8284d + ", log=" + this.f8285e + "}";
    }
}
