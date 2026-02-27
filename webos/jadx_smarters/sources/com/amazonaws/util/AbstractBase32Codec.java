package com.amazonaws.util;

/* JADX INFO: loaded from: classes.dex */
abstract class AbstractBase32Codec implements Codec {
    private static final int BITS_3 = 3;
    private static final int BITS_4 = 4;
    private static final int BITS_5 = 5;
    private static final int BIT_MULTIPLIER = 8;
    private static final int MASK_2BITS = 3;
    private static final int MASK_3BITS = 7;
    private static final int MASK_4BITS = 15;
    private static final int MASK_5BITS = 31;
    private static final byte PAD = 61;
    private final byte[] alpahbets;

    public AbstractBase32Codec(byte[] bArr) {
        this.alpahbets = bArr;
    }

    private final void decode1to4bytes(int i9, byte[] bArr, int i10, byte[] bArr2, int i11) {
        int i12 = i11 + 1;
        int iPos = pos(bArr[i10]) << 3;
        int i13 = i10 + 2;
        int iPos2 = pos(bArr[i10 + 1]);
        bArr2[i11] = (byte) (iPos | ((iPos2 >>> 2) & 7));
        if (i9 == 1) {
            CodecUtils.sanityCheckLastPos(iPos2, 3);
            return;
        }
        int i14 = i11 + 2;
        int iPos3 = ((iPos2 & 3) << 6) | (pos(bArr[i13]) << 1);
        int i15 = i10 + 4;
        int iPos4 = pos(bArr[i10 + 3]);
        bArr2[i12] = (byte) (iPos3 | ((iPos4 >>> 4) & 1));
        if (i9 == 2) {
            CodecUtils.sanityCheckLastPos(iPos4, 15);
            return;
        }
        int i16 = i11 + 3;
        int i17 = i10 + 5;
        int iPos5 = pos(bArr[i15]);
        bArr2[i14] = (byte) ((15 & (iPos5 >>> 1)) | ((iPos4 & 15) << 4));
        if (i9 == 3) {
            CodecUtils.sanityCheckLastPos(iPos5, 1);
            return;
        }
        int iPos6 = ((iPos5 & 1) << 7) | (pos(bArr[i17]) << 2);
        int iPos7 = pos(bArr[i10 + 6]);
        bArr2[i16] = (byte) (iPos6 | ((iPos7 >>> 3) & 3));
        CodecUtils.sanityCheckLastPos(iPos7, 7);
    }

    private final void decode5bytes(byte[] bArr, int i9, byte[] bArr2, int i10) {
        int iPos = pos(bArr[i9]) << 3;
        int iPos2 = pos(bArr[i9 + 1]);
        bArr2[i10] = (byte) (iPos | ((iPos2 >>> 2) & 7));
        int iPos3 = ((iPos2 & 3) << 6) | (pos(bArr[i9 + 2]) << 1);
        int iPos4 = pos(bArr[i9 + 3]);
        bArr2[i10 + 1] = (byte) (iPos3 | ((iPos4 >>> 4) & 1));
        int iPos5 = pos(bArr[i9 + 4]);
        bArr2[i10 + 2] = (byte) (((iPos4 & 15) << 4) | ((iPos5 >>> 1) & 15));
        int iPos6 = ((iPos5 & 1) << 7) | (pos(bArr[i9 + 5]) << 2);
        int iPos7 = pos(bArr[i9 + 6]);
        bArr2[i10 + 3] = (byte) (iPos6 | ((iPos7 >>> 3) & 3));
        bArr2[i10 + 4] = (byte) (pos(bArr[i9 + 7]) | ((iPos7 & 7) << 5));
    }

    private final void encode1byte(byte[] bArr, int i9, byte[] bArr2, int i10) {
        int i11 = i10 + 1;
        byte[] bArr3 = this.alpahbets;
        byte b9 = bArr[i9];
        bArr2[i10] = bArr3[(b9 >>> 3) & MASK_5BITS];
        int i12 = i10 + 2;
        bArr2[i11] = bArr3[(b9 & 7) << 2];
        int i13 = 0;
        while (i13 < 6) {
            bArr2[i12] = PAD;
            i13++;
            i12++;
        }
    }

    private final void encode2bytes(byte[] bArr, int i9, byte[] bArr2, int i10) {
        byte[] bArr3 = this.alpahbets;
        int i11 = i9 + 1;
        byte b9 = bArr[i9];
        bArr2[i10] = bArr3[(b9 >>> 3) & MASK_5BITS];
        byte b10 = bArr[i11];
        bArr2[i10 + 1] = bArr3[((b9 & 7) << 2) | ((b10 >>> 6) & 3)];
        int i12 = i10 + 3;
        bArr2[i10 + 2] = bArr3[(b10 >>> 1) & MASK_5BITS];
        int i13 = i10 + 4;
        bArr2[i12] = bArr3[(b10 & 1) << 4];
        int i14 = 0;
        while (i14 < 4) {
            bArr2[i13] = PAD;
            i14++;
            i13++;
        }
    }

