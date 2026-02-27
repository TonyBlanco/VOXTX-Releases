package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.nio.ByteBuffer;
import okio.Utf8;
import org.apache.http.HttpStatus;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes3.dex */
public final class yo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f25184a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f25185b = {1, 2, 3, 6};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f25186c = {48000, 44100, 32000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f25187d = {24000, 22050, 16000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f25188e = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f25189f = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, JceEncryptionConstants.SYMMETRIC_KEY_LENGTH, 320, 384, 448, IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED, 576, 640};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f25190g = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, HttpStatus.SC_EXPECTATION_FAILED, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int a(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f25185b[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
        }
        return 1536;
    }

    public static int b(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b9 = bArr[4];
            return f((b9 & 192) >> 6, b9 & Utf8.REPLACEMENT_BYTE);
        }
        int i9 = ((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1;
        return i9 + i9;
    }

    public static C1333s c(cj cjVar, String str, String str2, C1322o c1322o) {
        int i9 = f25186c[(cjVar.i() & 192) >> 6];
        int i10 = cjVar.i();
        int i11 = f25188e[(i10 & 56) >> 3];
        if ((i10 & 4) != 0) {
            i11++;
        }
        r rVar = new r();
        rVar.S(str);
        rVar.ae("audio/ac3");
        rVar.H(i11);
        rVar.af(i9);
        rVar.M(c1322o);
        rVar.V(str2);
        return rVar.v();
    }

    public static C1333s d(cj cjVar, String str, String str2, C1322o c1322o) {
        cjVar.G(2);
        int i9 = f25186c[(cjVar.i() & 192) >> 6];
        int i10 = cjVar.i();
        int i11 = f25188e[(i10 & 14) >> 1];
        if ((i10 & 1) != 0) {
            i11++;
        }
        if (((cjVar.i() & 30) >> 1) > 0 && (2 & cjVar.i()) != 0) {
            i11 += 2;
        }
        String str3 = (cjVar.a() <= 0 || (cjVar.i() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc";
        r rVar = new r();
        rVar.S(str);
        rVar.ae(str3);
        rVar.H(i11);
        rVar.af(i9);
        rVar.M(c1322o);
        rVar.V(str2);
        return rVar.v();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.ads.interactivemedia.v3.internal.yn e(com.google.ads.interactivemedia.v3.internal.ci r19) {
        /*
            Method dump skipped, instruction units count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.yo.e(com.google.ads.interactivemedia.v3.internal.ci):com.google.ads.interactivemedia.v3.internal.yn");
    }

    private static int f(int i9, int i10) {
        int i11 = i10 / 2;
        if (i9 < 0 || i9 >= 3 || i10 < 0 || i11 >= 19) {
            return -1;
        }
        int i12 = f25186c[i9];
        if (i12 == 44100) {
            int i13 = f25190g[i11] + (i10 & 1);
            return i13 + i13;
        }
        int i14 = f25189f[i11];
        return i12 == 32000 ? i14 * 6 : i14 * 4;
    }
}
