package com.google.android.gms.internal.p001firebaseauthapi;

import okio.Utf8;

/* JADX INFO: loaded from: classes3.dex */
final class zzamn {
    public static /* synthetic */ void zza(byte b9, byte b10, byte b11, byte b12, char[] cArr, int i9) throws zzaji {
        if (zza(b10) || (((b9 << 28) + (b10 + 112)) >> 30) != 0 || zza(b11) || zza(b12)) {
            throw zzaji.zzd();
        }
        int i10 = ((b9 & 7) << 18) | ((b10 & Utf8.REPLACEMENT_BYTE) << 12) | ((b11 & Utf8.REPLACEMENT_BYTE) << 6) | (b12 & Utf8.REPLACEMENT_BYTE);
        cArr[i9] = (char) ((i10 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
        cArr[i9 + 1] = (char) ((i10 & 1023) + Utf8.LOG_SURROGATE_HEADER);
    }

    public static /* synthetic */ void zza(byte b9, byte b10, byte b11, char[] cArr, int i9) throws zzaji {
        if (zza(b10) || ((b9 == -32 && b10 < -96) || ((b9 == -19 && b10 >= -96) || zza(b11)))) {
            throw zzaji.zzd();
        }
        cArr[i9] = (char) (((b9 & 15) << 12) | ((b10 & Utf8.REPLACEMENT_BYTE) << 6) | (b11 & Utf8.REPLACEMENT_BYTE));
    }

    public static /* synthetic */ void zza(byte b9, byte b10, char[] cArr, int i9) throws zzaji {
        if (b9 < -62 || zza(b10)) {
            throw zzaji.zzd();
        }
        cArr[i9] = (char) (((b9 & 31) << 6) | (b10 & Utf8.REPLACEMENT_BYTE));
    }

    public static /* synthetic */ void zza(byte b9, char[] cArr, int i9) {
        cArr[i9] = (char) b9;
    }

    private static boolean zza(byte b9) {
        return b9 > -65;
    }
}
