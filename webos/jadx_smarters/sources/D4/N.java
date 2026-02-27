package d4;

/* JADX INFO: loaded from: classes3.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f39710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39713d;

    public N(byte[] bArr, int i9, int i10) {
        i(bArr, i9, i10);
    }

    public final void a() {
        int i9;
        int i10 = this.f39712c;
        AbstractC1684a.g(i10 >= 0 && (i10 < (i9 = this.f39711b) || (i10 == i9 && this.f39713d == 0)));
    }

    public boolean b(int i9) {
        int i10 = this.f39712c;
        int i11 = i9 / 8;
        int i12 = i10 + i11;
        int i13 = (this.f39713d + i9) - (i11 * 8);
        if (i13 > 7) {
            i12++;
            i13 -= 8;
        }
        while (true) {
            i10++;
            if (i10 > i12 || i12 >= this.f39711b) {
                break;
            }
            if (j(i10)) {
                i12++;
                i10 += 2;
            }
        }
        int i14 = this.f39711b;
        if (i12 >= i14) {
            return i12 == i14 && i13 == 0;
        }
        return true;
    }

    public boolean c() {
        int i9 = this.f39712c;
        int i10 = this.f39713d;
        int i11 = 0;
        while (this.f39712c < this.f39711b && !d()) {
            i11++;
        }
        boolean z9 = this.f39712c == this.f39711b;
        this.f39712c = i9;
        this.f39713d = i10;
        return !z9 && b((i11 * 2) + 1);
    }

    public boolean d() {
        boolean z9 = (this.f39710a[this.f39712c] & (128 >> this.f39713d)) != 0;
        k();
        return z9;
    }

    public int e(int i9) {
        int i10;
        this.f39713d += i9;
        int i11 = 0;
        while (true) {
            i10 = this.f39713d;
            if (i10 <= 8) {
                break;
            }
            int i12 = i10 - 8;
            this.f39713d = i12;
            byte[] bArr = this.f39710a;
            int i13 = this.f39712c;
            i11 |= (bArr[i13] & 255) << i12;
            if (!j(i13 + 1)) {
                i = 1;
            }
            this.f39712c = i13 + i;
        }
        byte[] bArr2 = this.f39710a;
        int i14 = this.f39712c;
        int i15 = ((-1) >>> (32 - i9)) & (i11 | ((bArr2[i14] & 255) >> (8 - i10)));
        if (i10 == 8) {
            this.f39713d = 0;
            this.f39712c = i14 + (j(i14 + 1) ? 2 : 1);
        }
        a();
        return i15;
    }

    public final int f() {
        int i9 = 0;
        while (!d()) {
            i9++;
        }
        return ((1 << i9) - 1) + (i9 > 0 ? e(i9) : 0);
    }

    public int g() {
        int iF = f();
        return (iF % 2 == 0 ? -1 : 1) * ((iF + 1) / 2);
    }

    public int h() {
        return f();
    }

    public void i(byte[] bArr, int i9, int i10) {
        this.f39710a = bArr;
        this.f39712c = i9;
        this.f39711b = i10;
        this.f39713d = 0;
        a();
    }

    public final boolean j(int i9) {
        if (2 <= i9 && i9 < this.f39711b) {
            byte[] bArr = this.f39710a;
            if (bArr[i9] == 3 && bArr[i9 - 2] == 0 && bArr[i9 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public void k() {
        int i9 = this.f39713d + 1;
        this.f39713d = i9;
        if (i9 == 8) {
            this.f39713d = 0;
            int i10 = this.f39712c;
            this.f39712c = i10 + (j(i10 + 1) ? 2 : 1);
        }
        a();
    }

    public void l(int i9) {
        int i10 = this.f39712c;
        int i11 = i9 / 8;
        int i12 = i10 + i11;
        this.f39712c = i12;
        int i13 = this.f39713d + (i9 - (i11 * 8));
        this.f39713d = i13;
        if (i13 > 7) {
            this.f39712c = i12 + 1;
            this.f39713d = i13 - 8;
        }
        while (true) {
            i10++;
            if (i10 > this.f39712c) {
                a();
                return;
            } else if (j(i10)) {
                this.f39712c++;
                i10 += 2;
            }
        }
    }
}
