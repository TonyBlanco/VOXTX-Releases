package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.C1371k;
import com.google.android.gms.tasks.TaskCompletionSource;
import w4.C2916d;

/* JADX INFO: loaded from: classes3.dex */
public final class S0 extends N0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A0 f26514c;

    public S0(A0 a02, TaskCompletionSource taskCompletionSource) {
        super(3, taskCompletionSource);
        this.f26514c = a02;
    }

    @Override // com.google.android.gms.common.api.internal.V0
    public final /* bridge */ /* synthetic */ void d(C1400z c1400z, boolean z9) {
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1391u0
    public final boolean f(C1372k0 c1372k0) {
        return this.f26514c.f26459a.f();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1391u0
    public final C2916d[] g(C1372k0 c1372k0) {
        return this.f26514c.f26459a.c();
    }

    @Override // com.google.android.gms.common.api.internal.N0
    public final void h(C1372k0 c1372k0) {
        this.f26514c.f26459a.d(c1372k0.s(), this.f26499b);
        C1371k.a aVarB = this.f26514c.f26459a.b();
        if (aVarB != null) {
            c1372k0.u().put(aVarB, this.f26514c);
        }
    }
}
