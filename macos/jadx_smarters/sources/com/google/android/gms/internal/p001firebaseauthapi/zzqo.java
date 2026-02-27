package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzqo {
    private static final String zza = new zzqg().zze();

    @Deprecated
    private static final zzvt zzb;

    @Deprecated
    private static final zzvt zzc;

    @Deprecated
    private static final zzvt zzd;

    static {
        zzvt zzvtVarZzb = zzvt.zzb();
        zzb = zzvtVarZzb;
        zzc = zzvtVarZzb;
        zzd = zzvtVarZzb;
        try {
            zza();
        } catch (GeneralSecurityException e9) {
            throw new ExceptionInInitializerError(e9);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzqt.zzc();
        zzpy.zzc();
        zzqg.zza(true);
        if (zzif.zzb()) {
            return;
        }
        zzpl.zza(true);
    }
}
