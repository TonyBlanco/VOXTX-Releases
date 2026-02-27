package Z3;

import B3.C;
import B3.g0;
import B3.i0;
import O2.D1;
import O2.E1;
import O2.F1;
import O2.Q1;
import android.util.Pair;
import d4.k0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u extends C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f11255c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f11256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String[] f11257b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f11258c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final i0[] f11259d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f11260e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int[][][] f11261f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final i0 f11262g;

        public a(String[] strArr, int[] iArr, i0[] i0VarArr, int[] iArr2, int[][][] iArr3, i0 i0Var) {
            this.f11257b = strArr;
            this.f11258c = iArr;
            this.f11259d = i0VarArr;
            this.f11261f = iArr3;
            this.f11260e = iArr2;
            this.f11262g = i0Var;
            this.f11256a = iArr.length;
        }

        public int a(int i9, int i10, boolean z9) {
            int i11 = this.f11259d[i9].b(i10).f581a;
            int[] iArr = new int[i11];
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                int iG = g(i9, i10, i13);
                if (iG == 4 || (z9 && iG == 3)) {
                    iArr[i12] = i13;
                    i12++;
                }
            }
            return b(i9, i10, Arrays.copyOf(iArr, i12));
        }

        public int b(int i9, int i10, int[] iArr) {
            int i11 = 0;
            String str = null;
            boolean z9 = false;
            int i12 = 0;
            int iMin = 16;
            while (i11 < iArr.length) {
                String str2 = this.f11259d[i9].b(i10).c(iArr[i11]).f6467m;
                int i13 = i12 + 1;
                if (i12 == 0) {
                    str = str2;
                } else {
                    z9 |= !k0.c(str, str2);
                }
                iMin = Math.min(iMin, D1.d(this.f11261f[i9][i10][i11]));
                i11++;
                i12 = i13;
            }
            return z9 ? Math.min(iMin, this.f11260e[i9]) : iMin;
        }

        public int c(int i9, int i10, int i11) {
            return this.f11261f[i9][i10][i11];
        }

        public int d() {
            return this.f11256a;
        }

        public int e(int i9) {
            return this.f11258c[i9];
        }

        public i0 f(int i9) {
            return this.f11259d[i9];
        }

        public int g(int i9, int i10, int i11) {
            return D1.f(c(i9, i10, i11));
        }

        public i0 h() {
            return this.f11262g;
        }
    }

    public static int n(E1[] e1Arr, g0 g0Var, int[] iArr, boolean z9) {
        int length = e1Arr.length;
        int i9 = 0;
        boolean z10 = true;
        for (int i10 = 0; i10 < e1Arr.length; i10++) {
            E1 e12 = e1Arr[i10];
            int iMax = 0;
            for (int i11 = 0; i11 < g0Var.f581a; i11++) {
                iMax = Math.max(iMax, D1.f(e12.a(g0Var.c(i11))));
            }
            boolean z11 = iArr[i10] == 0;
            if (iMax > i9 || (iMax == i9 && z9 && !z10 && z11)) {
                length = i10;
                z10 = z11;
                i9 = iMax;
            }
        }
        return length;
    }

    public static int[] p(E1 e12, g0 g0Var) {
        int[] iArr = new int[g0Var.f581a];
        for (int i9 = 0; i9 < g0Var.f581a; i9++) {
            iArr[i9] = e12.a(g0Var.c(i9));
        }
        return iArr;
    }

    public static int[] q(E1[] e1Arr) {
        int length = e1Arr.length;
        int[] iArr = new int[length];
        for (int i9 = 0; i9 < length; i9++) {
            iArr[i9] = e1Arr[i9].t();
        }
        return iArr;
    }

    @Override // Z3.C
    public final void i(Object obj) {
        this.f11255c = (a) obj;
    }

    @Override // Z3.C
    public final D k(E1[] e1Arr, i0 i0Var, C.b bVar, Q1 q12) {
        int[] iArr = new int[e1Arr.length + 1];
        int length = e1Arr.length + 1;
        g0[][] g0VarArr = new g0[length][];
        int[][][] iArr2 = new int[e1Arr.length + 1][][];
        for (int i9 = 0; i9 < length; i9++) {
            int i10 = i0Var.f590a;
            g0VarArr[i9] = new g0[i10];
            iArr2[i9] = new int[i10][];
        }
        int[] iArrQ = q(e1Arr);
        for (int i11 = 0; i11 < i0Var.f590a; i11++) {
            g0 g0VarB = i0Var.b(i11);
            int iN = n(e1Arr, g0VarB, iArr, g0VarB.f583d == 5);
            int[] iArrP = iN == e1Arr.length ? new int[g0VarB.f581a] : p(e1Arr[iN], g0VarB);
            int i12 = iArr[iN];
            g0VarArr[iN][i12] = g0VarB;
            iArr2[iN][i12] = iArrP;
            iArr[iN] = i12 + 1;
        }
        i0[] i0VarArr = new i0[e1Arr.length];
        String[] strArr = new String[e1Arr.length];
        int[] iArr3 = new int[e1Arr.length];
        for (int i13 = 0; i13 < e1Arr.length; i13++) {
            int i14 = iArr[i13];
            i0VarArr[i13] = new i0((g0[]) k0.U0(g0VarArr[i13], i14));
            iArr2[i13] = (int[][]) k0.U0(iArr2[i13], i14);
            strArr[i13] = e1Arr[i13].getName();
            iArr3[i13] = e1Arr[i13].getTrackType();
        }
        a aVar = new a(strArr, iArr3, i0VarArr, iArrQ, iArr2, new i0((g0[]) k0.U0(g0VarArr[e1Arr.length], iArr[e1Arr.length])));
        Pair pairR = r(aVar, iArr2, iArrQ, bVar, q12);
        return new D((F1[]) pairR.first, (s[]) pairR.second, A.a(aVar, (v[]) pairR.second), aVar);
    }

    public final a o() {
        return this.f11255c;
    }

    public abstract Pair r(a aVar, int[][][] iArr, int[] iArr2, C.b bVar, Q1 q12);
}
