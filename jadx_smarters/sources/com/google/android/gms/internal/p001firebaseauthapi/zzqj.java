package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
final class zzqj extends zzne<zzug, zzuc> {
    private final /* synthetic */ zzqg zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzqj(zzqg zzqgVar, Class cls) {
        super(cls);
        this.zza = zzqgVar;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzne
    public final /* synthetic */ zzakn zza(zzahp zzahpVar) throws zzaji {
        return zzug.zza(zzahpVar, zzaio.zza());
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzne
    public final /* synthetic */ zzakn zza(zzakn zzaknVar) throws GeneralSecurityException {
        zzug zzugVar = (zzug) zzaknVar;
        return (zzuc) ((zzajc) zzuc.zzb().zza(zzqg.zza()).zza(zzugVar.zzf()).zza(zzahp.zza(zzou.zza(zzugVar.zza()))).zzf());
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzne
    public final /* synthetic */ void zzb(zzakn zzaknVar) throws GeneralSecurityException {
        zzug zzugVar = (zzug) zzaknVar;
        if (zzugVar.zza() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        zzqg.zzb(zzugVar.zzf());
    }
}
