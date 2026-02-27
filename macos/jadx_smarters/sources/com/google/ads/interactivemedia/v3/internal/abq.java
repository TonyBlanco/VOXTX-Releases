package com.google.ads.interactivemedia.v3.internal;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class abq {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public byte[] f18761M;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public aaf f18767S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f18768T;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public aae f18770V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f18771W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private int f18772X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f18774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f18775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18779f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f18780g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f18781h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public aad f18782i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f18783j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C1322o f18784k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f18785l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f18786m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f18787n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f18788o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f18789p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f18790q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f18791r = 0.0f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f18792s = 0.0f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f18793t = 0.0f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte[] f18794u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18795v = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f18796w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f18797x = -1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f18798y = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f18799z = -1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f18749A = 1000;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f18750B = 200;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public float f18751C = -1.0f;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public float f18752D = -1.0f;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public float f18753E = -1.0f;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public float f18754F = -1.0f;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public float f18755G = -1.0f;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f18756H = -1.0f;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public float f18757I = -1.0f;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public float f18758J = -1.0f;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public float f18759K = -1.0f;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public float f18760L = -1.0f;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f18762N = 1;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f18763O = -1;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f18764P = 8000;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public long f18765Q = 0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public long f18766R = 0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f18769U = true;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private String f18773Y = "eng";

    public static /* bridge */ /* synthetic */ void d(abq abqVar) {
        af.s(abqVar.f18770V);
    }

    private static Pair f(cj cjVar) throws as {
        try {
            cjVar.G(16);
            long jN = cjVar.n();
            if (jN == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (jN == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (jN != 826496599) {
                cd.e("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
            int iC = cjVar.c() + 20;
            byte[] bArrH = cjVar.H();
            while (true) {
                int length = bArrH.length;
                if (iC >= length - 4) {
                    throw as.a("Failed to find FourCC VC1 initialization data", null);
                }
                if (bArrH[iC] == 0 && bArrH[iC + 1] == 0 && bArrH[iC + 2] == 1 && bArrH[iC + 3] == 15) {
                    return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrH, iC, length)));
                }
                iC++;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw as.a("Error parsing FourCC private data", null);
        }
    }

    private static List g(byte[] bArr) throws as {
        int i9;
        int i10;
        try {
            if (bArr[0] != 2) {
                throw as.a("Error parsing vorbis codec private", null);
            }
            int i11 = 1;
            int i12 = 0;
            while (true) {
                i9 = bArr[i11] & 255;
                if (i9 != 255) {
                    break;
                }
                i12 += 255;
                i11++;
            }
            int i13 = i11 + 1;
            int i14 = i12 + i9;
            int i15 = 0;
            while (true) {
                i10 = bArr[i13] & 255;
                if (i10 != 255) {
                    break;
                }
                i15 += 255;
                i13++;
            }
            int i16 = i13 + 1;
            int i17 = i15 + i10;
            if (bArr[i16] != 1) {
                throw as.a("Error parsing vorbis codec private", null);
            }
            byte[] bArr2 = new byte[i14];
            System.arraycopy(bArr, i16, bArr2, 0, i14);
            int i18 = i16 + i14;
            if (bArr[i18] != 3) {
                throw as.a("Error parsing vorbis codec private", null);
            }
            int i19 = i18 + i17;
            if (bArr[i19] != 5) {
                throw as.a("Error parsing vorbis codec private", null);
            }
            int length = bArr.length - i19;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i19, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw as.a("Error parsing vorbis codec private", null);
        }
    }

    private static boolean h(cj cjVar) throws as {
        try {
            int iG = cjVar.g();
            if (iG == 1) {
                return true;
            }
            if (iG == 65534) {
                cjVar.F(24);
                if (cjVar.o() == abr.f18804e.getMostSignificantBits()) {
                    if (cjVar.o() == abr.f18804e.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw as.a("Error parsing MS/ACM codec private", null);
        }
    }

    private final byte[] i(String str) throws as {
        byte[] bArr = this.f18783j;
        if (bArr != null) {
            return bArr;
        }
        throw as.a("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0570  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(com.google.ads.interactivemedia.v3.internal.zk r19, int r20) throws com.google.ads.interactivemedia.v3.internal.as {
        /*
            Method dump skipped, instruction units count: 1664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.abq.e(com.google.ads.interactivemedia.v3.internal.zk, int):void");
    }
}
