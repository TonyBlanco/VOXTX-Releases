package G8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class D0 extends D implements InterfaceC0566d0, InterfaceC0595s0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public E0 f2264e;

    public final E0 A() {
        E0 e02 = this.f2264e;
        if (e02 != null) {
            return e02;
        }
        kotlin.jvm.internal.l.s("job");
        return null;
    }

    public final void B(E0 e02) {
        this.f2264e = e02;
    }

    @Override // G8.InterfaceC0595s0
    public J0 c() {
        return null;
    }

    @Override // G8.InterfaceC0566d0
    public void dispose() {
        A().y0(this);
    }

    @Override // G8.InterfaceC0595s0
    public boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.internal.m
    public String toString() {
        return P.a(this) + '@' + P.b(this) + "[job@" + P.b(A()) + ']';
    }
}
