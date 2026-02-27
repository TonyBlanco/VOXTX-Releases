package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class zzlf implements zzbo {
    private static final byte[] zza = new byte[0];
    private final zzll zzb;
    private final zzlj zzc;
    private final zzlg zzd;
    private final zzld zze;
    private final int zzf;

    private zzlf(zzll zzllVar, zzlj zzljVar, zzlg zzlgVar, zzld zzldVar, int i9) {
        this.zzb = zzllVar;
        this.zzc = zzljVar;
        this.zzd = zzlgVar;
        this.zze = zzldVar;
        this.zzf = i9;
    }

    public static zzlf zza(zzuu zzuuVar) throws GeneralSecurityException {
        int i9;
        zzll zzllVarZza;
        if (!zzuuVar.zzf()) {
            throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
        }
        if (!zzuuVar.zzd().zzg()) {
            throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
        }
        if (zzuuVar.zze().zze()) {
            throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
        }
        zzur zzurVarZzb = zzuuVar.zzd().zzb();
        zzlj zzljVarZzc = zzlk.zzc(zzurVarZzb);
        zzlg zzlgVarZzb = zzlk.zzb(zzurVarZzb);
        zzld zzldVarZza = zzlk.zza(zzurVarZzb);
        zzuo zzuoVarZzc = zzurVarZzb.zzc();
        int i10 = zzle.zza[zzuoVarZzc.ordinal()];
        if (i10 == 1) {
            i9 = 32;
        } else if (i10 == 2) {
            i9 = 65;
        } else if (i10 == 3) {
            i9 = 97;
        } else {
            if (i10 != 4) {
                throw new IllegalArgumentException("Unable to determine KEM-encoding length for " + zzuoVarZzc.name());
            }
            i9 = 133;
        }
        int i11 = zzli.zza[zzuuVar.zzd().zzb().zzc().ordinal()];
        if (i11 == 1) {
            zzllVarZza = zzlz.zza(zzuuVar.zze().zzg());
        } else {
            if (i11 != 2 && i11 != 3 && i11 != 4) {
                throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
            }
            zzllVarZza = zzlx.zza(zzuuVar.zze().zzg(), zzuuVar.zzd().zzf().zzg(), zzlt.zzc(zzuuVar.zzd().zzb().zzc()));
        }
        return new zzlf(zzllVarZza, zzljVarZzc, zzlgVarZzb, zzldVarZza, i9);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzbo
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i9 = this.zzf;
        if (length < i9) {
            throw new GeneralSecurityException("Ciphertext is too short.");
        }
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = bArr2;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i9);
        return zzlc.zza(bArrCopyOf, this.zzb, this.zzc, this.zzd, this.zze, bArr3).zza(Arrays.copyOfRange(bArr, this.zzf, bArr.length), zza);
    }
}
