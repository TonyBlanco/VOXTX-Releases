package s;

/* JADX INFO: renamed from: s.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2697c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f49815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f49816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f49817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f49818d;

    public C2697c(int i9) {
        if (i9 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i9 > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        i9 = Integer.bitCount(i9) != 1 ? Integer.highestOneBit(i9 - 1) << 1 : i9;
        this.f49818d = i9 - 1;
        this.f49815a = new Object[i9];
    }

    public void a(Object obj) {
        int i9 = (this.f49816b - 1) & this.f49818d;
        this.f49816b = i9;
        this.f49815a[i9] = obj;
        if (i9 == this.f49817c) {
            d();
        }
    }

    public void b(Object obj) {
        Object[] objArr = this.f49815a;
        int i9 = this.f49817c;
        objArr[i9] = obj;
        int i10 = this.f49818d & (i9 + 1);
        this.f49817c = i10;
        if (i10 == this.f49816b) {
            d();
        }
    }

    public void c() {
        g(h());
    }

    public final void d() {
        Object[] objArr = this.f49815a;
        int length = objArr.length;
        int i9 = this.f49816b;
        int i10 = length - i9;
        int i11 = length << 1;
        if (i11 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        Object[] objArr2 = new Object[i11];
        System.arraycopy(objArr, i9, objArr2, 0, i10);
        System.arraycopy(this.f49815a, 0, objArr2, i10, this.f49816b);
        this.f49815a = objArr2;
        this.f49816b = 0;
        this.f49817c = length;
        this.f49818d = i11 - 1;
    }

    public Object e(int i9) {
        if (i9 < 0 || i9 >= h()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f49815a[this.f49818d & (this.f49816b + i9)];
    }

    public void f(int i9) {
        int i10;
        if (i9 <= 0) {
            return;
        }
        if (i9 > h()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i11 = this.f49817c;
        int i12 = i9 < i11 ? i11 - i9 : 0;
        int i13 = i12;
        while (true) {
            i10 = this.f49817c;
            if (i13 >= i10) {
                break;
            }
            this.f49815a[i13] = null;
            i13++;
        }
        int i14 = i10 - i12;
        int i15 = i9 - i14;
        this.f49817c = i10 - i14;
        if (i15 > 0) {
            int length = this.f49815a.length;
            this.f49817c = length;
            int i16 = length - i15;
            for (int i17 = i16; i17 < this.f49817c; i17++) {
                this.f49815a[i17] = null;
            }
            this.f49817c = i16;
        }
    }

    public void g(int i9) {
        if (i9 <= 0) {
            return;
        }
        if (i9 > h()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int length = this.f49815a.length;
        int i10 = this.f49816b;
        if (i9 < length - i10) {
            length = i10 + i9;
        }
        while (i10 < length) {
            this.f49815a[i10] = null;
            i10++;
        }
        int i11 = this.f49816b;
        int i12 = length - i11;
        int i13 = i9 - i12;
        this.f49816b = this.f49818d & (i11 + i12);
        if (i13 > 0) {
            for (int i14 = 0; i14 < i13; i14++) {
                this.f49815a[i14] = null;
            }
            this.f49816b = i13;
        }
    }

    public int h() {
        return (this.f49817c - this.f49816b) & this.f49818d;
    }
}
