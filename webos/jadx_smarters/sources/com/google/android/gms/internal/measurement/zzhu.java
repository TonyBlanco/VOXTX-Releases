package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
final class zzhu extends zzib {
    public zzhu(zzhy zzhyVar, String str, Long l9, boolean z9) {
        super(zzhyVar, str, l9, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            Log.e("PhenotypeFlag", "Invalid long value for " + this.zzb + ": " + ((String) obj));
            return null;
        }
    }
}
