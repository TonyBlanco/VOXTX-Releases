package com.google.android.gms.internal.p001firebaseauthapi;

/* JADX INFO: loaded from: classes3.dex */
final class zzamp extends zzamm {
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzamm
    public final int zza(int i9, byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] >= 0) {
            i10++;
        }
        if (i10 >= i11) {
            return 0;
        }
        while (i10 < i11) {
            int i12 = i10 + 1;
            byte b9 = bArr[i10];
            if (b9 < 0) {
                if (b9 < -32) {
                    if (i12 >= i11) {
                        return b9;
                    }
                    if (b9 >= -62) {
                        i10 += 2;
                        if (bArr[i12] > -65) {
                        }
                    }
                    return -1;
                }
                if (b9 >= -16) {
                    if (i12 >= i11 - 2) {
                        return zzaml.zza(bArr, i12, i11);
                    }
                    int i13 = i10 + 2;
                    byte b10 = bArr[i12];
                    if (b10 <= -65 && (((b9 << 28) + (b10 + 112)) >> 30) == 0) {
                        int i14 = i10 + 3;
                        if (bArr[i13] <= -65) {
                            i10 += 4;
                            if (bArr[i14] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i12 >= i11 - 1) {
                    return zzaml.zza(bArr, i12, i11);
                }
                int i15 = i10 + 2;
                byte b11 = bArr[i12];
                if (b11 <= -65 && ((b9 != -32 || b11 >= -96) && (b9 != -19 || b11 < -96))) {
                    i10 += 3;
                    if (bArr[i15] > -65) {
                    }
                }
                return -1;
            }
            i10 = i12;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzamm
    public final int zza(CharSequence charSequence, byte[] bArr, int i9, int i10) {
        int i11;
        int i12;
        char cCharAt;
        int length = charSequence.length();
        int i13 = i10 + i9;
        int i14 = 0;
        while (i14 < length && (i12 = i14 + i9) < i13 && (cCharAt = charSequence.charAt(i14)) < 128) {
            bArr[i12] = (byte) cCharAt;
            i14++;
        }
        if (i14 == length) {
            return i9 + length;
        }
        int i15 = i9 + i14;
        while (i14 < length) {
            char cCharAt2 = charSequence.charAt(i14);
            if (cCharAt2 < 128 && i15 < i13) {
                bArr[i15] = (byte) cCharAt2;
                i15++;
            } else if (cCharAt2 < 2048 && i15 <= i13 - 2) {
                int i16 = i15 + 1;
                bArr[i15] = (byte) ((cCharAt2 >>> 6) | 960);
                i15 += 2;
                bArr[i16] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i15 > i13 - 3) {
                    if (i15 > i13 - 4) {
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i11 = i14 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i11)))) {
                            throw new zzamo(i14, length);
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
                    throw new zzamo(i14 - 1, length);
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

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzamm
    public final String zza(byte[] bArr, int i9, int i10) throws zzaji {
        if ((i9 | i10 | ((bArr.length - i9) - i10)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i9), Integer.valueOf(i10)));
        }
        int i11 = i9 + i10;
        char[] cArr = new char[i10];
        int i12 = 0;
        while (i9 < i11) {
            byte b9 = bArr[i9];
            if (b9 < 0) {
                break;
            }
            i9++;
            zzamn.zza(b9, cArr, i12);
            i12++;
        }
        int i13 = i12;
        while (i9 < i11) {
            int i14 = i9 + 1;
            byte b10 = bArr[i9];
            if (b10 >= 0) {
                int i15 = i13 + 1;
                zzamn.zza(b10, cArr, i13);
                while (i14 < i11) {
                    byte b11 = bArr[i14];
                    if (b11 < 0) {
                        break;
                    }
                    i14++;
                    zzamn.zza(b11, cArr, i15);
                    i15++;
                }
                i13 = i15;
                i9 = i14;
            } else if (b10 < -32) {
                if (i14 >= i11) {
                    throw zzaji.zzd();
                }
                i9 += 2;
                zzamn.zza(b10, bArr[i14], cArr, i13);
                i13++;
            } else if (b10 < -16) {
                if (i14 >= i11 - 1) {
                    throw zzaji.zzd();
                }
                int i16 = i9 + 2;
                i9 += 3;
                zzamn.zza(b10, bArr[i14], bArr[i16], cArr, i13);
                i13++;
            } else {
                if (i14 >= i11 - 2) {
                    throw zzaji.zzd();
                }
                byte b12 = bArr[i14];
                int i17 = i9 + 3;
                byte b13 = bArr[i9 + 2];
                i9 += 4;
                zzamn.zza(b10, b12, b13, bArr[i17], cArr, i13);
                i13 += 2;
            }
        }
        return new String(cArr, 0, i13);
    }
}
