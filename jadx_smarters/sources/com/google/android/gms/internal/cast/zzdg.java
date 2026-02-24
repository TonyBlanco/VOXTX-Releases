package com.google.android.gms.internal.cast;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes3.dex */
final class zzdg extends zzdk {
    public zzdg(zzdm zzdmVar, GoogleApiClient googleApiClient) {
        super(zzdmVar, googleApiClient);
    }

    @Override // com.google.android.gms.internal.cast.zzdk, com.google.android.gms.common.api.internal.AbstractC1357d
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        doExecute((zzdp) bVar);
    }

    @Override // com.google.android.gms.internal.cast.zzdk
    /* JADX INFO: renamed from: zza */
    public final void doExecute(zzdp zzdpVar) throws RemoteException {
        zzdpVar.zzs(new zzdj(this));
    }
}
