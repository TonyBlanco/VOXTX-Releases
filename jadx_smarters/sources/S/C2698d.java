package s;

/* JADX INFO: renamed from: s.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2698d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f49819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f49820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f49821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f49822d;

    public C2698d() {
        this(8);
    }

    public C2698d(int i9) {
        if (i9 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i9 > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        i9 = Integer.bitCount(i9) != 1 ? Integer.highestOneBit(i9 - 1) << 1 : i9;
        this.f49822d = i9 - 1;
        this.f49819a = new int[i9];
    }

    public void a(int i9) {
        int[] iArr = this.f49819a;
        int i10 = this.f49821c;
        iArr[i10] = i9;
        int i11 = this.f49822d & (i10 + 1);
        this.f49821c = i11;
        if (i11 == this.f49820b) {
            c();
        }
    }

    public void b() {
        this.f49821c = this.f49820b;
    }

    public final void c() {
        int[] iArr = this.f49819a;
        int length = iArr.length;
        int i9 = this.f49820b;
        int i10 = length - i9;
        int i11 = length << 1;
        if (i11 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i11];
        System.arraycopy(iArr, i9, iArr2, 0, i10);
        System.arraycopy(this.f49819a, 0, iArr2, i10, this.f49820b);
        this.f49819a = iArr2;
        this.f49820b = 0;
        this.f49821c = length;
        this.f49822d = i11 - 1;
    }

    public int d(int i9) {
        if (i9 < 0 || i9 >= g()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f49819a[this.f49822d & (this.f49820b + i9)];
    }

    public int e() {
        int i9 = this.f49820b;
        int i10 = this.f49821c;
        if (i9 != i10) {
            return this.f49819a[(i10 - 1) & this.f49822d];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public int f() {
        int i9 = this.f49820b;
        int i10 = this.f49821c;
        if (i9 == i10) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i11 = this.f49822d & (i10 - 1);
        int i12 = this.f49819a[i11];
        this.f49821c = i11;
        return i12;
    }

    public int g() {
        return (this.f49821c - this.f49820b) & this.f49822d;
    }
}
