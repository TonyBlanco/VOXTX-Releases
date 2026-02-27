package E6;

import x6.k;
import x6.q;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D6.b f1700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1705f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1706g;

    public b(D6.b bVar) {
        this(bVar, 10, bVar.l() / 2, bVar.i() / 2);
    }

    public b(D6.b bVar, int i9, int i10, int i11) throws k {
        this.f1700a = bVar;
        int i12 = bVar.i();
        this.f1701b = i12;
        int iL = bVar.l();
        this.f1702c = iL;
        int i13 = i9 / 2;
        int i14 = i10 - i13;
        this.f1703d = i14;
        int i15 = i10 + i13;
        this.f1704e = i15;
        int i16 = i11 - i13;
        this.f1706g = i16;
        int i17 = i11 + i13;
        this.f1705f = i17;
        if (i16 < 0 || i14 < 0 || i17 >= i12 || i15 >= iL) {
            throw k.a();
        }
    }

    public final q[] a(q qVar, q qVar2, q qVar3, q qVar4) {
        float fC = qVar.c();
        float fD = qVar.d();
        float fC2 = qVar2.c();
        float fD2 = qVar2.d();
        float fC3 = qVar3.c();
        float fD3 = qVar3.d();
        float fC4 = qVar4.c();
        float fD4 = qVar4.d();
        return fC < ((float) this.f1702c) / 2.0f ? new q[]{new q(fC4 - 1.0f, fD4 + 1.0f), new q(fC2 + 1.0f, fD2 + 1.0f), new q(fC3 - 1.0f, fD3 - 1.0f), new q(fC + 1.0f, fD - 1.0f)} : new q[]{new q(fC4 + 1.0f, fD4 + 1.0f), new q(fC2 + 1.0f, fD2 - 1.0f), new q(fC3 - 1.0f, fD3 + 1.0f), new q(fC - 1.0f, fD - 1.0f)};
    }

    public final boolean b(int i9, int i10, int i11, boolean z9) {
        if (z9) {
            while (i9 <= i10) {
                if (this.f1700a.f(i9, i11)) {
                    return true;
                }
                i9++;
            }
            return false;
        }
        while (i9 <= i10) {
            if (this.f1700a.f(i11, i9)) {
                return true;
            }
            i9++;
        }
        return false;
    }

    public q[] c() throws k {
        int i9 = this.f1703d;
        int i10 = this.f1704e;
        int i11 = this.f1706g;
        int i12 = this.f1705f;
        boolean z9 = false;
        boolean z10 = true;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        while (z10) {
            boolean zB = true;
            boolean z15 = false;
            while (true) {
                if ((!zB && z11) || i10 >= this.f1702c) {
                    break;
                }
                zB = b(i11, i12, i10, false);
                if (zB) {
                    i10++;
                    z11 = true;
                    z15 = true;
                } else if (!z11) {
                    i10++;
                }
            }
            if (i10 < this.f1702c) {
                boolean zB2 = true;
                while (true) {
                    if ((!zB2 && z12) || i12 >= this.f1701b) {
                        break;
                    }
                    zB2 = b(i9, i10, i12, true);
                    if (zB2) {
                        i12++;
                        z12 = true;
                        z15 = true;
                    } else if (!z12) {
                        i12++;
                    }
                }
                if (i12 < this.f1701b) {
                    boolean zB3 = true;
                    while (true) {
                        if ((!zB3 && z13) || i9 < 0) {
                            break;
                        }
                        zB3 = b(i11, i12, i9, false);
                        if (zB3) {
                            i9--;
                            z13 = true;
                            z15 = true;
                        } else if (!z13) {
                            i9--;
                        }
                    }
                    if (i9 >= 0) {
                        z10 = z15;
                        boolean zB4 = true;
                        while (true) {
                            if ((!zB4 && z14) || i11 < 0) {
                                break;
                            }
                            zB4 = b(i9, i10, i11, true);
                            if (zB4) {
                                i11--;
                                z10 = true;
                                z14 = true;
                            } else if (!z14) {
                                i11--;
                            }
                        }
                        if (i11 < 0) {
                        }
                    }
                }
            }
            z9 = true;
            break;
        }
        if (z9) {
            throw k.a();
        }
        int i13 = i10 - i9;
        q qVarD = null;
        q qVarD2 = null;
        for (int i14 = 1; qVarD2 == null && i14 < i13; i14++) {
            qVarD2 = d(i9, i12 - i14, i9 + i14, i12);
        }
        if (qVarD2 == null) {
            throw k.a();
        }
        q qVarD3 = null;
        for (int i15 = 1; qVarD3 == null && i15 < i13; i15++) {
            qVarD3 = d(i9, i11 + i15, i9 + i15, i11);
        }
        if (qVarD3 == null) {
            throw k.a();
        }
        q qVarD4 = null;
        for (int i16 = 1; qVarD4 == null && i16 < i13; i16++) {
            qVarD4 = d(i10, i11 + i16, i10 - i16, i11);
        }
        if (qVarD4 == null) {
            throw k.a();
        }
        for (int i17 = 1; qVarD == null && i17 < i13; i17++) {
            qVarD = d(i10, i12 - i17, i10 - i17, i12);
        }
        if (qVarD != null) {
            return a(qVarD, qVarD2, qVarD4, qVarD3);
        }
        throw k.a();
    }

    public final q d(float f9, float f10, float f11, float f12) {
        int iC = a.c(a.a(f9, f10, f11, f12));
        float f13 = iC;
        float f14 = (f11 - f9) / f13;
        float f15 = (f12 - f10) / f13;
        for (int i9 = 0; i9 < iC; i9++) {
            float f16 = i9;
            int iC2 = a.c((f16 * f14) + f9);
            int iC3 = a.c((f16 * f15) + f10);
            if (this.f1700a.f(iC2, iC3)) {
                return new q(iC2, iC3);
            }
        }
        return null;
    }
}
