package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
final class zzla implements zzlg {
    private final String zza;

    public zzla(String str) {
        this.zza = str;
    }

    private final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Mac macZza = zzwt.zzb.zza(this.zza);
        if (bArr2 == null || bArr2.length == 0) {
            macZza.init(new SecretKeySpec(new byte[macZza.getMacLength()], this.zza));
        } else {
            macZza.init(new SecretKeySpec(bArr2, this.zza));
        }
        return macZza.doFinal(bArr);
    }

    private final byte[] zza(byte[] bArr, byte[] bArr2, int i9) throws GeneralSecurityException {
        Mac macZza = zzwt.zzb.zza(this.zza);
        if (i9 > macZza.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        byte[] bArr3 = new byte[i9];
        macZza.init(new SecretKeySpec(bArr, this.zza));
        byte[] bArrDoFinal = new byte[0];
        int i10 = 1;
        int length = 0;
        while (true) {
            macZza.update(bArrDoFinal);
            macZza.update(bArr2);
            macZza.update((byte) i10);
            bArrDoFinal = macZza.doFinal();
            if (bArrDoFinal.length + length >= i9) {
                System.arraycopy(bArrDoFinal, 0, bArr3, length, i9 - length);
                return bArr3;
            }
            System.arraycopy(bArrDoFinal, 0, bArr3, length, bArrDoFinal.length);
            length += bArrDoFinal.length;
            i10++;
        }
    }

    public final int zza() throws GeneralSecurityException {
        return Mac.getInstance(this.zza).getMacLength();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzlg
    public final byte[] zza(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) throws GeneralSecurityException {
        return zza(zzlt.zza(str, bArr2, bArr3), bArr);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzlg
    public final byte[] zza(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, int i9) throws GeneralSecurityException {
        return zza(bArr, zzlt.zza(str, bArr2, bArr3, i9), i9);
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, String str2, byte[] bArr4, int i9) throws GeneralSecurityException {
        return zza(zza(zzlt.zza(str, bArr2, bArr4), null), zzlt.zza(str2, bArr3, bArr4, i9), i9);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzlg
    public final byte[] zzb() throws GeneralSecurityException {
        String str = this.zza;
        str.hashCode();
        switch (str) {
            case "HmacSha256":
                return zzlt.zzf;
            case "HmacSha384":
                return zzlt.zzg;
            case "HmacSha512":
                return zzlt.zzh;
            default:
                throw new GeneralSecurityException("Could not determine HPKE KDF ID");
        }
    }
}
