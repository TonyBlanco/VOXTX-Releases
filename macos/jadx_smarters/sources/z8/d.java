package z8;

import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d {
    public static final String a(Object from, Object until) {
        l.e(from, "from");
        l.e(until, "until");
        return "Random range is empty: [" + from + ", " + until + ").";
    }

    public static final void b(int i9, int i10) {
        if (i10 <= i9) {
            throw new IllegalArgumentException(a(Integer.valueOf(i9), Integer.valueOf(i10)).toString());
        }
    }

    public static final int c(int i9) {
        return 31 - Integer.numberOfLeadingZeros(i9);
    }

    public static final int d(c cVar, B8.c range) {
        l.e(cVar, "<this>");
        l.e(range, "range");
        if (!range.isEmpty()) {
            return range.f() < Integer.MAX_VALUE ? cVar.d(range.d(), range.f() + 1) : range.d() > Integer.MIN_VALUE ? cVar.d(range.d() - 1, range.f()) + 1 : cVar.c();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    public static final int e(int i9, int i10) {
        return (i9 >>> (32 - i10)) & ((-i10) >> 31);
    }
}
