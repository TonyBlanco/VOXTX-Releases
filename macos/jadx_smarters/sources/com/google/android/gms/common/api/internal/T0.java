package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import w4.C2916d;

/* JADX INFO: loaded from: classes3.dex */
public final class T0 extends AbstractC1391u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC1388t f26536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TaskCompletionSource f26537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1386s f26538d;

    public T0(int i9, AbstractC1388t abstractC1388t, TaskCompletionSource taskCompletionSource, InterfaceC1386s interfaceC1386s) {
        super(i9);
        this.f26537c = taskCompletionSource;
        this.f26536b = abstractC1388t;
        this.f26538d = interfaceC1386s;
        if (i9 == 2 && abstractC1388t.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.V0
    public final void a(Status status) {
        this.f26537c.trySetException(this.f26538d.a(status));
    }

    @Override // com.google.android.gms.common.api.internal.V0
    public final void b(Exception exc) {
        this.f26537c.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.V0
    public final void c(C1372k0 c1372k0) throws DeadObjectException {
        try {
            this.f26536b.b(c1372k0.s(), this.f26537c);
        } catch (DeadObjectException e9) {
            throw e9;
        } catch (RemoteException e10) {
            a(V0.e(e10));
        } catch (RuntimeException e11) {
            this.f26537c.trySetException(e11);
        }
    }

    @Override // com.google.android.gms.common.api.internal.V0
    public final void d(C1400z c1400z, boolean z9) {
        c1400z.d(this.f26537c, z9);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1391u0
    public final boolean f(C1372k0 c1372k0) {
        return this.f26536b.c();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1391u0
    public final C2916d[] g(C1372k0 c1372k0) {
        return this.f26536b.e();
    }
}
