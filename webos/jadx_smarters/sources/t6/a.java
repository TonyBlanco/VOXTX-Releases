package T6;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import x6.C2962c;
import x6.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f9560a = {0, 4, 1, 5};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f9561b = {6, 2, 7, 3};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f9562c = {8, 1, 1, 1, 1, 1, 1, 3};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f9563d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    public static void a(q[] qVarArr, q[] qVarArr2, int[] iArr) {
        for (int i9 = 0; i9 < iArr.length; i9++) {
            qVarArr[iArr[i9]] = qVarArr2[i9];
        }
    }

    public static b b(C2962c c2962c, Map map, boolean z9) {
        D6.b bVarA = c2962c.a();
        List listC = c(z9, bVarA);
        if (listC.isEmpty()) {
            bVarA = bVarA.clone();
            bVarA.m();
            listC = c(z9, bVarA);
        }
        return new b(bVarA, listC);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (r4 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        r3 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if (r3.hasNext() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        r4 = (x6.q[]) r3.next();
        r7 = r4[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r7 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        r2 = (int) java.lang.Math.max(r2, r7.d());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        r4 = r4[3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        if (r4 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        r2 = java.lang.Math.max(r2, (int) r4.d());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List c(boolean r8, D6.b r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 0
        L7:
            r3 = 0
            r4 = 0
        L9:
            int r5 = r9.i()
            if (r2 >= r5) goto L72
            x6.q[] r3 = f(r9, r2, r3)
            r5 = r3[r1]
            r6 = 1
            if (r5 != 0) goto L4e
            r5 = 3
            r7 = r3[r5]
            if (r7 != 0) goto L4e
            if (r4 == 0) goto L72
            java.util.Iterator r3 = r0.iterator()
        L23:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L4b
            java.lang.Object r4 = r3.next()
            x6.q[] r4 = (x6.q[]) r4
            r7 = r4[r6]
            if (r7 == 0) goto L3d
            float r2 = (float) r2
            float r7 = r7.d()
            float r2 = java.lang.Math.max(r2, r7)
            int r2 = (int) r2
        L3d:
            r4 = r4[r5]
            if (r4 == 0) goto L23
            float r4 = r4.d()
            int r4 = (int) r4
            int r2 = java.lang.Math.max(r2, r4)
            goto L23
        L4b:
            int r2 = r2 + 5
            goto L7
        L4e:
            r0.add(r3)
            if (r8 == 0) goto L72
            r2 = 2
            r4 = r3[r2]
            if (r4 == 0) goto L67
            float r4 = r4.c()
            int r4 = (int) r4
            r2 = r3[r2]
        L5f:
            float r2 = r2.d()
            int r2 = (int) r2
            r3 = r4
            r4 = 1
            goto L9
        L67:
            r2 = 4
            r4 = r3[r2]
            float r4 = r4.c()
            int r4 = (int) r4
            r2 = r3[r2]
            goto L5f
        L72:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: T6.a.c(boolean, D6.b):java.util.List");
    }

    public static int[] d(D6.b bVar, int i9, int i10, int i11, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i12 = 0;
        while (bVar.f(i9, i10) && i9 > 0) {
            int i13 = i12 + 1;
            if (i12 >= 3) {
                break;
            }
            i9--;
            i12 = i13;
        }
        int length = iArr.length;
        int i14 = i9;
        int i15 = 0;
        boolean z9 = false;
        while (i9 < i11) {
            if (bVar.f(i9, i10) != z9) {
                iArr2[i15] = iArr2[i15] + 1;
            } else {
                if (i15 != length - 1) {
                    i15++;
                } else {
                    if (g(iArr2, iArr) < 0.42f) {
                        return new int[]{i14, i9};
                    }
                    i14 += iArr2[0] + iArr2[1];
                    int i16 = i15 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i16);
                    iArr2[i16] = 0;
                    iArr2[i15] = 0;
                    i15--;
                }
                iArr2[i15] = 1;
                z9 = !z9;
            }
            i9++;
        }
        if (i15 != length - 1 || g(iArr2, iArr) >= 0.42f) {
            return null;
        }
        return new int[]{i14, i9 - 1};
    }

    public static q[] e(D6.b bVar, int i9, int i10, int i11, int i12, int[] iArr) {
        boolean z9;
        int i13;
        q[] qVarArr = new q[4];
        int[] iArr2 = new int[iArr.length];
        int i14 = i11;
        while (true) {
            if (i14 >= i9) {
                z9 = false;
                break;
            }
            int[] iArrD = d(bVar, i12, i14, i10, iArr, iArr2);
            if (iArrD != null) {
                int i15 = i14;
                int[] iArr3 = iArrD;
                while (i15 > 0) {
                    int i16 = i15 - 1;
                    int[] iArrD2 = d(bVar, i12, i16, i10, iArr, iArr2);
                    if (iArrD2 == null) {
                        break;
                    }
                    iArr3 = iArrD2;
                    i15 = i16;
                }
                float f9 = i15;
                qVarArr[0] = new q(iArr3[0], f9);
                qVarArr[1] = new q(iArr3[1], f9);
                i14 = i15;
                z9 = true;
            } else {
                i14 += 5;
            }
        }
        int i17 = i14 + 1;
        if (z9) {
            int[] iArr4 = {(int) qVarArr[0].c(), (int) qVarArr[1].c()};
            int i18 = i17;
            int i19 = 0;
            while (true) {
                if (i18 >= i9) {
                    i13 = i19;
                    break;
                }
                i13 = i19;
                int[] iArrD3 = d(bVar, iArr4[0], i18, i10, iArr, iArr2);
                if (iArrD3 != null && Math.abs(iArr4[0] - iArrD3[0]) < 5 && Math.abs(iArr4[1] - iArrD3[1]) < 5) {
                    iArr4 = iArrD3;
                    i19 = 0;
                } else {
                    if (i13 > 25) {
                        break;
                    }
                    i19 = i13 + 1;
                }
                i18++;
            }
            i17 = i18 - (i13 + 1);
            float f10 = i17;
            qVarArr[2] = new q(iArr4[0], f10);
            qVarArr[3] = new q(iArr4[1], f10);
        }
        if (i17 - i14 < 10) {
            Arrays.fill(qVarArr, (Object) null);
        }
        return qVarArr;
    }

    public static q[] f(D6.b bVar, int i9, int i10) {
        int i11 = bVar.i();
        int iL = bVar.l();
        q[] qVarArr = new q[8];
        a(qVarArr, e(bVar, i11, iL, i9, i10, f9562c), f9560a);
        q qVar = qVarArr[4];
        if (qVar != null) {
            i10 = (int) qVar.c();
            i9 = (int) qVarArr[4].d();
        }
        a(qVarArr, e(bVar, i11, iL, i9, i10, f9563d), f9561b);
        return qVarArr;
    }

    public static float g(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            i9 += iArr[i11];
            i10 += iArr2[i11];
        }
        if (i9 < i10) {
            return Float.POSITIVE_INFINITY;
        }
        float f9 = i9;
        float f10 = f9 / i10;
        float f11 = 0.8f * f10;
        float f12 = 0.0f;
        for (int i12 = 0; i12 < length; i12++) {
            float f13 = iArr2[i12] * f10;
            float f14 = iArr[i12];
            float f15 = f14 > f13 ? f14 - f13 : f13 - f14;
            if (f15 > f11) {
                return Float.POSITIVE_INFINITY;
            }
            f12 += f15;
        }
        return f12 / f9;
    }
}
