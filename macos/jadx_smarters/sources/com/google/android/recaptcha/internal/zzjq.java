package com.google.android.recaptcha.internal;

import okio.Utf8;

/* JADX INFO: loaded from: classes3.dex */
final class zzjq {
    public static /* bridge */ /* synthetic */ void zza(byte b9, byte b10, byte b11, byte b12, char[] cArr, int i9) throws zzgy {
        if (zze(b10) || (((b9 << 28) + (b10 + 112)) >> 30) != 0 || zze(b11) || zze(b12)) {
            throw zzgy.zzd();
        }
        int i10 = ((b9 & 7) << 18) | ((b10 & Utf8.REPLACEMENT_BYTE) << 12) | ((b11 & Utf8.REPLACEMENT_BYTE) << 6) | (b12 & Utf8.REPLACEMENT_BYTE);
        cArr[i9] = (char) ((i10 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
        cArr[i9 + 1] = (char) ((i10 & 1023) + Utf8.LOG_SURROGATE_HEADER);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0018 A[PHI: r2
      0x0018: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0012, B:11:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ void zzb(byte r2, byte r3, byte r4, char[] r5, int r6) throws com.google.android.recaptcha.internal.zzgy {
        /*
            boolean r0 = zze(r3)
            if (r0 != 0) goto L2e
            r0 = -96
            r1 = -32
            if (r2 != r1) goto L10
            if (r3 < r0) goto L2e
            r2 = -32
        L10:
            r1 = -19
            if (r2 != r1) goto L18
            if (r3 >= r0) goto L2e
            r2 = -19
        L18:
            boolean r0 = zze(r4)
            if (r0 != 0) goto L2e
            r2 = r2 & 15
            r3 = r3 & 63
            r4 = r4 & 63
            int r2 = r2 << 12
            int r3 = r3 << 6
            r2 = r2 | r3
            r2 = r2 | r4
            char r2 = (char) r2
            r5[r6] = r2
            return
        L2e:
            com.google.android.recaptcha.internal.zzgy r2 = com.google.android.recaptcha.internal.zzgy.zzd()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzjq.zzb(byte, byte, byte, char[], int):void");
    }

    public static /* bridge */ /* synthetic */ void zzc(byte b9, byte b10, char[] cArr, int i9) throws zzgy {
        if (b9 < -62 || zze(b10)) {
            throw zzgy.zzd();
        }
        cArr[i9] = (char) (((b9 & 31) << 6) | (b10 & Utf8.REPLACEMENT_BYTE));
    }

    public static /* bridge */ /* synthetic */ boolean zzd(byte b9) {
        return b9 >= 0;
    }

    private static boolean zze(byte b9) {
        return b9 > -65;
    }
}
