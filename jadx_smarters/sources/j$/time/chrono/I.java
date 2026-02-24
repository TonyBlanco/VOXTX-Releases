package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class I extends AbstractC1905a implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final I f41990d = new I();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        map.put("en", new String[]{"BB", "BE"});
        map.put("th", new String[]{"BB", "BE"});
        map2.put("en", new String[]{"B.B.", "B.E."});
        map2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        map3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        map3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    private I() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.n
    public final o A(int i9) {
        if (i9 == 0) {
            return L.BEFORE_BE;
        }
        if (i9 == 1) {
            return L.BE;
        }
        throw new j$.time.c("Invalid era: " + i9);
    }

    @Override // j$.time.chrono.n
    public final String getId() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.n
    public final InterfaceC1906b j(j$.time.temporal.o oVar) {
        return oVar instanceof K ? (K) oVar : new K(j$.time.h.E(oVar));
    }

    public final j$.time.temporal.w l(j$.time.temporal.a aVar) {
        int i9 = H.f41989a[aVar.ordinal()];
        if (i9 == 1) {
            j$.time.temporal.w wVarI = j$.time.temporal.a.PROLEPTIC_MONTH.i();
            return j$.time.temporal.w.j(wVarI.e() + 6516, wVarI.d() + 6516);
        }
        if (i9 == 2) {
            j$.time.temporal.w wVarI2 = j$.time.temporal.a.YEAR.i();
            return j$.time.temporal.w.k((-(wVarI2.e() + 543)) + 1, wVarI2.d() + 543);
        }
        if (i9 != 3) {
            return aVar.i();
        }
        j$.time.temporal.w wVarI3 = j$.time.temporal.a.YEAR.i();
        return j$.time.temporal.w.j(wVarI3.e() + 543, wVarI3.d() + 543);
    }

    @Override // j$.time.chrono.n
    public final String p() {
        return "buddhist";
    }

    Object writeReplace() {
        return new G((byte) 1, this);
    }

    @Override // j$.time.chrono.n
    public final InterfaceC1915k x(Instant instant, ZoneId zoneId) {
        return m.F(this, instant, zoneId);
    }
}
