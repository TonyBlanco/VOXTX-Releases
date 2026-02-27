package com.google.android.gms.internal.p001firebaseauthapi;

/* JADX INFO: loaded from: classes3.dex */
public final class zzxu {
    private final zzxt zza;

    private zzxu(zzxt zzxtVar) {
        this.zza = zzxtVar;
    }

    public static zzxu zza(byte[] bArr, zzcs zzcsVar) {
        if (zzcsVar != null) {
            return new zzxu(zzxt.zza(bArr));
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public final int zza() {
        return this.zza.zza();
    }

    public final byte[] zza(zzcs zzcsVar) {
        if (zzcsVar != null) {
            return this.zza.zzb();
        }
        throw new NullPointerException("SecretKeyAccess required");
    }
}
