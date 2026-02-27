package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzib {
    private static long zza(byte[] bArr, int i9) {
        return ((long) (((bArr[i9 + 3] & 255) << 24) | (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16))) & 4294967295L;
    }

    private static long zza(byte[] bArr, int i9, int i10) {
        return (zza(bArr, i9) >> i10) & 67108863;
    }

    private static void zza(byte[] bArr, long j9, int i9) {
        int i10 = 0;
        while (i10 < 4) {
            bArr[i9 + i10] = (byte) (255 & j9);
            i10++;
            j9 >>= 8;
        }
    }

    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        long jZza = zza(bArr, 0, 0) & 67108863;
        long jZza2 = zza(bArr, 3, 2) & 67108611;
        long jZza3 = zza(bArr, 6, 4) & 67092735;
        long jZza4 = zza(bArr, 9, 6) & 66076671;
        long jZza5 = zza(bArr, 12, 8) & 1048575;
        long j9 = jZza2 * 5;
        long j10 = jZza3 * 5;
        long j11 = jZza4 * 5;
        long j12 = jZza5 * 5;
        int i9 = 17;
        byte[] bArr3 = new byte[17];
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        int i10 = 0;
        while (i10 < bArr2.length) {
            int iMin = Math.min(16, bArr2.length - i10);
            System.arraycopy(bArr2, i10, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, i9, (byte) 0);
            }
            long jZza6 = j17 + zza(bArr3, 0, 0);
            long jZza7 = j13 + zza(bArr3, 3, 2);
            long jZza8 = j14 + zza(bArr3, 6, 4);
            long jZza9 = j15 + zza(bArr3, 9, 6);
            long jZza10 = j16 + (zza(bArr3, 12, 8) | ((long) (bArr3[16] << 24)));
            long j18 = (jZza6 * jZza) + (jZza7 * j12) + (jZza8 * j11) + (jZza9 * j10) + (jZza10 * j9);
            long j19 = (jZza6 * jZza2) + (jZza7 * jZza) + (jZza8 * j12) + (jZza9 * j11) + (jZza10 * j10);
            long j20 = (jZza6 * jZza3) + (jZza7 * jZza2) + (jZza8 * jZza) + (jZza9 * j12) + (jZza10 * j11);
            long j21 = (jZza6 * jZza4) + (jZza7 * jZza3) + (jZza8 * jZza2) + (jZza9 * jZza) + (jZza10 * j12);
            long j22 = j19 + (j18 >> 26);
            long j23 = j20 + (j22 >> 26);
            long j24 = j21 + (j23 >> 26);
            long j25 = (jZza6 * jZza5) + (jZza7 * jZza4) + (jZza8 * jZza3) + (jZza9 * jZza2) + (jZza10 * jZza) + (j24 >> 26);
            long j26 = (j18 & 67108863) + ((j25 >> 26) * 5);
            j13 = (j22 & 67108863) + (j26 >> 26);
            i10 += 16;
            j14 = j23 & 67108863;
            j15 = j24 & 67108863;
            j16 = j25 & 67108863;
            i9 = 17;
            j17 = j26 & 67108863;
        }
        long j27 = j14 + (j13 >> 26);
        long j28 = j27 & 67108863;
        long j29 = j15 + (j27 >> 26);
        long j30 = j29 & 67108863;
        long j31 = j16 + (j29 >> 26);
        long j32 = j31 & 67108863;
        long j33 = j17 + ((j31 >> 26) * 5);
        long j34 = j33 & 67108863;
        long j35 = (j13 & 67108863) + (j33 >> 26);
        long j36 = j34 + 5;
        long j37 = j36 & 67108863;
        long j38 = (j36 >> 26) + j35;
        long j39 = j28 + (j38 >> 26);
        long j40 = j30 + (j39 >> 26);
        long j41 = (j32 + (j40 >> 26)) - 67108864;
        long j42 = j41 >> 63;
        long j43 = ~j42;
        long j44 = (j35 & j42) | (j38 & 67108863 & j43);
        long j45 = (j28 & j42) | (j39 & 67108863 & j43);
        long j46 = (j30 & j42) | (j40 & 67108863 & j43);
        long j47 = ((j44 << 26) | (j34 & j42) | (j37 & j43)) & 4294967295L;
        long j48 = ((j44 >> 6) | (j45 << 20)) & 4294967295L;
        long j49 = ((j45 >> 12) | (j46 << 14)) & 4294967295L;
        long j50 = ((((j41 & j43) | (j32 & j42)) << 8) | (j46 >> 18)) & 4294967295L;
        long jZza11 = j47 + zza(bArr, 16);
        long j51 = jZza11 & 4294967295L;
        long jZza12 = j48 + zza(bArr, 20) + (jZza11 >> 32);
        long jZza13 = j49 + zza(bArr, 24) + (jZza12 >> 32);
        long jZza14 = (j50 + zza(bArr, 28) + (jZza13 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        zza(bArr4, j51, 0);
        zza(bArr4, jZza12 & 4294967295L, 4);
        zza(bArr4, jZza13 & 4294967295L, 8);
        zza(bArr4, jZza14, 12);
        return bArr4;
    }
}
