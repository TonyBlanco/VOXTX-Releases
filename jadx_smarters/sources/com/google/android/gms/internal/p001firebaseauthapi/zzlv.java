package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
final class zzlv implements zzlj {
    private final zzwo zza;
    private final zzla zzb;

    private zzlv(zzla zzlaVar, zzwo zzwoVar) {
        this.zzb = zzlaVar;
        this.zza = zzwoVar;
    }

    public static zzlv zza(zzwo zzwoVar) throws GeneralSecurityException {
        int i9 = zzlu.zza[zzwoVar.ordinal()];
        if (i9 == 1) {
            return new zzlv(new zzla("HmacSha256"), zzwo.NIST_P256);
        }
        if (i9 == 2) {
            return new zzlv(new zzla("HmacSha384"), zzwo.NIST_P384);
        }
        if (i9 == 3) {
            return new zzlv(new zzla("HmacSha512"), zzwo.NIST_P521);
        }
        throw new GeneralSecurityException("invalid curve type: " + String.valueOf(zzwoVar));
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzlj
    public final byte[] zza() throws GeneralSecurityException {
        int i9 = zzlu.zza[this.zza.ordinal()];
        if (i9 == 1) {
            return zzlt.zzc;
        }
        if (i9 == 2) {
            return zzlt.zzd;
        }
        if (i9 == 3) {
            return zzlt.zze;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzlj
    public final byte[] zza(byte[] bArr, zzll zzllVar) throws GeneralSecurityException {
        byte[] bArrZza = zzwp.zza(zzwp.zza(this.zza, zzllVar.zza().zzb()), zzwp.zza(this.zza, zzwr.UNCOMPRESSED, bArr));
        byte[] bArrZza2 = zzwg.zza(bArr, zzllVar.zzb().zzb());
        byte[] bArrZza3 = zzlt.zza(zza());
        zzla zzlaVar = this.zzb;
        return zzlaVar.zza(null, bArrZza, "eae_prk", bArrZza2, "shared_secret", bArrZza3, zzlaVar.zza());
    }
}
