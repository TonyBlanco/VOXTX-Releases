package com.google.ads.interactivemedia.v3.internal;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import okhttp3.internal.http2.Http2;
import okio.Segment;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes3.dex */
public final class rh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f24368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f24369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f24370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f24371g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f24372h;

    public rh(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z9, boolean z10, boolean z11) {
        af.s(str);
        this.f24365a = str;
        this.f24366b = str2;
        this.f24367c = str3;
        this.f24368d = codecCapabilities;
        this.f24371g = z9;
        this.f24369e = z10;
        this.f24370f = z11;
        this.f24372h = ar.q(str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.ads.interactivemedia.v3.internal.rh g(java.lang.String r8, java.lang.String r9, java.lang.String r10, android.media.MediaCodecInfo.CodecCapabilities r11, boolean r12, boolean r13, boolean r14, boolean r15) {
        /*
            com.google.ads.interactivemedia.v3.internal.rh r13 = new com.google.ads.interactivemedia.v3.internal.rh
            r14 = 1
            r0 = 0
            if (r11 == 0) goto L3d
            int r1 = com.google.ads.interactivemedia.v3.internal.cq.f22640a
            r2 = 19
            if (r1 < r2) goto L3d
            java.lang.String r2 = "adaptive-playback"
            boolean r2 = r11.isFeatureSupported(r2)
            if (r2 == 0) goto L3d
            r2 = 22
            if (r1 > r2) goto L2b
            java.lang.String r1 = com.google.ads.interactivemedia.v3.internal.cq.f22643d
            java.lang.String r2 = "ODROID-XU3"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L2d
            java.lang.String r2 = "Nexus 10"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L2b
            goto L2d
        L2b:
            r6 = 1
            goto L3e
        L2d:
            java.lang.String r1 = "OMX.Exynos.AVC.Decoder"
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L3d
            java.lang.String r1 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L2b
        L3d:
            r6 = 0
        L3e:
            r1 = 21
            if (r11 == 0) goto L4b
            int r2 = com.google.ads.interactivemedia.v3.internal.cq.f22640a
            if (r2 < r1) goto L4b
            java.lang.String r2 = "tunneled-playback"
            r11.isFeatureSupported(r2)
        L4b:
            if (r15 != 0) goto L5b
            if (r11 == 0) goto L5d
            int r15 = com.google.ads.interactivemedia.v3.internal.cq.f22640a
            if (r15 < r1) goto L5d
            java.lang.String r15 = "secure-playback"
            boolean r15 = r11.isFeatureSupported(r15)
            if (r15 == 0) goto L5d
        L5b:
            r7 = 1
            goto L5e
        L5d:
            r7 = 0
        L5e:
            r0 = r13
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.rh.g(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):com.google.ads.interactivemedia.v3.internal.rh");
    }

    private static Point h(MediaCodecInfo.VideoCapabilities videoCapabilities, int i9, int i10) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(cq.c(i9, widthAlignment) * widthAlignment, cq.c(i10, heightAlignment) * heightAlignment);
    }

    private final void i(String str) {
        cd.a("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f24365a + ", " + this.f24366b + "] [" + cq.f22644e + "]");
    }

    private static boolean j(MediaCodecInfo.VideoCapabilities videoCapabilities, int i9, int i10, double d9) {
        Point pointH = h(videoCapabilities, i9, i10);
        int i11 = pointH.x;
        int i12 = pointH.y;
        return (d9 == -1.0d || d9 < 1.0d) ? videoCapabilities.isSizeSupported(i11, i12) : videoCapabilities.areSizeAndRateSupported(i11, i12, Math.floor(d9));
    }

    public final Point a(int i9, int i10) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f24368d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return h(videoCapabilities, i9, i10);
    }

    public final eq b(C1333s c1333s, C1333s c1333s2) {
        int i9 = true != cq.V(c1333s.f24467l, c1333s2.f24467l) ? 8 : 0;
        if (this.f24372h) {
            if (c1333s.f24475t != c1333s2.f24475t) {
                i9 |= 1024;
            }
            if (!this.f24369e && (c1333s.f24472q != c1333s2.f24472q || c1333s.f24473r != c1333s2.f24473r)) {
                i9 |= IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
            }
            if (!cq.V(c1333s.f24479x, c1333s2.f24479x)) {
                i9 |= 2048;
            }
            String str = this.f24365a;
            if (cq.f22643d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !c1333s.e(c1333s2)) {
                i9 |= 2;
            }
            if (i9 == 0) {
                return new eq(this.f24365a, c1333s, c1333s2, true != c1333s.e(c1333s2) ? 2 : 3, 0);
            }
        } else {
            if (c1333s.f24480y != c1333s2.f24480y) {
                i9 |= 4096;
            }
            if (c1333s.f24481z != c1333s2.f24481z) {
                i9 |= Segment.SIZE;
            }
            if (c1333s.f24450A != c1333s2.f24450A) {
                i9 |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
            if (i9 == 0 && "audio/mp4a-latm".equals(this.f24366b)) {
                Pair pairB = rw.b(c1333s);
                Pair pairB2 = rw.b(c1333s2);
                if (pairB != null && pairB2 != null) {
                    int iIntValue = ((Integer) pairB.first).intValue();
                    int iIntValue2 = ((Integer) pairB2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new eq(this.f24365a, c1333s, c1333s2, 3, 0);
                    }
                }
            }
            if (!c1333s.e(c1333s2)) {
                i9 |= 32;
            }
            if ("audio/opus".equals(this.f24366b)) {
                i9 |= 2;
            }
            if (i9 == 0) {
                return new eq(this.f24365a, c1333s, c1333s2, 1, 0);
            }
        }
        return new eq(this.f24365a, c1333s, c1333s2, 0, i9);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(com.google.ads.interactivemedia.v3.internal.C1333s r13) throws com.google.ads.interactivemedia.v3.internal.rr {
        /*
            Method dump skipped, instruction units count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.rh.c(com.google.ads.interactivemedia.v3.internal.s):boolean");
    }

    public final boolean d(C1333s c1333s) {
        if (this.f24372h) {
            return this.f24369e;
        }
        Pair pairB = rw.b(c1333s);
        return pairB != null && ((Integer) pairB.first).intValue() == 42;
    }

    public final boolean e(int i9, int i10, double d9) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f24368d;
        if (codecCapabilities == null) {
            str = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities == null) {
                str = "sizeAndRate.vCaps";
            } else {
                if (j(videoCapabilities, i9, i10, d9)) {
                    return true;
                }
                if (i9 < i10 && ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(this.f24365a) || !"mcv5a".equals(cq.f22641b)) && j(videoCapabilities, i10, i9, d9))) {
                    String str2 = this.f24365a;
                    String str3 = this.f24366b;
                    String str4 = cq.f22644e;
                    StringBuilder sb = new StringBuilder();
                    sb.append("AssumedSupport [");
                    sb.append("sizeAndRate.rotated, " + i9 + "x" + i10 + "x" + d9);
                    sb.append("] [");
                    sb.append(str2);
                    sb.append(", ");
                    sb.append(str3);
                    sb.append("] [");
                    sb.append(str4);
                    sb.append("]");
                    cd.a("MediaCodecInfo", sb.toString());
                    return true;
                }
                str = "sizeAndRate.support, " + i9 + "x" + i10 + "x" + d9;
            }
        }
        i(str);
        return false;
    }

    public final MediaCodecInfo.CodecProfileLevel[] f() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f24368d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public final String toString() {
        return this.f24365a;
    }
}
