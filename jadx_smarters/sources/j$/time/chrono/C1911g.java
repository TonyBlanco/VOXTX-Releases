package j$.time.chrono;

import j$.time.ZoneOffset;
import j$.util.Objects;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import org.achartengine.chart.TimeChart;

/* JADX INFO: renamed from: j$.time.chrono.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1911g implements InterfaceC1909e, j$.time.temporal.m, j$.time.temporal.p, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient InterfaceC1906b f41999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient j$.time.k f42000b;

    private C1911g(InterfaceC1906b interfaceC1906b, j$.time.k kVar) {
        Objects.a(interfaceC1906b, "date");
        Objects.a(kVar, "time");
        this.f41999a = interfaceC1906b;
        this.f42000b = kVar;
    }

    static C1911g C(n nVar, j$.time.temporal.m mVar) {
        C1911g c1911g = (C1911g) mVar;
        AbstractC1905a abstractC1905a = (AbstractC1905a) nVar;
        if (abstractC1905a.equals(c1911g.f41999a.a())) {
            return c1911g;
        }
        throw new ClassCastException("Chronology mismatch, required: " + abstractC1905a.getId() + ", actual: " + c1911g.f41999a.a().getId());
    }

    static C1911g E(InterfaceC1906b interfaceC1906b, j$.time.k kVar) {
        return new C1911g(interfaceC1906b, kVar);
    }

    private C1911g H(InterfaceC1906b interfaceC1906b, long j9, long j10, long j11, long j12) {
        long j13 = j9 | j10 | j11 | j12;
        j$.time.k kVarK = this.f42000b;
        if (j13 == 0) {
            return J(interfaceC1906b, kVarK);
        }
        long j14 = j10 / 1440;
        long j15 = j9 / 24;
        long j16 = (j10 % 1440) * 60000000000L;
        long j17 = ((j9 % 24) * 3600000000000L) + j16 + ((j11 % 86400) * 1000000000) + (j12 % 86400000000000L);
        long jS = kVarK.S();
        long j18 = j17 + jS;
        long jN = j$.com.android.tools.r8.a.n(j18, 86400000000000L) + j15 + j14 + (j11 / 86400) + (j12 / 86400000000000L);
        long jM = j$.com.android.tools.r8.a.m(j18, 86400000000000L);
        if (jM != jS) {
            kVarK = j$.time.k.K(jM);
        }
        return J(interfaceC1906b.e(jN, (j$.time.temporal.u) j$.time.temporal.b.DAYS), kVarK);
    }

    private C1911g J(j$.time.temporal.m mVar, j$.time.k kVar) {
        InterfaceC1906b interfaceC1906b = this.f41999a;
        return (interfaceC1906b == mVar && this.f42000b == kVar) ? this : new C1911g(AbstractC1908d.C(interfaceC1906b.a(), mVar), kVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new G((byte) 2, this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final InterfaceC1909e y(long j9, j$.time.temporal.u uVar) {
        return C(a(), j$.time.temporal.n.b(this, j9, uVar));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public final C1911g e(long j9, j$.time.temporal.u uVar) {
        boolean z9 = uVar instanceof j$.time.temporal.b;
        InterfaceC1906b interfaceC1906b = this.f41999a;
        if (!z9) {
            return C(interfaceC1906b.a(), uVar.i(this, j9));
        }
        int i9 = AbstractC1910f.f41998a[((j$.time.temporal.b) uVar).ordinal()];
        j$.time.k kVar = this.f42000b;
        switch (i9) {
            case 1:
                return H(this.f41999a, 0L, 0L, 0L, j9);
            case 2:
                C1911g c1911gJ = J(interfaceC1906b.e(j9 / 86400000000L, (j$.time.temporal.u) j$.time.temporal.b.DAYS), kVar);
                return c1911gJ.H(c1911gJ.f41999a, 0L, 0L, 0L, (j9 % 86400000000L) * 1000);
            case 3:
                C1911g c1911gJ2 = J(interfaceC1906b.e(j9 / TimeChart.DAY, (j$.time.temporal.u) j$.time.temporal.b.DAYS), kVar);
                return c1911gJ2.H(c1911gJ2.f41999a, 0L, 0L, 0L, (j9 % TimeChart.DAY) * 1000000);
            case 4:
                return G(j9);
            case 5:
                return H(this.f41999a, 0L, j9, 0L, 0L);
            case 6:
                return H(this.f41999a, j9, 0L, 0L, 0L);
            case 7:
                C1911g c1911gJ3 = J(interfaceC1906b.e(j9 / 256, (j$.time.temporal.u) j$.time.temporal.b.DAYS), kVar);
                return c1911gJ3.H(c1911gJ3.f41999a, (j9 % 256) * 12, 0L, 0L, 0L);
            default:
                return J(interfaceC1906b.e(j9, uVar), kVar);
        }
    }

    final C1911g G(long j9) {
        return H(this.f41999a, 0L, 0L, j9, 0L);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final C1911g d(long j9, j$.time.temporal.r rVar) {
        boolean z9 = rVar instanceof j$.time.temporal.a;
        InterfaceC1906b interfaceC1906b = this.f41999a;
        if (!z9) {
            return C(interfaceC1906b.a(), rVar.q(this, j9));
        }
        boolean zD = ((j$.time.temporal.a) rVar).D();
        j$.time.k kVar = this.f42000b;
        return zD ? J(interfaceC1906b, kVar.d(j9, rVar)) : J(interfaceC1906b.d(j9, rVar), kVar);
    }

    @Override // j$.time.chrono.InterfaceC1909e
    public final n a() {
        return this.f41999a.a();
    }

    @Override // j$.time.chrono.InterfaceC1909e
    public final j$.time.k b() {
        return this.f42000b;
    }

    @Override // j$.time.chrono.InterfaceC1909e
    public final InterfaceC1906b c() {
        return this.f41999a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC1909e) && AbstractC1913i.c(this, (InterfaceC1909e) obj) == 0;
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar != null && rVar.l(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        return aVar.u() || aVar.D();
    }

    public final int hashCode() {
        return this.f41999a.hashCode() ^ this.f42000b.hashCode();
    }

    @Override // j$.time.temporal.o
    public final int i(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) rVar).D() ? this.f42000b.i(rVar) : this.f41999a.i(rVar) : l(rVar).a(q(rVar), rVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m k(j$.time.h hVar) {
        return J(hVar, this.f42000b);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w l(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.t(this);
        }
        if (!((j$.time.temporal.a) rVar).D()) {
            return this.f41999a.l(rVar);
        }
        j$.time.k kVar = this.f42000b;
        kVar.getClass();
        return j$.time.temporal.n.d(kVar, rVar);
    }

    @Override // j$.time.chrono.InterfaceC1909e
    public final InterfaceC1915k n(ZoneOffset zoneOffset) {
        return m.E(zoneOffset, null, this);
    }

    @Override // j$.time.temporal.o
    public final long q(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) rVar).D() ? this.f42000b.q(rVar) : this.f41999a.q(rVar) : rVar.k(this);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ Object t(j$.time.temporal.t tVar) {
        return AbstractC1913i.k(this, tVar);
    }

    public final String toString() {
        return this.f41999a.toString() + "T" + this.f42000b.toString();
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m u(j$.time.temporal.m mVar) {
        return mVar.d(c().r(), j$.time.temporal.a.EPOCH_DAY).d(b().S(), j$.time.temporal.a.NANO_OF_DAY);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: v */
    public final /* synthetic */ int compareTo(InterfaceC1909e interfaceC1909e) {
        return AbstractC1913i.c(this, interfaceC1909e);
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.f41999a);
        objectOutput.writeObject(this.f42000b);
    }
}
