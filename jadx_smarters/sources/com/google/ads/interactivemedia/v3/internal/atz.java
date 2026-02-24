package com.google.ads.interactivemedia.v3.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class atz extends awn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ auj f20737a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atz(auj aujVar, Map map) {
        super(map);
        this.f20737a = aujVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awn, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        axo.x(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f20851d.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f20851d.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f20851d.keySet().hashCode();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awn, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new aty(this, this.f20851d.entrySet().iterator());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awn, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f20851d.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        auj.t(this.f20737a, size);
        return size > 0;
    }
}
