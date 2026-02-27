package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
final class zzen implements zzdz {
    private final zzec zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzen(zzec zzecVar, String str, Object[] objArr) {
        this.zza = zzecVar;
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

    @Override // com.google.android.gms.internal.play_billing.zzdz
    public final zzec zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdz
    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdz
    public final int zzc() {
        int i9 = this.zzd;
        if ((i9 & 1) != 0) {
            return 1;
        }
        return (i9 & 4) == 4 ? 3 : 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}
