package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
final class zzgj extends zzoh<zzbg, zzvo> {
    public zzgj(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzoh
    public final /* synthetic */ zzbg zza(zzakn zzaknVar) throws GeneralSecurityException {
        zzvo zzvoVar = (zzvo) zzaknVar;
        String strZze = zzvoVar.zzd().zze();
        return new zzgh(zzvoVar.zzd().zza(), zzcf.zza(strZze).zza(strZze));
    }
}
