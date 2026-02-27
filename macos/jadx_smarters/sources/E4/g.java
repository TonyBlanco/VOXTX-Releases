package e4;

import O2.C0897l1;
import d4.AbstractC1689f;
import d4.G;
import d4.M;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f40259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f40261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f40262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f40263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f40264f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f40265g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f40266h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f40267i;

    public g(List list, int i9, int i10, int i11, int i12, int i13, int i14, float f9, String str) {
        this.f40259a = list;
        this.f40260b = i9;
        this.f40261c = i10;
        this.f40262d = i11;
        this.f40263e = i12;
        this.f40264f = i13;
        this.f40265g = i14;
        this.f40266h = f9;
        this.f40267i = str;
    }

    public static g a(M m9) throws C0897l1 {
        int i9;
        int i10;
        try {
            m9.V(21);
            int iH = m9.H() & 3;
            int iH2 = m9.H();
            int iF = m9.f();
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < iH2; i13++) {
                m9.V(1);
                int iN = m9.N();
                for (int i14 = 0; i14 < iN; i14++) {
                    int iN2 = m9.N();
                    i12 += iN2 + 4;
                    m9.V(iN2);
                }
            }
            m9.U(iF);
            byte[] bArr = new byte[i12];
            String strC = null;
            int i15 = 0;
            int i16 = 0;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            float f9 = 1.0f;
            while (i15 < iH2) {
                int iH3 = m9.H() & 63;
                int iN3 = m9.N();
                int i22 = 0;
                while (i22 < iN3) {
                    int iN4 = m9.N();
                    byte[] bArr2 = G.f39651a;
                    int i23 = iH2;
                    System.arraycopy(bArr2, i11, bArr, i16, bArr2.length);
                    int length = i16 + bArr2.length;
                    System.arraycopy(m9.e(), m9.f(), bArr, length, iN4);
                    if (iH3 == 33 && i22 == 0) {
                        G.a aVarH = G.h(bArr, length, length + iN4);
                        int i24 = aVarH.f39665k;
                        i18 = aVarH.f39666l;
                        i19 = aVarH.f39668n;
                        int i25 = aVarH.f39669o;
                        int i26 = aVarH.f39670p;
                        float f10 = aVarH.f39667m;
                        i9 = iH3;
                        i10 = iN3;
                        i17 = i24;
                        strC = AbstractC1689f.c(aVarH.f39655a, aVarH.f39656b, aVarH.f39657c, aVarH.f39658d, aVarH.f39662h, aVarH.f39663i);
                        i21 = i26;
                        i20 = i25;
                        f9 = f10;
                    } else {
                        i9 = iH3;
                        i10 = iN3;
                    }
                    i16 = length + iN4;
                    m9.V(iN4);
                    i22++;
                    iH2 = i23;
                    iH3 = i9;
                    iN3 = i10;
                    i11 = 0;
                }
                i15++;
                i11 = 0;
            }
            return new g(i12 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iH + 1, i17, i18, i19, i20, i21, f9, strC);
        } catch (ArrayIndexOutOfBoundsException e9) {
            throw C0897l1.a("Error parsing HEVC config", e9);
        }
    }
}
