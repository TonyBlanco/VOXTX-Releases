package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zziz {
    public static final String zza = new zzin().zze();

    @Deprecated
    private static final zzvt zzb = zzvt.zzb();

    @Deprecated
    private static final zzvt zzc = zzvt.zzb();

    static {
        try {
            zza();
        } catch (GeneralSecurityException e9) {
            throw new ExceptionInInitializerError(e9);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzje.zzc();
        if (zzif.zzb()) {
            return;
        }
        zzin.zza(true);
    }
}
