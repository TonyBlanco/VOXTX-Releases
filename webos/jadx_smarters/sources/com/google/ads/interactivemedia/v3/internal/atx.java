package com.google.ads.interactivemedia.v3.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class atx implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator f20730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Collection f20731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Iterator f20732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ auj f20733d;

    public atx(auj aujVar) {
        this.f20733d = aujVar;
        this.f20730a = aujVar.f20757a.entrySet().iterator();
        this.f20731b = null;
        this.f20732c = awi.f20849a;
    }

    public atx(auj aujVar, byte[] bArr) {
        this(aujVar);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20730a.hasNext() || this.f20732c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f20732c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f20730a.next();
            entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f20731b = collection;
            this.f20732c = collection.iterator();
        }
        return this.f20732c.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f20732c.remove();
        Collection collection = this.f20731b;
        collection.getClass();
        if (collection.isEmpty()) {
            this.f20730a.remove();
        }
        auj.r(this.f20733d);
    }
}
