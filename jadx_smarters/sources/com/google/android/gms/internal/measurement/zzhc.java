package com.google.android.gms.internal.measurement;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
final class zzhc extends zzhz {
    private final Context zza;
    private final zzim zzb;

    public zzhc(Context context, zzim zzimVar) {
        this.zza = context;
        this.zzb = zzimVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzhz) {
            zzhz zzhzVar = (zzhz) obj;
            if (this.zza.equals(zzhzVar.zza())) {
                zzim zzimVar = this.zzb;
                zzim zzimVarZzb = zzhzVar.zzb();
                if (zzimVar != null ? zzimVar.equals(zzimVarZzb) : zzimVarZzb == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        zzim zzimVar = this.zzb;
        return (iHashCode * 1000003) ^ (zzimVar == null ? 0 : zzimVar.hashCode());
    }

    public final String toString() {
        return "FlagsContext{context=" + this.zza.toString() + ", hermeticFileOverrides=" + String.valueOf(this.zzb) + "}";
    }

    @Override // com.google.android.gms.internal.measurement.zzhz
    public final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzhz
    public final zzim zzb() {
        return this.zzb;
    }
}
