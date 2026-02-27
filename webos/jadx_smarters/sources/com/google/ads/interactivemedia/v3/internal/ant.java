package com.google.ads.interactivemedia.v3.internal;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class ant extends alz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f20354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f20355b;

    public ant() {
    }

    public ant(String str) {
        HashMap mapA = alz.a(str);
        if (mapA != null) {
            this.f20354a = (Long) mapA.get(0);
            this.f20355b = (Long) mapA.get(1);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.alz
    public final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.f20354a);
        map.put(1, this.f20355b);
        return map;
    }
}
