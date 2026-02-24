package X6;

import V6.h;
import V6.j;
import com.google.android.gms.common.api.a;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import x6.s;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f10469a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10470a;

        static {
            int[] iArr = new int[h.values().length];
            f10470a = iArr;
            try {
                iArr[h.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10470a[h.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10470a[h.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10470a[h.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static void a(String str, D6.a aVar, String str2) throws s {
        try {
            for (byte b9 : str.getBytes(str2)) {
                aVar.d(b9, 8);
            }
        } catch (UnsupportedEncodingException e9) {
            throw new s(e9);
        }
    }

    public static void b(CharSequence charSequence, D6.a aVar) throws s {
        int length = charSequence.length();
        int i9 = 0;
        while (i9 < length) {
            int iP = p(charSequence.charAt(i9));
            if (iP == -1) {
                throw new s();
            }
            int i10 = i9 + 1;
            if (i10 < length) {
                int iP2 = p(charSequence.charAt(i10));
                if (iP2 == -1) {
                    throw new s();
                }
                aVar.d((iP * 45) + iP2, 11);
                i9 += 2;
            } else {
                aVar.d(iP, 6);
                i9 = i10;
            }
        }
    }

    public static void c(String str, h hVar, D6.a aVar, String str2) throws s {
        int i9 = a.f10470a[hVar.ordinal()];
        if (i9 == 1) {
            h(str, aVar);
            return;
        }
        if (i9 == 2) {
            b(str, aVar);
        } else if (i9 == 3) {
            a(str, aVar, str2);
        } else {
            if (i9 != 4) {
                throw new s("Invalid mode: ".concat(String.valueOf(hVar)));
            }
            e(str, aVar);
        }
    }

    public static void d(D6.d dVar, D6.a aVar) {
        aVar.d(h.ECI.getBits(), 4);
        aVar.d(dVar.getValue(), 8);
    }

    public static void e(String str, D6.a aVar) throws s {
        int i9;
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            if (bytes.length % 2 != 0) {
                throw new s("Kanji byte size not even");
            }
            int length = bytes.length - 1;
            for (int i10 = 0; i10 < length; i10 += 2) {
                int i11 = ((bytes[i10] & 255) << 8) | (bytes[i10 + 1] & 255);
                int i12 = 33088;
                if (i11 >= 33088 && i11 <= 40956) {
                    i9 = i11 - i12;
                } else if (i11 < 57408 || i11 > 60351) {
                    i9 = -1;
                } else {
                    i12 = 49472;
                    i9 = i11 - i12;
                }
                if (i9 == -1) {
                    throw new s("Invalid byte sequence");
                }
                aVar.d(((i9 >> 8) * 192) + (i9 & 255), 13);
            }
        } catch (UnsupportedEncodingException e9) {
            throw new s(e9);
        }
    }

    public static void f(int i9, j jVar, h hVar, D6.a aVar) throws s {
        int characterCountBits = hVar.getCharacterCountBits(jVar);
        int i10 = 1 << characterCountBits;
        if (i9 < i10) {
            aVar.d(i9, characterCountBits);
            return;
        }
        throw new s(i9 + " is bigger than " + (i10 - 1));
    }

    public static void g(h hVar, D6.a aVar) {
        aVar.d(hVar.getBits(), 4);
    }

    public static void h(CharSequence charSequence, D6.a aVar) {
        int length = charSequence.length();
        int i9 = 0;
        while (i9 < length) {
            int iCharAt = charSequence.charAt(i9) - '0';
            int i10 = i9 + 2;
            if (i10 < length) {
                aVar.d((iCharAt * 100) + ((charSequence.charAt(i9 + 1) - '0') * 10) + (charSequence.charAt(i10) - '0'), 10);
                i9 += 3;
            } else {
                i9++;
                if (i9 < length) {
                    aVar.d((iCharAt * 10) + (charSequence.charAt(i9) - '0'), 7);
                    i9 = i10;
                } else {
                    aVar.d(iCharAt, 4);
                }
            }
        }
    }

    public static int i(h hVar, D6.a aVar, D6.a aVar2, j jVar) {
        return aVar.l() + hVar.getCharacterCountBits(jVar) + aVar2.l();
    }

    public static int j(b bVar) {
        return d.a(bVar) + d.c(bVar) + d.d(bVar) + d.e(bVar);
    }

    public static int k(D6.a aVar, V6.f fVar, j jVar, b bVar) throws s {
        int i9 = a.e.API_PRIORITY_OTHER;
        int i10 = -1;
        for (int i11 = 0; i11 < 8; i11++) {
            e.a(aVar, fVar, jVar, i11, bVar);
            int iJ = j(bVar);
            if (iJ < i9) {
                i10 = i11;
                i9 = iJ;
            }
        }
        return i10;
    }

    public static h l(String str, String str2) {
        if ("Shift_JIS".equals(str2) && s(str)) {
            return h.KANJI;
        }
        boolean z9 = false;
        boolean z10 = false;
        for (int i9 = 0; i9 < str.length(); i9++) {
            char cCharAt = str.charAt(i9);
            if (cCharAt >= '0' && cCharAt <= '9') {
                z10 = true;
            } else {
                if (p(cCharAt) == -1) {
                    return h.BYTE;
                }
                z9 = true;
            }
        }
        return z9 ? h.ALPHANUMERIC : z10 ? h.NUMERIC : h.BYTE;
    }

    public static j m(int i9, V6.f fVar) throws s {
        for (int i10 = 1; i10 <= 40; i10++) {
            j jVarI = j.i(i10);
            if (v(i9, jVarI, fVar)) {
                return jVarI;
            }
        }
        throw new s("Data too big");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X6.f n(java.lang.String r6, V6.f r7, java.util.Map r8) throws x6.s {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.c.n(java.lang.String, V6.f, java.util.Map):X6.f");
    }

    public static byte[] o(byte[] bArr, int i9) {
        int length = bArr.length;
        int[] iArr = new int[length + i9];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = bArr[i10] & 255;
        }
        new F6.d(F6.a.f2030l).b(iArr, i9);
        byte[] bArr2 = new byte[i9];
        for (int i11 = 0; i11 < i9; i11++) {
            bArr2[i11] = (byte) iArr[length + i11];
        }
        return bArr2;
    }

    public static int p(int i9) {
        int[] iArr = f10469a;
        if (i9 < iArr.length) {
            return iArr[i9];
        }
        return -1;
    }

    public static void q(int i9, int i10, int i11, int i12, int[] iArr, int[] iArr2) throws s {
        if (i12 >= i11) {
            throw new s("Block ID too large");
        }
        int i13 = i9 % i11;
        int i14 = i11 - i13;
        int i15 = i9 / i11;
        int i16 = i15 + 1;
        int i17 = i10 / i11;
        int i18 = i17 + 1;
        int i19 = i15 - i17;
        int i20 = i16 - i18;
        if (i19 != i20) {
            throw new s("EC bytes mismatch");
        }
        if (i11 != i14 + i13) {
            throw new s("RS blocks mismatch");
        }
        if (i9 != ((i17 + i19) * i14) + ((i18 + i20) * i13)) {
            throw new s("Total bytes mismatch");
        }
        if (i12 < i14) {
            iArr[0] = i17;
            iArr2[0] = i19;
        } else {
            iArr[0] = i18;
            iArr2[0] = i20;
        }
    }

    public static D6.a r(D6.a aVar, int i9, int i10, int i11) throws s {
        if (aVar.m() != i10) {
            throw new s("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i11);
        int i12 = 0;
        int iMax = 0;
        int iMax2 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            q(i9, i10, i11, i13, iArr, iArr2);
            int i14 = iArr[0];
            byte[] bArr = new byte[i14];
            aVar.t(i12 << 3, bArr, 0, i14);
            byte[] bArrO = o(bArr, iArr2[0]);
            arrayList.add(new X6.a(bArr, bArrO));
            iMax = Math.max(iMax, i14);
            iMax2 = Math.max(iMax2, bArrO.length);
            i12 += iArr[0];
        }
        if (i10 != i12) {
            throw new s("Data bytes does not match offset");
        }
        D6.a aVar2 = new D6.a();
        for (int i15 = 0; i15 < iMax; i15++) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] bArrA = ((X6.a) it.next()).a();
                if (i15 < bArrA.length) {
                    aVar2.d(bArrA[i15], 8);
                }
            }
        }
        for (int i16 = 0; i16 < iMax2; i16++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] bArrB = ((X6.a) it2.next()).b();
                if (i16 < bArrB.length) {
                    aVar2.d(bArrB[i16], 8);
                }
            }
        }
        if (i9 == aVar2.m()) {
            return aVar2;
        }
        throw new s("Interleaving error: " + i9 + " and " + aVar2.m() + " differ.");
    }

    public static boolean s(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i9 = 0; i9 < length; i9 += 2) {
                int i10 = bytes[i9] & 255;
                if ((i10 < 129 || i10 > 159) && (i10 < 224 || i10 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    public static j t(V6.f fVar, h hVar, D6.a aVar, D6.a aVar2) {
        return m(i(hVar, aVar, aVar2, m(i(hVar, aVar, aVar2, j.i(1)), fVar)), fVar);
    }

    public static void u(int i9, D6.a aVar) throws s {
        int i10 = i9 << 3;
        if (aVar.l() > i10) {
            throw new s("data bits cannot fit in the QR Code" + aVar.l() + " > " + i10);
        }
        for (int i11 = 0; i11 < 4 && aVar.l() < i10; i11++) {
            aVar.b(false);
        }
        int iL = aVar.l() & 7;
        if (iL > 0) {
            while (iL < 8) {
                aVar.b(false);
                iL++;
            }
        }
        int iM = i9 - aVar.m();
        for (int i12 = 0; i12 < iM; i12++) {
            aVar.d((i12 & 1) == 0 ? 236 : 17, 8);
        }
        if (aVar.l() != i10) {
            throw new s("Bits size does not equal capacity");
        }
    }

    public static boolean v(int i9, j jVar, V6.f fVar) {
        return jVar.h() - jVar.f(fVar).d() >= (i9 + 7) / 8;
    }
}
