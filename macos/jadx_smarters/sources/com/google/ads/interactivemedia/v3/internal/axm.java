package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class axm extends avx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final transient Object f20888a;

    public axm(Object obj) {
        atp.k(obj);
        this.f20888a = obj;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avi
    public final int a(Object[] objArr, int i9) {
        objArr[i9] = this.f20888a;
        return i9 + 1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f20888a.equals(obj);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avx, com.google.ads.interactivemedia.v3.internal.avi
    public final avo d() {
        return avo.p(this.f20888a);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avx, com.google.ads.interactivemedia.v3.internal.avi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: e */
    public final axq listIterator() {
        return new awh(this.f20888a);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avi
    public final boolean f() {
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avx, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f20888a.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return '[' + this.f20888a.toString() + ']';
    }
}
