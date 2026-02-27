package j$.time.temporal;

/* JADX INFO: loaded from: classes2.dex */
enum k implements r {
    JULIAN_DAY("JulianDay", 2440588),
    MODIFIED_JULIAN_DAY("ModifiedJulianDay", 40587),
    RATA_DIE("RataDie", 719163);

    private static final long serialVersionUID = -7501623920830201812L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient String f42142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient w f42143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient long f42144c;

    static {
        b bVar = b.NANOS;
    }

    k(String str, long j9) {
        this.f42142a = str;
        this.f42143b = w.j((-365243219162L) + j9, 365241780471L + j9);
        this.f42144c = j9;
    }

    @Override // j$.time.temporal.r
    public final w i() {
        return this.f42143b;
    }

    @Override // j$.time.temporal.r
    public final long k(o oVar) {
        return oVar.q(a.EPOCH_DAY) + this.f42144c;
    }

    @Override // j$.time.temporal.r
    public final boolean l(o oVar) {
        return oVar.f(a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.r
    public final m q(m mVar, long j9) {
        if (this.f42143b.i(j9)) {
            return mVar.d(j$.com.android.tools.r8.a.p(j9, this.f42144c), a.EPOCH_DAY);
        }
        throw new j$.time.c("Invalid value: " + this.f42142a + " " + j9);
    }

    @Override // j$.time.temporal.r
    public final w t(o oVar) {
        if (oVar.f(a.EPOCH_DAY)) {
            return this.f42143b;
        }
        throw new j$.time.c("Unsupported field: " + this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f42142a;
    }

    @Override // j$.time.temporal.r
    public final boolean u() {
        return true;
    }
}
