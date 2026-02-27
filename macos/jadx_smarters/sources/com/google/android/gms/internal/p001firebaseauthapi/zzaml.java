package com.google.android.gms.internal.p001firebaseauthapi;

import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes3.dex */
final class zzaml {
    private static final zzamm zza;

    static {
        if (zzamk.zzc()) {
            zzamk.zzd();
        }
        zza = new zzamp();
    }

    public static int zza(CharSequence charSequence) {
        int length = charSequence.length();
        int i9 = 0;
        int i10 = 0;
        while (i10 < length && charSequence.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (true) {
            if (i10 >= length) {
                break;
            }
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt < 2048) {
                i11 += (127 - cCharAt) >>> 31;
                i10++;
            } else {
                int length2 = charSequence.length();
                while (i10 < length2) {
                    char cCharAt2 = charSequence.charAt(i10);
                    if (cCharAt2 < 2048) {
                        i9 += (127 - cCharAt2) >>> 31;
                    } else {
                        i9 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i10) < 65536) {
                                throw new zzamo(i10, length2);
                            }
                            i10++;
                        }
                    }
                    i10++;
                }
                i11 += i9;
            }
        }
        if (i11 >= length) {
            return i11;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i11) + IjkMediaMeta.AV_CH_WIDE_RIGHT));
    }

    public static int zza(CharSequence charSequence, byte[] bArr, int i9, int i10) {
        return zza.zza(charSequence, bArr, i9, i10);
    }

    public static /* synthetic */ int zza(byte[] bArr, int i9, int i10) {
        byte b9 = bArr[i9 - 1];
        int i11 = i10 - i9;
        if (i11 == 0) {
            if (b9 > -12) {
                return -1;
            }
            return b9;
        }
        if (i11 == 1) {
            byte b10 = bArr[i9];
            if (b9 > -12 || b10 > -65) {
                return -1;
            }
            return (b10 << 8) ^ b9;
        }
        if (i11 != 2) {
            throw new AssertionError();
        }
        byte b11 = bArr[i9];
        byte b12 = bArr[i9 + 1];
        if (b9 > -12 || b11 > -65 || b12 > -65) {
            return -1;
        }
        return (b12 << 16) ^ ((b11 << 8) ^ b9);
    }

    public static boolean zza(byte[] bArr) {
        return zza.zzb(bArr, 0, bArr.length);
    }

    public static String zzb(byte[] bArr, int i9, int i10) throws zzaji {
        return zza.zza(bArr, i9, i10);
    }

    public static boolean zzc(byte[] bArr, int i9, int i10) {
        return zza.zzb(bArr, i9, i10);
    }
}
