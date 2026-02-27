package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zzhu {
    private static final zzht zza;
    private static final zzht zzb;

    static {
        zzht zzhtVar = null;
        try {
            zzhtVar = (zzht) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zza = zzhtVar;
        zzb = new zzht();
    }

    public static zzht zza() {
        return zza;
    }

    public static zzht zzb() {
        return zzb;
    }
}
