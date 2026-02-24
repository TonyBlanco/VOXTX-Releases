package M6;

import com.google.android.gms.common.api.a;
import java.util.Arrays;
import java.util.Map;
import x6.EnumC2960a;
import x6.EnumC2964e;

/* JADX INFO: loaded from: classes.dex */
public final class a extends k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char[] f5167d = "0123456789-$:/.+ABCD".toCharArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f5168e = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final char[] f5169f = {'A', 'B', 'C', 'D'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f5170a = new StringBuilder(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f5171b = new int[80];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5172c = 0;

    public static boolean h(char[] cArr, char c9) {
        if (cArr != null) {
            for (char c10 : cArr) {
                if (c10 == c9) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // M6.k
    public x6.o c(int i9, D6.a aVar, Map map) throws x6.k {
        int i10;
        Arrays.fill(this.f5171b, 0);
        k(aVar);
        int iJ = j();
        this.f5170a.setLength(0);
        int i11 = iJ;
        while (true) {
            int iL = l(i11);
            if (iL == -1) {
                throw x6.k.a();
            }
            this.f5170a.append((char) iL);
            i10 = i11 + 8;
            if ((this.f5170a.length() > 1 && h(f5169f, f5167d[iL])) || i10 >= this.f5172c) {
                break;
            }
            i11 = i10;
        }
        int i12 = i11 + 7;
        int i13 = this.f5171b[i12];
        int i14 = 0;
        for (int i15 = -8; i15 < -1; i15++) {
            i14 += this.f5171b[i10 + i15];
        }
        if (i10 < this.f5172c && i13 < i14 / 2) {
            throw x6.k.a();
        }
        m(iJ);
        for (int i16 = 0; i16 < this.f5170a.length(); i16++) {
            StringBuilder sb = this.f5170a;
            sb.setCharAt(i16, f5167d[sb.charAt(i16)]);
        }
        char cCharAt = this.f5170a.charAt(0);
        char[] cArr = f5169f;
        if (!h(cArr, cCharAt)) {
            throw x6.k.a();
        }
        StringBuilder sb2 = this.f5170a;
        if (!h(cArr, sb2.charAt(sb2.length() - 1))) {
            throw x6.k.a();
        }
        if (this.f5170a.length() <= 3) {
            throw x6.k.a();
        }
        if (map == null || !map.containsKey(EnumC2964e.RETURN_CODABAR_START_END)) {
            StringBuilder sb3 = this.f5170a;
            sb3.deleteCharAt(sb3.length() - 1);
            this.f5170a.deleteCharAt(0);
        }
        int i17 = 0;
        for (int i18 = 0; i18 < iJ; i18++) {
            i17 += this.f5171b[i18];
        }
        float f9 = i17;
        while (iJ < i12) {
            i17 += this.f5171b[iJ];
            iJ++;
        }
        float f10 = i9;
        return new x6.o(this.f5170a.toString(), null, new x6.q[]{new x6.q(f9, f10), new x6.q(i17, f10)}, EnumC2960a.CODABAR);
    }

    public final void i(int i9) {
        int[] iArr = this.f5171b;
        int i10 = this.f5172c;
        iArr[i10] = i9;
        int i11 = i10 + 1;
        this.f5172c = i11;
        if (i11 >= iArr.length) {
            int[] iArr2 = new int[i11 << 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f5171b = iArr2;
        }
    }

    public final int j() throws x6.k {
        for (int i9 = 1; i9 < this.f5172c; i9 += 2) {
            int iL = l(i9);
            if (iL != -1 && h(f5169f, f5167d[iL])) {
                int i10 = 0;
                for (int i11 = i9; i11 < i9 + 7; i11++) {
                    i10 += this.f5171b[i11];
                }
                if (i9 == 1 || this.f5171b[i9 - 1] >= i10 / 2) {
                    return i9;
                }
            }
        }
        throw x6.k.a();
    }

    public final void k(D6.a aVar) throws x6.k {
        int i9 = 0;
        this.f5172c = 0;
        int iK = aVar.k(0);
        int iL = aVar.l();
        if (iK >= iL) {
            throw x6.k.a();
        }
        boolean z9 = true;
        while (iK < iL) {
            if (aVar.h(iK) != z9) {
                i9++;
            } else {
                i(i9);
                z9 = !z9;
                i9 = 1;
            }
            iK++;
        }
        i(i9);
    }

    public final int l(int i9) {
        int i10 = i9 + 7;
        if (i10 >= this.f5172c) {
            return -1;
        }
        int[] iArr = this.f5171b;
        int i11 = a.e.API_PRIORITY_OTHER;
        int i12 = 0;
        int i13 = a.e.API_PRIORITY_OTHER;
        int i14 = 0;
        for (int i15 = i9; i15 < i10; i15 += 2) {
            int i16 = iArr[i15];
            if (i16 < i13) {
                i13 = i16;
            }
            if (i16 > i14) {
                i14 = i16;
            }
        }
        int i17 = (i13 + i14) / 2;
        int i18 = 0;
        for (int i19 = i9 + 1; i19 < i10; i19 += 2) {
            int i20 = iArr[i19];
            if (i20 < i11) {
                i11 = i20;
            }
            if (i20 > i18) {
                i18 = i20;
            }
        }
        int i21 = (i11 + i18) / 2;
        int i22 = 128;
        int i23 = 0;
        for (int i24 = 0; i24 < 7; i24++) {
            i22 >>= 1;
            if (iArr[i9 + i24] > ((i24 & 1) == 0 ? i17 : i21)) {
                i23 |= i22;
            }
        }
        while (true) {
            int[] iArr2 = f5168e;
            if (i12 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i12] == i23) {
                return i12;
            }
            i12++;
        }
    }

    public final void m(int i9) throws x6.k {
        int[] iArr = new int[4];
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        int[] iArr2 = new int[4];
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int length = this.f5170a.length() - 1;
        int i10 = i9;
        int i11 = 0;
        while (true) {
            int i12 = f5168e[this.f5170a.charAt(i11)];
            for (int i13 = 6; i13 >= 0; i13--) {
                int i14 = (i13 & 1) + ((i12 & 1) << 1);
                iArr[i14] = iArr[i14] + this.f5171b[i10 + i13];
                iArr2[i14] = iArr2[i14] + 1;
                i12 >>= 1;
            }
            if (i11 >= length) {
                break;
            }
            i10 += 8;
            i11++;
        }
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        for (int i15 = 0; i15 < 2; i15++) {
            fArr2[i15] = 0.0f;
            int i16 = i15 + 2;
            int i17 = iArr[i16];
            int i18 = iArr2[i16];
            float f9 = ((iArr[i15] / iArr2[i15]) + (i17 / i18)) / 2.0f;
            fArr2[i16] = f9;
            fArr[i15] = f9;
            fArr[i16] = ((i17 * 2.0f) + 1.5f) / i18;
        }
        int i19 = i9;
        int i20 = 0;
        loop3: while (true) {
            int i21 = f5168e[this.f5170a.charAt(i20)];
            for (int i22 = 6; i22 >= 0; i22--) {
                int i23 = (i22 & 1) + ((i21 & 1) << 1);
                float f10 = this.f5171b[i19 + i22];
                if (f10 < fArr2[i23] || f10 > fArr[i23]) {
                    break loop3;
                }
                i21 >>= 1;
            }
            if (i20 >= length) {
                return;
            }
            i19 += 8;
            i20++;
        }
        throw x6.k.a();
    }
}
