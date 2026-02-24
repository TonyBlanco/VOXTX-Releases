package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes3.dex */
final class bbw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f21030a = d(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    public static void a(int[] iArr, int i9, int i10, int i11, int i12) {
        int i13 = iArr[i9] + iArr[i10];
        iArr[i9] = i13;
        int iE = e(i13 ^ iArr[i12], 16);
        iArr[i12] = iE;
        int i14 = iArr[i11] + iE;
        iArr[i11] = i14;
        int iE2 = e(iArr[i10] ^ i14, 12);
        iArr[i10] = iE2;
        int i15 = iArr[i9] + iE2;
        iArr[i9] = i15;
        int iE3 = e(iArr[i12] ^ i15, 8);
        iArr[i12] = iE3;
        int i16 = iArr[i11] + iE3;
        iArr[i11] = i16;
        iArr[i10] = e(iArr[i10] ^ i16, 7);
    }

    public static void b(int[] iArr, int[] iArr2) {
        int[] iArr3 = f21030a;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    public static void c(int[] iArr) {
        for (int i9 = 0; i9 < 10; i9++) {
            a(iArr, 0, 4, 8, 12);
            a(iArr, 1, 5, 9, 13);
            a(iArr, 2, 6, 10, 14);
            a(iArr, 3, 7, 11, 15);
            a(iArr, 0, 5, 10, 15);
            a(iArr, 1, 6, 11, 12);
            a(iArr, 2, 7, 8, 13);
            a(iArr, 3, 4, 9, 14);
        }
    }

    public static int[] d(byte[] bArr) {
        IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        intBufferAsIntBuffer.get(iArr);
        return iArr;
    }

    private static int e(int i9, int i10) {
        return (i9 >>> (-i10)) | (i9 << i10);
    }
}
