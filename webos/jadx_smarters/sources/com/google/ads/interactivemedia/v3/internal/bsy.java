package com.google.ads.interactivemedia.v3.internal;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
final class bsy implements ListIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ListIterator f22246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f22247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ bta f22248c;

    public bsy(bta btaVar, int i9) {
        this.f22248c = btaVar;
        this.f22247b = i9;
        this.f22246a = btaVar.f22251a.listIterator(i9);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f22246a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f22246a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f22246a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f22246a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f22246a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f22246a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
