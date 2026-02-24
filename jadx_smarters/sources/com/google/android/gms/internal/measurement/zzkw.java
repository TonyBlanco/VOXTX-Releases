package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class zzkw implements zzmg {
    private static final zzkw zza = new zzkw();

    private zzkw() {
    }

    public static zzkw zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzmg
    public final zzmf zzb(Class cls) {
        if (!zzlb.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzmf) zzlb.zzbC(cls.asSubclass(zzlb.class)).zzl(3, null, null);
        } catch (Exception e9) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e9);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmg
    public final boolean zzc(Class cls) {
        return zzlb.class.isAssignableFrom(cls);
    }
}
