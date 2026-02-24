package j$.time.chrono;

import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes2.dex */
public final class A implements o, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final A f41977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final A[] f41978e;
    private static final long serialVersionUID = 1466499369062886794L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient int f41979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient j$.time.h f41980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient String f41981c;

    static {
        A a9 = new A(-1, j$.time.h.N(1868, 1, 1), "Meiji");
        f41977d = a9;
        f41978e = new A[]{a9, new A(0, j$.time.h.N(1912, 7, 30), "Taisho"), new A(1, j$.time.h.N(1926, 12, 25), "Showa"), new A(2, j$.time.h.N(1989, 1, 8), "Heisei"), new A(3, j$.time.h.N(2019, 5, 1), "Reiwa")};
    }

    private A(int i9, j$.time.h hVar, String str) {
        this.f41979a = i9;
        this.f41980b = hVar;
        this.f41981c = str;
    }

    public static A A(int i9) {
        int i10 = i9 + 1;
        if (i10 >= 0) {
            A[] aArr = f41978e;
            if (i10 < aArr.length) {
                return aArr[i10];
            }
        }
        throw new j$.time.c("Invalid era: " + i9);
    }

    static long C() {
        long jF = j$.time.temporal.a.DAY_OF_YEAR.i().f();
        for (A a9 : f41978e) {
            jF = Math.min(jF, ((a9.f41980b.L() ? 366 : 365) - a9.f41980b.H()) + 1);
            if (a9.x() != null) {
                jF = Math.min(jF, a9.x().f41980b.H() - 1);
            }
        }
        return jF;
    }

    static long D() {
        int iJ = Http2Connection.DEGRADED_PONG_TIMEOUT_NS - m().f41980b.J();
        A[] aArr = f41978e;
        int iJ2 = aArr[0].f41980b.J();
        for (int i9 = 1; i9 < aArr.length; i9++) {
            A a9 = aArr[i9];
            iJ = Math.min(iJ, (a9.f41980b.J() - iJ2) + 1);
            iJ2 = a9.f41980b.J();
        }
        return iJ;
    }

    static A j(j$.time.h hVar) {
        if (hVar.K(z.f42035d)) {
            throw new j$.time.c("JapaneseDate before Meiji 6 are not supported");
        }
        A[] aArr = f41978e;
        for (int length = aArr.length - 1; length >= 0; length--) {
            A a9 = aArr[length];
            if (hVar.compareTo(a9.f41980b) >= 0) {
                return a9;
            }
        }
        return null;
    }

    static A m() {
        return f41978e[r0.length - 1];
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new G((byte) 5, this);
    }

    final void E(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(this.f41979a);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ boolean f(j$.time.temporal.r rVar) {
        return AbstractC1913i.i(this, rVar);
    }

    @Override // j$.time.chrono.o
    public final int getValue() {
        return this.f41979a;
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ int i(j$.time.temporal.r rVar) {
        return AbstractC1913i.f(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w l(j$.time.temporal.r rVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        return rVar == aVar ? x.f42033d.l(aVar) : j$.time.temporal.n.d(this, rVar);
    }

    final j$.time.h p() {
        return this.f41980b;
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ long q(j$.time.temporal.r rVar) {
        return AbstractC1913i.g(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ Object t(j$.time.temporal.t tVar) {
        return AbstractC1913i.m(this, tVar);
    }

    public final String toString() {
        return this.f41981c;
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m u(j$.time.temporal.m mVar) {
        return mVar.d(getValue(), j$.time.temporal.a.ERA);
    }

    final A x() {
        if (this == m()) {
            return null;
        }
        return A(this.f41979a + 1);
    }
}
