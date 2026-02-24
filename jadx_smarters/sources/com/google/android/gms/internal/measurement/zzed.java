package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.r;

/* JADX INFO: loaded from: classes3.dex */
final class zzed extends zzdu {
    final /* synthetic */ Activity zza;
    final /* synthetic */ zzee zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzed(zzee zzeeVar, Activity activity) {
        super(zzeeVar.zza, true);
        this.zzb = zzeeVar;
        this.zza = activity;
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public final void zza() throws RemoteException {
        ((zzcc) r.m(this.zzb.zza.zzj)).onActivityDestroyed(F4.b.Z(this.zza), this.zzi);
    }
}
