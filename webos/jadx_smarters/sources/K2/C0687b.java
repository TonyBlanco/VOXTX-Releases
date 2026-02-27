package K2;

/* JADX INFO: renamed from: K2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0687b extends AbstractC0696k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2.p f3647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2.i f3648c;

    public C0687b(long j9, C2.p pVar, C2.i iVar) {
        this.f3646a = j9;
        if (pVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f3647b = pVar;
        if (iVar == null) {
            throw new NullPointerException("Null event");
        }
        this.f3648c = iVar;
    }

    @Override // K2.AbstractC0696k
    public C2.i b() {
        return this.f3648c;
    }

    @Override // K2.AbstractC0696k
    public long c() {
        return this.f3646a;
    }

    @Override // K2.AbstractC0696k
    public C2.p d() {
        return this.f3647b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0696k)) {
            return false;
        }
        AbstractC0696k abstractC0696k = (AbstractC0696k) obj;
        return this.f3646a == abstractC0696k.c() && this.f3647b.equals(abstractC0696k.d()) && this.f3648c.equals(abstractC0696k.b());
    }

    public int hashCode() {
        long j9 = this.f3646a;
        return this.f3648c.hashCode() ^ ((((((int) (j9 ^ (j9 >>> 32))) ^ 1000003) * 1000003) ^ this.f3647b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f3646a + ", transportContext=" + this.f3647b + ", event=" + this.f3648c + "}";
    }
}
