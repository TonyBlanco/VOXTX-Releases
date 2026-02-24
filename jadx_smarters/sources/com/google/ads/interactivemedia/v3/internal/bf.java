package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes3.dex */
public final class bf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1333s[] f21166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21167e;

    public bf(String str, C1333s... c1333sArr) {
        int length = c1333sArr.length;
        int i9 = 1;
        af.u(length > 0);
        this.f21164b = str;
        this.f21166d = c1333sArr;
        this.f21163a = length;
        int iB = ar.b(c1333sArr[0].f24467l);
        this.f21165c = iB == -1 ? ar.b(c1333sArr[0].f24466k) : iB;
        String strD = d(c1333sArr[0].f24458c);
        int iC = c(c1333sArr[0].f24460e);
        while (true) {
            C1333s[] c1333sArr2 = this.f21166d;
            if (i9 >= c1333sArr2.length) {
                return;
            }
            if (!strD.equals(d(c1333sArr2[i9].f24458c))) {
                C1333s[] c1333sArr3 = this.f21166d;
                e("languages", c1333sArr3[0].f24458c, c1333sArr3[i9].f24458c, i9);
                return;
            } else {
                C1333s[] c1333sArr4 = this.f21166d;
                if (iC != c(c1333sArr4[i9].f24460e)) {
                    e("role flags", Integer.toBinaryString(c1333sArr4[0].f24460e), Integer.toBinaryString(this.f21166d[i9].f24460e), i9);
                    return;
                }
                i9++;
            }
        }
    }

    private static int c(int i9) {
        return i9 | Http2.INITIAL_MAX_FRAME_SIZE;
    }

    private static String d(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static void e(String str, String str2, String str3, int i9) {
        cd.c("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i9 + ")"));
    }

    public final int a(C1333s c1333s) {
        int i9 = 0;
        while (true) {
            C1333s[] c1333sArr = this.f21166d;
            if (i9 >= c1333sArr.length) {
                return -1;
            }
            if (c1333s == c1333sArr[i9]) {
                return i9;
            }
            i9++;
        }
    }

    public final C1333s b(int i9) {
        return this.f21166d[i9];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bf.class == obj.getClass()) {
            bf bfVar = (bf) obj;
            if (this.f21164b.equals(bfVar.f21164b) && Arrays.equals(this.f21166d, bfVar.f21166d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9 = this.f21167e;
        if (i9 != 0) {
            return i9;
        }
        int iHashCode = ((this.f21164b.hashCode() + 527) * 31) + Arrays.hashCode(this.f21166d);
        this.f21167e = iHashCode;
        return iHashCode;
    }
}
