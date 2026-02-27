package B2;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f266a;

    public h(long j9) {
        this.f266a = j9;
    }

    @Override // B2.n
    public long c() {
        return this.f266a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof n) && this.f266a == ((n) obj).c();
    }

    public int hashCode() {
        long j9 = this.f266a;
        return 1000003 ^ ((int) (j9 ^ (j9 >>> 32)));
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f266a + "}";
    }
}
