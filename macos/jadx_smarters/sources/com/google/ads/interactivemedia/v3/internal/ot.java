package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class ot extends uq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f23939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f23940c;

    public ot(long j9, List list) {
        super(0L, list.size() - 1);
        this.f23940c = j9;
        this.f23939b = list;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vg
    public final long a() {
        d();
        qb qbVar = (qb) this.f23939b.get((int) c());
        return this.f23940c + qbVar.f24170g + qbVar.f24168e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vg
    public final long b() {
        d();
        return this.f23940c + ((qb) this.f23939b.get((int) c())).f24170g;
    }
}
