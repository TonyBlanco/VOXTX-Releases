package j$.time.chrono;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class E extends AbstractC1908d {
    private static final long serialVersionUID = 1300372329181994526L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient j$.time.h f41985a;

    E(j$.time.h hVar) {
        Objects.a(hVar, "isoDate");
        this.f41985a = hVar;
    }

    private int J() {
        return this.f41985a.J() - 1911;
    }

    private E L(j$.time.h hVar) {
        return hVar.equals(this.f41985a) ? this : new E(hVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new G((byte) 7, this);
    }

    @Override // j$.time.chrono.AbstractC1908d
    public final o D() {
        return J() >= 1 ? F.ROC : F.BEFORE_ROC;
    }

    @Override // j$.time.chrono.AbstractC1908d
    /* JADX INFO: renamed from: E */
    public final InterfaceC1906b y(long j9, j$.time.temporal.u uVar) {
        return (E) super.y(j9, uVar);
    }

    @Override // j$.time.chrono.AbstractC1908d
    final InterfaceC1906b F(long j9) {
        return L(this.f41985a.R(j9));
    }

    @Override // j$.time.chrono.AbstractC1908d
    final InterfaceC1906b G(long j9) {
        return L(this.f41985a.S(j9));
    }

    @Override // j$.time.chrono.AbstractC1908d
    final InterfaceC1906b H(long j9) {
        return L(this.f41985a.T(j9));
    }

    @Override // j$.time.chrono.AbstractC1908d
    /* JADX INFO: renamed from: I */
    public final InterfaceC1906b k(j$.time.temporal.p pVar) {
        return (E) super.k(pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    @Override // j$.time.chrono.AbstractC1908d, j$.time.temporal.m
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.time.chrono.E d(long r9, j$.time.temporal.r r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof j$.time.temporal.a
            if (r0 == 0) goto L9a
            r0 = r11
            j$.time.temporal.a r0 = (j$.time.temporal.a) r0
            long r1 = r8.q(r0)
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 != 0) goto L10
            return r8
        L10:
            int[] r1 = j$.time.chrono.D.f41984a
            int r2 = r0.ordinal()
            r2 = r1[r2]
            j$.time.h r3 = r8.f41985a
            r4 = 7
            r5 = 6
            r6 = 4
            if (r2 == r6) goto L4c
            r7 = 5
            if (r2 == r7) goto L27
            if (r2 == r5) goto L4c
            if (r2 == r4) goto L4c
            goto L62
        L27:
            j$.time.chrono.C r11 = j$.time.chrono.C.f41983d
            j$.time.temporal.w r11 = r11.l(r0)
            r11.b(r9, r0)
            int r11 = r8.J()
            long r0 = (long) r11
            r4 = 12
            long r0 = r0 * r4
            int r11 = r3.I()
            long r4 = (long) r11
            long r0 = r0 + r4
            r4 = 1
            long r0 = r0 - r4
            long r9 = r9 - r0
            j$.time.h r9 = r3.S(r9)
            j$.time.chrono.E r9 = r8.L(r9)
            return r9
        L4c:
            j$.time.chrono.C r2 = j$.time.chrono.C.f41983d
            j$.time.temporal.w r2 = r2.l(r0)
            int r2 = r2.a(r9, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r6) goto L85
            if (r0 == r5) goto L7a
            if (r0 == r4) goto L6b
        L62:
            j$.time.h r9 = r3.d(r9, r11)
            j$.time.chrono.E r9 = r8.L(r9)
            return r9
        L6b:
            int r9 = r8.J()
            int r9 = 1912 - r9
            j$.time.h r9 = r3.Y(r9)
            j$.time.chrono.E r9 = r8.L(r9)
            return r9
        L7a:
            int r2 = r2 + 1911
            j$.time.h r9 = r3.Y(r2)
            j$.time.chrono.E r9 = r8.L(r9)
            return r9
        L85:
            int r9 = r8.J()
            r10 = 1
            if (r9 < r10) goto L8f
            int r2 = r2 + 1911
            goto L91
        L8f:
            int r2 = 1912 - r2
        L91:
            j$.time.h r9 = r3.Y(r2)
            j$.time.chrono.E r9 = r8.L(r9)
            return r9
        L9a:
            j$.time.chrono.b r9 = super.d(r9, r11)
            j$.time.chrono.E r9 = (j$.time.chrono.E) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.E.d(long, j$.time.temporal.r):j$.time.chrono.E");
    }

    @Override // j$.time.chrono.InterfaceC1906b
    public final n a() {
        return C.f41983d;
    }

    @Override // j$.time.chrono.AbstractC1908d, j$.time.chrono.InterfaceC1906b, j$.time.temporal.m
    public final InterfaceC1906b e(long j9, j$.time.temporal.u uVar) {
        return (E) super.e(j9, uVar);
    }

    @Override // j$.time.chrono.AbstractC1908d, j$.time.temporal.m
    public final j$.time.temporal.m e(long j9, j$.time.temporal.u uVar) {
        return (E) super.e(j9, uVar);
    }

    @Override // j$.time.chrono.AbstractC1908d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof E) {
            return this.f41985a.equals(((E) obj).f41985a);
        }
        return false;
    }

    @Override // j$.time.chrono.AbstractC1908d, j$.time.chrono.InterfaceC1906b
    public final int hashCode() {
        C.f41983d.getClass();
        return this.f41985a.hashCode() ^ (-1990173233);
    }

    @Override // j$.time.chrono.AbstractC1908d, j$.time.temporal.m
    public final j$.time.temporal.m k(j$.time.h hVar) {
        return (E) super.k(hVar);
    }

    @Override // j$.time.chrono.AbstractC1908d, j$.time.temporal.o
    public final j$.time.temporal.w l(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.t(this);
        }
        if (!AbstractC1913i.h(this, rVar)) {
            throw new j$.time.temporal.v(j$.time.d.a("Unsupported field: ", rVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        int i9 = D.f41984a[aVar.ordinal()];
        if (i9 == 1 || i9 == 2 || i9 == 3) {
            return this.f41985a.l(rVar);
        }
        if (i9 != 4) {
            return C.f41983d.l(aVar);
        }
        j$.time.temporal.w wVarI = j$.time.temporal.a.YEAR.i();
        return j$.time.temporal.w.j(1L, J() <= 0 ? (-wVarI.e()) + 1912 : wVarI.d() - 1911);
    }

    @Override // j$.time.temporal.o
    public final long q(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.k(this);
        }
        int i9 = D.f41984a[((j$.time.temporal.a) rVar).ordinal()];
        if (i9 == 4) {
            int iJ = J();
            if (iJ < 1) {
                iJ = 1 - iJ;
            }
            return iJ;
        }
        j$.time.h hVar = this.f41985a;
        if (i9 == 5) {
            return ((((long) J()) * 12) + ((long) hVar.I())) - 1;
        }
        if (i9 == 6) {
            return J();
        }
        if (i9 != 7) {
            return hVar.q(rVar);
        }
        return J() < 1 ? 0 : 1;
    }

    @Override // j$.time.chrono.AbstractC1908d, j$.time.chrono.InterfaceC1906b
    public final long r() {
        return this.f41985a.r();
    }

    @Override // j$.time.chrono.AbstractC1908d, j$.time.chrono.InterfaceC1906b
    public final InterfaceC1909e s(j$.time.k kVar) {
        return C1911g.E(this, kVar);
    }

    @Override // j$.time.chrono.AbstractC1908d, j$.time.temporal.m
    public final j$.time.temporal.m y(long j9, j$.time.temporal.u uVar) {
        return (E) super.y(j9, uVar);
    }
}
