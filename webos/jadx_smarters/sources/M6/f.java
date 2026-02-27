package M6;

import x6.EnumC2960a;

/* JADX INFO: loaded from: classes.dex */
public final class f extends p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f5186i = new int[4];

    @Override // M6.p
    public int l(D6.a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f5186i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int iL = aVar.l();
        int i9 = iArr[1];
        for (int i10 = 0; i10 < 4 && i9 < iL; i10++) {
            sb.append((char) (p.j(aVar, iArr2, i9, p.f5210g) + 48));
            for (int i11 : iArr2) {
                i9 += i11;
            }
        }
        int i12 = p.n(aVar, i9, true, p.f5208e)[1];
        for (int i13 = 0; i13 < 4 && i12 < iL; i13++) {
            sb.append((char) (p.j(aVar, iArr2, i12, p.f5210g) + 48));
            for (int i14 : iArr2) {
                i12 += i14;
            }
        }
        return i12;
    }

    @Override // M6.p
    public EnumC2960a q() {
        return EnumC2960a.EAN_8;
    }
}
