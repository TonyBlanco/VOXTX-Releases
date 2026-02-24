package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class wg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f24968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f24969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final um[] f24970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f24971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int[][][] f24972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final um f24973f;

    public wg(int[] iArr, um[] umVarArr, int[] iArr2, int[][][] iArr3, um umVar) {
        this.f24969b = iArr;
        this.f24970c = umVarArr;
        this.f24972e = iArr3;
        this.f24971d = iArr2;
        this.f24973f = umVar;
        this.f24968a = iArr.length;
    }

    public final int a() {
        return this.f24968a;
    }

    public final int b(int i9) {
        return this.f24969b[i9];
    }

    public final int c(int i9, int i10, int i11) {
        return fz.f(this.f24972e[i9][i10][i11]);
    }

    public final um d(int i9) {
        return this.f24970c[i9];
    }

    public final um e() {
        return this.f24973f;
    }

    public final int f(int i9, int i10) {
        int i11 = this.f24970c[i9].b(i10).f21163a;
        int[] iArr = new int[i11];
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            if (c(i9, i10, i14) == 4) {
                iArr[i13] = i14;
                i13++;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
        int iMin = 16;
        String str = null;
        boolean z9 = false;
        int i15 = 0;
        while (i12 < iArrCopyOf.length) {
            String str2 = this.f24970c[i9].b(i10).b(iArrCopyOf[i12]).f24467l;
            int i16 = i15 + 1;
            if (i15 != 0) {
                z9 |= !cq.V(str, str2);
            } else {
                str = str2;
            }
            iMin = Math.min(iMin, this.f24972e[i9][i10][i12] & 24);
            i12++;
            i15 = i16;
        }
        return z9 ? Math.min(iMin, this.f24971d[i9]) : iMin;
    }
}
