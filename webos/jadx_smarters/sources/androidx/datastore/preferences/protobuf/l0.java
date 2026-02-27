package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class l0 {
    public abstract void a(Object obj, int i9, int i10);

    public abstract void b(Object obj, int i9, long j9);

    public abstract void c(Object obj, int i9, Object obj2);

    public abstract void d(Object obj, int i9, AbstractC1122g abstractC1122g);

    public abstract void e(Object obj, int i9, long j9);

    public abstract Object f(Object obj);

    public abstract Object g(Object obj);

    public abstract int h(Object obj);

    public abstract int i(Object obj);

    public abstract void j(Object obj);

    public abstract Object k(Object obj, Object obj2);

    public final void l(Object obj, d0 d0Var) {
        while (d0Var.E() != Integer.MAX_VALUE && m(obj, d0Var)) {
        }
    }

    public final boolean m(Object obj, d0 d0Var) throws C1140z {
        int tag = d0Var.getTag();
        int iA = r0.a(tag);
        int iB = r0.b(tag);
        if (iB == 0) {
            e(obj, iA, d0Var.N());
            return true;
        }
        if (iB == 1) {
            b(obj, iA, d0Var.b());
            return true;
        }
        if (iB == 2) {
            d(obj, iA, d0Var.p());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw C1140z.d();
            }
            a(obj, iA, d0Var.x());
            return true;
        }
        Object objN = n();
        int iC = r0.c(iA, 4);
        l(objN, d0Var);
        if (iC != d0Var.getTag()) {
            throw C1140z.a();
        }
        c(obj, iA, r(objN));
        return true;
    }

    public abstract Object n();

    public abstract void o(Object obj, Object obj2);

    public abstract void p(Object obj, Object obj2);

    public abstract boolean q(d0 d0Var);

    public abstract Object r(Object obj);

    public abstract void s(Object obj, s0 s0Var);

    public abstract void t(Object obj, s0 s0Var);
}
