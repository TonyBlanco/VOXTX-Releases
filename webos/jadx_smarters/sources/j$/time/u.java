package j$.time;

import j$.time.chrono.AbstractC1905a;
import j$.time.chrono.AbstractC1913i;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class u implements j$.time.temporal.m, j$.time.temporal.p, Comparable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f42160b = 0;
    private static final long serialVersionUID = -23038383694477807L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f42161a;

    static {
        j$.time.format.n nVar = new j$.time.format.n();
        nVar.l(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.u.EXCEEDS_PAD);
        nVar.v();
    }

    private u(int i9) {
        this.f42161a = i9;
    }

    public static u C(int i9) {
        j$.time.temporal.a.YEAR.C(i9);
        return new u(i9);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 11, this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final u e(long j9, j$.time.temporal.u uVar) {
        if (!(uVar instanceof j$.time.temporal.b)) {
            return (u) uVar.i(this, j9);
        }
        int i9 = t.f42127b[((j$.time.temporal.b) uVar).ordinal()];
        if (i9 == 1) {
            return E(j9);
        }
        if (i9 == 2) {
            return E(j$.com.android.tools.r8.a.o(j9, 10));
        }
        if (i9 == 3) {
            return E(j$.com.android.tools.r8.a.o(j9, 100));
        }
        if (i9 == 4) {
            return E(j$.com.android.tools.r8.a.o(j9, 1000));
        }
        if (i9 == 5) {
            j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
            return d(j$.com.android.tools.r8.a.i(q(aVar), j9), aVar);
        }
        throw new j$.time.temporal.v("Unsupported unit: " + uVar);
    }

    public final u E(long j9) {
        return j9 == 0 ? this : C(j$.time.temporal.a.YEAR.y(((long) this.f42161a) + j9));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public final u d(long j9, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (u) rVar.q(this, j9);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        aVar.C(j9);
        int i9 = t.f42126a[aVar.ordinal()];
        int i10 = this.f42161a;
        if (i9 == 1) {
            if (i10 < 1) {
                j9 = 1 - j9;
            }
            return C((int) j9);
        }
        if (i9 == 2) {
            return C((int) j9);
        }
        if (i9 == 3) {
            return q(j$.time.temporal.a.ERA) == j9 ? this : C(1 - i10);
        }
        throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
    }

    final void G(DataOutput dataOutput) {
        dataOutput.writeInt(this.f42161a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f42161a - ((u) obj).f42161a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            return this.f42161a == ((u) obj).f42161a;
        }
        return false;
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.YEAR || rVar == j$.time.temporal.a.YEAR_OF_ERA || rVar == j$.time.temporal.a.ERA : rVar != null && rVar.l(this);
    }

    public final int hashCode() {
        return this.f42161a;
    }

    @Override // j$.time.temporal.o
    public final int i(j$.time.temporal.r rVar) {
        return l(rVar).a(q(rVar), rVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m k(h hVar) {
        return (u) AbstractC1913i.a(hVar, this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w l(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.w.j(1L, this.f42161a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.n.d(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final long q(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.k(this);
        }
        int i9 = t.f42126a[((j$.time.temporal.a) rVar).ordinal()];
        int i10 = this.f42161a;
        if (i9 == 1) {
            if (i10 < 1) {
                i10 = 1 - i10;
            }
            return i10;
        }
        if (i9 == 2) {
            return i10;
        }
        if (i9 == 3) {
            return i10 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
    }

    @Override // j$.time.temporal.o
    public final Object t(j$.time.temporal.t tVar) {
        return tVar == j$.time.temporal.n.e() ? j$.time.chrono.u.f42030d : tVar == j$.time.temporal.n.i() ? j$.time.temporal.b.YEARS : j$.time.temporal.n.c(this, tVar);
    }

    public final String toString() {
        return Integer.toString(this.f42161a);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m u(j$.time.temporal.m mVar) {
        if (!((AbstractC1905a) AbstractC1913i.p(mVar)).equals(j$.time.chrono.u.f42030d)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        return mVar.d(this.f42161a, j$.time.temporal.a.YEAR);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m y(long j9, j$.time.temporal.u uVar) {
        return j9 == Long.MIN_VALUE ? e(Long.MAX_VALUE, uVar).e(1L, uVar) : e(-j9, uVar);
    }
}
