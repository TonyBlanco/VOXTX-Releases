package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class x extends AbstractC1905a implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f42033d = new x();
    private static final long serialVersionUID = 459996390165777884L;

    private x() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.n
    public final o A(int i9) {
        return A.A(i9);
    }

    @Override // j$.time.chrono.n
    public final String getId() {
        return "Japanese";
    }

    @Override // j$.time.chrono.n
    public final InterfaceC1906b j(j$.time.temporal.o oVar) {
        return oVar instanceof z ? (z) oVar : new z(j$.time.h.E(oVar));
    }

    public final j$.time.temporal.w l(j$.time.temporal.a aVar) {
        long J9;
        long value;
        switch (w.f42032a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new j$.time.temporal.v("Unsupported field: " + aVar);
            case 5:
                return j$.time.temporal.w.k(A.D(), 999999999 - A.m().p().J());
            case 6:
                return j$.time.temporal.w.k(A.C(), j$.time.temporal.a.DAY_OF_YEAR.i().d());
            case 7:
                J9 = z.f42035d.J();
                value = 999999999;
                break;
            case 8:
                J9 = A.f41977d.getValue();
                value = A.m().getValue();
                break;
            default:
                return aVar.i();
        }
        return j$.time.temporal.w.j(J9, value);
    }

    @Override // j$.time.chrono.n
    public final String p() {
        return "japanese";
    }

    Object writeReplace() {
        return new G((byte) 1, this);
    }

    @Override // j$.time.chrono.n
    public final InterfaceC1915k x(Instant instant, ZoneId zoneId) {
        return m.F(this, instant, zoneId);
    }
}
