package com.google.android.gms.internal.p001firebaseauthapi;

import H5.AbstractC0622m;

/* JADX INFO: loaded from: classes3.dex */
final class zzzq implements zzadk<zzaes> {
    private final /* synthetic */ zzacd zza;
    private final /* synthetic */ zzyj zzb;

    public zzzq(zzyj zzyjVar, zzacd zzacdVar) {
        this.zzb = zzyjVar;
        this.zza = zzacdVar;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadk
    public final /* synthetic */ void zza(zzaes zzaesVar) {
        zzaes zzaesVar2 = zzaesVar;
        this.zzb.zza(new zzafn(zzaesVar2.zzb(), zzaesVar2.zza(), Long.valueOf(zzafp.zza(zzaesVar2.zza())), "Bearer"), null, null, Boolean.FALSE, null, this.zza, this);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadl
    public final void zza(String str) {
        this.zza.zza(AbstractC0622m.a(str));
    }
}
