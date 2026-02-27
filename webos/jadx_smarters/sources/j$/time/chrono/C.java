package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class C extends AbstractC1905a implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C f41983d = new C();
    private static final long serialVersionUID = 1039765215346859963L;

    private C() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.n
    public final o A(int i9) {
        if (i9 == 0) {
            return F.BEFORE_ROC;
        }
        if (i9 == 1) {
            return F.ROC;
        }
        throw new j$.time.c("Invalid era: " + i9);
    }

    @Override // j$.time.chrono.n
    public final String getId() {
        return "Minguo";
    }

    @Override // j$.time.chrono.n
    public final InterfaceC1906b j(j$.time.temporal.o oVar) {
        return oVar instanceof E ? (E) oVar : new E(j$.time.h.E(oVar));
    }

    public final j$.time.temporal.w l(j$.time.temporal.a aVar) {
        int i9 = B.f41982a[aVar.ordinal()];
        if (i9 == 1) {
            j$.time.temporal.w wVarI = j$.time.temporal.a.PROLEPTIC_MONTH.i();
            return j$.time.temporal.w.j(wVarI.e() - 22932, wVarI.d() - 22932);
        }
        if (i9 == 2) {
            j$.time.temporal.w wVarI2 = j$.time.temporal.a.YEAR.i();
            return j$.time.temporal.w.k(wVarI2.d() - 1911, (-wVarI2.e()) + 1912);
        }
        if (i9 != 3) {
            return aVar.i();
        }
        j$.time.temporal.w wVarI3 = j$.time.temporal.a.YEAR.i();
        return j$.time.temporal.w.j(wVarI3.e() - 1911, wVarI3.d() - 1911);
    }

    @Override // j$.time.chrono.n
    public final String p() {
        return "roc";
    }

    Object writeReplace() {
        return new G((byte) 1, this);
    }

    @Override // j$.time.chrono.n
    public final InterfaceC1915k x(Instant instant, ZoneId zoneId) {
        return m.F(this, instant, zoneId);
    }
}
