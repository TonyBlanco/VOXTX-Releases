package G8;

/* JADX INFO: loaded from: classes4.dex */
public class A0 extends E0 implements InterfaceC0608z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2259c;

    public A0(InterfaceC0605x0 interfaceC0605x0) {
        super(true);
        g0(interfaceC0605x0);
        this.f2259c = K0();
    }

    public final boolean K0() {
        E0 e0A;
        InterfaceC0596t interfaceC0596tC0 = c0();
        C0598u c0598u = interfaceC0596tC0 instanceof C0598u ? (C0598u) interfaceC0596tC0 : null;
        if (c0598u != null && (e0A = c0598u.A()) != null) {
            while (!e0A.X()) {
                InterfaceC0596t interfaceC0596tC02 = e0A.c0();
                C0598u c0598u2 = interfaceC0596tC02 instanceof C0598u ? (C0598u) interfaceC0596tC02 : null;
                if (c0598u2 == null || (e0A = c0598u2.A()) == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // G8.E0
    public boolean X() {
        return this.f2259c;
    }

    @Override // G8.E0
    public boolean Z() {
        return true;
    }
}
