package P6;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends h {
    public i(D6.a aVar) {
        super(aVar);
    }

    public abstract void h(StringBuilder sb, int i9);

    public abstract int i(int i9);

    public final void j(StringBuilder sb, int i9, int i10) {
        int iF = b().f(i9, i10);
        h(sb, iF);
        int i11 = i(iF);
        int i12 = 100000;
        for (int i13 = 0; i13 < 5; i13++) {
            if (i11 / i12 == 0) {
                sb.append('0');
            }
            i12 /= 10;
        }
        sb.append(i11);
    }
}
