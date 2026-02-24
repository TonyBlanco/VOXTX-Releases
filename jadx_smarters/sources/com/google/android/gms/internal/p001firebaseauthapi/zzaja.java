package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* JADX INFO: loaded from: classes3.dex */
final class zzaja implements zzakk {
    private static final zzaja zza = new zzaja();

    private zzaja() {
    }

    public static zzaja zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzakk
    public final zzakl zza(Class<?> cls) {
        if (!zzajc.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (zzakl) zzajc.zza(cls.asSubclass(zzajc.class)).zza(zzajc.zzf.zzc, (Object) null, (Object) null);
        } catch (Exception e9) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e9);
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzakk
    public final boolean zzb(Class<?> cls) {
        return zzajc.class.isAssignableFrom(cls);
    }
}
