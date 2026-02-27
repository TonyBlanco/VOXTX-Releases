package com.google.ads.interactivemedia.v3.internal;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class atu extends awm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ atw f20724a;

    public atu(atw atwVar) {
        this.f20724a = atwVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awm
    public final Map a() {
        return this.f20724a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awm, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return axo.H(this.f20724a.f20728a.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new atv(this.f20724a);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awm, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        auj.n(this.f20724a.f20729b, entry.getKey());
        return true;
    }
}
