package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class axc extends avx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient avs f20868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient avo f20869b;

    public axc(avs avsVar, avo avoVar) {
        this.f20868a = avsVar;
        this.f20869b = avoVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avi
    public final int a(Object[] objArr, int i9) {
        return this.f20869b.a(objArr, i9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f20868a.get(obj) != null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avx, com.google.ads.interactivemedia.v3.internal.avi
    public final avo d() {
        return this.f20869b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avx, com.google.ads.interactivemedia.v3.internal.avi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: e */
    public final axq listIterator() {
        return this.f20869b.iterator();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avi
    public final boolean f() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f20868a.size();
    }
}
