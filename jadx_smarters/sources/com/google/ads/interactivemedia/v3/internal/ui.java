package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class ui {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f24726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f24727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f24728c;

    public ui() {
        this(new Random());
    }

    private ui(Random random) {
        this(new int[0], random);
    }

    private ui(int[] iArr, Random random) {
        this.f24727b = iArr;
        this.f24726a = random;
        this.f24728c = new int[iArr.length];
        for (int i9 = 0; i9 < iArr.length; i9++) {
            ((int[]) this.f24728c)[iArr[i9]] = i9;
        }
    }

    public ui(jb... jbVarArr) {
        kp kpVar = new kp();
        kr krVar = new kr();
        jb[] jbVarArr2 = new jb[2];
        this.f24727b = jbVarArr2;
        System.arraycopy(jbVarArr, 0, jbVarArr2, 0, 0);
        this.f24726a = kpVar;
        this.f24728c = krVar;
        jb[] jbVarArr3 = jbVarArr2;
        jbVarArr3[0] = kpVar;
        jbVarArr3[1] = krVar;
    }

    public final int a() {
        int[] iArr = (int[]) this.f24727b;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    public final int b() {
        int[] iArr = (int[]) this.f24727b;
        int length = iArr.length;
        if (length > 0) {
            return iArr[length - 1];
        }
        return -1;
    }

    public final int c() {
        return ((int[]) this.f24727b).length;
    }

    public final int d(int i9) {
        int i10 = ((int[]) this.f24728c)[i9] + 1;
        int[] iArr = (int[]) this.f24727b;
        if (i10 < iArr.length) {
            return iArr[i10];
        }
        return -1;
    }

    public final int e(int i9) {
        int i10 = ((int[]) this.f24728c)[i9] - 1;
        if (i10 >= 0) {
            return ((int[]) this.f24727b)[i10];
        }
        return -1;
    }

    public final ui f() {
        return new ui(new Random(((Random) this.f24726a).nextLong()));
    }

    public final ui g(int i9, int i10) {
        int[] iArr = new int[i10];
        int[] iArr2 = new int[i10];
        int i11 = 0;
        int i12 = 0;
        while (i12 < i10) {
            iArr[i12] = ((Random) this.f24726a).nextInt(((int[]) this.f24727b).length + 1);
            int i13 = i12 + 1;
            int iNextInt = ((Random) this.f24726a).nextInt(i13);
            iArr2[i12] = iArr2[iNextInt];
            iArr2[iNextInt] = i12 + i9;
            i12 = i13;
        }
        Arrays.sort(iArr);
        int[] iArr3 = new int[((int[]) this.f24727b).length + i10];
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int[] iArr4 = (int[]) this.f24727b;
            if (i11 >= iArr4.length + i10) {
                return new ui(iArr3, new Random(((Random) this.f24726a).nextLong()));
            }
            if (i14 >= i10 || i15 != iArr[i14]) {
                int i16 = i15 + 1;
                int i17 = iArr4[i15];
                iArr3[i11] = i17;
                if (i17 >= i9) {
                    iArr3[i11] = i17 + i10;
                }
                i15 = i16;
            } else {
                iArr3[i11] = iArr2[i14];
                i14++;
            }
            i11++;
        }
    }

    public final ui h(int i9, int i10) {
        int i11 = i10 - i9;
        int[] iArr = new int[((int[]) this.f24727b).length - i11];
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr2 = (int[]) this.f24727b;
            if (i12 >= iArr2.length) {
                return new ui(iArr, new Random(((Random) this.f24726a).nextLong()));
            }
            int i14 = iArr2[i12];
            if (i14 < i9 || i14 >= i10) {
                int i15 = i12 - i13;
                if (i14 >= i9) {
                    i14 -= i11;
                }
                iArr[i15] = i14;
            } else {
                i13++;
            }
            i12++;
        }
    }

    public final long i(long j9) {
        return ((kr) this.f24728c).i(j9);
    }

    public final long j() {
        return ((kp) this.f24726a).o();
    }

    public final jb[] k() {
        return (jb[]) this.f24727b;
    }

    public final void l(au auVar) {
        ((kr) this.f24728c).k(auVar.f20739b);
        ((kr) this.f24728c).j(auVar.f20740c);
    }

    public final void m(boolean z9) {
        ((kp) this.f24726a).p(z9);
    }
}
