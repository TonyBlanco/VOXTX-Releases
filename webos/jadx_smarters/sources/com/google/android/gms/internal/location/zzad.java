package com.google.android.gms.internal.location;

import J4.P;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes3.dex */
final class zzad extends zzae {
    final /* synthetic */ P zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzad(zzaf zzafVar, GoogleApiClient googleApiClient, P p9) {
        super(googleApiClient);
        this.zza = p9;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1357d
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzaz) bVar).zzw(this.zza, this);
    }
}
