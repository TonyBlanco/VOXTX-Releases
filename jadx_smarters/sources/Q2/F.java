package Q2;

/* JADX INFO: loaded from: classes3.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f7577b;

    public F(int i9, float f9) {
        this.f7576a = i9;
        this.f7577b = f9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || F.class != obj.getClass()) {
            return false;
        }
        F f9 = (F) obj;
        return this.f7576a == f9.f7576a && Float.compare(f9.f7577b, this.f7577b) == 0;
    }

    public int hashCode() {
        return ((527 + this.f7576a) * 31) + Float.floatToIntBits(this.f7577b);
    }
}
