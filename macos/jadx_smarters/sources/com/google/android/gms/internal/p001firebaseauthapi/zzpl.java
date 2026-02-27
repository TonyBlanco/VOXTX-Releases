package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzif;
import com.google.android.gms.internal.p001firebaseauthapi.zzpo;
import com.google.android.gms.internal.p001firebaseauthapi.zzuy;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzpl extends zznb<zzrw> {
    private static final zzod<zzph, zzpz> zza = zzod.zza(new zzof() { // from class: com.google.android.gms.internal.firebase-auth-api.zzpk
        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzof
        public final Object zza(zzbt zzbtVar) {
            return new zzrc((zzph) zzbtVar);
        }
    }, zzph.class, zzpz.class);
    private static final zzod<zzph, zzce> zzb = zzod.zza(new zzof() { // from class: com.google.android.gms.internal.firebase-auth-api.zzpn
        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzof
        public final Object zza(zzbt zzbtVar) {
            return zzxm.zza((zzph) zzbtVar);
        }
    }, zzph.class, zzce.class);

    public zzpl() {
        super(zzrw.class, new zzpm(zzce.class));
    }

    public static void zza(boolean z9) throws GeneralSecurityException {
        zzct.zza((zznb) new zzpl(), true);
        zzpt.zza();
        zznr.zza().zza(zza);
        zznr.zza().zza(zzb);
        zzns zznsVarZza = zzns.zza();
        HashMap map = new HashMap();
        zzpo zzpoVar = zzqx.zzc;
        map.put("AES_CMAC", zzpoVar);
        map.put("AES256_CMAC", zzpoVar);
        map.put("AES256_CMAC_RAW", zzpo.zzd().zza(32).zzb(16).zza(zzpo.zzb.zzd).zza());
        zznsVarZza.zza(Collections.unmodifiableMap(map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzb(int i9) throws GeneralSecurityException {
        if (i9 != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzb(zzsb zzsbVar) throws GeneralSecurityException {
        if (zzsbVar.zza() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (zzsbVar.zza() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zznb
    public final /* synthetic */ zzakn zza(zzahp zzahpVar) throws zzaji {
        return zzrw.zza(zzahpVar, zzaio.zza());
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zznb
    public final /* synthetic */ void zza(zzakn zzaknVar) throws GeneralSecurityException {
        zzrw zzrwVar = (zzrw) zzaknVar;
        zzxo.zza(zzrwVar.zza(), 0);
        zzb(zzrwVar.zze().zzb());
        zzb(zzrwVar.zzd());
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zznb
    public final zzif.zza zzb() {
        return zzif.zza.zza;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zznb
    public final zzne<zzsa, zzrw> zzc() {
        return new zzpp(this, zzsa.class);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zznb
    public final zzuy.zza zzd() {
        return zzuy.zza.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zznb
    public final String zze() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }
}
