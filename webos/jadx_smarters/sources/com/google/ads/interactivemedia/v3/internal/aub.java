package com.google.ads.interactivemedia.v3.internal;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes3.dex */
final class aub extends aue implements NavigableSet {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ auj f20743b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aub(auj aujVar, NavigableMap navigableMap) {
        super(aujVar, navigableMap);
        this.f20743b = aujVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aue
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final NavigableMap b() {
        return (NavigableMap) super.b();
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return b().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new aub(this.f20743b, b().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return b().floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z9) {
        return new aub(this.f20743b, b().headMap(obj, z9));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aue, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return b().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return b().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        return axo.w(iterator());
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        return axo.w(descendingIterator());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z9, Object obj2, boolean z10) {
        return new aub(this.f20743b, b().subMap(obj, z9, obj2, z10));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aue, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z9) {
        return new aub(this.f20743b, b().tailMap(obj, z9));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aue, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }
}
