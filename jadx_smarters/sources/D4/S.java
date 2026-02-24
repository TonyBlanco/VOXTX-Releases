package d4;

/* JADX INFO: loaded from: classes3.dex */
public final class S {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final S f39721c = new S(-1, -1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final S f39722d = new S(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39724b;

    public S(int i9, int i10) {
        AbstractC1684a.a((i9 == -1 || i9 >= 0) && (i10 == -1 || i10 >= 0));
        this.f39723a = i9;
        this.f39724b = i10;
    }

    public int a() {
        return this.f39724b;
    }

    public int b() {
        return this.f39723a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s9 = (S) obj;
        return this.f39723a == s9.f39723a && this.f39724b == s9.f39724b;
    }

    public int hashCode() {
        int i9 = this.f39724b;
        int i10 = this.f39723a;
        return i9 ^ ((i10 >>> 16) | (i10 << 16));
    }

    public String toString() {
        return this.f39723a + "x" + this.f39724b;
    }
}
