package com.google.ads.interactivemedia.v3.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
abstract class axp implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator f20889a;

    public axp(Iterator it) {
        atp.k(it);
        this.f20889a = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20889a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f20889a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f20889a.remove();
    }
}
