package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class aup extends AbstractCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Collection f20765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final atm f20766b;

    public aup(Collection collection, atm atmVar) {
        this.f20765a = collection;
        this.f20766b = atmVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        atp.e(this.f20766b.a(obj));
        return this.f20765a.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            atp.e(this.f20766b.a(it.next()));
        }
        return this.f20765a.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        axo.D(this.f20765a, this.f20766b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (axo.H(this.f20765a, obj)) {
            return this.f20766b.a(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        Collection collection = this.f20765a;
        atm atmVar = this.f20766b;
        Iterator it = collection.iterator();
        atp.l(atmVar, "predicate");
        int i9 = 0;
        while (it.hasNext()) {
            if (atmVar.a(it.next())) {
                return i9 == -1;
            }
            i9++;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.f20765a.iterator();
        atm atmVar = this.f20766b;
        atp.k(it);
        atp.k(atmVar);
        return new ats(it, atmVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return contains(obj) && this.f20765a.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f20765a.iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f20766b.a(next) && collection.contains(next)) {
                it.remove();
                z9 = true;
            }
        }
        return z9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f20765a.iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f20766b.a(next) && !collection.contains(next)) {
                it.remove();
                z9 = true;
            }
        }
        return z9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator it = this.f20765a.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            if (this.f20766b.a(it.next())) {
                i9++;
            }
        }
        return i9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return axo.t(iterator()).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return axo.t(iterator()).toArray(objArr);
    }
}
