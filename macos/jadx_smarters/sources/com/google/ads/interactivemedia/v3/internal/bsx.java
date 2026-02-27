package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class bsx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bsx f22240a = new bsx(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f22242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object[] f22243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f22245f;

    private bsx() {
        this(0, new int[8], new Object[8], true);
    }

    private bsx(int i9, int[] iArr, Object[] objArr, boolean z9) {
        this.f22244e = -1;
        this.f22241b = i9;
        this.f22242c = iArr;
        this.f22243d = objArr;
        this.f22245f = z9;
    }

    public static bsx c() {
        return f22240a;
    }

    public static bsx d(bsx bsxVar, bsx bsxVar2) {
        int i9 = bsxVar.f22241b + bsxVar2.f22241b;
        int[] iArrCopyOf = Arrays.copyOf(bsxVar.f22242c, i9);
        System.arraycopy(bsxVar2.f22242c, 0, iArrCopyOf, bsxVar.f22241b, bsxVar2.f22241b);
        Object[] objArrCopyOf = Arrays.copyOf(bsxVar.f22243d, i9);
        System.arraycopy(bsxVar2.f22243d, 0, objArrCopyOf, bsxVar.f22241b, bsxVar2.f22241b);
        return new bsx(i9, iArrCopyOf, objArrCopyOf, true);
    }

    public static bsx e() {
        return new bsx(0, new int[8], new Object[8], true);
    }

    private final void m(int i9) {
        int[] iArr = this.f22242c;
        if (i9 > iArr.length) {
            int i10 = this.f22241b;
            int i11 = i10 + (i10 / 2);
            if (i11 >= i9) {
                i9 = i11;
            }
            if (i9 < 8) {
                i9 = 8;
            }
            this.f22242c = Arrays.copyOf(iArr, i9);
            this.f22243d = Arrays.copyOf(this.f22243d, i9);
        }
    }

    private static void n(int i9, Object obj, btn btnVar) throws IOException {
        int iA = btm.a(i9);
        int iB = btm.b(i9);
        if (iB == 0) {
            btnVar.t(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 1) {
            btnVar.m(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 2) {
            btnVar.d(iA, (bpb) obj);
            return;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw new RuntimeException(bqw.a());
            }
            btnVar.k(iA, ((Integer) obj).intValue());
        } else {
            btnVar.G(iA);
            ((bsx) obj).k(btnVar);
            btnVar.h(iA);
        }
    }

    public final int a() {
        int iT;
        int i9 = this.f22244e;
        if (i9 != -1) {
            return i9;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f22241b; i11++) {
            int i12 = this.f22242c[i11];
            int iA = btm.a(i12);
            int iB = btm.b(i12);
            if (iB == 0) {
                iT = bpk.T(iA, ((Long) this.f22243d[i11]).longValue());
            } else if (iB == 1) {
                ((Long) this.f22243d[i11]).longValue();
                iT = bpk.aF(iA);
            } else if (iB == 2) {
                iT = bpk.x(iA, (bpb) this.f22243d[i11]);
            } else if (iB == 3) {
                int iQ = bpk.Q(iA);
                iT = iQ + iQ + ((bsx) this.f22243d[i11]).a();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(bqw.a());
                }
                ((Integer) this.f22243d[i11]).intValue();
                iT = bpk.aE(iA);
            }
            i10 += iT;
        }
        this.f22244e = i10;
        return i10;
    }

    public final int b() {
        int i9 = this.f22244e;
        if (i9 != -1) {
            return i9;
        }
        int iR = 0;
        for (int i10 = 0; i10 < this.f22241b; i10++) {
            int i11 = this.f22242c[i10];
            bpb bpbVar = (bpb) this.f22243d[i10];
            int iQ = bpk.Q(1);
            iR += iQ + iQ + bpk.R(2, btm.a(i11)) + bpk.x(3, bpbVar);
        }
        this.f22244e = iR;
        return iR;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof bsx)) {
            return false;
        }
        bsx bsxVar = (bsx) obj;
        int i9 = this.f22241b;
        if (i9 == bsxVar.f22241b) {
            int[] iArr = this.f22242c;
            int[] iArr2 = bsxVar.f22242c;
            int i10 = 0;
            while (true) {
                if (i10 >= i9) {
                    Object[] objArr = this.f22243d;
                    Object[] objArr2 = bsxVar.f22243d;
                    int i11 = this.f22241b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (objArr[i12].equals(objArr2[i12])) {
                        }
                    }
                    return true;
                }
                if (iArr[i10] != iArr2[i10]) {
                    break;
                }
                i10++;
            }
        }
        return false;
    }

    public final void f() {
        if (!this.f22245f) {
            throw new UnsupportedOperationException();
        }
    }

    public final void g() {
        this.f22245f = false;
    }

    public final void h(StringBuilder sb, int i9) {
        for (int i10 = 0; i10 < this.f22241b; i10++) {
            bru.b(sb, i9, String.valueOf(btm.a(this.f22242c[i10])), this.f22243d[i10]);
        }
    }

    public final int hashCode() {
        int i9 = this.f22241b;
        int i10 = (i9 + 527) * 31;
        int[] iArr = this.f22242c;
        int iHashCode = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i9; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = (i10 + i11) * 31;
        Object[] objArr = this.f22243d;
        int i14 = this.f22241b;
        for (int i15 = 0; i15 < i14; i15++) {
            iHashCode = (iHashCode * 31) + objArr[i15].hashCode();
        }
        return i13 + iHashCode;
    }

    public final void i(int i9, Object obj) {
        f();
        m(this.f22241b + 1);
        int[] iArr = this.f22242c;
        int i10 = this.f22241b;
        iArr[i10] = i9;
        this.f22243d[i10] = obj;
        this.f22241b = i10 + 1;
    }

    public final void j(btn btnVar) throws IOException {
        for (int i9 = 0; i9 < this.f22241b; i9++) {
            btnVar.x(btm.a(this.f22242c[i9]), this.f22243d[i9]);
        }
    }

    public final void k(btn btnVar) throws IOException {
        if (this.f22241b != 0) {
            for (int i9 = 0; i9 < this.f22241b; i9++) {
                n(this.f22242c[i9], this.f22243d[i9], btnVar);
            }
        }
    }

    public final void l(bsx bsxVar) {
        if (bsxVar.equals(f22240a)) {
            return;
        }
        f();
        int i9 = this.f22241b + bsxVar.f22241b;
        m(i9);
        System.arraycopy(bsxVar.f22242c, 0, this.f22242c, this.f22241b, bsxVar.f22241b);
        System.arraycopy(bsxVar.f22243d, 0, this.f22243d, this.f22241b, bsxVar.f22241b);
        this.f22241b = i9;
    }
}
