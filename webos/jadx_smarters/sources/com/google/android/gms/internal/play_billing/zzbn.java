package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
class zzbn extends zzbm {
    protected final byte[] zza;

    public zzbn(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzbq) || zzd() != ((zzbq) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzbn)) {
            return obj.equals(this);
        }
        zzbn zzbnVar = (zzbn) obj;
        int iZzk = zzk();
        int iZzk2 = zzbnVar.zzk();
        if (iZzk != 0 && iZzk2 != 0 && iZzk != iZzk2) {
            return false;
        }
        int iZzd = zzd();
        if (iZzd > zzbnVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + iZzd + zzd());
        }
        if (iZzd > zzbnVar.zzd()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + iZzd + ", " + zzbnVar.zzd());
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzbnVar.zza;
        zzbnVar.zzc();
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

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public byte zza(int i9) {
        return this.zza[i9];
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public byte zzb(int i9) {
        return this.zza[i9];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final int zze(int i9, int i10, int i11) {
        return zzda.zzb(i9, this.zza, 0, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final zzbq zzf(int i9, int i10) {
        int iZzj = zzbq.zzj(0, i10, zzd());
        return iZzj == 0 ? zzbq.zzb : new zzbj(this.zza, 0, iZzj);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final void zzh(zzbf zzbfVar) throws IOException {
        ((zzbv) zzbfVar).zzc(this.zza, 0, zzd());
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final boolean zzi() {
        return zzfu.zze(this.zza, 0, zzd());
    }
}
