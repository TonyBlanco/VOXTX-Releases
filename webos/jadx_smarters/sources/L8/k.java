package l8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import m8.AbstractC2238a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k extends j {
    public static final Collection c(Object[] objArr) {
        kotlin.jvm.internal.l.e(objArr, "<this>");
        return new C2209d(objArr, false);
    }

    public static final int d(List list, Comparable comparable, int i9, int i10) {
        kotlin.jvm.internal.l.e(list, "<this>");
        l(list.size(), i9, i10);
        int i11 = i10 - 1;
        while (i9 <= i11) {
            int i12 = (i9 + i11) >>> 1;
            int iA = AbstractC2238a.a((Comparable) list.get(i12), comparable);
            if (iA < 0) {
                i9 = i12 + 1;
            } else {
                if (iA <= 0) {
                    return i12;
                }
                i11 = i12 - 1;
            }
        }
        return -(i9 + 1);
    }

    public static /* synthetic */ int e(List list, Comparable comparable, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i9 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = list.size();
        }
        return d(list, comparable, i9, i10);
    }

    public static List f() {
        return u.f44260a;
    }

    public static int g(List list) {
        kotlin.jvm.internal.l.e(list, "<this>");
        return list.size() - 1;
    }

    public static List h(Object... elements) {
        kotlin.jvm.internal.l.e(elements, "elements");
        return elements.length > 0 ? AbstractC2212g.b(elements) : f();
    }

    public static List i(Object... elements) {
        kotlin.jvm.internal.l.e(elements, "elements");
        return h.o(elements);
    }

    public static List j(Object... elements) {
        kotlin.jvm.internal.l.e(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new C2209d(elements, true));
    }

    public static List k(List list) {
        kotlin.jvm.internal.l.e(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : j.b(list.get(0)) : f();
    }

    public static final void l(int i9, int i10, int i11) {
        if (i10 > i11) {
            throw new IllegalArgumentException("fromIndex (" + i10 + ") is greater than toIndex (" + i11 + ").");
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i10 + ") is less than zero.");
        }
        if (i11 <= i9) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i11 + ") is greater than size (" + i9 + ").");
    }

    public static void m() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void n() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
