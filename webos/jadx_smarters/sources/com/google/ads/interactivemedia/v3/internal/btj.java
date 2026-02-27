package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes3.dex */
final class btj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final btg f22264a;

    static {
        int i9 = btf.f22255c;
        f22264a = new bth();
    }

    public static /* bridge */ /* synthetic */ int c(byte[] bArr, int i9, int i10) {
        byte b9 = bArr[i9 - 1];
        int i11 = i10 - i9;
        if (i11 == 0) {
            return k(b9);
        }
        if (i11 == 1) {
            return l(b9, bArr[i9]);
        }
        if (i11 == 2) {
            return m(b9, bArr[i9], bArr[i9 + 1]);
        }
        throw new AssertionError();
    }

    public static int d(CharSequence charSequence, byte[] bArr, int i9, int i10) {
        return f22264a.a(charSequence, bArr, i9, i10);
    }

    public static int e(CharSequence charSequence) {
        int length = charSequence.length();
        int i9 = 0;
        int i10 = 0;
        while (i10 < length && charSequence.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (true) {
            if (i10 >= length) {
                break;
            }
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt < 2048) {
                i11 += (127 - cCharAt) >>> 31;
                i10++;
            } else {
                int length2 = charSequence.length();
                while (i10 < length2) {
                    char cCharAt2 = charSequence.charAt(i10);
                    if (cCharAt2 < 2048) {
                        i9 += (127 - cCharAt2) >>> 31;
                    } else {
                        i9 += 2;
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i10) < 65536) {
                                throw new bti(i10, length2);
                            }
                            i10++;
                        }
                    }
                    i10++;
                }
                i11 += i9;
            }
        }
        if (i11 >= length) {
            return i11;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i11) + IjkMediaMeta.AV_CH_WIDE_RIGHT));
    }

    public static int f(int i9, byte[] bArr, int i10, int i11) {
        return f22264a.b(i9, bArr, i10, i11);
    }

    public static String g(ByteBuffer byteBuffer, int i9, int i10) throws bqw {
        btg btgVar = f22264a;
        if (byteBuffer.hasArray()) {
            return btgVar.c(byteBuffer.array(), byteBuffer.arrayOffset() + i9, i10);
        }
        return byteBuffer.isDirect() ? btgVar.d(byteBuffer, i9, i10) : btg.f(byteBuffer, i9, i10);
    }

    public static String h(byte[] bArr, int i9, int i10) throws bqw {
        return f22264a.c(bArr, i9, i10);
    }

    public static boolean i(byte[] bArr) {
        return f22264a.e(bArr, 0, bArr.length);
    }

    public static boolean j(byte[] bArr, int i9, int i10) {
        return f22264a.e(bArr, i9, i10);
    }

    private static int k(int i9) {
        if (i9 > -12) {
            return -1;
        }
        return i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(int i9, int i10) {
        if (i9 > -12 || i10 > -65) {
            return -1;
        }
        return i9 ^ (i10 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int m(int i9, int i10, int i11) {
        if (i9 > -12 || i10 > -65 || i11 > -65) {
            return -1;
        }
        return (i9 ^ (i10 << 8)) ^ (i11 << 16);
    }
}
