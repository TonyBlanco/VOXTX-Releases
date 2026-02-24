package Y6;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f10715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10717c;

    public p(byte[] bArr, int i9, int i10) {
        this.f10715a = bArr;
        this.f10716b = i9;
        this.f10717c = i10;
    }

    public static byte[] e(byte[] bArr, int i9, int i10) {
        int i11 = i9 * i10;
        byte[] bArr2 = new byte[i11];
        int i12 = i11 - 1;
        for (int i13 = 0; i13 < i11; i13++) {
            bArr2[i12] = bArr[i13];
            i12--;
        }
        return bArr2;
    }

    public static byte[] f(byte[] bArr, int i9, int i10) {
        int i11 = i9 * i10;
        byte[] bArr2 = new byte[i11];
        int i12 = i11 - 1;
        for (int i13 = 0; i13 < i9; i13++) {
            for (int i14 = i10 - 1; i14 >= 0; i14--) {
                bArr2[i12] = bArr[(i14 * i9) + i13];
                i12--;
            }
        }
        return bArr2;
    }

    public static byte[] g(byte[] bArr, int i9, int i10) {
        byte[] bArr2 = new byte[i9 * i10];
        int i11 = 0;
        for (int i12 = 0; i12 < i9; i12++) {
            for (int i13 = i10 - 1; i13 >= 0; i13--) {
                bArr2[i11] = bArr[(i13 * i9) + i12];
                i11++;
            }
        }
        return bArr2;
    }

    public p a(Rect rect, int i9) {
        int iWidth = rect.width() / i9;
        int iHeight = rect.height() / i9;
        int i10 = rect.top;
        byte[] bArr = new byte[iWidth * iHeight];
        if (i9 == 1) {
            int i11 = (i10 * this.f10716b) + rect.left;
            for (int i12 = 0; i12 < iHeight; i12++) {
                System.arraycopy(this.f10715a, i11, bArr, i12 * iWidth, iWidth);
                i11 += this.f10716b;
            }
        } else {
            int i13 = (i10 * this.f10716b) + rect.left;
            for (int i14 = 0; i14 < iHeight; i14++) {
                int i15 = i14 * iWidth;
                int i16 = i13;
                for (int i17 = 0; i17 < iWidth; i17++) {
                    bArr[i15] = this.f10715a[i16];
                    i16 += i9;
                    i15++;
                }
                i13 += this.f10716b * i9;
            }
        }
        return new p(bArr, iWidth, iHeight);
    }

    public byte[] b() {
        return this.f10715a;
    }

    public int c() {
        return this.f10717c;
    }

    public int d() {
        return this.f10716b;
    }

    public p h(int i9) {
        return i9 != 90 ? i9 != 180 ? i9 != 270 ? this : new p(f(this.f10715a, this.f10716b, this.f10717c), this.f10717c, this.f10716b) : new p(e(this.f10715a, this.f10716b, this.f10717c), this.f10716b, this.f10717c) : new p(g(this.f10715a, this.f10716b, this.f10717c), this.f10717c, this.f10716b);
    }
}
