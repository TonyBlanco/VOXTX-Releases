package com.google.ads.interactivemedia.v3.internal;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes3.dex */
class aud extends atw implements SortedMap {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    SortedSet f20744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ auj f20745e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aud(auj aujVar, SortedMap sortedMap) {
        super(aujVar, sortedMap);
        this.f20745e = aujVar;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return h().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return h().firstKey();
    }

    public SortedMap h() {
        return (SortedMap) ((atw) this).f20728a;
    }

    public SortedMap headMap(Object obj) {
        return new aud(this.f20745e, h().headMap(obj));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awp
    public SortedSet i() {
        return new aue(this.f20745e, h());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.atw, com.google.ads.interactivemedia.v3.internal.awp, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: j */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f20744d;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetI = i();
        this.f20744d = sortedSetI;
        return sortedSetI;
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return h().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new aud(this.f20745e, h().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new aud(this.f20745e, h().tailMap(obj));
    }
}
