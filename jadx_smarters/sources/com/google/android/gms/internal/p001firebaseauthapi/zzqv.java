package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class zzqv implements zzce {
    private final zzcg<zzce> zza;
    private final zzrr zzb;
    private final zzrr zzc;

    private zzqv(zzcg<zzce> zzcgVar) {
        zzrr zzrrVarZza;
        this.zza = zzcgVar;
        if (zzcgVar.zzf()) {
            zzro zzroVarZzb = zznn.zza().zzb();
            zzrq zzrqVarZza = zznh.zza(zzcgVar);
            this.zzb = zzroVarZzb.zza(zzrqVarZza, "mac", "compute");
            zzrrVarZza = zzroVarZzb.zza(zzrqVarZza, "mac", "verify");
        } else {
            zzrrVarZza = zznh.zza;
            this.zzb = zzrrVarZza;
        }
        this.zzc = zzrrVarZza;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzce
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length <= 5) {
            this.zzc.zza();
            throw new GeneralSecurityException("tag too short");
        }
        for (zzcl<zzce> zzclVar : this.zza.zza(Arrays.copyOf(bArr, 5))) {
            try {
                zzclVar.zze().zza(bArr, bArr2);
                this.zzc.zza(zzclVar.zza(), bArr2.length);
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        for (zzcl<zzce> zzclVar2 : this.zza.zze()) {
            try {
                zzclVar2.zze().zza(bArr, bArr2);
                this.zzc.zza(zzclVar2.zza(), bArr2.length);
                return;
            } catch (GeneralSecurityException unused2) {
            }
        }
        this.zzc.zza();
        throw new GeneralSecurityException("invalid MAC");
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzce
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        try {
            byte[] bArrZza = this.zza.zza().zze().zza(bArr);
            this.zzb.zza(this.zza.zza().zza(), bArr.length);
            return bArrZza;
        } catch (GeneralSecurityException e9) {
            this.zzb.zza();
            throw e9;
        }
    }
}
