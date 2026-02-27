package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
public final class R0 extends V0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC1357d f26512b;

    public R0(int i9, AbstractC1357d abstractC1357d) {
        super(i9);
        this.f26512b = (AbstractC1357d) com.google.android.gms.common.internal.r.n(abstractC1357d, "Null methods are not runnable.");
    }

    @Override // com.google.android.gms.common.api.internal.V0
    public final void a(Status status) {
        try {
            this.f26512b.setFailedResult(status);
        } catch (IllegalStateException e9) {
            Log.w("ApiCallRunner", "Exception reporting failure", e9);
        }
    }

    @Override // com.google.android.gms.common.api.internal.V0
    public final void b(Exception exc) {
        try {
            this.f26512b.setFailedResult(new Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage()));
        } catch (IllegalStateException e9) {
            Log.w("ApiCallRunner", "Exception reporting failure", e9);
        }
    }

    @Override // com.google.android.gms.common.api.internal.V0
    public final void c(C1372k0 c1372k0) throws DeadObjectException {
        try {
            this.f26512b.run(c1372k0.s());
        } catch (RuntimeException e9) {
            b(e9);
        }
    }

    @Override // com.google.android.gms.common.api.internal.V0
    public final void d(C1400z c1400z, boolean z9) {
        c1400z.c(this.f26512b, z9);
    }
}
