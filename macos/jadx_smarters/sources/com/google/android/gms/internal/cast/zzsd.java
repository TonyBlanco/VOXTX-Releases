package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
final class zzsd implements zztn {
    private static final zzsd zza = new zzsd();

    private zzsd() {
    }

    public static zzsd zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.cast.zztn
    public final zztm zzb(Class cls) {
        if (!zzsh.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zztm) zzsh.zzv(cls.asSubclass(zzsh.class)).zzb(3, null, null);
        } catch (Exception e9) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e9);
        }
    }

    @Override // com.google.android.gms.internal.cast.zztn
    public final boolean zzc(Class cls) {
        return zzsh.class.isAssignableFrom(cls);
    }
}
