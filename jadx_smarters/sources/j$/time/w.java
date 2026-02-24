package j$.time;

import com.amazonaws.services.s3.internal.Constants;
import j$.time.chrono.AbstractC1905a;
import j$.time.chrono.AbstractC1913i;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements j$.time.temporal.m, j$.time.temporal.p, Comparable, Serializable {
    private static final long serialVersionUID = 4183400860270640070L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f42164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f42165b;

    static {
        j$.time.format.n nVar = new j$.time.format.n();
        nVar.l(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.u.EXCEEDS_PAD);
        nVar.e('-');
        nVar.k(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        nVar.v();
    }

    private w(int i9, int i10) {
        this.f42164a = i9;
        this.f42165b = i10;
    }

    private long C() {
        return ((((long) this.f42164a) * 12) + ((long) this.f42165b)) - 1;
    }

    static w G(DataInput dataInput) throws IOException {
        int i9 = dataInput.readInt();
        byte b9 = dataInput.readByte();
        j$.time.temporal.a.YEAR.C(i9);
        j$.time.temporal.a.MONTH_OF_YEAR.C(b9);
        return new w(i9, b9);
    }

    private w H(int i9, int i10) {
        return (this.f42164a == i9 && this.f42165b == i10) ? this : new w(i9, i10);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 12, this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final w e(long j9, j$.time.temporal.u uVar) {
        if (!(uVar instanceof j$.time.temporal.b)) {
            return (w) uVar.i(this, j9);
        }
        switch (v.f42163b[((j$.time.temporal.b) uVar).ordinal()]) {
            case 1:
                return E(j9);
            case 2:
                return F(j9);
            case 3:
                return F(j$.com.android.tools.r8.a.o(j9, 10));
            case 4:
                return F(j$.com.android.tools.r8.a.o(j9, 100));
            case 5:
                return F(j$.com.android.tools.r8.a.o(j9, 1000));
            case 6:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return d(j$.com.android.tools.r8.a.i(q(aVar), j9), aVar);
            default:
                throw new j$.time.temporal.v("Unsupported unit: " + uVar);
        }
    }

    public final w E(long j9) {
        if (j9 == 0) {
            return this;
        }
        long j10 = (((long) this.f42164a) * 12) + ((long) (this.f42165b - 1)) + j9;
        long j11 = 12;
        return H(j$.time.temporal.a.YEAR.y(j$.com.android.tools.r8.a.n(j10, j11)), ((int) j$.com.android.tools.r8.a.m(j10, j11)) + 1);
    }

    public final w F(long j9) {
        return j9 == 0 ? this : H(j$.time.temporal.a.YEAR.y(((long) this.f42164a) + j9), this.f42165b);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final w d(long j9, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (w) rVar.q(this, j9);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        aVar.C(j9);
        int i9 = v.f42162a[aVar.ordinal()];
        int i10 = this.f42164a;
        if (i9 == 1) {
            int i11 = (int) j9;
            j$.time.temporal.a.MONTH_OF_YEAR.C(i11);
            return H(i10, i11);
        }
        if (i9 == 2) {
            return E(j9 - C());
        }
        int i12 = this.f42165b;
        if (i9 == 3) {
            if (i10 < 1) {
                j9 = 1 - j9;
            }
            int i13 = (int) j9;
            j$.time.temporal.a.YEAR.C(i13);
            return H(i13, i12);
        }
        if (i9 == 4) {
            int i14 = (int) j9;
            j$.time.temporal.a.YEAR.C(i14);
            return H(i14, i12);
        }
        if (i9 != 5) {
            throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
        }
        if (q(j$.time.temporal.a.ERA) == j9) {
            return this;
        }
        int i15 = 1 - i10;
        j$.time.temporal.a.YEAR.C(i15);
        return H(i15, i12);
    }

    final void J(DataOutput dataOutput) {
        dataOutput.writeInt(this.f42164a);
        dataOutput.writeByte(this.f42165b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        w wVar = (w) obj;
        int i9 = this.f42164a - wVar.f42164a;
        return i9 == 0 ? this.f42165b - wVar.f42165b : i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f42164a == wVar.f42164a && this.f42165b == wVar.f42165b;
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.YEAR || rVar == j$.time.temporal.a.MONTH_OF_YEAR || rVar == j$.time.temporal.a.PROLEPTIC_MONTH || rVar == j$.time.temporal.a.YEAR_OF_ERA || rVar == j$.time.temporal.a.ERA : rVar != null && rVar.l(this);
    }

    public final int hashCode() {
        return (this.f42165b << 27) ^ this.f42164a;
    }

    @Override // j$.time.temporal.o
    public final int i(j$.time.temporal.r rVar) {
        return l(rVar).a(q(rVar), rVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m k(h hVar) {
        return (w) AbstractC1913i.a(hVar, this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w l(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.w.j(1L, this.f42164a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.n.d(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final long q(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.k(this);
        }
        int i9 = v.f42162a[((j$.time.temporal.a) rVar).ordinal()];
        if (i9 == 1) {
            return this.f42165b;
        }
        if (i9 == 2) {
            return C();
        }
        int i10 = this.f42164a;
        if (i9 == 3) {
            if (i10 < 1) {
                i10 = 1 - i10;
            }
            return i10;
        }
        if (i9 == 4) {
            return i10;
        }
        if (i9 == 5) {
            return i10 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
    }

    @Override // j$.time.temporal.o
    public final Object t(j$.time.temporal.t tVar) {
        return tVar == j$.time.temporal.n.e() ? j$.time.chrono.u.f42030d : tVar == j$.time.temporal.n.i() ? j$.time.temporal.b.MONTHS : j$.time.temporal.n.c(this, tVar);
    }

    public final String toString() {
        int i9;
        int i10 = this.f42164a;
        int iAbs = Math.abs(i10);
        StringBuilder sb = new StringBuilder(9);
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
            sb.append(i10);
        }
        int i11 = this.f42165b;
        sb.append(i11 < 10 ? "-0" : "-");
        sb.append(i11);
        return sb.toString();
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m u(j$.time.temporal.m mVar) {
        if (!((AbstractC1905a) AbstractC1913i.p(mVar)).equals(j$.time.chrono.u.f42030d)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        return mVar.d(C(), j$.time.temporal.a.PROLEPTIC_MONTH);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m y(long j9, j$.time.temporal.u uVar) {
        return j9 == Long.MIN_VALUE ? e(Long.MAX_VALUE, uVar).e(1L, uVar) : e(-j9, uVar);
    }
}
