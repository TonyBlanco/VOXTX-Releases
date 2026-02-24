package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
abstract class btg {
    public static final String f(ByteBuffer byteBuffer, int i9, int i10) throws bqw {
        if ((i9 | i10 | ((byteBuffer.limit() - i9) - i10)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i9), Integer.valueOf(i10)));
        }
        int i11 = i9 + i10;
        char[] cArr = new char[i10];
        int i12 = 0;
        while (i9 < i11) {
            byte b9 = byteBuffer.get(i9);
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
            byte b10 = byteBuffer.get(i9);
            if (bto.e(b10)) {
                bto.b(b10, cArr, i13);
                i13++;
                i9 = i14;
                while (i9 < i11) {
                    byte b11 = byteBuffer.get(i9);
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
                bto.d(b10, byteBuffer.get(i14), cArr, i13);
                i13++;
            } else if (bto.f(b10)) {
                if (i14 >= i11 - 1) {
                    throw bqw.d();
                }
                int i15 = i9 + 2;
                i9 += 3;
                bto.c(b10, byteBuffer.get(i14), byteBuffer.get(i15), cArr, i13);
                i13++;
            } else {
                if (i14 >= i11 - 2) {
                    throw bqw.d();
                }
                int i16 = i9 + 2;
                int i17 = i9 + 3;
                i9 += 4;
                bto.a(b10, byteBuffer.get(i14), byteBuffer.get(i16), byteBuffer.get(i17), cArr, i13);
                i13 += 2;
            }
        }
        return new String(cArr, 0, i13);
    }

    public abstract int a(CharSequence charSequence, byte[] bArr, int i9, int i10);

    public abstract int b(int i9, byte[] bArr, int i10, int i11);

    public abstract String c(byte[] bArr, int i9, int i10) throws bqw;

    public abstract String d(ByteBuffer byteBuffer, int i9, int i10) throws bqw;

    public final boolean e(byte[] bArr, int i9, int i10) {
        return b(0, bArr, i9, i10) == 0;
    }
}
