package com.google.android.gms.internal.p001firebaseauthapi;

/* JADX INFO: loaded from: classes3.dex */
final class zzaht extends zzahz {
    private final int zzc;
    private final int zzd;

    public zzaht(byte[] bArr, int i9, int i10) {
        super(bArr);
        zzahp.zza(i9, i9 + i10, bArr.length);
        this.zzc = i9;
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahz, com.google.android.gms.internal.p001firebaseauthapi.zzahp
    public final byte zza(int i9) {
        int iZzb = zzb();
        if (((iZzb - (i9 + 1)) | i9) >= 0) {
            return this.zzb[this.zzc + i9];
        }
        if (i9 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i9);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i9 + ", " + iZzb);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahz, com.google.android.gms.internal.p001firebaseauthapi.zzahp
    public final void zza(byte[] bArr, int i9, int i10, int i11) {
        System.arraycopy(this.zzb, zzh(), bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahz, com.google.android.gms.internal.p001firebaseauthapi.zzahp
    public final byte zzb(int i9) {
        return this.zzb[this.zzc + i9];
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahz, com.google.android.gms.internal.p001firebaseauthapi.zzahp
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahz
    public final int zzh() {
        return this.zzc;
    }
}
