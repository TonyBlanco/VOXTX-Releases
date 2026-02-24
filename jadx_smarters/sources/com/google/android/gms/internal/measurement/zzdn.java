package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.r;

/* JADX INFO: loaded from: classes3.dex */
final class zzdn extends zzdu {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzef zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdn(zzef zzefVar, boolean z9) {
        super(zzefVar, true);
        this.zzb = zzefVar;
        this.zza = z9;
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public final void zza() throws RemoteException {
        ((zzcc) r.m(this.zzb.zzj)).setDataCollectionEnabled(this.zza);
    }
}
