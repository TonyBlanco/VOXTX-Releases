package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.common.api.a;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class axy {
    public static int a(long j9) {
        int i9 = (int) j9;
        if (i9 == j9) {
            return i9;
        }
        throw new IllegalArgumentException(atp.b("Out of range: %s", Long.valueOf(j9)));
    }

    public static int b(long j9) {
        return j9 > 2147483647L ? a.e.API_PRIORITY_OTHER : (int) j9;
    }

    public static int[] c(Collection collection) {
        if (collection instanceof axx) {
            throw null;
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i9 = 0; i9 < length; i9++) {
            Object obj = array[i9];
            atp.k(obj);
            iArr[i9] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static int d(boolean z9, boolean z10) {
        if (z9 == z10) {
            return 0;
        }
        return !z9 ? -1 : 1;
    }

    public static byte[] e(byte[] bArr, byte[] bArr2) {
        long jF = f(bArr, 0, 0);
        long jF2 = f(bArr, 3, 2) & 67108611;
        long jF3 = f(bArr, 6, 4) & 67092735;
        long jF4 = f(bArr, 9, 6) & 66076671;
        long jF5 = f(bArr, 12, 8) & 1048575;
        long j9 = jF2 * 5;
        long j10 = jF3 * 5;
        long j11 = jF4 * 5;
        long j12 = jF5 * 5;
        int i9 = 17;
        byte[] bArr3 = new byte[17];
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        int i10 = 0;
        while (true) {
            int length = bArr2.length;
            if (i10 >= length) {
                long j18 = j13 + (j14 >> 26);
                long j19 = j18 & 67108863;
                long j20 = j15 + (j18 >> 26);
                long j21 = j20 & 67108863;
                long j22 = j16 + (j20 >> 26);
                long j23 = j22 & 67108863;
                long j24 = j17 + ((j22 >> 26) * 5);
                long j25 = j24 & 67108863;
                long j26 = (j14 & 67108863) + (j24 >> 26);
                long j27 = j25 + 5;
                long j28 = (j27 >> 26) + j26;
                long j29 = j19 + (j28 >> 26);
                long j30 = j21 + (j29 >> 26);
                long j31 = (j23 + (j30 >> 26)) - 67108864;
                long j32 = j31 >> 63;
                long j33 = ~j32;
                long j34 = (j26 & j32) | (j28 & 67108863 & j33);
                long j35 = (j19 & j32) | (j29 & 67108863 & j33);
                long j36 = (j21 & j32) | (j30 & 67108863 & j33);
                long jG = (((j25 & j32) | (j27 & 67108863 & j33) | (j34 << 26)) & 4294967295L) + g(bArr, 16);
                long jG2 = (((j34 >> 6) | (j35 << 20)) & 4294967295L) + g(bArr, 20) + (jG >> 32);
                long jG3 = (((j35 >> 12) | (j36 << 14)) & 4294967295L) + g(bArr, 24) + (jG2 >> 32);
                long jG4 = g(bArr, 28);
                byte[] bArr4 = new byte[16];
                h(bArr4, jG & 4294967295L, 0);
                h(bArr4, jG2 & 4294967295L, 4);
                h(bArr4, jG3 & 4294967295L, 8);
                h(bArr4, ((((((j31 & j33) | (j23 & j32)) << 8) | (j36 >> 18)) & 4294967295L) + jG4 + (jG3 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int iMin = Math.min(16, length - i10);
            System.arraycopy(bArr2, i10, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, i9, (byte) 0);
            }
            long jF6 = j17 + f(bArr3, 0, 0);
            long jF7 = j14 + f(bArr3, 3, 2);
            long jF8 = j13 + f(bArr3, 6, 4);
            long jF9 = j15 + f(bArr3, 9, 6);
            long jF10 = j16 + (f(bArr3, 12, 8) | ((long) (bArr3[16] << 24)));
            long j37 = (jF6 * jF) + (jF7 * j12) + (jF8 * j11) + (jF9 * j10) + (jF10 * j9);
            long j38 = (jF6 * jF2) + (jF7 * jF) + (jF8 * j12) + (jF9 * j11) + (jF10 * j10) + (j37 >> 26);
            long j39 = (jF6 * jF3) + (jF7 * jF2) + (jF8 * jF) + (jF9 * j12) + (jF10 * j11) + (j38 >> 26);
            long j40 = (jF6 * jF4) + (jF7 * jF3) + (jF8 * jF2) + (jF9 * jF) + (jF10 * j12) + (j39 >> 26);
            long j41 = (jF6 * jF5) + (jF7 * jF4) + (jF8 * jF3) + (jF9 * jF2) + (jF10 * jF) + (j40 >> 26);
            j16 = j41 & 67108863;
            long j42 = (j37 & 67108863) + ((j41 >> 26) * 5);
            j17 = j42 & 67108863;
            j14 = (j38 & 67108863) + (j42 >> 26);
            i10 += 16;
            j15 = j40 & 67108863;
            j13 = j39 & 67108863;
            i9 = 17;
        }
    }

    private static long f(byte[] bArr, int i9, int i10) {
        return (g(bArr, i9) >> i10) & 67108863;
    }

    private static long g(byte[] bArr, int i9) {
        return ((long) (((bArr[i9 + 3] & 255) << 24) | (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16))) & 4294967295L;
    }

    private static void h(byte[] bArr, long j9, int i9) {
        int i10 = 0;
        while (i10 < 4) {
            bArr[i9 + i10] = (byte) (255 & j9);
            i10++;
            j9 >>= 8;
        }
    }
}
