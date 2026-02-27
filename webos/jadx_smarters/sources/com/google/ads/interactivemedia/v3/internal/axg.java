package com.google.ads.interactivemedia.v3.internal;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class axg extends awf {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final axg f20884c = new axg(avo.o(), awx.f20860a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient avo f20885d;

    public axg(avo avoVar, Comparator comparator) {
        super(comparator);
        this.f20885d = avoVar;
    }

    public final axg A(int i9, int i10) {
        if (i9 == 0) {
            if (i10 == size()) {
                return this;
            }
            i9 = 0;
        }
        return i9 < i10 ? new axg(this.f20885d.subList(i9, i10), ((awf) this).f20845a) : awf.w(((awf) this).f20845a);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avi
    public final int a(Object[] objArr, int i9) {
        return this.f20885d.a(objArr, i9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avi
    public final int b() {
        return this.f20885d.b();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avi
    public final int c() {
        return this.f20885d.c();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awf, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iZ = z(obj, true);
        if (iZ == size()) {
            return null;
        }
        return this.f20885d.get(iZ);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f20885d, obj, ((awf) this).f20845a) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof aww) {
            collection = ((aww) collection).a();
        }
        if (!axo.a(((awf) this).f20845a, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        axq axqVarListIterator = listIterator();
        Iterator it = collection.iterator();
        if (!axqVarListIterator.hasNext()) {
            return false;
        }
        Object next = it.next();
        Object next2 = axqVarListIterator.next();
        while (true) {
            try {
                int iJ = j(next2, next);
                if (iJ >= 0) {
                    if (iJ != 0) {
                        break;
                    }
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                } else {
                    if (!axqVarListIterator.hasNext()) {
                        return false;
                    }
                    next2 = axqVarListIterator.next();
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avx, com.google.ads.interactivemedia.v3.internal.avi
    public final avo d() {
        return this.f20885d;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awf, com.google.ads.interactivemedia.v3.internal.avx, com.google.ads.interactivemedia.v3.internal.avi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: e */
    public final axq listIterator() {
        return this.f20885d.iterator();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avx, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!axo.a(((awf) this).f20845a, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            axq axqVarListIterator = listIterator();
            while (axqVarListIterator.hasNext()) {
                Object next = axqVarListIterator.next();
                Object next2 = it.next();
                if (next2 == null || j(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avi
    public final boolean f() {
        return this.f20885d.f();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awf, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f20885d.get(0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awf, java.util.NavigableSet
    public final Object floor(Object obj) {
        int iY = y(obj, true) - 1;
        if (iY == -1) {
            return null;
        }
        return this.f20885d.get(iY);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avi
    public final Object[] g() {
        return this.f20885d.g();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awf, java.util.NavigableSet
    public final Object higher(Object obj) {
        int iZ = z(obj, false);
        if (iZ == size()) {
            return null;
        }
        return this.f20885d.get(iZ);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awf, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f20885d.get(size() - 1);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awf, java.util.NavigableSet
    public final Object lower(Object obj) {
        int iY = y(obj, false) - 1;
        if (iY == -1) {
            return null;
        }
        return this.f20885d.get(iY);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awf
    public final awf o() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(((awf) this).f20845a);
        return isEmpty() ? awf.w(comparatorReverseOrder) : new axg(this.f20885d.h(), comparatorReverseOrder);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awf
    public final awf r(Object obj, boolean z9) {
        return A(0, y(obj, z9));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f20885d.size();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awf
    public final awf t(Object obj, boolean z9, Object obj2, boolean z10) {
        return v(obj, z9).r(obj2, z10);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awf
    public final awf v(Object obj, boolean z9) {
        return A(z(obj, z9), size());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awf, java.util.NavigableSet
    /* JADX INFO: renamed from: x */
    public final axq descendingIterator() {
        return this.f20885d.h().iterator();
    }

    public final int y(Object obj, boolean z9) {
        avo avoVar = this.f20885d;
        atp.k(obj);
        int iBinarySearch = Collections.binarySearch(avoVar, obj, ((awf) this).f20845a);
        return iBinarySearch >= 0 ? z9 ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
    }

    public final int z(Object obj, boolean z9) {
        avo avoVar = this.f20885d;
        atp.k(obj);
        int iBinarySearch = Collections.binarySearch(avoVar, obj, ((awf) this).f20845a);
        return iBinarySearch >= 0 ? z9 ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
    }
}
