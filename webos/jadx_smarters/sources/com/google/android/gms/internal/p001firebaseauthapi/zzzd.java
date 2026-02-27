package com.google.android.gms.internal.p001firebaseauthapi;

import H5.AbstractC0622m;

/* JADX INFO: loaded from: classes3.dex */
final class zzzd implements zzadk<zzafn> {
    final /* synthetic */ zzacd zza;
    final /* synthetic */ zzyj zzb;
    private final /* synthetic */ zzagt zzc;

    public zzzd(zzyj zzyjVar, zzagt zzagtVar, zzacd zzacdVar) {
        this.zzb = zzyjVar;
        this.zzc = zzagtVar;
        this.zza = zzacdVar;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadk
    public final /* synthetic */ void zza(zzafn zzafnVar) {
        this.zzc.zzb(true);
        this.zzc.zza(zzafnVar.zzc());
        this.zzb.zza.zza(this.zzc, new zzzg(this, this));
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadl
    public final void zza(String str) {
        this.zza.zza(AbstractC0622m.a(str));
    }
}
