package l8;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2155b;
import kotlin.jvm.internal.AbstractC2159f;

/* JADX INFO: renamed from: l8.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2209d implements Collection, x8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f44256a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f44257c;

    public C2209d(Object[] values, boolean z9) {
        kotlin.jvm.internal.l.e(values, "values");
        this.f44256a = values;
        this.f44257c = z9;
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return h.m(this.f44256a, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        kotlin.jvm.internal.l.e(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int d() {
        return this.f44256a.length;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f44256a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return AbstractC2155b.a(this.f44256a);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return d();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return j.a(this.f44256a, this.f44257c);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        kotlin.jvm.internal.l.e(array, "array");
        return AbstractC2159f.b(this, array);
    }
}
