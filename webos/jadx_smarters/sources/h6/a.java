package H6;

import x6.g;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D6.b f2721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D6.b f2722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f2723c;

    public a(D6.b bVar) throws g {
        int i9 = bVar.i();
        if (i9 < 8 || i9 > 144 || (i9 & 1) != 0) {
            throw g.a();
        }
        this.f2723c = j(bVar);
        D6.b bVarA = a(bVar);
        this.f2721a = bVarA;
        this.f2722b = new D6.b(bVarA.l(), bVarA.i());
    }

    public static e j(D6.b bVar) {
        return e.h(bVar.i(), bVar.l());
    }

    public final D6.b a(D6.b bVar) {
        int iF = this.f2723c.f();
        int iE = this.f2723c.e();
        if (bVar.i() != iF) {
            throw new IllegalArgumentException("Dimension of bitMatrix must match the version size");
        }
        int iC = this.f2723c.c();
        int iB = this.f2723c.b();
        int i9 = iF / iC;
        int i10 = iE / iB;
        D6.b bVar2 = new D6.b(i10 * iB, i9 * iC);
        for (int i11 = 0; i11 < i9; i11++) {
            int i12 = i11 * iC;
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = i13 * iB;
                for (int i15 = 0; i15 < iC; i15++) {
                    int i16 = ((iC + 2) * i11) + 1 + i15;
                    int i17 = i12 + i15;
                    for (int i18 = 0; i18 < iB; i18++) {
                        if (bVar.f(((iB + 2) * i13) + 1 + i18, i16)) {
                            bVar2.n(i14 + i18, i17);
                        }
                    }
                }
            }
        }
        return bVar2;
    }

    public e b() {
        return this.f2723c;
    }

    public byte[] c() throws g {
        byte[] bArr = new byte[this.f2723c.g()];
        int i9 = this.f2721a.i();
        int iL = this.f2721a.l();
        int i10 = 0;
        boolean z9 = false;
        int i11 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        int i12 = 4;
        while (true) {
            if (i12 == i9 && i10 == 0 && !z9) {
                bArr[i11] = (byte) d(i9, iL);
                i12 -= 2;
                i10 += 2;
                i11++;
                z9 = true;
            } else {
                int i13 = i9 - 2;
                if (i12 == i13 && i10 == 0 && (iL & 3) != 0 && !z10) {
                    bArr[i11] = (byte) e(i9, iL);
                    i12 -= 2;
                    i10 += 2;
                    i11++;
                    z10 = true;
                } else if (i12 == i9 + 4 && i10 == 2 && (iL & 7) == 0 && !z11) {
                    bArr[i11] = (byte) f(i9, iL);
                    i12 -= 2;
                    i10 += 2;
                    i11++;
                    z11 = true;
                } else if (i12 == i13 && i10 == 0 && (iL & 7) == 4 && !z12) {
                    bArr[i11] = (byte) g(i9, iL);
                    i12 -= 2;
                    i10 += 2;
                    i11++;
                    z12 = true;
                } else {
                    while (true) {
                        if (i12 < i9 && i10 >= 0 && !this.f2722b.f(i10, i12)) {
                            bArr[i11] = (byte) i(i12, i10, i9, iL);
                            i11++;
                        }
                        int i14 = i12 - 2;
                        int i15 = i10 + 2;
                        if (i14 < 0 || i15 >= iL) {
                            break;
                        }
                        i12 = i14;
                        i10 = i15;
                    }
                    int i16 = i12 - 1;
                    int i17 = i10 + 5;
                    while (true) {
                        if (i16 >= 0 && i17 < iL && !this.f2722b.f(i17, i16)) {
                            bArr[i11] = (byte) i(i16, i17, i9, iL);
                            i11++;
                        }
                        int i18 = i16 + 2;
                        int i19 = i17 - 2;
                        if (i18 >= i9 || i19 < 0) {
                            break;
                        }
                        i16 = i18;
                        i17 = i19;
                    }
                    i12 = i16 + 5;
                    i10 = i17 - 1;
                }
            }
            if (i12 >= i9 && i10 >= iL) {
                break;
            }
        }
        if (i11 == this.f2723c.g()) {
            return bArr;
        }
        throw g.a();
    }

    public final int d(int i9, int i10) {
        int i11 = i9 - 1;
        int i12 = (h(i11, 0, i9, i10) ? 1 : 0) << 1;
        if (h(i11, 1, i9, i10)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (h(i11, 2, i9, i10)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (h(0, i10 - 2, i9, i10)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        int i16 = i10 - 1;
        if (h(0, i16, i9, i10)) {
            i15 |= 1;
        }
        int i17 = i15 << 1;
        if (h(1, i16, i9, i10)) {
            i17 |= 1;
        }
        int i18 = i17 << 1;
        if (h(2, i16, i9, i10)) {
            i18 |= 1;
        }
        int i19 = i18 << 1;
        return h(3, i16, i9, i10) ? i19 | 1 : i19;
    }

    public final int e(int i9, int i10) {
        int i11 = (h(i9 + (-3), 0, i9, i10) ? 1 : 0) << 1;
        if (h(i9 - 2, 0, i9, i10)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (h(i9 - 1, 0, i9, i10)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (h(0, i10 - 4, i9, i10)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (h(0, i10 - 3, i9, i10)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        if (h(0, i10 - 2, i9, i10)) {
            i15 |= 1;
        }
        int i16 = i15 << 1;
        int i17 = i10 - 1;
        if (h(0, i17, i9, i10)) {
            i16 |= 1;
        }
        int i18 = i16 << 1;
        return h(1, i17, i9, i10) ? i18 | 1 : i18;
    }

    public final int f(int i9, int i10) {
        int i11 = i9 - 1;
        int i12 = (h(i11, 0, i9, i10) ? 1 : 0) << 1;
        int i13 = i10 - 1;
        if (h(i11, i13, i9, i10)) {
            i12 |= 1;
        }
        int i14 = i12 << 1;
        int i15 = i10 - 3;
        if (h(0, i15, i9, i10)) {
            i14 |= 1;
        }
        int i16 = i14 << 1;
        int i17 = i10 - 2;
        if (h(0, i17, i9, i10)) {
            i16 |= 1;
        }
        int i18 = i16 << 1;
        if (h(0, i13, i9, i10)) {
            i18 |= 1;
        }
        int i19 = i18 << 1;
        if (h(1, i15, i9, i10)) {
            i19 |= 1;
        }
        int i20 = i19 << 1;
        if (h(1, i17, i9, i10)) {
            i20 |= 1;
        }
        int i21 = i20 << 1;
        return h(1, i13, i9, i10) ? i21 | 1 : i21;
    }

    public final int g(int i9, int i10) {
        int i11 = (h(i9 + (-3), 0, i9, i10) ? 1 : 0) << 1;
        if (h(i9 - 2, 0, i9, i10)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (h(i9 - 1, 0, i9, i10)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (h(0, i10 - 2, i9, i10)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        int i15 = i10 - 1;
        if (h(0, i15, i9, i10)) {
            i14 |= 1;
        }
        int i16 = i14 << 1;
        if (h(1, i15, i9, i10)) {
            i16 |= 1;
        }
        int i17 = i16 << 1;
        if (h(2, i15, i9, i10)) {
            i17 |= 1;
        }
        int i18 = i17 << 1;
        return h(3, i15, i9, i10) ? i18 | 1 : i18;
    }

    public final boolean h(int i9, int i10, int i11, int i12) {
        if (i9 < 0) {
            i9 += i11;
            i10 += 4 - ((i11 + 4) & 7);
        }
        if (i10 < 0) {
            i10 += i12;
            i9 += 4 - ((i12 + 4) & 7);
        }
        this.f2722b.n(i10, i9);
        return this.f2721a.f(i10, i9);
    }

    public final int i(int i9, int i10, int i11, int i12) {
        int i13 = i9 - 2;
        int i14 = i10 - 2;
        int i15 = (h(i13, i14, i11, i12) ? 1 : 0) << 1;
        int i16 = i10 - 1;
        if (h(i13, i16, i11, i12)) {
            i15 |= 1;
        }
        int i17 = i15 << 1;
        int i18 = i9 - 1;
        if (h(i18, i14, i11, i12)) {
            i17 |= 1;
        }
        int i19 = i17 << 1;
        if (h(i18, i16, i11, i12)) {
            i19 |= 1;
        }
        int i20 = i19 << 1;
        if (h(i18, i10, i11, i12)) {
            i20 |= 1;
        }
        int i21 = i20 << 1;
        if (h(i9, i14, i11, i12)) {
            i21 |= 1;
        }
        int i22 = i21 << 1;
        if (h(i9, i16, i11, i12)) {
            i22 |= 1;
        }
        int i23 = i22 << 1;
        return h(i9, i10, i11, i12) ? i23 | 1 : i23;
    }
}
