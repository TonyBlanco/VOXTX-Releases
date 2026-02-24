package com.google.android.gms.internal.cast;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes3.dex */
final class zzdf extends zzdk {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdm zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdf(zzdm zzdmVar, GoogleApiClient googleApiClient, String str) {
        super(zzdmVar, googleApiClient);
        this.zzb = zzdmVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.cast.zzdk, com.google.android.gms.common.api.internal.AbstractC1357d
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        doExecute((zzdp) bVar);
    }

    @Override // com.google.android.gms.internal.cast.zzdk
    /* JADX INFO: renamed from: zza */
    public final void doExecute(zzdp zzdpVar) throws RemoteException {
        zzdpVar.zzr(new zzdi(this, zzdpVar), this.zzb.zzd, this.zza);
    }
}
