package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes3.dex */
final class zzky implements zzld {
    private final int zza;

    public zzky(int i9) throws InvalidAlgorithmParameterException {
        if (i9 == 16 || i9 == 32) {
            this.zza = i9;
        } else {
            throw new InvalidAlgorithmParameterException("Unsupported key length: " + i9);
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzld
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzld
    public final byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException {
        if (bArr.length == this.zza) {
            return new zzht(bArr, false).zza(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: " + bArr.length);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzld
    public final int zzb() {
        return 12;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzld
    public final byte[] zzc() throws GeneralSecurityException {
        int i9 = this.zza;
        if (i9 == 16) {
            return zzlt.zzi;
        }
        if (i9 == 32) {
            return zzlt.zzj;
        }
        throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    }
}
