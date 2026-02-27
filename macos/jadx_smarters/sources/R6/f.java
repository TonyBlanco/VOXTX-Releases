package R6;

import java.util.Formatter;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f9338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g[] f9339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f9340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9341d;

    public f(a aVar, c cVar) {
        this.f9338a = aVar;
        int iA = aVar.a();
        this.f9341d = iA;
        this.f9340c = cVar;
        this.f9339b = new g[iA + 2];
    }

    public static boolean b(d dVar, d dVar2) {
        if (dVar2 == null || !dVar2.g() || dVar2.a() != dVar.a()) {
            return false;
        }
        dVar.i(dVar2.c());
        return true;
    }

    public static int c(int i9, int i10, d dVar) {
        if (dVar == null || dVar.g()) {
            return i10;
        }
        if (!dVar.h(i9)) {
            return i10 + 1;
        }
        dVar.i(i9);
        return 0;
    }

    public final void a(g gVar) {
        if (gVar != null) {
            ((h) gVar).g(this.f9338a);
        }
    }

    public final int d() {
        int iF = f();
        if (iF == 0) {
            return 0;
        }
        for (int i9 = 1; i9 < this.f9341d + 1; i9++) {
            d[] dVarArrD = this.f9339b[i9].d();
            for (int i10 = 0; i10 < dVarArrD.length; i10++) {
                d dVar = dVarArrD[i10];
                if (dVar != null && !dVar.g()) {
                    e(i9, i10, dVarArrD);
                }
            }
        }
        return iF;
    }

    public final void e(int i9, int i10, d[] dVarArr) {
        d dVar = dVarArr[i10];
        d[] dVarArrD = this.f9339b[i9 - 1].d();
        g gVar = this.f9339b[i9 + 1];
        d[] dVarArrD2 = gVar != null ? gVar.d() : dVarArrD;
        d[] dVarArr2 = new d[14];
        dVarArr2[2] = dVarArrD[i10];
        dVarArr2[3] = dVarArrD2[i10];
        if (i10 > 0) {
            int i11 = i10 - 1;
            dVarArr2[0] = dVarArr[i11];
            dVarArr2[4] = dVarArrD[i11];
            dVarArr2[5] = dVarArrD2[i11];
        }
        if (i10 > 1) {
            int i12 = i10 - 2;
            dVarArr2[8] = dVarArr[i12];
            dVarArr2[10] = dVarArrD[i12];
            dVarArr2[11] = dVarArrD2[i12];
        }
        if (i10 < dVarArr.length - 1) {
            int i13 = i10 + 1;
            dVarArr2[1] = dVarArr[i13];
            dVarArr2[6] = dVarArrD[i13];
            dVarArr2[7] = dVarArrD2[i13];
        }
        if (i10 < dVarArr.length - 2) {
            int i14 = i10 + 2;
            dVarArr2[9] = dVarArr[i14];
            dVarArr2[12] = dVarArrD[i14];
            dVarArr2[13] = dVarArrD2[i14];
        }
        for (int i15 = 0; i15 < 14 && !b(dVar, dVarArr2[i15]); i15++) {
        }
    }

    public final int f() {
        g();
        return h() + i();
    }

    public final void g() {
        g[] gVarArr = this.f9339b;
        g gVar = gVarArr[0];
        if (gVar == null || gVarArr[this.f9341d + 1] == null) {
            return;
        }
        d[] dVarArrD = gVar.d();
        d[] dVarArrD2 = this.f9339b[this.f9341d + 1].d();
        for (int i9 = 0; i9 < dVarArrD.length; i9++) {
            d dVar = dVarArrD[i9];
            if (dVar != null && dVarArrD2[i9] != null && dVar.c() == dVarArrD2[i9].c()) {
                for (int i10 = 1; i10 <= this.f9341d; i10++) {
                    d dVar2 = this.f9339b[i10].d()[i9];
                    if (dVar2 != null) {
                        dVar2.i(dVarArrD[i9].c());
                        if (!dVar2.g()) {
                            this.f9339b[i10].d()[i9] = null;
                        }
                    }
                }
            }
        }
    }

    public final int h() {
        g gVar = this.f9339b[0];
        if (gVar == null) {
            return 0;
        }
        d[] dVarArrD = gVar.d();
        int i9 = 0;
        for (int i10 = 0; i10 < dVarArrD.length; i10++) {
            d dVar = dVarArrD[i10];
            if (dVar != null) {
                int iC = dVar.c();
                int iC2 = 0;
                for (int i11 = 1; i11 < this.f9341d + 1 && iC2 < 2; i11++) {
                    d dVar2 = this.f9339b[i11].d()[i10];
                    if (dVar2 != null) {
                        iC2 = c(iC, iC2, dVar2);
                        if (!dVar2.g()) {
                            i9++;
                        }
                    }
                }
            }
        }
        return i9;
    }

    public final int i() {
        g[] gVarArr = this.f9339b;
        int i9 = this.f9341d;
        if (gVarArr[i9 + 1] == null) {
            return 0;
        }
        d[] dVarArrD = gVarArr[i9 + 1].d();
        int i10 = 0;
        for (int i11 = 0; i11 < dVarArrD.length; i11++) {
            d dVar = dVarArrD[i11];
            if (dVar != null) {
                int iC = dVar.c();
                int iC2 = 0;
                for (int i12 = this.f9341d + 1; i12 > 0 && iC2 < 2; i12--) {
                    d dVar2 = this.f9339b[i12].d()[i11];
                    if (dVar2 != null) {
                        iC2 = c(iC, iC2, dVar2);
                        if (!dVar2.g()) {
                            i10++;
                        }
                    }
                }
            }
        }
        return i10;
    }

    public int j() {
        return this.f9341d;
    }

    public int k() {
        return this.f9338a.b();
    }

    public int l() {
        return this.f9338a.c();
    }

    public c m() {
        return this.f9340c;
    }

    public g n(int i9) {
        return this.f9339b[i9];
    }

    public g[] o() {
        a(this.f9339b[0]);
        a(this.f9339b[this.f9341d + 1]);
        int i9 = 928;
        while (true) {
            int iD = d();
            if (iD <= 0 || iD >= i9) {
                break;
            }
            i9 = iD;
        }
        return this.f9339b;
    }

    public void p(c cVar) {
        this.f9340c = cVar;
    }

    public void q(int i9, g gVar) {
        this.f9339b[i9] = gVar;
    }

    public String toString() {
        g[] gVarArr = this.f9339b;
        g gVar = gVarArr[0];
        if (gVar == null) {
            gVar = gVarArr[this.f9341d + 1];
        }
        Formatter formatter = new Formatter();
        for (int i9 = 0; i9 < gVar.d().length; i9++) {
            try {
                formatter.format("CW %3d:", Integer.valueOf(i9));
                for (int i10 = 0; i10 < this.f9341d + 2; i10++) {
                    g gVar2 = this.f9339b[i10];
                    if (gVar2 == null) {
                        formatter.format("    |   ", new Object[0]);
                    } else {
                        d dVar = gVar2.d()[i9];
                        if (dVar == null) {
                            formatter.format("    |   ", new Object[0]);
                        } else {
                            formatter.format(" %3d|%3d", Integer.valueOf(dVar.c()), Integer.valueOf(dVar.e()));
                        }
                    }
                }
                formatter.format("%n", new Object[0]);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        formatter.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
        String string = formatter.toString();
        formatter.close();
        return string;
    }
}
