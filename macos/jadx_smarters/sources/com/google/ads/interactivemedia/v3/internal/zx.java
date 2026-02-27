package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f25316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f25318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f25319d;

    public zx(byte[] bArr, int i9, int i10) {
        d(bArr, i9, i10);
    }

    private final int j() {
        int i9 = 0;
        while (!i()) {
            i9++;
        }
        return ((1 << i9) - 1) + (i9 > 0 ? a(i9) : 0);
    }

    private final void k() {
        int i9;
        int i10 = this.f25318c;
        boolean z9 = false;
        if (i10 >= 0 && (i10 < (i9 = this.f25317b) || (i10 == i9 && this.f25319d == 0))) {
            z9 = true;
        }
        af.w(z9);
    }

    private final boolean l(int i9) {
        if (i9 < 2 || i9 >= this.f25317b) {
            return false;
        }
        byte[] bArr = this.f25316a;
        return bArr[i9] == 3 && bArr[i9 + (-2)] == 0 && bArr[i9 + (-1)] == 0;
    }

    public final int a(int i9) {
        int i10;
        this.f25319d += i9;
        int i11 = 0;
        while (true) {
            i10 = this.f25319d;
            if (i10 <= 8) {
                break;
            }
            int i12 = i10 - 8;
            this.f25319d = i12;
            byte[] bArr = this.f25316a;
            int i13 = this.f25318c;
            i11 |= (bArr[i13] & 255) << i12;
            if (true != l(i13 + 1)) {
                i = 1;
            }
            this.f25318c = i13 + i;
        }
        byte[] bArr2 = this.f25316a;
        int i14 = this.f25318c;
        int i15 = ((-1) >>> (32 - i9)) & (i11 | ((bArr2[i14] & 255) >> (8 - i10)));
        if (i10 == 8) {
            this.f25319d = 0;
            this.f25318c = i14 + (true != l(i14 + 1) ? 1 : 2);
        }
        k();
        return i15;
    }

    public final int b() {
        int iJ = j();
        return (iJ % 2 == 0 ? -1 : 1) * ((iJ + 1) / 2);
    }

    public final int c() {
        return j();
    }

    public final void d(byte[] bArr, int i9, int i10) {
        this.f25316a = bArr;
        this.f25318c = i9;
        this.f25317b = i10;
        this.f25319d = 0;
        k();
    }

    public final void e() {
        int i9 = this.f25319d + 1;
        this.f25319d = i9;
        if (i9 == 8) {
            this.f25319d = 0;
            int i10 = this.f25318c;
            this.f25318c = i10 + (true == l(i10 + 1) ? 2 : 1);
        }
        k();
    }

    public final void f(int i9) {
        int i10 = this.f25318c;
        int i11 = i9 / 8;
        int i12 = i10 + i11;
        this.f25318c = i12;
        int i13 = this.f25319d + (i9 - (i11 * 8));
        this.f25319d = i13;
        if (i13 > 7) {
            this.f25318c = i12 + 1;
            this.f25319d = i13 - 8;
        }
        while (true) {
            i10++;
            if (i10 > this.f25318c) {
                k();
                return;
            } else if (l(i10)) {
                this.f25318c++;
                i10 += 2;
            }
        }
    }

    public final boolean g(int i9) {
        int i10 = this.f25318c;
        int i11 = i9 / 8;
        int i12 = i10 + i11;
        int i13 = (this.f25319d + i9) - (i11 * 8);
        if (i13 > 7) {
            i12++;
            i13 -= 8;
        }
        while (true) {
            i10++;
            if (i10 > i12 || i12 >= this.f25317b) {
                break;
            }
            if (l(i10)) {
                i12++;
                i10 += 2;
            }
        }
        int i14 = this.f25317b;
        if (i12 >= i14) {
            return i12 == i14 && i13 == 0;
        }
        return true;
    }

    public final boolean h() {
        int i9 = this.f25318c;
        int i10 = this.f25319d;
        int i11 = 0;
        while (this.f25318c < this.f25317b && !i()) {
            i11++;
        }
        int i12 = this.f25318c;
        int i13 = this.f25317b;
        this.f25318c = i9;
        this.f25319d = i10;
        return i12 != i13 && g((i11 + i11) + 1);
    }

    public final boolean i() {
        boolean z9 = (this.f25316a[this.f25318c] & (128 >> this.f25319d)) != 0;
        e();
        return z9;
    }
}
