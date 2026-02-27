package com.amazonaws.util;

import okio.Utf8;

/* JADX INFO: loaded from: classes.dex */
class Base64Codec implements Codec {
    private static final int BITS_3 = 3;
    private static final int BITS_4 = 4;
    private static final int BITS_6 = 6;
    private static final int MASK_2BITS = 3;
    private static final int MASK_4BITS = 15;
    private static final int MASK_6BITS = 63;
    private static final int OFFSET_0_VALUE = 52;
    private static final int OFFSET_OF_0 = -4;
    private static final int OFFSET_OF_PLUS = -19;
    private static final int OFFSET_OF_SLASH = -16;
    private static final int OFFSET_OF_a = 71;
    private static final int OFFSET_PLUS_VALUE = 62;
    private static final int OFFSET_SLASH_VALUE = 63;
    private static final int OFFSET_a_VALUE = 26;
    private static final byte PAD = 61;
    private final byte[] alpahbets;

    public static class LazyHolder {
        private static final byte[] DECODED = decodeTable();

        private LazyHolder() {
        }

        private static byte[] decodeTable() {
            byte[] bArr = new byte[123];
            for (int i9 = 0; i9 <= 122; i9++) {
                if (i9 >= 65 && i9 <= 90) {
                    bArr[i9] = (byte) (i9 - 65);
                } else if (i9 >= 48 && i9 <= 57) {
                    bArr[i9] = (byte) (i9 + 4);
                } else if (i9 == 43) {
                    bArr[i9] = (byte) (i9 + 19);
                } else if (i9 == 47) {
                    bArr[i9] = (byte) (i9 + 16);
                } else if (i9 < 97 || i9 > 122) {
                    bArr[i9] = -1;
                } else {
                    bArr[i9] = (byte) (i9 - 71);
                }
            }
            return bArr;
        }
    }

