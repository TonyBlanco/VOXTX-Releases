package com.google.android.gms.internal.p001firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzhy {
    int[] zza;
    private final int zzb;

    public zzhy(byte[] bArr, int i9) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zza = zzhu.zza(bArr);
        this.zzb = i9;
    }

    private final void zza(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length != zza()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + zza());
        }
        int iRemaining = byteBuffer2.remaining();
        int i9 = iRemaining / 64;
        int i10 = i9 + 1;
        for (int i11 = 0; i11 < i10; i11++) {
            ByteBuffer byteBufferZza = zza(bArr, this.zzb + i11);
            int i12 = 64;
            if (i11 == i9) {
                i12 = iRemaining % 64;
            }
            zzwg.zza(byteBuffer, byteBuffer2, byteBufferZza, i12);
        }
    }

    public abstract int zza();

    public final ByteBuffer zza(byte[] bArr, int i9) {
        int[] iArrZza = zza(zzhu.zza(bArr), i9);
        int[] iArr = (int[]) iArrZza.clone();
        zzhu.zza(iArr);
        for (int i10 = 0; i10 < iArrZza.length; i10++) {
            iArrZza[i10] = iArrZza[i10] + iArr[i10];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrZza, 0, 16);
        return byteBufferOrder;
    }

    public void zza(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        zza(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
    }

    public byte[] zza(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        zza(bArr, byteBufferAllocate, byteBuffer);
        return byteBufferAllocate.array();
    }

    public abstract int[] zza(int[] iArr, int i9);
}
