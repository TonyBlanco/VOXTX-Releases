package C0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends k {
    public b(e eVar) {
        super(eVar);
    }

    public abstract void g(G0.f fVar, Object obj);

    public final void h(Object obj) {
        G0.f fVarA = a();
        try {
            g(fVarA, obj);
            fVarA.O();
        } finally {
            f(fVarA);
        }
    }
}
