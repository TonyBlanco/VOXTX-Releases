package com.google.ads.interactivemedia.v3.internal;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class anf extends alz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f20325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f20326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f20327c;

    public anf() {
    }

    public anf(String str) {
        HashMap mapA = alz.a(str);
        if (mapA != null) {
            this.f20325a = (Long) mapA.get(0);
            this.f20326b = (Long) mapA.get(1);
            this.f20327c = (Long) mapA.get(2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.alz
    public final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.f20325a);
        map.put(1, this.f20326b);
        map.put(2, this.f20327c);
        return map;
    }
}
