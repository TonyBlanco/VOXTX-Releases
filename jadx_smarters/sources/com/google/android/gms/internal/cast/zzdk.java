package com.google.android.gms.internal.cast;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.AbstractC1357d;
import com.google.android.gms.common.util.VisibleForTesting;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
class zzdk extends AbstractC1357d {
    final /* synthetic */ zzdm zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdk(zzdm zzdmVar, GoogleApiClient googleApiClient) {
        super(zzdmVar.zzb, googleApiClient);
        this.zzc = zzdmVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ h createFailedResult(Status status) {
        return new zzdl(status);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1359e
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((h) obj);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1357d
    @VisibleForTesting
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public void doExecute(zzdp zzdpVar) throws RemoteException {
        throw null;
    }
}
