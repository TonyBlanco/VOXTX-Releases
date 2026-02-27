package q5;

/* JADX INFO: renamed from: q5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2560g extends AbstractC2561h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46918a;

    public C2560g(int i9, long j9) {
        this.f46918a = j9;
    }

    @Override // q5.AbstractC2561h
    public final int a() {
        return 3;
    }

    @Override // q5.AbstractC2561h
    public final long b() {
        return this.f46918a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2561h) {
            AbstractC2561h abstractC2561h = (AbstractC2561h) obj;
            abstractC2561h.a();
            if (this.f46918a == abstractC2561h.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j9 = this.f46918a;
        return (-724379968) ^ ((int) (j9 ^ (j9 >>> 32)));
    }

    public final String toString() {
        return "EventRecord{eventType=3, eventTimestamp=" + this.f46918a + "}";
    }
}
