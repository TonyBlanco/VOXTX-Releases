package androidx.leanback.widget;

import androidx.leanback.widget.V;
import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes.dex */
public final class W extends V {
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0130, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0131, code lost:
    
        r6 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0148, code lost:
    
        return r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c4 A[PHI: r9
      0x00c4: PHI (r9v24 int) = (r9v13 int), (r9v4 int) binds: [B:78:0x00e7, B:66:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c8 A[PHI: r9
      0x00c8: PHI (r9v17 int) = (r9v13 int), (r9v4 int) binds: [B:78:0x00e7, B:66:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0101 A[LOOP:2: B:85:0x0101->B:101:0x0125, LOOP_START, PHI: r6 r9 r10
      0x0101: PHI (r6v13 int) = (r6v6 int), (r6v18 int) binds: [B:84:0x00ff, B:101:0x0125] A[DONT_GENERATE, DONT_INLINE]
      0x0101: PHI (r9v20 int) = (r9v18 int), (r9v21 int) binds: [B:84:0x00ff, B:101:0x0125] A[DONT_GENERATE, DONT_INLINE]
      0x0101: PHI (r10v5 int) = (r10v4 int), (r10v7 int) binds: [B:84:0x00ff, B:101:0x0125] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.leanback.widget.V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean J(int r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.W.J(int, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x012d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x012e, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0145, code lost:
    
        return r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c2 A[PHI: r8
      0x00c2: PHI (r8v23 int) = (r8v14 int), (r8v4 int) binds: [B:76:0x00e2, B:63:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c5 A[PHI: r8
      0x00c5: PHI (r8v16 int) = (r8v14 int), (r8v4 int) binds: [B:76:0x00e2, B:63:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fe A[LOOP:2: B:84:0x00fe->B:100:0x0122, LOOP_START, PHI: r5 r8 r9
      0x00fe: PHI (r5v13 int) = (r5v6 int), (r5v19 int) binds: [B:83:0x00fc, B:100:0x0122] A[DONT_GENERATE, DONT_INLINE]
      0x00fe: PHI (r8v19 int) = (r8v17 int), (r8v20 int) binds: [B:83:0x00fc, B:100:0x0122] A[DONT_GENERATE, DONT_INLINE]
      0x00fe: PHI (r9v5 int) = (r9v4 int), (r9v7 int) binds: [B:83:0x00fc, B:100:0x0122] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.leanback.widget.V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Q(int r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.W.Q(int, boolean):boolean");
    }

    public final int R(boolean z9) {
        boolean z10 = false;
        if (z9) {
            for (int i9 = this.f15669g; i9 >= this.f15668f; i9--) {
                int i10 = q(i9).f15672a;
                if (i10 == 0) {
                    z10 = true;
                } else if (z10 && i10 == this.f15667e - 1) {
                    return i9;
                }
            }
            return -1;
        }
        for (int i11 = this.f15668f; i11 <= this.f15669g; i11++) {
            int i12 = q(i11).f15672a;
            if (i12 == this.f15667e - 1) {
                z10 = true;
            } else if (z10 && i12 == 0) {
                return i11;
            }
        }
        return -1;
    }

    public int S(int i9) {
        V.a aVarN;
        int i10 = this.f15668f;
        if (i10 < 0) {
            return Integer.MIN_VALUE;
        }
        if (this.f15665c) {
            int iB = this.f15664b.b(i10);
            if (q(this.f15668f).f15672a == i9) {
                return iB;
            }
            int i11 = this.f15668f;
            do {
                i11++;
                if (i11 <= M()) {
                    aVarN = q(i11);
                    iB += aVarN.f15605b;
                }
            } while (aVarN.f15672a != i9);
            return iB;
        }
        int iB2 = this.f15664b.b(this.f15669g);
        V.a aVarN2 = q(this.f15669g);
        if (aVarN2.f15672a != i9) {
            int i12 = this.f15669g;
            do {
                i12--;
                if (i12 >= L()) {
                    iB2 -= aVarN2.f15605b;
                    aVarN2 = q(i12);
                }
            } while (aVarN2.f15672a != i9);
        }
        return iB2 + aVarN2.f15606c;
        return Integer.MIN_VALUE;
    }

    public int T(int i9) {
        V.a aVarN;
        int i10 = this.f15668f;
        if (i10 < 0) {
            return a.e.API_PRIORITY_OTHER;
        }
        if (this.f15665c) {
            int iB = this.f15664b.b(this.f15669g);
            V.a aVarN2 = q(this.f15669g);
            if (aVarN2.f15672a != i9) {
                int i11 = this.f15669g;
                do {
                    i11--;
                    if (i11 >= L()) {
                        iB -= aVarN2.f15605b;
                        aVarN2 = q(i11);
                    }
                } while (aVarN2.f15672a != i9);
            }
            return iB - aVarN2.f15606c;
        }
        int iB2 = this.f15664b.b(i10);
        if (q(this.f15668f).f15672a == i9) {
            return iB2;
        }
        int i12 = this.f15668f;
        do {
            i12++;
            if (i12 <= M()) {
                aVarN = q(i12);
                iB2 += aVarN.f15605b;
            }
        } while (aVarN.f15672a != i9);
        return iB2;
        return a.e.API_PRIORITY_OTHER;
    }

    @Override // androidx.leanback.widget.AbstractC1157l
    public int i(boolean z9, int i9, int[] iArr) {
        int i10;
        int iB = this.f15664b.b(i9);
        V.a aVarN = q(i9);
        int i11 = aVarN.f15672a;
        if (this.f15665c) {
            i10 = i11;
            int i12 = i10;
            int i13 = 1;
            int i14 = iB;
            for (int i15 = i9 + 1; i13 < this.f15667e && i15 <= this.f15669g; i15++) {
                V.a aVarN2 = q(i15);
                i14 += aVarN2.f15605b;
                int i16 = aVarN2.f15672a;
                if (i16 != i12) {
                    i13++;
                    if (!z9 ? i14 >= iB : i14 <= iB) {
                        i12 = i16;
                    } else {
                        iB = i14;
                        i9 = i15;
                        i10 = i16;
                        i12 = i10;
                    }
                }
            }
        } else {
            int i17 = 1;
            int i18 = i11;
            V.a aVarN3 = aVarN;
            int i19 = iB;
            iB = this.f15664b.d(i9) + iB;
            i10 = i18;
            for (int i20 = i9 - 1; i17 < this.f15667e && i20 >= this.f15668f; i20--) {
                i19 -= aVarN3.f15605b;
                aVarN3 = q(i20);
                int i21 = aVarN3.f15672a;
                if (i21 != i18) {
                    i17++;
                    int iD = this.f15664b.d(i20) + i19;
                    if (!z9 ? iD >= iB : iD <= iB) {
                        i18 = i21;
                    } else {
                        iB = iD;
                        i9 = i20;
                        i10 = i21;
                        i18 = i10;
                    }
                }
            }
        }
        if (iArr != null) {
            iArr[0] = i10;
            iArr[1] = i9;
        }
        return iB;
    }

    @Override // androidx.leanback.widget.AbstractC1157l
    public int k(boolean z9, int i9, int[] iArr) {
        int iD;
        int iB = this.f15664b.b(i9);
        V.a aVarN = q(i9);
        int i10 = aVarN.f15672a;
        if (this.f15665c) {
            int i11 = 1;
            iD = iB - this.f15664b.d(i9);
            int i12 = i10;
            for (int i13 = i9 - 1; i11 < this.f15667e && i13 >= this.f15668f; i13--) {
                iB -= aVarN.f15605b;
                aVarN = q(i13);
                int i14 = aVarN.f15672a;
                if (i14 != i12) {
                    i11++;
                    int iD2 = iB - this.f15664b.d(i13);
                    if (!z9 ? iD2 >= iD : iD2 <= iD) {
                        i12 = i14;
                    } else {
                        iD = iD2;
                        i9 = i13;
                        i10 = i14;
                        i12 = i10;
                    }
                }
            }
        } else {
            int i15 = i10;
            int i16 = i15;
            int i17 = 1;
            int i18 = iB;
            for (int i19 = i9 + 1; i17 < this.f15667e && i19 <= this.f15669g; i19++) {
                V.a aVarN2 = q(i19);
                i18 += aVarN2.f15605b;
                int i20 = aVarN2.f15672a;
                if (i20 != i16) {
                    i17++;
                    if (!z9 ? i18 >= iB : i18 <= iB) {
                        i16 = i20;
                    } else {
                        iB = i18;
                        i9 = i19;
                        i15 = i20;
                        i16 = i15;
                    }
                }
            }
            iD = iB;
            i10 = i15;
        }
        if (iArr != null) {
            iArr[0] = i10;
            iArr[1] = i9;
        }
        return iD;
    }
}
