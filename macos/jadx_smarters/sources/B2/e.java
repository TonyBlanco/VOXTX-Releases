package B2;

import B2.k;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k.b f234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B2.a f235b;

    public static final class b extends k.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public k.b f236a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public B2.a f237b;

        @Override // B2.k.a
        public k a() {
            return new e(this.f236a, this.f237b);
        }

        @Override // B2.k.a
        public k.a b(B2.a aVar) {
            this.f237b = aVar;
            return this;
        }

        @Override // B2.k.a
        public k.a c(k.b bVar) {
            this.f236a = bVar;
            return this;
        }
    }

    public e(k.b bVar, B2.a aVar) {
        this.f234a = bVar;
        this.f235b = aVar;
    }

    @Override // B2.k
    public B2.a b() {
        return this.f235b;
    }

    @Override // B2.k
    public k.b c() {
        return this.f234a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        k.b bVar = this.f234a;
        if (bVar != null ? bVar.equals(kVar.c()) : kVar.c() == null) {
            B2.a aVar = this.f235b;
            B2.a aVarB = kVar.b();
            if (aVar == null) {
                if (aVarB == null) {
                    return true;
                }
            } else if (aVar.equals(aVarB)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        k.b bVar = this.f234a;
        int iHashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        B2.a aVar = this.f235b;
        return iHashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f234a + ", androidClientInfo=" + this.f235b + "}";
    }
}
