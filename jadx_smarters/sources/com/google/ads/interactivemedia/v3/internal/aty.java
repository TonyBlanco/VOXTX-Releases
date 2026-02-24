package com.google.ads.interactivemedia.v3.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class aty implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Map.Entry f20734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Iterator f20735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ atz f20736c;

    public aty(atz atzVar, Iterator it) {
        this.f20736c = atzVar;
        this.f20735b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20735b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f20735b.next();
        this.f20734a = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        atp.i(this.f20734a != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f20734a.getValue();
        this.f20735b.remove();
        auj.t(this.f20736c.f20737a, collection.size());
        collection.clear();
        this.f20734a = null;
    }
}
