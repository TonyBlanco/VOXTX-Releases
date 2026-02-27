package P6;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends j {
    public h(D6.a aVar) {
        super(aVar);
    }

    public static void e(StringBuilder sb, int i9) {
        int i10 = 0;
        for (int i11 = 0; i11 < 13; i11++) {
            int iCharAt = sb.charAt(i11 + i9) - '0';
            if ((i11 & 1) == 0) {
                iCharAt *= 3;
            }
            i10 += iCharAt;
        }
        int i12 = 10 - (i10 % 10);
        sb.append(i12 != 10 ? i12 : 0);
    }

    public final void f(StringBuilder sb, int i9) {
        sb.append("(01)");
        int length = sb.length();
        sb.append('9');
        g(sb, i9, length);
    }

    public final void g(StringBuilder sb, int i9, int i10) {
        for (int i11 = 0; i11 < 4; i11++) {
            int iF = b().f((i11 * 10) + i9, 10);
            if (iF / 100 == 0) {
                sb.append('0');
            }
            if (iF / 10 == 0) {
                sb.append('0');
            }
            sb.append(iF);
        }
        e(sb, i10);
    }
}
