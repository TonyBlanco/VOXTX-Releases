package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class zzdd implements zzbg {
    private final zzcg<zzbg> zza;
    private final zzrr zzb;
    private final zzrr zzc;

    private zzdd(zzcg<zzbg> zzcgVar) {
        zzrr zzrrVarZza;
        this.zza = zzcgVar;
        if (zzcgVar.zzf()) {
            zzro zzroVarZzb = zznn.zza().zzb();
            zzrq zzrqVarZza = zznh.zza(zzcgVar);
            this.zzb = zzroVarZzb.zza(zzrqVarZza, "aead", "encrypt");
            zzrrVarZza = zzroVarZzb.zza(zzrqVarZza, "aead", "decrypt");
        } else {
            zzrrVarZza = zznh.zza;
            this.zzb = zzrrVarZza;
        }
        this.zzc = zzrrVarZza;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzbg
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 5) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            for (zzcl<zzbg> zzclVar : this.zza.zza(bArrCopyOf)) {
                try {
                    byte[] bArrZza = zzclVar.zzf().zza(bArrCopyOfRange, bArr2);
                    this.zzc.zza(zzclVar.zza(), bArrCopyOfRange.length);
                    return bArrZza;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        for (zzcl<zzbg> zzclVar2 : this.zza.zze()) {
            try {
                byte[] bArrZza2 = zzclVar2.zzf().zza(bArr, bArr2);
                this.zzc.zza(zzclVar2.zza(), bArr.length);
                return bArrZza2;
            } catch (GeneralSecurityException unused2) {
            }
        }
        this.zzc.zza();
        throw new GeneralSecurityException("decryption failed");
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzbg
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            byte[] bArrZza = zzwg.zza(this.zza.zza().zzh(), this.zza.zza().zzf().zzb(bArr, bArr2));
            this.zzb.zza(this.zza.zza().zza(), bArr.length);
            return bArrZza;
        } catch (GeneralSecurityException e9) {
            this.zzb.zza();
            throw e9;
        }
    }
}
