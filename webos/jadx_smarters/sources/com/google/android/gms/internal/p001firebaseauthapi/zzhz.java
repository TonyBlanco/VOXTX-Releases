package com.google.android.gms.internal.p001firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhz extends zzhy {
    public zzhz(byte[] bArr, int i9) throws InvalidKeyException {
        super(bArr, i9);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzhy
    public final int zza() {
        return 24;
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
        if (iArr.length != 6) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length << 5)));
        }
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        zzhu.zza(iArr3, this.zza);
        iArr3[12] = iArr[0];
        iArr3[13] = iArr[1];
        iArr3[14] = iArr[2];
        iArr3[15] = iArr[3];
        zzhu.zza(iArr3);
        iArr3[4] = iArr3[12];
        iArr3[5] = iArr3[13];
        iArr3[6] = iArr3[14];
        iArr3[7] = iArr3[15];
        zzhu.zza(iArr2, Arrays.copyOf(iArr3, 8));
        iArr2[12] = i9;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }
}
