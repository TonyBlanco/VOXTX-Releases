package com.google.android.gms.internal.p001firebaseauthapi;

import H5.AbstractC0622m;

/* JADX INFO: loaded from: classes3.dex */
final class zzyo implements zzadk<zzagz> {
    private final /* synthetic */ zzacd zza;
    private final /* synthetic */ zzyj zzb;

    public zzyo(zzyj zzyjVar, zzacd zzacdVar) {
        this.zzb = zzyjVar;
        this.zza = zzacdVar;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadk
    public final /* synthetic */ void zza(zzagz zzagzVar) {
        zzagz zzagzVar2 = zzagzVar;
        if (zzagzVar2.zzf()) {
            this.zza.zza(new zzyk(zzagzVar2.zzc(), zzagzVar2.zze(), null));
        } else {
            this.zzb.zza(new zzafn(zzagzVar2.zzd(), zzagzVar2.zzb(), Long.valueOf(zzagzVar2.zza()), "Bearer"), null, null, Boolean.FALSE, null, this.zza, this);
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadl
    public final void zza(String str) {
        this.zza.zza(AbstractC0622m.a(str));
    }
}
