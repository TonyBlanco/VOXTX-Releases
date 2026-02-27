package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class ym {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f25176a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f25177b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f25178c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static yl a(byte[] bArr) throws as {
        return b(new ci(bArr), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b7, code lost:
    
        if (r11 != 3) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.ads.interactivemedia.v3.internal.yl b(com.google.ads.interactivemedia.v3.internal.ci r11, boolean r12) throws com.google.ads.interactivemedia.v3.internal.as {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.ym.b(com.google.ads.interactivemedia.v3.internal.ci, boolean):com.google.ads.interactivemedia.v3.internal.yl");
    }

    private static int c(ci ciVar) {
        int iC = ciVar.c(5);
        return iC == 31 ? ciVar.c(6) + 32 : iC;
    }

    private static int d(ci ciVar) throws as {
        int iC = ciVar.c(4);
        if (iC == 15) {
            return ciVar.c(24);
        }
        if (iC < 13) {
            return f25177b[iC];
        }
        throw as.a(null, null);
    }
}
