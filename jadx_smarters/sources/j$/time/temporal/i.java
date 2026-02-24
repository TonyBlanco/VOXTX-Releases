package j$.time.temporal;

import j$.time.Duration;

/* JADX INFO: loaded from: classes2.dex */
enum i implements u {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f42137a;

    static {
        Duration duration = Duration.f41956c;
    }

    i(String str) {
        this.f42137a = str;
    }

    @Override // j$.time.temporal.u
    public final m i(m mVar, long j9) {
        int i9 = c.f42133a[ordinal()];
        if (i9 == 1) {
            return mVar.d(j$.com.android.tools.r8.a.i(mVar.i(r0), j9), j.f42140c);
        }
        if (i9 == 2) {
            return mVar.e(j9 / 4, b.YEARS).e((j9 % 4) * 3, b.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f42137a;
    }
}
