package com.google.ads.interactivemedia.v3.internal;

import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes3.dex */
public final class zs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f25280a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f25281b = {44100, 48000, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f25282c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f25283d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f25284e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f25285f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f25286g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static int b(int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (!m(i9) || (i10 = (i9 >>> 19) & 3) == 1 || (i11 = (i9 >>> 17) & 3) == 0 || (i12 = (i9 >>> 12) & 15) == 0 || i12 == 15 || (i13 = (i9 >>> 10) & 3) == 3) {
            return -1;
        }
        int i14 = f25281b[i13];
        if (i10 == 2) {
            i14 /= 2;
        } else if (i10 == 0) {
            i14 /= 4;
        }
        int i15 = (i9 >>> 9) & 1;
        if (i11 == 3) {
            return ((((i10 == 3 ? f25282c[i12 - 1] : f25283d[i12 - 1]) * 12) / i14) + i15) * 4;
        }
        int i16 = i10 == 3 ? i11 == 2 ? f25284e[i12 - 1] : f25285f[i12 - 1] : f25286g[i12 - 1];
        int i17 = IjkMediaMeta.FF_PROFILE_H264_HIGH_444;
        if (i10 == 3) {
            return ((i16 * IjkMediaMeta.FF_PROFILE_H264_HIGH_444) / i14) + i15;
        }
        if (i11 == 1) {
            i17 = 72;
        }
        return ((i17 * i16) / i14) + i15;
    }

    public static int c(int i9) {
        int i10;
        int i11;
        if (!m(i9) || (i10 = (i9 >>> 19) & 3) == 1 || (i11 = (i9 >>> 17) & 3) == 0) {
            return -1;
        }
        int i12 = (i9 >>> 12) & 15;
        int i13 = (i9 >>> 10) & 3;
        if (i12 == 0 || i12 == 15 || i13 == 3) {
            return -1;
        }
        return l(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(int i9, int i10) {
        return i10 != 1 ? i10 != 2 ? 384 : 1152 : i9 == 3 ? 1152 : 576;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean m(int i9) {
        return (i9 & (-2097152)) == -2097152;
    }
}
