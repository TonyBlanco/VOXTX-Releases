package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcs {
    private static final zzcs zza = new zzcs();

    private zzcs() {
    }

    public static zzcs zza() {
        return zza;
    }

    public static zzcs zza(zzcs zzcsVar) throws GeneralSecurityException {
        if (zzcsVar != null) {
            return zzcsVar;
        }
        throw new GeneralSecurityException("SecretKeyAccess is required");
    }
}
