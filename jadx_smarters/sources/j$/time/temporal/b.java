package j$.time.temporal;

import j$.time.Duration;

/* JADX INFO: loaded from: classes2.dex */
public enum b implements u {
    NANOS("Nanos"),
    MICROS("Micros"),
    MILLIS("Millis"),
    SECONDS("Seconds"),
    MINUTES("Minutes"),
    HOURS("Hours"),
    HALF_DAYS("HalfDays"),
    DAYS("Days"),
    WEEKS("Weeks"),
    MONTHS("Months"),
    YEARS("Years"),
    DECADES("Decades"),
    CENTURIES("Centuries"),
    MILLENNIA("Millennia"),
    ERAS("Eras"),
    FOREVER("Forever");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f42132a;

    static {
        Duration duration = Duration.f41956c;
        Duration.q(Long.MAX_VALUE, 999999999L);
    }

    b(String str) {
        this.f42132a = str;
    }

    @Override // j$.time.temporal.u
    public final m i(m mVar, long j9) {
        return mVar.e(j9, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f42132a;
    }
}
