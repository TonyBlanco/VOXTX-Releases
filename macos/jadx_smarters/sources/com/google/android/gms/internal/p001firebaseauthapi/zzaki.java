package com.google.android.gms.internal.p001firebaseauthapi;

/* JADX INFO: loaded from: classes3.dex */
final class zzaki {
    private static final zzakg zza = zzc();
    private static final zzakg zzb = new zzakj();

    public static zzakg zza() {
        return zza;
    }

    public static zzakg zzb() {
        return zzb;
    }

    private static zzakg zzc() {
        try {
            return (zzakg) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