    public Base64Codec() {
        this.alpahbets = CodecUtils.toBytesDirect("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
    }

    public Base64Codec(byte[] bArr) {
        this.alpahbets = bArr;
    }

    @Override // com.amazonaws.util.Codec
    public byte[] decode(byte[] bArr, int i9) {
        int i10;
        if (i9 % 4 != 0) {
            throw new IllegalArgumentException("Input is expected to be encoded in multiple of 4 bytes but found: " + i9);
        }
        int i11 = i9 - 1;
        int i12 = 0;
        while (true) {
            i10 = 2;
            if (i12 >= 2 || i11 <= -1 || bArr[i11] != 61) {
                break;
            }
            i11--;
            i12++;
        }
        if (i12 == 0) {
            i10 = 3;
        } else if (i12 != 1) {
            if (i12 != 2) {
                throw new Error("Impossible");
            }
            i10 = 1;
        }
        int i13 = ((i9 / 4) * 3) - (3 - i10);
        byte[] bArr2 = new byte[i13];
        int i14 = 0;
        int i15 = 0;
        while (i15 < i13 - (i10 % 3)) {
            decode4bytes(bArr, i14, bArr2, i15);
            i14 += 4;
            i15 += 3;
        }
        if (i10 < 3) {
            decode1to3bytes(i10, bArr, i14, bArr2, i15);
        }
        return bArr2;
    }

    public void decode1to3bytes(int i9, byte[] bArr, int i10, byte[] bArr2, int i11) {
        int i12 = i11 + 1;
        int iPos = pos(bArr[i10]) << 2;
        int i13 = i10 + 2;
        int iPos2 = pos(bArr[i10 + 1]);
        bArr2[i11] = (byte) (iPos | ((iPos2 >>> 4) & 3));
        if (i9 == 1) {
            CodecUtils.sanityCheckLastPos(iPos2, 15);
            return;
        }
        int i14 = i11 + 2;
        int i15 = i10 + 3;
        int iPos3 = pos(bArr[i13]);
        bArr2[i12] = (byte) (((iPos2 & 15) << 4) | (15 & (iPos3 >>> 2)));
        if (i9 == 2) {
            CodecUtils.sanityCheckLastPos(iPos3, 3);
        } else {
            bArr2[i14] = (byte) (((iPos3 & 3) << 6) | pos(bArr[i15]));
        }
    }

    public void decode4bytes(byte[] bArr, int i9, byte[] bArr2, int i10) {
        int iPos = pos(bArr[i9]) << 2;
        int iPos2 = pos(bArr[i9 + 1]);
        bArr2[i10] = (byte) (iPos | ((iPos2 >>> 4) & 3));
        int iPos3 = pos(bArr[i9 + 2]);
        bArr2[i10 + 1] = (byte) (((iPos2 & 15) << 4) | ((iPos3 >>> 2) & 15));
        bArr2[i10 + 2] = (byte) (pos(bArr[i9 + 3]) | ((iPos3 & 3) << 6));
    }

    @Override // com.amazonaws.util.Codec
    public byte[] encode(byte[] bArr) {
        int length = bArr.length / 3;
        int length2 = bArr.length % 3;
        int i9 = 0;
        if (length2 == 0) {
            byte[] bArr2 = new byte[length * 4];
            int i10 = 0;
            while (i9 < bArr.length) {
                encode3bytes(bArr, i9, bArr2, i10);
                i9 += 3;
                i10 += 4;
            }
            return bArr2;
        }
        byte[] bArr3 = new byte[(length + 1) * 4];
        int i11 = 0;
        while (i9 < bArr.length - length2) {
            encode3bytes(bArr, i9, bArr3, i11);
            i9 += 3;
            i11 += 4;
        }
        if (length2 == 1) {
            encode1byte(bArr, i9, bArr3, i11);
        } else if (length2 == 2) {
            encode2bytes(bArr, i9, bArr3, i11);
        }
        return bArr3;
    }

    public void encode1byte(byte[] bArr, int i9, byte[] bArr2, int i10) {
        byte[] bArr3 = this.alpahbets;
        byte b9 = bArr[i9];
        bArr2[i10] = bArr3[(b9 >>> 2) & 63];
        bArr2[i10 + 1] = bArr3[(b9 & 3) << 4];
        bArr2[i10 + 2] = PAD;
        bArr2[i10 + 3] = PAD;
    }

    public void encode2bytes(byte[] bArr, int i9, byte[] bArr2, int i10) {
        byte[] bArr3 = this.alpahbets;
        int i11 = i9 + 1;
        byte b9 = bArr[i9];
        bArr2[i10] = bArr3[(b9 >>> 2) & 63];
        byte b10 = bArr[i11];
        bArr2[i10 + 1] = bArr3[((b9 & 3) << 4) | ((b10 >>> 4) & 15)];
        bArr2[i10 + 2] = bArr3[(b10 & 15) << 2];
        bArr2[i10 + 3] = PAD;
    }

    public void encode3bytes(byte[] bArr, int i9, byte[] bArr2, int i10) {
        byte[] bArr3 = this.alpahbets;
        byte b9 = bArr[i9];
        bArr2[i10] = bArr3[(b9 >>> 2) & 63];
        byte b10 = bArr[i9 + 1];
        bArr2[i10 + 1] = bArr3[((b9 & 3) << 4) | ((b10 >>> 4) & 15)];
        byte b11 = bArr[i9 + 2];
        bArr2[i10 + 2] = bArr3[((b11 >>> 6) & 3) | ((b10 & 15) << 2)];
        bArr2[i10 + 3] = bArr3[b11 & Utf8.REPLACEMENT_BYTE];
    }

    public int pos(byte b9) {
        byte b10 = LazyHolder.DECODED[b9];
        if (b10 > -1) {
            return b10;
        }
        throw new IllegalArgumentException("Invalid base 64 character: '" + ((char) b9) + "'");
    }
}
