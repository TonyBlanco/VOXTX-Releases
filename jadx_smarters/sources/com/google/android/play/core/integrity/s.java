package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.google.android.gms.tasks.TaskCompletionSource;
import q5.AbstractBinderC2565l;
import q5.C2567n;

/* JADX INFO: loaded from: classes3.dex */
final class s extends AbstractBinderC2565l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ t f27857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2567n f27858b = new C2567n("OnRequestIntegrityTokenCallback");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TaskCompletionSource f27859c;

    public s(t tVar, TaskCompletionSource taskCompletionSource) {
        this.f27857a = tVar;
        this.f27859c = taskCompletionSource;
    }

    @Override // q5.InterfaceC2566m
    public final void b(Bundle bundle) {
        this.f27857a.f27860a.r(this.f27859c);
        this.f27858b.d("onRequestIntegrityToken", new Object[0]);
        int i9 = bundle.getInt("error");
        if (i9 != 0) {
            this.f27859c.trySetException(new IntegrityServiceException(i9, null));
            return;
        }
        String string = bundle.getString(ClientConstants.DOMAIN_PATH_TOKEN_ENDPOINT);
        if (string == null) {
            this.f27859c.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        TaskCompletionSource taskCompletionSource = this.f27859c;
        d dVar = new d();
        dVar.a(string);
        taskCompletionSource.trySetResult(dVar.b());
    }
}
