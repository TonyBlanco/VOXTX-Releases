package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzif;
import com.google.android.gms.internal.p001firebaseauthapi.zzuy;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdv extends zznb<zzsi> {
    public zzdv() {
        super(zzsi.class, new zzdu(zzxi.class));
    }

    public static void zza(zzsi zzsiVar) throws GeneralSecurityException {
        zzxo.zza(zzsiVar.zza(), 0);
        zzxo.zza(zzsiVar.zzf().zzb());
        zza(zzsiVar.zze());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(zzsm zzsmVar) throws GeneralSecurityException {
        if (zzsmVar.zza() < 12 || zzsmVar.zza() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zznb
    public final /* synthetic */ zzakn zza(zzahp zzahpVar) throws zzaji {
        return zzsi.zza(zzahpVar, zzaio.zza());
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zznb
    public final /* bridge */ /* synthetic */ void zza(zzakn zzaknVar) throws GeneralSecurityException {
        zza((zzsi) zzaknVar);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zznb
    public final zzif.zza zzb() {
        return zzif.zza.zza;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zznb
    public final zzne<zzsj, zzsi> zzc() {
        return new zzdx(this, zzsj.class);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zznb
    public final zzuy.zza zzd() {
        return zzuy.zza.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zznb
    public final String zze() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }
}
