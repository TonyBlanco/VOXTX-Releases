package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes3.dex */
final class zzlb implements zzld {
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzld
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzld
    public final byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException {
        if (bArr.length == 32) {
            return new zzhx(bArr).zza(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzld
    public final int zzb() {
        return 12;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzld
    public final byte[] zzc() {
        return zzlt.zzk;
    }
}
