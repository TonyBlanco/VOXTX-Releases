package j$.time.format;

import j$.time.ZoneId;

/* JADX INFO: loaded from: classes2.dex */
final class l implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f42070b;

    public /* synthetic */ l(Object obj, int i9) {
        this.f42069a = i9;
        this.f42070b = obj;
    }

    @Override // j$.time.format.f
    public final boolean i(p pVar, StringBuilder sb) {
        switch (this.f42069a) {
            case 0:
                sb.append((String) this.f42070b);
                break;
            default:
                ZoneId zoneId = (ZoneId) pVar.f((a) ((j$.time.temporal.t) this.f42070b));
                if (zoneId != null) {
                    sb.append(zoneId.getId());
                    break;
                }
                break;
        }
        return true;
    }

    public final String toString() {
        switch (this.f42069a) {
            case 0:
                return "'" + ((String) this.f42070b).replace("'", "''") + "'";
            default:
                return "ZoneRegionId()";
        }
    }
}
