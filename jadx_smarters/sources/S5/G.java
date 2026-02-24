package s5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public abstract class G {
    public static List a(Iterable iterable) {
        return (List) iterable;
    }

    public static int b(int i9) {
        AbstractC2731l.b(i9, "arraySize");
        return w5.f.k(((long) i9) + 5 + ((long) (i9 / 10)));
    }

    public static boolean c(List list, Object obj) {
        if (obj == r5.m.k(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return E.e(list.iterator(), list2.iterator());
        }
        for (int i9 = 0; i9 < size; i9++) {
            if (!r5.j.a(list.get(i9), list2.get(i9))) {
                return false;
            }
        }
        return true;
    }

    public static int d(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return e(list, obj);
        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (r5.j.a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    public static int e(List list, Object obj) {
        int size = list.size();
        int i9 = 0;
        if (obj == null) {
            while (i9 < size) {
                if (list.get(i9) == null) {
                    return i9;
                }
                i9++;
            }
            return -1;
        }
        while (i9 < size) {
            if (obj.equals(list.get(i9))) {
                return i9;
            }
            i9++;
        }
        return -1;
    }

    public static int f(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return g(list, obj);
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (r5.j.a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public static int g(List list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    public static ArrayList h() {
        return new ArrayList();
    }

    public static ArrayList i(Iterable iterable) {
        r5.m.k(iterable);
        return iterable instanceof Collection ? new ArrayList((Collection) iterable) : j(iterable.iterator());
    }

    public static ArrayList j(Iterator it) {
        ArrayList arrayListH = h();
        E.a(arrayListH, it);
        return arrayListH;
    }

    public static ArrayList k(Object... objArr) {
        r5.m.k(objArr);
        ArrayList arrayList = new ArrayList(b(objArr.length));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }
}
