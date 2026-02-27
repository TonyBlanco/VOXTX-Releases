package l8;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class s extends r {

    public static final class a implements D8.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterable f44258a;

        public a(Iterable iterable) {
            this.f44258a = iterable;
        }

        @Override // D8.d
        public Iterator iterator() {
            return this.f44258a.iterator();
        }
    }

    public static /* synthetic */ String A(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i9, CharSequence charSequence4, w8.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i10 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i10 & 4) == 0 ? charSequence3 : "";
        int i11 = (i10 & 8) != 0 ? -1 : i9;
        if ((i10 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i10 & 32) != 0) {
            lVar = null;
        }
        return z(iterable, charSequence, charSequence5, charSequence6, i11, charSequence7, lVar);
    }

    public static Object B(List list) {
        kotlin.jvm.internal.l.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(k.g(list));
    }

    public static Comparable C(Iterable iterable) {
        kotlin.jvm.internal.l.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static List D(Collection collection, Iterable elements) {
        kotlin.jvm.internal.l.e(collection, "<this>");
        kotlin.jvm.internal.l.e(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            p.q(arrayList, elements);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static List E(Collection collection, Object obj) {
        kotlin.jvm.internal.l.e(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static Object F(Iterable iterable) {
        kotlin.jvm.internal.l.e(iterable, "<this>");
        if (iterable instanceof List) {
            return G((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static final Object G(List list) {
        kotlin.jvm.internal.l.e(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static List H(Iterable iterable, int i9) {
        kotlin.jvm.internal.l.e(iterable, "<this>");
        if (i9 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i9 + " is less than zero.").toString());
        }
        if (i9 == 0) {
            return k.f();
        }
        if (iterable instanceof Collection) {
            if (i9 >= ((Collection) iterable).size()) {
                return L(iterable);
            }
            if (i9 == 1) {
                return j.b(u(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i9);
        Iterator it = iterable.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i10++;
            if (i10 == i9) {
                break;
            }
        }
        return k.k(arrayList);
    }

    public static byte[] I(Collection collection) {
        kotlin.jvm.internal.l.e(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        Iterator it = collection.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            bArr[i9] = ((Number) it.next()).byteValue();
            i9++;
        }
        return bArr;
    }

    public static final Collection J(Iterable iterable, Collection destination) {
        kotlin.jvm.internal.l.e(iterable, "<this>");
        kotlin.jvm.internal.l.e(destination, "destination");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static int[] K(Collection collection) {
        kotlin.jvm.internal.l.e(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            iArr[i9] = ((Number) it.next()).intValue();
            i9++;
        }
        return iArr;
    }

    public static List L(Iterable iterable) {
        kotlin.jvm.internal.l.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return k.k(M(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return k.f();
        }
        if (size != 1) {
            return N(collection);
        }
        return j.b(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final List M(Iterable iterable) {
        kotlin.jvm.internal.l.e(iterable, "<this>");
        return iterable instanceof Collection ? N((Collection) iterable) : (List) J(iterable, new ArrayList());
    }

    public static List N(Collection collection) {
        kotlin.jvm.internal.l.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set O(Iterable iterable) {
        kotlin.jvm.internal.l.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return E.c((Set) J(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return E.b();
        }
        if (size != 1) {
            return (Set) J(iterable, new LinkedHashSet(AbstractC2204A.a(collection.size())));
        }
        return D.a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static List P(Iterable iterable, int i9, int i10, boolean z9) {
        kotlin.jvm.internal.l.e(iterable, "<this>");
        F.a(i9, i10);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator itB = F.b(iterable.iterator(), i9, i10, z9, false);
            while (itB.hasNext()) {
                arrayList.add((List) itB.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i10) + (size % i10 == 0 ? 0 : 1));
        int i11 = 0;
        while (i11 >= 0 && i11 < size) {
            int iE = B8.h.e(i9, size - i11);
            if (iE < i9 && !z9) {
                break;
            }
            ArrayList arrayList3 = new ArrayList(iE);
            for (int i12 = 0; i12 < iE; i12++) {
                arrayList3.add(list.get(i12 + i11));
            }
            arrayList2.add(arrayList3);
            i11 += i10;
        }
        return arrayList2;
    }

    public static List Q(Iterable iterable, Iterable other) {
        kotlin.jvm.internal.l.e(iterable, "<this>");
        kotlin.jvm.internal.l.e(other, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(l.o(iterable, 10), l.o(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(k8.m.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static D8.d s(Iterable iterable) {
        kotlin.jvm.internal.l.e(iterable, "<this>");
        return new a(iterable);
    }

    public static List t(List list, int i9) {
        kotlin.jvm.internal.l.e(list, "<this>");
        if (i9 >= 0) {
            return H(list, B8.h.c(list.size() - i9, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i9 + " is less than zero.").toString());
    }

    public static final Object u(Iterable iterable) {
        kotlin.jvm.internal.l.e(iterable, "<this>");
        if (iterable instanceof List) {
            return v((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object v(List list) {
        kotlin.jvm.internal.l.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object w(List list) {
        kotlin.jvm.internal.l.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final Appendable x(Iterable iterable, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i9, CharSequence truncated, w8.l lVar) throws IOException {
        kotlin.jvm.internal.l.e(iterable, "<this>");
        kotlin.jvm.internal.l.e(buffer, "buffer");
        kotlin.jvm.internal.l.e(separator, "separator");
        kotlin.jvm.internal.l.e(prefix, "prefix");
        kotlin.jvm.internal.l.e(postfix, "postfix");
        kotlin.jvm.internal.l.e(truncated, "truncated");
        buffer.append(prefix);
        int i10 = 0;
        for (Object obj : iterable) {
            i10++;
            if (i10 > 1) {
                buffer.append(separator);
            }
            if (i9 >= 0 && i10 > i9) {
                break;
            }
            E8.f.a(buffer, obj, lVar);
        }
        if (i9 >= 0 && i10 > i9) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final String z(Iterable iterable, CharSequence separator, CharSequence prefix, CharSequence postfix, int i9, CharSequence truncated, w8.l lVar) {
        kotlin.jvm.internal.l.e(iterable, "<this>");
        kotlin.jvm.internal.l.e(separator, "separator");
        kotlin.jvm.internal.l.e(prefix, "prefix");
        kotlin.jvm.internal.l.e(postfix, "postfix");
        kotlin.jvm.internal.l.e(truncated, "truncated");
        String string = ((StringBuilder) x(iterable, new StringBuilder(), separator, prefix, postfix, i9, truncated, lVar)).toString();
        kotlin.jvm.internal.l.d(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }
}
