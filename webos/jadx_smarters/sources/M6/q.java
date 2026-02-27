package M6;

import x6.EnumC2960a;

/* JADX INFO: loaded from: classes.dex */
public final class q extends p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f5215j = {1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[][] f5216k = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f5217i = new int[4];

    public static String s(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb = new StringBuilder(12);
        sb.append(str.charAt(0));
        char c9 = cArr[5];
        switch (c9) {
            case '0':
            case '1':
            case '2':
                sb.append(cArr, 0, 2);
                sb.append(c9);
                sb.append("0000");
                sb.append(cArr, 2, 3);
                break;
            case '3':
                sb.append(cArr, 0, 3);
                sb.append("00000");
                sb.append(cArr, 3, 2);
                break;
            case '4':
                sb.append(cArr, 0, 4);
                sb.append("00000");
                sb.append(cArr[4]);
                break;
            default:
                sb.append(cArr, 0, 5);
                sb.append("0000");
                sb.append(c9);
                break;
        }
        if (str.length() >= 8) {
            sb.append(str.charAt(7));
        }
        return sb.toString();
    }

    public static void t(StringBuilder sb, int i9) throws x6.k {
        for (int i10 = 0; i10 <= 1; i10++) {
            for (int i11 = 0; i11 < 10; i11++) {
                if (i9 == f5216k[i10][i11]) {
                    sb.insert(0, (char) (i10 + 48));
                    sb.append((char) (i11 + 48));
                    return;
                }
            }
        }
        throw x6.k.a();
    }

    @Override // M6.p
    public boolean h(String str) {
        return super.h(s(str));
    }

    @Override // M6.p
    public int[] k(D6.a aVar, int i9) {
        return p.n(aVar, i9, true, f5215j);
    }

    @Override // M6.p
    public int l(D6.a aVar, int[] iArr, StringBuilder sb) throws x6.k {
        int[] iArr2 = this.f5217i;
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
        t(sb, i10);
        return i9;
    }

    @Override // M6.p
    public EnumC2960a q() {
        return EnumC2960a.UPC_E;
    }
}
