package j$.time.chrono;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends AbstractC1908d {
    private static final long serialVersionUID = -5207853542612002020L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient q f42025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient int f42026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient int f42027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f42028d;

    private s(q qVar, int i9, int i10, int i11) {
        qVar.y(i9, i10, i11);
        this.f42025a = qVar;
        this.f42026b = i9;
        this.f42027c = i10;
        this.f42028d = i11;
    }

    private s(q qVar, long j9) {
        int[] iArrC = qVar.C((int) j9);
        this.f42025a = qVar;
        this.f42026b = iArrC[0];
        this.f42027c = iArrC[1];
        this.f42028d = iArrC[2];
    }

    private int J() {
        return this.f42025a.u(this.f42026b, this.f42027c) + this.f42028d;
    }

    static s K(q qVar, int i9, int i10, int i11) {
        return new s(qVar, i9, i10, i11);
    }

    static s L(q qVar, long j9) {
        return new s(qVar, j9);
    }

    private s O(int i9, int i10, int i11) {
        q qVar = this.f42025a;
        int iD = qVar.D(i9, i10);
        if (i11 > iD) {
            i11 = iD;
        }
        return new s(qVar, i9, i10, i11);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new G((byte) 6, this);
    }

    @Override // j$.time.chrono.AbstractC1908d
    public final o D() {
        return t.AH;
    }

    @Override // j$.time.chrono.AbstractC1908d
    /* JADX INFO: renamed from: E */
    public final InterfaceC1906b y(long j9, j$.time.temporal.u uVar) {
        return (s) super.y(j9, uVar);
    }

    @Override // j$.time.chrono.AbstractC1908d
    final InterfaceC1906b H(long j9) {
        if (j9 == 0) {
            return this;
        }
        long j10 = ((long) this.f42026b) + ((long) ((int) j9));
        int i9 = (int) j10;
        if (j10 == i9) {
            return O(i9, this.f42027c, this.f42028d);
        }
        throw new ArithmeticException();
    }

    @Override // j$.time.chrono.AbstractC1908d
    /* JADX INFO: renamed from: I */
    public final InterfaceC1906b k(j$.time.temporal.p pVar) {
        return (s) super.k(pVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.AbstractC1908d
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final s F(long j9) {
        return new s(this.f42025a, r() + j9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.AbstractC1908d
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final s G(long j9) {
        if (j9 == 0) {
            return this;
        }
        long j10 = (((long) this.f42026b) * 12) + ((long) (this.f42027c - 1)) + j9;
        return O(this.f42025a.q(j$.com.android.tools.r8.a.n(j10, 12L)), ((int) j$.com.android.tools.r8.a.m(j10, 12L)) + 1, this.f42028d);
    }

    @Override // j$.time.chrono.AbstractC1908d, j$.time.temporal.m
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final s d(long j9, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (s) super.d(j9, rVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        q qVar = this.f42025a;
        qVar.G(aVar).b(j9, aVar);
        int i9 = (int) j9;
        int i10 = r.f42024a[aVar.ordinal()];
        int i11 = this.f42028d;
        int i12 = this.f42027c;
        int i13 = this.f42026b;
        switch (i10) {
            case 1:
                return O(i13, i12, i9);
            case 2:
                return F(Math.min(i9, qVar.E(i13)) - J());
            case 3:
                return F((j9 - q(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return F(j9 - ((long) (((int) j$.com.android.tools.r8.a.m(r() + 3, 7)) + 1)));
            case 5:
                return F(j9 - q(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return F(j9 - q(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new s(qVar, j9);
            case 8:
                return F((j9 - q(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return O(i13, i9, i11);
            case 10:
                return G(j9 - (((((long) i13) * 12) + ((long) i12)) - 1));
            case 11:
                if (i13 < 1) {
                    i9 = 1 - i9;
                }
                return O(i9, i12, i11);
            case 12:
                return O(i9, i12, i11);
            case 13:
                return O(1 - i13, i12, i11);
            default:
                throw new j$.time.temporal.v(j$.time.d.a("Unsupported field: ", rVar));
        }
    }

    @Override // j$.time.chrono.InterfaceC1906b
    public final n a() {
        return this.f42025a;
    }

    @Override // j$.time.chrono.AbstractC1908d, j$.time.chrono.InterfaceC1906b, j$.time.temporal.m
    public final InterfaceC1906b e(long j9, j$.time.temporal.u uVar) {
        return (s) super.e(j9, uVar);
    }

    @Override // j$.time.chrono.AbstractC1908d, j$.time.temporal.m
    public final j$.time.temporal.m e(long j9, j$.time.temporal.u uVar) {
        return (s) super.e(j9, uVar);
    }

    @Override // j$.time.chrono.AbstractC1908d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f42026b == sVar.f42026b && this.f42027c == sVar.f42027c && this.f42028d == sVar.f42028d && this.f42025a.equals(sVar.f42025a);
    }

    @Override // j$.time.chrono.AbstractC1908d, j$.time.chrono.InterfaceC1906b
    public final int hashCode() {
        int iHashCode = this.f42025a.getId().hashCode();
        int i9 = this.f42026b;
        return (iHashCode ^ (i9 & (-2048))) ^ (((i9 << 11) + (this.f42027c << 6)) + this.f42028d);
    }

    @Override // j$.time.chrono.AbstractC1908d, j$.time.temporal.m
    public final j$.time.temporal.m k(j$.time.h hVar) {
        return (s) super.k(hVar);
    }

    @Override // j$.time.chrono.AbstractC1908d, j$.time.temporal.o
    public final j$.time.temporal.w l(j$.time.temporal.r rVar) {
        int iD;
        long j9;
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.t(this);
        }
        if (!AbstractC1913i.h(this, rVar)) {
            throw new j$.time.temporal.v(j$.time.d.a("Unsupported field: ", rVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        int i9 = r.f42024a[aVar.ordinal()];
        int i10 = this.f42026b;
        q qVar = this.f42025a;
        if (i9 == 1) {
            iD = qVar.D(i10, this.f42027c);
        } else {
            if (i9 != 2) {
                if (i9 != 3) {
                    return qVar.G(aVar);
                }
                j9 = 5;
                return j$.time.temporal.w.j(1L, j9);
            }
            iD = qVar.E(i10);
        }
        j9 = iD;
        return j$.time.temporal.w.j(1L, j9);
    }

    @Override // j$.time.temporal.o
    public final long q(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.k(this);
        }
        int i9 = r.f42024a[((j$.time.temporal.a) rVar).ordinal()];
        int i10 = this.f42027c;
        int i11 = this.f42028d;
        int i12 = this.f42026b;
        switch (i9) {
            case 1:
                return i11;
            case 2:
                return J();
            case 3:
                return ((i11 - 1) / 7) + 1;
            case 4:
                return ((int) j$.com.android.tools.r8.a.m(r() + 3, 7)) + 1;
            case 5:
                return ((i11 - 1) % 7) + 1;
            case 6:
                return ((J() - 1) % 7) + 1;
            case 7:
                return r();
            case 8:
                return ((J() - 1) / 7) + 1;
            case 9:
                return i10;
            case 10:
                return ((((long) i12) * 12) + ((long) i10)) - 1;
            case 11:
                return i12;
            case 12:
                return i12;
            case 13:
                return i12 <= 1 ? 0 : 1;
            default:
                throw new j$.time.temporal.v(j$.time.d.a("Unsupported field: ", rVar));
        }
    }

    @Override // j$.time.chrono.AbstractC1908d, j$.time.chrono.InterfaceC1906b
    public final long r() {
        return this.f42025a.y(this.f42026b, this.f42027c, this.f42028d);
    }

    @Override // j$.time.chrono.AbstractC1908d, j$.time.chrono.InterfaceC1906b
    public final InterfaceC1909e s(j$.time.k kVar) {
        return C1911g.E(this, kVar);
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.f42025a);
        objectOutput.writeInt(j$.time.temporal.n.a(this, j$.time.temporal.a.YEAR));
        objectOutput.writeByte(j$.time.temporal.n.a(this, j$.time.temporal.a.MONTH_OF_YEAR));
        objectOutput.writeByte(j$.time.temporal.n.a(this, j$.time.temporal.a.DAY_OF_MONTH));
    }

    @Override // j$.time.chrono.AbstractC1908d, j$.time.temporal.m
    public final j$.time.temporal.m y(long j9, j$.time.temporal.u uVar) {
        return (s) super.y(j9, uVar);
    }
}
