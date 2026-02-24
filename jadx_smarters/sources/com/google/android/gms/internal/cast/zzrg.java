package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
final class zzrg extends zzrj {
    private final int zzc;

    public zzrg(byte[] bArr, int i9, int i10) {
        super(bArr);
        zzrm.zzj(0, i10, bArr.length);
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.cast.zzrj, com.google.android.gms.internal.cast.zzrm
    public final byte zza(int i9) {
        int i10 = this.zzc;
        if (((i10 - (i9 + 1)) | i9) >= 0) {
            return this.zza[i9];
        }
        if (i9 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i9);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i9 + ", " + i10);
    }

    @Override // com.google.android.gms.internal.cast.zzrj, com.google.android.gms.internal.cast.zzrm
    public final byte zzb(int i9) {
        return this.zza[i9];
    }

    @Override // com.google.android.gms.internal.cast.zzrj
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.cast.zzrj, com.google.android.gms.internal.cast.zzrm
    public final int zzd() {
        return this.zzc;
    }
}
