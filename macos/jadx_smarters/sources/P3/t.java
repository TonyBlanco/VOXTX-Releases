package p3;

import O2.C0936z0;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.F;
import d4.k0;
import java.util.List;
import okhttp3.internal.http2.Http2;
import okio.Segment;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f46302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f46303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f46304f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f46305g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f46306h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f46307i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f46308j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f46309k;

    public static final class a {
        public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i9, int i10, double d9) {
            List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty() || t.C()) {
                return 0;
            }
            AbstractC2410p.a();
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointA = AbstractC2409o.a(i9, i10, (int) d9);
            for (int i11 = 0; i11 < supportedPerformancePoints.size(); i11++) {
                if (AbstractC2412r.a(supportedPerformancePoints.get(i11)).covers(performancePointA)) {
                    return 2;
                }
            }
            return 1;
        }
    }

    public t(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f46299a = (String) AbstractC1684a.e(str);
        this.f46300b = str2;
        this.f46301c = str3;
        this.f46302d = codecCapabilities;
        this.f46306h = z9;
        this.f46307i = z10;
        this.f46308j = z11;
        this.f46303e = z12;
        this.f46304f = z13;
        this.f46305g = z14;
        this.f46309k = F.s(str2);
    }

    public static boolean A(String str) {
        return k0.f39780d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    public static boolean B(String str) {
        if (k0.f39777a <= 22) {
            String str2 = k0.f39780d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    public static boolean C() {
        String str = k0.f39778b;
        if (!str.equals("sabrina") && !str.equals("boreal")) {
            String str2 = k0.f39780d;
            if (!str2.startsWith("Lenovo TB-X605") && !str2.startsWith("Lenovo TB-X606") && !str2.startsWith("Lenovo TB-X616")) {
                return false;
            }
        }
        return true;
    }

    public static boolean D(String str, int i9) {
        if ("video/hevc".equals(str) && 2 == i9) {
            String str2 = k0.f39778b;
            if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean E(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(k0.f39778b)) ? false : true;
    }

    public static t F(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        return new t(str, str2, str3, codecCapabilities, z9, z10, z11, (z12 || codecCapabilities == null || !i(codecCapabilities) || B(str)) ? false : true, codecCapabilities != null && u(codecCapabilities), z13 || (codecCapabilities != null && s(codecCapabilities)));
    }

    public static int b(String str, String str2, int i9) {
        if (i9 > 1 || ((k0.f39777a >= 26 && i9 > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i9;
        }
        int i10 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
        AbstractC1681B.j("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i9 + " to " + i10 + "]");
        return i10;
    }

    public static Point d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i9, int i10) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(k0.l(i9, widthAlignment) * widthAlignment, k0.l(i10, heightAlignment) * heightAlignment);
    }

    public static boolean e(MediaCodecInfo.VideoCapabilities videoCapabilities, int i9, int i10, double d9) {
        Point pointD = d(videoCapabilities, i9, i10);
        int i11 = pointD.x;
        int i12 = pointD.y;
        return (d9 == -1.0d || d9 < 1.0d) ? videoCapabilities.isSizeSupported(i11, i12) : videoCapabilities.areSizeAndRateSupported(i11, i12, Math.floor(d9));
    }

    public static MediaCodecInfo.CodecProfileLevel[] g(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int iIntValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
        int i9 = iIntValue >= 180000000 ? 1024 : iIntValue >= 120000000 ? IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED : iIntValue >= 60000000 ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : iIntValue >= 30000000 ? 128 : iIntValue >= 18000000 ? 64 : iIntValue >= 12000000 ? 32 : iIntValue >= 7200000 ? 16 : iIntValue >= 3600000 ? 8 : iIntValue >= 1800000 ? 4 : iIntValue >= 800000 ? 2 : 1;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i9;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    public static boolean i(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return k0.f39777a >= 19 && j(codecCapabilities);
    }

    public static boolean j(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    public static boolean s(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return k0.f39777a >= 21 && t(codecCapabilities);
    }

    public static boolean t(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    public static boolean u(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return k0.f39777a >= 21 && v(codecCapabilities);
    }

    public static boolean v(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    public static boolean z(String str) {
        return "audio/opus".equals(str);
    }

    public Point c(int i9, int i10) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f46302d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return d(videoCapabilities, i9, i10);
    }

    public U2.h f(C0936z0 c0936z0, C0936z0 c0936z02) {
        int i9 = !k0.c(c0936z0.f6467m, c0936z02.f6467m) ? 8 : 0;
        if (this.f46309k) {
            if (c0936z0.f6475u != c0936z02.f6475u) {
                i9 |= 1024;
            }
            if (!this.f46303e && (c0936z0.f6472r != c0936z02.f6472r || c0936z0.f6473s != c0936z02.f6473s)) {
                i9 |= IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
            }
            if (!k0.c(c0936z0.f6479y, c0936z02.f6479y)) {
                i9 |= 2048;
            }
            if (A(this.f46299a) && !c0936z0.g(c0936z02)) {
                i9 |= 2;
            }
            if (i9 == 0) {
                return new U2.h(this.f46299a, c0936z0, c0936z02, c0936z0.g(c0936z02) ? 3 : 2, 0);
            }
        } else {
            if (c0936z0.f6480z != c0936z02.f6480z) {
                i9 |= 4096;
            }
            if (c0936z0.f6447A != c0936z02.f6447A) {
                i9 |= Segment.SIZE;
            }
            if (c0936z0.f6448B != c0936z02.f6448B) {
                i9 |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
            if (i9 == 0 && "audio/mp4a-latm".equals(this.f46300b)) {
                Pair pairR = AbstractC2392B.r(c0936z0);
                Pair pairR2 = AbstractC2392B.r(c0936z02);
                if (pairR != null && pairR2 != null) {
                    int iIntValue = ((Integer) pairR.first).intValue();
                    int iIntValue2 = ((Integer) pairR2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new U2.h(this.f46299a, c0936z0, c0936z02, 3, 0);
                    }
                }
            }
            if (!c0936z0.g(c0936z02)) {
                i9 |= 32;
            }
            if (z(this.f46300b)) {
                i9 |= 2;
            }
            if (i9 == 0) {
                return new U2.h(this.f46299a, c0936z0, c0936z02, 1, 0);
            }
        }
        return new U2.h(this.f46299a, c0936z0, c0936z02, 0, i9);
    }

    public MediaCodecInfo.CodecProfileLevel[] h() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f46302d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean k(int i9) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f46302d;
        if (codecCapabilities == null) {
            str = "channelCount.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                str = "channelCount.aCaps";
            } else {
                if (b(this.f46299a, this.f46300b, audioCapabilities.getMaxInputChannelCount()) >= i9) {
                    return true;
                }
                str = "channelCount.support, " + i9;
            }
        }
        y(str);
        return false;
    }

    public boolean l(int i9) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f46302d;
        if (codecCapabilities == null) {
            str = "sampleRate.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                str = "sampleRate.aCaps";
            } else {
                if (audioCapabilities.isSampleRateSupported(i9)) {
                    return true;
                }
                str = "sampleRate.support, " + i9;
            }
        }
        y(str);
        return false;
    }

    public final boolean m(C0936z0 c0936z0, boolean z9) {
        Pair pairR = AbstractC2392B.r(c0936z0);
        if (pairR == null) {
            return true;
        }
        int iIntValue = ((Integer) pairR.first).intValue();
        int iIntValue2 = ((Integer) pairR.second).intValue();
        if ("video/dolby-vision".equals(c0936z0.f6467m)) {
            if (!"video/avc".equals(this.f46300b)) {
                iIntValue = "video/hevc".equals(this.f46300b) ? 2 : 8;
            }
            iIntValue2 = 0;
        }
        if (!this.f46309k && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrH = h();
        if (k0.f39777a <= 23 && "video/x-vnd.on2.vp9".equals(this.f46300b) && codecProfileLevelArrH.length == 0) {
            codecProfileLevelArrH = g(this.f46302d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArrH) {
            if (codecProfileLevel.profile == iIntValue && ((codecProfileLevel.level >= iIntValue2 || !z9) && !D(this.f46300b, iIntValue))) {
                return true;
            }
        }
        y("codec.profileLevel, " + c0936z0.f6464j + ", " + this.f46301c);
        return false;
    }

    public boolean n(C0936z0 c0936z0) {
        return q(c0936z0) && m(c0936z0, false);
    }

    public boolean o(C0936z0 c0936z0) {
        int i9;
        if (!q(c0936z0) || !m(c0936z0, true)) {
            return false;
        }
        if (!this.f46309k) {
            if (k0.f39777a >= 21) {
                int i10 = c0936z0.f6447A;
                if (i10 != -1 && !l(i10)) {
                    return false;
                }
                int i11 = c0936z0.f6480z;
                if (i11 != -1 && !k(i11)) {
                    return false;
                }
            }
            return true;
        }
        int i12 = c0936z0.f6472r;
        if (i12 <= 0 || (i9 = c0936z0.f6473s) <= 0) {
            return true;
        }
        if (k0.f39777a >= 21) {
            return w(i12, i9, c0936z0.f6474t);
        }
        boolean z9 = i12 * i9 <= AbstractC2392B.P();
        if (!z9) {
            y("legacyFrameSize, " + c0936z0.f6472r + "x" + c0936z0.f6473s);
        }
        return z9;
    }

    public boolean p() {
        if (k0.f39777a >= 29 && "video/x-vnd.on2.vp9".equals(this.f46300b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : h()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean q(C0936z0 c0936z0) {
        return this.f46300b.equals(c0936z0.f6467m) || this.f46300b.equals(AbstractC2392B.m(c0936z0));
    }

    public boolean r(C0936z0 c0936z0) {
        if (this.f46309k) {
            return this.f46303e;
        }
        Pair pairR = AbstractC2392B.r(c0936z0);
        return pairR != null && ((Integer) pairR.first).intValue() == 42;
    }

    public String toString() {
        return this.f46299a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean w(int r8, int r9, double r10) {
        /*
            r7 = this;
            android.media.MediaCodecInfo$CodecCapabilities r0 = r7.f46302d
            r1 = 0
            if (r0 != 0) goto Lb
            java.lang.String r8 = "sizeAndRate.caps"
        L7:
            r7.y(r8)
            return r1
        Lb:
            android.media.MediaCodecInfo$VideoCapabilities r0 = r0.getVideoCapabilities()
            if (r0 != 0) goto L14
            java.lang.String r8 = "sizeAndRate.vCaps"
            goto L7
        L14:
            int r2 = d4.k0.f39777a
            r3 = 29
            java.lang.String r4 = "@"
            java.lang.String r5 = "x"
            r6 = 1
            if (r2 < r3) goto L47
            int r2 = p3.t.a.a(r0, r8, r9, r10)
            r3 = 2
            if (r2 != r3) goto L27
            return r6
        L27:
            if (r2 != r6) goto L47
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "sizeAndRate.cover, "
        L30:
            r0.append(r2)
            r0.append(r8)
            r0.append(r5)
            r0.append(r9)
            r0.append(r4)
            r0.append(r10)
            java.lang.String r8 = r0.toString()
            goto L7
        L47:
            boolean r2 = e(r0, r8, r9, r10)
            if (r2 != 0) goto L87
            if (r8 >= r9) goto L7f
            java.lang.String r2 = r7.f46299a
            boolean r2 = E(r2)
            if (r2 == 0) goto L7f
            boolean r0 = e(r0, r9, r8, r10)
            if (r0 != 0) goto L5e
            goto L7f
        L5e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "sizeAndRate.rotated, "
            r0.append(r1)
            r0.append(r8)
            r0.append(r5)
            r0.append(r9)
            r0.append(r4)
            r0.append(r10)
            java.lang.String r8 = r0.toString()
            r7.x(r8)
            goto L87
        L7f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "sizeAndRate.support, "
            goto L30
        L87:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.t.w(int, int, double):boolean");
    }

    public final void x(String str) {
        AbstractC1681B.b("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f46299a + ", " + this.f46300b + "] [" + k0.f39781e + "]");
    }

    public final void y(String str) {
        AbstractC1681B.b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f46299a + ", " + this.f46300b + "] [" + k0.f39781e + "]");
    }
}
