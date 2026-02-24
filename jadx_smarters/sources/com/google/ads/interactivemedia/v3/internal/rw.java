package com.google.ads.interactivemedia.v3.internal;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.internal.http2.Http2;
import okio.Segment;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"InlinedApi"})
public final class rw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f24441a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f24442b = Pattern.compile("^\\D?(\\d+)$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final HashMap f24443c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f24444d = -1;

    public static int a() throws rr {
        int i9;
        int iMax = f24444d;
        if (iMax == -1) {
            rh rhVarG = g("video/avc");
            if (rhVarG != null) {
                int iMax2 = 0;
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : rhVarG.f()) {
                    int i10 = codecProfileLevel.level;
                    if (i10 != 1 && i10 != 2) {
                        switch (i10) {
                            case 8:
                            case 16:
                            case 32:
                                i9 = 101376;
                                break;
                            case 64:
                                i9 = 202752;
                                break;
                            case 128:
                            case JceEncryptionConstants.SYMMETRIC_KEY_LENGTH /* 256 */:
                                i9 = 414720;
                                break;
                            case IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED /* 512 */:
                                i9 = 921600;
                                break;
                            case 1024:
                                i9 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i9 = 2097152;
                                break;
                            case Segment.SIZE /* 8192 */:
                                i9 = 2228224;
                                break;
                            case Http2.INITIAL_MAX_FRAME_SIZE /* 16384 */:
                                i9 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i9 = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i9 = 35651584;
                                break;
                            default:
                                i9 = -1;
                                break;
                        }
                    } else {
                        i9 = 25344;
                    }
                    iMax2 = Math.max(i9, iMax2);
                }
                iMax = Math.max(iMax2, cq.f22640a >= 21 ? 345600 : 172800);
            } else {
                iMax = 0;
            }
            f24444d = iMax;
        }
        return iMax;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02a6 A[Catch: NumberFormatException -> 0x023a, TRY_LEAVE, TryCatch #3 {NumberFormatException -> 0x023a, blocks: (B:149:0x024a, B:151:0x025c, B:162:0x0278, B:178:0x02a6), top: B:496:0x024a }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair b(com.google.ads.interactivemedia.v3.internal.C1333s r17) {
        /*
            Method dump skipped, instruction units count: 2336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.rw.b(com.google.ads.interactivemedia.v3.internal.s):android.util.Pair");
    }

    public static rh c() throws rr {
        return g("audio/raw");
    }

    public static String d(C1333s c1333s) {
        Pair pairB;
        if ("audio/eac3-joc".equals(c1333s.f24467l)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(c1333s.f24467l) || (pairB = b(c1333s)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairB.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static synchronized List e(String str, boolean z9, boolean z10) throws rr {
        try {
            rq rqVar = new rq(str, z9, z10);
            HashMap map = f24443c;
            List list = (List) map.get(rqVar);
            if (list != null) {
                return list;
            }
            int i9 = cq.f22640a;
            ArrayList arrayListH = h(rqVar, i9 >= 21 ? new ru(z9, z10) : new rt(null));
            if (z9 && arrayListH.isEmpty() && i9 >= 21 && i9 <= 23) {
                arrayListH = h(rqVar, new rt(null));
                if (!arrayListH.isEmpty()) {
                    cd.e("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((rh) arrayListH.get(0)).f24365a);
                }
            }
            if ("audio/raw".equals(str)) {
                if (i9 < 26 && cq.f22641b.equals("R9") && arrayListH.size() == 1 && ((rh) arrayListH.get(0)).f24365a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    arrayListH.add(rh.g("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
                }
                i(arrayListH, rp.f24434b);
            }
            if (i9 < 21 && arrayListH.size() > 1) {
                String str2 = ((rh) arrayListH.get(0)).f24365a;
                if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                    i(arrayListH, rp.f24433a);
                }
            }
            if (i9 < 32 && arrayListH.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((rh) arrayListH.get(0)).f24365a)) {
                arrayListH.add((rh) arrayListH.remove(0));
            }
            avo avoVarM = avo.m(arrayListH);
            map.put(rqVar, avoVarM);
            return avoVarM;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static List f(List list, final C1333s c1333s) {
        ArrayList arrayList = new ArrayList(list);
        i(arrayList, new rv() { // from class: com.google.ads.interactivemedia.v3.internal.rn
            @Override // com.google.ads.interactivemedia.v3.internal.rv
            public final int a(Object obj) {
                C1333s c1333s2 = c1333s;
                rh rhVar = (rh) obj;
                int i9 = rw.f24441a;
                try {
                    return !rhVar.c(c1333s2) ? 0 : 1;
                } catch (rr unused) {
                    return -1;
                }
            }
        });
        return arrayList;
    }

    public static rh g(String str) throws rr {
        List listE = e(str, false, false);
        if (listE.isEmpty()) {
            return null;
        }
        return (rh) listE.get(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02a7 A[Catch: Exception -> 0x02ac, TryCatch #2 {Exception -> 0x02ac, blocks: (B:164:0x0276, B:170:0x028d, B:176:0x02a1, B:178:0x02a7, B:185:0x02bd, B:187:0x02c5, B:197:0x02ef, B:200:0x02f5, B:188:0x02ca, B:190:0x02da, B:192:0x02e2, B:181:0x02b4), top: B:227:0x0276 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02b4 A[Catch: Exception -> 0x02ac, TryCatch #2 {Exception -> 0x02ac, blocks: (B:164:0x0276, B:170:0x028d, B:176:0x02a1, B:178:0x02a7, B:185:0x02bd, B:187:0x02c5, B:197:0x02ef, B:200:0x02f5, B:188:0x02ca, B:190:0x02da, B:192:0x02e2, B:181:0x02b4), top: B:227:0x0276 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02c5 A[Catch: Exception -> 0x02ac, TryCatch #2 {Exception -> 0x02ac, blocks: (B:164:0x0276, B:170:0x028d, B:176:0x02a1, B:178:0x02a7, B:185:0x02bd, B:187:0x02c5, B:197:0x02ef, B:200:0x02f5, B:188:0x02ca, B:190:0x02da, B:192:0x02e2, B:181:0x02b4), top: B:227:0x0276 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02ca A[Catch: Exception -> 0x02ac, TryCatch #2 {Exception -> 0x02ac, blocks: (B:164:0x0276, B:170:0x028d, B:176:0x02a1, B:178:0x02a7, B:185:0x02bd, B:187:0x02c5, B:197:0x02ef, B:200:0x02f5, B:188:0x02ca, B:190:0x02da, B:192:0x02e2, B:181:0x02b4), top: B:227:0x0276 }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0319 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0386 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.ArrayList h(com.google.ads.interactivemedia.v3.internal.rq r22, com.google.ads.interactivemedia.v3.internal.rs r23) throws com.google.ads.interactivemedia.v3.internal.rr {
        /*
            Method dump skipped, instruction units count: 917
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.rw.h(com.google.ads.interactivemedia.v3.internal.rq, com.google.ads.interactivemedia.v3.internal.rs):java.util.ArrayList");
    }

    private static void i(List list, final rv rvVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.ads.interactivemedia.v3.internal.ro
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                rv rvVar2 = rvVar;
                int i9 = rw.f24441a;
                return rvVar2.a(obj2) - rvVar2.a(obj);
            }
        });
    }

    private static boolean j(MediaCodecInfo mediaCodecInfo, String str) {
        if (cq.f22640a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (ar.m(str)) {
            return true;
        }
        String strD = com.google.ads.interactivemedia.v3.impl.data.k.d(mediaCodecInfo.getName());
        if (strD.startsWith("arc.")) {
            return false;
        }
        if (strD.startsWith("omx.google.") || strD.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strD.startsWith("omx.sec.") && strD.contains(".sw.")) || strD.equals("omx.qcom.video.decoder.hevcswvdec") || strD.startsWith("c2.android.") || strD.startsWith("c2.google.")) {
            return true;
        }
        return (strD.startsWith("omx.") || strD.startsWith("c2.")) ? false : true;
    }
}
