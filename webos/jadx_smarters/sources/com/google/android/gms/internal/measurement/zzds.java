package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.r;

/* JADX INFO: loaded from: classes3.dex */
final class zzds extends zzdu {
    final /* synthetic */ Long zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ Bundle zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ boolean zzf;
    final /* synthetic */ zzef zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzds(zzef zzefVar, Long l9, String str, String str2, Bundle bundle, boolean z9, boolean z10) {
        super(zzefVar, true);
        this.zzg = zzefVar;
        this.zza = l9;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bundle;
        this.zze = z9;
        this.zzf = z10;
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public final void zza() throws RemoteException {
        Long l9 = this.zza;
        ((zzcc) r.m(this.zzg.zzj)).logEvent(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, l9 == null ? this.zzh : l9.longValue());
    }
}
