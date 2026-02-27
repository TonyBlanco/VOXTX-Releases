package com.google.android.gms.internal.p001firebaseauthapi;

import H5.AbstractC0622m;

/* JADX INFO: loaded from: classes3.dex */
final class zzyl implements zzadk<zzagh> {
    private final /* synthetic */ zzacd zza;
    private final /* synthetic */ zzyj zzb;

    public zzyl(zzyj zzyjVar, zzacd zzacdVar) {
        this.zzb = zzyjVar;
        this.zza = zzacdVar;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadk
    public final /* synthetic */ void zza(zzagh zzaghVar) {
        zzagh zzaghVar2 = zzaghVar;
        this.zzb.zza(new zzafn(zzaghVar2.zzc(), zzaghVar2.zzb(), Long.valueOf(zzaghVar2.zza()), "Bearer"), null, null, Boolean.TRUE, null, this.zza, this);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadl
    public final void zza(String str) {
        this.zza.zza(AbstractC0622m.a(str));
    }
}
