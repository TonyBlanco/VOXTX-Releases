package d4;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f39700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39703d;

    public L() {
        this.f39700a = k0.f39782f;
    }

    public L(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public L(byte[] bArr, int i9) {
        this.f39700a = bArr;
        this.f39703d = i9;
    }

    public final void a() {
        int i9;
        int i10 = this.f39701b;
        AbstractC1684a.g(i10 >= 0 && (i10 < (i9 = this.f39703d) || (i10 == i9 && this.f39702c == 0)));
    }

    public int b() {
        return ((this.f39703d - this.f39701b) * 8) - this.f39702c;
    }

    public void c() {
        if (this.f39702c == 0) {
            return;
        }
        this.f39702c = 0;
        this.f39701b++;
        a();
    }

    public int d() {
        AbstractC1684a.g(this.f39702c == 0);
        return this.f39701b;
    }

    public int e() {
        return (this.f39701b * 8) + this.f39702c;
    }

    public void f(int i9, int i10) {
        if (i10 < 32) {
            i9 &= (1 << i10) - 1;
        }
        int iMin = Math.min(8 - this.f39702c, i10);
        int i11 = this.f39702c;
        int i12 = (8 - i11) - iMin;
        byte[] bArr = this.f39700a;
        int i13 = this.f39701b;
        byte b9 = (byte) (((65280 >> i11) | ((1 << i12) - 1)) & bArr[i13]);
        bArr[i13] = b9;
        int i14 = i10 - iMin;
        bArr[i13] = (byte) (b9 | ((i9 >>> i14) << i12));
        int i15 = i13 + 1;
        while (i14 > 8) {
            this.f39700a[i15] = (byte) (i9 >>> (i14 - 8));
            i14 -= 8;
            i15++;
        }
        int i16 = 8 - i14;
        byte[] bArr2 = this.f39700a;
        byte b10 = (byte) (bArr2[i15] & ((1 << i16) - 1));
        bArr2[i15] = b10;
        bArr2[i15] = (byte) (((i9 & ((1 << i14) - 1)) << i16) | b10);
        r(i10);
        a();
    }

    public boolean g() {
        boolean z9 = (this.f39700a[this.f39701b] & (128 >> this.f39702c)) != 0;
        q();
        return z9;
    }

    public int h(int i9) {
        int i10;
        if (i9 == 0) {
            return 0;
        }
        this.f39702c += i9;
        int i11 = 0;
        while (true) {
            i10 = this.f39702c;
            if (i10 <= 8) {
                break;
            }
            int i12 = i10 - 8;
            this.f39702c = i12;
            byte[] bArr = this.f39700a;
            int i13 = this.f39701b;
            this.f39701b = i13 + 1;
            i11 |= (bArr[i13] & 255) << i12;
        }
        byte[] bArr2 = this.f39700a;
        int i14 = this.f39701b;
        int i15 = ((-1) >>> (32 - i9)) & (i11 | ((bArr2[i14] & 255) >> (8 - i10)));
        if (i10 == 8) {
            this.f39702c = 0;
            this.f39701b = i14 + 1;
        }
        a();
        return i15;
    }

    public void i(byte[] bArr, int i9, int i10) {
        int i11 = (i10 >> 3) + i9;
        while (i9 < i11) {
            byte[] bArr2 = this.f39700a;
            int i12 = this.f39701b;
            int i13 = i12 + 1;
            this.f39701b = i13;
            byte b9 = bArr2[i12];
            int i14 = this.f39702c;
            byte b10 = (byte) (b9 << i14);
            bArr[i9] = b10;
            bArr[i9] = (byte) (((255 & bArr2[i13]) >> (8 - i14)) | b10);
            i9++;
        }
        int i15 = i10 & 7;
        if (i15 == 0) {
            return;
        }
        byte b11 = (byte) (bArr[i11] & (255 >> i15));
        bArr[i11] = b11;
        int i16 = this.f39702c;
        if (i16 + i15 > 8) {
            byte[] bArr3 = this.f39700a;
            int i17 = this.f39701b;
            this.f39701b = i17 + 1;
            bArr[i11] = (byte) (b11 | ((bArr3[i17] & 255) << i16));
            this.f39702c = i16 - 8;
        }
        int i18 = this.f39702c + i15;
        this.f39702c = i18;
        byte[] bArr4 = this.f39700a;
        int i19 = this.f39701b;
        bArr[i11] = (byte) (((byte) (((255 & bArr4[i19]) >> (8 - i18)) << (8 - i15))) | bArr[i11]);
        if (i18 == 8) {
            this.f39702c = 0;
            this.f39701b = i19 + 1;
        }
        a();
    }

    public long j(int i9) {
        return i9 <= 32 ? k0.u1(h(i9)) : k0.t1(h(i9 - 32), h(32));
    }

    public void k(byte[] bArr, int i9, int i10) {
        AbstractC1684a.g(this.f39702c == 0);
        System.arraycopy(this.f39700a, this.f39701b, bArr, i9, i10);
        this.f39701b += i10;
        a();
    }

    public String l(int i9, Charset charset) {
        byte[] bArr = new byte[i9];
        k(bArr, 0, i9);
        return new String(bArr, charset);
    }

    public void m(M m9) {
        o(m9.e(), m9.g());
        p(m9.f() * 8);
    }

    public void n(byte[] bArr) {
        o(bArr, bArr.length);
    }

    public void o(byte[] bArr, int i9) {
        this.f39700a = bArr;
        this.f39701b = 0;
        this.f39702c = 0;
        this.f39703d = i9;
    }

    public void p(int i9) {
        int i10 = i9 / 8;
        this.f39701b = i10;
        this.f39702c = i9 - (i10 * 8);
        a();
    }

    public void q() {
        int i9 = this.f39702c + 1;
        this.f39702c = i9;
        if (i9 == 8) {
            this.f39702c = 0;
            this.f39701b++;
        }
        a();
    }

    public void r(int i9) {
        int i10 = i9 / 8;
        int i11 = this.f39701b + i10;
        this.f39701b = i11;
        int i12 = this.f39702c + (i9 - (i10 * 8));
        this.f39702c = i12;
        if (i12 > 7) {
            this.f39701b = i11 + 1;
            this.f39702c = i12 - 8;
        }
        a();
    }

    public void s(int i9) {
        AbstractC1684a.g(this.f39702c == 0);
        this.f39701b += i9;
        a();
    }
}
