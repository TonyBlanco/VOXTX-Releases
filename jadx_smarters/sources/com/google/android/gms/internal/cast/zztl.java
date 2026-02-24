package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
final class zztl {
    private static final zztk zza;
    private static final zztk zzb;

    static {
        zztk zztkVar = null;
        try {
            zztkVar = (zztk) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zza = zztkVar;
        zzb = new zztk();
    }

    public static zztk zza() {
        return zza;
    }

    public static zztk zzb() {
        return zzb;
    }
}
