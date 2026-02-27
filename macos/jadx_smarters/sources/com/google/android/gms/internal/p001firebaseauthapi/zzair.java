package com.google.android.gms.internal.p001firebaseauthapi;

import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes3.dex */
final class zzair {
    private final Object zza;
    private final int zzb;

    public zzair(Object obj, int i9) {
        this.zza = obj;
        this.zzb = i9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzair)) {
            return false;
        }
        zzair zzairVar = (zzair) obj;
        return this.zza == zzairVar.zza && this.zzb == zzairVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.zzb;
    }
}
