package j$.time;

import com.amazonaws.services.s3.internal.Constants;
import j$.time.chrono.AbstractC1913i;
import j$.time.chrono.InterfaceC1906b;
import j$.time.chrono.InterfaceC1909e;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements j$.time.temporal.m, j$.time.temporal.p, InterfaceC1906b, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f42095d = N(-999999999, 1, 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f42096e = N(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f42097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final short f42098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final short f42099c;

    static {
        N(1970, 1, 1);
    }

    private h(int i9, int i10, int i11) {
        this.f42097a = i9;
        this.f42098b = (short) i10;
        this.f42099c = (short) i11;
    }

    private static h D(int i9, int i10, int i11) {
        int i12 = 28;
        if (i11 > 28) {
            if (i10 != 2) {
                i12 = (i10 == 4 || i10 == 6 || i10 == 9 || i10 == 11) ? 30 : 31;
            } else {
                j$.time.chrono.u.f42030d.getClass();
                if (j$.time.chrono.u.l(i9)) {
                    i12 = 29;
                }
            }
            if (i11 > i12) {
                if (i11 == 29) {
                    throw new c("Invalid date 'February 29' as '" + i9 + "' is not a leap year");
                }
                throw new c("Invalid date '" + m.F(i10).name() + " " + i11 + "'");
            }
        }
        return new h(i9, i10, i11);
    }

    public static h E(j$.time.temporal.o oVar) {
        Objects.a(oVar, "temporal");
        h hVar = (h) oVar.t(j$.time.temporal.n.f());
        if (hVar != null) {
            return hVar;
        }
        throw new c("Unable to obtain LocalDate from TemporalAccessor: " + oVar + " of type " + oVar.getClass().getName());
    }

    private int F(j$.time.temporal.r rVar) {
        int i9;
        int i10 = g.f42093a[((j$.time.temporal.a) rVar).ordinal()];
        short s9 = this.f42099c;
        int i11 = this.f42097a;
        switch (i10) {
            case 1:
                return s9;
            case 2:
                return H();
            case 3:
                i9 = (s9 - 1) / 7;
                break;
            case 4:
                return i11 >= 1 ? i11 : 1 - i11;
            case 5:
                return G().getValue();
            case 6:
                i9 = (s9 - 1) % 7;
                break;
            case 7:
                return ((H() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.v("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((H() - 1) / 7) + 1;
            case 10:
                return this.f42098b;
            case 11:
                throw new j$.time.temporal.v("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return i11;
            case 13:
                return i11 >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
        }
        return i9 + 1;
    }

    public static h N(int i9, int i10, int i11) {
        j$.time.temporal.a.YEAR.C(i9);
        j$.time.temporal.a.MONTH_OF_YEAR.C(i10);
        j$.time.temporal.a.DAY_OF_MONTH.C(i11);
        return D(i9, i10, i11);
    }

    public static h O(int i9, m mVar, int i10) {
        j$.time.temporal.a.YEAR.C(i9);
        Objects.a(mVar, "month");
        j$.time.temporal.a.DAY_OF_MONTH.C(i10);
        return D(i9, mVar.getValue(), i10);
    }

    public static h P(long j9) {
        long j10;
        j$.time.temporal.a.EPOCH_DAY.C(j9);
        long j11 = 719468 + j9;
        if (j11 < 0) {
            long j12 = ((j9 + 719469) / 146097) - 1;
            j10 = j12 * 400;
            j11 += (-j12) * 146097;
        } else {
            j10 = 0;
        }
        long j13 = ((j11 * 400) + 591) / 146097;
        long j14 = j11 - ((j13 / 400) + (((j13 / 4) + (j13 * 365)) - (j13 / 100)));
        if (j14 < 0) {
            j13--;
            j14 = j11 - ((j13 / 400) + (((j13 / 4) + (365 * j13)) - (j13 / 100)));
        }
        int i9 = (int) j14;
        int i10 = ((i9 * 5) + 2) / 153;
        return new h(j$.time.temporal.a.YEAR.y(j13 + j10 + ((long) (i10 / 10))), ((i10 + 2) % 12) + 1, (i9 - (((i10 * 306) + 5) / 10)) + 1);
    }

    private static h U(int i9, int i10, int i11) {
        int i12;
        if (i10 != 2) {
            if (i10 == 4 || i10 == 6 || i10 == 9 || i10 == 11) {
                i12 = 30;
            }
            return new h(i9, i10, i11);
        }
        j$.time.chrono.u.f42030d.getClass();
        i12 = j$.time.chrono.u.l((long) i9) ? 29 : 28;
        i11 = Math.min(i11, i12);
        return new h(i9, i10, i11);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 3, this);
    }

    final int C(h hVar) {
        int i9 = this.f42097a - hVar.f42097a;
        if (i9 != 0) {
            return i9;
        }
        int i10 = this.f42098b - hVar.f42098b;
        return i10 == 0 ? this.f42099c - hVar.f42099c : i10;
    }

    public final e G() {
        return e.C(((int) j$.com.android.tools.r8.a.m(r() + 3, 7)) + 1);
    }

    public final int H() {
        return (m.F(this.f42098b).C(L()) + this.f42099c) - 1;
    }

    public final int I() {
        return this.f42098b;
    }

    public final int J() {
        return this.f42097a;
    }

    public final boolean K(InterfaceC1906b interfaceC1906b) {
        return interfaceC1906b instanceof h ? C((h) interfaceC1906b) < 0 : r() < interfaceC1906b.r();
    }

    public final boolean L() {
        j$.time.chrono.u uVar = j$.time.chrono.u.f42030d;
        long j9 = this.f42097a;
        uVar.getClass();
        return j$.time.chrono.u.l(j9);
    }

    public final int M() {
        short s9 = this.f42098b;
        return s9 != 2 ? (s9 == 4 || s9 == 6 || s9 == 9 || s9 == 11) ? 30 : 31 : L() ? 29 : 28;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final h e(long j9, j$.time.temporal.u uVar) {
        if (!(uVar instanceof j$.time.temporal.b)) {
            return (h) uVar.i(this, j9);
        }
        switch (g.f42094b[((j$.time.temporal.b) uVar).ordinal()]) {
            case 1:
                return R(j9);
            case 2:
                return R(j$.com.android.tools.r8.a.o(j9, 7));
            case 3:
                return S(j9);
            case 4:
                return T(j9);
            case 5:
                return T(j$.com.android.tools.r8.a.o(j9, 10));
            case 6:
                return T(j$.com.android.tools.r8.a.o(j9, 100));
            case 7:
                return T(j$.com.android.tools.r8.a.o(j9, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return d(j$.com.android.tools.r8.a.i(q(aVar), j9), aVar);
            default:
                throw new j$.time.temporal.v("Unsupported unit: " + uVar);
        }
    }

    public final h R(long j9) {
        if (j9 == 0) {
            return this;
        }
        long j10 = ((long) this.f42099c) + j9;
        if (j10 > 0) {
            short s9 = this.f42098b;
            int i9 = this.f42097a;
            if (j10 <= 28) {
                return new h(i9, s9, (int) j10);
            }
            if (j10 <= 59) {
                long jM = M();
                if (j10 <= jM) {
                    return new h(i9, s9, (int) j10);
                }
                if (s9 < 12) {
                    return new h(i9, s9 + 1, (int) (j10 - jM));
                }
                int i10 = i9 + 1;
                j$.time.temporal.a.YEAR.C(i10);
                return new h(i10, 1, (int) (j10 - jM));
            }
        }
        return P(j$.com.android.tools.r8.a.i(r(), j9));
    }

    public final h S(long j9) {
        if (j9 == 0) {
            return this;
        }
        long j10 = (((long) this.f42097a) * 12) + ((long) (this.f42098b - 1)) + j9;
        long j11 = 12;
        return U(j$.time.temporal.a.YEAR.y(j$.com.android.tools.r8.a.n(j10, j11)), ((int) j$.com.android.tools.r8.a.m(j10, j11)) + 1, this.f42099c);
    }

    public final h T(long j9) {
        return j9 == 0 ? this : U(j$.time.temporal.a.YEAR.y(((long) this.f42097a) + j9), this.f42098b, this.f42099c);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final h d(long j9, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (h) rVar.q(this, j9);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        aVar.C(j9);
        int i9 = g.f42093a[aVar.ordinal()];
        short s9 = this.f42099c;
        short s10 = this.f42098b;
        int i10 = this.f42097a;
        switch (i9) {
            case 1:
                int i11 = (int) j9;
                return s9 == i11 ? this : N(i10, s10, i11);
            case 2:
                return X((int) j9);
            case 3:
                return R(j$.com.android.tools.r8.a.o(j9 - q(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH), 7));
            case 4:
                if (i10 < 1) {
                    j9 = 1 - j9;
                }
                return Y((int) j9);
            case 5:
                return R(j9 - ((long) G().getValue()));
            case 6:
                return R(j9 - q(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return R(j9 - q(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return P(j9);
            case 9:
                return R(j$.com.android.tools.r8.a.o(j9 - q(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR), 7));
            case 10:
                int i12 = (int) j9;
                if (s10 == i12) {
                    return this;
                }
                j$.time.temporal.a.MONTH_OF_YEAR.C(i12);
                return U(i10, i12, s9);
            case 11:
                return S(j9 - (((((long) i10) * 12) + ((long) s10)) - 1));
            case 12:
                return Y((int) j9);
            case 13:
                return q(j$.time.temporal.a.ERA) == j9 ? this : Y(1 - i10);
            default:
                throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
        }
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final h k(j$.time.temporal.p pVar) {
        return pVar instanceof h ? (h) pVar : (h) pVar.u(this);
    }

    public final h X(int i9) {
        if (H() == i9) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int i10 = this.f42097a;
        long j9 = i10;
        aVar.C(j9);
        j$.time.temporal.a.DAY_OF_YEAR.C(i9);
        j$.time.chrono.u.f42030d.getClass();
        boolean zL = j$.time.chrono.u.l(j9);
        if (i9 == 366 && !zL) {
            throw new c("Invalid date 'DayOfYear 366' as '" + i10 + "' is not a leap year");
        }
        m mVarF = m.F(((i9 - 1) / 31) + 1);
        if (i9 > (mVarF.D(zL) + mVarF.C(zL)) - 1) {
            mVarF = mVarF.G();
        }
        return new h(i10, mVarF.getValue(), (i9 - mVarF.C(zL)) + 1);
    }

    public final h Y(int i9) {
        if (this.f42097a == i9) {
            return this;
        }
        j$.time.temporal.a.YEAR.C(i9);
        return U(i9, this.f42098b, this.f42099c);
    }

    final void Z(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.f42097a);
        dataOutput.writeByte(this.f42098b);
        dataOutput.writeByte(this.f42099c);
    }

    @Override // j$.time.chrono.InterfaceC1906b
    public final j$.time.chrono.n a() {
        return j$.time.chrono.u.f42030d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && C((h) obj) == 0;
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return AbstractC1913i.h(this, rVar);
    }

    @Override // j$.time.chrono.InterfaceC1906b
    public final int hashCode() {
        int i9 = this.f42097a;
        return (((i9 << 11) + (this.f42098b << 6)) + this.f42099c) ^ (i9 & (-2048));
    }

    @Override // j$.time.temporal.o
    public final int i(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? F(rVar) : j$.time.temporal.n.a(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w l(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.t(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        if (!aVar.u()) {
            throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
        }
        int i9 = g.f42093a[aVar.ordinal()];
        if (i9 == 1) {
            return j$.time.temporal.w.j(1L, M());
        }
        if (i9 == 2) {
            return j$.time.temporal.w.j(1L, L() ? 366 : 365);
        }
        if (i9 == 3) {
            return j$.time.temporal.w.j(1L, (m.F(this.f42098b) != m.FEBRUARY || L()) ? 5L : 4L);
        }
        if (i9 != 4) {
            return ((j$.time.temporal.a) rVar).i();
        }
        return j$.time.temporal.w.j(1L, this.f42097a <= 0 ? 1000000000L : 999999999L);
    }

    @Override // j$.time.temporal.o
    public final long q(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.EPOCH_DAY ? r() : rVar == j$.time.temporal.a.PROLEPTIC_MONTH ? ((((long) this.f42097a) * 12) + ((long) this.f42098b)) - 1 : F(rVar) : rVar.k(this);
    }

    @Override // j$.time.chrono.InterfaceC1906b
    public final long r() {
        long j9 = this.f42097a;
        long j10 = this.f42098b;
        long j11 = 365 * j9;
        long j12 = (((367 * j10) - 362) / 12) + (j9 >= 0 ? ((j9 + 399) / 400) + (((3 + j9) / 4) - ((99 + j9) / 100)) + j11 : j11 - ((j9 / (-400)) + ((j9 / (-4)) - (j9 / (-100))))) + ((long) (this.f42099c - 1));
        if (j10 > 2) {
            j12 = !L() ? j12 - 2 : j12 - 1;
        }
        return j12 - 719528;
    }

    @Override // j$.time.chrono.InterfaceC1906b
    public final InterfaceC1909e s(k kVar) {
        return LocalDateTime.K(this, kVar);
    }

    @Override // j$.time.temporal.o
    public final Object t(j$.time.temporal.t tVar) {
        return tVar == j$.time.temporal.n.f() ? this : AbstractC1913i.j(this, tVar);
    }

    @Override // j$.time.chrono.InterfaceC1906b
    public final String toString() {
        int i9;
        int i10 = this.f42097a;
        int iAbs = Math.abs(i10);
        StringBuilder sb = new StringBuilder(10);
        if (iAbs < 1000) {
            if (i10 < 0) {
                sb.append(i10 - 10000);
                i9 = 1;
            } else {
                sb.append(i10 + Constants.MAXIMUM_UPLOAD_PARTS);
                i9 = 0;
            }
            sb.deleteCharAt(i9);
        } else {
            if (i10 > 9999) {
                sb.append('+');
            }
            sb.append(i10);
        }
        short s9 = this.f42098b;
        sb.append(s9 < 10 ? "-0" : "-");
        sb.append((int) s9);
        short s10 = this.f42099c;
        sb.append(s10 < 10 ? "-0" : "-");
        sb.append((int) s10);
        return sb.toString();
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m u(j$.time.temporal.m mVar) {
        return AbstractC1913i.a(this, mVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m y(long j9, j$.time.temporal.u uVar) {
        return j9 == Long.MIN_VALUE ? e(Long.MAX_VALUE, uVar).e(1L, uVar) : e(-j9, uVar);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC1906b interfaceC1906b) {
        return interfaceC1906b instanceof h ? C((h) interfaceC1906b) : AbstractC1913i.b(this, interfaceC1906b);
    }
}
