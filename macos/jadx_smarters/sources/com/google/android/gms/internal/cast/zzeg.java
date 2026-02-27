package com.google.android.gms.internal.cast;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
final class zzeg extends zzei {
    private final Handler zza;

    public zzeg(Looper looper) {
        this.zza = new Handler(looper);
    }

    @Override // com.google.android.gms.internal.cast.zzei
    public final void zza(zzef zzefVar) {
        this.zza.postDelayed(zzefVar.zzc(), 0L);
    }
}
