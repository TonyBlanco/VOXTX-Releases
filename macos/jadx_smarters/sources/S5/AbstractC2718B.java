package s5;

import j$.util.Objects;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: s5.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2718B extends AbstractC2728i implements Serializable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient AbstractC2717A f49977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f49978g;

    /* JADX INFO: renamed from: s5.B$a */
    public class a extends c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator f49979a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f49980c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Iterator f49981d = E.f();

        public a() {
            this.f49979a = AbstractC2718B.this.f49977f.entrySet().iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (!this.f49981d.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f49979a.next();
                this.f49980c = entry.getKey();
                this.f49981d = ((AbstractC2741w) entry.getValue()).iterator();
            }
            Object obj = this.f49980c;
            Objects.requireNonNull(obj);
            return I.d(obj, this.f49981d.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f49981d.hasNext() || this.f49979a.hasNext();
        }
    }

    /* JADX INFO: renamed from: s5.B$b */
    public class b extends c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Iterator f49983a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Iterator f49984c = E.f();

        public b() {
            this.f49983a = AbstractC2718B.this.f49977f.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f49984c.hasNext() || this.f49983a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f49984c.hasNext()) {
                this.f49984c = ((AbstractC2741w) this.f49983a.next()).iterator();
            }
            return this.f49984c.next();
        }
    }

    /* JADX INFO: renamed from: s5.B$c */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f49986a = S.d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Comparator f49987b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Comparator f49988c;

        public AbstractC2718B a() {
            Collection collectionEntrySet = this.f49986a.entrySet();
            Comparator comparator = this.f49987b;
            if (comparator != null) {
                collectionEntrySet = Q.a(comparator).d().b(collectionEntrySet);
            }
            return C2744z.s(collectionEntrySet, this.f49988c);
        }

        public Collection b() {
            return new ArrayList();
        }

        public c c(Object obj, Object obj2) {
            AbstractC2731l.a(obj, obj2);
            Collection collection = (Collection) this.f49986a.get(obj);
            if (collection == null) {
                Map map = this.f49986a;
                Collection collectionB = b();
                map.put(obj, collectionB);
                collection = collectionB;
            }
            collection.add(obj2);
            return this;
        }
    }

    /* JADX INFO: renamed from: s5.B$d */
    public static class d extends AbstractC2741w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AbstractC2718B f49989c;

        public d(AbstractC2718B abstractC2718B) {
            this.f49989c = abstractC2718B;
        }

        @Override // s5.AbstractC2741w, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f49989c.c(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* JADX INFO: renamed from: l */
        public c0 iterator() {
            return this.f49989c.i();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f49989c.size();
        }
    }

    /* JADX INFO: renamed from: s5.B$e */
    public static final class e extends AbstractC2741w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final transient AbstractC2718B f49990c;

        public e(AbstractC2718B abstractC2718B) {
            this.f49990c = abstractC2718B;
        }

        @Override // s5.AbstractC2741w, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.f49990c.d(obj);
        }

        @Override // s5.AbstractC2741w
        public int e(Object[] objArr, int i9) {
            c0 it = this.f49990c.f49977f.values().iterator();
            while (it.hasNext()) {
                i9 = ((AbstractC2741w) it.next()).e(objArr, i9);
            }
            return i9;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* JADX INFO: renamed from: l */
        public c0 iterator() {
            return this.f49990c.j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f49990c.size();
        }
    }

    public AbstractC2718B(AbstractC2717A abstractC2717A, int i9) {
        this.f49977f = abstractC2717A;
        this.f49978g = i9;
    }

    @Override // s5.AbstractC2725f, s5.J
    public /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        return super.c(obj, obj2);
    }

    @Override // s5.J
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // s5.AbstractC2725f
    public boolean d(Object obj) {
        return obj != null && super.d(obj);
    }

    @Override // s5.AbstractC2725f
    public Map e() {
        throw new AssertionError("should never be called");
    }

    @Override // s5.AbstractC2725f
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // s5.AbstractC2725f
    public Set g() {
        throw new AssertionError("unreachable");
    }

    @Override // s5.AbstractC2725f
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // s5.AbstractC2725f, s5.J
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // s5.AbstractC2725f, s5.J
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public AbstractC2717A b() {
        return this.f49977f;
    }

    @Override // s5.AbstractC2725f
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public AbstractC2741w f() {
        return new d(this);
    }

    @Override // s5.AbstractC2725f
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public AbstractC2741w h() {
        return new e(this);
    }

    @Override // s5.AbstractC2725f, s5.J
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public AbstractC2741w a() {
        return (AbstractC2741w) super.a();
    }

    @Override // s5.AbstractC2725f
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public c0 i() {
        return new a();
    }

    @Override // s5.AbstractC2725f, s5.J
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public AbstractC2719C keySet() {
        return this.f49977f.keySet();
    }

    @Override // s5.J
    public final boolean put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // s5.AbstractC2725f
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public c0 j() {
        return new b();
    }

    @Override // s5.AbstractC2725f, s5.J
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public AbstractC2741w values() {
        return (AbstractC2741w) super.values();
    }

    @Override // s5.AbstractC2725f, s5.J
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // s5.J
    public int size() {
        return this.f49978g;
    }

    @Override // s5.AbstractC2725f
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
