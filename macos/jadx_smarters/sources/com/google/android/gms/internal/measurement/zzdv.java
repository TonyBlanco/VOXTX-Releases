package com.google.android.gms.internal.measurement;

import M4.O2;
import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
final class zzdv extends zzch {
    private final O2 zza;

    public zzdv(O2 o22) {
        this.zza = o22;
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final int zzd() {
        return System.identityHashCode(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final void zze(String str, String str2, Bundle bundle, long j9) {
        this.zza.a(str, str2, bundle, j9);
    }
}
