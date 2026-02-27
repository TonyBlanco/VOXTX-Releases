package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class X extends AbstractC1384q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f26548a;

    public X(Y y9) {
        this.f26548a = new WeakReference(y9);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1384q0
    public final void a() {
        Y y9 = (Y) this.f26548a.get();
        if (y9 == null) {
            return;
        }
        Y.q(y9);
    }
}
