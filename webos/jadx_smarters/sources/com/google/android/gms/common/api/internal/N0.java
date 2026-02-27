package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
public abstract class N0 extends AbstractC1391u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f26499b;

    public N0(int i9, TaskCompletionSource taskCompletionSource) {
        super(i9);
        this.f26499b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.V0
    public final void a(Status status) {
        this.f26499b.trySetException(new com.google.android.gms.common.api.b(status));
    }

    @Override // com.google.android.gms.common.api.internal.V0
    public final void b(Exception exc) {
        this.f26499b.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.V0
    public final void c(C1372k0 c1372k0) throws DeadObjectException {
        try {
            h(c1372k0);
        } catch (DeadObjectException e9) {
            a(V0.e(e9));
            throw e9;
        } catch (RemoteException e10) {
            a(V0.e(e10));
        } catch (RuntimeException e11) {
            this.f26499b.trySetException(e11);
        }
    }

    public abstract void h(C1372k0 c1372k0);
}
