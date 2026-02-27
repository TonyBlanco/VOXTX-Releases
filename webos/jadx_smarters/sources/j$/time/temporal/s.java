package j$.time.temporal;

import j$.time.ZoneId;
import j$.time.ZoneOffset;

/* JADX INFO: loaded from: classes2.dex */
final class s implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42155a;

    public /* synthetic */ s(int i9) {
        this.f42155a = i9;
    }

    @Override // j$.time.temporal.t
    public final Object a(o oVar) {
        switch (this.f42155a) {
            case 0:
                return (ZoneId) oVar.t(n.f42146a);
            case 1:
                return (j$.time.chrono.n) oVar.t(n.f42147b);
            case 2:
                return (u) oVar.t(n.f42148c);
            case 3:
                a aVar = a.OFFSET_SECONDS;
                if (oVar.f(aVar)) {
                    return ZoneOffset.L(oVar.i(aVar));
                }
                return null;
            case 4:
                ZoneId zoneId = (ZoneId) oVar.t(n.f42146a);
                return zoneId != null ? zoneId : (ZoneId) oVar.t(n.f42149d);
            case 5:
                a aVar2 = a.EPOCH_DAY;
                if (oVar.f(aVar2)) {
                    return j$.time.h.P(oVar.q(aVar2));
                }
                return null;
            default:
                a aVar3 = a.NANO_OF_DAY;
                if (oVar.f(aVar3)) {
                    return j$.time.k.K(oVar.q(aVar3));
                }
                return null;
        }
    }

    public final String toString() {
        switch (this.f42155a) {
            case 0:
                return "ZoneId";
            case 1:
                return "Chronology";
            case 2:
                return "Precision";
            case 3:
                return "ZoneOffset";
            case 4:
                return "Zone";
            case 5:
                return "LocalDate";
            default:
                return "LocalTime";
        }
    }
}
