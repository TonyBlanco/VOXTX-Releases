package com.google.android.gms.internal.p001firebaseauthapi;

/* JADX INFO: loaded from: classes3.dex */
final class zzais {
    private static final zzaiq<?> zza = new zzait();
    private static final zzaiq<?> zzb = zzc();

    public static zzaiq<?> zza() {
        zzaiq<?> zzaiqVar = zzb;
        if (zzaiqVar != null) {
            return zzaiqVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static zzaiq<?> zzb() {
        return zza;
    }

    private static zzaiq<?> zzc() {
        try {
            return (zzaiq) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
