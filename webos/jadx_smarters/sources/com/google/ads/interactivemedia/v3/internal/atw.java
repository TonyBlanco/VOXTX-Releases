package com.google.ads.interactivemedia.v3.internal;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
class atw extends awp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final transient Map f20728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ auj f20729b;

    public atw(auj aujVar, Map map) {
        this.f20729b = aujVar;
        this.f20728a = map;
    }

    public final Map.Entry a(Map.Entry entry) {
        Object key = entry.getKey();
        return axo.r(key, this.f20729b.c(key, (Collection) entry.getValue()));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awp
    public final Set b() {
        return new atu(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map = this.f20728a;
        auj aujVar = this.f20729b;
        if (map == aujVar.f20757a) {
            aujVar.o();
        } else {
            axo.x(new atv(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f20728a;
        atp.k(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f20728a.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) axo.o(this.f20728a, obj);
        if (collection == null) {
            return null;
        }
        return this.f20729b.c(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f20728a.hashCode();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awp, java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return this.f20729b.x();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f20728a.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection collectionA = this.f20729b.a();
        collectionA.addAll(collection);
        auj.t(this.f20729b, collection.size());
        collection.clear();
        return collectionA;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f20728a.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f20728a.toString();
    }
}
