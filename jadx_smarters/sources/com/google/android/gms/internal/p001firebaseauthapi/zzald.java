package com.google.android.gms.internal.p001firebaseauthapi;

/* JADX INFO: loaded from: classes3.dex */
final class zzald implements zzakl {
    private final zzakn zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzald(zzakn zzaknVar, String str, Object[] objArr) {
        this.zza = zzaknVar;
        this.zzb = str;
        this.zzc = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.zzd = cCharAt;
            return;
        }
        int i9 = cCharAt & 8191;
        int i10 = 13;
        int i11 = 1;
        while (true) {
            int i12 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.zzd = i9 | (cCharAt2 << i10);
                return;
            } else {
                i9 |= (cCharAt2 & 8191) << i10;
                i10 += 13;
                i11 = i12;
            }
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzakl
    public final zzakn zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzakl
    public final zzaky zzb() {
        int i9 = this.zzd;
        return (i9 & 1) != 0 ? zzaky.PROTO2 : (i9 & 4) == 4 ? zzaky.EDITIONS : zzaky.PROTO3;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzakl
    public final boolean zzc() {
        return (this.zzd & 2) == 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}
