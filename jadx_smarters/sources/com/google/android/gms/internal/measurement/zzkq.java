package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class zzkq {
    private static final zzko zza = new zzkp();
    private static final zzko zzb;

    static {
        zzko zzkoVar = null;
        try {
            zzkoVar = (zzko) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zzb = zzkoVar;
    }

    public static zzko zza() {
        zzko zzkoVar = zzb;
        if (zzkoVar != null) {
            return zzkoVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static zzko zzb() {
        return zza;
    }
}
