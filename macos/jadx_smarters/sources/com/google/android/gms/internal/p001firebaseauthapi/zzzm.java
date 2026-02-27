package com.google.android.gms.internal.p001firebaseauthapi;

import H5.AbstractC0622m;

/* JADX INFO: loaded from: classes3.dex */
final class zzzm implements zzadk<zzagv> {
    private final /* synthetic */ zzacd zza;
    private final /* synthetic */ zzyj zzb;

    public zzzm(zzyj zzyjVar, zzacd zzacdVar) {
        this.zzb = zzyjVar;
        this.zza = zzacdVar;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadk
    public final /* synthetic */ void zza(zzagv zzagvVar) {
        zzagv zzagvVar2 = zzagvVar;
        if (zzagvVar2.zzl()) {
            this.zza.zza(new zzyk(zzagvVar2.zzf(), zzagvVar2.zzk(), zzagvVar2.zzb()));
        } else {
            zzyj.zza(this.zzb, zzagvVar2, this.zza, this);
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadl
    public final void zza(String str) {
        this.zza.zza(AbstractC0622m.a(str));
    }
}
