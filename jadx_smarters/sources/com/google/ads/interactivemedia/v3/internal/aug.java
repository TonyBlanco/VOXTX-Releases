package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class aug extends AbstractCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f20750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Collection f20751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final aug f20752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Collection f20753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ auj f20754e;

    public aug(auj aujVar, Object obj, Collection collection, aug augVar) {
        this.f20754e = aujVar;
        this.f20750a = obj;
        this.f20751b = collection;
        this.f20752c = augVar;
        this.f20753d = augVar == null ? null : augVar.f20751b;
    }

    public final void a() {
        aug augVar = this.f20752c;
        if (augVar != null) {
            augVar.a();
        } else {
            this.f20754e.f20757a.put(this.f20750a, this.f20751b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        b();
        boolean zIsEmpty = this.f20751b.isEmpty();
        boolean zAdd = this.f20751b.add(obj);
        if (!zAdd) {
            return zAdd;
        }
        auj.q(this.f20754e);
        if (!zIsEmpty) {
            return zAdd;
        }
        a();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f20751b.addAll(collection);
        if (!zAddAll) {
            return zAddAll;
        }
        auj.s(this.f20754e, this.f20751b.size() - size);
        if (size != 0) {
            return zAddAll;
        }
        a();
        return true;
    }

    public final void b() {
        Collection collection;
        aug augVar = this.f20752c;
        if (augVar != null) {
            augVar.b();
            if (this.f20752c.f20751b != this.f20753d) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f20751b.isEmpty() || (collection = (Collection) this.f20754e.f20757a.get(this.f20750a)) == null) {
                return;
            }
            this.f20751b = collection;
        }
    }

    public final void c() {
        aug augVar = this.f20752c;
        if (augVar != null) {
            augVar.c();
        } else if (this.f20751b.isEmpty()) {
            this.f20754e.f20757a.remove(this.f20750a);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f20751b.clear();
        auj.t(this.f20754e, size);
        c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        b();
        return this.f20751b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        b();
        return this.f20751b.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        b();
        return this.f20751b.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        b();
        return this.f20751b.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        b();
        return new auf(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        b();
        boolean zRemove = this.f20751b.remove(obj);
        if (zRemove) {
            auj.r(this.f20754e);
            c();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f20751b.removeAll(collection);
        if (zRemoveAll) {
            auj.s(this.f20754e, this.f20751b.size() - size);
            c();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        atp.k(collection);
        int size = size();
        boolean zRetainAll = this.f20751b.retainAll(collection);
        if (zRetainAll) {
            auj.s(this.f20754e, this.f20751b.size() - size);
            c();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        b();
        return this.f20751b.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        b();
        return this.f20751b.toString();
    }
}
