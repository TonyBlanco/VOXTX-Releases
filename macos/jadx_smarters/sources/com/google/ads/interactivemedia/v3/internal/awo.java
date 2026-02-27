package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class awo extends AbstractCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map f20852a;

    public awo(Map map) {
        this.f20852a = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f20852a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f20852a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f20852a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return axo.q(this.f20852a.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        try {
            return super.remove(obj);
        } catch (UnsupportedOperationException unused) {
            for (Map.Entry entry : this.f20852a.entrySet()) {
                if (com.google.ads.interactivemedia.v3.impl.data.k.c(obj, entry.getValue())) {
                    this.f20852a.remove(entry.getKey());
                    return true;
                }
            }
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        try {
            atp.k(collection);
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSetC = axo.c();
            for (Map.Entry entry : this.f20852a.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    hashSetC.add(entry.getKey());
                }
            }
            return this.f20852a.keySet().removeAll(hashSetC);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        try {
            atp.k(collection);
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSetC = axo.c();
            for (Map.Entry entry : this.f20852a.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    hashSetC.add(entry.getKey());
                }
            }
            return this.f20852a.keySet().retainAll(hashSetC);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f20852a.size();
    }
}
