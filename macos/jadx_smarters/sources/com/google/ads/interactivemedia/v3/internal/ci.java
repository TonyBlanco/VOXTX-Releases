package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class ci {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f22621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22624d;

    public ci() {
        this.f22621a = cq.f22645f;
    }

    public ci(byte[] bArr) {
        int length = bArr.length;
        this.f22621a = bArr;
        this.f22624d = length;
    }

    private final void n() {
        int i9;
        int i10 = this.f22622b;
        boolean z9 = false;
        if (i10 >= 0 && (i10 < (i9 = this.f22624d) || (i10 == i9 && this.f22623c == 0))) {
            z9 = true;
        }
        af.w(z9);
    }

    public final int a() {
        return ((this.f22624d - this.f22622b) * 8) - this.f22623c;
    }

    public final int b() {
        return (this.f22622b * 8) + this.f22623c;
    }

    public final int c(int i9) {
        int i10;
        if (i9 == 0) {
            return 0;
        }
        this.f22623c += i9;
        int i11 = 0;
        while (true) {
            i10 = this.f22623c;
            if (i10 <= 8) {
                break;
            }
            int i12 = i10 - 8;
            this.f22623c = i12;
            byte[] bArr = this.f22621a;
            int i13 = this.f22622b;
            this.f22622b = i13 + 1;
            i11 |= (bArr[i13] & 255) << i12;
        }
        byte[] bArr2 = this.f22621a;
        int i14 = this.f22622b;
        int i15 = ((-1) >>> (32 - i9)) & (i11 | ((bArr2[i14] & 255) >> (8 - i10)));
        if (i10 == 8) {
            this.f22623c = 0;
            this.f22622b = i14 + 1;
        }
        n();
        return i15;
    }

    public final void d() {
        if (this.f22623c == 0) {
            return;
        }
        this.f22623c = 0;
        this.f22622b++;
        n();
    }

    public final void e(byte[] bArr) {
        f(bArr, bArr.length);
    }

    public final void f(byte[] bArr, int i9) {
        this.f22621a = bArr;
        this.f22622b = 0;
        this.f22623c = 0;
        this.f22624d = i9;
    }

    public final void g(int i9) {
        int i10 = i9 / 8;
        this.f22622b = i10;
        this.f22623c = i9 - (i10 * 8);
        n();
    }

    public final void h() {
        int i9 = this.f22623c + 1;
        this.f22623c = i9;
        if (i9 == 8) {
            this.f22623c = 0;
            this.f22622b++;
        }
        n();
    }

    public final void i(int i9) {
        int i10 = i9 / 8;
        int i11 = this.f22622b + i10;
        this.f22622b = i11;
        int i12 = this.f22623c + (i9 - (i10 * 8));
        this.f22623c = i12;
        if (i12 > 7) {
            this.f22622b = i11 + 1;
            this.f22623c = i12 - 8;
        }
        n();
    }

    public final void j(int i9) {
        af.w(this.f22623c == 0);
        this.f22622b += i9;
        n();
    }

    public final boolean k() {
        boolean z9 = (this.f22621a[this.f22622b] & (128 >> this.f22623c)) != 0;
        h();
        return z9;
    }

    public final void l(int i9) {
        int i10 = i9 & 16383;
        int iMin = Math.min(8 - this.f22623c, 14);
        int i11 = this.f22623c;
        int i12 = (8 - i11) - iMin;
        byte[] bArr = this.f22621a;
        int i13 = this.f22622b;
        byte b9 = (byte) (((65280 >> i11) | ((1 << i12) - 1)) & bArr[i13]);
        bArr[i13] = b9;
        int i14 = 14 - iMin;
        bArr[i13] = (byte) (b9 | ((i10 >>> i14) << i12));
        int i15 = i13 + 1;
        while (i14 > 8) {
            i14 -= 8;
            this.f22621a[i15] = (byte) (i10 >>> i14);
            i15++;
        }
        byte[] bArr2 = this.f22621a;
        byte b10 = (byte) (bArr2[i15] & ((1 << r1) - 1));
        bArr2[i15] = b10;
        bArr2[i15] = (byte) (((i10 & ((1 << i14) - 1)) << (8 - i14)) | b10);
        i(14);
        n();
    }

    public final void m(byte[] bArr, int i9) {
        int i10 = i9 >> 3;
        for (int i11 = 0; i11 < i10; i11++) {
            byte[] bArr2 = this.f22621a;
            int i12 = this.f22622b;
            int i13 = i12 + 1;
            this.f22622b = i13;
            byte b9 = bArr2[i12];
            int i14 = this.f22623c;
            byte b10 = (byte) (b9 << i14);
            bArr[i11] = b10;
            bArr[i11] = (byte) (((255 & bArr2[i13]) >> (8 - i14)) | b10);
        }
        int i15 = i9 & 7;
        if (i15 == 0) {
            return;
        }
        byte b11 = (byte) (bArr[i10] & (255 >> i15));
        bArr[i10] = b11;
        int i16 = this.f22623c;
        if (i16 + i15 > 8) {
            byte[] bArr3 = this.f22621a;
            int i17 = this.f22622b;
            this.f22622b = i17 + 1;
            b11 = (byte) (b11 | ((bArr3[i17] & 255) << i16));
            bArr[i10] = b11;
            i16 -= 8;
        }
        int i18 = i16 + i15;
        this.f22623c = i18;
        byte[] bArr4 = this.f22621a;
        int i19 = this.f22622b;
        bArr[i10] = (byte) (((byte) (((255 & bArr4[i19]) >> (8 - i18)) << (8 - i15))) | b11);
        if (i18 == 8) {
            this.f22623c = 0;
            this.f22622b = i19 + 1;
        }
        n();
    }
}
