package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzrn {
    public static final zzrn zza = new zzrm().zza();
    private final Map<String, String> zzb;

    private zzrn(Map<String, String> map) {
        this.zzb = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzrn) {
            return this.zzb.equals(((zzrn) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        return this.zzb.toString();
    }

    public final Map<String, String> zza() {
        return this.zzb;
    }
}
