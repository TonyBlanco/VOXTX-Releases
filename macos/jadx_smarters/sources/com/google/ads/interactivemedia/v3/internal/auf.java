package com.google.ads.interactivemedia.v3.internal;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class auf implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator f20747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Collection f20748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ aug f20749c;

    public auf(aug augVar) {
        this.f20749c = augVar;
        Collection collection = augVar.f20751b;
        this.f20748b = collection;
        this.f20747a = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public auf(aug augVar, Iterator it) {
        this.f20749c = augVar;
        this.f20748b = augVar.f20751b;
        this.f20747a = it;
    }

    public final void a() {
        this.f20749c.b();
        if (this.f20749c.f20751b != this.f20748b) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.f20747a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        return this.f20747a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f20747a.remove();
        auj.r(this.f20749c.f20754e);
        this.f20749c.c();
    }
}
