package com.google.android.gms.internal.p001firebaseauthapi;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgh implements zzbg {
    private static final byte[] zza = new byte[0];
    private static final Set<String> zzb;
    private final zzvb zzc;
    private final zzbg zzd;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = Collections.unmodifiableSet(hashSet);
    }

    @Deprecated
    public zzgh(zzvb zzvbVar, zzbg zzbgVar) {
        if (zza(zzvbVar.zzf())) {
            this.zzc = zzvbVar;
            this.zzd = zzbgVar;
        } else {
            throw new IllegalArgumentException("Unsupported DEK key type: " + zzvbVar.zzf() + ". Only Tink AEAD key types are supported.");
        }
    }

    public static boolean zza(String str) {
        return zzb.contains(str);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzbg
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i9 = byteBufferWrap.getInt();
            if (i9 <= 0 || i9 > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i9];
            byteBufferWrap.get(bArr3, 0, i9);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            return ((zzbg) zzct.zza(this.zzc.zzf(), this.zzd.zza(bArr3, zza), zzbg.class)).zza(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e9) {
            e = e9;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e10) {
            e = e10;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e11) {
            e = e11;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzbg
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrZzg = zzct.zza(this.zzc).zze().zzg();
        byte[] bArrZzb = this.zzd.zzb(bArrZzg, zza);
        byte[] bArrZzb2 = ((zzbg) zzct.zza(this.zzc.zzf(), bArrZzg, zzbg.class)).zzb(bArr, bArr2);
        return ByteBuffer.allocate(bArrZzb.length + 4 + bArrZzb2.length).putInt(bArrZzb.length).put(bArrZzb).put(bArrZzb2).array();
    }
}
