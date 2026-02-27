package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
final class zztz implements zztm {
    private final zztp zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zztz(zztp zztpVar, String str, Object[] objArr) {
        this.zza = zztpVar;
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

    @Override // com.google.android.gms.internal.cast.zztm
    public final zztp zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.cast.zztm
    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.gms.internal.cast.zztm
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
