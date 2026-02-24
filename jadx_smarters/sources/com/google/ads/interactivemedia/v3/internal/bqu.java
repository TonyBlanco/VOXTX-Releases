package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class bqu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Charset f22114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f22115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ByteBuffer f22116c;

    static {
        Charset.forName("US-ASCII");
        f22114a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f22115b = bArr;
        f22116c = ByteBuffer.wrap(bArr);
        bpg.H(bArr, 0, 0, false);
    }

    public static int a(boolean z9) {
        return z9 ? 1231 : 1237;
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        int iD = d(length, bArr, 0, length);
        if (iD == 0) {
            return 1;
        }
        return iD;
    }

    public static int c(long j9) {
        return (int) (j9 ^ (j9 >>> 32));
    }

    public static int d(int i9, byte[] bArr, int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            i9 = (i9 * 31) + bArr[i12];
        }
        return i9;
    }

    public static Object e(Object obj, Object obj2) {
        return ((brs) obj).bq().aS((brs) obj2).aZ();
    }

    public static String f(byte[] bArr) {
        return new String(bArr, f22114a);
    }

    public static boolean g(brs brsVar) {
        if (brsVar instanceof boo) {
            throw null;
        }
        return false;
    }

    public static boolean h(byte[] bArr) {
        return btj.i(bArr);
    }

    public static void i(Object obj) {
        obj.getClass();
    }

    public static void j(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }
}
