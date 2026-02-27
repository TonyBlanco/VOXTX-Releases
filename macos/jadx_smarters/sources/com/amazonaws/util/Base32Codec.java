package com.amazonaws.util;

/* JADX INFO: loaded from: classes.dex */
class Base32Codec extends AbstractBase32Codec {
    private static final int OFFSET = 26;
    private static final int OFFSET_OF_2 = 24;

    public static class LazyHolder {
        private static final byte[] DECODED = decodeTable();

        private LazyHolder() {
        }

        private static byte[] decodeTable() {
            byte[] bArr = new byte[123];
            for (int i9 = 0; i9 <= 122; i9++) {
                if (i9 >= 65 && i9 <= 90) {
                    bArr[i9] = (byte) (i9 - 65);
                } else if (i9 >= 50 && i9 <= 55) {
                    bArr[i9] = (byte) (i9 - 24);
                } else if (i9 < 97 || i9 > 122) {
                    bArr[i9] = -1;
                } else {
                    bArr[i9] = (byte) (i9 - 97);
                }
            }
            return bArr;
        }
    }

    public Base32Codec() {
        super(alphabets());
    }

    private static byte[] alphabets() {
        return CodecUtils.toBytesDirect("ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
    }

    @Override // com.amazonaws.util.AbstractBase32Codec
    public int pos(byte b9) {
        byte b10 = LazyHolder.DECODED[b9];
        if (b10 > -1) {
            return b10;
        }
        throw new IllegalArgumentException("Invalid base 32 character: '" + ((char) b9) + "'");
    }
}
