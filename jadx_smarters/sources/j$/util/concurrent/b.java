package j$.util.concurrent;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
abstract class b implements Collection, Serializable {
    private static final long serialVersionUID = 7249069246763182397L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ConcurrentHashMap f42299a;

    b(ConcurrentHashMap concurrentHashMap) {
        this.f42299a = concurrentHashMap;
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f42299a.clear();
    }

    @Override // java.util.Collection
    public abstract boolean contains(Object obj);

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        if (collection == this) {
            return true;
        }
        for (Object obj : collection) {
            if (obj == null || !contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f42299a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public abstract Iterator iterator();

    @Override // java.util.Collection
    public abstract boolean remove(Object obj);

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        collection.getClass();
        l[] lVarArr = this.f42299a.f42284a;
        boolean zRemove = false;
        if (lVarArr == null) {
            return false;
        }
        if (!(collection instanceof Set) || collection.size() <= lVarArr.length) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                zRemove |= remove(it.next());
            }
        } else {
            Iterator it2 = iterator();
            while (it2.hasNext()) {
                if (collection.contains(it2.next())) {
                    it2.remove();
                    zRemove = true;
                }
            }
        }
        return zRemove;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        Iterator it = iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z9 = true;
            }
        }
        return z9;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f42299a.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        long j9 = this.f42299a.j();
        if (j9 < 0) {
            j9 = 0;
        }
        if (j9 > 2147483639) {
            throw new OutOfMemoryError("Required array size too large");
        }
        int i9 = (int) j9;
        Object[] objArrCopyOf = new Object[i9];
        int i10 = 0;
        for (Object obj : this) {
            if (i10 == i9) {
                if (i9 >= 2147483639) {
                    throw new OutOfMemoryError("Required array size too large");
                }
                int i11 = i9 < 1073741819 ? (i9 >>> 1) + 1 + i9 : 2147483639;
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i11);
                i9 = i11;
            }
            objArrCopyOf[i10] = obj;
            i10++;
        }
        return i10 == i9 ? objArrCopyOf : Arrays.copyOf(objArrCopyOf, i10);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        long j9 = this.f42299a.j();
        if (j9 < 0) {
            j9 = 0;
        }
        if (j9 > 2147483639) {
            throw new OutOfMemoryError("Required array size too large");
        }
        int i9 = (int) j9;
        Object[] objArrCopyOf = objArr.length >= i9 ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i9);
        int length = objArrCopyOf.length;
        int i10 = 0;
        for (Object obj : this) {
            if (i10 == length) {
                if (length >= 2147483639) {
                    throw new OutOfMemoryError("Required array size too large");
                }
                int i11 = length < 1073741819 ? (length >>> 1) + 1 + length : 2147483639;
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i11);
                length = i11;
            }
            objArrCopyOf[i10] = obj;
            i10++;
        }
        if (objArr != objArrCopyOf || i10 >= length) {
            return i10 == length ? objArrCopyOf : Arrays.copyOf(objArrCopyOf, i10);
        }
        objArrCopyOf[i10] = null;
        return objArrCopyOf;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        if (it.hasNext()) {
            while (true) {
                Object next = it.next();
                if (next == this) {
                    next = "(this Collection)";
                }
                sb.append(next);
                if (!it.hasNext()) {
                    break;
                }
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }
}
