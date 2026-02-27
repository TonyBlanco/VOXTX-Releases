package com.google.ads.interactivemedia.v3.internal;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class aob extends alz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f20401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f20402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f20403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f20404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f20405e;

    public aob() {
    }

    public aob(String str) {
        HashMap mapA = alz.a(str);
        if (mapA != null) {
            this.f20401a = (Long) mapA.get(0);
            this.f20402b = (Long) mapA.get(1);
            this.f20403c = (Long) mapA.get(2);
            this.f20404d = (Long) mapA.get(3);
            this.f20405e = (Long) mapA.get(4);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.alz
    public final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.f20401a);
        map.put(1, this.f20402b);
        map.put(2, this.f20403c);
        map.put(3, this.f20404d);
        map.put(4, this.f20405e);
        return map;
    }
}
