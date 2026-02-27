package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1357d extends BasePendingResult implements InterfaceC1359e {
    private final com.google.android.gms.common.api.a api;
    private final a.c clientKey;

    public AbstractC1357d(com.google.android.gms.common.api.a aVar, GoogleApiClient googleApiClient) {
        super((GoogleApiClient) com.google.android.gms.common.internal.r.n(googleApiClient, "GoogleApiClient must not be null"));
        com.google.android.gms.common.internal.r.n(aVar, "Api must not be null");
        this.clientKey = aVar.b();
        this.api = aVar;
    }

    public final void c(RemoteException remoteException) {
        setFailedResult(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    public abstract void doExecute(a.b bVar) throws RemoteException;

    public final com.google.android.gms.common.api.a getApi() {
        return this.api;
    }

    public final a.c getClientKey() {
        return this.clientKey;
    }

    public void onSetFailedResult(com.google.android.gms.common.api.h hVar) {
    }

    public final void run(a.b bVar) throws DeadObjectException {
        try {
            doExecute(bVar);
        } catch (DeadObjectException e9) {
            c(e9);
            throw e9;
        } catch (RemoteException e10) {
            c(e10);
        }
    }

    public final void setFailedResult(Status status) {
        com.google.android.gms.common.internal.r.b(!status.L(), "Failed result must not be success");
        com.google.android.gms.common.api.h hVarCreateFailedResult = createFailedResult(status);
        setResult(hVarCreateFailedResult);
        onSetFailedResult(hVarCreateFailedResult);
    }
}
