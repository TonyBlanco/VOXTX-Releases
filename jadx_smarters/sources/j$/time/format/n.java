package j$.time.format;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f42075f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f42076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f42077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f42078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f42079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f42080e;

    static {
        HashMap map = new HashMap();
        map.put('G', j$.time.temporal.a.ERA);
        map.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        map.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.r rVar = j$.time.temporal.j.f42138a;
        map.put('Q', rVar);
        map.put('q', rVar);
        j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
        map.put('M', aVar);
        map.put('L', aVar);
        map.put('D', j$.time.temporal.a.DAY_OF_YEAR);
        map.put('d', j$.time.temporal.a.DAY_OF_MONTH);
        map.put('F', j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_WEEK;
        map.put('E', aVar2);
        map.put('c', aVar2);
        map.put('e', aVar2);
        map.put('a', j$.time.temporal.a.AMPM_OF_DAY);
        map.put('H', j$.time.temporal.a.HOUR_OF_DAY);
        map.put('k', j$.time.temporal.a.CLOCK_HOUR_OF_DAY);
        map.put('K', j$.time.temporal.a.HOUR_OF_AMPM);
        map.put('h', j$.time.temporal.a.CLOCK_HOUR_OF_AMPM);
        map.put('m', j$.time.temporal.a.MINUTE_OF_HOUR);
        map.put('s', j$.time.temporal.a.SECOND_OF_MINUTE);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
        map.put('S', aVar3);
        map.put('A', j$.time.temporal.a.MILLI_OF_DAY);
        map.put('n', aVar3);
        map.put('N', j$.time.temporal.a.NANO_OF_DAY);
        map.put('g', j$.time.temporal.l.f42145a);
    }

    public n() {
        this.f42076a = this;
        this.f42078c = new ArrayList();
        this.f42080e = -1;
        this.f42077b = null;
        this.f42079d = false;
    }

    private n(n nVar) {
        this.f42076a = this;
        this.f42078c = new ArrayList();
        this.f42080e = -1;
        this.f42077b = nVar;
        this.f42079d = true;
    }

    private int d(f fVar) {
        Objects.a(fVar, "pp");
        n nVar = this.f42076a;
        nVar.getClass();
        nVar.f42078c.add(fVar);
        this.f42076a.f42080e = -1;
        return r2.f42078c.size() - 1;
    }

    private void j(i iVar) {
        i iVarB;
        n nVar = this.f42076a;
        int i9 = nVar.f42080e;
        if (i9 < 0) {
            nVar.f42080e = d(iVar);
            return;
        }
        i iVar2 = (i) nVar.f42078c.get(i9);
        int i10 = iVar.f42059b;
        int i11 = iVar.f42060c;
        if (i10 == i11 && iVar.f42061d == u.NOT_NEGATIVE) {
            iVarB = iVar2.c(i11);
            d(iVar.b());
            this.f42076a.f42080e = i9;
        } else {
            iVarB = iVar2.b();
            this.f42076a.f42080e = d(iVar);
        }
        this.f42076a.f42078c.set(i9, iVarB);
    }

    private DateTimeFormatter u(Locale locale, t tVar, j$.time.chrono.n nVar) {
        Objects.a(locale, "locale");
        while (this.f42076a.f42077b != null) {
            n();
        }
        e eVar = new e((List) this.f42078c, false);
        s sVar = s.f42089a;
        return new DateTimeFormatter(eVar, locale, tVar, nVar);
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        d(dateTimeFormatter.f());
    }

    public final void b(j$.time.temporal.r rVar) {
        g gVar = new g(rVar, 0, 9, true, 0);
        Objects.a(rVar, "field");
        if (!rVar.i().g()) {
            throw new IllegalArgumentException(j$.time.d.a("Field must have a fixed set of values: ", rVar));
        }
        d(gVar);
    }

    public final void c() {
        d(new h());
    }

    public final void e(char c9) {
        d(new d(c9));
    }

    public final void f(String str) {
        if (str.isEmpty()) {
            return;
        }
        d(str.length() == 1 ? new d(str.charAt(0)) : new l(str, 0));
    }

    public final void g(String str, String str2) {
        d(new j(str, str2));
    }

    public final void h() {
        d(j.f42064e);
    }

    public final void i(j$.time.temporal.r rVar, HashMap map) {
        Objects.a(rVar, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        v vVar = v.FULL;
        d(new m(rVar, vVar, new b(new r(Collections.singletonMap(vVar, linkedHashMap)))));
    }

    public final void k(j$.time.temporal.r rVar, int i9) {
        Objects.a(rVar, "field");
        if (i9 >= 1 && i9 <= 19) {
            j(new i(rVar, i9, i9, u.NOT_NEGATIVE));
        } else {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i9);
        }
    }

    public final void l(j$.time.temporal.r rVar, int i9, int i10, u uVar) {
        if (i9 == i10 && uVar == u.NOT_NEGATIVE) {
            k(rVar, i10);
            return;
        }
        Objects.a(rVar, "field");
        Objects.a(uVar, "signStyle");
        if (i9 < 1 || i9 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i9);
        }
        if (i10 < 1 || i10 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i10);
        }
        if (i10 >= i9) {
            j(new i(rVar, i9, i10, uVar));
            return;
        }
        throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i10 + " < " + i9);
    }

    public final void m() {
        d(new l(f42075f, 1));
    }

    public final void n() {
        n nVar = this.f42076a;
        if (nVar.f42077b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (nVar.f42078c.size() <= 0) {
            this.f42076a = this.f42076a.f42077b;
            return;
        }
        n nVar2 = this.f42076a;
        e eVar = new e(nVar2.f42078c, nVar2.f42079d);
        this.f42076a = this.f42076a.f42077b;
        d(eVar);
    }

    public final void o() {
        n nVar = this.f42076a;
        nVar.f42080e = -1;
        this.f42076a = new n(nVar);
    }

    public final void p() {
        d(k.INSENSITIVE);
    }

    public final void q() {
        d(k.SENSITIVE);
    }

    public final void r() {
        d(k.LENIENT);
    }

    public final void s() {
        d(k.STRICT);
    }

    final DateTimeFormatter t(t tVar, j$.time.chrono.n nVar) {
        return u(Locale.getDefault(), tVar, nVar);
    }

    public final void v() {
        u(Locale.getDefault(), t.SMART, null);
    }
}
