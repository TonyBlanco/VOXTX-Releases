package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zznh {
    public static final zzrr zza = new zznj();

    public static <P> zzrq zza(zzcg<P> zzcgVar) {
        zzbv zzbvVar;
        zzrt zzrtVar = new zzrt();
        zzrtVar.zza(zzcgVar.zzb());
        Iterator<List<zzcl<P>>> it = zzcgVar.zzd().iterator();
        while (it.hasNext()) {
            for (zzcl<P> zzclVar : it.next()) {
                int i9 = zznk.zza[zzclVar.zzc().ordinal()];
                if (i9 == 1) {
                    zzbvVar = zzbv.zza;
                } else if (i9 == 2) {
                    zzbvVar = zzbv.zzb;
                } else {
                    if (i9 != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    zzbvVar = zzbv.zzc;
                }
                int iZza = zzclVar.zza();
                String strZzg = zzclVar.zzg();
                if (strZzg.startsWith("type.googleapis.com/google.crypto.")) {
                    strZzg = strZzg.substring(34);
                }
                zzrtVar.zza(zzbvVar, iZza, strZzg, zzclVar.zzd().name());
            }
        }
        if (zzcgVar.zza() != null) {
            zzrtVar.zza(zzcgVar.zza().zza());
        }
        try {
            return zzrtVar.zza();
        } catch (GeneralSecurityException e9) {
            throw new IllegalStateException(e9);
        }
    }
}
