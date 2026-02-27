package s5;

import com.google.android.gms.common.api.a;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: s5.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2741w extends AbstractCollection implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object[] f50154a = new Object[0];

    /* JADX INFO: renamed from: s5.w$a */
    public static abstract class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object[] f50155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f50156b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f50157c;

        public a(int i9) {
            AbstractC2731l.b(i9, "initialCapacity");
            this.f50155a = new Object[i9];
            this.f50156b = 0;
        }

        @Override // s5.AbstractC2741w.b
        public b b(Iterable iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                g(this.f50156b + collection.size());
                if (collection instanceof AbstractC2741w) {
                    this.f50156b = ((AbstractC2741w) collection).e(this.f50155a, this.f50156b);
                    return this;
                }
            }
            super.b(iterable);
            return this;
        }

        public a d(Object obj) {
            r5.m.k(obj);
            g(this.f50156b + 1);
            Object[] objArr = this.f50155a;
            int i9 = this.f50156b;
            this.f50156b = i9 + 1;
            objArr[i9] = obj;
            return this;
        }

        public b e(Object... objArr) {
            f(objArr, objArr.length);
            return this;
        }

        public final void f(Object[] objArr, int i9) {
            P.c(objArr, i9);
            g(this.f50156b + i9);
            System.arraycopy(objArr, 0, this.f50155a, this.f50156b, i9);
            this.f50156b += i9;
        }

        public final void g(int i9) {
            Object[] objArr = this.f50155a;
            if (objArr.length < i9) {
                this.f50155a = Arrays.copyOf(objArr, b.c(objArr.length, i9));
            } else if (!this.f50157c) {
                return;
            } else {
                this.f50155a = (Object[]) objArr.clone();
            }
            this.f50157c = false;
        }
    }

    /* JADX INFO: renamed from: s5.w$b */
    public static abstract class b {
        public static int c(int i9, int i10) {
            if (i10 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = i9 + (i9 >> 1) + 1;
            if (iHighestOneBit < i10) {
                iHighestOneBit = Integer.highestOneBit(i10 - 1) << 1;
            }
            return iHighestOneBit < 0 ? a.e.API_PRIORITY_OTHER : iHighestOneBit;
        }

        public abstract b a(Object obj);

        public b b(Iterable iterable) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(Object obj);

    public AbstractC2743y d() {
        return isEmpty() ? AbstractC2743y.z() : AbstractC2743y.n(toArray());
    }

    public int e(Object[] objArr, int i9) {
        c0 it = iterator();
        while (it.hasNext()) {
            objArr[i9] = it.next();
            i9++;
        }
        return i9;
    }

    public Object[] f() {
        return null;
    }

    public int g() {
        throw new UnsupportedOperationException();
    }

    public int i() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean j();

    /* JADX INFO: renamed from: l */
    public abstract c0 iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f50154a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        r5.m.k(objArr);
        int size = size();
        if (objArr.length < size) {
            Object[] objArrF = f();
            if (objArrF != null) {
                return S.a(objArrF, i(), g(), objArr);
            }
            objArr = P.d(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        e(objArr, 0);
        return objArr;
    }
}
