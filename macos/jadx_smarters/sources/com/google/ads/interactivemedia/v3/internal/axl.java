package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractSet;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
abstract class axl extends AbstractSet {
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        return axo.h(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        atp.k(collection);
        return super.retainAll(collection);
    }
}
