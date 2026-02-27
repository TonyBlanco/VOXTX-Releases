package s5;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import s5.AbstractC2741w;

/* JADX INFO: renamed from: s5.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2743y extends AbstractC2741w implements List, RandomAccess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d0 f50160c = new b(T.f50012f, 0);

    /* JADX INFO: renamed from: s5.y$a */
    public static final class a extends AbstractC2741w.a {
        public a() {
            this(4);
        }

        public a(int i9) {
            super(i9);
        }

        @Override // s5.AbstractC2741w.b
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public a a(Object obj) {
            super.d(obj);
            return this;
        }

        public a i(Object... objArr) {
            super.e(objArr);
            return this;
        }

        public a j(Iterable iterable) {
            super.b(iterable);
            return this;
        }

        public AbstractC2743y k() {
            this.f50157c = true;
            return AbstractC2743y.o(this.f50155a, this.f50156b);
        }
    }

    /* JADX INFO: renamed from: s5.y$b */
    public static class b extends AbstractC2720a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AbstractC2743y f50161d;

        public b(AbstractC2743y abstractC2743y, int i9) {
            super(abstractC2743y.size(), i9);
            this.f50161d = abstractC2743y;
        }

        @Override // s5.AbstractC2720a
        public Object a(int i9) {
            return this.f50161d.get(i9);
        }
    }

    /* JADX INFO: renamed from: s5.y$c */
    public class c extends AbstractC2743y {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final transient int f50162d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final transient int f50163e;

        public c(int i9, int i10) {
            this.f50162d = i9;
            this.f50163e = i10;
        }

        @Override // s5.AbstractC2743y, java.util.List
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public AbstractC2743y subList(int i9, int i10) {
            r5.m.o(i9, i10, this.f50163e);
            AbstractC2743y abstractC2743y = AbstractC2743y.this;
            int i11 = this.f50162d;
            return abstractC2743y.subList(i9 + i11, i10 + i11);
        }

        @Override // s5.AbstractC2741w
        public Object[] f() {
            return AbstractC2743y.this.f();
        }

        @Override // s5.AbstractC2741w
        public int g() {
            return AbstractC2743y.this.i() + this.f50162d + this.f50163e;
        }

        @Override // java.util.List
        public Object get(int i9) {
            r5.m.i(i9, this.f50163e);
            return AbstractC2743y.this.get(i9 + this.f50162d);
        }

        @Override // s5.AbstractC2741w
        public int i() {
            return AbstractC2743y.this.i() + this.f50162d;
        }

        @Override // s5.AbstractC2743y, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // s5.AbstractC2741w
        public boolean j() {
            return true;
        }

        @Override // s5.AbstractC2743y, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // s5.AbstractC2743y, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i9) {
            return super.listIterator(i9);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f50163e;
        }
    }

    public static AbstractC2743y A(Object obj) {
        return q(obj);
    }

    public static AbstractC2743y B(Object obj, Object obj2) {
        return q(obj, obj2);
    }

    public static AbstractC2743y D(Object obj, Object obj2, Object obj3) {
        return q(obj, obj2, obj3);
    }

    public static AbstractC2743y E(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return q(obj, obj2, obj3, obj4, obj5);
    }

    public static AbstractC2743y F(Comparator comparator, Iterable iterable) {
        r5.m.k(comparator);
        Object[] objArrJ = D.j(iterable);
        P.b(objArrJ);
        Arrays.sort(objArrJ, comparator);
        return n(objArrJ);
    }

    public static AbstractC2743y n(Object[] objArr) {
        return o(objArr, objArr.length);
    }

    public static AbstractC2743y o(Object[] objArr, int i9) {
        return i9 == 0 ? z() : new T(objArr, i9);
    }

    public static a p() {
        return new a();
    }

    public static AbstractC2743y q(Object... objArr) {
        return n(P.b(objArr));
    }

    public static AbstractC2743y r(Collection collection) {
        if (!(collection instanceof AbstractC2741w)) {
            return q(collection.toArray());
        }
        AbstractC2743y abstractC2743yD = ((AbstractC2741w) collection).d();
        return abstractC2743yD.j() ? n(abstractC2743yD.toArray()) : abstractC2743yD;
    }

    public static AbstractC2743y s(Object[] objArr) {
        return objArr.length == 0 ? z() : q((Object[]) objArr.clone());
    }

    public static AbstractC2743y z() {
        return T.f50012f;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: H */
    public AbstractC2743y subList(int i9, int i10) {
        r5.m.o(i9, i10, size());
        int i11 = i10 - i9;
        return i11 == size() ? this : i11 == 0 ? z() : I(i9, i10);
    }

    public AbstractC2743y I(int i9, int i10) {
        return new c(i9, i10 - i9);
    }

    @Override // java.util.List
    public final void add(int i9, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i9, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // s5.AbstractC2741w, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // s5.AbstractC2741w
    public final AbstractC2743y d() {
        return this;
    }

    @Override // s5.AbstractC2741w
    public int e(Object[] objArr, int i9) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i9 + i10] = get(i10);
        }
        return i9 + size;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return G.c(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i9 = 1;
        for (int i10 = 0; i10 < size; i10++) {
            i9 = ~(~((i9 * 31) + get(i10).hashCode()));
        }
        return i9;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return G.d(this, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public c0 iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return G.f(this, obj);
    }

    @Override // java.util.List
    public final Object remove(int i9) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i9, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public d0 listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public d0 listIterator(int i9) {
        r5.m.m(i9, size());
        return isEmpty() ? f50160c : new b(this, i9);
    }
}
