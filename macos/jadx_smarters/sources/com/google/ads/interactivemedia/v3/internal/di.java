package com.google.ads.interactivemedia.v3.internal;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class di extends auu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f22716a;

    public di(Map map) {
        this.f22716a = map;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auu, com.google.ads.interactivemedia.v3.internal.auv
    public final /* synthetic */ Object a() {
        return this.f22716a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auu
    public final Map b() {
        return this.f22716a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auu, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auu, java.util.Map
    public final boolean containsValue(Object obj) {
        return super.d(obj);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auu, java.util.Map
    public final Set entrySet() {
        return axo.e(b().entrySet(), dh.f22714b);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auu, java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && super.e(obj);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auu, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) b().get(obj);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auu, java.util.Map
    public final int hashCode() {
        return super.c();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auu, java.util.Map
    public final boolean isEmpty() {
        if (b().isEmpty()) {
            return true;
        }
        return super.size() == 1 && super.containsKey(null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auu, java.util.Map
    public final Set keySet() {
        return axo.e(b().keySet(), dh.f22713a);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auu, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }
}
