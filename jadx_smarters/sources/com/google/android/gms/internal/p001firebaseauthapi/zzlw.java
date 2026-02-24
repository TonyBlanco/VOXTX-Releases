package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class zzlw implements zzlj {
    private final zzla zza;

    public zzlw(zzla zzlaVar) {
        this.zza = zzlaVar;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzlj
    public final byte[] zza() throws GeneralSecurityException {
        if (Arrays.equals(this.zza.zzb(), zzlt.zzf)) {
            return zzlt.zzb;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzlj
    public final byte[] zza(byte[] bArr, zzll zzllVar) throws GeneralSecurityException {
        byte[] bArrZza = zzxr.zza(zzllVar.zza().zzb(), bArr);
        byte[] bArrZza2 = zzwg.zza(bArr, zzllVar.zzb().zzb());
        byte[] bArrZza3 = zzlt.zza(zzlt.zzb);
        zzla zzlaVar = this.zza;
        return zzlaVar.zza(null, bArrZza, "eae_prk", bArrZza2, "shared_secret", bArrZza3, zzlaVar.zza());
    }
}
