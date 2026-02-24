package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pw implements ql {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ql f24155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f24156b;

    public pw(ql qlVar, List list) {
        this.f24155a = qlVar;
        this.f24156b = list;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ql
    public final xe a() {
        return new rz(this.f24155a.a(), this.f24156b);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ql
    public final xe b(qg qgVar, qd qdVar) {
        return new rz(this.f24155a.b(qgVar, qdVar), this.f24156b);
    }
}
