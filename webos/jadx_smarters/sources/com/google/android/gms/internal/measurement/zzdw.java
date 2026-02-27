package com.google.android.gms.internal.measurement;

import M4.P2;
import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
final class zzdw extends zzch {
    private final P2 zza;

    public zzdw(P2 p22) {
        this.zza = p22;
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
