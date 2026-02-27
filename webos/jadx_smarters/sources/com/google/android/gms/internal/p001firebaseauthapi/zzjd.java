package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class zzjd implements zzbp {
    private final zzcg<zzbp> zza;
    private final zzrr zzb;
    private final zzrr zzc;

    public zzjd(zzcg<zzbp> zzcgVar) {
        zzrr zzrrVarZza;
        this.zza = zzcgVar;
        if (zzcgVar.zzf()) {
            zzro zzroVarZzb = zznn.zza().zzb();
            zzrq zzrqVarZza = zznh.zza(zzcgVar);
            this.zzb = zzroVarZzb.zza(zzrqVarZza, "daead", "encrypt");
            zzrrVarZza = zzroVarZzb.zza(zzrqVarZza, "daead", "decrypt");
        } else {
            zzrrVarZza = zznh.zza;
            this.zzb = zzrrVarZza;
        }
        this.zzc = zzrrVarZza;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzbp
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 5) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            for (zzcl<zzbp> zzclVar : this.zza.zza(bArrCopyOf)) {
                try {
                    byte[] bArrZza = zzclVar.zzf().zza(bArrCopyOfRange, bArr2);
                    this.zzc.zza(zzclVar.zza(), bArrCopyOfRange.length);
                    return bArrZza;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        for (zzcl<zzbp> zzclVar2 : this.zza.zze()) {
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
}
