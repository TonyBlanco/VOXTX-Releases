package F8;

import B8.f;
import B8.h;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c {
    public static final long h(long j9, int i9) {
        return a.f((j9 << 1) + ((long) i9));
    }

    public static final long i(long j9) {
        return a.f((j9 << 1) + 1);
    }

    public static final long j(long j9) {
        return new f(-4611686018426L, 4611686018426L).h(j9) ? k(m(j9)) : i(h.i(j9, -4611686018427387903L, 4611686018427387903L));
    }

    public static final long k(long j9) {
        return a.f(j9 << 1);
    }

    public static final long l(long j9) {
        return new f(-4611686018426999999L, 4611686018426999999L).h(j9) ? k(j9) : i(n(j9));
    }

    public static final long m(long j9) {
        return j9 * ((long) 1000000);
    }

    public static final long n(long j9) {
        return j9 / ((long) 1000000);
    }

    public static final long o(int i9, d unit) {
        l.e(unit, "unit");
        return unit.compareTo(d.SECONDS) <= 0 ? k(e.b(i9, unit, d.NANOSECONDS)) : p(i9, unit);
    }

    public static final long p(long j9, d unit) {
        l.e(unit, "unit");
        d dVar = d.NANOSECONDS;
        long jB = e.b(4611686018426999999L, dVar, unit);
        return new f(-jB, jB).h(j9) ? k(e.b(j9, unit, dVar)) : i(h.i(e.a(j9, unit, d.MILLISECONDS), -4611686018427387903L, 4611686018427387903L));
    }
}
