package com.google.ads.interactivemedia.v3.internal;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class ama extends alz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f20178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f20179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f20180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f20181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f20182e;

    public ama() {
        this.f20178a = "E";
        this.f20179b = -1L;
        this.f20180c = "E";
        this.f20181d = "E";
        this.f20182e = "E";
    }

    public ama(String str) {
        this.f20178a = "E";
        this.f20179b = -1L;
        this.f20180c = "E";
        this.f20181d = "E";
        this.f20182e = "E";
        HashMap mapA = alz.a(str);
        if (mapA != null) {
            this.f20178a = mapA.get(0) == null ? "E" : (String) mapA.get(0);
            this.f20179b = mapA.get(1) != null ? ((Long) mapA.get(1)).longValue() : -1L;
            this.f20180c = mapA.get(2) == null ? "E" : (String) mapA.get(2);
            this.f20181d = mapA.get(3) == null ? "E" : (String) mapA.get(3);
            this.f20182e = mapA.get(4) != null ? (String) mapA.get(4) : "E";
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.alz
    public final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.f20178a);
        map.put(4, this.f20182e);
        map.put(3, this.f20181d);
        map.put(2, this.f20180c);
        map.put(1, Long.valueOf(this.f20179b));
        return map;
    }
}
