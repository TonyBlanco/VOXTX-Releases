package P6;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends i {
    public f(D6.a aVar) {
        super(aVar);
    }

    @Override // P6.j
    public String d() throws x6.k {
        if (c().l() != 60) {
            throw x6.k.a();
        }
        StringBuilder sb = new StringBuilder();
        f(sb, 5);
        j(sb, 45, 15);
        return sb.toString();
    }
}
