package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzmm {
    private static final int[] zza = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    private static final int[] zzb = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    private static final int[] zzc = {67108863, 33554431};
    private static final int[] zzd = {26, 25};

    public static void zza(long[] jArr) {
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
        long j16 = j15 + (j14 << 1);
        jArr[0] = j16;
        long j17 = j16 + j14;
        jArr[0] = j17;
        jArr[10] = 0;
        long j18 = j17 / 67108864;
        jArr[0] = j17 - (j18 << 26);
        jArr[1] = jArr[1] + j18;
    }

    public static void zza(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        zzb(jArr3, jArr2);
        zzb(jArr12, jArr3);
        zzb(jArr11, jArr12);
        zza(jArr4, jArr11, jArr2);
        zza(jArr5, jArr4, jArr3);
        zzb(jArr11, jArr5);
        zza(jArr6, jArr11, jArr4);
        zzb(jArr11, jArr6);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zza(jArr7, jArr11, jArr6);
        zzb(jArr11, jArr7);
        zzb(jArr12, jArr11);
        for (int i9 = 2; i9 < 10; i9 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr8, jArr12, jArr7);
        zzb(jArr11, jArr8);
        zzb(jArr12, jArr11);
        for (int i10 = 2; i10 < 20; i10 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr11, jArr12, jArr8);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        for (int i11 = 2; i11 < 10; i11 += 2) {
            zzb(jArr12, jArr11);
            zzb(jArr11, jArr12);
        }
        zza(jArr9, jArr11, jArr7);
        zzb(jArr11, jArr9);
        zzb(jArr12, jArr11);
        for (int i12 = 2; i12 < 50; i12 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr10, jArr12, jArr9);
        zzb(jArr12, jArr10);
        zzb(jArr11, jArr12);
        for (int i13 = 2; i13 < 100; i13 += 2) {
            zzb(jArr12, jArr11);
            zzb(jArr11, jArr12);
        }
        zza(jArr12, jArr11, jArr10);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        for (int i14 = 2; i14 < 50; i14 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr11, jArr12, jArr9);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        zza(jArr, jArr12, jArr5);
    }

    public static void zza(long[] jArr, long[] jArr2, long j9) {
        for (int i9 = 0; i9 < 10; i9++) {
            jArr[i9] = jArr2[i9] * j9;
        }
    }

    public static void zza(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        zzb(jArr4, jArr2, jArr3);
        zze(jArr4, jArr);
    }

    public static long[] zza(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i9 = 0; i9 < 10; i9++) {
            int i10 = zza[i9];
            jArr[i9] = ((((((long) (bArr[i10] & 255)) | (((long) (bArr[i10 + 1] & 255)) << 8)) | (((long) (bArr[i10 + 2] & 255)) << 16)) | (((long) (bArr[i10 + 3] & 255)) << 24)) >> zzb[i9]) & ((long) zzc[i9 & 1]);
        }
        return jArr;
    }

    public static void zzb(long[] jArr) {
        long j9 = jArr[8];
        long j10 = jArr[18];
        long j11 = j9 + (j10 << 4);
        jArr[8] = j11;
        long j12 = j11 + (j10 << 1);
        jArr[8] = j12;
        jArr[8] = j12 + j10;
        long j13 = jArr[7];
        long j14 = jArr[17];
        long j15 = j13 + (j14 << 4);
        jArr[7] = j15;
        long j16 = j15 + (j14 << 1);
        jArr[7] = j16;
        jArr[7] = j16 + j14;
        long j17 = jArr[6];
        long j18 = jArr[16];
        long j19 = j17 + (j18 << 4);
        jArr[6] = j19;
        long j20 = j19 + (j18 << 1);
        jArr[6] = j20;
        jArr[6] = j20 + j18;
        long j21 = jArr[5];
        long j22 = jArr[15];
        long j23 = j21 + (j22 << 4);
        jArr[5] = j23;
        long j24 = j23 + (j22 << 1);
        jArr[5] = j24;
        jArr[5] = j24 + j22;
        long j25 = jArr[4];
        long j26 = jArr[14];
        long j27 = j25 + (j26 << 4);
        jArr[4] = j27;
        long j28 = j27 + (j26 << 1);
        jArr[4] = j28;
        jArr[4] = j28 + j26;
        long j29 = jArr[3];
        long j30 = jArr[13];
        long j31 = j29 + (j30 << 4);
        jArr[3] = j31;
        long j32 = j31 + (j30 << 1);
        jArr[3] = j32;
        jArr[3] = j32 + j30;
        long j33 = jArr[2];
        long j34 = jArr[12];
        long j35 = j33 + (j34 << 4);
        jArr[2] = j35;
        long j36 = j35 + (j34 << 1);
        jArr[2] = j36;
        jArr[2] = j36 + j34;
        long j37 = jArr[1];
        long j38 = jArr[11];
        long j39 = j37 + (j38 << 4);
        jArr[1] = j39;
        long j40 = j39 + (j38 << 1);
        jArr[1] = j40;
        jArr[1] = j40 + j38;
        long j41 = jArr[0];
        long j42 = jArr[10];
        long j43 = j41 + (j42 << 4);
        jArr[0] = j43;
        long j44 = j43 + (j42 << 1);
        jArr[0] = j44;
        jArr[0] = j44 + j42;
    }

    public static void zzb(long[] jArr, long[] jArr2) {
        long j9 = jArr2[0];
        long j10 = jArr2[1];
        long j11 = jArr2[2];
        long j12 = jArr2[3];
        long j13 = jArr2[4];
        long j14 = jArr2[5];
        long j15 = jArr2[6];
        long j16 = jArr2[7];
        long j17 = jArr2[8];
        long j18 = jArr2[9];
        zze(new long[]{j9 * j9, j9 * 2 * j10, ((j10 * j10) + (j9 * j11)) * 2, ((j10 * j11) + (j9 * j12)) * 2, (j11 * j11) + (j10 * 4 * j12) + (j9 * 2 * j13), ((j11 * j12) + (j10 * j13) + (j9 * j14)) * 2, ((j12 * j12) + (j11 * j13) + (j9 * j15) + (j10 * 2 * j14)) * 2, ((j12 * j13) + (j11 * j14) + (j10 * j15) + (j9 * j16)) * 2, (j13 * j13) + (((j11 * j15) + (j9 * j17) + (((j10 * j16) + (j12 * j14)) * 2)) * 2), ((j13 * j14) + (j12 * j15) + (j11 * j16) + (j10 * j17) + (j9 * j18)) * 2, ((j14 * j14) + (j13 * j15) + (j11 * j17) + (((j12 * j16) + (j10 * j18)) * 2)) * 2, ((j14 * j15) + (j13 * j16) + (j12 * j17) + (j11 * j18)) * 2, (j15 * j15) + (((j13 * j17) + (((j14 * j16) + (j12 * j18)) * 2)) * 2), ((j15 * j16) + (j14 * j17) + (j13 * j18)) * 2, ((j16 * j16) + (j15 * j17) + (j14 * 2 * j18)) * 2, ((j16 * j17) + (j15 * j18)) * 2, (j17 * j17) + (j16 * 4 * j18), j17 * 2 * j18, 2 * j18 * j18}, jArr);
    }

    public static void zzb(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        long j9 = jArr2[0];
        long j10 = jArr3[1] * j9;
        long j11 = jArr2[1];
        long j12 = jArr3[0];
        jArr[1] = j10 + (j11 * j12);
        long j13 = jArr2[1];
        long j14 = jArr3[1];
        jArr[2] = (j13 * 2 * j14) + (jArr3[2] * j9) + (jArr2[2] * j12);
        long j15 = jArr3[2];
        long j16 = jArr2[2];
        jArr[3] = (j13 * j15) + (j16 * j14) + (jArr3[3] * j9) + (jArr2[3] * j12);
        long j17 = jArr3[3];
        long j18 = jArr2[3];
        jArr[4] = (j16 * j15) + (((j13 * j17) + (j18 * j14)) * 2) + (jArr3[4] * j9) + (jArr2[4] * j12);
        long j19 = jArr3[4];
        long j20 = jArr2[4];
        jArr[5] = (j16 * j17) + (j18 * j15) + (j13 * j19) + (j20 * j14) + (jArr3[5] * j9) + (jArr2[5] * j12);
        long j21 = jArr3[5];
        long j22 = jArr2[5];
        jArr[6] = (((j18 * j17) + (j13 * j21) + (j22 * j14)) * 2) + (j16 * j19) + (j20 * j15) + (jArr3[6] * j9) + (jArr2[6] * j12);
        long j23 = jArr3[6];
        long j24 = jArr2[6];
        jArr[7] = (j18 * j19) + (j20 * j17) + (j16 * j21) + (j22 * j15) + (j13 * j23) + (j24 * j14) + (jArr3[7] * j9) + (jArr2[7] * j12);
        long j25 = jArr3[7];
        long j26 = jArr2[7];
        jArr[8] = (j20 * j19) + (((j18 * j21) + (j22 * j17) + (j13 * j25) + (j26 * j14)) * 2) + (j16 * j23) + (j24 * j15) + (jArr3[8] * j9) + (jArr2[8] * j12);
        long j27 = jArr3[8];
        long j28 = jArr2[8];
        jArr[9] = (j20 * j21) + (j22 * j19) + (j18 * j23) + (j24 * j17) + (j16 * j25) + (j26 * j15) + (j13 * j27) + (j28 * j14) + (j9 * jArr3[9]) + (jArr2[9] * j12);
        long j29 = jArr3[9];
        long j30 = jArr2[9];
        jArr[10] = (((j22 * j21) + (j18 * j25) + (j26 * j17) + (j13 * j29) + (j14 * j30)) * 2) + (j20 * j23) + (j24 * j19) + (j16 * j27) + (j28 * j15);
        jArr[11] = (j22 * j23) + (j24 * j21) + (j20 * j25) + (j26 * j19) + (j18 * j27) + (j28 * j17) + (j16 * j29) + (j15 * j30);
        jArr[12] = (j24 * j23) + (((j22 * j25) + (j26 * j21) + (j18 * j29) + (j17 * j30)) * 2) + (j20 * j27) + (j28 * j19);
        jArr[13] = (j24 * j25) + (j26 * j23) + (j22 * j27) + (j28 * j21) + (j20 * j29) + (j19 * j30);
        jArr[14] = (((j26 * j25) + (j22 * j29) + (j21 * j30)) * 2) + (j24 * j27) + (j28 * j23);
        jArr[15] = (j26 * j27) + (j28 * j25) + (j24 * j29) + (j23 * j30);
        jArr[16] = (j28 * j27) + (((j26 * j29) + (j25 * j30)) * 2);
        jArr[17] = (j28 * j29) + (j27 * j30);
        jArr[18] = j30 * 2 * j29;
    }

    public static void zzc(long[] jArr, long[] jArr2) {
        zzc(jArr, jArr2, jArr);
    }

    public static void zzc(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i9 = 0; i9 < 10; i9++) {
            jArr[i9] = jArr2[i9] - jArr3[i9];
        }
    }

    public static byte[] zzc(long[] jArr) {
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
                int i12 = zzd[i11 & 1];
                int i13 = -((int) (((j9 >> 31) & j9) >> i12));
                jArrCopyOf[i11] = j9 + ((long) (i13 << i12));
                i11++;
                jArrCopyOf[i11] = jArrCopyOf[i11] - ((long) i13);
            }
            long j10 = jArrCopyOf[9];
            int i14 = -((int) (((j10 >> 31) & j10) >> 25));
            jArrCopyOf[9] = j10 + ((long) (i14 << 25));
            jArrCopyOf[0] = jArrCopyOf[0] - (((long) i14) * 19);
            i10++;
        }
        long j11 = jArrCopyOf[0];
        int i15 = -((int) (((j11 >> 31) & j11) >> 26));
        jArrCopyOf[0] = j11 + ((long) (i15 << 26));
        jArrCopyOf[1] = jArrCopyOf[1] - ((long) i15);
        int i16 = 0;
        for (i9 = 2; i16 < i9; i9 = 2) {
            int i17 = 0;
            while (i17 < 9) {
                long j12 = jArrCopyOf[i17];
                int i18 = i17 & 1;
                int i19 = (int) (j12 >> zzd[i18]);
                jArrCopyOf[i17] = j12 & ((long) zzc[i18]);
                i17++;
                jArrCopyOf[i17] = jArrCopyOf[i17] + ((long) i19);
            }
            i16++;
        }
        long j13 = jArrCopyOf[9];
        jArrCopyOf[9] = j13 & 33554431;
        long j14 = jArrCopyOf[0] + (((long) ((int) (j13 >> 25))) * 19);
        jArrCopyOf[0] = j14;
        int i20 = ~((((int) j14) - 67108845) >> 31);
        for (int i21 = 1; i21 < 10; i21++) {
            int i22 = ~(((int) jArrCopyOf[i21]) ^ zzc[i21 & 1]);
            int i23 = i22 & (i22 << 16);
            int i24 = i23 & (i23 << 8);
            int i25 = i24 & (i24 << 4);
            int i26 = i25 & (i25 << 2);
            i20 &= (i26 & (i26 << 1)) >> 31;
        }
        jArrCopyOf[0] = jArrCopyOf[0] - ((long) (67108845 & i20));
        long j15 = 33554431 & i20;
        jArrCopyOf[1] = jArrCopyOf[1] - j15;
        for (int i27 = 2; i27 < 10; i27 += 2) {
            jArrCopyOf[i27] = jArrCopyOf[i27] - ((long) (67108863 & i20));
            int i28 = i27 + 1;
            jArrCopyOf[i28] = jArrCopyOf[i28] - j15;
        }
        for (int i29 = 0; i29 < 10; i29++) {
            jArrCopyOf[i29] = jArrCopyOf[i29] << zzb[i29];
        }
        byte[] bArr = new byte[32];
        for (int i30 = 0; i30 < 10; i30++) {
            int i31 = zza[i30];
            long j16 = bArr[i31];
            long j17 = jArrCopyOf[i30];
            bArr[i31] = (byte) (j16 | (j17 & 255));
            bArr[i31 + 1] = (byte) (((long) bArr[r5]) | ((j17 >> 8) & 255));
            bArr[i31 + 2] = (byte) (((long) bArr[r5]) | ((j17 >> 16) & 255));
            bArr[i31 + 3] = (byte) (((long) bArr[r4]) | ((j17 >> 24) & 255));
        }
        return bArr;
    }

    public static void zzd(long[] jArr, long[] jArr2) {
        zzd(jArr, jArr, jArr2);
    }

    public static void zzd(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i9 = 0; i9 < 10; i9++) {
            jArr[i9] = jArr2[i9] + jArr3[i9];
        }
    }

    private static void zze(long[] jArr, long[] jArr2) {
        if (jArr.length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, jArr.length);
            jArr = jArr3;
        }
        zzb(jArr);
        zza(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }
}
