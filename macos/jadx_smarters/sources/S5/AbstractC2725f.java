package s5;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import s5.L;

/* JADX INFO: renamed from: s5.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2725f implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Collection f50081a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient Set f50082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient Collection f50083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient Map f50084e;

    /* JADX INFO: renamed from: s5.f$a */
    public class a extends L.b {
        public a() {
        }

        @Override // s5.L.b
        public J d() {
            return AbstractC2725f.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return AbstractC2725f.this.i();
        }
    }

    /* JADX INFO: renamed from: s5.f$b */
    public class b extends AbstractCollection {
        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            AbstractC2725f.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC2725f.this.d(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return AbstractC2725f.this.j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return AbstractC2725f.this.size();
        }
    }

    @Override // s5.J
    public Collection a() {
        Collection collection = this.f50081a;
        if (collection != null) {
            return collection;
        }
        Collection collectionF = f();
        this.f50081a = collectionF;
        return collectionF;
    }

    @Override // s5.J
    public Map b() {
        Map map = this.f50084e;
        if (map != null) {
            return map;
        }
        Map mapE = e();
        this.f50084e = mapE;
        return mapE;
    }

    @Override // s5.J
    public boolean c(Object obj, Object obj2) {
        Collection collection = (Collection) b().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean d(Object obj) {
        Iterator it = b().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Map e();

    public boolean equals(Object obj) {
        return L.a(this, obj);
    }

    public abstract Collection f();

    public abstract Set g();

    public abstract Collection h();

    public int hashCode() {
        return b().hashCode();
    }

    public abstract Iterator i();

    @Override // s5.J
    public boolean isEmpty() {
        return size() == 0;
    }

    public abstract Iterator j();

    @Override // s5.J
    public Set keySet() {
        Set set = this.f50082c;
        if (set != null) {
            return set;
        }
        Set setG = g();
        this.f50082c = setG;
        return setG;
    }

    @Override // s5.J
    public boolean remove(Object obj, Object obj2) {
        Collection collection = (Collection) b().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public String toString() {
        return b().toString();
    }

    @Override // s5.J
    public Collection values() {
        Collection collection = this.f50083d;
        if (collection != null) {
            return collection;
        }
        Collection collectionH = h();
        this.f50083d = collectionH;
        return collectionH;
    }
}
