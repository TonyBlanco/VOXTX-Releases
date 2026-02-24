package s5;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import s5.AbstractC2732m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Z {

    public class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Set f50038a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Set f50039c;

        /* JADX INFO: renamed from: s5.Z$a$a, reason: collision with other inner class name */
        public class C0443a extends AbstractC2721b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Iterator f50040d;

            public C0443a() {
                this.f50040d = a.this.f50038a.iterator();
            }

            @Override // s5.AbstractC2721b
            public Object b() {
                while (this.f50040d.hasNext()) {
                    Object next = this.f50040d.next();
                    if (a.this.f50039c.contains(next)) {
                        return next;
                    }
                }
                return c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Set set, Set set2) {
            super(null);
            this.f50038a = set;
            this.f50039c = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f50038a.contains(obj) && this.f50039c.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection collection) {
            return this.f50038a.containsAll(collection) && this.f50039c.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public c0 iterator() {
            return new C0443a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f50039c, this.f50038a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator it = this.f50038a.iterator();
            int i9 = 0;
            while (it.hasNext()) {
                if (this.f50039c.contains(it.next())) {
                    i9++;
                }
            }
            return i9;
        }
    }

    public static class b extends AbstractC2732m.a implements Set {
        public b(Set set, r5.n nVar) {
            super(set, nVar);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return Z.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Z.d(this);
        }
    }

    public static class c extends b implements SortedSet {
        public c(SortedSet sortedSet, r5.n nVar) {
            super(sortedSet, nVar);
        }

        @Override // java.util.SortedSet
        public Comparator comparator() {
            return ((SortedSet) this.f50090a).comparator();
        }

        @Override // java.util.SortedSet
        public Object first() {
            return E.j(this.f50090a.iterator(), this.f50091c);
        }

        @Override // java.util.SortedSet
        public SortedSet headSet(Object obj) {
            return new c(((SortedSet) this.f50090a).headSet(obj), this.f50091c);
        }

        @Override // java.util.SortedSet
        public Object last() {
            SortedSet sortedSetHeadSet = (SortedSet) this.f50090a;
            while (true) {
                Object objLast = sortedSetHeadSet.last();
                if (this.f50091c.apply(objLast)) {
                    return objLast;
                }
                sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet subSet(Object obj, Object obj2) {
            return new c(((SortedSet) this.f50090a).subSet(obj, obj2), this.f50091c);
        }

        @Override // java.util.SortedSet
        public SortedSet tailSet(Object obj) {
            return new c(((SortedSet) this.f50090a).tailSet(obj), this.f50091c);
        }
    }

    public static abstract class d extends AbstractSet {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            return Z.i(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            return super.retainAll((Collection) r5.m.k(collection));
        }
    }

    public static abstract class e extends AbstractSet {
        public e() {
        }

        public /* synthetic */ e(Y y9) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }
    }

    public static boolean a(Set set, Object obj) {
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
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static Set b(Set set, r5.n nVar) {
        if (set instanceof SortedSet) {
            return c((SortedSet) set, nVar);
        }
        if (!(set instanceof b)) {
            return new b((Set) r5.m.k(set), (r5.n) r5.m.k(nVar));
        }
        b bVar = (b) set;
        return new b((Set) bVar.f50090a, r5.o.b(bVar.f50091c, nVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SortedSet c(SortedSet sortedSet, r5.n nVar) {
        if (!(sortedSet instanceof b)) {
            return new c((SortedSet) r5.m.k(sortedSet), (r5.n) r5.m.k(nVar));
        }
        b bVar = (b) sortedSet;
        return new c((SortedSet) bVar.f50090a, r5.o.b(bVar.f50091c, nVar));
    }

    public static int d(Set set) {
        Iterator it = set.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i9 = ~(~(i9 + (next != null ? next.hashCode() : 0)));
        }
        return i9;
    }

    public static e e(Set set, Set set2) {
        r5.m.l(set, "set1");
        r5.m.l(set2, "set2");
        return new a(set, set2);
    }

    public static HashSet f() {
        return new HashSet();
    }

    public static HashSet g(int i9) {
        return new HashSet(I.a(i9));
    }

    public static Set h() {
        return Collections.newSetFromMap(I.g());
    }

    public static boolean i(Set set, Collection collection) {
        r5.m.k(collection);
        if (collection instanceof M) {
            collection = ((M) collection).v();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? j(set, collection.iterator()) : E.p(set.iterator(), collection);
    }

    public static boolean j(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }
}
