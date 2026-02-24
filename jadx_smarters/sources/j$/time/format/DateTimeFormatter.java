package j$.time.format;

import j$.time.ZoneId;
import j$.util.Objects;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import org.apache.http.message.TokenParser;

/* JADX INFO: loaded from: classes2.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_LOCAL_DATE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final DateTimeFormatter f42043f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f42044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Locale f42045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s f42046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j$.time.chrono.n f42047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ZoneId f42048e;

    static {
        n nVar = new n();
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        u uVar = u.EXCEEDS_PAD;
        nVar.l(aVar, 4, 10, uVar);
        nVar.e('-');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        nVar.k(aVar2, 2);
        nVar.e('-');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        nVar.k(aVar3, 2);
        t tVar = t.STRICT;
        j$.time.chrono.u uVar2 = j$.time.chrono.u.f42030d;
        DateTimeFormatter dateTimeFormatterT = nVar.t(tVar, uVar2);
        ISO_LOCAL_DATE = dateTimeFormatterT;
        n nVar2 = new n();
        nVar2.p();
        nVar2.a(dateTimeFormatterT);
        nVar2.h();
        nVar2.t(tVar, uVar2);
        n nVar3 = new n();
        nVar3.p();
        nVar3.a(dateTimeFormatterT);
        nVar3.o();
        nVar3.h();
        nVar3.t(tVar, uVar2);
        n nVar4 = new n();
        j$.time.temporal.a aVar4 = j$.time.temporal.a.HOUR_OF_DAY;
        nVar4.k(aVar4, 2);
        nVar4.e(':');
        j$.time.temporal.a aVar5 = j$.time.temporal.a.MINUTE_OF_HOUR;
        nVar4.k(aVar5, 2);
        nVar4.o();
        nVar4.e(':');
        j$.time.temporal.a aVar6 = j$.time.temporal.a.SECOND_OF_MINUTE;
        nVar4.k(aVar6, 2);
        nVar4.o();
        nVar4.b(j$.time.temporal.a.NANO_OF_SECOND);
        DateTimeFormatter dateTimeFormatterT2 = nVar4.t(tVar, null);
        n nVar5 = new n();
        nVar5.p();
        nVar5.a(dateTimeFormatterT2);
        nVar5.h();
        nVar5.t(tVar, null);
        n nVar6 = new n();
        nVar6.p();
        nVar6.a(dateTimeFormatterT2);
        nVar6.o();
        nVar6.h();
        nVar6.t(tVar, null);
        n nVar7 = new n();
        nVar7.p();
        nVar7.a(dateTimeFormatterT);
        nVar7.e('T');
        nVar7.a(dateTimeFormatterT2);
        DateTimeFormatter dateTimeFormatterT3 = nVar7.t(tVar, uVar2);
        n nVar8 = new n();
        nVar8.p();
        nVar8.a(dateTimeFormatterT3);
        nVar8.r();
        nVar8.h();
        nVar8.s();
        DateTimeFormatter dateTimeFormatterT4 = nVar8.t(tVar, uVar2);
        n nVar9 = new n();
        nVar9.a(dateTimeFormatterT4);
        nVar9.o();
        nVar9.e('[');
        nVar9.q();
        nVar9.m();
        nVar9.e(']');
        nVar9.t(tVar, uVar2);
        n nVar10 = new n();
        nVar10.a(dateTimeFormatterT3);
        nVar10.o();
        nVar10.h();
        nVar10.o();
        nVar10.e('[');
        nVar10.q();
        nVar10.m();
        nVar10.e(']');
        nVar10.t(tVar, uVar2);
        n nVar11 = new n();
        nVar11.p();
        nVar11.l(aVar, 4, 10, uVar);
        nVar11.e('-');
        nVar11.k(j$.time.temporal.a.DAY_OF_YEAR, 3);
        nVar11.o();
        nVar11.h();
        nVar11.t(tVar, uVar2);
        n nVar12 = new n();
        nVar12.p();
        nVar12.l(j$.time.temporal.j.f42140c, 4, 10, uVar);
        nVar12.f("-W");
        nVar12.k(j$.time.temporal.j.f42139b, 2);
        nVar12.e('-');
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_WEEK;
        nVar12.k(aVar7, 1);
        nVar12.o();
        nVar12.h();
        nVar12.t(tVar, uVar2);
        n nVar13 = new n();
        nVar13.p();
        nVar13.c();
        f42043f = nVar13.t(tVar, null);
        n nVar14 = new n();
        nVar14.p();
        nVar14.k(aVar, 4);
        nVar14.k(aVar2, 2);
        nVar14.k(aVar3, 2);
        nVar14.o();
        nVar14.r();
        nVar14.g("+HHMMss", "Z");
        nVar14.s();
        nVar14.t(tVar, uVar2);
        HashMap map = new HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        HashMap map2 = new HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        n nVar15 = new n();
        nVar15.p();
        nVar15.r();
        nVar15.o();
        nVar15.i(aVar7, map);
        nVar15.f(", ");
        nVar15.n();
        nVar15.l(aVar3, 1, 2, u.NOT_NEGATIVE);
        nVar15.e(TokenParser.SP);
        nVar15.i(aVar2, map2);
        nVar15.e(TokenParser.SP);
        nVar15.k(aVar, 4);
        nVar15.e(TokenParser.SP);
        nVar15.k(aVar4, 2);
        nVar15.e(':');
        nVar15.k(aVar5, 2);
        nVar15.o();
        nVar15.e(':');
        nVar15.k(aVar6, 2);
        nVar15.n();
        nVar15.e(TokenParser.SP);
        nVar15.g("+HHMM", "GMT");
        nVar15.t(t.SMART, uVar2);
    }

    DateTimeFormatter(e eVar, Locale locale, t tVar, j$.time.chrono.n nVar) {
        s sVar = s.f42089a;
        this.f42044a = eVar;
        Objects.a(locale, "locale");
        this.f42045b = locale;
        this.f42046c = sVar;
        Objects.a(tVar, "resolverStyle");
        this.f42047d = nVar;
        this.f42048e = null;
    }

    public final String a(j$.time.temporal.o oVar) {
        StringBuilder sb = new StringBuilder(32);
        Objects.a(oVar, "temporal");
        try {
            this.f42044a.i(new p(oVar, this), sb);
            return sb.toString();
        } catch (IOException e9) {
            throw new j$.time.c(e9.getMessage(), e9);
        }
    }

    public final j$.time.chrono.n b() {
        return this.f42047d;
    }

    public final s c() {
        return this.f42046c;
    }

    public final Locale d() {
        return this.f42045b;
    }

    public final ZoneId e() {
        return this.f42048e;
    }

    final e f() {
        return this.f42044a.a();
    }

    public final String toString() {
        String string = this.f42044a.toString();
        return string.startsWith("[") ? string : string.substring(1, string.length() - 1);
    }
}
