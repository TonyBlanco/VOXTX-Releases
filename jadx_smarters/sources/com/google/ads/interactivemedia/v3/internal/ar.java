package com.google.ads.interactivemedia.v3.internal;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.HttpStatus;

/* JADX INFO: loaded from: classes3.dex */
public final class ar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ArrayList f20559a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f20560b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(java.lang.String r6, java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.ar.a(java.lang.String, java.lang.String):int");
    }

    public static int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m(str)) {
            return 1;
        }
        if (q(str)) {
            return 2;
        }
        if (p(str)) {
            return 3;
        }
        if (n(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        int size = f20559a.size();
        for (int i9 = 0; i9 < size; i9++) {
            String str2 = ((ap) f20559a.get(i9)).f20451a;
            if (str.equals(null)) {
                return 0;
            }
        }
        return -1;
    }

    public static int c(String str) {
        return b(g(str));
    }

    public static aq d(String str) {
        Matcher matcher = f20560b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        af.s(strGroup);
        String strGroup2 = matcher.group(2);
        try {
            return new aq(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : cq.am(str)) {
            String strG = g(str2);
            if (strG != null && m(strG)) {
                return strG;
            }
        }
        return null;
    }

    public static String f(String str, String str2) {
        if (str != null && str2 != null) {
            String[] strArrAm = cq.am(str);
            StringBuilder sb = new StringBuilder();
            for (String str3 : strArrAm) {
                if (str2.equals(g(str3))) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str3);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
        }
        return null;
    }

    public static String g(String str) {
        aq aqVarD;
        String strH = null;
        if (str == null) {
            return null;
        }
        String strD = com.google.ads.interactivemedia.v3.impl.data.k.d(str.trim());
        if (strD.startsWith("avc1") || strD.startsWith("avc3")) {
            return "video/avc";
        }
        if (strD.startsWith("hev1") || strD.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (strD.startsWith("dvav") || strD.startsWith("dva1") || strD.startsWith("dvhe") || strD.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (strD.startsWith("av01")) {
            return "video/av01";
        }
        if (strD.startsWith("vp9") || strD.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (strD.startsWith("vp8") || strD.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (strD.startsWith("mp4a")) {
            if (strD.startsWith("mp4a.") && (aqVarD = d(strD)) != null) {
                strH = h(aqVarD.f20502a);
            }
            return strH == null ? "audio/mp4a-latm" : strH;
        }
        if (strD.startsWith("mha1")) {
            return "audio/mha1";
        }
        if (strD.startsWith("mhm1")) {
            return "audio/mhm1";
        }
        if (strD.startsWith("ac-3") || strD.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (strD.startsWith("ec-3") || strD.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (strD.startsWith("ec+3")) {
            return "audio/eac3-joc";
        }
        if (strD.startsWith("ac-4") || strD.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (strD.startsWith("dtsc")) {
            return "audio/vnd.dts";
        }
        if (strD.startsWith("dtse")) {
            return "audio/vnd.dts.hd;profile=lbr";
        }
        if (strD.startsWith("dtsh") || strD.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (strD.startsWith("dtsx")) {
            return "audio/vnd.dts.uhd;profile=p2";
        }
        if (strD.startsWith("opus")) {
            return "audio/opus";
        }
        if (strD.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        if (strD.startsWith("flac")) {
            return "audio/flac";
        }
        if (strD.startsWith("stpp")) {
            return "application/ttml+xml";
        }
        if (strD.startsWith("wvtt")) {
            return "text/vtt";
        }
        if (strD.contains("cea708")) {
            return "application/cea-708";
        }
        if (strD.contains("eia608") || strD.contains("cea608")) {
            return "application/cea-608";
        }
        int size = f20559a.size();
        for (int i9 = 0; i9 < size; i9++) {
            String str2 = ((ap) f20559a.get(i9)).f20452b;
            if (strD.startsWith(null)) {
                break;
            }
        }
        return null;
    }

    public static String h(int i9) {
        if (i9 == 32) {
            return "video/mp4v-es";
        }
        if (i9 == 33) {
            return "video/avc";
        }
        if (i9 == 35) {
            return "video/hevc";
        }
        if (i9 == 64) {
            return "audio/mp4a-latm";
        }
        if (i9 == 163) {
            return "video/wvc1";
        }
        if (i9 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i9 == 165) {
            return "audio/ac3";
        }
        if (i9 == 166) {
            return "audio/eac3";
        }
        switch (i9) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case HttpStatus.SC_PROCESSING /* 102 */:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i9) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static String i(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : cq.am(str)) {
            String strG = g(str2);
            if (strG != null && q(strG)) {
                return strG;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String j(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -1007807498(0xffffffffc3ee13f6, float:-476.15594)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L2a
            r1 = -586683234(0xffffffffdd07ec9e, float:-6.1214856E17)
            if (r0 == r1) goto L20
            r1 = 187090231(0xb26c537, float:3.2118805E-32)
            if (r0 == r1) goto L16
            goto L34
        L16:
            java.lang.String r0 = "audio/mp3"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L34
            r0 = 1
            goto L35
        L20:
            java.lang.String r0 = "audio/x-wav"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L34
            r0 = 2
            goto L35
        L2a:
            java.lang.String r0 = "audio/x-flac"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L34
            r0 = 0
            goto L35
        L34:
            r0 = -1
        L35:
            if (r0 == 0) goto L42
            if (r0 == r3) goto L3f
            if (r0 == r2) goto L3c
            return r4
        L3c:
            java.lang.String r4 = "audio/wav"
            return r4
        L3f:
            java.lang.String r4 = "audio/mpeg"
            return r4
        L42:
            java.lang.String r4 = "audio/flac"
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.ar.j(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean k(java.lang.String r3, java.lang.String r4) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.ar.k(java.lang.String, java.lang.String):boolean");
    }

    public static boolean l(String str, String str2) {
        return f(str, str2) != null;
    }

    public static boolean m(String str) {
        return "audio".equals(r(str));
    }

    public static boolean n(String str) {
        return "image".equals(r(str));
    }

    public static boolean o(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska");
    }

    public static boolean p(String str) {
        return "text".equals(r(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean q(String str) {
        return "video".equals(r(str));
    }

    private static String r(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }
}
