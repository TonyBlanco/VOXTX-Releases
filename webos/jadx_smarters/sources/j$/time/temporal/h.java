package j$.time.temporal;

import j$.time.chrono.AbstractC1905a;
import j$.time.chrono.AbstractC1913i;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
abstract class h implements r {
    public static final h DAY_OF_QUARTER;
    public static final h QUARTER_OF_YEAR;
    public static final h WEEK_BASED_YEAR;
    public static final h WEEK_OF_WEEK_BASED_YEAR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f42134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ h[] f42135b;

    static {
        h hVar = new h() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.r
            public final w i() {
                return w.k(90L, 92L);
            }

            @Override // j$.time.temporal.r
            public final long k(o oVar) {
                if (!l(oVar)) {
                    throw new v("Unsupported field: DayOfQuarter");
                }
                int i9 = oVar.i(a.DAY_OF_YEAR);
                int i10 = oVar.i(a.MONTH_OF_YEAR);
                long jQ = oVar.q(a.YEAR);
                int[] iArr = h.f42134a;
                int i11 = (i10 - 1) / 3;
                j$.time.chrono.u.f42030d.getClass();
                return i9 - iArr[i11 + (j$.time.chrono.u.l(jQ) ? 4 : 0)];
            }

            @Override // j$.time.temporal.r
            public final boolean l(o oVar) {
                if (oVar.f(a.DAY_OF_YEAR) && oVar.f(a.MONTH_OF_YEAR) && oVar.f(a.YEAR)) {
                    r rVar = j.f42138a;
                    if (((AbstractC1905a) AbstractC1913i.p(oVar)).equals(j$.time.chrono.u.f42030d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.r
            public final m q(m mVar, long j9) {
                long jK = k(mVar);
                i().b(j9, this);
                a aVar = a.DAY_OF_YEAR;
                return mVar.d((j9 - jK) + mVar.q(aVar), aVar);
            }

            @Override // j$.time.temporal.r
            public final w t(o oVar) {
                if (!l(oVar)) {
                    throw new v("Unsupported field: DayOfQuarter");
                }
                long jQ = oVar.q(h.QUARTER_OF_YEAR);
                if (jQ != 1) {
                    return jQ == 2 ? w.j(1L, 91L) : (jQ == 3 || jQ == 4) ? w.j(1L, 92L) : i();
                }
                long jQ2 = oVar.q(a.YEAR);
                j$.time.chrono.u.f42030d.getClass();
                return j$.time.chrono.u.l(jQ2) ? w.j(1L, 91L) : w.j(1L, 90L);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = hVar;
        h hVar2 = new h() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.r
            public final w i() {
                return w.j(1L, 4L);
            }

            @Override // j$.time.temporal.r
            public final long k(o oVar) {
                if (l(oVar)) {
                    return (oVar.q(a.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new v("Unsupported field: QuarterOfYear");
            }

            @Override // j$.time.temporal.r
            public final boolean l(o oVar) {
                if (oVar.f(a.MONTH_OF_YEAR)) {
                    r rVar = j.f42138a;
                    if (((AbstractC1905a) AbstractC1913i.p(oVar)).equals(j$.time.chrono.u.f42030d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.r
            public final m q(m mVar, long j9) {
                long jK = k(mVar);
                i().b(j9, this);
                a aVar = a.MONTH_OF_YEAR;
                return mVar.d(((j9 - jK) * 3) + mVar.q(aVar), aVar);
            }

            @Override // j$.time.temporal.r
            public final w t(o oVar) {
                if (l(oVar)) {
                    return i();
                }
                throw new v("Unsupported field: QuarterOfYear");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = hVar2;
        h hVar3 = new h() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.r
            public final w i() {
                return w.k(52L, 53L);
            }

            @Override // j$.time.temporal.r
            public final long k(o oVar) {
                if (l(oVar)) {
                    return h.C(j$.time.h.E(oVar));
                }
                throw new v("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.r
            public final boolean l(o oVar) {
                if (oVar.f(a.EPOCH_DAY)) {
                    r rVar = j.f42138a;
                    if (((AbstractC1905a) AbstractC1913i.p(oVar)).equals(j$.time.chrono.u.f42030d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.r
            public final m q(m mVar, long j9) {
                i().b(j9, this);
                return mVar.e(j$.com.android.tools.r8.a.p(j9, k(mVar)), b.WEEKS);
            }

            @Override // j$.time.temporal.r
            public final w t(o oVar) {
                if (l(oVar)) {
                    return h.F(j$.time.h.E(oVar));
                }
                throw new v("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = hVar3;
        h hVar4 = new h() { // from class: j$.time.temporal.g
            @Override // j$.time.temporal.r
            public final w i() {
                return a.YEAR.i();
            }

            @Override // j$.time.temporal.r
            public final long k(o oVar) {
                if (l(oVar)) {
                    return h.G(j$.time.h.E(oVar));
                }
                throw new v("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.r
            public final boolean l(o oVar) {
                if (oVar.f(a.EPOCH_DAY)) {
                    r rVar = j.f42138a;
                    if (((AbstractC1905a) AbstractC1913i.p(oVar)).equals(j$.time.chrono.u.f42030d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.r
            public final m q(m mVar, long j9) {
                if (!l(mVar)) {
                    throw new v("Unsupported field: WeekBasedYear");
                }
                int iA = a.YEAR.i().a(j9, h.WEEK_BASED_YEAR);
                j$.time.h hVarE = j$.time.h.E(mVar);
                int i9 = hVarE.i(a.DAY_OF_WEEK);
                int iC = h.C(hVarE);
                if (iC == 53 && h.H(iA) == 52) {
                    iC = 52;
                }
                return mVar.k(j$.time.h.N(iA, 1, 4).R(((iC - 1) * 7) + (i9 - r6.i(r0))));
            }

            @Override // j$.time.temporal.r
            public final w t(o oVar) {
                if (l(oVar)) {
                    return i();
                }
                throw new v("Unsupported field: WeekBasedYear");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = hVar4;
        f42135b = new h[]{hVar, hVar2, hVar3, hVar4};
        f42134a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    static int C(j$.time.h hVar) {
        int iOrdinal = hVar.G().ordinal();
        int i9 = 1;
        int iH = hVar.H() - 1;
        int i10 = (3 - iOrdinal) + iH;
        int i11 = i10 - ((i10 / 7) * 7);
        int i12 = i11 - 3;
        if (i12 < -3) {
            i12 = i11 + 4;
        }
        if (iH < i12) {
            return (int) w.j(1L, H(G(hVar.X(180).T(-1L)))).d();
        }
        int i13 = ((iH - i12) / 7) + 1;
        if (i13 != 53 || i12 == -3 || (i12 == -2 && hVar.L())) {
            i9 = i13;
        }
        return i9;
    }

    static w F(j$.time.h hVar) {
        return w.j(1L, H(G(hVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int G(j$.time.h hVar) {
        int iJ = hVar.J();
        int iH = hVar.H();
        if (iH <= 3) {
            return iH - hVar.G().ordinal() < -2 ? iJ - 1 : iJ;
        }
        if (iH >= 363) {
            return ((iH - 363) - (hVar.L() ? 1 : 0)) - hVar.G().ordinal() >= 0 ? iJ + 1 : iJ;
        }
        return iJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int H(int i9) {
        j$.time.h hVarN = j$.time.h.N(i9, 1, 1);
        if (hVarN.G() != j$.time.e.THURSDAY) {
            return (hVarN.G() == j$.time.e.WEDNESDAY && hVarN.L()) ? 53 : 52;
        }
        return 53;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f42135b.clone();
    }

    @Override // j$.time.temporal.r
    public final boolean u() {
        return true;
    }
}
