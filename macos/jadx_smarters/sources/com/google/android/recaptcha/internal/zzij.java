package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zzij implements zzhv {
    private final zzhy zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzij(zzhy zzhyVar, String str, Object[] objArr) {
        this.zza = zzhyVar;
        this.zzb = str;
        this.zzc = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.zzd = cCharAt;
            return;
        }
        int i9 = cCharAt & 8191;
        int i10 = 1;
        int i11 = 13;
        while (true) {
            int i12 = i10 + 1;
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 < 55296) {
                this.zzd = i9 | (cCharAt2 << i11);
                return;
            } else {
                i9 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i10 = i12;
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzhv
    public final zzhy zza() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzhv
    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.recaptcha.internal.zzhv
    public final int zzc() {
        return (this.zzd & 1) == 1 ? 1 : 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}
