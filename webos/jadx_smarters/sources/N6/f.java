package N6;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static int a(int i9, int i10) {
        int i11 = i9 - i10;
        if (i11 > i10) {
            i11 = i10;
            i10 = i11;
        }
        int i12 = 1;
        int i13 = 1;
        while (i9 > i10) {
            i12 *= i9;
            if (i13 <= i11) {
                i12 /= i13;
                i13++;
            }
            i9--;
        }
        while (i13 <= i11) {
            i12 /= i13;
            i13++;
        }
        return i12;
    }

    public static int b(int[] iArr, int i9, boolean z9) {
        int[] iArr2 = iArr;
        int i10 = 0;
        for (int i11 : iArr2) {
            i10 += i11;
        }
        int length = iArr2.length;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int i15 = length - 1;
            if (i12 >= i15) {
                return i13;
            }
            int i16 = 1 << i12;
            i14 |= i16;
            int i17 = 1;
            while (i17 < iArr2[i12]) {
                int i18 = i10 - i17;
                int i19 = length - i12;
                int i20 = i19 - 2;
                int iA = a(i18 - 1, i20);
                if (z9 && i14 == 0) {
                    int i21 = i19 - 1;
                    if (i18 - i21 >= i21) {
                        iA -= a(i18 - i19, i20);
                    }
                }
                if (i19 - 1 > 1) {
                    int iA2 = 0;
                    for (int i22 = i18 - i20; i22 > i9; i22--) {
                        iA2 += a((i18 - i22) - 1, i19 - 3);
                    }
                    iA -= iA2 * (i15 - i12);
                } else if (i18 > i9) {
                    iA--;
                }
                i13 += iA;
                i17++;
                i14 &= ~i16;
                iArr2 = iArr;
            }
            i10 -= i17;
            i12++;
            iArr2 = iArr;
        }
    }
}
