package S6;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f9435f = new b(929, 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f9436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f9437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f9438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f9439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9440e;

    public b(int i9, int i10) {
        this.f9440e = i9;
        this.f9436a = new int[i9];
        this.f9437b = new int[i9];
        int i11 = 1;
        for (int i12 = 0; i12 < i9; i12++) {
            this.f9436a[i12] = i11;
            i11 = (i11 * i10) % i9;
        }
        for (int i13 = 0; i13 < i9 - 1; i13++) {
            this.f9437b[this.f9436a[i13]] = i13;
        }
        this.f9438c = new c(this, new int[]{0});
        this.f9439d = new c(this, new int[]{1});
    }

    public int a(int i9, int i10) {
        return (i9 + i10) % this.f9440e;
    }

    public c b(int i9, int i10) {
        if (i9 < 0) {
            throw new IllegalArgumentException();
        }
        if (i10 == 0) {
            return this.f9438c;
        }
        int[] iArr = new int[i9 + 1];
        iArr[0] = i10;
        return new c(this, iArr);
    }

    public int c(int i9) {
        return this.f9436a[i9];
    }

    public c d() {
        return this.f9439d;
    }

    public int e() {
        return this.f9440e;
    }

    public c f() {
        return this.f9438c;
    }

    public int g(int i9) {
        if (i9 != 0) {
            return this.f9436a[(this.f9440e - this.f9437b[i9]) - 1];
        }
        throw new ArithmeticException();
    }

    public int h(int i9) {
        if (i9 != 0) {
            return this.f9437b[i9];
        }
        throw new IllegalArgumentException();
    }

    public int i(int i9, int i10) {
        if (i9 == 0 || i10 == 0) {
            return 0;
        }
        int[] iArr = this.f9436a;
        int[] iArr2 = this.f9437b;
        return iArr[(iArr2[i9] + iArr2[i10]) % (this.f9440e - 1)];
    }

    public int j(int i9, int i10) {
        int i11 = this.f9440e;
        return ((i9 + i11) - i10) % i11;
    }
}