    private final void encode3bytes(byte[] bArr, int i9, byte[] bArr2, int i10) {
        byte[] bArr3 = this.alpahbets;
        byte b9 = bArr[i9];
        bArr2[i10] = bArr3[(b9 >>> 3) & MASK_5BITS];
        byte b10 = bArr[i9 + 1];
        bArr2[i10 + 1] = bArr3[((b9 & 7) << 2) | ((b10 >>> 6) & 3)];
        bArr2[i10 + 2] = bArr3[(b10 >>> 1) & MASK_5BITS];
        int i11 = i10 + 4;
        byte b11 = bArr[i9 + 2];
        bArr2[i10 + 3] = bArr3[((b11 >>> 4) & 15) | ((b10 & 1) << 4)];
        int i12 = i10 + 5;
        bArr2[i11] = bArr3[(b11 & 15) << 1];
        int i13 = 0;
        while (i13 < 3) {
            bArr2[i12] = PAD;
            i13++;
            i12++;
        }
    }

    private final void encode4bytes(byte[] bArr, int i9, byte[] bArr2, int i10) {
        byte[] bArr3 = this.alpahbets;
        byte b9 = bArr[i9];
        bArr2[i10] = bArr3[(b9 >>> 3) & MASK_5BITS];
        byte b10 = bArr[i9 + 1];
        bArr2[i10 + 1] = bArr3[((b9 & 7) << 2) | ((b10 >>> 6) & 3)];
        bArr2[i10 + 2] = bArr3[(b10 >>> 1) & MASK_5BITS];
        byte b11 = bArr[i9 + 2];
        bArr2[i10 + 3] = bArr3[((b10 & 1) << 4) | ((b11 >>> 4) & 15)];
        byte b12 = bArr[i9 + 3];
        bArr2[i10 + 4] = bArr3[((b12 >>> 7) & 1) | ((b11 & 15) << 1)];
        bArr2[i10 + 5] = bArr3[(b12 >>> 2) & MASK_5BITS];
        bArr2[i10 + 6] = bArr3[(b12 & 3) << 3];
        bArr2[i10 + 7] = PAD;
    }

    private final void encode5bytes(byte[] bArr, int i9, byte[] bArr2, int i10) {
        byte[] bArr3 = this.alpahbets;
        byte b9 = bArr[i9];
        bArr2[i10] = bArr3[(b9 >>> 3) & MASK_5BITS];
        byte b10 = bArr[i9 + 1];
        bArr2[i10 + 1] = bArr3[((b9 & 7) << 2) | ((b10 >>> 6) & 3)];
        bArr2[i10 + 2] = bArr3[(b10 >>> 1) & MASK_5BITS];
        byte b11 = bArr[i9 + 2];
        bArr2[i10 + 3] = bArr3[((b10 & 1) << 4) | ((b11 >>> 4) & 15)];
        byte b12 = bArr[i9 + 3];
        bArr2[i10 + 4] = bArr3[((b11 & 15) << 1) | ((b12 >>> 7) & 1)];
        bArr2[i10 + 5] = bArr3[(b12 >>> 2) & MASK_5BITS];
        byte b13 = bArr[i9 + 4];
        bArr2[i10 + 6] = bArr3[((b13 >>> 5) & 7) | ((b12 & 3) << 3)];
        bArr2[i10 + 7] = bArr3[b13 & 31];
    }

    @Override // com.amazonaws.util.Codec
    public final byte[] decode(byte[] bArr, int i9) {
        int i10;
        if (i9 % 8 != 0) {
            throw new IllegalArgumentException("Input is expected to be encoded in multiple of 8 bytes but found: " + i9);
        }
        int i11 = i9 - 1;
        int i12 = 0;
        while (i12 < 6 && i11 > -1 && bArr[i11] == 61) {
            i11--;
            i12++;
        }
        if (i12 == 0) {
            i10 = 5;
        } else if (i12 != 1) {
            i10 = 3;
            if (i12 != 3) {
                if (i12 == 4) {
                    i10 = 2;
                } else {
                    if (i12 != 6) {
                        throw new IllegalArgumentException("Invalid number of paddings " + i12);
                    }
                    i10 = 1;
                }
            }
        } else {
            i10 = 4;
        }
        int i13 = ((i9 / 8) * 5) - (5 - i10);
        byte[] bArr2 = new byte[i13];
        int i14 = 0;
        int i15 = 0;
        while (i15 < i13 - (i10 % 5)) {
            decode5bytes(bArr, i14, bArr2, i15);
            i14 += 8;
            i15 += 5;
        }
        if (i10 < 5) {
            decode1to4bytes(i10, bArr, i14, bArr2, i15);
        }
        return bArr2;
    }

    @Override // com.amazonaws.util.Codec
    public final byte[] encode(byte[] bArr) {
        int length = bArr.length / 5;
        int length2 = bArr.length % 5;
        int i9 = 0;
        if (length2 == 0) {
            byte[] bArr2 = new byte[length * 8];
            int i10 = 0;
            while (i9 < bArr.length) {
                encode5bytes(bArr, i9, bArr2, i10);
                i9 += 5;
                i10 += 8;
            }
            return bArr2;
        }
        byte[] bArr3 = new byte[(length + 1) * 8];
        int i11 = 0;
        while (i9 < bArr.length - length2) {
            encode5bytes(bArr, i9, bArr3, i11);
            i9 += 5;
            i11 += 8;
        }
        if (length2 == 1) {
            encode1byte(bArr, i9, bArr3, i11);
        } else if (length2 == 2) {
            encode2bytes(bArr, i9, bArr3, i11);
        } else if (length2 == 3) {
            encode3bytes(bArr, i9, bArr3, i11);
        } else if (length2 == 4) {
            encode4bytes(bArr, i9, bArr3, i11);
        }
        return bArr3;
    }

    public abstract int pos(byte b9);
}
