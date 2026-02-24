package com.google.ads.interactivemedia.v3.internal;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private wi f24974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private wq f24975b;

    public wj() {
    }

    public wj(byte[] bArr) {
        this();
    }

    public void g() {
        this.f24974a = null;
        this.f24975b = null;
    }

    public void h(C1295f c1295f) {
        throw null;
    }

    public void k() {
        throw null;
    }

    public abstract Pair l(wg wgVar, int[][][] iArr, int[] iArr2) throws ev;

    public final wq m() {
        wq wqVar = this.f24975b;
        af.t(wqVar);
        return wqVar;
    }

    public final void n(wi wiVar, wq wqVar) {
        this.f24974a = wiVar;
        this.f24975b = wqVar;
    }

    public final void o() {
        wi wiVar = this.f24974a;
        if (wiVar != null) {
            wiVar.j();
        }
    }

    public final wk p(hi[] hiVarArr, um umVar, te teVar, be beVar) throws ev {
        boolean z9;
        int[] iArr;
        int[] iArr2 = new int[3];
        bf[][] bfVarArr = new bf[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i9 = 0; i9 < 3; i9++) {
            int i10 = umVar.f24749b;
            bfVarArr[i9] = new bf[i10];
            iArr3[i9] = new int[i10][];
        }
        int i11 = 2;
        int[] iArr4 = new int[2];
        for (int i12 = 0; i12 < 2; i12++) {
            iArr4[i12] = hiVarArr[i12].e();
        }
        int i13 = 0;
        while (i13 < umVar.f24749b) {
            bf bfVarB = umVar.b(i13);
            int i14 = bfVarB.f21165c;
            int i15 = 0;
            int i16 = 2;
            int i17 = 0;
            boolean z10 = true;
            while (i15 < i11) {
                hi hiVar = hiVarArr[i15];
                int iMax = 0;
                for (int i18 = 0; i18 < bfVarB.f21163a; i18++) {
                    iMax = Math.max(iMax, fz.f(hiVar.P(bfVarB.b(i18))));
                }
                boolean z11 = iArr2[i15] == 0;
                if (iMax > i17) {
                    z10 = z11;
                    i16 = i15;
                    i17 = iMax;
                } else if (iMax == i17 && i14 == 5 && !z10 && z11) {
                    i16 = i15;
                    i17 = iMax;
                    z10 = true;
                }
                i15++;
                i11 = 2;
            }
            if (i16 == i11) {
                iArr = new int[bfVarB.f21163a];
            } else {
                hi hiVar2 = hiVarArr[i16];
                int[] iArr5 = new int[bfVarB.f21163a];
                for (int i19 = 0; i19 < bfVarB.f21163a; i19++) {
                    iArr5[i19] = hiVar2.P(bfVarB.b(i19));
                }
                iArr = iArr5;
            }
            int i20 = iArr2[i16];
            bfVarArr[i16][i20] = bfVarB;
            iArr3[i16][i20] = iArr;
            iArr2[i16] = i20 + 1;
            i13++;
            i11 = 2;
        }
        um[] umVarArr = new um[2];
        int[] iArr6 = new int[2];
        int i21 = 0;
        for (int i22 = 2; i21 < i22; i22 = 2) {
            int i23 = iArr2[i21];
            umVarArr[i21] = new um((bf[]) cq.ai(bfVarArr[i21], i23));
            iArr3[i21] = (int[][]) cq.ai(iArr3[i21], i23);
            hiVarArr[i21].L();
            iArr6[i21] = hiVarArr[i21].b();
            i21++;
        }
        wg wgVar = new wg(iArr6, umVarArr, iArr4, iArr3, new um((bf[]) cq.ai(bfVarArr[2], iArr2[2])));
        Pair pairL = l(wgVar, iArr3, iArr4);
        wh[] whVarArr = (wh[]) pairL.second;
        List[] listArr = new List[whVarArr.length];
        for (int i24 = 0; i24 < whVarArr.length; i24++) {
            wh whVar = whVarArr[i24];
            listArr[i24] = whVar != null ? avo.p(whVar) : avo.o();
        }
        avk avkVar = new avk();
        for (int i25 = 0; i25 < wgVar.a(); i25++) {
            um umVarD = wgVar.d(i25);
            List list = listArr[i25];
            for (int i26 = 0; i26 < umVarD.f24749b; i26++) {
                bf bfVarB2 = umVarD.b(i26);
                boolean z12 = wgVar.f(i25, i26) != 0;
                int i27 = bfVarB2.f21163a;
                int[] iArr7 = new int[i27];
                boolean[] zArr = new boolean[i27];
                for (int i28 = 0; i28 < bfVarB2.f21163a; i28++) {
                    iArr7[i28] = wgVar.c(i25, i26, i28);
                    int i29 = 0;
                    while (true) {
                        if (i29 >= list.size()) {
                            z9 = false;
                            break;
                        }
                        wh whVar2 = (wh) list.get(i29);
                        if (whVar2.q().equals(bfVarB2) && whVar2.l(i28) != -1) {
                            z9 = true;
                            break;
                        }
                        i29++;
                    }
                    zArr[i28] = z9;
                }
                avkVar.g(new bj(bfVarB2, z12, iArr7, zArr));
            }
        }
        um umVarE = wgVar.e();
        for (int i30 = 0; i30 < umVarE.f24749b; i30++) {
            bf bfVarB3 = umVarE.b(i30);
            int[] iArr8 = new int[bfVarB3.f21163a];
            Arrays.fill(iArr8, 0);
            avkVar.g(new bj(bfVarB3, false, iArr8, new boolean[bfVarB3.f21163a]));
        }
        return new wk((hj[]) pairL.first, (we[]) pairL.second, new bk(avkVar.f()), wgVar);
    }
}
