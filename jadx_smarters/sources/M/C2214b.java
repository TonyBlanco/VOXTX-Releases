package m;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: m.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2214b implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f44264a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f44265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WeakHashMap f44266d = new WeakHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f44267e = 0;

    /* JADX INFO: renamed from: m.b$a */
    public static class a extends e {
        public a(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // m.C2214b.e
        public c b(c cVar) {
            return cVar.f44271e;
        }

        @Override // m.C2214b.e
        public c c(c cVar) {
            return cVar.f44270d;
        }
    }

    /* JADX INFO: renamed from: m.b$b, reason: collision with other inner class name */
    public static class C0378b extends e {
        public C0378b(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // m.C2214b.e
        public c b(c cVar) {
            return cVar.f44270d;
        }

        @Override // m.C2214b.e
        public c c(c cVar) {
            return cVar.f44271e;
        }
    }

    /* JADX INFO: renamed from: m.b$c */
    public static class c implements Map.Entry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f44268a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f44269c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c f44270d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c f44271e;

        public c(Object obj, Object obj2) {
            this.f44268a = obj;
            this.f44269c = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f44268a.equals(cVar.f44268a) && this.f44269c.equals(cVar.f44269c);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f44268a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f44269c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f44268a.hashCode() ^ this.f44269c.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f44268a + "=" + this.f44269c;
        }
    }

    /* JADX INFO: renamed from: m.b$d */
    public class d implements Iterator, f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f44272a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f44273c = true;

        public d() {
        }

        @Override // m.C2214b.f
        public void a(c cVar) {
            c cVar2 = this.f44272a;
            if (cVar == cVar2) {
                c cVar3 = cVar2.f44271e;
                this.f44272a = cVar3;
                this.f44273c = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            c cVar;
            if (this.f44273c) {
                this.f44273c = false;
                cVar = C2214b.this.f44264a;
            } else {
                c cVar2 = this.f44272a;
                cVar = cVar2 != null ? cVar2.f44270d : null;
            }
            this.f44272a = cVar;
            return this.f44272a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f44273c) {
                return C2214b.this.f44264a != null;
            }
            c cVar = this.f44272a;
            return (cVar == null || cVar.f44270d == null) ? false : true;
        }
    }

    /* JADX INFO: renamed from: m.b$e */
    public static abstract class e implements Iterator, f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f44275a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c f44276c;

        public e(c cVar, c cVar2) {
            this.f44275a = cVar2;
            this.f44276c = cVar;
        }

        @Override // m.C2214b.f
        public void a(c cVar) {
            if (this.f44275a == cVar && cVar == this.f44276c) {
                this.f44276c = null;
                this.f44275a = null;
            }
            c cVar2 = this.f44275a;
            if (cVar2 == cVar) {
                this.f44275a = b(cVar2);
            }
            if (this.f44276c == cVar) {
                this.f44276c = e();
            }
        }

        public abstract c b(c cVar);

        public abstract c c(c cVar);

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            c cVar = this.f44276c;
            this.f44276c = e();
            return cVar;
        }

        public final c e() {
            c cVar = this.f44276c;
            c cVar2 = this.f44275a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f44276c != null;
        }
    }

    /* JADX INFO: renamed from: m.b$f */
    public interface f {
        void a(c cVar);
    }

    public Map.Entry d() {
        return this.f44264a;
    }

    public Iterator descendingIterator() {
        C0378b c0378b = new C0378b(this.f44265c, this.f44264a);
        this.f44266d.put(c0378b, Boolean.FALSE);
        return c0378b;
    }

    public c e(Object obj) {
        c cVar = this.f44264a;
        while (cVar != null && !cVar.f44268a.equals(obj)) {
            cVar = cVar.f44270d;
        }
        return cVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2214b)) {
            return false;
        }
        C2214b c2214b = (C2214b) obj;
        if (size() != c2214b.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c2214b.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public d f() {
        d dVar = new d();
        this.f44266d.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry g() {
        return this.f44265c;
    }

    public c h(Object obj, Object obj2) {
        c cVar = new c(obj, obj2);
        this.f44267e++;
        c cVar2 = this.f44265c;
        if (cVar2 == null) {
            this.f44264a = cVar;
        } else {
            cVar2.f44270d = cVar;
            cVar.f44271e = cVar2;
        }
        this.f44265c = cVar;
        return cVar;
    }

    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((Map.Entry) it.next()).hashCode();
        }
        return iHashCode;
    }

    public Object i(Object obj, Object obj2) {
        c cVarE = e(obj);
        if (cVarE != null) {
            return cVarE.f44269c;
        }
        h(obj, obj2);
        return null;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        a aVar = new a(this.f44264a, this.f44265c);
        this.f44266d.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public Object j(Object obj) {
        c cVarE = e(obj);
        if (cVarE == null) {
            return null;
        }
        this.f44267e--;
        if (!this.f44266d.isEmpty()) {
            Iterator it = this.f44266d.keySet().iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(cVarE);
            }
        }
        c cVar = cVarE.f44271e;
        c cVar2 = cVarE.f44270d;
        if (cVar != null) {
            cVar.f44270d = cVar2;
        } else {
            this.f44264a = cVar2;
        }
        c cVar3 = cVarE.f44270d;
        if (cVar3 != null) {
            cVar3.f44271e = cVar;
        } else {
            this.f44265c = cVar;
        }
        cVarE.f44270d = null;
        cVarE.f44271e = null;
        return cVarE.f44269c;
    }

    public int size() {
        return this.f44267e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
