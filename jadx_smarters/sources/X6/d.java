package X6;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static int a(b bVar) {
        return b(bVar, true) + b(bVar, false);
    }

    public static int b(b bVar, boolean z9) {
        int iD = z9 ? bVar.d() : bVar.e();
        int iE = z9 ? bVar.e() : bVar.d();
        byte[][] bArrC = bVar.c();
        int i9 = 0;
        for (int i10 = 0; i10 < iD; i10++) {
            byte b9 = -1;
            int i11 = 0;
            for (int i12 = 0; i12 < iE; i12++) {
                byte b10 = z9 ? bArrC[i10][i12] : bArrC[i12][i10];
                if (b10 == b9) {
                    i11++;
                } else {
                    if (i11 >= 5) {
                        i9 += i11 - 2;
                    }
                    b9 = b10;
                    i11 = 1;
                }
            }
            if (i11 >= 5) {
                i9 += i11 - 2;
            }
        }
        return i9;
    }

    public static int c(b bVar) {
        byte[][] bArrC = bVar.c();
        int iE = bVar.e();
        int iD = bVar.d();
        int i9 = 0;
        for (int i10 = 0; i10 < iD - 1; i10++) {
            byte[] bArr = bArrC[i10];
            int i11 = 0;
            while (i11 < iE - 1) {
                byte b9 = bArr[i11];
                int i12 = i11 + 1;
                if (b9 == bArr[i12]) {
                    byte[] bArr2 = bArrC[i10 + 1];
                    if (b9 == bArr2[i11] && b9 == bArr2[i12]) {
                        i9++;
                    }
                }
                i11 = i12;
            }
        }
        return i9 * 3;
    }

    public static int d(b bVar) {
        byte[][] bArrC = bVar.c();
        int iE = bVar.e();
        int iD = bVar.d();
        int i9 = 0;
        for (int i10 = 0; i10 < iD; i10++) {
            for (int i11 = 0; i11 < iE; i11++) {
                byte[] bArr = bArrC[i10];
                int i12 = i11 + 6;
                if (i12 < iE && bArr[i11] == 1 && bArr[i11 + 1] == 0 && bArr[i11 + 2] == 1 && bArr[i11 + 3] == 1 && bArr[i11 + 4] == 1 && bArr[i11 + 5] == 0 && bArr[i12] == 1 && (g(bArr, i11 - 4, i11) || g(bArr, i11 + 7, i11 + 11))) {
                    i9++;
                }
                int i13 = i10 + 6;
                if (i13 < iD && bArrC[i10][i11] == 1 && bArrC[i10 + 1][i11] == 0 && bArrC[i10 + 2][i11] == 1 && bArrC[i10 + 3][i11] == 1 && bArrC[i10 + 4][i11] == 1 && bArrC[i10 + 5][i11] == 0 && bArrC[i13][i11] == 1 && (h(bArrC, i11, i10 - 4, i10) || h(bArrC, i11, i10 + 7, i10 + 11))) {
                    i9++;
                }
            }
        }
        return i9 * 40;
    }

    public static int e(b bVar) {
        byte[][] bArrC = bVar.c();
        int iE = bVar.e();
        int iD = bVar.d();
        int i9 = 0;
        for (int i10 = 0; i10 < iD; i10++) {
            byte[] bArr = bArrC[i10];
            for (int i11 = 0; i11 < iE; i11++) {
                if (bArr[i11] == 1) {
                    i9++;
                }
            }
        }
        int iD2 = bVar.d() * bVar.e();
        return ((Math.abs((i9 << 1) - iD2) * 10) / iD2) * 10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean f(int r1, int r2, int r3) {
        /*
            r0 = 1
            switch(r1) {
                case 0: goto L32;
                case 1: goto L33;
                case 2: goto L3a;
                case 3: goto L36;
                case 4: goto L2e;
                case 5: goto L26;
                case 6: goto L1e;
                case 7: goto L14;
                default: goto L4;
            }
        L4:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Invalid mask pattern: "
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
        L14:
            int r1 = r3 * r2
            int r1 = r1 % 3
            int r3 = r3 + r2
            r2 = r3 & 1
            int r1 = r1 + r2
        L1c:
            r1 = r1 & r0
            goto L3c
        L1e:
            int r3 = r3 * r2
            r1 = r3 & 1
            int r3 = r3 % 3
            int r1 = r1 + r3
            goto L1c
        L26:
            int r3 = r3 * r2
            r1 = r3 & 1
            int r3 = r3 % 3
            int r1 = r1 + r3
            goto L3c
        L2e:
            int r3 = r3 / 2
            int r2 = r2 / 3
        L32:
            int r3 = r3 + r2
        L33:
            r1 = r3 & 1
            goto L3c
        L36:
            int r3 = r3 + r2
            int r1 = r3 % 3
            goto L3c
        L3a:
            int r1 = r2 % 3
        L3c:
            if (r1 != 0) goto L3f
            return r0
        L3f:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.d.f(int, int, int):boolean");
    }

    public static boolean g(byte[] bArr, int i9, int i10) {
        int iMin = Math.min(i10, bArr.length);
        for (int iMax = Math.max(i9, 0); iMax < iMin; iMax++) {
            if (bArr[iMax] == 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean h(byte[][] bArr, int i9, int i10, int i11) {
        int iMin = Math.min(i11, bArr.length);
        for (int iMax = Math.max(i10, 0); iMax < iMin; iMax++) {
            if (bArr[iMax][i9] == 1) {
                return false;
            }
        }
        return true;
    }
}
