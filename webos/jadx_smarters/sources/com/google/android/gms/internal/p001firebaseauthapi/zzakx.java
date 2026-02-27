package com.google.android.gms.internal.p001firebaseauthapi;

/* JADX INFO: loaded from: classes3.dex */
final class zzakx {
    private static final zzakv zza = zzc();
    private static final zzakv zzb = new zzaku();

    public static zzakv zza() {
        return zza;
    }

    public static zzakv zzb() {
        return zzb;
    }

    private static zzakv zzc() {
        try {
            return (zzakv) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
