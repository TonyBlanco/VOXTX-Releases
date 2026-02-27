package Q5;

import Q5.B;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends B.e.d.a.b.AbstractC0103e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C f8337c;

    public static final class b extends B.e.d.a.b.AbstractC0103e.AbstractC0104a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f8338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f8339b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public C f8340c;

        @Override // Q5.B.e.d.a.b.AbstractC0103e.AbstractC0104a
        public B.e.d.a.b.AbstractC0103e a() {
            String str = "";
            if (this.f8338a == null) {
                str = " name";
            }
            if (this.f8339b == null) {
                str = str + " importance";
            }
            if (this.f8340c == null) {
                str = str + " frames";
            }
            if (str.isEmpty()) {
                return new r(this.f8338a, this.f8339b.intValue(), this.f8340c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // Q5.B.e.d.a.b.AbstractC0103e.AbstractC0104a
        public B.e.d.a.b.AbstractC0103e.AbstractC0104a b(C c9) {
            if (c9 == null) {
                throw new NullPointerException("Null frames");
            }
            this.f8340c = c9;
            return this;
        }

        @Override // Q5.B.e.d.a.b.AbstractC0103e.AbstractC0104a
        public B.e.d.a.b.AbstractC0103e.AbstractC0104a c(int i9) {
            this.f8339b = Integer.valueOf(i9);
            return this;
        }

        @Override // Q5.B.e.d.a.b.AbstractC0103e.AbstractC0104a
        public B.e.d.a.b.AbstractC0103e.AbstractC0104a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f8338a = str;
            return this;
        }
    }

    public r(String str, int i9, C c9) {
        this.f8335a = str;
        this.f8336b = i9;
        this.f8337c = c9;
    }

    @Override // Q5.B.e.d.a.b.AbstractC0103e
    public C b() {
        return this.f8337c;
    }

    @Override // Q5.B.e.d.a.b.AbstractC0103e
    public int c() {
        return this.f8336b;
    }

    @Override // Q5.B.e.d.a.b.AbstractC0103e
    public String d() {
        return this.f8335a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e.d.a.b.AbstractC0103e)) {
            return false;
        }
        B.e.d.a.b.AbstractC0103e abstractC0103e = (B.e.d.a.b.AbstractC0103e) obj;
        return this.f8335a.equals(abstractC0103e.d()) && this.f8336b == abstractC0103e.c() && this.f8337c.equals(abstractC0103e.b());
    }

    public int hashCode() {
        return ((((this.f8335a.hashCode() ^ 1000003) * 1000003) ^ this.f8336b) * 1000003) ^ this.f8337c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f8335a + ", importance=" + this.f8336b + ", frames=" + this.f8337c + "}";
    }
}
