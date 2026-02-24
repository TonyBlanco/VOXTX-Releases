package Q5;

import Q5.D;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D.a f8375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D.c f8376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D.b f8377c;

    public x(D.a aVar, D.c cVar, D.b bVar) {
        if (aVar == null) {
            throw new NullPointerException("Null appData");
        }
        this.f8375a = aVar;
        if (cVar == null) {
            throw new NullPointerException("Null osData");
        }
        this.f8376b = cVar;
        if (bVar == null) {
            throw new NullPointerException("Null deviceData");
        }
        this.f8377c = bVar;
    }

    @Override // Q5.D
    public D.a a() {
        return this.f8375a;
    }

    @Override // Q5.D
    public D.b c() {
        return this.f8377c;
    }

    @Override // Q5.D
    public D.c d() {
        return this.f8376b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d9 = (D) obj;
        return this.f8375a.equals(d9.a()) && this.f8376b.equals(d9.d()) && this.f8377c.equals(d9.c());
    }

    public int hashCode() {
        return ((((this.f8375a.hashCode() ^ 1000003) * 1000003) ^ this.f8376b.hashCode()) * 1000003) ^ this.f8377c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f8375a + ", osData=" + this.f8376b + ", deviceData=" + this.f8377c + "}";
    }
}
