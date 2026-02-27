package androidx.datastore.preferences.protobuf;

import d.AbstractC1617D;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class h0 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14664a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f14665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map f14666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile g f14668f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map f14669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile c f14670h;

    public static class a extends h0 {
        public a(int i9) {
            super(i9, null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            AbstractC1617D.a(obj);
            return super.t(null, obj2);
        }

        @Override // androidx.datastore.preferences.protobuf.h0
        public void r() {
            if (!q()) {
                if (m() > 0) {
                    AbstractC1617D.a(k(0).getKey());
                    throw null;
                }
                Iterator it = o().iterator();
                if (it.hasNext()) {
                    AbstractC1617D.a(((Map.Entry) it.next()).getKey());
                    throw null;
                }
            }
            super.r();
        }
    }

    public class b implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f14671a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Iterator f14672c;

        public b() {
            this.f14671a = h0.this.f14665c.size();
        }

        public /* synthetic */ b(h0 h0Var, a aVar) {
            this();
        }

        public final Iterator b() {
            if (this.f14672c == null) {
                this.f14672c = h0.this.f14669g.entrySet().iterator();
            }
            return this.f14672c;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            Object next;
            if (b().hasNext()) {
                next = b().next();
            } else {
                List list = h0.this.f14665c;
                int i9 = this.f14671a - 1;
                this.f14671a = i9;
                next = list.get(i9);
            }
            return (Map.Entry) next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i9 = this.f14671a;
            return (i9 > 0 && i9 <= h0.this.f14665c.size()) || b().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public class c extends g {
        public c() {
            super(h0.this, null);
        }

        public /* synthetic */ c(h0 h0Var, a aVar) {
            this();
        }

        @Override // androidx.datastore.preferences.protobuf.h0.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new b(h0.this, null);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Iterator f14675a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Iterable f14676b = new b();

        public static class a implements Iterator {
            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        public static class b implements Iterable {
            @Override // java.lang.Iterable
            public Iterator iterator() {
                return d.f14675a;
            }
        }

        public static Iterable b() {
            return f14676b;
        }
    }

    public class e implements Map.Entry, Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Comparable f14677a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f14678c;

        public e(Comparable comparable, Object obj) {
            this.f14677a = comparable;
            this.f14678c = obj;
        }

        public e(h0 h0Var, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        public final boolean b(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return b(this.f14677a, entry.getKey()) && b(this.f14678c, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f14678c;
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.f14677a;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f14677a;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f14678c;
            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            h0.this.h();
            Object obj2 = this.f14678c;
            this.f14678c = obj;
            return obj2;
        }

        public String toString() {
            return this.f14677a + "=" + this.f14678c;
        }
    }

    public class f implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f14680a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f14681c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Iterator f14682d;

        public f() {
            this.f14680a = -1;
        }

        public /* synthetic */ f(h0 h0Var, a aVar) {
            this();
        }

        public final Iterator b() {
            if (this.f14682d == null) {
                this.f14682d = h0.this.f14666d.entrySet().iterator();
            }
            return this.f14682d;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f14681c = true;
            int i9 = this.f14680a + 1;
            this.f14680a = i9;
            return (Map.Entry) (i9 < h0.this.f14665c.size() ? h0.this.f14665c.get(this.f14680a) : b().next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f14680a + 1 >= h0.this.f14665c.size()) {
                return !h0.this.f14666d.isEmpty() && b().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f14681c) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f14681c = false;
            h0.this.h();
            if (this.f14680a >= h0.this.f14665c.size()) {
                b().remove();
                return;
            }
            h0 h0Var = h0.this;
            int i9 = this.f14680a;
            this.f14680a = i9 - 1;
            h0Var.u(i9);
        }
    }

    public class g extends AbstractSet {
        public g() {
        }

        public /* synthetic */ g(h0 h0Var, a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            h0.this.t((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            h0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = h0.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new f(h0.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            h0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return h0.this.size();
        }
    }

    public h0(int i9) {
        this.f14664a = i9;
        this.f14665c = Collections.emptyList();
        this.f14666d = Collections.emptyMap();
        this.f14669g = Collections.emptyMap();
    }

    public /* synthetic */ h0(int i9, a aVar) {
        this(i9);
    }

    public static h0 s(int i9) {
        return new a(i9);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        h();
        if (!this.f14665c.isEmpty()) {
            this.f14665c.clear();
        }
        if (this.f14666d.isEmpty()) {
            return;
        }
        this.f14666d.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return g(comparable) >= 0 || this.f14666d.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f14668f == null) {
            this.f14668f = new g(this, null);
        }
        return this.f14668f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return super.equals(obj);
        }
        h0 h0Var = (h0) obj;
        int size = size();
        if (size != h0Var.size()) {
            return false;
        }
        int iM = m();
        if (iM != h0Var.m()) {
            return entrySet().equals(h0Var.entrySet());
        }
        for (int i9 = 0; i9 < iM; i9++) {
            if (!k(i9).equals(h0Var.k(i9))) {
                return false;
            }
        }
        if (iM != size) {
            return this.f14666d.equals(h0Var.f14666d);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f14665c
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L23
            java.util.List r2 = r4.f14665c
            java.lang.Object r2 = r2.get(r1)
            androidx.datastore.preferences.protobuf.h0$e r2 = (androidx.datastore.preferences.protobuf.h0.e) r2
            java.lang.Comparable r2 = r2.getKey()
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L20
            int r0 = r0 + 1
        L1e:
            int r5 = -r0
            return r5
        L20:
            if (r2 != 0) goto L23
            return r1
        L23:
            r0 = 0
        L24:
            if (r0 > r1) goto L47
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List r3 = r4.f14665c
            java.lang.Object r3 = r3.get(r2)
            androidx.datastore.preferences.protobuf.h0$e r3 = (androidx.datastore.preferences.protobuf.h0.e) r3
            java.lang.Comparable r3 = r3.getKey()
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L40
            int r2 = r2 + (-1)
            r1 = r2
            goto L24
        L40:
            if (r3 <= 0) goto L46
            int r2 = r2 + 1
            r0 = r2
            goto L24
        L46:
            return r2
        L47:
            int r0 = r0 + 1
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.h0.g(java.lang.Comparable):int");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iG = g(comparable);
        return iG >= 0 ? ((e) this.f14665c.get(iG)).getValue() : this.f14666d.get(comparable);
    }

    public final void h() {
        if (this.f14667e) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iM = m();
        int iHashCode = 0;
        for (int i9 = 0; i9 < iM; i9++) {
            iHashCode += ((e) this.f14665c.get(i9)).hashCode();
        }
        return n() > 0 ? iHashCode + this.f14666d.hashCode() : iHashCode;
    }

    public Set i() {
        if (this.f14670h == null) {
            this.f14670h = new c(this, null);
        }
        return this.f14670h;
    }

    public final void j() {
        h();
        if (!this.f14665c.isEmpty() || (this.f14665c instanceof ArrayList)) {
            return;
        }
        this.f14665c = new ArrayList(this.f14664a);
    }

    public Map.Entry k(int i9) {
        return (Map.Entry) this.f14665c.get(i9);
    }

    public int m() {
        return this.f14665c.size();
    }

    public int n() {
        return this.f14666d.size();
    }

    public Iterable o() {
        return this.f14666d.isEmpty() ? d.b() : this.f14666d.entrySet();
    }

    public final SortedMap p() {
        h();
        if (this.f14666d.isEmpty() && !(this.f14666d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f14666d = treeMap;
            this.f14669g = treeMap.descendingMap();
        }
        return (SortedMap) this.f14666d;
    }

    public boolean q() {
        return this.f14667e;
    }

    public void r() {
        if (this.f14667e) {
            return;
        }
        this.f14666d = this.f14666d.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f14666d);
        this.f14669g = this.f14669g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f14669g);
        this.f14667e = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int iG = g(comparable);
        if (iG >= 0) {
            return u(iG);
        }
        if (this.f14666d.isEmpty()) {
            return null;
        }
        return this.f14666d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f14665c.size() + this.f14666d.size();
    }

    public Object t(Comparable comparable, Object obj) {
        h();
        int iG = g(comparable);
        if (iG >= 0) {
            return ((e) this.f14665c.get(iG)).setValue(obj);
        }
        j();
        int i9 = -(iG + 1);
        if (i9 >= this.f14664a) {
            return p().put(comparable, obj);
        }
        int size = this.f14665c.size();
        int i10 = this.f14664a;
        if (size == i10) {
            e eVar = (e) this.f14665c.remove(i10 - 1);
            p().put(eVar.getKey(), eVar.getValue());
        }
        this.f14665c.add(i9, new e(comparable, obj));
        return null;
    }

    public final Object u(int i9) {
        h();
        Object value = ((e) this.f14665c.remove(i9)).getValue();
        if (!this.f14666d.isEmpty()) {
            Iterator it = p().entrySet().iterator();
            this.f14665c.add(new e(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }
}
