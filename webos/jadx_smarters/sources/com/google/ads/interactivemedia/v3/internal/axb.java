package com.google.ads.interactivemedia.v3.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class axb extends avx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient avs f20865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient Object[] f20866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient int f20867c;

    public axb(avs avsVar, Object[] objArr, int i9) {
        this.f20865a = avsVar;
        this.f20866b = objArr;
        this.f20867c = i9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avi
    public final int a(Object[] objArr, int i9) {
        return d().a(objArr, i9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f20865a.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avx, com.google.ads.interactivemedia.v3.internal.avi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: e */
    public final axq listIterator() {
        return d().iterator();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avi
    public final boolean f() {
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avx
    public final avo i() {
        return new axa(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f20867c;
    }
}
