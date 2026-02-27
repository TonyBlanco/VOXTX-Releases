package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
final class zztv {
    private static final zztu zza;
    private static final zztu zzb;

    static {
        zztu zztuVar = null;
        try {
            zztuVar = (zztu) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zza = zztuVar;
        zzb = new zztu();
    }

    public static zztu zza() {
        return zza;
    }

    public static zztu zzb() {
        return zzb;
    }
}
