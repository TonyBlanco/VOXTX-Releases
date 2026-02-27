package org.apache.commons.codec.binary;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.google.android.gms.common.api.a;
import java.math.BigInteger;
import okio.Utf8;
import org.apache.commons.codec.binary.BaseNCodec;

/* JADX INFO: loaded from: classes4.dex */
public class Base64 extends BaseNCodec {
    private static final int BITS_PER_ENCODED_BYTE = 6;
    private static final int BYTES_PER_ENCODED_BLOCK = 4;
    private static final int BYTES_PER_UNENCODED_BLOCK = 3;
    private static final int MASK_6BITS = 63;
    private final int decodeSize;
    private final byte[] decodeTable;
    private final int encodeSize;
    private final byte[] encodeTable;
    private final byte[] lineSeparator;
    static final byte[] CHUNK_SEPARATOR = {13, 10};
    private static final byte[] STANDARD_ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] URL_SAFE_ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    private static final byte[] DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, Utf8.REPLACEMENT_BYTE, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, Utf8.REPLACEMENT_BYTE, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};

    public Base64() {
        this(0);
    }

    public Base64(int i9) {
        this(i9, CHUNK_SEPARATOR);
    }

    public Base64(int i9, byte[] bArr) {
        this(i9, bArr, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Base64(int r5, byte[] r6, boolean r7) {
        /*
            r4 = this;
            r0 = 0
            if (r6 != 0) goto L5
            r1 = 0
            goto L6
        L5:
            int r1 = r6.length
        L6:
            r2 = 3
            r3 = 4
            r4.<init>(r2, r3, r5, r1)
            byte[] r1 = org.apache.commons.codec.binary.Base64.DECODE_TABLE
            r4.decodeTable = r1
            r1 = 0
            if (r6 == 0) goto L28
            boolean r2 = r4.containsAlphabetOrPad(r6)
            if (r2 != 0) goto L2d
            if (r5 <= 0) goto L28
            int r5 = r6.length
            int r5 = r5 + r3
            r4.encodeSize = r5
            int r5 = r6.length
            byte[] r5 = new byte[r5]
            r4.lineSeparator = r5
            int r1 = r6.length
            java.lang.System.arraycopy(r6, r0, r5, r0, r1)
            goto L4d
        L28:
            r4.encodeSize = r3
            r4.lineSeparator = r1
            goto L4d
        L2d:
            java.lang.String r5 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(r6)
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "lineSeparator must not contain base64 characters: ["
            r7.append(r0)
            r7.append(r5)
            java.lang.String r5 = "]"
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            throw r6
        L4d:
            int r5 = r4.encodeSize
            int r5 = r5 + (-1)
            r4.decodeSize = r5
            if (r7 == 0) goto L58
            byte[] r5 = org.apache.commons.codec.binary.Base64.URL_SAFE_ENCODE_TABLE
            goto L5a
        L58:
            byte[] r5 = org.apache.commons.codec.binary.Base64.STANDARD_ENCODE_TABLE
        L5a:
            r4.encodeTable = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.codec.binary.Base64.<init>(int, byte[], boolean):void");
    }

    public Base64(boolean z9) {
        this(76, CHUNK_SEPARATOR, z9);
    }

    public static byte[] decodeBase64(String str) {
        return new Base64().decode(str);
    }

    public static byte[] decodeBase64(byte[] bArr) {
        return new Base64().decode(bArr);
    }

    public static BigInteger decodeInteger(byte[] bArr) {
        return new BigInteger(1, decodeBase64(bArr));
    }

    public static byte[] encodeBase64(byte[] bArr) {
        return encodeBase64(bArr, false);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z9) {
        return encodeBase64(bArr, z9, false);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z9, boolean z10) {
        return encodeBase64(bArr, z9, z10, a.e.API_PRIORITY_OTHER);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z9, boolean z10, int i9) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        Base64 base64 = z9 ? new Base64(z10) : new Base64(0, CHUNK_SEPARATOR, z10);
        long encodedLength = base64.getEncodedLength(bArr);
        if (encodedLength <= i9) {
            return base64.encode(bArr);
        }
        throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + encodedLength + ") than the specified maximum size of " + i9);
    }

    public static byte[] encodeBase64Chunked(byte[] bArr) {
        return encodeBase64(bArr, true);
    }

    public static String encodeBase64String(byte[] bArr) {
        return StringUtils.newStringUtf8(encodeBase64(bArr, false));
    }

    public static byte[] encodeBase64URLSafe(byte[] bArr) {
        return encodeBase64(bArr, false, true);
    }

    public static String encodeBase64URLSafeString(byte[] bArr) {
        return StringUtils.newStringUtf8(encodeBase64(bArr, false, true));
    }

    public static byte[] encodeInteger(BigInteger bigInteger) {
        if (bigInteger != null) {
            return encodeBase64(toIntegerBytes(bigInteger), false);
        }
        throw new NullPointerException("encodeInteger called with null parameter");
    }

    @Deprecated
    public static boolean isArrayByteBase64(byte[] bArr) {
        return isBase64(bArr);
    }

    public static boolean isBase64(byte b9) {
        if (b9 != 61) {
            if (b9 >= 0) {
                byte[] bArr = DECODE_TABLE;
                if (b9 >= bArr.length || bArr[b9] == -1) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean isBase64(String str) {
        return isBase64(StringUtils.getBytesUtf8(str));
    }

    public static boolean isBase64(byte[] bArr) {
        for (int i9 = 0; i9 < bArr.length; i9++) {
            if (!isBase64(bArr[i9]) && !BaseNCodec.isWhiteSpace(bArr[i9])) {
                return false;
            }
        }
        return true;
    }

    public static byte[] toIntegerBytes(BigInteger bigInteger) {
        int iBitLength = ((bigInteger.bitLength() + 7) >> 3) << 3;
        byte[] byteArray = bigInteger.toByteArray();
        int i9 = 1;
        if (bigInteger.bitLength() % 8 != 0 && (bigInteger.bitLength() / 8) + 1 == iBitLength / 8) {
            return byteArray;
        }
        int length = byteArray.length;
        if (bigInteger.bitLength() % 8 == 0) {
            length--;
        } else {
            i9 = 0;
        }
        int i10 = iBitLength / 8;
        int i11 = i10 - length;
        byte[] bArr = new byte[i10];
        System.arraycopy(byteArray, i9, bArr, i11, length);
        return bArr;
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    public void decode(byte[] bArr, int i9, int i10, BaseNCodec.Context context) {
        byte b9;
        if (context.eof) {
            return;
        }
        if (i10 < 0) {
            context.eof = true;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            byte[] bArrEnsureBufferSize = ensureBufferSize(this.decodeSize, context);
            int i12 = i9 + 1;
            byte b10 = bArr[i9];
            if (b10 == this.pad) {
                context.eof = true;
                break;
            }
            if (b10 >= 0) {
                byte[] bArr2 = DECODE_TABLE;
                if (b10 < bArr2.length && (b9 = bArr2[b10]) >= 0) {
                    int i13 = (context.modulus + 1) % 4;
                    context.modulus = i13;
                    int i14 = (context.ibitWorkArea << 6) + b9;
                    context.ibitWorkArea = i14;
                    if (i13 == 0) {
                        int i15 = context.pos;
                        bArrEnsureBufferSize[i15] = (byte) ((i14 >> 16) & 255);
                        bArrEnsureBufferSize[i15 + 1] = (byte) ((i14 >> 8) & 255);
                        context.pos = i15 + 3;
                        bArrEnsureBufferSize[i15 + 2] = (byte) (i14 & 255);
                    }
                }
            }
            i11++;
            i9 = i12;
        }
        if (!context.eof || context.modulus == 0) {
            return;
        }
        byte[] bArrEnsureBufferSize2 = ensureBufferSize(this.decodeSize, context);
        int i16 = context.modulus;
        if (i16 != 1) {
            if (i16 == 2) {
                int i17 = context.ibitWorkArea >> 4;
                context.ibitWorkArea = i17;
                int i18 = context.pos;
                context.pos = i18 + 1;
                bArrEnsureBufferSize2[i18] = (byte) (i17 & 255);
                return;
            }
            if (i16 != 3) {
                throw new IllegalStateException("Impossible modulus " + context.modulus);
            }
            int i19 = context.ibitWorkArea;
            int i20 = i19 >> 2;
            context.ibitWorkArea = i20;
            int i21 = context.pos;
            bArrEnsureBufferSize2[i21] = (byte) ((i19 >> 10) & 255);
            context.pos = i21 + 2;
            bArrEnsureBufferSize2[i21 + 1] = (byte) (i20 & 255);
        }
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    public void encode(byte[] bArr, int i9, int i10, BaseNCodec.Context context) {
        if (context.eof) {
            return;
        }
        if (i10 >= 0) {
            int i11 = 0;
            while (i11 < i10) {
                byte[] bArrEnsureBufferSize = ensureBufferSize(this.encodeSize, context);
                int i12 = (context.modulus + 1) % 3;
                context.modulus = i12;
                int i13 = i9 + 1;
                int i14 = bArr[i9];
                if (i14 < 0) {
                    i14 += JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
                }
                int i15 = (context.ibitWorkArea << 8) + i14;
                context.ibitWorkArea = i15;
                if (i12 == 0) {
                    int i16 = context.pos;
                    byte[] bArr2 = this.encodeTable;
                    bArrEnsureBufferSize[i16] = bArr2[(i15 >> 18) & MASK_6BITS];
                    bArrEnsureBufferSize[i16 + 1] = bArr2[(i15 >> 12) & MASK_6BITS];
                    int i17 = i16 + 3;
                    bArrEnsureBufferSize[i16 + 2] = bArr2[(i15 >> 6) & MASK_6BITS];
                    int i18 = i16 + 4;
                    context.pos = i18;
                    bArrEnsureBufferSize[i17] = bArr2[i15 & MASK_6BITS];
                    int i19 = context.currentLinePos + 4;
                    context.currentLinePos = i19;
                    int i20 = this.lineLength;
                    if (i20 > 0 && i20 <= i19) {
                        byte[] bArr3 = this.lineSeparator;
                        System.arraycopy(bArr3, 0, bArrEnsureBufferSize, i18, bArr3.length);
                        context.pos += this.lineSeparator.length;
                        context.currentLinePos = 0;
                    }
                }
                i11++;
                i9 = i13;
            }
            return;
        }
        context.eof = true;
        if (context.modulus == 0 && this.lineLength == 0) {
            return;
        }
        byte[] bArrEnsureBufferSize2 = ensureBufferSize(this.encodeSize, context);
        int i21 = context.pos;
        int i22 = context.modulus;
        if (i22 != 0) {
            if (i22 == 1) {
                byte[] bArr4 = this.encodeTable;
                int i23 = context.ibitWorkArea;
                bArrEnsureBufferSize2[i21] = bArr4[(i23 >> 2) & MASK_6BITS];
                int i24 = i21 + 2;
                context.pos = i24;
                bArrEnsureBufferSize2[i21 + 1] = bArr4[(i23 << 4) & MASK_6BITS];
                if (bArr4 == STANDARD_ENCODE_TABLE) {
                    byte b9 = this.pad;
                    bArrEnsureBufferSize2[i24] = b9;
                    context.pos = i21 + 4;
                    bArrEnsureBufferSize2[i21 + 3] = b9;
                }
            } else {
                if (i22 != 2) {
                    throw new IllegalStateException("Impossible modulus " + context.modulus);
                }
                byte[] bArr5 = this.encodeTable;
                int i25 = context.ibitWorkArea;
                bArrEnsureBufferSize2[i21] = bArr5[(i25 >> 10) & MASK_6BITS];
                bArrEnsureBufferSize2[i21 + 1] = bArr5[(i25 >> 4) & MASK_6BITS];
                int i26 = i21 + 3;
                context.pos = i26;
                bArrEnsureBufferSize2[i21 + 2] = bArr5[(i25 << 2) & MASK_6BITS];
                if (bArr5 == STANDARD_ENCODE_TABLE) {
                    context.pos = i21 + 4;
                    bArrEnsureBufferSize2[i26] = this.pad;
                }
            }
        }
        int i27 = context.currentLinePos;
        int i28 = context.pos;
        int i29 = i27 + (i28 - i21);
        context.currentLinePos = i29;
        if (this.lineLength <= 0 || i29 <= 0) {
            return;
        }
        byte[] bArr6 = this.lineSeparator;
        System.arraycopy(bArr6, 0, bArrEnsureBufferSize2, i28, bArr6.length);
        context.pos += this.lineSeparator.length;
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    public boolean isInAlphabet(byte b9) {
        if (b9 >= 0) {
            byte[] bArr = this.decodeTable;
            if (b9 < bArr.length && bArr[b9] != -1) {
                return true;
            }
        }
        return false;
    }

    public boolean isUrlSafe() {
        return this.encodeTable == URL_SAFE_ENCODE_TABLE;
    }
}
