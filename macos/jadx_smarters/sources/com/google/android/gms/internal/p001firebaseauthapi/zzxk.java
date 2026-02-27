package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzif;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes3.dex */
public final class zzxk implements zzrx {
    private static final zzif.zza zza = zzif.zza.zzb;
    private final ThreadLocal<Mac> zzb;
    private final String zzc;
    private final Key zzd;
    private final int zze;

    public zzxk(String str, Key key) throws GeneralSecurityException {
        int i9;
        zzxn zzxnVar = new zzxn(this);
        this.zzb = zzxnVar;
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zzc = str;
        this.zzd = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        str.hashCode();
        switch (str) {
            case "HMACSHA1":
                i9 = 20;
                break;
            case "HMACSHA224":
                i9 = 28;
                break;
            case "HMACSHA256":
                i9 = 32;
                break;
            case "HMACSHA384":
                i9 = 48;
                break;
            case "HMACSHA512":
                i9 = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + str);
        }
        this.zze = i9;
        zzxnVar.get();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzrx
    public final byte[] zza(byte[] bArr, int i9) throws GeneralSecurityException {
        if (i9 > this.zze) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        this.zzb.get().update(bArr);
        return Arrays.copyOf(this.zzb.get().doFinal(), i9);
    }
}
