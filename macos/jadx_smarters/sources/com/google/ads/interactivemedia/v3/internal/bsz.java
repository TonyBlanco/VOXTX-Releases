package com.google.ads.interactivemedia.v3.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class bsz implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator f22249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ bta f22250b;

    public bsz(bta btaVar) {
        this.f22250b = btaVar;
        this.f22249a = btaVar.f22251a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22249a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f22249a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
