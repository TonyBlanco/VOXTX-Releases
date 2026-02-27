package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbu {
    private final zzvb zza = null;
    private final zzch zzb;

    private zzbu(zzch zzchVar) {
        this.zzb = zzchVar;
    }

    public static zzbu zza(zzch zzchVar) throws GeneralSecurityException {
        return new zzbu(zzchVar);
    }

    public final zzvb zza() throws GeneralSecurityException {
        zzch zzchVar = this.zzb;
        return (zzchVar instanceof zznf ? ((zznf) zzchVar).zzb() : (zzor) zznu.zza().zza(this.zzb, zzor.class)).zza();
    }
}
