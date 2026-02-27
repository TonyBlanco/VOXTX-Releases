package com.google.android.gms.internal.cast;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
class zzrj extends zzri {
    protected final byte[] zza;

    public zzrj(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.cast.zzrm
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzrm) || zzd() != ((zzrm) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzrj)) {
            return obj.equals(this);
        }
        zzrj zzrjVar = (zzrj) obj;
        int iZzk = zzk();
        int iZzk2 = zzrjVar.zzk();
        if (iZzk != 0 && iZzk2 != 0 && iZzk != iZzk2) {
            return false;
        }
        int iZzd = zzd();
        if (iZzd > zzrjVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + iZzd + zzd());
        }
        if (iZzd > zzrjVar.zzd()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + iZzd + ", " + zzrjVar.zzd());
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzrjVar.zza;
        zzrjVar.zzc();
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

    @Override // com.google.android.gms.internal.cast.zzrm
    public byte zza(int i9) {
        return this.zza[i9];
    }

    @Override // com.google.android.gms.internal.cast.zzrm
    public byte zzb(int i9) {
        return this.zza[i9];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.cast.zzrm
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.cast.zzrm
    public final int zze(int i9, int i10, int i11) {
        return zzsq.zzb(i9, this.zza, 0, i11);
    }

    @Override // com.google.android.gms.internal.cast.zzrm
    public final zzrm zzf(int i9, int i10) {
        zzrm.zzj(0, i10, zzd());
        return i10 == 0 ? zzrm.zzb : new zzrg(this.zza, 0, i10);
    }

    @Override // com.google.android.gms.internal.cast.zzrm
    public final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.gms.internal.cast.zzrm
    public final void zzh(zzrc zzrcVar) throws IOException {
        ((zzrr) zzrcVar).zzc(this.zza, 0, zzd());
    }

    @Override // com.google.android.gms.internal.cast.zzrm
    public final boolean zzi() {
        return zzvf.zze(this.zza, 0, zzd());
    }
}
