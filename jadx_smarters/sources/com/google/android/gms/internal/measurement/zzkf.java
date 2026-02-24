package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zzkf extends zzki {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    public zzkf(byte[] bArr, int i9, int i10) {
        super(null);
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int length = bArr.length;
        if (((length - i10) | i10) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i10)));
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final int zza() {
        return this.zzd - this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzb(byte b9) throws IOException {
        try {
            byte[] bArr = this.zzc;
            int i9 = this.zze;
            this.zze = i9 + 1;
            bArr[i9] = b9;
        } catch (IndexOutOfBoundsException e9) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e9);
        }
    }

    public final void zzc(byte[] bArr, int i9, int i10) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.zzc, this.zze, i10);
            this.zze += i10;
        } catch (IndexOutOfBoundsException e9) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), Integer.valueOf(i10)), e9);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzd(int i9, boolean z9) throws IOException {
        zzq(i9 << 3);
        zzb(z9 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zze(int i9, zzka zzkaVar) throws IOException {
        zzq((i9 << 3) | 2);
        zzq(zzkaVar.zzd());
        zzkaVar.zzh(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzf(int i9, int i10) throws IOException {
        zzq((i9 << 3) | 5);
        zzg(i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzg(int i9) throws IOException {
        try {
            byte[] bArr = this.zzc;
            int i10 = this.zze;
            bArr[i10] = (byte) (i9 & 255);
            bArr[i10 + 1] = (byte) ((i9 >> 8) & 255);
            bArr[i10 + 2] = (byte) ((i9 >> 16) & 255);
            this.zze = i10 + 4;
            bArr[i10 + 3] = (byte) ((i9 >> 24) & 255);
        } catch (IndexOutOfBoundsException e9) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e9);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzh(int i9, long j9) throws IOException {
        zzq((i9 << 3) | 1);
        zzi(j9);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzi(long j9) throws IOException {
        try {
            byte[] bArr = this.zzc;
            int i9 = this.zze;
            bArr[i9] = (byte) (((int) j9) & 255);
            bArr[i9 + 1] = (byte) (((int) (j9 >> 8)) & 255);
            bArr[i9 + 2] = (byte) (((int) (j9 >> 16)) & 255);
            bArr[i9 + 3] = (byte) (((int) (j9 >> 24)) & 255);
            bArr[i9 + 4] = (byte) (((int) (j9 >> 32)) & 255);
            bArr[i9 + 5] = (byte) (((int) (j9 >> 40)) & 255);
            bArr[i9 + 6] = (byte) (((int) (j9 >> 48)) & 255);
            this.zze = i9 + 8;
            bArr[i9 + 7] = (byte) (((int) (j9 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e9) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e9);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzj(int i9, int i10) throws IOException {
        zzq(i9 << 3);
        zzk(i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzk(int i9) throws IOException {
        if (i9 >= 0) {
            zzq(i9);
        } else {
            zzs(i9);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzl(byte[] bArr, int i9, int i10) throws IOException {
        zzc(bArr, 0, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzm(int i9, String str) throws IOException {
        zzq((i9 << 3) | 2);
        zzn(str);
    }

    public final void zzn(String str) throws IOException {
        int i9 = this.zze;
        try {
            int iZzx = zzki.zzx(str.length() * 3);
            int iZzx2 = zzki.zzx(str.length());
            if (iZzx2 != iZzx) {
                zzq(zznz.zzc(str));
                byte[] bArr = this.zzc;
                int i10 = this.zze;
                this.zze = zznz.zzb(str, bArr, i10, this.zzd - i10);
                return;
            }
            int i11 = i9 + iZzx2;
            this.zze = i11;
            int iZzb = zznz.zzb(str, this.zzc, i11, this.zzd - i11);
            this.zze = i9;
            zzq((iZzb - i9) - iZzx2);
            this.zze = iZzb;
        } catch (zzny e9) {
            this.zze = i9;
            zzB(str, e9);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzkg(e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzo(int i9, int i10) throws IOException {
        zzq((i9 << 3) | i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzp(int i9, int i10) throws IOException {
        zzq(i9 << 3);
        zzq(i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzq(int i9) throws IOException {
        while ((i9 & (-128)) != 0) {
            try {
                byte[] bArr = this.zzc;
                int i10 = this.zze;
                this.zze = i10 + 1;
                bArr[i10] = (byte) ((i9 & 127) | 128);
                i9 >>>= 7;
            } catch (IndexOutOfBoundsException e9) {
                throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e9);
            }
        }
        byte[] bArr2 = this.zzc;
        int i11 = this.zze;
        this.zze = i11 + 1;
        bArr2[i11] = (byte) i9;
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzr(int i9, long j9) throws IOException {
        zzq(i9 << 3);
        zzs(j9);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzs(long j9) throws IOException {
        if (zzki.zzd && this.zzd - this.zze >= 10) {
            while ((j9 & (-128)) != 0) {
                byte[] bArr = this.zzc;
                int i9 = this.zze;
                this.zze = i9 + 1;
                zznu.zzn(bArr, i9, (byte) ((((int) j9) & 127) | 128));
                j9 >>>= 7;
            }
            byte[] bArr2 = this.zzc;
            int i10 = this.zze;
            this.zze = 1 + i10;
            zznu.zzn(bArr2, i10, (byte) j9);
            return;
        }
        while ((j9 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.zzc;
                int i11 = this.zze;
                this.zze = i11 + 1;
                bArr3[i11] = (byte) ((((int) j9) & 127) | 128);
                j9 >>>= 7;
            } catch (IndexOutOfBoundsException e9) {
                throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e9);
            }
        }
        byte[] bArr4 = this.zzc;
        int i12 = this.zze;
        this.zze = i12 + 1;
        bArr4[i12] = (byte) j9;
    }
}
