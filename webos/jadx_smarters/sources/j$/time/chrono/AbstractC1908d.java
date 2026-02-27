package j$.time.chrono;

import java.io.Serializable;

/* JADX INFO: renamed from: j$.time.chrono.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC1908d implements InterfaceC1906b, j$.time.temporal.m, j$.time.temporal.p, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    AbstractC1908d() {
    }

    static InterfaceC1906b C(n nVar, j$.time.temporal.m mVar) {
        InterfaceC1906b interfaceC1906b = (InterfaceC1906b) mVar;
        AbstractC1905a abstractC1905a = (AbstractC1905a) nVar;
        if (abstractC1905a.equals(interfaceC1906b.a())) {
            return interfaceC1906b;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + abstractC1905a.getId() + ", actual: " + interfaceC1906b.a().getId());
    }

    public o D() {
        return a().A(j$.time.temporal.n.a(this, j$.time.temporal.a.ERA));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public InterfaceC1906b y(long j9, j$.time.temporal.u uVar) {
        return C(a(), j$.time.temporal.n.b(this, j9, uVar));
    }

    abstract InterfaceC1906b F(long j9);

    abstract InterfaceC1906b G(long j9);

    abstract InterfaceC1906b H(long j9);

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public InterfaceC1906b k(j$.time.temporal.p pVar) {
        return C(a(), pVar.u(this));
    }

    @Override // j$.time.temporal.m
    public InterfaceC1906b d(long j9, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.v(j$.time.d.a("Unsupported field: ", rVar));
        }
        return C(a(), rVar.q(this, j9));
    }

    @Override // j$.time.temporal.m
    public InterfaceC1906b e(long j9, j$.time.temporal.u uVar) {
        boolean z9 = uVar instanceof j$.time.temporal.b;
        if (!z9) {
            if (!z9) {
                return C(a(), uVar.i(this, j9));
            }
            throw new j$.time.temporal.v("Unsupported unit: " + uVar);
        }
        switch (AbstractC1907c.f41997a[((j$.time.temporal.b) uVar).ordinal()]) {
            case 1:
                return F(j9);
            case 2:
                return F(j$.com.android.tools.r8.a.o(j9, 7));
            case 3:
                return G(j9);
            case 4:
                return H(j9);
            case 5:
                return H(j$.com.android.tools.r8.a.o(j9, 10));
            case 6:
                return H(j$.com.android.tools.r8.a.o(j9, 100));
            case 7:
                return H(j$.com.android.tools.r8.a.o(j9, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return d(j$.com.android.tools.r8.a.i(q(aVar), j9), (j$.time.temporal.r) aVar);
            default:
                throw new j$.time.temporal.v("Unsupported unit: " + uVar);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC1906b) && AbstractC1913i.b(this, (InterfaceC1906b) obj) == 0;
    }

    @Override // j$.time.chrono.InterfaceC1906b, j$.time.temporal.o
    public /* synthetic */ boolean f(j$.time.temporal.r rVar) {
        return AbstractC1913i.h(this, rVar);
    }

    @Override // j$.time.chrono.InterfaceC1906b
    public int hashCode() {
        long jR = r();
        return ((AbstractC1905a) a()).hashCode() ^ ((int) (jR ^ (jR >>> 32)));
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ int i(j$.time.temporal.r rVar) {
        return j$.time.temporal.n.a(this, rVar);
    }

    @Override // j$.time.temporal.o
    public /* synthetic */ j$.time.temporal.w l(j$.time.temporal.r rVar) {
        return j$.time.temporal.n.d(this, rVar);
    }

    @Override // j$.time.chrono.InterfaceC1906b
    public long r() {
        return q(j$.time.temporal.a.EPOCH_DAY);
    }

    @Override // j$.time.chrono.InterfaceC1906b
    public InterfaceC1909e s(j$.time.k kVar) {
        return C1911g.E(this, kVar);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ Object t(j$.time.temporal.t tVar) {
        return AbstractC1913i.j(this, tVar);
    }

    @Override // j$.time.chrono.InterfaceC1906b
    public String toString() {
        long jQ = q(j$.time.temporal.a.YEAR_OF_ERA);
        long jQ2 = q(j$.time.temporal.a.MONTH_OF_YEAR);
        long jQ3 = q(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(((AbstractC1905a) a()).getId());
        sb.append(" ");
        sb.append(D());
        sb.append(" ");
        sb.append(jQ);
        sb.append(jQ2 < 10 ? "-0" : "-");
        sb.append(jQ2);
        sb.append(jQ3 < 10 ? "-0" : "-");
        sb.append(jQ3);
        return sb.toString();
    }

    @Override // j$.time.temporal.p
    public final /* synthetic */ j$.time.temporal.m u(j$.time.temporal.m mVar) {
        return AbstractC1913i.a(this, mVar);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int compareTo(InterfaceC1906b interfaceC1906b) {
        return AbstractC1913i.b(this, interfaceC1906b);
    }
}
