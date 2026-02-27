package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzjl;
import com.google.android.gms.internal.p001firebaseauthapi.zztv;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* JADX INFO: loaded from: classes3.dex */
final class zzjt {
    private static final zzxt zza;
    private static final zzxt zzb;
    private static final zznz<zzjl, zzor> zzc;
    private static final zznv<zzor> zzd;
    private static final zzmx<zzjy, zzos> zze;
    private static final zzmu<zzos> zzf;
    private static final zzmx<zzjq, zzos> zzg;
    private static final zzmu<zzos> zzh;
    private static final zzmi<zzvs, zzjl.zzd> zzi;
    private static final zzmi<zzub, zzjl.zzb> zzj;
    private static final zzmi<zzty, zzjl.zzc> zzk;
    private static final zzmi<zztk, zzjl.zze> zzl;

    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.gms.internal.firebase-auth-api.zzjw, com.google.android.gms.internal.firebase-auth-api.zzmz] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.google.android.gms.internal.firebase-auth-api.zzju, com.google.android.gms.internal.firebase-auth-api.zzmz] */
    static {
        zzxt zzxtVarZzb = zzpf.zzb("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        zza = zzxtVarZzb;
        zzxt zzxtVarZzb2 = zzpf.zzb("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
        zzb = zzxtVarZzb2;
        zzc = zznz.zza(new zzob() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjs
            @Override // com.google.android.gms.internal.p001firebaseauthapi.zzob
            public final zzov zza(zzch zzchVar) {
                zzjl zzjlVar = (zzjl) zzchVar;
                return zzor.zzb((zzvb) ((zzajc) zzvb.zza().zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey").zza(((zztn) ((zzajc) zztn.zza().zza(zzjt.zzb(zzjlVar)).zzf())).zzi()).zza((zzvs) zzjt.zzi.zza(zzjlVar.zzg())).zzf()));
            }
        }, zzjl.class, zzor.class);
        zzd = zznv.zza(new zznx() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjv
            @Override // com.google.android.gms.internal.p001firebaseauthapi.zznx
            public final zzch zza(zzov zzovVar) {
                return zzjt.zzb((zzor) zzovVar);
            }
        }, zzxtVarZzb, zzor.class);
        zze = zzmx.zza(new Object() { // from class: com.google.android.gms.internal.firebase-auth-api.zzju
        }, zzjy.class, zzos.class);
        zzf = zzmu.zza(new zzmv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjx
            @Override // com.google.android.gms.internal.p001firebaseauthapi.zzmv
            public final zzbt zza(zzov zzovVar, zzcs zzcsVar) {
                return zzjt.zzd((zzos) zzovVar, zzcsVar);
            }
        }, zzxtVarZzb2, zzos.class);
        zzg = zzmx.zza(new Object() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjw
        }, zzjq.class, zzos.class);
        zzh = zzmu.zza(new zzmv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjz
            @Override // com.google.android.gms.internal.p001firebaseauthapi.zzmv
            public final zzbt zza(zzov zzovVar, zzcs zzcsVar) {
                return zzjt.zzc((zzos) zzovVar, zzcsVar);
            }
        }, zzxtVarZzb, zzos.class);
        zzml zzmlVarZza = zzmi.zza().zza(zzvs.RAW, zzjl.zzd.zzc).zza(zzvs.TINK, zzjl.zzd.zza);
        zzvs zzvsVar = zzvs.LEGACY;
        zzjl.zzd zzdVar = zzjl.zzd.zzb;
        zzi = zzmlVarZza.zza(zzvsVar, zzdVar).zza(zzvs.CRUNCHY, zzdVar).zza();
        zzj = zzmi.zza().zza(zzub.SHA1, zzjl.zzb.zza).zza(zzub.SHA224, zzjl.zzb.zzb).zza(zzub.SHA256, zzjl.zzb.zzc).zza(zzub.SHA384, zzjl.zzb.zzd).zza(zzub.SHA512, zzjl.zzb.zze).zza();
        zzk = zzmi.zza().zza(zzty.NIST_P256, zzjl.zzc.zza).zza(zzty.NIST_P384, zzjl.zzc.zzb).zza(zzty.NIST_P521, zzjl.zzc.zzc).zza(zzty.CURVE25519, zzjl.zzc.zzd).zza();
        zzl = zzmi.zza().zza(zztk.UNCOMPRESSED, zzjl.zze.zzb).zza(zztk.COMPRESSED, zzjl.zze.zza).zza(zztk.DO_NOT_USE_CRUNCHY_UNCOMPRESSED, zzjl.zze.zzc).zza();
    }

    private static zzjl zza(zzvs zzvsVar, zztq zztqVar) throws GeneralSecurityException {
        zzjl.zza zzaVarZza = zzjl.zzc().zza(zzi.zza(zzvsVar)).zza(zzk.zza(zztqVar.zzf().zzd())).zza(zzj.zza(zztqVar.zzf().zze())).zza(zzcu.zza(((zzvb) ((zzajc) zzvb.zza().zza(zztqVar.zzb().zzd().zzf()).zza(zzvs.RAW).zza(zztqVar.zzb().zzd().zze()).zzf())).zzj())).zza(zzxt.zza(zztqVar.zzf().zzf().zzg()));
        if (!zztqVar.zzf().zzd().equals(zzty.CURVE25519)) {
            zzaVarZza.zza(zzl.zza(zztqVar.zza()));
        } else if (!zztqVar.zza().equals(zztk.COMPRESSED)) {
            throw new GeneralSecurityException("For CURVE25519 EcPointFormat must be compressed");
        }
        return zzaVarZza.zza();
    }

    public static void zza() throws GeneralSecurityException {
        zznu zznuVarZza = zznu.zza();
        zznuVarZza.zza(zzc);
        zznuVarZza.zza(zzd);
        zznuVarZza.zza(zze);
        zznuVarZza.zza(zzf);
        zznuVarZza.zza(zzg);
        zznuVarZza.zza(zzh);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzjl zzb(zzor zzorVar) throws GeneralSecurityException {
        if (zzorVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
            try {
                return zza(zzorVar.zza().zzd(), zztn.zza(zzorVar.zza().zze(), zzaio.zza()).zzc());
            } catch (zzaji e9) {
                throw new GeneralSecurityException("Parsing EciesParameters failed: ", e9);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parseParameters: " + zzorVar.zza().zzf());
    }

    private static zztq zzb(zzjl zzjlVar) throws GeneralSecurityException {
        zztv.zza zzaVarZza = zztv.zza().zza((zzty) zzk.zza(zzjlVar.zzd())).zza((zzub) zzj.zza(zzjlVar.zze()));
        if (zzjlVar.zzh() != null && zzjlVar.zzh().zza() > 0) {
            zzaVarZza.zza(zzahp.zza(zzjlVar.zzh().zzb()));
        }
        zztv zztvVar = (zztv) ((zzajc) zzaVarZza.zzf());
        try {
            zzvb zzvbVarZza = zzvb.zza(zzcu.zza(zzjlVar.zzb()), zzaio.zza());
            zztm zztmVar = (zztm) ((zzajc) zztm.zza().zza((zzvb) ((zzajc) zzvb.zza().zza(zzvbVarZza.zzf()).zza(zzvs.TINK).zza(zzvbVarZza.zze()).zzf())).zzf());
            zzjl.zze zzeVarZzf = zzjlVar.zzf();
            if (zzeVarZzf == null) {
                zzeVarZzf = zzjl.zze.zza;
            }
            return (zztq) ((zzajc) zztq.zzc().zza(zztvVar).zza(zztmVar).zza((zztk) zzl.zza(zzeVarZzf)).zzf());
        } catch (zzaji e9) {
            throw new GeneralSecurityException("Parsing EciesParameters failed: ", e9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzjq zzc(zzos zzosVar, zzcs zzcsVar) throws GeneralSecurityException {
        if (!zzosVar.zzf().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parsePrivateKey: " + zzosVar.zzf());
        }
        try {
            zztr zztrVarZza = zztr.zza(zzosVar.zzd(), zzaio.zza());
            if (zztrVarZza.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zztu zztuVarZzd = zztrVarZza.zzd();
            zzjl zzjlVarZza = zza(zzosVar.zzc(), zztuVarZzd.zzb());
            return zzjlVarZza.zzd().equals(zzjl.zzc.zzd) ? zzjq.zza(zzjy.zza(zzjlVarZza, zzxt.zza(zztuVarZzd.zzf().zzg()), zzosVar.zze()), zzxu.zza(zztrVarZza.zze().zzg(), zzcs.zza(zzcsVar))) : zzjq.zza(zzjy.zza(zzjlVarZza, new ECPoint(zzme.zza(zztuVarZzd.zzf().zzg()), zzme.zza(zztuVarZzd.zzg().zzg())), zzosVar.zze()), zzxs.zza(zzme.zza(zztrVarZza.zze().zzg()), zzcs.zza(zzcsVar)));
        } catch (zzaji | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzjy zzd(zzos zzosVar, zzcs zzcsVar) throws GeneralSecurityException {
        if (!zzosVar.zzf().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parsePublicKey: " + zzosVar.zzf());
        }
        try {
            zztu zztuVarZza = zztu.zza(zzosVar.zzd(), zzaio.zza());
            if (zztuVarZza.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzjl zzjlVarZza = zza(zzosVar.zzc(), zztuVarZza.zzb());
            if (!zzjlVarZza.zzd().equals(zzjl.zzc.zzd)) {
                return zzjy.zza(zzjlVarZza, new ECPoint(zzme.zza(zztuVarZza.zzf().zzg()), zzme.zza(zztuVarZza.zzg().zzg())), zzosVar.zze());
            }
            if (zztuVarZza.zzg().zze()) {
                return zzjy.zza(zzjlVarZza, zzxt.zza(zztuVarZza.zzf().zzg()), zzosVar.zze());
            }
            throw new GeneralSecurityException("Y must be empty for X25519 points");
        } catch (zzaji | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
        }
    }
}
