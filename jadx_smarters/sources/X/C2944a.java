package x;

import w.C2899d;
import x.e;

/* JADX INFO: renamed from: x.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2944a extends i {

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f51720y0 = 0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f51721z0 = true;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public int f51719A0 = 0;

    public boolean G0() {
        return this.f51721z0;
    }

    public int H0() {
        return this.f51720y0;
    }

    public int I0() {
        return this.f51719A0;
    }

    public void J0() {
        for (int i9 = 0; i9 < this.f51859x0; i9++) {
            e eVar = this.f51858w0[i9];
            int i10 = this.f51720y0;
            if (i10 == 0 || i10 == 1) {
                eVar.l0(0, true);
            } else if (i10 == 2 || i10 == 3) {
                eVar.l0(1, true);
            }
        }
    }

    public void K0(boolean z9) {
        this.f51721z0 = z9;
    }

    public void L0(int i9) {
        this.f51720y0 = i9;
    }

    public void M0(int i9) {
        this.f51719A0 = i9;
    }

    @Override // x.e
    public void f(C2899d c2899d) {
        d[] dVarArr;
        boolean z9;
        w.i iVar;
        d dVar;
        int i9;
        int i10;
        int i11;
        d[] dVarArr2 = this.f51762J;
        dVarArr2[0] = this.f51754B;
        dVarArr2[2] = this.f51755C;
        dVarArr2[1] = this.f51756D;
        dVarArr2[3] = this.f51757E;
        int i12 = 0;
        while (true) {
            dVarArr = this.f51762J;
            if (i12 >= dVarArr.length) {
                break;
            }
            d dVar2 = dVarArr[i12];
            dVar2.f51750g = c2899d.q(dVar2);
            i12++;
        }
        int i13 = this.f51720y0;
        if (i13 < 0 || i13 >= 4) {
            return;
        }
        d dVar3 = dVarArr[i13];
        for (int i14 = 0; i14 < this.f51859x0; i14++) {
            e eVar = this.f51858w0[i14];
            if ((this.f51721z0 || eVar.g()) && ((((i10 = this.f51720y0) == 0 || i10 == 1) && eVar.w() == e.b.MATCH_CONSTRAINT && eVar.f51754B.f51747d != null && eVar.f51756D.f51747d != null) || (((i11 = this.f51720y0) == 2 || i11 == 3) && eVar.K() == e.b.MATCH_CONSTRAINT && eVar.f51755C.f51747d != null && eVar.f51757E.f51747d != null))) {
                z9 = true;
                break;
            }
        }
        z9 = false;
        boolean z10 = this.f51754B.h() || this.f51756D.h();
        boolean z11 = this.f51755C.h() || this.f51757E.h();
        int i15 = !(!z9 && (((i9 = this.f51720y0) == 0 && z10) || ((i9 == 2 && z11) || ((i9 == 1 && z10) || (i9 == 3 && z11))))) ? 4 : 5;
        for (int i16 = 0; i16 < this.f51859x0; i16++) {
            e eVar2 = this.f51858w0[i16];
            if (this.f51721z0 || eVar2.g()) {
                w.i iVarQ = c2899d.q(eVar2.f51762J[this.f51720y0]);
                d[] dVarArr3 = eVar2.f51762J;
                int i17 = this.f51720y0;
                d dVar4 = dVarArr3[i17];
                dVar4.f51750g = iVarQ;
                d dVar5 = dVar4.f51747d;
                int i18 = (dVar5 == null || dVar5.f51745b != this) ? 0 : dVar4.f51748e;
                if (i17 == 0 || i17 == 2) {
                    c2899d.i(dVar3.f51750g, iVarQ, this.f51719A0 - i18, z9);
                } else {
                    c2899d.g(dVar3.f51750g, iVarQ, this.f51719A0 + i18, z9);
                }
                c2899d.e(dVar3.f51750g, iVarQ, this.f51719A0 + i18, i15);
            }
        }
        int i19 = this.f51720y0;
        if (i19 == 0) {
            c2899d.e(this.f51756D.f51750g, this.f51754B.f51750g, 0, 8);
            c2899d.e(this.f51754B.f51750g, this.f51766N.f51756D.f51750g, 0, 4);
            iVar = this.f51754B.f51750g;
            dVar = this.f51766N.f51754B;
        } else if (i19 == 1) {
            c2899d.e(this.f51754B.f51750g, this.f51756D.f51750g, 0, 8);
            c2899d.e(this.f51754B.f51750g, this.f51766N.f51754B.f51750g, 0, 4);
            iVar = this.f51754B.f51750g;
            dVar = this.f51766N.f51756D;
        } else if (i19 == 2) {
            c2899d.e(this.f51757E.f51750g, this.f51755C.f51750g, 0, 8);
            c2899d.e(this.f51755C.f51750g, this.f51766N.f51757E.f51750g, 0, 4);
            iVar = this.f51755C.f51750g;
            dVar = this.f51766N.f51755C;
        } else {
            if (i19 != 3) {
                return;
            }
            c2899d.e(this.f51755C.f51750g, this.f51757E.f51750g, 0, 8);
            c2899d.e(this.f51755C.f51750g, this.f51766N.f51755C.f51750g, 0, 4);
            iVar = this.f51755C.f51750g;
            dVar = this.f51766N.f51757E;
        }
        c2899d.e(iVar, dVar.f51750g, 0, 0);
    }

    @Override // x.e
    public boolean g() {
        return true;
    }

    @Override // x.e
    public String toString() {
        String str = "[Barrier] " + p() + " {";
        for (int i9 = 0; i9 < this.f51859x0; i9++) {
            e eVar = this.f51858w0[i9];
            if (i9 > 0) {
                str = str + ", ";
            }
            str = str + eVar.p();
        }
        return str + "}";
    }
}
