package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import q5.AbstractRunnableC2568o;
import q5.C2579z;

/* JADX INFO: loaded from: classes3.dex */
final class r extends AbstractRunnableC2568o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ byte[] f27852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Long f27853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f27854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ IntegrityTokenRequest f27855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ t f27856e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t tVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l9, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.f27856e = tVar;
        this.f27852a = bArr;
        this.f27853b = l9;
        this.f27854c = taskCompletionSource2;
        this.f27855d = integrityTokenRequest;
    }

    @Override // q5.AbstractRunnableC2568o
    public final void a(Exception exc) {
        if (exc instanceof C2579z) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, q5.k] */
    @Override // q5.AbstractRunnableC2568o
    public final void b() {
        try {
            this.f27856e.f27860a.e().n(t.a(this.f27856e, this.f27852a, this.f27853b), new s(this.f27856e, this.f27854c));
        } catch (RemoteException e9) {
            this.f27856e.f27861b.c(e9, "requestIntegrityToken(%s)", this.f27855d);
            this.f27854c.trySetException(new IntegrityServiceException(-100, e9));
        }
    }
}
