package D2;

import D2.g;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g.a f1330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1331b;

    public b(g.a aVar, long j9) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f1330a = aVar;
        this.f1331b = j9;
    }

    @Override // D2.g
    public long b() {
        return this.f1331b;
    }

    @Override // D2.g
    public g.a c() {
        return this.f1330a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f1330a.equals(gVar.c()) && this.f1331b == gVar.b();
    }

    public int hashCode() {
        int iHashCode = (this.f1330a.hashCode() ^ 1000003) * 1000003;
        long j9 = this.f1331b;
        return iHashCode ^ ((int) (j9 ^ (j9 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f1330a + ", nextRequestWaitMillis=" + this.f1331b + "}";
    }
}
