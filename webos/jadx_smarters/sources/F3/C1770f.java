package f3;

import d4.M;
import s5.AbstractC2743y;
import s5.c0;

/* JADX INFO: renamed from: f3.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1770f implements InterfaceC1765a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC2743y f40603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40604b;

    public C1770f(int i9, AbstractC2743y abstractC2743y) {
        this.f40604b = i9;
        this.f40603a = abstractC2743y;
    }

    public static InterfaceC1765a a(int i9, int i10, M m9) {
        switch (i9) {
            case 1718776947:
                return C1771g.d(i10, m9);
            case 1751742049:
                return C1767c.b(m9);
            case 1752331379:
                return C1768d.c(m9);
            case 1852994675:
                return C1772h.a(m9);
            default:
                return null;
        }
    }

    public static C1770f c(int i9, M m9) {
        AbstractC2743y.a aVar = new AbstractC2743y.a();
        int iG = m9.g();
        int iB = -2;
        while (m9.a() > 8) {
            int iU = m9.u();
            int iF = m9.f() + m9.u();
            m9.T(iF);
            InterfaceC1765a interfaceC1765aC = iU == 1414744396 ? c(m9.u(), m9) : a(iU, iB, m9);
            if (interfaceC1765aC != null) {
                if (interfaceC1765aC.getType() == 1752331379) {
                    iB = ((C1768d) interfaceC1765aC).b();
                }
                aVar.a(interfaceC1765aC);
            }
            m9.U(iF);
            m9.T(iG);
        }
        return new C1770f(i9, aVar.k());
    }

    public InterfaceC1765a b(Class cls) {
        c0 it = this.f40603a.iterator();
        while (it.hasNext()) {
            InterfaceC1765a interfaceC1765a = (InterfaceC1765a) it.next();
            if (interfaceC1765a.getClass() == cls) {
                return interfaceC1765a;
            }
        }
        return null;
    }

    @Override // f3.InterfaceC1765a
    public int getType() {
        return this.f40604b;
    }
}
