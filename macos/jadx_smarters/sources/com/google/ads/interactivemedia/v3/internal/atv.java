package com.google.ads.interactivemedia.v3.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class atv implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator f20725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Collection f20726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ atw f20727c;

    public atv(atw atwVar) {
        this.f20727c = atwVar;
        this.f20725a = atwVar.f20728a.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20725a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f20725a.next();
        this.f20726b = (Collection) entry.getValue();
        return this.f20727c.a(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        atp.i(this.f20726b != null, "no calls to next() since the last call to remove()");
        this.f20725a.remove();
        auj.t(this.f20727c.f20729b, this.f20726b.size());
        this.f20726b.clear();
        this.f20726b = null;
    }
}
