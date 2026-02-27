package org.apache.commons.codec.binary;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import org.apache.commons.codec.binary.BaseNCodec;

/* JADX INFO: loaded from: classes4.dex */
public class Base32 extends BaseNCodec {
    private static final int BITS_PER_ENCODED_BYTE = 5;
    private static final int BYTES_PER_ENCODED_BLOCK = 8;
    private static final int BYTES_PER_UNENCODED_BLOCK = 5;
    private static final byte[] CHUNK_SEPARATOR = {13, 10};
    private static final byte[] DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
    private static final byte[] ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 50, 51, 52, 53, 54, 55};
    private static final byte[] HEX_DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32};
    private static final byte[] HEX_ENCODE_TABLE = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86};
    private static final int MASK_5BITS = 31;
    private final int decodeSize;
    private final byte[] decodeTable;
    private final int encodeSize;
    private final byte[] encodeTable;
    private final byte[] lineSeparator;

    public Base32() {
        this(false);
    }

    public Base32(byte b9) {
        this(false, b9);
    }

    public Base32(int i9) {
        this(i9, CHUNK_SEPARATOR);
    }

    public Base32(int i9, byte[] bArr) {
        this(i9, bArr, false, (byte) 61);
    }

    public Base32(int i9, byte[] bArr, boolean z9) {
        this(i9, bArr, z9, (byte) 61);
    }

    public Base32(int i9, byte[] bArr, boolean z9, byte b9) {
        super(5, 8, i9, bArr == null ? 0 : bArr.length, b9);
        if (z9) {
            this.encodeTable = HEX_ENCODE_TABLE;
            this.decodeTable = HEX_DECODE_TABLE;
        } else {
            this.encodeTable = ENCODE_TABLE;
            this.decodeTable = DECODE_TABLE;
        }
        if (i9 <= 0) {
            this.encodeSize = 8;
            this.lineSeparator = null;
        } else {
            if (bArr == null) {
                throw new IllegalArgumentException("lineLength " + i9 + " > 0, but lineSeparator is null");
            }
            if (containsAlphabetOrPad(bArr)) {
                throw new IllegalArgumentException("lineSeparator must not contain Base32 characters: [" + StringUtils.newStringUtf8(bArr) + "]");
            }
            this.encodeSize = bArr.length + 8;
            byte[] bArr2 = new byte[bArr.length];
            this.lineSeparator = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        this.decodeSize = this.encodeSize - 1;
        if (isInAlphabet(b9) || BaseNCodec.isWhiteSpace(b9)) {
            throw new IllegalArgumentException("pad must not be in alphabet or whitespace");
        }
    }

    public Base32(boolean z9) {
        this(0, null, z9, (byte) 61);
    }

    public Base32(boolean z9, byte b9) {
        this(0, null, z9, b9);
    }

    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v23 */
    @Override // org.apache.commons.codec.binary.BaseNCodec
    public void decode(byte[] bArr, int i9, int i10, BaseNCodec.Context context) {
        byte b9;
        if (context.eof) {
            return;
        }
        ?? r32 = 1;
        if (i10 < 0) {
            context.eof = true;
        }
        int i11 = i9;
        int i12 = 0;
        while (true) {
            if (i12 >= i10) {
                break;
            }
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 == this.pad) {
                context.eof = r32;
                break;
            }
            byte[] bArrEnsureBufferSize = ensureBufferSize(this.decodeSize, context);
            if (b10 >= 0) {
                byte[] bArr2 = this.decodeTable;
                if (b10 < bArr2.length && (b9 = bArr2[b10]) >= 0) {
                    int i14 = (context.modulus + r32) % 8;
                    context.modulus = i14;
                    context.lbitWorkArea = (context.lbitWorkArea << 5) + ((long) b9);
                    if (i14 == 0) {
                        int i15 = context.pos;
                        bArrEnsureBufferSize[i15] = (byte) ((r12 >> 32) & 255);
                        bArrEnsureBufferSize[i15 + 1] = (byte) ((r12 >> 24) & 255);
                        bArrEnsureBufferSize[i15 + 2] = (byte) ((r12 >> 16) & 255);
                        bArrEnsureBufferSize[i15 + 3] = (byte) ((r12 >> 8) & 255);
                        context.pos = i15 + 5;
                        bArrEnsureBufferSize[i15 + 4] = (byte) (r12 & 255);
                    }
                }
            }
            i12++;
            i11 = i13;
            r32 = 1;
        }
        if (!context.eof || context.modulus < 2) {
            return;
        }
        byte[] bArrEnsureBufferSize2 = ensureBufferSize(this.decodeSize, context);
        switch (context.modulus) {
            case 2:
                int i16 = context.pos;
                context.pos = i16 + 1;
                bArrEnsureBufferSize2[i16] = (byte) ((context.lbitWorkArea >> 2) & 255);
                return;
            case 3:
                int i17 = context.pos;
                context.pos = i17 + 1;
                bArrEnsureBufferSize2[i17] = (byte) ((context.lbitWorkArea >> 7) & 255);
                return;
            case 4:
                context.lbitWorkArea = context.lbitWorkArea >> 4;
                int i18 = context.pos;
                bArrEnsureBufferSize2[i18] = (byte) ((r8 >> 12) & 255);
                context.pos = i18 + 2;
                bArrEnsureBufferSize2[i18 + 1] = (byte) (r4 & 255);
                return;
            case 5:
                context.lbitWorkArea = context.lbitWorkArea >> 1;
                int i19 = context.pos;
                bArrEnsureBufferSize2[i19] = (byte) ((r3 >> 17) & 255);
                bArrEnsureBufferSize2[i19 + 1] = (byte) ((r3 >> 9) & 255);
                context.pos = i19 + 3;
                bArrEnsureBufferSize2[i19 + 2] = (byte) (r9 & 255);
                return;
            case 6:
                context.lbitWorkArea = context.lbitWorkArea >> 6;
                int i20 = context.pos;
                bArrEnsureBufferSize2[i20] = (byte) ((r3 >> 22) & 255);
                bArrEnsureBufferSize2[i20 + 1] = (byte) ((r3 >> 14) & 255);
                context.pos = i20 + 3;
                bArrEnsureBufferSize2[i20 + 2] = (byte) (r9 & 255);
                return;
            case 7:
                context.lbitWorkArea = context.lbitWorkArea >> 3;
                int i21 = context.pos;
                bArrEnsureBufferSize2[i21] = (byte) ((r3 >> 27) & 255);
                bArrEnsureBufferSize2[i21 + 1] = (byte) ((r3 >> 19) & 255);
                bArrEnsureBufferSize2[i21 + 2] = (byte) ((r3 >> 11) & 255);
                context.pos = i21 + 4;
                bArrEnsureBufferSize2[i21 + 3] = (byte) (r8 & 255);
                return;
            default:
                throw new IllegalStateException("Impossible modulus " + context.modulus);
        }
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    public void encode(byte[] bArr, int i9, int i10, BaseNCodec.Context context) {
        int i11;
        if (context.eof) {
            return;
        }
        int i12 = 1;
        if (i10 >= 0) {
            int i13 = i9;
            int i14 = 0;
            while (i14 < i10) {
                byte[] bArrEnsureBufferSize = ensureBufferSize(this.encodeSize, context);
                int i15 = (context.modulus + i12) % 5;
                context.modulus = i15;
                int i16 = i13 + 1;
                int i17 = bArr[i13];
                if (i17 < 0) {
                    i17 += JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
                }
                long j9 = (context.lbitWorkArea << 8) + ((long) i17);
                context.lbitWorkArea = j9;
                if (i15 == 0) {
                    int i18 = context.pos;
                    byte[] bArr2 = this.encodeTable;
                    bArrEnsureBufferSize[i18] = bArr2[((int) (j9 >> 35)) & MASK_5BITS];
                    i11 = i16;
                    bArrEnsureBufferSize[i18 + 1] = bArr2[((int) (j9 >> 30)) & MASK_5BITS];
                    bArrEnsureBufferSize[i18 + 2] = bArr2[((int) (j9 >> 25)) & MASK_5BITS];
                    bArrEnsureBufferSize[i18 + 3] = bArr2[((int) (j9 >> 20)) & MASK_5BITS];
                    bArrEnsureBufferSize[i18 + 4] = bArr2[((int) (j9 >> 15)) & MASK_5BITS];
                    bArrEnsureBufferSize[i18 + 5] = bArr2[((int) (j9 >> 10)) & MASK_5BITS];
                    int i19 = i18 + 7;
                    bArrEnsureBufferSize[i18 + 6] = bArr2[((int) (j9 >> 5)) & MASK_5BITS];
                    int i20 = i18 + 8;
                    context.pos = i20;
                    bArrEnsureBufferSize[i19] = bArr2[((int) j9) & MASK_5BITS];
                    int i21 = context.currentLinePos + 8;
                    context.currentLinePos = i21;
                    int i22 = this.lineLength;
                    if (i22 > 0 && i22 <= i21) {
                        byte[] bArr3 = this.lineSeparator;
                        System.arraycopy(bArr3, 0, bArrEnsureBufferSize, i20, bArr3.length);
                        context.pos += this.lineSeparator.length;
                        context.currentLinePos = 0;
                    }
                    i14++;
                    i13 = i11;
                    i12 = 1;
                } else {
                    i11 = i16;
                }
                i14++;
                i13 = i11;
                i12 = 1;
            }
            return;
        }
        context.eof = true;
        if (context.modulus == 0 && this.lineLength == 0) {
            return;
        }
        byte[] bArrEnsureBufferSize2 = ensureBufferSize(this.encodeSize, context);
        int i23 = context.pos;
        int i24 = context.modulus;
        if (i24 != 0) {
            if (i24 == 1) {
                byte[] bArr4 = this.encodeTable;
                long j10 = context.lbitWorkArea;
                bArrEnsureBufferSize2[i23] = bArr4[((int) (j10 >> 3)) & MASK_5BITS];
                bArrEnsureBufferSize2[i23 + 1] = bArr4[((int) (j10 << 2)) & MASK_5BITS];
                byte b9 = this.pad;
                bArrEnsureBufferSize2[i23 + 2] = b9;
                bArrEnsureBufferSize2[i23 + 3] = b9;
                bArrEnsureBufferSize2[i23 + 4] = b9;
                bArrEnsureBufferSize2[i23 + 5] = b9;
                bArrEnsureBufferSize2[i23 + 6] = b9;
                context.pos = i23 + 8;
                bArrEnsureBufferSize2[i23 + 7] = b9;
            } else if (i24 == 2) {
                byte[] bArr5 = this.encodeTable;
                long j11 = context.lbitWorkArea;
                bArrEnsureBufferSize2[i23] = bArr5[((int) (j11 >> 11)) & MASK_5BITS];
                bArrEnsureBufferSize2[i23 + 1] = bArr5[((int) (j11 >> 6)) & MASK_5BITS];
                bArrEnsureBufferSize2[i23 + 2] = bArr5[((int) (j11 >> 1)) & MASK_5BITS];
                bArrEnsureBufferSize2[i23 + 3] = bArr5[((int) (j11 << 4)) & MASK_5BITS];
                byte b10 = this.pad;
                bArrEnsureBufferSize2[i23 + 4] = b10;
                bArrEnsureBufferSize2[i23 + 5] = b10;
                bArrEnsureBufferSize2[i23 + 6] = b10;
                context.pos = i23 + 8;
                bArrEnsureBufferSize2[i23 + 7] = b10;
            } else if (i24 == 3) {
                byte[] bArr6 = this.encodeTable;
                long j12 = context.lbitWorkArea;
                bArrEnsureBufferSize2[i23] = bArr6[((int) (j12 >> 19)) & MASK_5BITS];
                bArrEnsureBufferSize2[i23 + 1] = bArr6[((int) (j12 >> 14)) & MASK_5BITS];
                bArrEnsureBufferSize2[i23 + 2] = bArr6[((int) (j12 >> 9)) & MASK_5BITS];
                bArrEnsureBufferSize2[i23 + 3] = bArr6[((int) (j12 >> 4)) & MASK_5BITS];
                bArrEnsureBufferSize2[i23 + 4] = bArr6[((int) (j12 << 1)) & MASK_5BITS];
                byte b11 = this.pad;
                bArrEnsureBufferSize2[i23 + 5] = b11;
                bArrEnsureBufferSize2[i23 + 6] = b11;
                context.pos = i23 + 8;
                bArrEnsureBufferSize2[i23 + 7] = b11;
            } else {
                if (i24 != 4) {
                    throw new IllegalStateException("Impossible modulus " + context.modulus);
                }
                byte[] bArr7 = this.encodeTable;
                long j13 = context.lbitWorkArea;
                bArrEnsureBufferSize2[i23] = bArr7[((int) (j13 >> 27)) & MASK_5BITS];
                bArrEnsureBufferSize2[i23 + 1] = bArr7[((int) (j13 >> 22)) & MASK_5BITS];
                bArrEnsureBufferSize2[i23 + 2] = bArr7[((int) (j13 >> 17)) & MASK_5BITS];
                bArrEnsureBufferSize2[i23 + 3] = bArr7[((int) (j13 >> 12)) & MASK_5BITS];
                bArrEnsureBufferSize2[i23 + 4] = bArr7[((int) (j13 >> 7)) & MASK_5BITS];
                bArrEnsureBufferSize2[i23 + 5] = bArr7[((int) (j13 >> 2)) & MASK_5BITS];
                bArrEnsureBufferSize2[i23 + 6] = bArr7[((int) (j13 << 3)) & MASK_5BITS];
                context.pos = i23 + 8;
                bArrEnsureBufferSize2[i23 + 7] = this.pad;
            }
        }
        int i25 = context.currentLinePos;
        int i26 = context.pos;
        int i27 = i25 + (i26 - i23);
        context.currentLinePos = i27;
        if (this.lineLength <= 0 || i27 <= 0) {
            return;
        }
        byte[] bArr8 = this.lineSeparator;
        System.arraycopy(bArr8, 0, bArrEnsureBufferSize2, i26, bArr8.length);
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
}
