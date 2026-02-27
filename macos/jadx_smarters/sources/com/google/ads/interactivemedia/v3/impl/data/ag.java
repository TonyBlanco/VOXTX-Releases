package com.google.ads.interactivemedia.v3.impl.data;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ag {
    public static byte[] a(byte[] bArr) {
        int length = bArr.length;
        if (length >= 16) {
            throw new IllegalArgumentException("x must be smaller than a block.");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 16);
        bArrCopyOf[length] = -128;
        return bArrCopyOf;
    }

    public static byte[] b(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        for (int i9 = 0; i9 < 16; i9++) {
            byte b9 = bArr[i9];
            byte b10 = (byte) ((b9 + b9) & 254);
            bArr2[i9] = b10;
            if (i9 < 15) {
                bArr2[i9] = (byte) (((bArr[i9 + 1] >> 7) & 1) | b10);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }
}
