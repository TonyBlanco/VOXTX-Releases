package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public class n0 extends l0 {
    @Override // androidx.datastore.preferences.protobuf.l0
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public m0 g(Object obj) {
        return ((AbstractC1137w) obj).unknownFields;
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int h(m0 m0Var) {
        return m0Var.f();
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public int i(m0 m0Var) {
        return m0Var.g();
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public m0 k(m0 m0Var, m0 m0Var2) {
        return m0Var2.equals(m0.e()) ? m0Var : m0.k(m0Var, m0Var2);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public m0 n() {
        return m0.l();
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void o(Object obj, m0 m0Var) {
        p(obj, m0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(Object obj, m0 m0Var) {
        ((AbstractC1137w) obj).unknownFields = m0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public m0 r(m0 m0Var) {
        m0Var.j();
        return m0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void s(m0 m0Var, s0 s0Var) {
        m0Var.o(s0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(m0 m0Var, s0 s0Var) {
        m0Var.q(s0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void j(Object obj) {
        g(obj).j();
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public boolean q(d0 d0Var) {
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(m0 m0Var, int i9, int i10) {
        m0Var.n(r0.c(i9, 5), Integer.valueOf(i10));
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void b(m0 m0Var, int i9, long j9) {
        m0Var.n(r0.c(i9, 1), Long.valueOf(j9));
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void c(m0 m0Var, int i9, m0 m0Var2) {
        m0Var.n(r0.c(i9, 3), m0Var2);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(m0 m0Var, int i9, AbstractC1122g abstractC1122g) {
        m0Var.n(r0.c(i9, 2), abstractC1122g);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void e(m0 m0Var, int i9, long j9) {
        m0Var.n(r0.c(i9, 0), Long.valueOf(j9));
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public m0 f(Object obj) {
        m0 m0VarG = g(obj);
        if (m0VarG != m0.e()) {
            return m0VarG;
        }
        m0 m0VarL = m0.l();
        p(obj, m0VarL);
        return m0VarL;
    }
}
