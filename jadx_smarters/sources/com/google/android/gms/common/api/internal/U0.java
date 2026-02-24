package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.C1371k;
import com.google.android.gms.tasks.TaskCompletionSource;
import w4.C2916d;

/* JADX INFO: loaded from: classes3.dex */
public final class U0 extends N0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1371k.a f26540c;

    public U0(C1371k.a aVar, TaskCompletionSource taskCompletionSource) {
        super(4, taskCompletionSource);
        this.f26540c = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.V0
    public final /* bridge */ /* synthetic */ void d(C1400z c1400z, boolean z9) {
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1391u0
    public final boolean f(C1372k0 c1372k0) {
        A0 a02 = (A0) c1372k0.u().get(this.f26540c);
        return a02 != null && a02.f26459a.f();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1391u0
    public final C2916d[] g(C1372k0 c1372k0) {
        A0 a02 = (A0) c1372k0.u().get(this.f26540c);
        if (a02 == null) {
            return null;
        }
        return a02.f26459a.c();
    }

    @Override // com.google.android.gms.common.api.internal.N0
    public final void h(C1372k0 c1372k0) {
        A0 a02 = (A0) c1372k0.u().remove(this.f26540c);
        if (a02 == null) {
            this.f26499b.trySetResult(Boolean.FALSE);
            return;
        }
        a02.f26460b.b(c1372k0.s(), this.f26499b);
        a02.f26459a.a();
    }
}
