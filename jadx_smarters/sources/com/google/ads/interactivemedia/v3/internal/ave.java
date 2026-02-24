package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
abstract class ave extends AbstractSet {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final avf f20789b;

    public ave(avf avfVar) {
        this.f20789b = avfVar;
    }

    public abstract Object a(int i9);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f20789b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new avd(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f20789b.f20792c;
    }
}
