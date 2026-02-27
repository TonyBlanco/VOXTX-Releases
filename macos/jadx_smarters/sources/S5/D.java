package s5;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public abstract class D {
    public static boolean a(Iterable iterable, r5.n nVar) {
        return E.b(iterable.iterator(), nVar);
    }

    public static Collection b(Iterable iterable) {
        return iterable instanceof Collection ? (Collection) iterable : G.j(iterable.iterator());
    }

    public static Object c(Iterable iterable, Object obj) {
        return E.m(iterable.iterator(), obj);
    }

    public static Object d(Iterable iterable) {
        if (!(iterable instanceof List)) {
            return E.k(iterable.iterator());
        }
        List list = (List) iterable;
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return f(list);
    }

    public static Object e(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return obj;
            }
            if (iterable instanceof List) {
                return f(G.a(iterable));
            }
        }
        return E.l(iterable.iterator(), obj);
    }

    public static Object f(List list) {
        return list.get(list.size() - 1);
    }

    public static boolean g(Iterable iterable, r5.n nVar) {
        return ((iterable instanceof RandomAccess) && (iterable instanceof List)) ? h((List) iterable, (r5.n) r5.m.k(nVar)) : E.q(iterable.iterator(), nVar);
    }

    public static boolean h(List list, r5.n nVar) {
        int i9 = 0;
        int i10 = 0;
        while (i9 < list.size()) {
            Object obj = list.get(i9);
            if (!nVar.apply(obj)) {
                if (i9 > i10) {
                    try {
                        list.set(i10, obj);
                    } catch (IllegalArgumentException unused) {
                        i(list, nVar, i10, i9);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        i(list, nVar, i10, i9);
                        return true;
                    }
                }
                i10++;
            }
            i9++;
        }
        list.subList(i10, list.size()).clear();
        return i9 != i10;
    }

    public static void i(List list, r5.n nVar, int i9, int i10) {
        for (int size = list.size() - 1; size > i10; size--) {
            if (nVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i11 = i10 - 1; i11 >= i9; i11--) {
            list.remove(i11);
        }
    }

    public static Object[] j(Iterable iterable) {
        return b(iterable).toArray();
    }
}
