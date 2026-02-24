package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.r;

/* JADX INFO: loaded from: classes3.dex */
final class zzec extends zzdu {
    final /* synthetic */ Activity zza;
    final /* synthetic */ zzbz zzb;
    final /* synthetic */ zzee zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzec(zzee zzeeVar, Activity activity, zzbz zzbzVar) {
        super(zzeeVar.zza, true);
        this.zzc = zzeeVar;
        this.zza = activity;
        this.zzb = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public final void zza() throws RemoteException {
        ((zzcc) r.m(this.zzc.zza.zzj)).onActivitySaveInstanceState(F4.b.Z(this.zza), this.zzb, this.zzi);
    }
}
