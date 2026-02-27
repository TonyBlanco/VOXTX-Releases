package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.common.api.a;
import j$.util.Objects;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes3.dex */
public final class axo {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public static Object[] A(Iterable iterable) {
        boolean z9 = iterable instanceof Collection;
        ?? T8 = iterable;
        if (!z9) {
            T8 = t(iterable.iterator());
        }
        return T8.toArray();
    }

    public static Object B(Iterable iterable) {
        return y(iterable.iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object C(Iterable iterable) {
        if (iterable.isEmpty()) {
            return null;
        }
        return L(iterable);
    }

    public static void D(Iterable iterable, atm atmVar) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            atp.k(atmVar);
            N((List) iterable, atmVar);
            return;
        }
        Iterator it = iterable.iterator();
        atp.k(atmVar);
        while (it.hasNext()) {
            if (atmVar.a(it.next())) {
                it.remove();
            }
        }
    }

    public static int E(int i9) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i9) * (-862048943)), 15)) * 461845907);
    }

    public static int F(Object obj) {
        return E(obj == null ? 0 : obj.hashCode());
    }

    public static int G(int i9) {
        int iMax = Math.max(i9, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax <= iHighestOneBit) {
            return iHighestOneBit;
        }
        int i10 = iHighestOneBit + iHighestOneBit;
        if (i10 > 0) {
            return i10;
        }
        return 1073741824;
    }

    public static boolean H(Collection collection, Object obj) {
        atp.k(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static void I(Object obj, Object obj2) {
        if (obj == null) {
            Objects.toString(obj2);
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    public static void J(boolean z9) {
        atp.i(z9, "no calls to next() since the last call to remove()");
    }

    public static void K(int i9, String str) {
        if (i9 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i9);
    }

    private static Object L(List list) {
        return list.get(list.size() - 1);
    }

    private static void M(List list, atm atmVar, int i9, int i10) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i10) {
                break;
            } else if (atmVar.a(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i10--;
            if (i10 < i9) {
                return;
            } else {
                list.remove(i10);
            }
        }
    }

    private static boolean N(List list, atm atmVar) {
        int i9 = 0;
        int i10 = 0;
        while (i9 < list.size()) {
            Object obj = list.get(i9);
            if (!atmVar.a(obj)) {
                if (i9 > i10) {
                    try {
                        list.set(i10, obj);
                    } catch (IllegalArgumentException unused) {
                        M(list, atmVar, i10, i9);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        M(list, atmVar, i10, i9);
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

    public static boolean a(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        atp.k(comparator);
        atp.k(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = awx.f20860a;
            }
        } else {
            if (!(iterable instanceof axn)) {
                return false;
            }
            comparator2 = ((axn) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }

    public static int b(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public static HashSet c() {
        return new HashSet();
    }

    public static HashSet d(int i9) {
        return new HashSet(m(i9));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection, java.util.Set] */
    public static Set e(Set set, atm atmVar) {
        if (!(set instanceof SortedSet)) {
            if (set instanceof axj) {
                axj axjVar = (axj) set;
                return new axj(axjVar.f20765a, atp.d(axjVar.f20766b, atmVar));
            }
            atp.k(set);
            atp.k(atmVar);
            return new axj(set, atmVar);
        }
        SortedSet sortedSet = (SortedSet) set;
        if (sortedSet instanceof axj) {
            axj axjVar2 = (axj) sortedSet;
            return new axk((SortedSet) axjVar2.f20765a, atp.d(axjVar2.f20766b, atmVar));
        }
        atp.k(sortedSet);
        atp.k(atmVar);
        return new axk(sortedSet, atmVar);
    }

    public static Set f() {
        return Collections.newSetFromMap(new IdentityHashMap());
    }

    public static boolean g(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean h(Set set, Collection collection) {
        atp.k(collection);
        if (collection instanceof aww) {
            collection = ((aww) collection).a();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return i(set, collection.iterator());
        }
        Iterator it = set.iterator();
        atp.k(collection);
        boolean z9 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z9 = true;
            }
        }
        return z9;
    }

    public static boolean i(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    public static Object[] j(Object[] objArr, int i9) {
        return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i9);
    }

    public static void k(Object obj, int i9) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException("at index " + i9);
    }

    public static void l(Object[] objArr, int i9) {
        for (int i10 = 0; i10 < i9; i10++) {
            k(objArr[i10], i10);
        }
    }

    public static int m(int i9) {
        if (i9 >= 3) {
            return i9 < 1073741824 ? (int) Math.ceil(((double) i9) / 0.75d) : a.e.API_PRIORITY_OTHER;
        }
        K(i9, "expectedSize");
        return i9 + 1;
    }

    public static Object n(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    public static Object o(Map map, Object obj) {
        atp.k(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static HashMap p(int i9) {
        return new HashMap(m(i9));
    }

    public static Iterator q(Iterator it) {
        return new awl(it);
    }

    public static Map.Entry r(Object obj, Object obj2) {
        return new avj(obj, obj2);
    }

    public static boolean s(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static ArrayList t(Iterator it) {
        ArrayList arrayList = new ArrayList();
        atp.k(it);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    @SafeVarargs
    public static ArrayList u(Object... objArr) {
        K(1, "arraySize");
        ArrayList arrayList = new ArrayList(axy.b(6L));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static Object v(Iterator it) {
        Object next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static Object w(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    public static void x(Iterator it) {
        atp.k(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static Object y(Iterator it) {
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object z(Iterable iterable) {
        if (!(iterable instanceof List)) {
            return v(iterable.iterator());
        }
        if (iterable.isEmpty()) {
            throw new NoSuchElementException();
        }
        return L(iterable);
    }
}
