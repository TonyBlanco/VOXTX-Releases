package j$.time.format;

/* JADX INFO: loaded from: classes2.dex */
final class m implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j$.time.temporal.r f42071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v f42072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f42073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile i f42074d;

    m(j$.time.temporal.r rVar, v vVar, b bVar) {
        this.f42071a = rVar;
        this.f42072b = vVar;
        this.f42073c = bVar;
    }

    @Override // j$.time.format.f
    public final boolean i(p pVar, StringBuilder sb) {
        Long lE = pVar.e(this.f42071a);
        if (lE == null) {
            return false;
        }
        j$.time.chrono.n nVar = (j$.time.chrono.n) pVar.d().t(j$.time.temporal.n.e());
        String strC = (nVar == null || nVar == j$.time.chrono.u.f42030d) ? this.f42073c.c(this.f42071a, lE.longValue(), this.f42072b, pVar.c()) : this.f42073c.b(nVar, this.f42071a, lE.longValue(), this.f42072b, pVar.c());
        if (strC != null) {
            sb.append(strC);
            return true;
        }
        if (this.f42074d == null) {
            this.f42074d = new i(this.f42071a, 1, 19, u.NORMAL);
        }
        return this.f42074d.i(pVar, sb);
    }

    public final String toString() {
        StringBuilder sb;
        v vVar = v.FULL;
        j$.time.temporal.r rVar = this.f42071a;
        v vVar2 = this.f42072b;
        if (vVar2 == vVar) {
            sb = new StringBuilder("Text(");
            sb.append(rVar);
        } else {
            sb = new StringBuilder("Text(");
            sb.append(rVar);
            sb.append(",");
            sb.append(vVar2);
        }
        sb.append(")");
        return sb.toString();
    }
}
