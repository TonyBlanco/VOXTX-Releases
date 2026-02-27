package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractMap;

/* JADX INFO: loaded from: classes3.dex */
final class avy extends avo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ avu f20832a;

    public avy(avu avuVar) {
        this.f20832a = avuVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avi
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i9) {
        return new AbstractMap.SimpleImmutableEntry(this.f20832a.f20829a.f20839b.f20885d.get(i9), this.f20832a.f20829a.f20840c.get(i9));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20832a.f20829a.size();
    }
}
