package s5;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class E {

    public class a extends AbstractC2721b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Iterator f49994d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ r5.n f49995e;

        public a(Iterator it, r5.n nVar) {
            this.f49994d = it;
            this.f49995e = nVar;
        }

        @Override // s5.AbstractC2721b
        public Object b() {
            while (this.f49994d.hasNext()) {
                Object next = this.f49994d.next();
                if (this.f49995e.apply(next)) {
                    return next;
                }
            }
            return c();
        }
    }

    public class b extends c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f49996a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f49997c;

        public b(Object obj) {
            this.f49997c = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f49996a;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f49996a) {
                throw new NoSuchElementException();
            }
            this.f49996a = true;
            return this.f49997c;
        }
    }

    public static final class c extends AbstractC2720a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final d0 f49998f = new c(new Object[0], 0, 0, 0);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object[] f49999d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f50000e;

        public c(Object[] objArr, int i9, int i10, int i11) {
            super(i10, i11);
            this.f49999d = objArr;
            this.f50000e = i9;
        }

        @Override // s5.AbstractC2720a
        public Object a(int i9) {
            return this.f49999d[this.f50000e + i9];
        }
    }

    public enum d implements Iterator {
        INSTANCE;

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
            AbstractC2731l.c(false);
        }
    }

    public static boolean a(Collection collection, Iterator it) {
        r5.m.k(collection);
        r5.m.k(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static boolean b(Iterator it, r5.n nVar) {
        return n(it, nVar) != -1;
    }

    public static void c(Iterator it) {
        r5.m.k(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean d(Iterator it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(Iterator it, Iterator it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !r5.j.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static c0 f() {
        return g();
    }

    public static d0 g() {
        return c.f49998f;
    }

    public static Iterator h() {
        return d.INSTANCE;
    }

    public static c0 i(Iterator it, r5.n nVar) {
        r5.m.k(it);
        r5.m.k(nVar);
        return new a(it, nVar);
    }

    public static Object j(Iterator it, r5.n nVar) {
        r5.m.k(it);
        r5.m.k(nVar);
        while (it.hasNext()) {
            Object next = it.next();
            if (nVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public static Object k(Iterator it) {
        Object next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static Object l(Iterator it, Object obj) {
        return it.hasNext() ? k(it) : obj;
    }

    public static Object m(Iterator it, Object obj) {
        return it.hasNext() ? it.next() : obj;
    }

    public static int n(Iterator it, r5.n nVar) {
        r5.m.l(nVar, "predicate");
        int i9 = 0;
        while (it.hasNext()) {
            if (nVar.apply(it.next())) {
                return i9;
            }
            i9++;
        }
        return -1;
    }

    public static Object o(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    public static boolean p(Iterator it, Collection collection) {
        r5.m.k(collection);
        boolean z9 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z9 = true;
            }
        }
        return z9;
    }

    public static boolean q(Iterator it, r5.n nVar) {
        r5.m.k(nVar);
        boolean z9 = false;
        while (it.hasNext()) {
            if (nVar.apply(it.next())) {
                it.remove();
                z9 = true;
            }
        }
        return z9;
    }

    public static c0 r(Object obj) {
        return new b(obj);
    }
}
