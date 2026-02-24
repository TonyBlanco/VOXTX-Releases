package com.google.ads.interactivemedia.v3.internal;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class anq extends alz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f20343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f20344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f20345c;

    public anq() {
    }

    public anq(String str) {
        HashMap mapA = alz.a(str);
        if (mapA != null) {
            this.f20343a = (Long) mapA.get(0);
            this.f20344b = (Boolean) mapA.get(1);
            this.f20345c = (Boolean) mapA.get(2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.alz
    public final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.f20343a);
        map.put(1, this.f20344b);
        map.put(2, this.f20345c);
        return map;
    }
}
