package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
final class zzdx extends zzne<zzsj, zzsi> {
    private final /* synthetic */ zzdv zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdx(zzdv zzdvVar, Class cls) {
        super(cls);
        this.zza = zzdvVar;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzne
    public final /* synthetic */ zzakn zza(zzahp zzahpVar) throws zzaji {
        return zzsj.zza(zzahpVar, zzaio.zza());
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzne
    public final /* synthetic */ zzakn zza(zzakn zzaknVar) throws GeneralSecurityException {
        zzsj zzsjVar = (zzsj) zzaknVar;
        return (zzsi) ((zzajc) zzsi.zzb().zza(zzsjVar.zze()).zza(zzahp.zza(zzou.zza(zzsjVar.zza()))).zza(0).zzf());
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzne
    public final /* synthetic */ void zzb(zzakn zzaknVar) throws GeneralSecurityException {
        zzsj zzsjVar = (zzsj) zzaknVar;
        zzxo.zza(zzsjVar.zza());
        zzdv zzdvVar = this.zza;
        zzdv.zza(zzsjVar.zze());
    }
}
