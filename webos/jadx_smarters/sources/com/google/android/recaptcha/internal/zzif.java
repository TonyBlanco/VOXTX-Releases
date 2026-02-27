package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zzif {
    private static final zzie zza;
    private static final zzie zzb;

    static {
        zzie zzieVar = null;
        try {
            zzieVar = (zzie) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zza = zzieVar;
        zzb = new zzie();
    }

    public static zzie zza() {
        return zza;
    }

    public static zzie zzb() {
        return zzb;
    }
}
