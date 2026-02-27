package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.internal.AbstractC1404c;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1370j0 implements AbstractC1404c.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1372k0 f26641a;

    public C1370j0(C1372k0 c1372k0) {
        this.f26641a = c1372k0;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c.e
    public final void a() {
        this.f26641a.f26660n.f26633o.post(new RunnableC1368i0(this));
    }
}
