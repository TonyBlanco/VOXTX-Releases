package M6;

import x6.EnumC2960a;

/* JADX INFO: loaded from: classes.dex */
public final class e extends p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f5184j = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f5185i = new int[4];

    public static void s(StringBuilder sb, int i9) throws x6.k {
        for (int i10 = 0; i10 < 10; i10++) {
            if (i9 == f5184j[i10]) {
                sb.insert(0, (char) (i10 + 48));
                return;
            }
        }
        throw x6.k.a();
    }

    @Override // M6.p
    public int l(D6.a aVar, int[] iArr, StringBuilder sb) throws x6.k {
        int[] iArr2 = this.f5185i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int iL = aVar.l();
        int i9 = iArr[1];
        int i10 = 0;
        for (int i11 = 0; i11 < 6 && i9 < iL; i11++) {
            int iJ = p.j(aVar, iArr2, i9, p.f5211h);
            sb.append((char) ((iJ % 10) + 48));
            for (int i12 : iArr2) {
                i9 += i12;
            }
            if (iJ >= 10) {
                i10 |= 1 << (5 - i11);
            }
        }
        s(sb, i10);
        int i13 = p.n(aVar, i9, true, p.f5208e)[1];
        for (int i14 = 0; i14 < 6 && i13 < iL; i14++) {
            sb.append((char) (p.j(aVar, iArr2, i13, p.f5210g) + 48));
            for (int i15 : iArr2) {
                i13 += i15;
            }
        }
        return i13;
    }

    @Override // M6.p
    public EnumC2960a q() {
        return EnumC2960a.EAN_13;
    }
}
