package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zzet extends zzew {
    private final int zzc;

    public zzet(byte[] bArr, int i9, int i10) {
        super(bArr);
        zzez.zzk(0, i10, bArr.length);
        this.zzc = i10;
    }

    @Override // com.google.android.recaptcha.internal.zzew, com.google.android.recaptcha.internal.zzez
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

    @Override // com.google.android.recaptcha.internal.zzew, com.google.android.recaptcha.internal.zzez
    public final byte zzb(int i9) {
        return this.zza[i9];
    }

    @Override // com.google.android.recaptcha.internal.zzew
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.recaptcha.internal.zzew, com.google.android.recaptcha.internal.zzez
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzew, com.google.android.recaptcha.internal.zzez
    public final void zze(byte[] bArr, int i9, int i10, int i11) {
        System.arraycopy(this.zza, 0, bArr, 0, i11);
    }
}
