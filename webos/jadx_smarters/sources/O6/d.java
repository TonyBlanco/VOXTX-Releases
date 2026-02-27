package O6;

import N6.f;
import P6.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.HttpStatus;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import x6.EnumC2960a;
import x6.k;
import x6.o;
import x6.q;

/* JADX INFO: loaded from: classes.dex */
public final class d extends N6.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f6698k = {7, 5, 4, 3, 1};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f6699l = {4, 20, 52, 104, HttpStatus.SC_NO_CONTENT};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f6700m = {0, 348, 1388, 2948, 3988};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[][] f6701n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[][] f6702o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, HttpStatus.SC_RESET_CONTENT}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, 133, 188, 142, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION, 187, 139, HttpStatus.SC_PARTIAL_CONTENT, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, IjkMediaMeta.FF_PROFILE_H264_HIGH_422, 155}, new int[]{43, 129, 176, 106, 107, IjkMediaMeta.FF_PROFILE_H264_HIGH_10, 119, 146}, new int[]{16, 48, IjkMediaMeta.FF_PROFILE_H264_HIGH_444, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, 200, 178, 112, 125, 164}, new int[]{70, 210, 208, HttpStatus.SC_ACCEPTED, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, HttpStatus.SC_NO_CONTENT, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, WebSocketProtocol.PAYLOAD_SHORT, 167}, new int[]{79, 26, 78, 23, 69, HttpStatus.SC_MULTI_STATUS, 199, 175}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[][] f6703p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f6704g = new ArrayList(11);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f6705h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f6706i = new int[2];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f6707j;

    public static boolean A(N6.c cVar, boolean z9, boolean z10) {
        return (cVar.c() == 0 && z9 && z10) ? false : true;
    }

    public static boolean B(Iterable iterable, Iterable iterable2) {
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                b bVar = (b) it2.next();
                Iterator it3 = cVar.a().iterator();
                while (it3.hasNext()) {
                    if (bVar.equals((b) it3.next())) {
                        break;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean C(List list) {
        for (int[] iArr : f6703p) {
            if (list.size() <= iArr.length) {
                for (int i9 = 0; i9 < list.size(); i9++) {
                    if (((b) list.get(i9)).a().c() != iArr[i9]) {
                        break;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static void E(Collection collection, Collection collection2) {
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.a().size() != collection.size()) {
                Iterator it2 = cVar.a().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        it.remove();
                        break;
                    } else if (!collection.contains((b) it2.next())) {
                        break;
                    }
                }
            }
        }
    }

    public static void G(int[] iArr) {
        int length = iArr.length;
        for (int i9 = 0; i9 < length / 2; i9++) {
            int i10 = iArr[i9];
            int i11 = (length - i9) - 1;
            iArr[i9] = iArr[i11];
            iArr[i11] = i10;
        }
    }

    public static o v(List list) {
        String strD = j.a(a.a(list)).d();
        q[] qVarArrA = ((b) list.get(0)).a().a();
        q[] qVarArrA2 = ((b) list.get(list.size() - 1)).a().a();
        return new o(strD, null, new q[]{qVarArrA[0], qVarArrA[1], qVarArrA2[0], qVarArrA2[1]}, EnumC2960a.RSS_EXPANDED);
    }

    public static int z(D6.a aVar, int i9) {
        return aVar.h(i9) ? aVar.j(aVar.k(i9)) : aVar.k(aVar.j(i9));
    }

    public final N6.c D(D6.a aVar, int i9, boolean z9) {
        int i10;
        int i11;
        int i12;
        if (z9) {
            int i13 = this.f6706i[0] - 1;
            while (i13 >= 0 && !aVar.h(i13)) {
                i13--;
            }
            int i14 = i13 + 1;
            int[] iArr = this.f6706i;
            i12 = iArr[0] - i14;
            i10 = iArr[1];
            i11 = i14;
        } else {
            int[] iArr2 = this.f6706i;
            int i15 = iArr2[0];
            int iK = aVar.k(iArr2[1] + 1);
            i10 = iK;
            i11 = i15;
            i12 = iK - this.f6706i[1];
        }
        int[] iArrJ = j();
        System.arraycopy(iArrJ, 0, iArrJ, 1, iArrJ.length - 1);
        iArrJ[0] = i12;
        try {
            return new N6.c(N6.a.q(iArrJ, f6701n), new int[]{i11, i10}, i11, i10, i9);
        } catch (k unused) {
            return null;
        }
    }

    public b F(D6.a aVar, List list, int i9) throws k {
        N6.c cVarD;
        N6.b bVarW;
        boolean z9 = list.size() % 2 == 0;
        if (this.f6707j) {
            z9 = !z9;
        }
        int iZ = -1;
        boolean z10 = true;
        do {
            y(aVar, list, iZ);
            cVarD = D(aVar, i9, z9);
            if (cVarD == null) {
                iZ = z(aVar, this.f6706i[0]);
            } else {
                z10 = false;
            }
        } while (z10);
        N6.b bVarW2 = w(aVar, cVarD, z9, true);
        if (!list.isEmpty() && ((b) list.get(list.size() - 1)).d()) {
            throw k.a();
        }
        try {
            bVarW = w(aVar, cVarD, z9, false);
        } catch (k unused) {
            bVarW = null;
        }
        return new b(bVarW2, bVarW, cVarD);
    }

    public final void H(int i9) {
        boolean zC;
        int i10 = 0;
        boolean zC2 = false;
        while (true) {
            if (i10 >= this.f6705h.size()) {
                zC = false;
                break;
            }
            c cVar = (c) this.f6705h.get(i10);
            if (cVar.b() > i9) {
                zC = cVar.c(this.f6704g);
                break;
            } else {
                zC2 = cVar.c(this.f6704g);
                i10++;
            }
        }
        if (zC || zC2 || B(this.f6704g, this.f6705h)) {
            return;
        }
        this.f6705h.add(i10, new c(this.f6704g, i9, false));
        E(this.f6704g, this.f6705h);
    }

    @Override // M6.k
    public o c(int i9, D6.a aVar, Map map) {
        this.f6704g.clear();
        this.f6707j = false;
        try {
            return v(x(i9, aVar));
        } catch (k unused) {
            this.f6704g.clear();
            this.f6707j = true;
            return v(x(i9, aVar));
        }
    }

    public final void r(int i9) throws k {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        int iD = E6.a.d(m());
        int iD2 = E6.a.d(k());
        boolean z13 = true;
        if (iD > 13) {
            z9 = false;
            z10 = true;
        } else {
            z9 = iD < 4;
            z10 = false;
        }
        if (iD2 > 13) {
            z11 = false;
            z12 = true;
        } else {
            z11 = iD2 < 4;
            z12 = false;
        }
        int i10 = (iD + iD2) - i9;
        boolean z14 = (iD & 1) == 1;
        boolean z15 = (iD2 & 1) == 0;
        if (i10 != -1) {
            if (i10 != 0) {
                if (i10 != 1) {
                    throw k.a();
                }
                if (z14) {
                    if (z15) {
                        throw k.a();
                    }
                    z13 = z9;
                    z10 = true;
                } else {
                    if (!z15) {
                        throw k.a();
                    }
                    z13 = z9;
                    z12 = true;
                }
            } else if (z14) {
                if (!z15) {
                    throw k.a();
                }
                if (iD >= iD2) {
                    z13 = z9;
                    z11 = true;
                    z10 = true;
                }
                z12 = true;
            } else {
                if (z15) {
                    throw k.a();
                }
                z13 = z9;
            }
        } else if (z14) {
            if (z15) {
                throw k.a();
            }
        } else {
            if (!z15) {
                throw k.a();
            }
            z13 = z9;
            z11 = true;
        }
        if (z13) {
            if (z10) {
                throw k.a();
            }
            N6.a.o(m(), n());
        }
        if (z10) {
            N6.a.h(m(), n());
        }
        if (z11) {
            if (z12) {
                throw k.a();
            }
            N6.a.o(k(), n());
        }
        if (z12) {
            N6.a.h(k(), l());
        }
    }

    @Override // M6.k, x6.m
    public void reset() {
        this.f6704g.clear();
        this.f6705h.clear();
    }

    public final boolean s() {
        b bVar = (b) this.f6704g.get(0);
        N6.b bVarB = bVar.b();
        N6.b bVarC = bVar.c();
        if (bVarC == null) {
            return false;
        }
        int iA = bVarC.a();
        int i9 = 2;
        for (int i10 = 1; i10 < this.f6704g.size(); i10++) {
            b bVar2 = (b) this.f6704g.get(i10);
            iA += bVar2.b().a();
            int i11 = i9 + 1;
            N6.b bVarC2 = bVar2.c();
            if (bVarC2 != null) {
                iA += bVarC2.a();
                i9 += 2;
            } else {
                i9 = i11;
            }
        }
        return ((i9 + (-4)) * 211) + (iA % 211) == bVarB.b();
    }

    public final List t(List list, int i9) throws k {
        while (i9 < this.f6705h.size()) {
            c cVar = (c) this.f6705h.get(i9);
            this.f6704g.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f6704g.addAll(((c) it.next()).a());
            }
            this.f6704g.addAll(cVar.a());
            if (C(this.f6704g)) {
                if (s()) {
                    return this.f6704g;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(cVar);
                try {
                    return t(arrayList, i9 + 1);
                } catch (k unused) {
                    continue;
                }
            }
            i9++;
        }
        throw k.a();
    }

    public final List u(boolean z9) {
        List listT = null;
        if (this.f6705h.size() > 25) {
            this.f6705h.clear();
            return null;
        }
        this.f6704g.clear();
        if (z9) {
            Collections.reverse(this.f6705h);
        }
        try {
            listT = t(new ArrayList(), 0);
        } catch (k unused) {
        }
        if (z9) {
            Collections.reverse(this.f6705h);
        }
        return listT;
    }

    public N6.b w(D6.a aVar, N6.c cVar, boolean z9, boolean z10) throws k {
        int[] iArrI = i();
        Arrays.fill(iArrI, 0);
        int[] iArrB = cVar.b();
        if (z10) {
            M6.k.g(aVar, iArrB[0], iArrI);
        } else {
            M6.k.f(aVar, iArrB[1], iArrI);
            int i9 = 0;
            for (int length = iArrI.length - 1; i9 < length; length--) {
                int i10 = iArrI[i9];
                iArrI[i9] = iArrI[length];
                iArrI[length] = i10;
                i9++;
            }
        }
        float fD = E6.a.d(iArrI) / 17.0f;
        float f9 = (cVar.b()[1] - cVar.b()[0]) / 15.0f;
        if (Math.abs(fD - f9) / f9 > 0.3f) {
            throw k.a();
        }
        int[] iArrM = m();
        int[] iArrK = k();
        float[] fArrN = n();
        float[] fArrL = l();
        for (int i11 = 0; i11 < iArrI.length; i11++) {
            float f10 = (iArrI[i11] * 1.0f) / fD;
            int i12 = (int) (0.5f + f10);
            if (i12 <= 0) {
                if (f10 < 0.3f) {
                    throw k.a();
                }
                i12 = 1;
            } else if (i12 > 8) {
                if (f10 > 8.7f) {
                    throw k.a();
                }
                i12 = 8;
            }
            int i13 = i11 / 2;
            if ((i11 & 1) == 0) {
                iArrM[i13] = i12;
                fArrN[i13] = f10 - i12;
            } else {
                iArrK[i13] = i12;
                fArrL[i13] = f10 - i12;
            }
        }
        r(17);
        int iC = (((cVar.c() * 4) + (z9 ? 0 : 2)) + (!z10 ? 1 : 0)) - 1;
        int i14 = 0;
        int i15 = 0;
        for (int length2 = iArrM.length - 1; length2 >= 0; length2--) {
            if (A(cVar, z9, z10)) {
                i14 += iArrM[length2] * f6702o[iC][length2 * 2];
            }
            i15 += iArrM[length2];
        }
        int i16 = 0;
        for (int length3 = iArrK.length - 1; length3 >= 0; length3--) {
            if (A(cVar, z9, z10)) {
                i16 += iArrK[length3] * f6702o[iC][(length3 * 2) + 1];
            }
        }
        int i17 = i14 + i16;
        if ((i15 & 1) != 0 || i15 > 13 || i15 < 4) {
            throw k.a();
        }
        int i18 = (13 - i15) / 2;
        int i19 = f6698k[i18];
        return new N6.b((f.b(iArrM, i19, true) * f6699l[i18]) + f.b(iArrK, 9 - i19, false) + f6700m[i18], i17);
    }

    public List x(int i9, D6.a aVar) throws k {
        boolean z9 = false;
        while (!z9) {
            try {
                List list = this.f6704g;
                list.add(F(aVar, list, i9));
            } catch (k e9) {
                if (this.f6704g.isEmpty()) {
                    throw e9;
                }
                z9 = true;
            }
        }
        if (s()) {
            return this.f6704g;
        }
        boolean z10 = !this.f6705h.isEmpty();
        H(i9);
        if (z10) {
            List listU = u(false);
            if (listU != null) {
                return listU;
            }
            List listU2 = u(true);
            if (listU2 != null) {
                return listU2;
            }
        }
        throw k.a();
    }

    public final void y(D6.a aVar, List list, int i9) throws k {
        int[] iArrJ = j();
        iArrJ[0] = 0;
        iArrJ[1] = 0;
        iArrJ[2] = 0;
        iArrJ[3] = 0;
        int iL = aVar.l();
        if (i9 < 0) {
            i9 = list.isEmpty() ? 0 : ((b) list.get(list.size() - 1)).a().b()[1];
        }
        boolean z9 = list.size() % 2 != 0;
        if (this.f6707j) {
            z9 = !z9;
        }
        boolean z10 = false;
        while (i9 < iL) {
            z10 = !aVar.h(i9);
            if (!z10) {
                break;
            } else {
                i9++;
            }
        }
        boolean z11 = z10;
        int i10 = 0;
        int i11 = i9;
        while (i9 < iL) {
            if (aVar.h(i9) != z11) {
                iArrJ[i10] = iArrJ[i10] + 1;
            } else {
                if (i10 == 3) {
                    if (z9) {
                        G(iArrJ);
                    }
                    if (N6.a.p(iArrJ)) {
                        int[] iArr = this.f6706i;
                        iArr[0] = i11;
                        iArr[1] = i9;
                        return;
                    }
                    if (z9) {
                        G(iArrJ);
                    }
                    i11 += iArrJ[0] + iArrJ[1];
                    iArrJ[0] = iArrJ[2];
                    iArrJ[1] = iArrJ[3];
                    iArrJ[2] = 0;
                    iArrJ[3] = 0;
                    i10--;
                } else {
                    i10++;
                }
                iArrJ[i10] = 1;
                z11 = !z11;
            }
            i9++;
        }
        throw k.a();
    }
}
