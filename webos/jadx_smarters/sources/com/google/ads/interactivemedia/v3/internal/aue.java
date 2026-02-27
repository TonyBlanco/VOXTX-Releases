package com.google.ads.interactivemedia.v3.internal;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes3.dex */
class aue extends atz implements SortedSet {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ auj f20746c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aue(auj aujVar, SortedMap sortedMap) {
        super(aujVar, sortedMap);
        this.f20746c = aujVar;
    }

    public SortedMap b() {
        return (SortedMap) this.f20851d;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return b().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return b().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new aue(this.f20746c, b().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return b().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new aue(this.f20746c, b().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new aue(this.f20746c, b().tailMap(obj));
    }
}
