package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
final class zzhw extends zzib {
    public zzhw(zzhy zzhyVar, String str, Double d9, boolean z9) {
        super(zzhyVar, "measurement.test.double_flag", d9, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final /* synthetic */ Object zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            Log.e("PhenotypeFlag", "Invalid double value for " + this.zzb + ": " + ((String) obj));
            return null;
        }
    }
}
