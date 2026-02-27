package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zznd extends zzbt {
    private final zzos zza;

    public zznd(zzos zzosVar, zzcs zzcsVar) throws GeneralSecurityException {
        zza(zzosVar, zzcsVar);
        this.zza = zzosVar;
    }

    private static void zza(zzos zzosVar, zzcs zzcsVar) throws GeneralSecurityException {
        int i9 = zzng.zza[zzosVar.zza().ordinal()];
        if (i9 == 1 || i9 == 2) {
            zzcs.zza(zzcsVar);
        }
    }

    public final zzos zza(zzcs zzcsVar) throws GeneralSecurityException {
        zza(this.zza, zzcsVar);
        return this.zza;
    }

    public final Integer zza() {
        return this.zza.zze();
    }
}
