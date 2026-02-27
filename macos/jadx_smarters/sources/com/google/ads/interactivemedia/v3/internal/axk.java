package com.google.ads.interactivemedia.v3.internal;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes3.dex */
final class axk extends axj implements SortedSet {
    public axk(SortedSet sortedSet, atm atmVar) {
        super(sortedSet, atmVar);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f20765a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f20765a.iterator();
        atm atmVar = this.f20766b;
        atp.k(it);
        atp.k(atmVar);
        while (it.hasNext()) {
            Object next = it.next();
            if (atmVar.a(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new axk(((SortedSet) this.f20765a).headSet(obj), this.f20766b);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f20765a;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.f20766b.a(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new axk(((SortedSet) this.f20765a).subSet(obj, obj2), this.f20766b);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new axk(((SortedSet) this.f20765a).tailSet(obj), this.f20766b);
    }
}
