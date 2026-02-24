package com.google.ads.interactivemedia.v3.internal;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class bra implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterator f22147a;

    public bra(Iterator it) {
        this.f22147a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22147a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f22147a.next();
        return entry.getValue() instanceof brb ? new bqz(entry) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f22147a.remove();
    }
}
