package B2;

import B2.o;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o.c f267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o.b f268b;

    public static final class b extends o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o.c f269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public o.b f270b;

        @Override // B2.o.a
        public o a() {
            return new i(this.f269a, this.f270b);
        }

        @Override // B2.o.a
        public o.a b(o.b bVar) {
            this.f270b = bVar;
            return this;
        }

        @Override // B2.o.a
        public o.a c(o.c cVar) {
            this.f269a = cVar;
            return this;
        }
    }

    public i(o.c cVar, o.b bVar) {
        this.f267a = cVar;
        this.f268b = bVar;
    }

    @Override // B2.o
    public o.b b() {
        return this.f268b;
    }

    @Override // B2.o
    public o.c c() {
        return this.f267a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        o.c cVar = this.f267a;
        if (cVar != null ? cVar.equals(oVar.c()) : oVar.c() == null) {
            o.b bVar = this.f268b;
            o.b bVarB = oVar.b();
            if (bVar == null) {
                if (bVarB == null) {
                    return true;
                }
            } else if (bVar.equals(bVarB)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        o.c cVar = this.f267a;
        int iHashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        o.b bVar = this.f268b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f267a + ", mobileSubtype=" + this.f268b + "}";
    }
}
