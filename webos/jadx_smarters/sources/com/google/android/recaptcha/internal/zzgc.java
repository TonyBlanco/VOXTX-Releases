package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zzgc {
    private static final zzga zza = new zzgb();
    private static final zzga zzb;

    static {
        zzga zzgaVar = null;
        try {
            zzgaVar = (zzga) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zzb = zzgaVar;
    }

    public static zzga zza() {
        zzga zzgaVar = zzb;
        if (zzgaVar != null) {
            return zzgaVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static zzga zzb() {
        return zza;
    }
}
