package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzik;
import com.google.android.gms.internal.p001firebaseauthapi.zzir;
import com.google.android.gms.internal.p001firebaseauthapi.zzvb;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zziw {
    private static final zzxt zza;
    private static final zznz<zzir, zzor> zzb;
    private static final zznv<zzor> zzc;
    private static final zzmx<zzik, zzos> zzd;
    private static final zzmu<zzos> zze;
    private static final Map<zzir.zzb, zzvs> zzf;
    private static final Map<zzvs, zzir.zzb> zzg;

    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.internal.firebase-auth-api.zzix, com.google.android.gms.internal.firebase-auth-api.zzmz] */
    static {
        zzxt zzxtVarZzb = zzpf.zzb("type.googleapis.com/google.crypto.tink.AesSivKey");
        zza = zzxtVarZzb;
        zzb = zznz.zza(new zzob() { // from class: com.google.android.gms.internal.firebase-auth-api.zziv
            @Override // com.google.android.gms.internal.p001firebaseauthapi.zzob
            public final zzov zza(zzch zzchVar) {
                return zziw.zza((zzir) zzchVar);
            }
        }, zzir.class, zzor.class);
        zzc = zznv.zza(new zznx() { // from class: com.google.android.gms.internal.firebase-auth-api.zziy
            @Override // com.google.android.gms.internal.p001firebaseauthapi.zznx
            public final zzch zza(zzov zzovVar) {
                return zziw.zzb((zzor) zzovVar);
            }
        }, zzxtVarZzb, zzor.class);
        zzd = zzmx.zza(new Object() { // from class: com.google.android.gms.internal.firebase-auth-api.zzix
        }, zzik.class, zzos.class);
        zze = zzmu.zza(new zzmv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzja
            @Override // com.google.android.gms.internal.p001firebaseauthapi.zzmv
            public final zzbt zza(zzov zzovVar, zzcs zzcsVar) {
                return zziw.zzb((zzos) zzovVar, zzcsVar);
            }
        }, zzxtVarZzb, zzos.class);
        HashMap map = new HashMap();
        zzir.zzb zzbVar = zzir.zzb.zzc;
        zzvs zzvsVar = zzvs.RAW;
        map.put(zzbVar, zzvsVar);
        zzir.zzb zzbVar2 = zzir.zzb.zza;
        zzvs zzvsVar2 = zzvs.TINK;
        map.put(zzbVar2, zzvsVar2);
        zzir.zzb zzbVar3 = zzir.zzb.zzb;
        zzvs zzvsVar3 = zzvs.CRUNCHY;
        map.put(zzbVar3, zzvsVar3);
        zzf = Collections.unmodifiableMap(map);
        EnumMap enumMap = new EnumMap(zzvs.class);
        enumMap.put(zzvsVar, zzbVar);
        enumMap.put(zzvsVar2, zzbVar2);
        enumMap.put(zzvsVar3, zzbVar3);
        enumMap.put(zzvs.LEGACY, zzbVar3);
        zzg = Collections.unmodifiableMap(enumMap);
    }

    private static zzir.zzb zza(zzvs zzvsVar) throws GeneralSecurityException {
        Map<zzvs, zzir.zzb> map = zzg;
        if (map.containsKey(zzvsVar)) {
            return map.get(zzvsVar);
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzvsVar.zza());
    }

    public static /* synthetic */ zzor zza(zzir zzirVar) throws GeneralSecurityException {
        zzvb.zza zzaVarZza = zzvb.zza().zza("type.googleapis.com/google.crypto.tink.AesSivKey").zza(((zztd) ((zzajc) zztd.zzc().zza(zzirVar.zzb()).zzf())).zzi());
        zzir.zzb zzbVarZzd = zzirVar.zzd();
        Map<zzir.zzb, zzvs> map = zzf;
        if (map.containsKey(zzbVarZzd)) {
            return zzor.zzb((zzvb) ((zzajc) zzaVarZza.zza(map.get(zzbVarZzd)).zzf()));
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zzbVarZzd));
    }

    public static void zza() throws GeneralSecurityException {
        zznu zznuVarZza = zznu.zza();
        zznuVarZza.zza(zzb);
        zznuVarZza.zza(zzc);
        zznuVarZza.zza(zzd);
        zznuVarZza.zza(zze);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzik zzb(zzos zzosVar, zzcs zzcsVar) throws GeneralSecurityException {
        if (!zzosVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters");
        }
        try {
            zztc zztcVarZza = zztc.zza(zzosVar.zzd(), zzaio.zza());
            if (zztcVarZza.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return new zzik.zza().zza(zzir.zzc().zza(zztcVarZza.zzd().zzb()).zza(zza(zzosVar.zzc())).zza()).zza(zzxu.zza(zztcVarZza.zzd().zzg(), zzcs.zza(zzcsVar))).zza(zzosVar.zze()).zza();
        } catch (zzaji unused) {
            throw new GeneralSecurityException("Parsing AesSivKey failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzir zzb(zzor zzorVar) throws GeneralSecurityException {
        if (!zzorVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters: " + zzorVar.zza().zzf());
        }
        try {
            zztd zztdVarZza = zztd.zza(zzorVar.zza().zze(), zzaio.zza());
            if (zztdVarZza.zzb() == 0) {
                return zzir.zzc().zza(zztdVarZza.zza()).zza(zza(zzorVar.zza().zzd())).zza();
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzaji e9) {
            throw new GeneralSecurityException("Parsing AesSivParameters failed: ", e9);
        }
    }
}
