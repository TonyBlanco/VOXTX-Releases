package com.google.android.gms.internal.play_billing;

import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes3.dex */
final class zzcc {
    private final Object zza;
    private final int zzb;

    public zzcc(Object obj, int i9) {
        this.zza = obj;
        this.zzb = i9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzcc)) {
            return false;
        }
        zzcc zzccVar = (zzcc) obj;
        return this.zza == zzccVar.zza && this.zzb == zzccVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.zzb;
    }
}
