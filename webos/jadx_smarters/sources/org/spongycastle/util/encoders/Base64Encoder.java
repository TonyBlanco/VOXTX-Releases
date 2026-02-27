package org.spongycastle.util.encoders;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public class Base64Encoder implements Encoder {
    protected final byte[] encodingTable = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    protected final byte[] decodingTable = new byte[128];
    protected byte padding = 61;

    public Base64Encoder() {
        initialiseDecodingTable();
    }

    private int decodeLastBlock(OutputStream outputStream, char c9, char c10, char c11, char c12) throws IOException {
        char c13 = this.padding;
        if (c11 == c13) {
            byte[] bArr = this.decodingTable;
            outputStream.write((bArr[c9] << 2) | (bArr[c10] >> 4));
            return 1;
        }
        if (c12 == c13) {
            byte[] bArr2 = this.decodingTable;
            byte b9 = bArr2[c9];
            byte b10 = bArr2[c10];
            byte b11 = bArr2[c11];
            outputStream.write((b9 << 2) | (b10 >> 4));
            outputStream.write((b10 << 4) | (b11 >> 2));
            return 2;
        }
        byte[] bArr3 = this.decodingTable;
        byte b12 = bArr3[c9];
        byte b13 = bArr3[c10];
        byte b14 = bArr3[c11];
        byte b15 = bArr3[c12];
        outputStream.write((b12 << 2) | (b13 >> 4));
        outputStream.write((b13 << 4) | (b14 >> 2));
        outputStream.write((b14 << 6) | b15);
        return 3;
    }

    private boolean ignore(char c9) {
        return c9 == '\n' || c9 == '\r' || c9 == '\t' || c9 == ' ';
    }

    private int nextI(String str, int i9, int i10) {
        while (i9 < i10 && ignore(str.charAt(i9))) {
            i9++;
        }
        return i9;
    }

    private int nextI(byte[] bArr, int i9, int i10) {
        while (i9 < i10 && ignore((char) bArr[i9])) {
            i9++;
        }
        return i9;
    }

    @Override // org.spongycastle.util.encoders.Encoder
    public int decode(String str, OutputStream outputStream) throws IOException {
        int length = str.length();
        while (length > 0 && ignore(str.charAt(length - 1))) {
            length--;
        }
        int i9 = length - 4;
        int i10 = 0;
        int iNextI = nextI(str, 0, i9);
        while (iNextI < i9) {
            int i11 = iNextI + 1;
            byte b9 = this.decodingTable[str.charAt(iNextI)];
            int iNextI2 = nextI(str, i11, i9);
            int i12 = iNextI2 + 1;
            byte b10 = this.decodingTable[str.charAt(iNextI2)];
            int iNextI3 = nextI(str, i12, i9);
            int i13 = iNextI3 + 1;
            byte b11 = this.decodingTable[str.charAt(iNextI3)];
            int iNextI4 = nextI(str, i13, i9);
            int i14 = iNextI4 + 1;
            byte b12 = this.decodingTable[str.charAt(iNextI4)];
            outputStream.write((b9 << 2) | (b10 >> 4));
            outputStream.write((b10 << 4) | (b11 >> 2));
            outputStream.write((b11 << 6) | b12);
            i10 += 3;
            iNextI = nextI(str, i14, i9);
        }
        return i10 + decodeLastBlock(outputStream, str.charAt(i9), str.charAt(length - 3), str.charAt(length - 2), str.charAt(length - 1));
    }

    @Override // org.spongycastle.util.encoders.Encoder
    public int decode(byte[] bArr, int i9, int i10, OutputStream outputStream) throws IOException {
        int i11 = i10 + i9;
        while (i11 > i9 && ignore((char) bArr[i11 - 1])) {
            i11--;
        }
        int i12 = i11 - 4;
        int iNextI = nextI(bArr, i9, i12);
        int i13 = 0;
        while (iNextI < i12) {
            int i14 = iNextI + 1;
            byte b9 = this.decodingTable[bArr[iNextI]];
            int iNextI2 = nextI(bArr, i14, i12);
            int i15 = iNextI2 + 1;
            byte b10 = this.decodingTable[bArr[iNextI2]];
            int iNextI3 = nextI(bArr, i15, i12);
            int i16 = iNextI3 + 1;
            byte b11 = this.decodingTable[bArr[iNextI3]];
            int iNextI4 = nextI(bArr, i16, i12);
            int i17 = iNextI4 + 1;
            byte b12 = this.decodingTable[bArr[iNextI4]];
            outputStream.write((b9 << 2) | (b10 >> 4));
            outputStream.write((b10 << 4) | (b11 >> 2));
            outputStream.write((b11 << 6) | b12);
            i13 += 3;
            iNextI = nextI(bArr, i17, i12);
        }
        return i13 + decodeLastBlock(outputStream, (char) bArr[i12], (char) bArr[i11 - 3], (char) bArr[i11 - 2], (char) bArr[i11 - 1]);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a5  */
    @Override // org.spongycastle.util.encoders.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int encode(byte[] r11, int r12, int r13, java.io.OutputStream r14) throws java.io.IOException {
        /*
            r10 = this;
            int r0 = r13 % 3
            int r13 = r13 - r0
            r1 = r12
        L4:
            int r2 = r12 + r13
            r3 = 4
            r4 = 2
            if (r1 >= r2) goto L4c
            r2 = r11[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r5 = r1 + 1
            r5 = r11[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r6 = r1 + 2
            r6 = r11[r6]
            r7 = r6 & 255(0xff, float:3.57E-43)
            byte[] r8 = r10.encodingTable
            int r9 = r2 >>> 2
            r9 = r9 & 63
            r8 = r8[r9]
            r14.write(r8)
            byte[] r8 = r10.encodingTable
            int r2 = r2 << r3
            int r3 = r5 >>> 4
            r2 = r2 | r3
            r2 = r2 & 63
            r2 = r8[r2]
            r14.write(r2)
            byte[] r2 = r10.encodingTable
            int r3 = r5 << 2
            int r4 = r7 >>> 6
            r3 = r3 | r4
            r3 = r3 & 63
            r2 = r2[r3]
            r14.write(r2)
            byte[] r2 = r10.encodingTable
            r3 = r6 & 63
            r2 = r2[r3]
            r14.write(r2)
            int r1 = r1 + 3
            goto L4
        L4c:
            r12 = 1
            if (r0 == r12) goto L83
            if (r0 == r4) goto L52
            goto L9f
        L52:
            r1 = r11[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r2 = r2 + r12
            r11 = r11[r2]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r12 = r1 >>> 2
            r12 = r12 & 63
            int r1 = r1 << r3
            int r2 = r11 >>> 4
            r1 = r1 | r2
            r1 = r1 & 63
            int r11 = r11 << r4
            r11 = r11 & 63
            byte[] r2 = r10.encodingTable
            r12 = r2[r12]
            r14.write(r12)
            byte[] r12 = r10.encodingTable
            r12 = r12[r1]
            r14.write(r12)
            byte[] r12 = r10.encodingTable
            r11 = r12[r11]
        L7a:
            r14.write(r11)
            byte r11 = r10.padding
            r14.write(r11)
            goto L9f
        L83:
            r11 = r11[r2]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r12 = r11 >>> 2
            r12 = r12 & 63
            int r11 = r11 << r3
            r11 = r11 & 63
            byte[] r1 = r10.encodingTable
            r12 = r1[r12]
            r14.write(r12)
            byte[] r12 = r10.encodingTable
            r11 = r12[r11]
            r14.write(r11)
            byte r11 = r10.padding
            goto L7a
        L9f:
            int r13 = r13 / 3
            int r13 = r13 * 4
            if (r0 != 0) goto La6
            r3 = 0
        La6:
            int r13 = r13 + r3
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.util.encoders.Base64Encoder.encode(byte[], int, int, java.io.OutputStream):int");
    }

    public void initialiseDecodingTable() {
        int i9 = 0;
        while (true) {
            byte[] bArr = this.encodingTable;
            if (i9 >= bArr.length) {
                return;
            }
            this.decodingTable[bArr[i9]] = (byte) i9;
            i9++;
        }
    }
}
