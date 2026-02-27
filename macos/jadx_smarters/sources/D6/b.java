package D6;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1458a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f1461e;

    public b(int i9) {
        this(i9, i9);
    }

    public b(int i9, int i10) {
        if (i9 <= 0 || i10 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f1458a = i9;
        this.f1459c = i10;
        int i11 = (i9 + 31) / 32;
        this.f1460d = i11;
        this.f1461e = new int[i11 * i10];
    }

    public b(int i9, int i10, int i11, int[] iArr) {
        this.f1458a = i9;
        this.f1459c = i10;
        this.f1460d = i11;
        this.f1461e = iArr;
    }

    public final String b(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(this.f1459c * (this.f1458a + 1));
        for (int i9 = 0; i9 < this.f1459c; i9++) {
            for (int i10 = 0; i10 < this.f1458a; i10++) {
                sb.append(f(i10, i9) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public b clone() {
        return new b(this.f1458a, this.f1459c, this.f1460d, (int[]) this.f1461e.clone());
    }

    public void e(int i9, int i10) {
        int i11 = (i10 * this.f1460d) + (i9 / 32);
        int[] iArr = this.f1461e;
        iArr[i11] = (1 << (i9 & 31)) ^ iArr[i11];
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1458a == bVar.f1458a && this.f1459c == bVar.f1459c && this.f1460d == bVar.f1460d && Arrays.equals(this.f1461e, bVar.f1461e);
    }

    public boolean f(int i9, int i10) {
        return ((this.f1461e[(i10 * this.f1460d) + (i9 / 32)] >>> (i9 & 31)) & 1) != 0;
    }

    public int[] g() {
        int length = this.f1461e.length - 1;
        while (length >= 0 && this.f1461e[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i9 = this.f1460d;
        int i10 = length / i9;
        int i11 = (length % i9) << 5;
        int i12 = 31;
        while ((this.f1461e[length] >>> i12) == 0) {
            i12--;
        }
        return new int[]{i11 + i12, i10};
    }

    public int[] h() {
        int i9 = this.f1458a;
        int i10 = this.f1459c;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < this.f1459c; i13++) {
            int i14 = 0;
            while (true) {
                int i15 = this.f1460d;
                if (i14 < i15) {
                    int i16 = this.f1461e[(i15 * i13) + i14];
                    if (i16 != 0) {
                        if (i13 < i10) {
                            i10 = i13;
                        }
                        if (i13 > i12) {
                            i12 = i13;
                        }
                        int i17 = i14 << 5;
                        if (i17 < i9) {
                            int i18 = 0;
                            while ((i16 << (31 - i18)) == 0) {
                                i18++;
                            }
                            int i19 = i18 + i17;
                            if (i19 < i9) {
                                i9 = i19;
                            }
                        }
                        if (i17 + 31 > i11) {
                            int i20 = 31;
                            while ((i16 >>> i20) == 0) {
                                i20--;
                            }
                            int i21 = i17 + i20;
                            if (i21 > i11) {
                                i11 = i21;
                            }
                        }
                    }
                    i14++;
                }
            }
        }
        if (i11 < i9 || i12 < i10) {
            return null;
        }
        return new int[]{i9, i10, (i11 - i9) + 1, (i12 - i10) + 1};
    }

    public int hashCode() {
        int i9 = this.f1458a;
        return (((((((i9 * 31) + i9) * 31) + this.f1459c) * 31) + this.f1460d) * 31) + Arrays.hashCode(this.f1461e);
    }

    public int i() {
        return this.f1459c;
    }

    public a j(int i9, a aVar) {
        if (aVar == null || aVar.l() < this.f1458a) {
            aVar = new a(this.f1458a);
        } else {
            aVar.e();
        }
        int i10 = i9 * this.f1460d;
        for (int i11 = 0; i11 < this.f1460d; i11++) {
            aVar.s(i11 << 5, this.f1461e[i10 + i11]);
        }
        return aVar;
    }

    public int[] k() {
        int[] iArr;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            iArr = this.f1461e;
            if (i10 >= iArr.length || iArr[i10] != 0) {
                break;
            }
            i10++;
        }
        if (i10 == iArr.length) {
            return null;
        }
        int i11 = this.f1460d;
        int i12 = i10 / i11;
        int i13 = (i10 % i11) << 5;
        while ((iArr[i10] << (31 - i9)) == 0) {
            i9++;
        }
        return new int[]{i13 + i9, i12};
    }

    public int l() {
        return this.f1458a;
    }

    public void m() {
        a aVar = new a(this.f1458a);
        a aVar2 = new a(this.f1458a);
        int i9 = (this.f1459c + 1) / 2;
        for (int i10 = 0; i10 < i9; i10++) {
            aVar = j(i10, aVar);
            int i11 = (this.f1459c - 1) - i10;
            aVar2 = j(i11, aVar2);
            aVar.p();
            aVar2.p();
            p(i10, aVar2);
            p(i11, aVar);
        }
    }

    public void n(int i9, int i10) {
        int i11 = (i10 * this.f1460d) + (i9 / 32);
        int[] iArr = this.f1461e;
        iArr[i11] = (1 << (i9 & 31)) | iArr[i11];
    }

    public void o(int i9, int i10, int i11, int i12) {
        if (i10 < 0 || i9 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i12 <= 0 || i11 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i13 = i11 + i9;
        int i14 = i12 + i10;
        if (i14 > this.f1459c || i13 > this.f1458a) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i10 < i14) {
            int i15 = this.f1460d * i10;
            for (int i16 = i9; i16 < i13; i16++) {
                int[] iArr = this.f1461e;
                int i17 = (i16 / 32) + i15;
                iArr[i17] = iArr[i17] | (1 << (i16 & 31));
            }
            i10++;
        }
    }

    public void p(int i9, a aVar) {
        int[] iArrI = aVar.i();
        int[] iArr = this.f1461e;
        int i10 = this.f1460d;
        System.arraycopy(iArrI, 0, iArr, i9 * i10, i10);
    }

    public String q(String str, String str2) {
        return b(str, str2, "\n");
    }

    public String toString() {
        return q("X ", "  ");
    }
}
