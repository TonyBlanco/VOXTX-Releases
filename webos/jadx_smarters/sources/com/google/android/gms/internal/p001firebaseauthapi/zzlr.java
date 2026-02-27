package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzif;
import com.google.android.gms.internal.p001firebaseauthapi.zzuy;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzlr extends zznb<zzuv> {
    public zzlr() {
        super(zzuv.class, new zzlq(zzbr.class));
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zznb
    public final /* synthetic */ zzakn zza(zzahp zzahpVar) throws zzaji {
        return zzuv.zza(zzahpVar, zzaio.zza());
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zznb
    public final /* synthetic */ void zza(zzakn zzaknVar) throws GeneralSecurityException {
        zzuv zzuvVar = (zzuv) zzaknVar;
        zzxo.zza(zzuvVar.zza(), 0);
        if (!zzuvVar.zzg()) {
            throw new GeneralSecurityException("Missing HPKE key params.");
        }
        zzlt.zza(zzuvVar.zzb());
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zznb
    public final zzif.zza zzb() {
        return zzif.zza.zza;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zznb
    public final zzuy.zza zzd() {
        return zzuy.zza.ASYMMETRIC_PUBLIC;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zznb
    public final String zze() {
        return "type.googleapis.com/google.crypto.tink.HpkePublicKey";
    }
}
