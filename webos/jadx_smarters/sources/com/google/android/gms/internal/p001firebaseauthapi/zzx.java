package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.logging.Logger;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
final class zzx {
    private static final Logger zza = Logger.getLogger(zzx.class.getName());
    private static final zzv zzb = new zza();

    public static final class zza implements zzv {
        private zza() {
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzv
        public final zzs zza(String str) {
            return new zzu(Pattern.compile(str));
        }
    }

    private zzx() {
    }

    public static zzs zza(String str) {
        zzy.zza(str);
        return zzb.zza(str);
    }

    public static String zzb(String str) {
        if (zzd(str)) {
            return null;
        }
        return str;
    }

    public static String zzc(String str) {
        return str == null ? "" : str;
    }

    public static boolean zzd(String str) {
        return str == null || str.isEmpty();
    }
}
