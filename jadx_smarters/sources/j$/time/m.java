package j$.time;

import j$.time.chrono.AbstractC1905a;
import j$.time.chrono.AbstractC1913i;
import org.apache.http.HttpStatus;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class m implements j$.time.temporal.o, j$.time.temporal.p {
    public static final m APRIL;
    public static final m AUGUST;
    public static final m DECEMBER;
    public static final m FEBRUARY;
    public static final m JANUARY;
    public static final m JULY;
    public static final m JUNE;
    public static final m MARCH;
    public static final m MAY;
    public static final m NOVEMBER;
    public static final m OCTOBER;
    public static final m SEPTEMBER;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final m[] f42112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ m[] f42113b;

    static {
        m mVar = new m("JANUARY", 0);
        JANUARY = mVar;
        m mVar2 = new m("FEBRUARY", 1);
        FEBRUARY = mVar2;
        m mVar3 = new m("MARCH", 2);
        MARCH = mVar3;
        m mVar4 = new m("APRIL", 3);
        APRIL = mVar4;
        m mVar5 = new m("MAY", 4);
        MAY = mVar5;
        m mVar6 = new m("JUNE", 5);
        JUNE = mVar6;
        m mVar7 = new m("JULY", 6);
        JULY = mVar7;
        m mVar8 = new m("AUGUST", 7);
        AUGUST = mVar8;
        m mVar9 = new m("SEPTEMBER", 8);
        SEPTEMBER = mVar9;
        m mVar10 = new m("OCTOBER", 9);
        OCTOBER = mVar10;
        m mVar11 = new m("NOVEMBER", 10);
        NOVEMBER = mVar11;
        m mVar12 = new m("DECEMBER", 11);
        DECEMBER = mVar12;
        f42113b = new m[]{mVar, mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, mVar12};
        f42112a = values();
    }

    public static m F(int i9) {
        if (i9 >= 1 && i9 <= 12) {
            return f42112a[i9 - 1];
        }
        throw new c("Invalid value for MonthOfYear: " + i9);
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f42113b.clone();
    }

    public final int C(boolean z9) {
        switch (l.f42111a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z9 ? 1 : 0) + 91;
            case 3:
                return (z9 ? 1 : 0) + 152;
            case 4:
                return (z9 ? 1 : 0) + IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE;
            case 5:
                return (z9 ? 1 : 0) + HttpStatus.SC_USE_PROXY;
            case 6:
                return 1;
            case 7:
                return (z9 ? 1 : 0) + 60;
            case 8:
                return (z9 ? 1 : 0) + 121;
            case 9:
                return (z9 ? 1 : 0) + 182;
            case 10:
                return (z9 ? 1 : 0) + 213;
            case 11:
                return (z9 ? 1 : 0) + 274;
            default:
                return (z9 ? 1 : 0) + 335;
        }
    }

    public final int D(boolean z9) {
        int i9 = l.f42111a[ordinal()];
        return i9 != 1 ? (i9 == 2 || i9 == 3 || i9 == 4 || i9 == 5) ? 30 : 31 : z9 ? 29 : 28;
    }

    public final int E() {
        int i9 = l.f42111a[ordinal()];
        if (i9 != 1) {
            return (i9 == 2 || i9 == 3 || i9 == 4 || i9 == 5) ? 30 : 31;
        }
        return 29;
    }

    public final m G() {
        return f42112a[((((int) 1) + 12) + ordinal()) % 12];
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.MONTH_OF_YEAR : rVar != null && rVar.l(this);
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.o
    public final int i(j$.time.temporal.r rVar) {
        return rVar == j$.time.temporal.a.MONTH_OF_YEAR ? getValue() : j$.time.temporal.n.a(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w l(j$.time.temporal.r rVar) {
        return rVar == j$.time.temporal.a.MONTH_OF_YEAR ? rVar.i() : j$.time.temporal.n.d(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final long q(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return getValue();
        }
        if (rVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
        }
        return rVar.k(this);
    }

    @Override // j$.time.temporal.o
    public final Object t(j$.time.temporal.t tVar) {
        return tVar == j$.time.temporal.n.e() ? j$.time.chrono.u.f42030d : tVar == j$.time.temporal.n.i() ? j$.time.temporal.b.MONTHS : j$.time.temporal.n.c(this, tVar);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m u(j$.time.temporal.m mVar) {
        if (!((AbstractC1905a) AbstractC1913i.p(mVar)).equals(j$.time.chrono.u.f42030d)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        return mVar.d(getValue(), j$.time.temporal.a.MONTH_OF_YEAR);
    }
}
