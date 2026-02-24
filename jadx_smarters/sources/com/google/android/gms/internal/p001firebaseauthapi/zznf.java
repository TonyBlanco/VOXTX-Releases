package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zznf extends zzch {
    private final zzor zza;

    public zznf(zzor zzorVar) {
        this.zza = zzorVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zznf)) {
            return false;
        }
        zzor zzorVar = ((zznf) obj).zza;
        return this.zza.zza().zzd().equals(zzorVar.zza().zzd()) && this.zza.zza().zzf().equals(zzorVar.zza().zzf()) && this.zza.zza().zze().equals(zzorVar.zza().zze());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza.zza(), this.zza.zzb()});
    }

    public final String toString() {
        String strZzf = this.zza.zza().zzf();
        int i9 = zzni.zza[this.zza.zza().zzd().ordinal()];
        return String.format("(typeUrl=%s, outputPrefixType=%s)", strZzf, i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK");
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzch
    public final boolean zza() {
        return this.zza.zza().zzd() != zzvs.RAW;
    }

    public final zzor zzb() {
        return this.zza;
    }
}
