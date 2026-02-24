package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzrs {
    private final zzbv zza;
    private final int zzb;
    private final String zzc;
    private final String zzd;

    private zzrs(zzbv zzbvVar, int i9, String str, String str2) {
        this.zza = zzbvVar;
        this.zzb = i9;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzrs)) {
            return false;
        }
        zzrs zzrsVar = (zzrs) obj;
        return this.zza == zzrsVar.zza && this.zzb == zzrsVar.zzb && this.zzc.equals(zzrsVar.zzc) && this.zzd.equals(zzrsVar.zzd);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd});
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final int zza() {
        return this.zzb;
    }
}
