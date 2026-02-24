package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
class zzew extends zzev {
    protected final byte[] zza;

    public zzew(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.recaptcha.internal.zzez
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzez) || zzd() != ((zzez) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzew)) {
            return obj.equals(this);
        }
        zzew zzewVar = (zzew) obj;
        int iZzl = zzl();
        int iZzl2 = zzewVar.zzl();
        if (iZzl != 0 && iZzl2 != 0 && iZzl != iZzl2) {
            return false;
        }
        int iZzd = zzd();
        if (iZzd > zzewVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + iZzd + zzd());
        }
        if (iZzd > zzewVar.zzd()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + iZzd + ", " + zzewVar.zzd());
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzewVar.zza;
        zzewVar.zzc();
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

    @Override // com.google.android.recaptcha.internal.zzez
    public byte zza(int i9) {
        return this.zza[i9];
    }

    @Override // com.google.android.recaptcha.internal.zzez
    public byte zzb(int i9) {
        return this.zza[i9];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.recaptcha.internal.zzez
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.recaptcha.internal.zzez
    public void zze(byte[] bArr, int i9, int i10, int i11) {
        System.arraycopy(this.zza, 0, bArr, 0, i11);
    }

    @Override // com.google.android.recaptcha.internal.zzez
    public final int zzf(int i9, int i10, int i11) {
        return zzgw.zzb(i9, this.zza, 0, i11);
    }

    @Override // com.google.android.recaptcha.internal.zzez
    public final zzez zzg(int i9, int i10) {
        int iZzk = zzez.zzk(0, i10, zzd());
        return iZzk == 0 ? zzez.zzb : new zzet(this.zza, 0, iZzk);
    }

    @Override // com.google.android.recaptcha.internal.zzez
    public final String zzh(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.recaptcha.internal.zzez
    public final void zzi(zzep zzepVar) throws IOException {
        ((zzfh) zzepVar).zzc(this.zza, 0, zzd());
    }

    @Override // com.google.android.recaptcha.internal.zzez
    public final boolean zzj() {
        return zzju.zzf(this.zza, 0, zzd());
    }
}
