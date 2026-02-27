package p3;

import O2.C0936z0;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import d4.AbstractC1681B;
import d4.F;
import d4.k0;
import e4.C1740c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.ws.WebSocketProtocol;
import okio.Segment;
import org.apache.http.util.LangUtils;
import org.chromium.net.UrlRequest;
import r5.AbstractC2673b;
import s5.AbstractC2743y;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: renamed from: p3.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2392B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f46223a = Pattern.compile("^\\D?(\\d+)$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f46224b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f46225c = -1;

    /* JADX INFO: renamed from: p3.B$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f46227b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f46228c;

        public b(String str, boolean z9, boolean z10) {
            this.f46226a = str;
            this.f46227b = z9;
            this.f46228c = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != b.class) {
                return false;
            }
            b bVar = (b) obj;
            return TextUtils.equals(this.f46226a, bVar.f46226a) && this.f46227b == bVar.f46227b && this.f46228c == bVar.f46228c;
        }

        public int hashCode() {
            return ((((this.f46226a.hashCode() + 31) * 31) + (this.f46227b ? 1231 : 1237)) * 31) + (this.f46228c ? 1231 : 1237);
        }
    }

    /* JADX INFO: renamed from: p3.B$c */
    public static class c extends Exception {
        public c(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* JADX INFO: renamed from: p3.B$d */
    public interface d {
        MediaCodecInfo a(int i9);

        boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int d();

        boolean e();
    }

    /* JADX INFO: renamed from: p3.B$e */
    public static final class e implements d {
        public e() {
        }

        @Override // p3.AbstractC2392B.d
        public MediaCodecInfo a(int i9) {
            return MediaCodecList.getCodecInfoAt(i9);
        }

        @Override // p3.AbstractC2392B.d
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // p3.AbstractC2392B.d
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // p3.AbstractC2392B.d
        public int d() {
            return MediaCodecList.getCodecCount();
        }

        @Override // p3.AbstractC2392B.d
        public boolean e() {
            return false;
        }
    }

    /* JADX INFO: renamed from: p3.B$f */
    public static final class f implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f46229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public MediaCodecInfo[] f46230b;

        public f(boolean z9, boolean z10) {
            this.f46229a = (z9 || z10) ? 1 : 0;
        }

        @Override // p3.AbstractC2392B.d
        public MediaCodecInfo a(int i9) {
            f();
            return this.f46230b[i9];
        }

        @Override // p3.AbstractC2392B.d
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // p3.AbstractC2392B.d
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // p3.AbstractC2392B.d
        public int d() {
            f();
            return this.f46230b.length;
        }

        @Override // p3.AbstractC2392B.d
        public boolean e() {
            return true;
        }

        public final void f() {
            if (this.f46230b == null) {
                this.f46230b = new MediaCodecList(this.f46229a).getCodecInfos();
            }
        }
    }

    /* JADX INFO: renamed from: p3.B$g */
    public interface g {
        int a(Object obj);
    }

    public static Pair A(String str, String[] strArr) {
        StringBuilder sb;
        int i9;
        int i10;
        int iT;
        String string;
        if (strArr.length >= 3) {
            try {
                i9 = Integer.parseInt(strArr[1]);
                i10 = Integer.parseInt(strArr[2]);
                iT = T(i9);
            } catch (NumberFormatException unused) {
                sb = new StringBuilder();
                sb.append("Ignoring malformed VP9 codec string: ");
                sb.append(str);
            }
            if (iT == -1) {
                string = "Unknown VP9 profile: " + i9;
                AbstractC1681B.j("MediaCodecUtil", string);
                return null;
            }
            int iS = S(i10);
            if (iS != -1) {
                return new Pair(Integer.valueOf(iT), Integer.valueOf(iS));
            }
            sb = new StringBuilder();
            sb.append("Unknown VP9 level: ");
            sb.append(i10);
            string = sb.toString();
            AbstractC1681B.j("MediaCodecUtil", string);
            return null;
        }
        sb = new StringBuilder();
        sb.append("Ignoring malformed VP9 codec string: ");
        sb.append(str);
        string = sb.toString();
        AbstractC1681B.j("MediaCodecUtil", string);
        return null;
    }

    public static Integer B(String str) {
        int i9;
        if (str == null) {
            return null;
        }
        switch (str) {
            case "H30":
                return 2;
            case "H60":
                return 8;
            case "H63":
                i9 = 32;
                break;
            case "H90":
                i9 = 128;
                break;
            case "H93":
                i9 = IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
                break;
            case "L30":
                return 1;
            case "L60":
                return 4;
            case "L63":
                return 16;
            case "L90":
                i9 = 64;
                break;
            case "L93":
                i9 = JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
                break;
            case "H120":
                i9 = 2048;
                break;
            case "H123":
                i9 = Segment.SIZE;
                break;
            case "H150":
                i9 = 32768;
                break;
            case "H153":
                i9 = 131072;
                break;
            case "H156":
                i9 = 524288;
                break;
            case "H180":
                i9 = 2097152;
                break;
            case "H183":
                i9 = 8388608;
                break;
            case "H186":
                i9 = 33554432;
                break;
            case "L120":
                i9 = 1024;
                break;
            case "L123":
                i9 = 4096;
                break;
            case "L150":
                i9 = Http2.INITIAL_MAX_FRAME_SIZE;
                break;
            case "L153":
                i9 = 65536;
                break;
            case "L156":
                i9 = 262144;
                break;
            case "L180":
                i9 = Constants.MB;
                break;
            case "L183":
                i9 = 4194304;
                break;
            case "L186":
                i9 = Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i9);
    }

    public static boolean C(MediaCodecInfo mediaCodecInfo) {
        return k0.f39777a >= 29 && D(mediaCodecInfo);
    }

    public static boolean D(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    public static boolean E(MediaCodecInfo mediaCodecInfo, String str, boolean z9, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z9 && str.endsWith(".secure"))) {
            return false;
        }
        int i9 = k0.f39777a;
        if (i9 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i9 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = k0.f39778b;
            if ("a70".equals(str3) || ("Xiaomi".equals(k0.f39779c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i9 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = k0.f39778b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i9 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = k0.f39778b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i9 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(k0.f39779c))) {
            String str6 = k0.f39778b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i9 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(k0.f39779c)) {
            String str7 = k0.f39778b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i9 <= 19 && k0.f39778b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (i9 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean F(MediaCodecInfo mediaCodecInfo, String str) {
        return k0.f39777a >= 29 ? G(mediaCodecInfo) : !H(mediaCodecInfo, str);
    }

    public static boolean G(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    public static boolean H(MediaCodecInfo mediaCodecInfo, String str) {
        if (k0.f39777a >= 29) {
            return I(mediaCodecInfo);
        }
        if (F.o(str)) {
            return true;
        }
        String strE = AbstractC2673b.e(mediaCodecInfo.getName());
        if (strE.startsWith("arc.")) {
            return false;
        }
        if (strE.startsWith("omx.google.") || strE.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strE.startsWith("omx.sec.") && strE.contains(".sw.")) || strE.equals("omx.qcom.video.decoder.hevcswvdec") || strE.startsWith("c2.android.") || strE.startsWith("c2.google.")) {
            return true;
        }
        return (strE.startsWith("omx.") || strE.startsWith("c2.")) ? false : true;
    }

    public static boolean I(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    public static boolean J(MediaCodecInfo mediaCodecInfo) {
        if (k0.f39777a >= 29) {
            return K(mediaCodecInfo);
        }
        String strE = AbstractC2673b.e(mediaCodecInfo.getName());
        return (strE.startsWith("omx.google.") || strE.startsWith("c2.android.") || strE.startsWith("c2.google.")) ? false : true;
    }

    public static boolean K(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    public static /* synthetic */ int L(t tVar) {
        String str = tVar.f46299a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (k0.f39777a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    public static /* synthetic */ int M(t tVar) {
        return tVar.f46299a.startsWith("OMX.google") ? 1 : 0;
    }

    public static /* synthetic */ int N(C0936z0 c0936z0, t tVar) {
        return tVar.n(c0936z0) ? 1 : 0;
    }

    public static /* synthetic */ int O(g gVar, Object obj, Object obj2) {
        return gVar.a(obj2) - gVar.a(obj);
    }

    public static int P() {
        if (f46225c == -1) {
            int iMax = 0;
            t tVarS = s("video/avc", false, false);
            if (tVarS != null) {
                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrH = tVarS.h();
                int length = codecProfileLevelArrH.length;
                int iMax2 = 0;
                while (iMax < length) {
                    iMax2 = Math.max(h(codecProfileLevelArrH[iMax].level), iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, k0.f39777a >= 21 ? 345600 : 172800);
            }
            f46225c = iMax;
        }
        return f46225c;
    }

    public static int Q(int i9) {
        int i10 = 17;
        if (i9 != 17) {
            i10 = 20;
            if (i9 != 20) {
                i10 = 23;
                if (i9 != 23) {
                    i10 = 29;
                    if (i9 != 29) {
                        i10 = 39;
                        if (i9 != 39) {
                            i10 = 42;
                            if (i9 != 42) {
                                switch (i9) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i10;
    }

    public static void R(List list, final g gVar) {
        Collections.sort(list, new Comparator() { // from class: p3.A
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC2392B.O(gVar, obj, obj2);
            }
        });
    }

    public static int S(int i9) {
        if (i9 == 10) {
            return 1;
        }
        if (i9 == 11) {
            return 2;
        }
        if (i9 == 20) {
            return 4;
        }
        if (i9 == 21) {
            return 8;
        }
        if (i9 == 30) {
            return 16;
        }
        if (i9 == 31) {
            return 32;
        }
        if (i9 == 40) {
            return 64;
        }
        if (i9 == 41) {
            return 128;
        }
        if (i9 == 50) {
            return JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
        }
        if (i9 == 51) {
            return IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
        }
        switch (i9) {
            case 60:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return Segment.SIZE;
            default:
                return -1;
        }
    }

    public static int T(int i9) {
        if (i9 == 0) {
            return 1;
        }
        if (i9 == 1) {
            return 2;
        }
        if (i9 != 2) {
            return i9 != 3 ? -1 : 8;
        }
        return 4;
    }

    public static void e(String str, List list) {
        if ("audio/raw".equals(str)) {
            if (k0.f39777a < 26 && k0.f39778b.equals("R9") && list.size() == 1 && ((t) list.get(0)).f46299a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(t.F("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            R(list, new g() { // from class: p3.x
                @Override // p3.AbstractC2392B.g
                public final int a(Object obj) {
                    return AbstractC2392B.L((t) obj);
                }
            });
        }
        int i9 = k0.f39777a;
        if (i9 < 21 && list.size() > 1) {
            String str2 = ((t) list.get(0)).f46299a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                R(list, new g() { // from class: p3.y
                    @Override // p3.AbstractC2392B.g
                    public final int a(Object obj) {
                        return AbstractC2392B.M((t) obj);
                    }
                });
            }
        }
        if (i9 >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((t) list.get(0)).f46299a)) {
            return;
        }
        list.add((t) list.remove(0));
    }

    public static int f(int i9) {
        switch (i9) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
            case 9:
                return IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return Segment.SIZE;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return Http2.INITIAL_MAX_FRAME_SIZE;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                return 32768;
            case 16:
                return 65536;
            case LangUtils.HASH_SEED /* 17 */:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return Constants.MB;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    public static int g(int i9) {
        switch (i9) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i9) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i9) {
                            case 30:
                                return JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
                            case 31:
                                return IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
                            case 32:
                                return 1024;
                            default:
                                switch (i9) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return Segment.SIZE;
                                    default:
                                        switch (i9) {
                                            case 50:
                                                return Http2.INITIAL_MAX_FRAME_SIZE;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    public static int h(int i9) {
        if (i9 == 1 || i9 == 2) {
            return 25344;
        }
        switch (i9) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case JceEncryptionConstants.SYMMETRIC_KEY_LENGTH /* 256 */:
                return 414720;
            case IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED /* 512 */:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case Segment.SIZE /* 8192 */:
                return 2228224;
            case Http2.INITIAL_MAX_FRAME_SIZE /* 16384 */:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            case 131072:
            case 262144:
            case 524288:
                return 35651584;
            default:
                return -1;
        }
    }

    public static int i(int i9) {
        if (i9 == 66) {
            return 1;
        }
        if (i9 == 77) {
            return 2;
        }
        if (i9 == 88) {
            return 4;
        }
        if (i9 == 100) {
            return 8;
        }
        if (i9 == 110) {
            return 16;
        }
        if (i9 != 122) {
            return i9 != 244 ? -1 : 64;
        }
        return 32;
    }

    public static Integer j(String str) {
        int i9;
        if (str == null) {
            return null;
        }
        switch (str) {
            case "01":
                return 1;
            case "02":
                return 2;
            case "03":
                return 4;
            case "04":
                return 8;
            case "05":
                i9 = 16;
                break;
            case "06":
                i9 = 32;
                break;
            case "07":
                i9 = 64;
                break;
            case "08":
                i9 = 128;
                break;
            case "09":
                i9 = JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
                break;
            case "10":
                i9 = IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
                break;
            case "11":
                i9 = 1024;
                break;
            case "12":
                i9 = 2048;
                break;
            case "13":
                i9 = 4096;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i9);
    }

    public static Integer k(String str) {
        int i9;
        if (str == null) {
            return null;
        }
        switch (str) {
            case "00":
                return 1;
            case "01":
                return 2;
            case "02":
                return 4;
            case "03":
                return 8;
            case "04":
                i9 = 16;
                break;
            case "05":
                i9 = 32;
                break;
            case "06":
                i9 = 64;
                break;
            case "07":
                i9 = 128;
                break;
            case "08":
                i9 = JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
                break;
            case "09":
                i9 = IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i9);
    }

    public static Pair l(String str, String[] strArr) {
        int iQ;
        if (strArr.length != 3) {
            AbstractC1681B.j("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(F.h(Integer.parseInt(strArr[1], 16))) && (iQ = Q(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair(Integer.valueOf(iQ), 0);
            }
        } catch (NumberFormatException unused) {
            AbstractC1681B.j("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    public static String m(C0936z0 c0936z0) {
        Pair pairR;
        if ("audio/eac3-joc".equals(c0936z0.f6467m)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(c0936z0.f6467m) || (pairR = r(c0936z0)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairR.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static List n(w wVar, C0936z0 c0936z0, boolean z9, boolean z10) {
        String strM = m(c0936z0);
        return strM == null ? AbstractC2743y.z() : wVar.a(strM, z9, z10);
    }

    public static Pair o(String str, String[] strArr, C1740c c1740c) {
        StringBuilder sb;
        int i9;
        int i10;
        int i11;
        StringBuilder sb2;
        int i12;
        String string;
        if (strArr.length >= 4) {
            try {
                i9 = Integer.parseInt(strArr[1]);
                i10 = Integer.parseInt(strArr[2].substring(0, 2));
                i11 = Integer.parseInt(strArr[3]);
            } catch (NumberFormatException unused) {
                sb = new StringBuilder();
                sb.append("Ignoring malformed AV1 codec string: ");
                sb.append(str);
            }
            if (i9 != 0) {
                sb2 = new StringBuilder();
                sb2.append("Unknown AV1 profile: ");
                sb2.append(i9);
            } else {
                if (i11 != 8 && i11 != 10) {
                    sb = new StringBuilder();
                    sb.append("Unknown AV1 bit depth: ");
                    sb.append(i11);
                    string = sb.toString();
                    AbstractC1681B.j("MediaCodecUtil", string);
                    return null;
                }
                int i13 = i11 != 8 ? (c1740c == null || !(c1740c.f40201e != null || (i12 = c1740c.f40200d) == 7 || i12 == 6)) ? 2 : 4096 : 1;
                int iF = f(i10);
                if (iF != -1) {
                    return new Pair(Integer.valueOf(i13), Integer.valueOf(iF));
                }
                sb2 = new StringBuilder();
                sb2.append("Unknown AV1 level: ");
                sb2.append(i10);
            }
            string = sb2.toString();
            AbstractC1681B.j("MediaCodecUtil", string);
            return null;
        }
        sb = new StringBuilder();
        sb.append("Ignoring malformed AV1 codec string: ");
        sb.append(str);
        string = sb.toString();
        AbstractC1681B.j("MediaCodecUtil", string);
        return null;
    }

    public static Pair p(String str, String[] strArr) {
        StringBuilder sb;
        int i9;
        int i10;
        int i11;
        String string;
        if (strArr.length >= 2) {
            try {
                if (strArr[1].length() == 6) {
                    i10 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                    i9 = Integer.parseInt(strArr[1].substring(4), 16);
                } else {
                    if (strArr.length < 3) {
                        AbstractC1681B.j("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                        return null;
                    }
                    int i12 = Integer.parseInt(strArr[1]);
                    i9 = Integer.parseInt(strArr[2]);
                    i10 = i12;
                }
                i11 = i(i10);
            } catch (NumberFormatException unused) {
                sb = new StringBuilder();
                sb.append("Ignoring malformed AVC codec string: ");
                sb.append(str);
            }
            if (i11 == -1) {
                string = "Unknown AVC profile: " + i10;
                AbstractC1681B.j("MediaCodecUtil", string);
                return null;
            }
            int iG = g(i9);
            if (iG != -1) {
                return new Pair(Integer.valueOf(i11), Integer.valueOf(iG));
            }
            sb = new StringBuilder();
            sb.append("Unknown AVC level: ");
            sb.append(i9);
            string = sb.toString();
            AbstractC1681B.j("MediaCodecUtil", string);
            return null;
        }
        sb = new StringBuilder();
        sb.append("Ignoring malformed AVC codec string: ");
        sb.append(str);
        string = sb.toString();
        AbstractC1681B.j("MediaCodecUtil", string);
        return null;
    }

    public static String q(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair r(O2.C0936z0 r6) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.AbstractC2392B.r(O2.z0):android.util.Pair");
    }

    public static t s(String str, boolean z9, boolean z10) {
        List listT = t(str, z9, z10);
        if (listT.isEmpty()) {
            return null;
        }
        return (t) listT.get(0);
    }

    public static synchronized List t(String str, boolean z9, boolean z10) {
        try {
            b bVar = new b(str, z9, z10);
            HashMap map = f46224b;
            List list = (List) map.get(bVar);
            if (list != null) {
                return list;
            }
            int i9 = k0.f39777a;
            ArrayList arrayListU = u(bVar, i9 >= 21 ? new f(z9, z10) : new e());
            if (z9 && arrayListU.isEmpty() && 21 <= i9 && i9 <= 23) {
                arrayListU = u(bVar, new e());
                if (!arrayListU.isEmpty()) {
                    AbstractC1681B.j("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((t) arrayListU.get(0)).f46299a);
                }
            }
            e(str, arrayListU);
            AbstractC2743y abstractC2743yR = AbstractC2743y.r(arrayListU);
            map.put(bVar, abstractC2743yR);
            return abstractC2743yR;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0105 A[Catch: Exception -> 0x012e, TRY_ENTER, TryCatch #1 {Exception -> 0x012e, blocks: (B:3:0x0008, B:5:0x001b, B:61:0x0124, B:8:0x002d, B:11:0x0038, B:55:0x00fd, B:58:0x0105, B:60:0x010b, B:64:0x0130, B:65:0x0153), top: B:71:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0130 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList u(p3.AbstractC2392B.b r24, p3.AbstractC2392B.d r25) throws p3.AbstractC2392B.c {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.AbstractC2392B.u(p3.B$b, p3.B$d):java.util.ArrayList");
    }

    public static List v(w wVar, C0936z0 c0936z0, boolean z9, boolean z10) {
        List listA = wVar.a(c0936z0.f6467m, z9, z10);
        return AbstractC2743y.p().j(listA).j(n(wVar, c0936z0, z9, z10)).k();
    }

    public static List w(List list, final C0936z0 c0936z0) {
        ArrayList arrayList = new ArrayList(list);
        R(arrayList, new g() { // from class: p3.z
            @Override // p3.AbstractC2392B.g
            public final int a(Object obj) {
                return AbstractC2392B.N(c0936z0, (t) obj);
            }
        });
        return arrayList;
    }

    public static t x() {
        return s("audio/raw", false, false);
    }

    public static Pair y(String str, String[] strArr) {
        StringBuilder sb;
        String str2;
        if (strArr.length < 3) {
            sb = new StringBuilder();
        } else {
            Matcher matcher = f46223a.matcher(strArr[1]);
            if (matcher.matches()) {
                str = matcher.group(1);
                Integer numK = k(str);
                if (numK == null) {
                    sb = new StringBuilder();
                    str2 = "Unknown Dolby Vision profile string: ";
                } else {
                    str = strArr[2];
                    Integer numJ = j(str);
                    if (numJ != null) {
                        return new Pair(numK, numJ);
                    }
                    sb = new StringBuilder();
                    str2 = "Unknown Dolby Vision level string: ";
                }
                sb.append(str2);
                sb.append(str);
                AbstractC1681B.j("MediaCodecUtil", sb.toString());
                return null;
            }
            sb = new StringBuilder();
        }
        sb.append("Ignoring malformed Dolby Vision codec string: ");
        sb.append(str);
        AbstractC1681B.j("MediaCodecUtil", sb.toString());
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair z(java.lang.String r6, java.lang.String[] r7, e4.C1740c r8) {
        /*
            int r0 = r7.length
            r1 = 4
            java.lang.String r2 = "Ignoring malformed HEVC codec string: "
            r3 = 0
            java.lang.String r4 = "MediaCodecUtil"
            if (r0 >= r1) goto L1c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
        Le:
            r7.append(r2)
        L11:
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            d4.AbstractC1681B.j(r4, r6)
            return r3
        L1c:
            java.util.regex.Pattern r0 = p3.AbstractC2392B.f46223a
            r1 = 1
            r5 = r7[r1]
            java.util.regex.Matcher r0 = r0.matcher(r5)
            boolean r5 = r0.matches()
            if (r5 != 0) goto L31
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            goto Le
        L31:
            java.lang.String r6 = r0.group(r1)
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L3e
            goto L51
        L3e:
            java.lang.String r0 = "2"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L6f
            if (r8 == 0) goto L50
            int r6 = r8.f40200d
            r8 = 6
            if (r6 != r8) goto L50
            r1 = 4096(0x1000, float:5.74E-42)
            goto L51
        L50:
            r1 = 2
        L51:
            r6 = 3
            r6 = r7[r6]
            java.lang.Integer r7 = B(r6)
            if (r7 != 0) goto L65
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Unknown HEVC level string: "
        L61:
            r7.append(r8)
            goto L11
        L65:
            android.util.Pair r6 = new android.util.Pair
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            r6.<init>(r8, r7)
            return r6
        L6f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Unknown HEVC profile string: "
            goto L61
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.AbstractC2392B.z(java.lang.String, java.lang.String[], e4.c):android.util.Pair");
    }
}
