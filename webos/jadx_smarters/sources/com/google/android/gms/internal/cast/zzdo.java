package com.google.android.gms.internal.cast;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
final class zzdo extends zzdt {
    final /* synthetic */ zzdu zza;
    final /* synthetic */ zzdp zzb;

    public zzdo(zzdp zzdpVar, zzdu zzduVar) {
        this.zzb = zzdpVar;
        this.zza = zzduVar;
    }

    @Override // com.google.android.gms.internal.cast.zzdu
    public final void zzb(int i9) throws RemoteException {
        zzdp.zze.a("onRemoteDisplayEnded", new Object[0]);
        zzdu zzduVar = this.zza;
        if (zzduVar != null) {
            zzduVar.zzb(i9);
        }
        zzdp.zzp(this.zzb);
    }
}
