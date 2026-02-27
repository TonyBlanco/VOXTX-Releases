package P6;

/* JADX INFO: loaded from: classes.dex */
public final class e extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7334d;

    public e(D6.a aVar, String str, String str2) {
        super(aVar);
        this.f7333c = str2;
        this.f7334d = str;
    }

    @Override // P6.j
    public String d() throws x6.k {
        if (c().l() != 84) {
            throw x6.k.a();
        }
        StringBuilder sb = new StringBuilder();
        f(sb, 8);
        j(sb, 48, 20);
        k(sb, 68);
        return sb.toString();
    }

    @Override // P6.i
    public void h(StringBuilder sb, int i9) {
        sb.append('(');
        sb.append(this.f7334d);
        sb.append(i9 / 100000);
        sb.append(')');
    }

    @Override // P6.i
    public int i(int i9) {
        return i9 % 100000;
    }

    public final void k(StringBuilder sb, int i9) {
        int iF = b().f(i9, 16);
        if (iF == 38400) {
            return;
        }
        sb.append('(');
        sb.append(this.f7333c);
        sb.append(')');
        int i10 = iF % 32;
        int i11 = iF / 32;
        int i12 = (i11 % 12) + 1;
        int i13 = i11 / 12;
        if (i13 / 10 == 0) {
            sb.append('0');
        }
        sb.append(i13);
        if (i12 / 10 == 0) {
            sb.append('0');
        }
        sb.append(i12);
        if (i10 / 10 == 0) {
            sb.append('0');
        }
        sb.append(i10);
    }
}
