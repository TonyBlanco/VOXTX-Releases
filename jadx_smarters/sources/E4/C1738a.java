package e4;

import O2.C0897l1;
import d4.AbstractC1689f;
import d4.G;
import d4.M;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: e4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1738a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f40182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f40184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f40185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f40186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f40187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f40188g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f40189h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f40190i;

    public C1738a(List list, int i9, int i10, int i11, int i12, int i13, int i14, float f9, String str) {
        this.f40182a = list;
        this.f40183b = i9;
        this.f40184c = i10;
        this.f40185d = i11;
        this.f40186e = i12;
        this.f40187f = i13;
        this.f40188g = i14;
        this.f40189h = f9;
        this.f40190i = str;
    }

    public static byte[] a(M m9) {
        int iN = m9.N();
        int iF = m9.f();
        m9.V(iN);
        return AbstractC1689f.d(m9.e(), iF, iN);
    }

    public static C1738a b(M m9) throws C0897l1 {
        String strA;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        float f9;
        try {
            m9.V(4);
            int iH = (m9.H() & 3) + 1;
            if (iH == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iH2 = m9.H() & 31;
            for (int i14 = 0; i14 < iH2; i14++) {
                arrayList.add(a(m9));
            }
            int iH3 = m9.H();
            for (int i15 = 0; i15 < iH3; i15++) {
                arrayList.add(a(m9));
            }
            if (iH2 > 0) {
                G.c cVarL = G.l((byte[]) arrayList.get(0), iH, ((byte[]) arrayList.get(0)).length);
                int i16 = cVarL.f39679f;
                int i17 = cVarL.f39680g;
                int i18 = cVarL.f39688o;
                int i19 = cVarL.f39689p;
                int i20 = cVarL.f39690q;
                float f10 = cVarL.f39681h;
                strA = AbstractC1689f.a(cVarL.f39674a, cVarL.f39675b, cVarL.f39676c);
                i12 = i19;
                i13 = i20;
                f9 = f10;
                i9 = i16;
                i10 = i17;
                i11 = i18;
            } else {
                strA = null;
                i9 = -1;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                f9 = 1.0f;
            }
            return new C1738a(arrayList, iH, i9, i10, i11, i12, i13, f9, strA);
        } catch (ArrayIndexOutOfBoundsException e9) {
            throw C0897l1.a("Error parsing AVC config", e9);
        }
    }
}
