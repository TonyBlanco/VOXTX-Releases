package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzmh {
    private static final byte[][] zza = {new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{-32, -21, 122, 124, 59, 65, -72, -82, 22, 86, -29, -6, -15, -97, -60, 106, -38, 9, -115, -21, -100, 50, -79, -3, -122, 98, 5, 22, 95, 73, -72, 0}, new byte[]{95, -100, -107, -68, -93, 80, -116, 36, -79, -48, -79, 85, -100, -125, -17, 91, 4, 68, 92, -60, 88, 28, -114, -122, -40, 34, 78, -35, -48, -97, 17, 87}, new byte[]{-20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 127}, new byte[]{-19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 127}, new byte[]{-18, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 127}};

    public static void zza(long[] jArr, byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        int i9 = 32;
        if (bArr2.length != 32) {
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr2, bArr2.length);
        bArrCopyOf[31] = (byte) (bArrCopyOf[31] & 127);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            byte[][] bArr3 = zza;
            if (i11 >= bArr3.length) {
                long[] jArrZza = zzmm.zza(bArrCopyOf);
                long[] jArr2 = new long[19];
                long[] jArr3 = new long[19];
                jArr3[0] = 1;
                long[] jArr4 = new long[19];
                jArr4[0] = 1;
                long[] jArr5 = new long[19];
                long[] jArr6 = new long[19];
                long[] jArr7 = new long[19];
                jArr7[0] = 1;
                long[] jArr8 = new long[19];
                long[] jArr9 = new long[19];
                jArr9[0] = 1;
                int i12 = 10;
                System.arraycopy(jArrZza, 0, jArr2, 0, 10);
                int i13 = 0;
                while (i13 < i9) {
                    int i14 = bArr[31 - i13] & 255;
                    while (i10 < 8) {
                        int i15 = (i14 >> (7 - i10)) & 1;
                        zza(jArr4, jArr2, i15);
                        zza(jArr5, jArr3, i15);
                        long[] jArrCopyOf = Arrays.copyOf(jArr4, i12);
                        int i16 = i14;
                        long[] jArr10 = new long[19];
                        long[] jArr11 = new long[19];
                        int i17 = i13;
                        long[] jArr12 = new long[19];
                        int i18 = i10;
                        long[] jArr13 = new long[19];
                        long[] jArr14 = new long[19];
                        long[] jArr15 = jArr9;
                        long[] jArr16 = new long[19];
                        long[] jArr17 = new long[19];
                        zzmm.zzd(jArr4, jArr5);
                        zzmm.zzc(jArr5, jArrCopyOf);
                        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, 10);
                        zzmm.zzd(jArr2, jArr3);
                        zzmm.zzc(jArr3, jArrCopyOf2);
                        zzmm.zzb(jArr13, jArr2, jArr5);
                        zzmm.zzb(jArr14, jArr4, jArr3);
                        zzmm.zzb(jArr13);
                        zzmm.zza(jArr13);
                        zzmm.zzb(jArr14);
                        zzmm.zza(jArr14);
                        long[] jArr18 = jArr2;
                        System.arraycopy(jArr13, 0, jArrCopyOf2, 0, 10);
                        zzmm.zzd(jArr13, jArr14);
                        zzmm.zzc(jArr14, jArrCopyOf2);
                        zzmm.zzb(jArr17, jArr13);
                        zzmm.zzb(jArr16, jArr14);
                        zzmm.zzb(jArr14, jArr16, jArrZza);
                        zzmm.zzb(jArr14);
                        zzmm.zza(jArr14);
                        System.arraycopy(jArr17, 0, jArr6, 0, 10);
                        System.arraycopy(jArr14, 0, jArr7, 0, 10);
                        zzmm.zzb(jArr11, jArr4);
                        zzmm.zzb(jArr12, jArr5);
                        zzmm.zzb(jArr8, jArr11, jArr12);
                        zzmm.zzb(jArr8);
                        zzmm.zza(jArr8);
                        zzmm.zzc(jArr12, jArr11);
                        Arrays.fill(jArr10, 10, 18, 0L);
                        zzmm.zza(jArr10, jArr12, 121665L);
                        zzmm.zza(jArr10);
                        zzmm.zzd(jArr10, jArr11);
                        zzmm.zzb(jArr15, jArr12, jArr10);
                        zzmm.zzb(jArr15);
                        zzmm.zza(jArr15);
                        zza(jArr8, jArr6, i15);
                        zza(jArr15, jArr7, i15);
                        i10 = i18 + 1;
                        jArr2 = jArr6;
                        i14 = i16;
                        i13 = i17;
                        jArr6 = jArr18;
                        i12 = 10;
                        long[] jArr19 = jArr7;
                        jArr7 = jArr3;
                        jArr3 = jArr19;
                        long[] jArr20 = jArr8;
                        jArr8 = jArr4;
                        jArr4 = jArr20;
                        jArr9 = jArr5;
                        jArr5 = jArr15;
                    }
                    i13++;
                    i9 = 32;
                    i10 = 0;
                    i12 = 10;
                }
                long[] jArr21 = new long[10];
                zzmm.zza(jArr21, jArr5);
                zzmm.zza(jArr, jArr4, jArr21);
                long[] jArr22 = new long[10];
                long[] jArr23 = new long[10];
                long[] jArr24 = new long[11];
                long[] jArr25 = new long[11];
                long[] jArr26 = new long[11];
                zzmm.zza(jArr22, jArrZza, jArr);
                zzmm.zzd(jArr23, jArrZza, jArr);
                long[] jArr27 = new long[10];
                jArr27[0] = 486662;
                zzmm.zzd(jArr25, jArr23, jArr27);
                zzmm.zza(jArr25, jArr25, jArr3);
                zzmm.zzd(jArr25, jArr2);
                zzmm.zza(jArr25, jArr25, jArr22);
                zzmm.zza(jArr25, jArr25, jArr2);
                zzmm.zza(jArr24, jArr25, 4L);
                zzmm.zza(jArr24);
                zzmm.zza(jArr25, jArr22, jArr3);
                zzmm.zzc(jArr25, jArr25, jArr3);
                zzmm.zza(jArr26, jArr23, jArr2);
                zzmm.zzd(jArr25, jArr25, jArr26);
                zzmm.zzb(jArr25, jArr25);
                if (MessageDigest.isEqual(zzmm.zzc(jArr24), zzmm.zzc(jArr25))) {
                    return;
                }
                throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: " + zzxj.zza(bArr2));
            }
            if (MessageDigest.isEqual(bArr3[i11], bArrCopyOf)) {
                throw new InvalidKeyException("Banned public key: " + zzxj.zza(bArr3[i11]));
            }
            i11++;
        }
    }

    private static void zza(long[] jArr, long[] jArr2, int i9) {
        int i10 = -i9;
        for (int i11 = 0; i11 < 10; i11++) {
            int i12 = (((int) jArr[i11]) ^ ((int) jArr2[i11])) & i10;
            jArr[i11] = ((int) r1) ^ i12;
            jArr2[i11] = ((int) jArr2[i11]) ^ i12;
        }
    }
}
