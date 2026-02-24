package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzdl;
import com.google.android.gms.internal.p001firebaseauthapi.zzes;
import com.google.android.gms.internal.p001firebaseauthapi.zzjl;
import com.google.android.gms.internal.p001firebaseauthapi.zzka;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzkm {
    private static final String zza = new zzjj().zze();
    private static final String zzb = new zzji().zze();

    @Deprecated
    private static final zzvt zzc = zzvt.zzb();

    @Deprecated
    private static final zzvt zzd = zzvt.zzb();

    @Deprecated
    private static final zzvt zze = zzvt.zzb();

    static {
        try {
            zza();
        } catch (GeneralSecurityException e9) {
            throw new ExceptionInInitializerError(e9);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzkp.zzc();
        zzkr.zzc();
        zzcw.zza();
        zziz.zza();
        if (zzif.zzb()) {
            return;
        }
        zzct.zza((zzop) new zzji(), (zznb) new zzjj(), true);
        zzjt.zza();
        zzns zznsVarZza = zzns.zza();
        HashMap map = new HashMap();
        zzjl.zza zzaVarZzc = zzjl.zzc();
        zzjl.zzc zzcVar = zzjl.zzc.zza;
        zzjl.zza zzaVarZza = zzaVarZzc.zza(zzcVar);
        zzjl.zzb zzbVar = zzjl.zzb.zzc;
        zzjl.zza zzaVarZza2 = zzaVarZza.zza(zzbVar);
        zzjl.zze zzeVar = zzjl.zze.zzb;
        zzjl.zza zzaVarZza3 = zzaVarZza2.zza(zzeVar);
        zzjl.zzd zzdVar = zzjl.zzd.zza;
        zzjl.zza zzaVarZza4 = zzaVarZza3.zza(zzdVar);
        zzes.zza zzaVarZzc2 = zzes.zze().zza(12).zzb(16).zzc(16);
        zzes.zzb zzbVar2 = zzes.zzb.zzc;
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", zzaVarZza4.zza(zzaVarZzc2.zza(zzbVar2).zza()).zza());
        zzjl.zza zzaVarZza5 = zzjl.zzc().zza(zzcVar).zza(zzbVar).zza(zzeVar);
        zzjl.zzd zzdVar2 = zzjl.zzd.zzc;
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzaVarZza5.zza(zzdVar2).zza(zzes.zze().zza(12).zzb(16).zzc(16).zza(zzbVar2).zza()).zza());
        zzjl.zza zzaVarZza6 = zzjl.zzc().zza(zzcVar).zza(zzbVar);
        zzjl.zze zzeVar2 = zzjl.zze.zza;
        map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", zzaVarZza6.zza(zzeVar2).zza(zzdVar).zza(zzes.zze().zza(12).zzb(16).zzc(16).zza(zzbVar2).zza()).zza());
        map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzjl.zzc().zza(zzcVar).zza(zzbVar).zza(zzeVar2).zza(zzdVar2).zza(zzes.zze().zza(12).zzb(16).zzc(16).zza(zzbVar2).zza()).zza());
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", zzjl.zzc().zza(zzcVar).zza(zzbVar).zza(zzeVar2).zza(zzdVar2).zza(zzes.zze().zza(12).zzb(16).zzc(16).zza(zzbVar2).zza()).zza());
        zzjl.zza zzaVarZza7 = zzjl.zzc().zza(zzcVar).zza(zzbVar).zza(zzeVar).zza(zzdVar);
        zzdl.zza zzaVarZzc3 = zzdl.zzf().zza(16).zzb(32).zzd(16).zzc(16);
        zzdl.zzb zzbVar3 = zzdl.zzb.zzc;
        zzdl.zza zzaVarZza8 = zzaVarZzc3.zza(zzbVar3);
        zzdl.zzc zzcVar2 = zzdl.zzc.zzc;
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzaVarZza7.zza(zzaVarZza8.zza(zzcVar2).zza()).zza());
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzjl.zzc().zza(zzcVar).zza(zzbVar).zza(zzeVar).zza(zzdVar2).zza(zzdl.zzf().zza(16).zzb(32).zzd(16).zzc(16).zza(zzbVar3).zza(zzcVar2).zza()).zza());
        map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzjl.zzc().zza(zzcVar).zza(zzbVar).zza(zzeVar2).zza(zzdVar).zza(zzdl.zzf().zza(16).zzb(32).zzd(16).zzc(16).zza(zzbVar3).zza(zzcVar2).zza()).zza());
        map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzjl.zzc().zza(zzcVar).zza(zzbVar).zza(zzeVar2).zza(zzdVar2).zza(zzdl.zzf().zza(16).zzb(32).zzd(16).zzc(16).zza(zzbVar3).zza(zzcVar2).zza()).zza());
        zznsVarZza.zza(Collections.unmodifiableMap(map));
        zzct.zza((zzop) new zzln(), (zznb) new zzlr(), true);
        zzke.zza();
        zzns zznsVarZza2 = zzns.zza();
        HashMap map2 = new HashMap();
        zzka.zzc zzcVarZzc = zzka.zzc();
        zzka.zzf zzfVar = zzka.zzf.zza;
        zzka.zzc zzcVarZza = zzcVarZzc.zza(zzfVar);
        zzka.zzd zzdVar3 = zzka.zzd.zzd;
        zzka.zzc zzcVarZza2 = zzcVarZza.zza(zzdVar3);
        zzka.zze zzeVar3 = zzka.zze.zza;
        zzka.zzc zzcVarZza3 = zzcVarZza2.zza(zzeVar3);
        zzka.zza zzaVar = zzka.zza.zza;
        map2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", zzcVarZza3.zza(zzaVar).zza());
        zzka.zzc zzcVarZzc2 = zzka.zzc();
        zzka.zzf zzfVar2 = zzka.zzf.zzc;
        map2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzcVarZzc2.zza(zzfVar2).zza(zzdVar3).zza(zzeVar3).zza(zzaVar).zza());
        zzka.zzc zzcVarZza4 = zzka.zzc().zza(zzfVar).zza(zzdVar3).zza(zzeVar3);
        zzka.zza zzaVar2 = zzka.zza.zzb;
        map2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zzcVarZza4.zza(zzaVar2).zza());
        map2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzka.zzc().zza(zzfVar2).zza(zzdVar3).zza(zzeVar3).zza(zzaVar2).zza());
        zzka.zzc zzcVarZza5 = zzka.zzc().zza(zzfVar).zza(zzdVar3).zza(zzeVar3);
        zzka.zza zzaVar3 = zzka.zza.zzc;
        map2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", zzcVarZza5.zza(zzaVar3).zza());
        map2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", zzka.zzc().zza(zzfVar2).zza(zzdVar3).zza(zzeVar3).zza(zzaVar3).zza());
        zzka.zzc zzcVarZza6 = zzka.zzc().zza(zzfVar);
        zzka.zzd zzdVar4 = zzka.zzd.zza;
        map2.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", zzcVarZza6.zza(zzdVar4).zza(zzeVar3).zza(zzaVar).zza());
        map2.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzka.zzc().zza(zzfVar2).zza(zzdVar4).zza(zzeVar3).zza(zzaVar).zza());
        map2.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zzka.zzc().zza(zzfVar).zza(zzdVar4).zza(zzeVar3).zza(zzaVar2).zza());
        map2.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzka.zzc().zza(zzfVar2).zza(zzdVar4).zza(zzeVar3).zza(zzaVar2).zza());
        zzka.zzc zzcVarZza7 = zzka.zzc().zza(zzfVar);
        zzka.zzd zzdVar5 = zzka.zzd.zzb;
        zzka.zzc zzcVarZza8 = zzcVarZza7.zza(zzdVar5);
        zzka.zze zzeVar4 = zzka.zze.zzb;
        map2.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", zzcVarZza8.zza(zzeVar4).zza(zzaVar).zza());
        map2.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", zzka.zzc().zza(zzfVar2).zza(zzdVar5).zza(zzeVar4).zza(zzaVar).zza());
        map2.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", zzka.zzc().zza(zzfVar).zza(zzdVar5).zza(zzeVar4).zza(zzaVar2).zza());
        map2.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", zzka.zzc().zza(zzfVar2).zza(zzdVar5).zza(zzeVar4).zza(zzaVar2).zza());
        zzka.zzc zzcVarZza9 = zzka.zzc().zza(zzfVar);
        zzka.zzd zzdVar6 = zzka.zzd.zzc;
        zzka.zzc zzcVarZza10 = zzcVarZza9.zza(zzdVar6);
        zzka.zze zzeVar5 = zzka.zze.zzc;
        map2.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", zzcVarZza10.zza(zzeVar5).zza(zzaVar).zza());
        map2.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", zzka.zzc().zza(zzfVar2).zza(zzdVar6).zza(zzeVar5).zza(zzaVar).zza());
        map2.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", zzka.zzc().zza(zzfVar).zza(zzdVar6).zza(zzeVar5).zza(zzaVar2).zza());
        map2.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", zzka.zzc().zza(zzfVar2).zza(zzdVar6).zza(zzeVar5).zza(zzaVar2).zza());
        zznsVarZza2.zza(Collections.unmodifiableMap(map2));
    }
}
