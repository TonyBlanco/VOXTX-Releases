package com.google.android.gms.internal.p001firebaseauthapi;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcu {
    public static zzch zza(byte[] bArr) throws GeneralSecurityException {
        try {
            zzvb zzvbVarZza = zzvb.zza(bArr, zzaio.zza());
            zznu zznuVarZza = zznu.zza();
            zzor zzorVarZza = zzor.zza(zzvbVarZza);
            return !zznuVarZza.zzb(zzorVarZza) ? new zznf(zzorVarZza) : zznuVarZza.zza(zzorVarZza);
        } catch (IOException e9) {
            throw new GeneralSecurityException("Failed to parse proto", e9);
        }
    }

    public static byte[] zza(zzch zzchVar) throws GeneralSecurityException {
        return (zzchVar instanceof zznf ? ((zznf) zzchVar).zzb() : (zzor) zznu.zza().zza(zzchVar, zzor.class)).zza().zzj();
    }
}
