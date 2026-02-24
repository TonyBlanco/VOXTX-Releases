package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.r;

/* JADX INFO: loaded from: classes3.dex */
final class zzcr extends zzdu {
    final /* synthetic */ Activity zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzef zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcr(zzef zzefVar, Activity activity, String str, String str2) {
        super(zzefVar, true);
        this.zzd = zzefVar;
        this.zza = activity;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public final void zza() throws RemoteException {
        ((zzcc) r.m(this.zzd.zzj)).setCurrentScreen(F4.b.Z(this.zza), this.zzb, this.zzc, this.zzh);
    }
}
