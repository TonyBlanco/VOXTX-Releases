package com.google.android.gms.internal.cast;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdj extends zzdh {
    final /* synthetic */ zzdk zza;

    public zzdj(zzdk zzdkVar) {
        this.zza = zzdkVar;
    }

    @Override // com.google.android.gms.internal.cast.zzdh, com.google.android.gms.internal.cast.zzdr
    public final void zzd(int i9) throws RemoteException {
        zzdm.zza.a("onError: %d", Integer.valueOf(i9));
        zzdm.zzf(this.zza.zzc);
        this.zza.setResult(new zzdl(Status.f26439m));
    }

    @Override // com.google.android.gms.internal.cast.zzdh, com.google.android.gms.internal.cast.zzdr
    public final void zzf() throws RemoteException {
        zzdm.zza.a("onDisconnected", new Object[0]);
        zzdm.zzf(this.zza.zzc);
        this.zza.setResult(new zzdl(Status.f26437k));
    }
}
