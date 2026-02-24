package Q5;

import Q5.B;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends B.e.d.a.b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C f8321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B.e.d.a.b.c f8322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8323e;

    public static final class b extends B.e.d.a.b.c.AbstractC0100a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f8324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f8325b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public C f8326c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public B.e.d.a.b.c f8327d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f8328e;

        @Override // Q5.B.e.d.a.b.c.AbstractC0100a
        public B.e.d.a.b.c a() {
            String str = "";
            if (this.f8324a == null) {
                str = " type";
            }
            if (this.f8326c == null) {
                str = str + " frames";
            }
            if (this.f8328e == null) {
                str = str + " overflowCount";
            }
            if (str.isEmpty()) {
                return new p(this.f8324a, this.f8325b, this.f8326c, this.f8327d, this.f8328e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // Q5.B.e.d.a.b.c.AbstractC0100a
        public B.e.d.a.b.c.AbstractC0100a b(B.e.d.a.b.c cVar) {
            this.f8327d = cVar;
            return this;
        }

        @Override // Q5.B.e.d.a.b.c.AbstractC0100a
        public B.e.d.a.b.c.AbstractC0100a c(C c9) {
            if (c9 == null) {
                throw new NullPointerException("Null frames");
            }
            this.f8326c = c9;
            return this;
        }

        @Override // Q5.B.e.d.a.b.c.AbstractC0100a
        public B.e.d.a.b.c.AbstractC0100a d(int i9) {
            this.f8328e = Integer.valueOf(i9);
            return this;
        }

        @Override // Q5.B.e.d.a.b.c.AbstractC0100a
        public B.e.d.a.b.c.AbstractC0100a e(String str) {
            this.f8325b = str;
            return this;
        }

        @Override // Q5.B.e.d.a.b.c.AbstractC0100a
        public B.e.d.a.b.c.AbstractC0100a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f8324a = str;
            return this;
        }
    }

    public p(String str, String str2, C c9, B.e.d.a.b.c cVar, int i9) {
        this.f8319a = str;
        this.f8320b = str2;
        this.f8321c = c9;
        this.f8322d = cVar;
        this.f8323e = i9;
    }

    @Override // Q5.B.e.d.a.b.c
    public B.e.d.a.b.c b() {
        return this.f8322d;
    }

    @Override // Q5.B.e.d.a.b.c
    public C c() {
        return this.f8321c;
    }

    @Override // Q5.B.e.d.a.b.c
    public int d() {
        return this.f8323e;
    }

    @Override // Q5.B.e.d.a.b.c
    public String e() {
        return this.f8320b;
    }

    public boolean equals(Object obj) {
        String str;
        B.e.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e.d.a.b.c)) {
            return false;
        }
        B.e.d.a.b.c cVar2 = (B.e.d.a.b.c) obj;
        return this.f8319a.equals(cVar2.f()) && ((str = this.f8320b) != null ? str.equals(cVar2.e()) : cVar2.e() == null) && this.f8321c.equals(cVar2.c()) && ((cVar = this.f8322d) != null ? cVar.equals(cVar2.b()) : cVar2.b() == null) && this.f8323e == cVar2.d();
    }

    @Override // Q5.B.e.d.a.b.c
    public String f() {
        return this.f8319a;
    }

    public int hashCode() {
        int iHashCode = (this.f8319a.hashCode() ^ 1000003) * 1000003;
        String str = this.f8320b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f8321c.hashCode()) * 1000003;
        B.e.d.a.b.c cVar = this.f8322d;
        return ((iHashCode2 ^ (cVar != null ? cVar.hashCode() : 0)) * 1000003) ^ this.f8323e;
    }

    public String toString() {
        return "Exception{type=" + this.f8319a + ", reason=" + this.f8320b + ", frames=" + this.f8321c + ", causedBy=" + this.f8322d + ", overflowCount=" + this.f8323e + "}";
    }
}
