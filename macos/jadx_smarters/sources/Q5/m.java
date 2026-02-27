package Q5;

import Q5.B;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends B.e.d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B.e.d.a.b f8291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C f8292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C f8293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f8294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8295e;

    public static final class b extends B.e.d.a.AbstractC0096a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public B.e.d.a.b f8296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public C f8297b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public C f8298c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Boolean f8299d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f8300e;

        public b() {
        }

        public b(B.e.d.a aVar) {
            this.f8296a = aVar.d();
            this.f8297b = aVar.c();
            this.f8298c = aVar.e();
            this.f8299d = aVar.b();
            this.f8300e = Integer.valueOf(aVar.f());
        }

        @Override // Q5.B.e.d.a.AbstractC0096a
        public B.e.d.a a() {
            String str = "";
            if (this.f8296a == null) {
                str = " execution";
            }
            if (this.f8300e == null) {
                str = str + " uiOrientation";
            }
            if (str.isEmpty()) {
                return new m(this.f8296a, this.f8297b, this.f8298c, this.f8299d, this.f8300e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // Q5.B.e.d.a.AbstractC0096a
        public B.e.d.a.AbstractC0096a b(Boolean bool) {
            this.f8299d = bool;
            return this;
        }

        @Override // Q5.B.e.d.a.AbstractC0096a
        public B.e.d.a.AbstractC0096a c(C c9) {
            this.f8297b = c9;
            return this;
        }

        @Override // Q5.B.e.d.a.AbstractC0096a
        public B.e.d.a.AbstractC0096a d(B.e.d.a.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null execution");
            }
            this.f8296a = bVar;
            return this;
        }

        @Override // Q5.B.e.d.a.AbstractC0096a
        public B.e.d.a.AbstractC0096a e(C c9) {
            this.f8298c = c9;
            return this;
        }

        @Override // Q5.B.e.d.a.AbstractC0096a
        public B.e.d.a.AbstractC0096a f(int i9) {
            this.f8300e = Integer.valueOf(i9);
            return this;
        }
    }

    public m(B.e.d.a.b bVar, C c9, C c10, Boolean bool, int i9) {
        this.f8291a = bVar;
        this.f8292b = c9;
        this.f8293c = c10;
        this.f8294d = bool;
        this.f8295e = i9;
    }

    @Override // Q5.B.e.d.a
    public Boolean b() {
        return this.f8294d;
    }

    @Override // Q5.B.e.d.a
    public C c() {
        return this.f8292b;
    }

    @Override // Q5.B.e.d.a
    public B.e.d.a.b d() {
        return this.f8291a;
    }

    @Override // Q5.B.e.d.a
    public C e() {
        return this.f8293c;
    }

    public boolean equals(Object obj) {
        C c9;
        C c10;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e.d.a)) {
            return false;
        }
        B.e.d.a aVar = (B.e.d.a) obj;
        return this.f8291a.equals(aVar.d()) && ((c9 = this.f8292b) != null ? c9.equals(aVar.c()) : aVar.c() == null) && ((c10 = this.f8293c) != null ? c10.equals(aVar.e()) : aVar.e() == null) && ((bool = this.f8294d) != null ? bool.equals(aVar.b()) : aVar.b() == null) && this.f8295e == aVar.f();
    }

    @Override // Q5.B.e.d.a
    public int f() {
        return this.f8295e;
    }

    @Override // Q5.B.e.d.a
    public B.e.d.a.AbstractC0096a g() {
        return new b(this);
    }

    public int hashCode() {
        int iHashCode = (this.f8291a.hashCode() ^ 1000003) * 1000003;
        C c9 = this.f8292b;
        int iHashCode2 = (iHashCode ^ (c9 == null ? 0 : c9.hashCode())) * 1000003;
        C c10 = this.f8293c;
        int iHashCode3 = (iHashCode2 ^ (c10 == null ? 0 : c10.hashCode())) * 1000003;
        Boolean bool = this.f8294d;
        return ((iHashCode3 ^ (bool != null ? bool.hashCode() : 0)) * 1000003) ^ this.f8295e;
    }

    public String toString() {
        return "Application{execution=" + this.f8291a + ", customAttributes=" + this.f8292b + ", internalKeys=" + this.f8293c + ", background=" + this.f8294d + ", uiOrientation=" + this.f8295e + "}";
    }
}
