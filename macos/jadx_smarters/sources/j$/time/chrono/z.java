package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class z extends AbstractC1908d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final j$.time.h f42035d = j$.time.h.N(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient j$.time.h f42036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient A f42037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient int f42038c;

    z(j$.time.h hVar) {
        if (hVar.K(f42035d)) {
            throw new j$.time.c("JapaneseDate before Meiji 6 is not supported");
        }
        A aJ = A.j(hVar);
        this.f42037b = aJ;
        this.f42038c = (hVar.J() - aJ.p().J()) + 1;
        this.f42036a = hVar;
    }

    private z K(j$.time.h hVar) {
        return hVar.equals(this.f42036a) ? this : new z(hVar);
    }

    private z L(A a9, int i9) {
        x.f42033d.getClass();
        if (!(a9 instanceof A)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        int iJ = (a9.p().J() + i9) - 1;
        if (i9 != 1 && (iJ < -999999999 || iJ > 999999999 || iJ < a9.p().J() || a9 != A.j(j$.time.h.N(iJ, 1, 1)))) {
            throw new j$.time.c("Invalid yearOfEra value");
        }
        return K(this.f42036a.Y(iJ));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new G((byte) 4, this);
    }

    @Override // j$.time.chrono.AbstractC1908d
    public final o D() {
        return this.f42037b;
    }

    @Override // j$.time.chrono.AbstractC1908d
    /* JADX INFO: renamed from: E */
    public final InterfaceC1906b y(long j9, j$.time.temporal.u uVar) {
        return (z) super.y(j9, uVar);
    }

    @Override // j$.time.chrono.AbstractC1908d
    final InterfaceC1906b F(long j9) {
        return K(this.f42036a.R(j9));
    }

    @Override // j$.time.chrono.AbstractC1908d
    final InterfaceC1906b G(long j9) {
        return K(this.f42036a.S(j9));
    }

    @Override // j$.time.chrono.AbstractC1908d
    final InterfaceC1906b H(long j9) {
        return K(this.f42036a.T(j9));
    }

    @Override // j$.time.chrono.AbstractC1908d
    /* JADX INFO: renamed from: I */
    public final InterfaceC1906b k(j$.time.temporal.p pVar) {
        return (z) super.k(pVar);
    }

    @Override // j$.time.chrono.AbstractC1908d, j$.time.temporal.m
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final z d(long j9, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (z) super.d(j9, rVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        if (q(aVar) == j9) {
            return this;
        }
        int[] iArr = y.f42034a;
        int i9 = iArr[aVar.ordinal()];
        j$.time.h hVar = this.f42036a;
        if (i9 == 3 || i9 == 8 || i9 == 9) {
            int iA = x.f42033d.l(aVar).a(j9, aVar);
            int i10 = iArr[aVar.ordinal()];
            if (i10 == 3) {
                return L(this.f42037b, iA);
            }
            if (i10 == 8) {
                return L(A.A(iA), this.f42038c);
            }
            if (i10 == 9) {
                return K(hVar.Y(iA));
            }
        }
        return K(hVar.d(j9, rVar));
    }

    @Override // j$.time.chrono.InterfaceC1906b
    public final n a() {
        return x.f42033d;
    }

    @Override // j$.time.chrono.AbstractC1908d, j$.time.chrono.InterfaceC1906b, j$.time.temporal.m
    public final InterfaceC1906b e(long j9, j$.time.temporal.u uVar) {
        return (z) super.e(j9, uVar);
    }

    @Override // j$.time.chrono.AbstractC1908d, j$.time.temporal.m
    public final j$.time.temporal.m e(long j9, j$.time.temporal.u uVar) {
        return (z) super.e(j9, uVar);
    }

    @Override // j$.time.chrono.AbstractC1908d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            return this.f42036a.equals(((z) obj).f42036a);
        }
        return false;
    }

    @Override // j$.time.chrono.AbstractC1908d, j$.time.chrono.InterfaceC1906b, j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || rVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || rVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || rVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        return rVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) rVar).u() : rVar != null && rVar.l(this);
    }

    @Override // j$.time.chrono.AbstractC1908d, j$.time.chrono.InterfaceC1906b
    public final int hashCode() {
        x.f42033d.getClass();
        return this.f42036a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.AbstractC1908d, j$.time.temporal.m
    public final j$.time.temporal.m k(j$.time.h hVar) {
        return (z) super.k(hVar);
    }

    @Override // j$.time.chrono.AbstractC1908d, j$.time.temporal.o
    public final j$.time.temporal.w l(j$.time.temporal.r rVar) {
        int iM;
        long J9;
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.t(this);
        }
        if (!f(rVar)) {
            throw new j$.time.temporal.v(j$.time.d.a("Unsupported field: ", rVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        int i9 = y.f42034a[aVar.ordinal()];
        j$.time.h hVar = this.f42036a;
        if (i9 != 1) {
            A a9 = this.f42037b;
            if (i9 != 2) {
                if (i9 != 3) {
                    return x.f42033d.l(aVar);
                }
                int iJ = a9.p().J();
                A aX = a9.x();
                J9 = aX != null ? (aX.p().J() - iJ) + 1 : 999999999 - iJ;
                return j$.time.temporal.w.j(1L, J9);
            }
            A aX2 = a9.x();
            iM = (aX2 == null || aX2.p().J() != hVar.J()) ? hVar.L() ? 366 : 365 : aX2.p().H() - 1;
            if (this.f42038c == 1) {
                iM -= a9.p().H() - 1;
            }
        } else {
            iM = hVar.M();
        }
        J9 = iM;
        return j$.time.temporal.w.j(1L, J9);
    }

    @Override // j$.time.temporal.o
    public final long q(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.k(this);
        }
        int i9 = y.f42034a[((j$.time.temporal.a) rVar).ordinal()];
        int i10 = this.f42038c;
        A a9 = this.f42037b;
        j$.time.h hVar = this.f42036a;
        switch (i9) {
            case 2:
                return i10 == 1 ? (hVar.H() - a9.p().H()) + 1 : hVar.H();
            case 3:
                return i10;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new j$.time.temporal.v(j$.time.d.a("Unsupported field: ", rVar));
            case 8:
                return a9.getValue();
            default:
                return hVar.q(rVar);
        }
    }

    @Override // j$.time.chrono.AbstractC1908d, j$.time.chrono.InterfaceC1906b
    public final long r() {
        return this.f42036a.r();
    }

    @Override // j$.time.chrono.AbstractC1908d, j$.time.chrono.InterfaceC1906b
    public final InterfaceC1909e s(j$.time.k kVar) {
        return C1911g.E(this, kVar);
    }

    @Override // j$.time.chrono.AbstractC1908d, j$.time.temporal.m
    public final j$.time.temporal.m y(long j9, j$.time.temporal.u uVar) {
        return (z) super.y(j9, uVar);
    }
}
