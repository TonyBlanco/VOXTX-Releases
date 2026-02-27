package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.util.Arrays;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes3.dex */
public final class zf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f25253a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f25254b = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f25255c = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f25256d = {64, 112, 128, 192, 224, JceEncryptionConstants.SYMMETRIC_KEY_LENGTH, 384, 448, IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    public static C1333s a(byte[] bArr, String str, String str2) {
        ci ciVar;
        if (bArr[0] == 127) {
            ciVar = new ci(bArr);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            byte b9 = bArrCopyOf[0];
            if (b9 == -2 || b9 == -1) {
                for (int i9 = 0; i9 < bArrCopyOf.length - 1; i9 += 2) {
                    byte b10 = bArrCopyOf[i9];
                    int i10 = i9 + 1;
                    bArrCopyOf[i9] = bArrCopyOf[i10];
                    bArrCopyOf[i10] = b10;
                }
            }
            ciVar = new ci(bArrCopyOf);
            if (bArrCopyOf[0] == 31) {
                ci ciVar2 = new ci(bArrCopyOf);
                while (ciVar2.a() >= 16) {
                    ciVar2.i(2);
                    ciVar.l(ciVar2.c(14));
                }
            }
            ciVar.e(bArrCopyOf);
        }
        ciVar.i(60);
        int i11 = f25254b[ciVar.c(6)];
        int i12 = f25255c[ciVar.c(4)];
        int iC = ciVar.c(5);
        int i13 = iC < 29 ? (f25256d[iC] * 1000) / 2 : -1;
        ciVar.i(10);
        int i14 = ciVar.c(2) > 0 ? 1 : 0;
        r rVar = new r();
        rVar.S(str);
        rVar.ae("audio/vnd.dts");
        rVar.G(i13);
        rVar.H(i11 + i14);
        rVar.af(i12);
        rVar.M(null);
        rVar.V(str2);
        return rVar.v();
    }
}
