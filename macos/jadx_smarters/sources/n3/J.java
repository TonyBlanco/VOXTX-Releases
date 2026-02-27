package n3;

import d4.M;

/* JADX INFO: loaded from: classes3.dex */
public abstract class J {
    public static int a(byte[] bArr, int i9, int i10) {
        while (i9 < i10 && bArr[i9] != 71) {
            i9++;
        }
        return i9;
    }

    public static boolean b(byte[] bArr, int i9, int i10, int i11) {
        int i12 = 0;
        for (int i13 = -4; i13 <= 4; i13++) {
            int i14 = (i13 * 188) + i11;
            if (i14 < i9 || i14 >= i10 || bArr[i14] != 71) {
                i12 = 0;
            } else {
                i12++;
                if (i12 == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long c(M m9, int i9, int i10) {
        m9.U(i9);
        if (m9.a() < 5) {
            return -9223372036854775807L;
        }
        int iQ = m9.q();
        if ((8388608 & iQ) != 0 || ((2096896 & iQ) >> 8) != i10 || (iQ & 32) == 0 || m9.H() < 7 || m9.a() < 7 || (m9.H() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        m9.l(bArr, 0, 6);
        return d(bArr);
    }

    public static long d(byte[] bArr) {
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }
}
