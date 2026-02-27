package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzif;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzwe implements zzbg {
    private static final zzif.zza zza = zzif.zza.zzb;
    private final zzht zzb;
    private final byte[] zzc;

    public zzwe(byte[] bArr) throws GeneralSecurityException {
        this(bArr, zzxt.zza(new byte[0]));
    }

    private zzwe(byte[] bArr, zzxt zzxtVar) throws GeneralSecurityException {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zzb = new zzht(bArr, true);
        this.zzc = zzxtVar.zzb();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzbg
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzc;
        if (bArr3.length == 0) {
            return this.zzb.zza(Arrays.copyOf(bArr, 12), bArr, bArr2);
        }
        if (!zzpf.zza(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, this.zzc.length, bArr.length);
        return this.zzb.zza(Arrays.copyOf(bArrCopyOfRange, 12), bArrCopyOfRange, bArr2);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzbg
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrZza = zzou.zza(12);
        byte[] bArr3 = this.zzc;
        return bArr3.length == 0 ? this.zzb.zzb(bArrZza, bArr, bArr2) : zzwg.zza(bArr3, this.zzb.zzb(bArrZza, bArr, bArr2));
    }
}
