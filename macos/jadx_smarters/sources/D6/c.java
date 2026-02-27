package D6;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f1462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1464c;

    public c(byte[] bArr) {
        this.f1462a = bArr;
    }

    public int a() {
        return ((this.f1462a.length - this.f1463b) * 8) - this.f1464c;
    }

    public int b() {
        return this.f1464c;
    }

    public int c() {
        return this.f1463b;
    }

    public int d(int i9) {
        if (i9 <= 0 || i9 > 32 || i9 > a()) {
            throw new IllegalArgumentException(String.valueOf(i9));
        }
        int i10 = this.f1464c;
        int i11 = 0;
        if (i10 > 0) {
            int i12 = 8 - i10;
            int iMin = Math.min(i9, i12);
            int i13 = i12 - iMin;
            byte[] bArr = this.f1462a;
            int i14 = this.f1463b;
            int i15 = (((255 >> (8 - iMin)) << i13) & bArr[i14]) >> i13;
            i9 -= iMin;
            int i16 = this.f1464c + iMin;
            this.f1464c = i16;
            if (i16 == 8) {
                this.f1464c = 0;
                this.f1463b = i14 + 1;
            }
            i11 = i15;
        }
        if (i9 <= 0) {
            return i11;
        }
        while (i9 >= 8) {
            int i17 = i11 << 8;
            byte[] bArr2 = this.f1462a;
            int i18 = this.f1463b;
            i11 = (bArr2[i18] & 255) | i17;
            this.f1463b = i18 + 1;
            i9 -= 8;
        }
        if (i9 <= 0) {
            return i11;
        }
        int i19 = 8 - i9;
        int i20 = (i11 << i9) | ((((255 >> i19) << i19) & this.f1462a[this.f1463b]) >> i19);
        this.f1464c += i9;
        return i20;
    }
}
