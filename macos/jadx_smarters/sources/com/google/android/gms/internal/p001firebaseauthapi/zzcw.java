package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzed;
import com.google.android.gms.internal.p001firebaseauthapi.zzfv;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcw {
    public static final String zza = new zzdi().zze();
    public static final String zzb = new zzeo().zze();
    private static final String zzc = new zzfg().zze();
    private static final String zzd = new zzdz().zze();
    private static final String zze = new zzgc().zze();
    private static final String zzf = new zzgg().zze();
    private static final String zzg = new zzfu().zze();
    private static final String zzh = new zzhj().zze();

    @Deprecated
    private static final zzvt zzi;

    @Deprecated
    private static final zzvt zzj;

    @Deprecated
    private static final zzvt zzk;

    static {
        zzvt zzvtVarZzb = zzvt.zzb();
        zzi = zzvtVarZzb;
        zzj = zzvtVarZzb;
        zzk = zzvtVarZzb;
        try {
            zza();
        } catch (GeneralSecurityException e9) {
            throw new ExceptionInInitializerError(e9);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzda.zzc();
        zzqo.zza();
        zzdi.zza(true);
        zzeo.zza(true);
        if (zzif.zzb()) {
            return;
        }
        zzct.zza((zznb) new zzdz(), true);
        zzef.zza();
        zzns zznsVarZza = zzns.zza();
        HashMap map = new HashMap();
        map.put("AES128_EAX", zzhb.zzc);
        zzed.zza zzaVarZzc = zzed.zze().zza(16).zzb(16).zzc(16);
        zzed.zzb zzbVar = zzed.zzb.zzc;
        map.put("AES128_EAX_RAW", zzaVarZzc.zza(zzbVar).zza());
        map.put("AES256_EAX", zzhb.zzd);
        map.put("AES256_EAX_RAW", zzed.zze().zza(16).zzb(32).zzc(16).zza(zzbVar).zza());
        zznsVarZza.zza(Collections.unmodifiableMap(map));
        zzfg.zza(true);
        zzct.zza((zznb) new zzfu(), true);
        zzfx.zza();
        zzns zznsVarZza2 = zzns.zza();
        HashMap map2 = new HashMap();
        map2.put("CHACHA20_POLY1305", zzfv.zza(zzfv.zza.zza));
        map2.put("CHACHA20_POLY1305_RAW", zzfv.zza(zzfv.zza.zzc));
        zznsVarZza2.zza(Collections.unmodifiableMap(map2));
        zzct.zza((zznb) new zzgc(), true);
        zzgn.zza();
        zzct.zza((zznb) new zzgg(), true);
        zzgu.zza();
        zzhj.zza(true);
    }
}
