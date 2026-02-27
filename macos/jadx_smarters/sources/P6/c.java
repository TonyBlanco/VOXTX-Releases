package P6;

/* JADX INFO: loaded from: classes.dex */
public final class c extends h {
    public c(D6.a aVar) {
        super(aVar);
    }

    @Override // P6.j
    public String d() throws x6.k {
        if (c().l() < 48) {
            throw x6.k.a();
        }
        StringBuilder sb = new StringBuilder();
        f(sb, 8);
        int iF = b().f(48, 2);
        sb.append("(392");
        sb.append(iF);
        sb.append(')');
        sb.append(b().c(50, null).b());
        return sb.toString();
    }
}
