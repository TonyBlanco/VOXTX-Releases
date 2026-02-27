package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
final class zzlh implements zzbr {
    private static final byte[] zza = new byte[0];
    private final zzuv zzb;
    private final zzlj zzc;
    private final zzlg zzd;
    private final zzld zze;

    private zzlh(zzuv zzuvVar, zzlj zzljVar, zzlg zzlgVar, zzld zzldVar) {
        this.zzb = zzuvVar;
        this.zzc = zzljVar;
        this.zzd = zzlgVar;
        this.zze = zzldVar;
    }

    public static zzlh zza(zzuv zzuvVar) throws GeneralSecurityException {
        if (zzuvVar.zzf().zze()) {
            throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
        }
        zzur zzurVarZzb = zzuvVar.zzb();
        return new zzlh(zzuvVar, zzlk.zzc(zzurVarZzb), zzlk.zzb(zzurVarZzb), zzlk.zza(zzurVarZzb));
    }
}
