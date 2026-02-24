package s5;

import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import s5.AbstractC2725f;
import s5.I;

/* JADX INFO: renamed from: s5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2723d extends AbstractC2725f implements Serializable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient Map f50049f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient int f50050g;

    /* JADX INFO: renamed from: s5.d$a */
    public class a extends AbstractC0445d {
        public a(AbstractC2723d abstractC2723d) {
            super();
        }

        @Override // s5.AbstractC2723d.AbstractC0445d
        public Object a(Object obj, Object obj2) {
            return obj2;
        }
    }

    /* JADX INFO: renamed from: s5.d$b */
    public class b extends AbstractC0445d {
        public b(AbstractC2723d abstractC2723d) {
            super();
        }

        @Override // s5.AbstractC2723d.AbstractC0445d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry a(Object obj, Object obj2) {
            return I.d(obj, obj2);
        }
    }

    /* JADX INFO: renamed from: s5.d$c */
    public class c extends I.f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final transient Map f50051d;

        /* JADX INFO: renamed from: s5.d$c$a */
        public class a extends I.c {
            public a() {
            }

            @Override // s5.I.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return AbstractC2732m.c(c.this.f50051d.entrySet(), obj);
            }

            @Override // s5.I.c
            public Map d() {
                return c.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                return c.this.new b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                AbstractC2723d.this.w(entry.getKey());
                return true;
            }
        }

        /* JADX INFO: renamed from: s5.d$c$b */
        public class b implements Iterator {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Iterator f50054a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Collection f50055c;

            public b() {
                this.f50054a = c.this.f50051d.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry next() {
                Map.Entry entry = (Map.Entry) this.f50054a.next();
                this.f50055c = (Collection) entry.getValue();
                return c.this.f(entry);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f50054a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                r5.m.q(this.f50055c != null, "no calls to next() since the last call to remove()");
                this.f50054a.remove();
                AbstractC2723d.p(AbstractC2723d.this, this.f50055c.size());
                this.f50055c.clear();
                this.f50055c = null;
            }
        }

        public c(Map map) {
            this.f50051d = map;
        }

        @Override // s5.I.f
        public Set a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f50051d == AbstractC2723d.this.f50049f) {
                AbstractC2723d.this.clear();
            } else {
                E.c(new b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return I.i(this.f50051d, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Collection get(Object obj) {
            Collection collection = (Collection) I.j(this.f50051d, obj);
            if (collection == null) {
                return null;
            }
            return AbstractC2723d.this.y(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Collection remove(Object obj) {
            Collection collection = (Collection) this.f50051d.remove(obj);
            if (collection == null) {
                return null;
            }
            Collection collectionR = AbstractC2723d.this.r();
            collectionR.addAll(collection);
            AbstractC2723d.p(AbstractC2723d.this, collection.size());
            collection.clear();
            return collectionR;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.f50051d.equals(obj);
        }

        public Map.Entry f(Map.Entry entry) {
            Object key = entry.getKey();
            return I.d(key, AbstractC2723d.this.y(key, (Collection) entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f50051d.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set keySet() {
            return AbstractC2723d.this.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f50051d.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f50051d.toString();
        }
    }

    /* JADX INFO: renamed from: s5.d$d, reason: collision with other inner class name */
    public abstract class AbstractC0445d implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator f50057a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f50058c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Collection f50059d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Iterator f50060e = E.h();

        public AbstractC0445d() {
            this.f50057a = AbstractC2723d.this.f50049f.entrySet().iterator();
        }

        public abstract Object a(Object obj, Object obj2);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f50057a.hasNext() || this.f50060e.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f50060e.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f50057a.next();
                this.f50058c = entry.getKey();
                Collection collection = (Collection) entry.getValue();
                this.f50059d = collection;
                this.f50060e = collection.iterator();
            }
            return a(O.a(this.f50058c), this.f50060e.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f50060e.remove();
            Collection collection = this.f50059d;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f50057a.remove();
            }
            AbstractC2723d.n(AbstractC2723d.this);
        }
    }

    /* JADX INFO: renamed from: s5.d$e */
    public class e extends I.d {

        /* JADX INFO: renamed from: s5.d$e$a */
        public class a implements Iterator {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Map.Entry f50063a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Iterator f50064c;

            public a(Iterator it) {
                this.f50064c = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f50064c.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                Map.Entry entry = (Map.Entry) this.f50064c.next();
                this.f50063a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                r5.m.q(this.f50063a != null, "no calls to next() since the last call to remove()");
                Collection collection = (Collection) this.f50063a.getValue();
                this.f50064c.remove();
                AbstractC2723d.p(AbstractC2723d.this, collection.size());
                collection.clear();
                this.f50063a = null;
            }
        }

        public e(Map map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            E.c(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection collection) {
            return d().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || d().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return d().keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a(d().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int size;
            Collection collection = (Collection) d().remove(obj);
            if (collection != null) {
                size = collection.size();
                collection.clear();
                AbstractC2723d.p(AbstractC2723d.this, size);
            } else {
                size = 0;
            }
            return size > 0;
        }
    }

    /* JADX INFO: renamed from: s5.d$f */
    public class f extends i implements NavigableMap {
        public f(NavigableMap navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableMap
        public Map.Entry ceilingEntry(Object obj) {
            Map.Entry entryCeilingEntry = i().ceilingEntry(obj);
            if (entryCeilingEntry == null) {
                return null;
            }
            return f(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        public Object ceilingKey(Object obj) {
            return i().ceilingKey(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableSet descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap descendingMap() {
            return AbstractC2723d.this.new f(i().descendingMap());
        }

        @Override // java.util.NavigableMap
        public Map.Entry firstEntry() {
            Map.Entry entryFirstEntry = i().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return f(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry floorEntry(Object obj) {
            Map.Entry entryFloorEntry = i().floorEntry(obj);
            if (entryFloorEntry == null) {
                return null;
            }
            return f(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        public Object floorKey(Object obj) {
            return i().floorKey(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableMap headMap(Object obj, boolean z9) {
            return AbstractC2723d.this.new f(i().headMap(obj, z9));
        }

        @Override // java.util.NavigableMap
        public Map.Entry higherEntry(Object obj) {
            Map.Entry entryHigherEntry = i().higherEntry(obj);
            if (entryHigherEntry == null) {
                return null;
            }
            return f(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        public Object higherKey(Object obj) {
            return i().higherKey(obj);
        }

        @Override // s5.AbstractC2723d.i
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public NavigableSet g() {
            return AbstractC2723d.this.new g(i());
        }

        @Override // s5.AbstractC2723d.i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public NavigableMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap
        public Map.Entry lastEntry() {
            Map.Entry entryLastEntry = i().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return f(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry lowerEntry(Object obj) {
            Map.Entry entryLowerEntry = i().lowerEntry(obj);
            if (entryLowerEntry == null) {
                return null;
            }
            return f(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        public Object lowerKey(Object obj) {
            return i().lowerKey(obj);
        }

        @Override // s5.AbstractC2723d.i, s5.AbstractC2723d.c, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet keySet() {
            return (NavigableSet) super.keySet();
        }

        public Map.Entry n(Iterator it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Collection collectionR = AbstractC2723d.this.r();
            collectionR.addAll((Collection) entry.getValue());
            it.remove();
            return I.d(entry.getKey(), AbstractC2723d.this.x(collectionR));
        }

        @Override // java.util.NavigableMap
        public NavigableSet navigableKeySet() {
            return h();
        }

        @Override // s5.AbstractC2723d.i
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public NavigableMap i() {
            return (NavigableMap) super.i();
        }

        @Override // s5.AbstractC2723d.i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public NavigableMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // java.util.NavigableMap
        public Map.Entry pollFirstEntry() {
            return n(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry pollLastEntry() {
            return n(descendingMap().entrySet().iterator());
        }

        @Override // s5.AbstractC2723d.i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public NavigableMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap subMap(Object obj, boolean z9, Object obj2, boolean z10) {
            return AbstractC2723d.this.new f(i().subMap(obj, z9, obj2, z10));
        }

        @Override // java.util.NavigableMap
        public NavigableMap tailMap(Object obj, boolean z9) {
            return AbstractC2723d.this.new f(i().tailMap(obj, z9));
        }
    }

    /* JADX INFO: renamed from: s5.d$g */
    public class g extends j implements NavigableSet {
        public g(NavigableMap navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public Object ceiling(Object obj) {
            return f().ceilingKey(obj);
        }

        @Override // java.util.NavigableSet
        public Iterator descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet descendingSet() {
            return AbstractC2723d.this.new g(f().descendingMap());
        }

        @Override // java.util.NavigableSet
        public Object floor(Object obj) {
            return f().floorKey(obj);
        }

        @Override // s5.AbstractC2723d.j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // java.util.NavigableSet
        public NavigableSet headSet(Object obj, boolean z9) {
            return AbstractC2723d.this.new g(f().headMap(obj, z9));
        }

        @Override // java.util.NavigableSet
        public Object higher(Object obj) {
            return f().higherKey(obj);
        }

        @Override // s5.AbstractC2723d.j
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public NavigableMap f() {
            return (NavigableMap) super.f();
        }

        @Override // s5.AbstractC2723d.j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public NavigableSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // s5.AbstractC2723d.j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public NavigableSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        @Override // java.util.NavigableSet
        public Object lower(Object obj) {
            return f().lowerKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object pollFirst() {
            return E.o(iterator());
        }

        @Override // java.util.NavigableSet
        public Object pollLast() {
            return E.o(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet subSet(Object obj, boolean z9, Object obj2, boolean z10) {
            return AbstractC2723d.this.new g(f().subMap(obj, z9, obj2, z10));
        }

        @Override // java.util.NavigableSet
        public NavigableSet tailSet(Object obj, boolean z9) {
            return AbstractC2723d.this.new g(f().tailMap(obj, z9));
        }
    }

    /* JADX INFO: renamed from: s5.d$h */
    public class h extends l implements RandomAccess {
        public h(AbstractC2723d abstractC2723d, Object obj, List list, k kVar) {
            super(obj, list, kVar);
        }
    }

    /* JADX INFO: renamed from: s5.d$i */
    public class i extends c implements SortedMap {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public SortedSet f50068f;

        public i(SortedMap sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public Comparator comparator() {
            return i().comparator();
        }

        @Override // java.util.SortedMap
        public Object firstKey() {
            return i().firstKey();
        }

        public SortedSet g() {
            return AbstractC2723d.this.new j(i());
        }

        @Override // s5.AbstractC2723d.c, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: h */
        public SortedSet keySet() {
            SortedSet sortedSet = this.f50068f;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet sortedSetG = g();
            this.f50068f = sortedSetG;
            return sortedSetG;
        }

        public SortedMap headMap(Object obj) {
            return AbstractC2723d.this.new i(i().headMap(obj));
        }

        public SortedMap i() {
            return (SortedMap) this.f50051d;
        }

        @Override // java.util.SortedMap
        public Object lastKey() {
            return i().lastKey();
        }

        public SortedMap subMap(Object obj, Object obj2) {
            return AbstractC2723d.this.new i(i().subMap(obj, obj2));
        }

        public SortedMap tailMap(Object obj) {
            return AbstractC2723d.this.new i(i().tailMap(obj));
        }
    }

    /* JADX INFO: renamed from: s5.d$j */
    public class j extends e implements SortedSet {
        public j(SortedMap sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        public Comparator comparator() {
            return f().comparator();
        }

        public SortedMap f() {
            return (SortedMap) super.d();
        }

        @Override // java.util.SortedSet
        public Object first() {
            return f().firstKey();
        }

        public SortedSet headSet(Object obj) {
            return AbstractC2723d.this.new j(f().headMap(obj));
        }

        @Override // java.util.SortedSet
        public Object last() {
            return f().lastKey();
        }

        public SortedSet subSet(Object obj, Object obj2) {
            return AbstractC2723d.this.new j(f().subMap(obj, obj2));
        }

        public SortedSet tailSet(Object obj) {
            return AbstractC2723d.this.new j(f().tailMap(obj));
        }
    }

    /* JADX INFO: renamed from: s5.d$k */
    public class k extends AbstractCollection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f50071a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Collection f50072c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final k f50073d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Collection f50074e;

        /* JADX INFO: renamed from: s5.d$k$a */
        public class a implements Iterator {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Iterator f50076a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Collection f50077c;

            public a() {
                Collection collection = k.this.f50072c;
                this.f50077c = collection;
                this.f50076a = AbstractC2723d.v(collection);
            }

            public a(Iterator it) {
                this.f50077c = k.this.f50072c;
                this.f50076a = it;
            }

            public Iterator b() {
                c();
                return this.f50076a;
            }

            public void c() {
                k.this.j();
                if (k.this.f50072c != this.f50077c) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                c();
                return this.f50076a.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                c();
                return this.f50076a.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f50076a.remove();
                AbstractC2723d.n(AbstractC2723d.this);
                k.this.l();
            }
        }

        public k(Object obj, Collection collection, k kVar) {
            this.f50071a = obj;
            this.f50072c = collection;
            this.f50073d = kVar;
            this.f50074e = kVar == null ? null : kVar.g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(Object obj) {
            j();
            boolean zIsEmpty = this.f50072c.isEmpty();
            boolean zAdd = this.f50072c.add(obj);
            if (zAdd) {
                AbstractC2723d.m(AbstractC2723d.this);
                if (zIsEmpty) {
                    d();
                }
            }
            return zAdd;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.f50072c.addAll(collection);
            if (zAddAll) {
                AbstractC2723d.o(AbstractC2723d.this, this.f50072c.size() - size);
                if (size == 0) {
                    d();
                }
            }
            return zAddAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f50072c.clear();
            AbstractC2723d.p(AbstractC2723d.this, size);
            l();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            j();
            return this.f50072c.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection collection) {
            j();
            return this.f50072c.containsAll(collection);
        }

        public void d() {
            k kVar = this.f50073d;
            if (kVar != null) {
                kVar.d();
            } else {
                AbstractC2723d.this.f50049f.put(this.f50071a, this.f50072c);
            }
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            j();
            return this.f50072c.equals(obj);
        }

        public k f() {
            return this.f50073d;
        }

        public Collection g() {
            return this.f50072c;
        }

        @Override // java.util.Collection
        public int hashCode() {
            j();
            return this.f50072c.hashCode();
        }

        public Object i() {
            return this.f50071a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            j();
            return new a();
        }

        public void j() {
            Collection collection;
            k kVar = this.f50073d;
            if (kVar != null) {
                kVar.j();
                if (this.f50073d.g() != this.f50074e) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f50072c.isEmpty() || (collection = (Collection) AbstractC2723d.this.f50049f.get(this.f50071a)) == null) {
                    return;
                }
                this.f50072c = collection;
            }
        }

        public void l() {
            k kVar = this.f50073d;
            if (kVar != null) {
                kVar.l();
            } else if (this.f50072c.isEmpty()) {
                AbstractC2723d.this.f50049f.remove(this.f50071a);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            j();
            boolean zRemove = this.f50072c.remove(obj);
            if (zRemove) {
                AbstractC2723d.n(AbstractC2723d.this);
                l();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.f50072c.removeAll(collection);
            if (zRemoveAll) {
                AbstractC2723d.o(AbstractC2723d.this, this.f50072c.size() - size);
                l();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            r5.m.k(collection);
            int size = size();
            boolean zRetainAll = this.f50072c.retainAll(collection);
            if (zRetainAll) {
                AbstractC2723d.o(AbstractC2723d.this, this.f50072c.size() - size);
                l();
            }
            return zRetainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            j();
            return this.f50072c.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            j();
            return this.f50072c.toString();
        }
    }

    /* JADX INFO: renamed from: s5.d$l */
    public class l extends k implements List {

        /* JADX INFO: renamed from: s5.d$l$a */
        public class a extends k.a implements ListIterator {
            public a() {
                super();
            }

            public a(int i9) {
                super(l.this.n().listIterator(i9));
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                boolean zIsEmpty = l.this.isEmpty();
                d().add(obj);
                AbstractC2723d.m(AbstractC2723d.this);
                if (zIsEmpty) {
                    l.this.d();
                }
            }

            public final ListIterator d() {
                return (ListIterator) b();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return d().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return d().nextIndex();
            }

            @Override // java.util.ListIterator
            public Object previous() {
                return d().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return d().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                d().set(obj);
            }
        }

        public l(Object obj, List list, k kVar) {
            super(obj, list, kVar);
        }

        @Override // java.util.List
        public void add(int i9, Object obj) {
            j();
            boolean zIsEmpty = g().isEmpty();
            n().add(i9, obj);
            AbstractC2723d.m(AbstractC2723d.this);
            if (zIsEmpty) {
                d();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i9, Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = n().addAll(i9, collection);
            if (zAddAll) {
                AbstractC2723d.o(AbstractC2723d.this, g().size() - size);
                if (size == 0) {
                    d();
                }
            }
            return zAddAll;
        }

        @Override // java.util.List
        public Object get(int i9) {
            j();
            return n().get(i9);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            j();
            return n().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            j();
            return n().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            j();
            return new a();
        }

        @Override // java.util.List
        public ListIterator listIterator(int i9) {
            j();
            return new a(i9);
        }

        public List n() {
            return (List) g();
        }

        @Override // java.util.List
        public Object remove(int i9) {
            j();
            Object objRemove = n().remove(i9);
            AbstractC2723d.n(AbstractC2723d.this);
            l();
            return objRemove;
        }

        @Override // java.util.List
        public Object set(int i9, Object obj) {
            j();
            return n().set(i9, obj);
        }

        @Override // java.util.List
        public List subList(int i9, int i10) {
            j();
            return AbstractC2723d.this.z(i(), n().subList(i9, i10), f() == null ? this : f());
        }
    }

    public AbstractC2723d(Map map) {
        r5.m.d(map.isEmpty());
        this.f50049f = map;
    }

    public static /* synthetic */ int m(AbstractC2723d abstractC2723d) {
        int i9 = abstractC2723d.f50050g;
        abstractC2723d.f50050g = i9 + 1;
        return i9;
    }

    public static /* synthetic */ int n(AbstractC2723d abstractC2723d) {
        int i9 = abstractC2723d.f50050g;
        abstractC2723d.f50050g = i9 - 1;
        return i9;
    }

    public static /* synthetic */ int o(AbstractC2723d abstractC2723d, int i9) {
        int i10 = abstractC2723d.f50050g + i9;
        abstractC2723d.f50050g = i10;
        return i10;
    }

    public static /* synthetic */ int p(AbstractC2723d abstractC2723d, int i9) {
        int i10 = abstractC2723d.f50050g - i9;
        abstractC2723d.f50050g = i10;
        return i10;
    }

    public static Iterator v(Collection collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    @Override // s5.AbstractC2725f, s5.J
    public Collection a() {
        return super.a();
    }

    @Override // s5.J
    public void clear() {
        Iterator it = this.f50049f.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f50049f.clear();
        this.f50050g = 0;
    }

    @Override // s5.AbstractC2725f
    public Map e() {
        return new c(this.f50049f);
    }

    @Override // s5.AbstractC2725f
    public Collection f() {
        return new AbstractC2725f.a();
    }

    @Override // s5.AbstractC2725f
    public Set g() {
        return new e(this.f50049f);
    }

    @Override // s5.J
    public Collection get(Object obj) {
        Collection collectionS = (Collection) this.f50049f.get(obj);
        if (collectionS == null) {
            collectionS = s(obj);
        }
        return y(obj, collectionS);
    }

    @Override // s5.AbstractC2725f
    public Collection h() {
        return new AbstractC2725f.b();
    }

    @Override // s5.AbstractC2725f
    public Iterator i() {
        return new b(this);
    }

    @Override // s5.AbstractC2725f
    public Iterator j() {
        return new a(this);
    }

    @Override // s5.J
    public boolean put(Object obj, Object obj2) {
        Collection collection = (Collection) this.f50049f.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f50050g++;
            return true;
        }
        Collection collectionS = s(obj);
        if (!collectionS.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f50050g++;
        this.f50049f.put(obj, collectionS);
        return true;
    }

    public abstract Collection r();

    public Collection s(Object obj) {
        return r();
    }

    @Override // s5.J
    public int size() {
        return this.f50050g;
    }

    public final Map t() {
        Map map = this.f50049f;
        return map instanceof NavigableMap ? new f((NavigableMap) this.f50049f) : map instanceof SortedMap ? new i((SortedMap) this.f50049f) : new c(this.f50049f);
    }

    public final Set u() {
        Map map = this.f50049f;
        return map instanceof NavigableMap ? new g((NavigableMap) this.f50049f) : map instanceof SortedMap ? new j((SortedMap) this.f50049f) : new e(this.f50049f);
    }

    @Override // s5.AbstractC2725f, s5.J
    public Collection values() {
        return super.values();
    }

    public final void w(Object obj) {
        Collection collection = (Collection) I.k(this.f50049f, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f50050g -= size;
        }
    }

    public abstract Collection x(Collection collection);

    public abstract Collection y(Object obj, Collection collection);

    public final List z(Object obj, List list, k kVar) {
        return list instanceof RandomAccess ? new h(this, obj, list, kVar) : new l(obj, list, kVar);
    }
}
