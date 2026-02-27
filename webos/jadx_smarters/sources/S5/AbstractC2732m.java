package s5;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: s5.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2732m {

    /* JADX INFO: renamed from: s5.m$a */
    public static class a extends AbstractCollection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Collection f50090a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final r5.n f50091c;

        public a(Collection collection, r5.n nVar) {
            this.f50090a = collection;
            this.f50091c = nVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(Object obj) {
            r5.m.d(this.f50091c.apply(obj));
            return this.f50090a.add(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                r5.m.d(this.f50091c.apply(it.next()));
            }
            return this.f50090a.addAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            D.g(this.f50090a, this.f50091c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (AbstractC2732m.c(this.f50090a, obj)) {
                return this.f50091c.apply(obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection collection) {
            return AbstractC2732m.a(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return !D.a(this.f50090a, this.f50091c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return E.i(this.f50090a.iterator(), this.f50091c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            return contains(obj) && this.f50090a.remove(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            Iterator it = this.f50090a.iterator();
            boolean z9 = false;
            while (it.hasNext()) {
                Object next = it.next();
                if (this.f50091c.apply(next) && collection.contains(next)) {
                    it.remove();
                    z9 = true;
                }
            }
            return z9;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            Iterator it = this.f50090a.iterator();
            boolean z9 = false;
            while (it.hasNext()) {
                Object next = it.next();
                if (this.f50091c.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z9 = true;
                }
            }
            return z9;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            Iterator it = this.f50090a.iterator();
            int i9 = 0;
            while (it.hasNext()) {
                if (this.f50091c.apply(it.next())) {
                    i9++;
                }
            }
            return i9;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return G.j(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return G.j(iterator()).toArray(objArr);
        }
    }

    public static boolean a(Collection collection, Collection collection2) {
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static StringBuilder b(int i9) {
        AbstractC2731l.b(i9, "size");
        return new StringBuilder((int) Math.min(((long) i9) * 8, 1073741824L));
    }

    public static boolean c(Collection collection, Object obj) {
        r5.m.k(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
