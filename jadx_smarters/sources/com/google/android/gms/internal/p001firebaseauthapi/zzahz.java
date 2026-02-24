package com.google.android.gms.internal.p001firebaseauthapi;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
class zzahz extends zzahw {
    protected final byte[] zzb;

    public zzahz(byte[] bArr) {
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahp
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzahp) || zzb() != ((zzahp) obj).zzb()) {
            return false;
        }
        if (zzb() == 0) {
            return true;
        }
        if (!(obj instanceof zzahz)) {
            return obj.equals(this);
        }
        zzahz zzahzVar = (zzahz) obj;
        int iZza = zza();
        int iZza2 = zzahzVar.zza();
        if (iZza == 0 || iZza2 == 0 || iZza == iZza2) {
            return zza(zzahzVar, 0, zzb());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahp
    public byte zza(int i9) {
        return this.zzb[i9];
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahp
    public final zzahp zza(int i9, int i10) {
        int iZza = zzahp.zza(0, i10, zzb());
        return iZza == 0 ? zzahp.zza : new zzaht(this.zzb, zzh(), iZza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahp
    public final String zza(Charset charset) {
        return new String(this.zzb, zzh(), zzb(), charset);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahp
    public final void zza(zzahm zzahmVar) throws IOException {
        zzahmVar.zza(this.zzb, zzh(), zzb());
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahp
    public void zza(byte[] bArr, int i9, int i10, int i11) {
        System.arraycopy(this.zzb, 0, bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahw
    public final boolean zza(zzahp zzahpVar, int i9, int i10) {
        if (i10 > zzahpVar.zzb()) {
            throw new IllegalArgumentException("Length too large: " + i10 + zzb());
        }
        if (i10 > zzahpVar.zzb()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + i10 + ", " + zzahpVar.zzb());
        }
        if (!(zzahpVar instanceof zzahz)) {
            return zzahpVar.zza(0, i10).equals(zza(0, i10));
        }
        zzahz zzahzVar = (zzahz) zzahpVar;
        byte[] bArr = this.zzb;
        byte[] bArr2 = zzahzVar.zzb;
        int iZzh = zzh() + i10;
        int iZzh2 = zzh();
        int iZzh3 = zzahzVar.zzh();
        while (iZzh2 < iZzh) {
            if (bArr[iZzh2] != bArr2[iZzh3]) {
                return false;
            }
            iZzh2++;
            iZzh3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahp
    public byte zzb(int i9) {
        return this.zzb[i9];
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahp
    public int zzb() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahp
    public final int zzb(int i9, int i10, int i11) {
        return zzajf.zza(i9, this.zzb, zzh(), i11);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahp
    public final zzaia zzc() {
        return zzaia.zza(this.zzb, zzh(), zzb(), true);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahp
    public final boolean zzf() {
        int iZzh = zzh();
        return zzaml.zzc(this.zzb, iZzh, zzb() + iZzh);
    }

    public int zzh() {
        return 0;
    }
}
