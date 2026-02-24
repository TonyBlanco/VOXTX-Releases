package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
final class bth extends btg {
    @Override // com.google.ads.interactivemedia.v3.internal.btg
    public final int a(CharSequence charSequence, byte[] bArr, int i9, int i10) {
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
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i15 > i13 - 3) {
                    if (i15 > i13 - 4) {
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i11 = i14 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i11)))) {
                            throw new bti(i14, length);
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
                    throw new bti(i14 - 1, length);
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

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0083, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    @Override // com.google.ads.interactivemedia.v3.internal.btg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(int r12, byte[] r13, int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.bth.b(int, byte[], int, int):int");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.btg
    public final String c(byte[] bArr, int i9, int i10) throws bqw {
        int length = bArr.length;
        if ((i9 | i10 | ((length - i9) - i10)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i9), Integer.valueOf(i10)));
        }
        int i11 = i9 + i10;
        char[] cArr = new char[i10];
        int i12 = 0;
        while (i9 < i11) {
            byte b9 = bArr[i9];
            if (!bto.e(b9)) {
                break;
            }
            i9++;
            bto.b(b9, cArr, i12);
            i12++;
        }
        int i13 = i12;
        while (i9 < i11) {
            int i14 = i9 + 1;
            byte b10 = bArr[i9];
            if (bto.e(b10)) {
                bto.b(b10, cArr, i13);
                i13++;
                i9 = i14;
                while (i9 < i11) {
                    byte b11 = bArr[i9];
                    if (!bto.e(b11)) {
                        break;
                    }
                    i9++;
                    bto.b(b11, cArr, i13);
                    i13++;
                }
            } else if (bto.g(b10)) {
                if (i14 >= i11) {
                    throw bqw.d();
                }
                i9 += 2;
                bto.d(b10, bArr[i14], cArr, i13);
                i13++;
            } else if (bto.f(b10)) {
                if (i14 >= i11 - 1) {
                    throw bqw.d();
                }
                int i15 = i9 + 2;
                i9 += 3;
                bto.c(b10, bArr[i14], bArr[i15], cArr, i13);
                i13++;
            } else {
                if (i14 >= i11 - 2) {
                    throw bqw.d();
                }
                int i16 = i9 + 2;
                int i17 = i9 + 3;
                i9 += 4;
                bto.a(b10, bArr[i14], bArr[i16], bArr[i17], cArr, i13);
                i13 += 2;
            }
        }
        return new String(cArr, 0, i13);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.btg
    public final String d(ByteBuffer byteBuffer, int i9, int i10) throws bqw {
        return btg.f(byteBuffer, i9, i10);
    }
}
