package com.google.android.recaptcha.internal;

import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes3.dex */
final class zzju {
    private static final zzjr zza;

    static {
        if (zzjp.zzx() && zzjp.zzy()) {
            int i9 = zzel.zza;
        }
        zza = new zzjs();
    }

    public static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i9, int i10) {
        int i11 = i10 - i9;
        byte b9 = bArr[i9 - 1];
        if (i11 != 0) {
            if (i11 == 1) {
                byte b10 = bArr[i9];
                if (b9 <= -12 && b10 <= -65) {
                    return b9 ^ (b10 << 8);
                }
            } else {
                if (i11 != 2) {
                    throw new AssertionError();
                }
                byte b11 = bArr[i9];
                byte b12 = bArr[i9 + 1];
                if (b9 <= -12 && b11 <= -65 && b12 <= -65) {
                    return ((b11 << 8) ^ b9) ^ (b12 << 16);
                }
            }
        } else if (b9 <= -12) {
            return b9;
        }
        return -1;
    }

    public static int zzb(CharSequence charSequence, byte[] bArr, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        char cCharAt;
        int length = charSequence.length();
        int i14 = 0;
        while (true) {
            i11 = i9 + i10;
            if (i14 >= length || (i13 = i14 + i9) >= i11 || (cCharAt = charSequence.charAt(i14)) >= 128) {
                break;
            }
            bArr[i13] = (byte) cCharAt;
            i14++;
        }
        if (i14 == length) {
            return i9 + length;
        }
        int i15 = i9 + i14;
        while (i14 < length) {
            char cCharAt2 = charSequence.charAt(i14);
            if (cCharAt2 < 128 && i15 < i11) {
                bArr[i15] = (byte) cCharAt2;
                i15++;
            } else if (cCharAt2 < 2048 && i15 <= i11 - 2) {
                int i16 = i15 + 1;
                bArr[i15] = (byte) ((cCharAt2 >>> 6) | 960);
                i15 += 2;
                bArr[i16] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i15 > i11 - 3) {
                    if (i15 > i11 - 4) {
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i12 = i14 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i12)))) {
                            throw new zzjt(i14, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i15);
                    }
                    int i17 = i14 + 1;
                    if (i17 != charSequence.length()) {
                        char cCharAt3 = charSequence.charAt(i17);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i15] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i15 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i18 = i15 + 3;
                            bArr[i15 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i15 += 4;
                            bArr[i18] = (byte) ((codePoint & 63) | 128);
                            i14 = i17;
                        } else {
                            i14 = i17;
                        }
                    }
                    throw new zzjt(i14 - 1, length);
                }
                bArr[i15] = (byte) ((cCharAt2 >>> '\f') | 480);
                int i19 = i15 + 2;
                bArr[i15 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                i15 += 3;
                bArr[i19] = (byte) ((cCharAt2 & '?') | 128);
            }
            i14++;
        }
        return i15;
    }

    public static int zzc(CharSequence charSequence) {
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
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i10) < 65536) {
                                throw new zzjt(i10, length2);
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

    public static String zzd(byte[] bArr, int i9, int i10) throws zzgy {
        int length = bArr.length;
        if ((((length - i9) - i10) | i9 | i10) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i9), Integer.valueOf(i10)));
        }
        int i11 = i9 + i10;
        char[] cArr = new char[i10];
        int i12 = 0;
        while (i9 < i11) {
            byte b9 = bArr[i9];
            if (!zzjq.zzd(b9)) {
                break;
            }
            i9++;
            cArr[i12] = (char) b9;
            i12++;
        }
        int i13 = i12;
        while (i9 < i11) {
            int i14 = i9 + 1;
            byte b10 = bArr[i9];
            if (zzjq.zzd(b10)) {
                cArr[i13] = (char) b10;
                i13++;
                i9 = i14;
                while (i9 < i11) {
                    byte b11 = bArr[i9];
                    if (zzjq.zzd(b11)) {
                        i9++;
                        cArr[i13] = (char) b11;
                        i13++;
                    }
                }
            } else if (b10 < -32) {
                if (i14 >= i11) {
                    throw zzgy.zzd();
                }
                i9 += 2;
                zzjq.zzc(b10, bArr[i14], cArr, i13);
                i13++;
            } else if (b10 < -16) {
                if (i14 >= i11 - 1) {
                    throw zzgy.zzd();
                }
                int i15 = i9 + 2;
                i9 += 3;
                zzjq.zzb(b10, bArr[i14], bArr[i15], cArr, i13);
                i13++;
            } else {
                if (i14 >= i11 - 2) {
                    throw zzgy.zzd();
                }
                byte b12 = bArr[i14];
                int i16 = i9 + 3;
                byte b13 = bArr[i9 + 2];
                i9 += 4;
                zzjq.zza(b10, b12, b13, bArr[i16], cArr, i13);
                i13 += 2;
            }
        }
        return new String(cArr, 0, i13);
    }

    public static boolean zze(byte[] bArr) {
        return zza.zzb(bArr, 0, bArr.length);
    }

    public static boolean zzf(byte[] bArr, int i9, int i10) {
        return zza.zzb(bArr, i9, i10);
    }
}
