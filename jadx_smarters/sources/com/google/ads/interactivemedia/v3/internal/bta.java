package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class bta extends AbstractList implements RandomAccess, bre {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bre f22251a;

    public bta(bre breVar) {
        this.f22251a = breVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bre
    public final bre e() {
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bre
    public final Object f(int i9) {
        return this.f22251a.f(i9);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i9) {
        return ((brd) this.f22251a).get(i9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bre
    public final List h() {
        return this.f22251a.h();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bre
    public final void i(bpb bpbVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new bsz(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i9) {
        return new bsy(this, i9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f22251a.size();
    }
}
