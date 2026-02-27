package com.google.android.gms.internal.p001firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzrl implements zzce {
    private static final byte[] zza = {0};
    private final zzce zzb;
    private final zzvs zzc;
    private final byte[] zzd;

    private zzrl(zzce zzceVar, zzvs zzvsVar, byte[] bArr) {
        this.zzb = zzceVar;
        this.zzc = zzvsVar;
        this.zzd = bArr;
    }

    public static zzce zza(zznd zzndVar) throws GeneralSecurityException {
        byte[] bArrArray;
        ByteBuffer byteBufferPut;
        zzos zzosVarZza = zzndVar.zza(zzbq.zza());
        zzce zzceVar = (zzce) zzow.zza().zza((zzuy) ((zzajc) zzuy.zza().zza(zzosVarZza.zzf()).zza(zzosVarZza.zzd()).zza(zzosVarZza.zza()).zzf()), zzce.class);
        zzvs zzvsVarZzc = zzosVarZza.zzc();
        int i9 = zzrk.zza[zzvsVarZzc.ordinal()];
        if (i9 != 1) {
            if (i9 == 2 || i9 == 3) {
                byteBufferPut = ByteBuffer.allocate(5).put((byte) 0);
            } else {
                if (i9 != 4) {
                    throw new GeneralSecurityException("unknown output prefix type");
                }
                byteBufferPut = ByteBuffer.allocate(5).put((byte) 1);
            }
            bArrArray = byteBufferPut.putInt(zzndVar.zza().intValue()).array();
        } else {
            bArrArray = new byte[0];
        }
        return new zzrl(zzceVar, zzvsVarZzc, bArrArray);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzce
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 10) {
            throw new GeneralSecurityException("tag too short");
        }
        if (this.zzc.equals(zzvs.LEGACY)) {
            bArr2 = zzwg.zza(bArr2, zza);
        }
        byte[] bArr3 = new byte[0];
        if (!this.zzc.equals(zzvs.RAW)) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            bArr = Arrays.copyOfRange(bArr, 5, bArr.length);
            bArr3 = bArrCopyOf;
        }
        if (!Arrays.equals(this.zzd, bArr3)) {
            throw new GeneralSecurityException("wrong prefix");
        }
        this.zzb.zza(bArr, bArr2);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzce
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        if (this.zzc.equals(zzvs.LEGACY)) {
            bArr = zzwg.zza(bArr, zza);
        }
        return zzwg.zza(this.zzd, this.zzb.zza(bArr));
    }
}
