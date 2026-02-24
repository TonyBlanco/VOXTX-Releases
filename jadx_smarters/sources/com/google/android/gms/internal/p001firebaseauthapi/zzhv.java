package com.google.android.gms.internal.p001firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhv extends zzhy {
    public zzhv(byte[] bArr, int i9) throws InvalidKeyException {
        super(bArr, i9);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzhy
    public final int zza() {
        return 12;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzhy
    public final /* bridge */ /* synthetic */ void zza(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        super.zza(byteBuffer, bArr, bArr2);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzhy
    public final /* bridge */ /* synthetic */ byte[] zza(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        return super.zza(bArr, byteBuffer);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzhy
    public final int[] zza(int[] iArr, int i9) {
        if (iArr.length != 3) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length << 5)));
        }
        int[] iArr2 = new int[16];
        zzhu.zza(iArr2, this.zza);
        iArr2[12] = i9;
        System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
        return iArr2;
    }
}
