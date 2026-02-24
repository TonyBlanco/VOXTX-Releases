package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class md extends me {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mb f23774a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final mm f23775f;

    public md(C1333s c1333s, List list, mj mjVar, List list2, List list3, List list4) {
        super(c1333s, list, mjVar, list2);
        Uri.parse(((lt) list.get(0)).f23721a);
        long j9 = mjVar.f23794b;
        mb mbVar = j9 <= 0 ? null : new mb(null, mjVar.f23793a, j9);
        this.f23774a = mbVar;
        this.f23775f = mbVar == null ? new mm(new mb(null, 0L, -1L)) : null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.me
    public final li k() {
        return this.f23775f;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.me
    public final mb l() {
        return this.f23774a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.me
    public final void m() {
    }
}
