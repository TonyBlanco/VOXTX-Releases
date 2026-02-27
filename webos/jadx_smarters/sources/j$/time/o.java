package j$.time;

import j$.time.chrono.AbstractC1905a;
import j$.time.chrono.AbstractC1913i;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements j$.time.temporal.o, j$.time.temporal.p, Comparable, Serializable {
    private static final long serialVersionUID = -939150713474957432L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f42115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f42116b;

    static {
        j$.time.format.n nVar = new j$.time.format.n();
        nVar.f("--");
        nVar.k(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        nVar.e('-');
        nVar.k(j$.time.temporal.a.DAY_OF_MONTH, 2);
        nVar.v();
    }

    private o(int i9, int i10) {
        this.f42115a = i9;
        this.f42116b = i10;
    }

    static o C(DataInput dataInput) throws IOException {
        byte b9 = dataInput.readByte();
        byte b10 = dataInput.readByte();
        m mVarF = m.F(b9);
        Objects.a(mVarF, "month");
        j$.time.temporal.a.DAY_OF_MONTH.C(b10);
        if (b10 <= mVarF.E()) {
            return new o(mVarF.getValue(), b10);
        }
        throw new c("Illegal value for DayOfMonth field, value " + ((int) b10) + " is not valid for month " + mVarF.name());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 13, this);
    }

    final void D(DataOutput dataOutput) {
        dataOutput.writeByte(this.f42115a);
        dataOutput.writeByte(this.f42116b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        o oVar = (o) obj;
        int i9 = this.f42115a - oVar.f42115a;
        return i9 == 0 ? this.f42116b - oVar.f42116b : i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f42115a == oVar.f42115a && this.f42116b == oVar.f42116b;
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.MONTH_OF_YEAR || rVar == j$.time.temporal.a.DAY_OF_MONTH : rVar != null && rVar.l(this);
    }

    public final int hashCode() {
        return (this.f42115a << 6) + this.f42116b;
    }

    @Override // j$.time.temporal.o
    public final int i(j$.time.temporal.r rVar) {
        return l(rVar).a(q(rVar), rVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w l(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return rVar.i();
        }
        if (rVar != j$.time.temporal.a.DAY_OF_MONTH) {
            return j$.time.temporal.n.d(this, rVar);
        }
        m mVarF = m.F(this.f42115a);
        mVarF.getClass();
        int i9 = l.f42111a[mVarF.ordinal()];
        return j$.time.temporal.w.k(i9 != 1 ? (i9 == 2 || i9 == 3 || i9 == 4 || i9 == 5) ? 30 : 31 : 28, m.F(r5).E());
    }

    @Override // j$.time.temporal.o
    public final long q(j$.time.temporal.r rVar) {
        int i9;
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.k(this);
        }
        int i10 = n.f42114a[((j$.time.temporal.a) rVar).ordinal()];
        if (i10 == 1) {
            i9 = this.f42116b;
        } else {
            if (i10 != 2) {
                throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
            }
            i9 = this.f42115a;
        }
        return i9;
    }

    @Override // j$.time.temporal.o
    public final Object t(j$.time.temporal.t tVar) {
        return tVar == j$.time.temporal.n.e() ? j$.time.chrono.u.f42030d : j$.time.temporal.n.c(this, tVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        int i9 = this.f42115a;
        sb.append(i9 < 10 ? "0" : "");
        sb.append(i9);
        int i10 = this.f42116b;
        sb.append(i10 < 10 ? "-0" : "-");
        sb.append(i10);
        return sb.toString();
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m u(j$.time.temporal.m mVar) {
        if (!((AbstractC1905a) AbstractC1913i.p(mVar)).equals(j$.time.chrono.u.f42030d)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        j$.time.temporal.m mVarD = mVar.d(this.f42115a, j$.time.temporal.a.MONTH_OF_YEAR);
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return mVarD.d(Math.min(mVarD.l(aVar).d(), this.f42116b), aVar);
    }
}
