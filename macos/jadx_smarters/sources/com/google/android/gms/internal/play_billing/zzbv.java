package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zzbv extends zzby {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    public zzbv(byte[] bArr, int i9, int i10) {
        super(null);
        int length = bArr.length;
        if (((length - i10) | i10) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i10)));
        }
        this.zzb = bArr;
        this.zzd = 0;
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final int zza() {
        return this.zzc - this.zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzb(byte b9) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i9 = this.zzd;
            this.zzd = i9 + 1;
            bArr[i9] = b9;
        } catch (IndexOutOfBoundsException e9) {
            throw new zzbw(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e9);
        }
    }

    public final void zzc(byte[] bArr, int i9, int i10) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.zzb, this.zzd, i10);
            this.zzd += i10;
        } catch (IndexOutOfBoundsException e9) {
            throw new zzbw(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i10)), e9);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzd(int i9, boolean z9) throws IOException {
        zzq(i9 << 3);
        zzb(z9 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zze(int i9, zzbq zzbqVar) throws IOException {
        zzq((i9 << 3) | 2);
        zzq(zzbqVar.zzd());
        zzbqVar.zzh(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzf(int i9, int i10) throws IOException {
        zzq((i9 << 3) | 5);
        zzg(i10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzg(int i9) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i10 = this.zzd;
            bArr[i10] = (byte) (i9 & 255);
            bArr[i10 + 1] = (byte) ((i9 >> 8) & 255);
            bArr[i10 + 2] = (byte) ((i9 >> 16) & 255);
            this.zzd = i10 + 4;
            bArr[i10 + 3] = (byte) ((i9 >> 24) & 255);
        } catch (IndexOutOfBoundsException e9) {
            throw new zzbw(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e9);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzh(int i9, long j9) throws IOException {
        zzq((i9 << 3) | 1);
        zzi(j9);
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzi(long j9) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i9 = this.zzd;
            bArr[i9] = (byte) (((int) j9) & 255);
            bArr[i9 + 1] = (byte) (((int) (j9 >> 8)) & 255);
            bArr[i9 + 2] = (byte) (((int) (j9 >> 16)) & 255);
            bArr[i9 + 3] = (byte) (((int) (j9 >> 24)) & 255);
            bArr[i9 + 4] = (byte) (((int) (j9 >> 32)) & 255);
            bArr[i9 + 5] = (byte) (((int) (j9 >> 40)) & 255);
            bArr[i9 + 6] = (byte) (((int) (j9 >> 48)) & 255);
            this.zzd = i9 + 8;
            bArr[i9 + 7] = (byte) (((int) (j9 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e9) {
            throw new zzbw(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e9);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzj(int i9, int i10) throws IOException {
        zzq(i9 << 3);
        zzk(i10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzk(int i9) throws IOException {
        if (i9 >= 0) {
            zzq(i9);
        } else {
            zzs(i9);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzl(byte[] bArr, int i9, int i10) throws IOException {
        zzc(bArr, 0, i10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzm(int i9, String str) throws IOException {
        zzq((i9 << 3) | 2);
        zzn(str);
    }

    public final void zzn(String str) throws IOException {
        int i9 = this.zzd;
        try {
            int iZzw = zzby.zzw(str.length() * 3);
            int iZzw2 = zzby.zzw(str.length());
            if (iZzw2 != iZzw) {
                zzq(zzfu.zzc(str));
                byte[] bArr = this.zzb;
                int i10 = this.zzd;
                this.zzd = zzfu.zzb(str, bArr, i10, this.zzc - i10);
                return;
            }
            int i11 = i9 + iZzw2;
            this.zzd = i11;
            int iZzb = zzfu.zzb(str, this.zzb, i11, this.zzc - i11);
            this.zzd = i9;
            zzq((iZzb - i9) - iZzw2);
            this.zzd = iZzb;
        } catch (zzft e9) {
            this.zzd = i9;
            zzA(str, e9);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzbw(e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzo(int i9, int i10) throws IOException {
        zzq((i9 << 3) | i10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzp(int i9, int i10) throws IOException {
        zzq(i9 << 3);
        zzq(i10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzq(int i9) throws IOException {
        while ((i9 & (-128)) != 0) {
            try {
                byte[] bArr = this.zzb;
                int i10 = this.zzd;
                this.zzd = i10 + 1;
                bArr[i10] = (byte) ((i9 | 128) & 255);
                i9 >>>= 7;
            } catch (IndexOutOfBoundsException e9) {
                throw new zzbw(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e9);
            }
        }
        byte[] bArr2 = this.zzb;
        int i11 = this.zzd;
        this.zzd = i11 + 1;
        bArr2[i11] = (byte) i9;
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzr(int i9, long j9) throws IOException {
        zzq(i9 << 3);
        zzs(j9);
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzs(long j9) throws IOException {
        if (!zzby.zzc || this.zzc - this.zzd < 10) {
            while ((j9 & (-128)) != 0) {
                try {
                    byte[] bArr = this.zzb;
                    int i9 = this.zzd;
                    this.zzd = i9 + 1;
                    bArr[i9] = (byte) ((((int) j9) | 128) & 255);
                    j9 >>>= 7;
                } catch (IndexOutOfBoundsException e9) {
                    throw new zzbw(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e9);
                }
            }
            byte[] bArr2 = this.zzb;
            int i10 = this.zzd;
            this.zzd = i10 + 1;
            bArr2[i10] = (byte) j9;
            return;
        }
        while (true) {
            int i11 = (int) j9;
            if ((j9 & (-128)) == 0) {
                byte[] bArr3 = this.zzb;
                int i12 = this.zzd;
                this.zzd = 1 + i12;
                zzfp.zzn(bArr3, i12, (byte) i11);
                return;
            }
            byte[] bArr4 = this.zzb;
            int i13 = this.zzd;
            this.zzd = i13 + 1;
            zzfp.zzn(bArr4, i13, (byte) ((i11 | 128) & 255));
            j9 >>>= 7;
        }
    }
}
