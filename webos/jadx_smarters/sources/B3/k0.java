package B3;

import B3.C;
import O2.H0;
import O2.Q1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k0 extends AbstractC0499g {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Void f595m = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C f596l;

    public k0(C c9) {
        this.f596l = c9;
    }

    public int A0(int i9) {
        return i9;
    }

    @Override // B3.AbstractC0499g
    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
    public final int r0(Void r12, int i9) {
        return A0(i9);
    }

    public abstract void C0(Q1 q12);

    @Override // B3.AbstractC0499g
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public final void s0(Void r12, C c9, Q1 q12) {
        C0(q12);
    }

    public final void E0() {
        u0(f595m, this.f596l);
    }

    public void F0() {
        E0();
    }

    @Override // B3.AbstractC0493a, B3.C
    public boolean S() {
        return this.f596l.S();
    }

    @Override // B3.AbstractC0493a, B3.C
    public Q1 U() {
        return this.f596l.U();
    }

    @Override // B3.C
    public H0 e() {
        return this.f596l.e();
    }

    @Override // B3.AbstractC0499g, B3.AbstractC0493a
    public final void l0(b4.S s9) {
        super.l0(s9);
        F0();
    }

    public C.b w0(C.b bVar) {
        return bVar;
    }

    @Override // B3.AbstractC0499g
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public final C.b p0(Void r12, C.b bVar) {
        return w0(bVar);
    }

    public long y0(long j9) {
        return j9;
    }

    @Override // B3.AbstractC0499g
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public final long q0(Void r12, long j9) {
        return y0(j9);
    }
}
