package Q5;

import Q5.B;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends B.e.d.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f8301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B.e.d.a.b.c f8302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B.a f8303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B.e.d.a.b.AbstractC0101d f8304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C f8305e;

    public static final class b extends B.e.d.a.b.AbstractC0099b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public C f8306a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public B.e.d.a.b.c f8307b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public B.a f8308c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public B.e.d.a.b.AbstractC0101d f8309d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public C f8310e;

        @Override // Q5.B.e.d.a.b.AbstractC0099b
        public B.e.d.a.b a() {
            String str = "";
            if (this.f8309d == null) {
                str = " signal";
            }
            if (this.f8310e == null) {
                str = str + " binaries";
            }
            if (str.isEmpty()) {
                return new n(this.f8306a, this.f8307b, this.f8308c, this.f8309d, this.f8310e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // Q5.B.e.d.a.b.AbstractC0099b
        public B.e.d.a.b.AbstractC0099b b(B.a aVar) {
            this.f8308c = aVar;
            return this;
        }

        @Override // Q5.B.e.d.a.b.AbstractC0099b
        public B.e.d.a.b.AbstractC0099b c(C c9) {
            if (c9 == null) {
                throw new NullPointerException("Null binaries");
            }
            this.f8310e = c9;
            return this;
        }

        @Override // Q5.B.e.d.a.b.AbstractC0099b
        public B.e.d.a.b.AbstractC0099b d(B.e.d.a.b.c cVar) {
            this.f8307b = cVar;
            return this;
        }

        @Override // Q5.B.e.d.a.b.AbstractC0099b
        public B.e.d.a.b.AbstractC0099b e(B.e.d.a.b.AbstractC0101d abstractC0101d) {
            if (abstractC0101d == null) {
                throw new NullPointerException("Null signal");
            }
            this.f8309d = abstractC0101d;
            return this;
        }

        @Override // Q5.B.e.d.a.b.AbstractC0099b
        public B.e.d.a.b.AbstractC0099b f(C c9) {
            this.f8306a = c9;
            return this;
        }
    }

    public n(C c9, B.e.d.a.b.c cVar, B.a aVar, B.e.d.a.b.AbstractC0101d abstractC0101d, C c10) {
        this.f8301a = c9;
        this.f8302b = cVar;
        this.f8303c = aVar;
        this.f8304d = abstractC0101d;
        this.f8305e = c10;
    }

    @Override // Q5.B.e.d.a.b
    public B.a b() {
        return this.f8303c;
    }

    @Override // Q5.B.e.d.a.b
    public C c() {
        return this.f8305e;
    }

    @Override // Q5.B.e.d.a.b
    public B.e.d.a.b.c d() {
        return this.f8302b;
    }

    @Override // Q5.B.e.d.a.b
    public B.e.d.a.b.AbstractC0101d e() {
        return this.f8304d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e.d.a.b)) {
            return false;
        }
        B.e.d.a.b bVar = (B.e.d.a.b) obj;
        C c9 = this.f8301a;
        if (c9 != null ? c9.equals(bVar.f()) : bVar.f() == null) {
            B.e.d.a.b.c cVar = this.f8302b;
            if (cVar != null ? cVar.equals(bVar.d()) : bVar.d() == null) {
                B.a aVar = this.f8303c;
                if (aVar != null ? aVar.equals(bVar.b()) : bVar.b() == null) {
                    if (this.f8304d.equals(bVar.e()) && this.f8305e.equals(bVar.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // Q5.B.e.d.a.b
    public C f() {
        return this.f8301a;
    }

    public int hashCode() {
        C c9 = this.f8301a;
        int iHashCode = ((c9 == null ? 0 : c9.hashCode()) ^ 1000003) * 1000003;
        B.e.d.a.b.c cVar = this.f8302b;
        int iHashCode2 = (iHashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        B.a aVar = this.f8303c;
        return ((((iHashCode2 ^ (aVar != null ? aVar.hashCode() : 0)) * 1000003) ^ this.f8304d.hashCode()) * 1000003) ^ this.f8305e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f8301a + ", exception=" + this.f8302b + ", appExitInfo=" + this.f8303c + ", signal=" + this.f8304d + ", binaries=" + this.f8305e + "}";
    }
}
