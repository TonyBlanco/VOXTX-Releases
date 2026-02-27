package com.google.android.gms.internal.p001firebaseauthapi;

import H5.AbstractC0622m;

/* JADX INFO: loaded from: classes3.dex */
final class zzza implements zzadk<zzahb> {
    private final /* synthetic */ zzacd zza;
    private final /* synthetic */ zzyj zzb;

    public zzza(zzyj zzyjVar, zzacd zzacdVar) {
        this.zzb = zzyjVar;
        this.zza = zzacdVar;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadk
    public final /* synthetic */ void zza(zzahb zzahbVar) {
        zzahb zzahbVar2 = zzahbVar;
        this.zzb.zza(new zzafn(zzahbVar2.zzd(), zzahbVar2.zzb(), Long.valueOf(zzahbVar2.zza()), "Bearer"), null, null, Boolean.valueOf(zzahbVar2.zzf()), null, this.zza, this);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadl
    public final void zza(String str) {
        this.zza.zza(AbstractC0622m.a(str));
    }
}
