package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class biy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f21534a = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f21535b = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f21536c = {67108863, 33554431};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f21537d = {26, 25};

    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        b(jArr4, jArr2, jArr3);
        c(jArr4, jArr);
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        long j9 = jArr2[0];
        long j10 = jArr3[1] * j9;
        long j11 = jArr2[1];
        long j12 = jArr3[0];
        jArr[1] = j10 + (j11 * j12);
        long j13 = jArr2[1];
        long j14 = jArr3[1];
        jArr[2] = ((j13 + j13) * j14) + (jArr3[2] * j9) + (jArr2[2] * j12);
        long j15 = jArr3[2];
        long j16 = jArr2[2];
        jArr[3] = (j13 * j15) + (j16 * j14) + (jArr3[3] * j9) + (jArr2[3] * j12);
        long j17 = jArr3[3];
        long j18 = jArr2[3];
        long j19 = (j13 * j17) + (j18 * j14);
        jArr[4] = (j16 * j15) + j19 + j19 + (jArr3[4] * j9) + (jArr2[4] * j12);
        long j20 = jArr3[4];
        long j21 = jArr2[4];
        jArr[5] = (j16 * j17) + (j18 * j15) + (j13 * j20) + (j21 * j14) + (jArr3[5] * j9) + (jArr2[5] * j12);
        long j22 = jArr3[5];
        long j23 = jArr2[5];
        long j24 = (j18 * j17) + (j13 * j22) + (j23 * j14);
        jArr[6] = j24 + j24 + (j16 * j20) + (j21 * j15) + (jArr3[6] * j9) + (jArr2[6] * j12);
        long j25 = jArr3[6];
        long j26 = jArr2[6];
        jArr[7] = (j18 * j20) + (j21 * j17) + (j16 * j22) + (j23 * j15) + (j13 * j25) + (j26 * j14) + (jArr3[7] * j9) + (jArr2[7] * j12);
        long j27 = jArr3[7];
        long j28 = jArr2[7];
        long j29 = (j18 * j22) + (j23 * j17) + (j13 * j27) + (j28 * j14);
        jArr[8] = (j21 * j20) + j29 + j29 + (j16 * j25) + (j26 * j15) + (jArr3[8] * j9) + (jArr2[8] * j12);
        long j30 = jArr3[8];
        long j31 = jArr2[8];
        jArr[9] = (j21 * j22) + (j23 * j20) + (j18 * j25) + (j26 * j17) + (j16 * j27) + (j28 * j15) + (j13 * j30) + (j31 * j14) + (j9 * jArr3[9]) + (jArr2[9] * j12);
        long j32 = jArr3[9];
        long j33 = jArr2[9];
        long j34 = (j23 * j22) + (j18 * j27) + (j28 * j17) + (j13 * j32) + (j14 * j33);
        jArr[10] = j34 + j34 + (j21 * j25) + (j26 * j20) + (j16 * j30) + (j31 * j15);
        jArr[11] = (j23 * j25) + (j26 * j22) + (j21 * j27) + (j28 * j20) + (j18 * j30) + (j31 * j17) + (j16 * j32) + (j15 * j33);
        long j35 = (j23 * j27) + (j28 * j22) + (j18 * j32) + (j17 * j33);
        jArr[12] = (j26 * j25) + j35 + j35 + (j21 * j30) + (j31 * j20);
        jArr[13] = (j26 * j27) + (j28 * j25) + (j23 * j30) + (j31 * j22) + (j21 * j32) + (j20 * j33);
        long j36 = (j28 * j27) + (j23 * j32) + (j22 * j33);
        jArr[14] = j36 + j36 + (j26 * j30) + (j31 * j25);
        jArr[15] = (j28 * j30) + (j31 * j27) + (j26 * j32) + (j25 * j33);
        long j37 = (j28 * j32) + (j27 * j33);
        jArr[16] = (j31 * j30) + j37 + j37;
        jArr[17] = (j31 * j32) + (j30 * j33);
        jArr[18] = (j33 + j33) * j32;
    }

    public static void c(long[] jArr, long[] jArr2) {
        e(jArr);
        d(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    public static void d(long[] jArr) {
        jArr[10] = 0;
        int i9 = 0;
        while (i9 < 10) {
            long j9 = jArr[i9];
            long j10 = j9 / 67108864;
            jArr[i9] = j9 - (j10 << 26);
            int i10 = i9 + 1;
            long j11 = jArr[i10] + j10;
            jArr[i10] = j11;
            long j12 = j11 / 33554432;
            jArr[i10] = j11 - (j12 << 25);
            i9 += 2;
            jArr[i9] = jArr[i9] + j12;
        }
        long j13 = jArr[0];
        long j14 = jArr[10];
        long j15 = j13 + (j14 << 4);
        jArr[0] = j15;
        long j16 = j15 + j14 + j14;
        jArr[0] = j16;
        long j17 = j16 + j14;
        jArr[0] = j17;
        jArr[10] = 0;
        long j18 = j17 / 67108864;
        jArr[0] = j17 - (j18 << 26);
        jArr[1] = jArr[1] + j18;
    }

    public static void e(long[] jArr) {
        long j9 = jArr[8];
        long j10 = jArr[18];
        long j11 = j9 + (j10 << 4);
        jArr[8] = j11;
        long j12 = j11 + j10 + j10;
        jArr[8] = j12;
        jArr[8] = j12 + j10;
        long j13 = jArr[7];
        long j14 = jArr[17];
        long j15 = j13 + (j14 << 4);
        jArr[7] = j15;
        long j16 = j15 + j14 + j14;
        jArr[7] = j16;
        jArr[7] = j16 + j14;
        long j17 = jArr[6];
        long j18 = jArr[16];
        long j19 = j17 + (j18 << 4);
        jArr[6] = j19;
        long j20 = j19 + j18 + j18;
        jArr[6] = j20;
        jArr[6] = j20 + j18;
        long j21 = jArr[5];
        long j22 = jArr[15];
        long j23 = j21 + (j22 << 4);
        jArr[5] = j23;
        long j24 = j23 + j22 + j22;
        jArr[5] = j24;
        jArr[5] = j24 + j22;
        long j25 = jArr[4];
        long j26 = jArr[14];
        long j27 = j25 + (j26 << 4);
        jArr[4] = j27;
        long j28 = j27 + j26 + j26;
        jArr[4] = j28;
        jArr[4] = j28 + j26;
        long j29 = jArr[3];
        long j30 = jArr[13];
        long j31 = j29 + (j30 << 4);
        jArr[3] = j31;
        long j32 = j31 + j30 + j30;
        jArr[3] = j32;
        jArr[3] = j32 + j30;
        long j33 = jArr[2];
        long j34 = jArr[12];
        long j35 = j33 + (j34 << 4);
        jArr[2] = j35;
        long j36 = j35 + j34 + j34;
        jArr[2] = j36;
        jArr[2] = j36 + j34;
        long j37 = jArr[1];
        long j38 = jArr[11];
        long j39 = j37 + (j38 << 4);
        jArr[1] = j39;
        long j40 = j39 + j38 + j38;
        jArr[1] = j40;
        jArr[1] = j40 + j38;
        long j41 = jArr[0];
        long j42 = jArr[10];
        long j43 = j41 + (j42 << 4);
        jArr[0] = j43;
        long j44 = j43 + j42 + j42;
        jArr[0] = j44;
        jArr[0] = j44 + j42;
    }

    public static void f(long[] jArr, long[] jArr2, long j9) {
        for (int i9 = 0; i9 < 10; i9++) {
            jArr[i9] = jArr2[i9] * j9;
        }
    }

    public static void g(long[] jArr, long[] jArr2) {
        long j9 = jArr2[0];
        long j10 = j9 * j9;
        long j11 = jArr2[1];
        long j12 = (j9 + j9) * j11;
        long j13 = jArr2[2];
        long j14 = (j11 * j11) + (j9 * j13);
        long j15 = jArr2[3];
        long j16 = (j11 * j13) + (j9 * j15);
        long j17 = jArr2[4];
        long j18 = (j13 * j13) + (j11 * 4 * j15) + ((j9 + j9) * j17);
        long j19 = jArr2[5];
        long j20 = (j13 * j15) + (j11 * j17) + (j9 * j19);
        long j21 = jArr2[6];
        long j22 = (j15 * j15) + (j13 * j17) + (j9 * j21) + ((j11 + j11) * j19);
        long j23 = jArr2[7];
        long j24 = (j15 * j17) + (j13 * j19) + (j11 * j21) + (j9 * j23);
        long j25 = jArr2[8];
        long j26 = (j11 * j23) + (j15 * j19);
        long j27 = (j13 * j21) + (j9 * j25) + j26 + j26;
        long j28 = (j17 * j17) + j27 + j27;
        long j29 = jArr2[9];
        long j30 = (j17 * j19) + (j15 * j21) + (j13 * j23) + (j11 * j25) + (j9 * j29);
        long j31 = (j15 * j23) + (j11 * j29);
        long j32 = (j19 * j19) + (j17 * j21) + (j13 * j25) + j31 + j31;
        long j33 = (j19 * j21) + (j17 * j23) + (j15 * j25) + (j13 * j29);
        long j34 = (j19 * j23) + (j15 * j29);
        long j35 = (j17 * j25) + j34 + j34;
        long j36 = (j21 * j21) + j35 + j35;
        long j37 = (j21 * j23) + (j19 * j25) + (j17 * j29);
        long j38 = (j23 * j23) + (j21 * j25) + ((j19 + j19) * j29);
        long j39 = (j23 * j25) + (j21 * j29);
        c(new long[]{j10, j12, j14 + j14, j16 + j16, j18, j20 + j20, j22 + j22, j24 + j24, j28, j30 + j30, j32 + j32, j33 + j33, j36, j37 + j37, j38 + j38, j39 + j39, (j25 * j25) + (j23 * 4 * j29), (j25 + j25) * j29, (j29 + j29) * j29}, jArr);
    }

    public static void h(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i9 = 0; i9 < 10; i9++) {
            jArr[i9] = jArr2[i9] - jArr3[i9];
        }
    }

    public static void i(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i9 = 0; i9 < 10; i9++) {
            jArr[i9] = jArr2[i9] + jArr3[i9];
        }
    }

    public static byte[] j(long[] jArr) {
        int i9;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        int i10 = 0;
        while (true) {
            if (i10 >= 2) {
                break;
            }
            int i11 = 0;
            while (i11 < 9) {
                long j9 = jArrCopyOf[i11];
                int i12 = f21537d[i11 & 1];
                int i13 = -((int) (((j9 >> 31) & j9) >> i12));
                jArrCopyOf[i11] = j9 + ((long) (i13 << i12));
                i11++;
                jArrCopyOf[i11] = jArrCopyOf[i11] - ((long) i13);
            }
            long j10 = jArrCopyOf[9];
            int i14 = -((int) (((j10 >> 31) & j10) >> 25));
            jArrCopyOf[9] = j10 + ((long) (i14 << 25));
            jArrCopyOf[0] = jArrCopyOf[0] - ((long) (i14 * 19));
            i10++;
        }
        long j11 = jArrCopyOf[0];
        int i15 = -((int) (((j11 >> 31) & j11) >> 26));
        jArrCopyOf[0] = j11 + ((long) (i15 << 26));
        jArrCopyOf[1] = jArrCopyOf[1] - ((long) i15);
        for (int i16 = 0; i16 < 2; i16++) {
            int i17 = 0;
            while (i17 < 9) {
                long j12 = jArrCopyOf[i17];
                int i18 = i17 & 1;
                int i19 = f21537d[i18];
                jArrCopyOf[i17] = ((long) f21536c[i18]) & j12;
                i17++;
                jArrCopyOf[i17] = jArrCopyOf[i17] + ((long) ((int) (j12 >> i19)));
            }
        }
        long j13 = jArrCopyOf[9];
        jArrCopyOf[9] = 33554431 & j13;
        jArrCopyOf[0] = jArrCopyOf[0] + ((long) (((int) (j13 >> 25)) * 19));
        int i20 = ~((((int) r10) - 67108845) >> 31);
        for (int i21 = 1; i21 < 10; i21++) {
            int i22 = ~(((int) jArrCopyOf[i21]) ^ f21536c[i21 & 1]);
            int i23 = i22 & (i22 << 16);
            int i24 = i23 & (i23 << 8);
            int i25 = i24 & (i24 << 4);
            int i26 = i25 & (i25 << 2);
            i20 &= (i26 & (i26 + i26)) >> 31;
        }
        jArrCopyOf[0] = jArrCopyOf[0] - ((long) (67108845 & i20));
        long j14 = 33554431 & i20;
        jArrCopyOf[1] = jArrCopyOf[1] - j14;
        for (i9 = 2; i9 < 10; i9 += 2) {
            jArrCopyOf[i9] = jArrCopyOf[i9] - ((long) (67108863 & i20));
            int i27 = i9 + 1;
            jArrCopyOf[i27] = jArrCopyOf[i27] - j14;
        }
        for (int i28 = 0; i28 < 10; i28++) {
            jArrCopyOf[i28] = jArrCopyOf[i28] << f21535b[i28];
        }
        byte[] bArr = new byte[32];
        for (int i29 = 0; i29 < 10; i29++) {
            int i30 = f21534a[i29];
            byte b9 = bArr[i30];
            long j15 = jArrCopyOf[i29];
            bArr[i30] = (byte) (((long) b9) | (j15 & 255));
            bArr[i30 + 1] = (byte) (((long) bArr[r4]) | ((j15 >> 8) & 255));
            bArr[i30 + 2] = (byte) (((long) bArr[r4]) | ((j15 >> 16) & 255));
            bArr[i30 + 3] = (byte) (((j15 >> 24) & 255) | ((long) bArr[r3]));
        }
        return bArr;
    }

    public static long[] k(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i9 = 0; i9 < 10; i9++) {
            int i10 = f21534a[i9];
            jArr[i9] = ((((((long) (bArr[i10] & 255)) | (((long) (bArr[i10 + 1] & 255)) << 8)) | (((long) (bArr[i10 + 2] & 255)) << 16)) | (((long) (bArr[i10 + 3] & 255)) << 24)) >> f21535b[i9]) & ((long) f21536c[i9 & 1]);
        }
        return jArr;
    }
}
