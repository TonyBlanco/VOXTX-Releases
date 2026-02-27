package com.amazonaws.util;

/* JADX INFO: loaded from: classes.dex */
class Base16Codec implements Codec {
    private static final int BITS_4 = 4;
    private static final int MASK_4BITS = 15;
    private static final int OFFSET_OF_A = 55;
    private static final int OFFSET_OF_a = 87;
    private static final int OFFSET_VALUE = 10;
    private final byte[] alpahbets = CodecUtils.toBytesDirect("0123456789ABCDEF");

    public static class LazyHolder {
        private static final byte[] DECODED = decodeTable();

        private LazyHolder() {
        }

        private static byte[] decodeTable() {
            byte[] bArr = new byte[103];
            for (int i9 = 0; i9 <= 102; i9++) {
                if (i9 >= 48 && i9 <= 57) {
                    bArr[i9] = (byte) (i9 - 48);
                } else if (i9 >= 65 && i9 <= 70) {
                    bArr[i9] = (byte) (i9 - 55);
                } else if (i9 < 97 || i9 > 102) {
                    bArr[i9] = -1;
                } else {
                    bArr[i9] = (byte) (i9 - 87);
                }
            }
            return bArr;
        }
    }

    @Override // com.amazonaws.util.Codec
    public byte[] decode(byte[] bArr, int i9) {
        if (i9 % 2 != 0) {
            throw new IllegalArgumentException("Input is expected to be encoded in multiple of 2 bytes but found: " + i9);
        }
        int i10 = i9 / 2;
        byte[] bArr2 = new byte[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = i11 + 1;
            int iPos = pos(bArr[i11]) << 4;
            i11 += 2;
            bArr2[i12] = (byte) (pos(bArr[i13]) | iPos);
        }
        return bArr2;
    }

    @Override // com.amazonaws.util.Codec
    public byte[] encode(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length * 2];
        int i9 = 0;
        for (byte b9 : bArr) {
            int i10 = i9 + 1;
            byte[] bArr3 = this.alpahbets;
            bArr2[i9] = bArr3[(b9 >>> 4) & 15];
            i9 += 2;
            bArr2[i10] = bArr3[b9 & 15];
        }
        return bArr2;
    }

    public int pos(byte b9) {
        byte b10 = LazyHolder.DECODED[b9];
        if (b10 > -1) {
            return b10;
        }
        throw new IllegalArgumentException("Invalid base 16 character: '" + ((char) b9) + "'");
    }
}
