package A5;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f117c;

    public a(long j9, long j10, long j11) {
        this.f115a = j9;
        this.f116b = j10;
        this.f117c = j11;
    }

    @Override // A5.q
    public long b() {
        return this.f116b;
    }

    @Override // A5.q
    public long c() {
        return this.f115a;
    }

    @Override // A5.q
    public long d() {
        return this.f117c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f115a == qVar.c() && this.f116b == qVar.b() && this.f117c == qVar.d();
    }

    public int hashCode() {
        long j9 = this.f115a;
        long j10 = this.f116b;
        int i9 = (((((int) (j9 ^ (j9 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f117c;
        return ((int) ((j11 >>> 32) ^ j11)) ^ i9;
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f115a + ", elapsedRealtime=" + this.f116b + ", uptimeMillis=" + this.f117c + "}";
    }
}
