package d3;

/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f39609c = new u(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f39611b;

    public u(long j9, long j10) {
        this.f39610a = j9;
        this.f39611b = j10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        return this.f39610a == uVar.f39610a && this.f39611b == uVar.f39611b;
    }

    public int hashCode() {
        return (((int) this.f39610a) * 31) + ((int) this.f39611b);
    }

    public String toString() {
        return "[timeUs=" + this.f39610a + ", position=" + this.f39611b + "]";
    }
}
