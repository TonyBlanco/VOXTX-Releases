package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
class zzjx extends zzjw {
    protected final byte[] zza;

    public zzjx(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzka) || zzd() != ((zzka) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzjx)) {
            return obj.equals(this);
        }
        zzjx zzjxVar = (zzjx) obj;
        int iZzk = zzk();
        int iZzk2 = zzjxVar.zzk();
        if (iZzk != 0 && iZzk2 != 0 && iZzk != iZzk2) {
            return false;
        }
        int iZzd = zzd();
        if (iZzd > zzjxVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + iZzd + zzd());
        }
        if (iZzd > zzjxVar.zzd()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + iZzd + ", " + zzjxVar.zzd());
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzjxVar.zza;
        zzjxVar.zzc();
        int i9 = 0;
        int i10 = 0;
        while (i9 < iZzd) {
            if (bArr[i9] != bArr2[i10]) {
                return false;
            }
            i9++;
            i10++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public byte zza(int i9) {
        return this.zza[i9];
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public byte zzb(int i9) {
        return this.zza[i9];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final int zze(int i9, int i10, int i11) {
        return zzlj.zzb(i9, this.zza, 0, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final zzka zzf(int i9, int i10) {
        int iZzj = zzka.zzj(0, i10, zzd());
        return iZzj == 0 ? zzka.zzb : new zzju(this.zza, 0, iZzj);
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final void zzh(zzjq zzjqVar) throws IOException {
        ((zzkf) zzjqVar).zzc(this.zza, 0, zzd());
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final boolean zzi() {
        return zznz.zze(this.zza, 0, zzd());
    }
}
