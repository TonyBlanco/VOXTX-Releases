package com.google.ads.interactivemedia.v3.internal;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class ank extends alz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f20333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f20334b;

    public ank() {
        this.f20333a = -1L;
        this.f20334b = -1L;
    }

    public ank(String str) {
        this.f20333a = -1L;
        this.f20334b = -1L;
        HashMap mapA = alz.a(str);
        if (mapA != null) {
            this.f20333a = ((Long) mapA.get(0)).longValue();
            this.f20334b = ((Long) mapA.get(1)).longValue();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.alz
    public final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, Long.valueOf(this.f20333a));
        map.put(1, Long.valueOf(this.f20334b));
        return map;
    }
}
