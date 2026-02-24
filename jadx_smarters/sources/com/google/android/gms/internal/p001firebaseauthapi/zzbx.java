package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzuy;
import com.google.android.gms.internal.p001firebaseauthapi.zzvg;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbx {
    private final zzvg zza;
    private final List<zzbz> zzb;
    private final zzrn zzc = zzrn.zza;

    private zzbx(zzvg zzvgVar, List<zzbz> list) {
        this.zza = zzvgVar;
        this.zzb = list;
    }

    public static final zzbx zza(zzca zzcaVar, zzbg zzbgVar) throws GeneralSecurityException, IOException {
        byte[] bArr = new byte[0];
        zzua zzuaVarZza = zzcaVar.zza();
        if (zzuaVarZza == null || zzuaVarZza.zzc().zzb() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return zza(zza(zzuaVarZza, zzbgVar, bArr));
    }

    public static final zzbx zza(zzvg zzvgVar) throws GeneralSecurityException {
        zzc(zzvgVar);
        return new zzbx(zzvgVar, zzb(zzvgVar));
    }

    private static zzos zza(zzvg.zzb zzbVar) {
        try {
            return zzos.zza(zzbVar.zzb().zzf(), zzbVar.zzb().zze(), zzbVar.zzb().zzb(), zzbVar.zzf(), zzbVar.zzf() == zzvs.RAW ? null : Integer.valueOf(zzbVar.zza()));
        } catch (GeneralSecurityException e9) {
            throw new zzpd("Creating a protokey serialization failed", e9);
        }
    }

    private static zzua zza(zzvg zzvgVar, zzbg zzbgVar, byte[] bArr) throws GeneralSecurityException {
        byte[] bArrZzb = zzbgVar.zzb(zzvgVar.zzj(), bArr);
        try {
            if (zzvg.zza(zzbgVar.zza(bArrZzb, bArr), zzaio.zza()).equals(zzvgVar)) {
                return (zzua) ((zzajc) zzua.zza().zza(zzahp.zza(bArrZzb)).zza(zzcx.zza(zzvgVar)).zzf());
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (zzaji unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    private static zzvg zza(zzua zzuaVar, zzbg zzbgVar, byte[] bArr) throws GeneralSecurityException {
        try {
            zzvg zzvgVarZza = zzvg.zza(zzbgVar.zza(zzuaVar.zzc().zzg(), bArr), zzaio.zza());
            zzc(zzvgVarZza);
            return zzvgVarZza;
        } catch (zzaji unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    private static <B> B zza(zzmp zzmpVar, zzbt zzbtVar, Class<B> cls) throws GeneralSecurityException {
        try {
            return (B) zzmpVar.zza(zzbtVar, cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    private static <B> B zza(zzmp zzmpVar, zzvg.zzb zzbVar, Class<B> cls) throws GeneralSecurityException {
        try {
            return (B) zzmpVar.zza(zzbVar.zzb(), cls);
        } catch (UnsupportedOperationException unused) {
            return null;
        } catch (GeneralSecurityException e9) {
            if (e9.getMessage().contains("No key manager found for key type ") || e9.getMessage().contains(" not supported by key manager of type ")) {
                return null;
            }
            throw e9;
        }
    }

    private static List<zzbz> zzb(zzvg zzvgVar) {
        zzbt zzbtVarZza;
        int i9;
        zzbv zzbvVar;
        ArrayList arrayList = new ArrayList(zzvgVar.zza());
        for (zzvg.zzb zzbVar : zzvgVar.zze()) {
            int iZza = zzbVar.zza();
            try {
                zzbtVarZza = zznu.zza().zza(zza(zzbVar), zzcs.zza());
                i9 = zzbw.zza[zzbVar.zzc().ordinal()];
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
            if (i9 == 1) {
                zzbvVar = zzbv.zza;
            } else if (i9 == 2) {
                zzbvVar = zzbv.zzb;
            } else {
                if (i9 != 3) {
                    throw new GeneralSecurityException("Unknown key status");
                }
                zzbvVar = zzbv.zzc;
            }
            arrayList.add(new zzbz(zzbtVarZza, zzbvVar, iZza, iZza == zzvgVar.zzb()));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static void zzc(zzvg zzvgVar) throws GeneralSecurityException {
        if (zzvgVar == null || zzvgVar.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public final String toString() {
        return zzcx.zza(this.zza).toString();
    }

    public final zzbx zza() throws GeneralSecurityException {
        if (this.zza == null) {
            throw new GeneralSecurityException("cleartext keyset is not available");
        }
        zzvg.zza zzaVarZzc = zzvg.zzc();
        for (zzvg.zzb zzbVar : this.zza.zze()) {
            zzuy zzuyVarZzb = zzbVar.zzb();
            if (zzuyVarZzb.zzb() != zzuy.zza.ASYMMETRIC_PRIVATE) {
                throw new GeneralSecurityException("The keyset contains a non-private key");
            }
            zzuy zzuyVarZza = zzct.zza(zzuyVarZzb.zzf(), zzuyVarZzb.zze());
            zzct.zza(zzuyVarZza);
            zzaVarZzc.zza((zzvg.zzb) ((zzajc) zzbVar.zzn().zza(zzuyVarZza).zzf()));
        }
        zzaVarZzc.zza(this.zza.zzb());
        return zza((zzvg) ((zzajc) zzaVarZzc.zzf()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <P> P zza(Class<P> cls) throws GeneralSecurityException {
        zzow zzowVarZza = zzow.zza();
        if (!(zzowVarZza instanceof zzmp)) {
            throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
        }
        Class<?> clsZza = zzowVarZza.zza(cls);
        if (clsZza == null) {
            throw new GeneralSecurityException("No wrapper found for " + cls.getName());
        }
        zzcx.zzb(this.zza);
        zzcj zzcjVar = new zzcj(clsZza);
        zzcjVar.zza(this.zzc);
        for (int i9 = 0; i9 < this.zza.zza(); i9++) {
            zzvg.zzb zzbVarZza = this.zza.zza(i9);
            if (zzbVarZza.zzc().equals(zzuz.ENABLED)) {
                Object objZza = zza(zzowVarZza, zzbVarZza, clsZza);
                Object objZza2 = this.zzb.get(i9) != null ? zza(zzowVarZza, this.zzb.get(i9).zza(), clsZza) : null;
                if (objZza2 == null && objZza == null) {
                    throw new GeneralSecurityException("Unable to get primitive " + String.valueOf(clsZza) + " for key of type " + zzbVarZza.zzb().zzf());
                }
                if (zzbVarZza.zza() == this.zza.zzb()) {
                    zzcjVar.zzb(objZza2, objZza, zzbVarZza);
                } else {
                    zzcjVar.zza(objZza2, objZza, zzbVarZza);
                }
            }
        }
        return (P) zzowVarZza.zza(zzcjVar.zza(), cls);
    }

    public final void zza(zzcd zzcdVar) throws GeneralSecurityException, IOException {
        for (zzvg.zzb zzbVar : this.zza.zze()) {
            if (zzbVar.zzb().zzb() == zzuy.zza.UNKNOWN_KEYMATERIAL || zzbVar.zzb().zzb() == zzuy.zza.SYMMETRIC || zzbVar.zzb().zzb() == zzuy.zza.ASYMMETRIC_PRIVATE) {
                throw new GeneralSecurityException(String.format("keyset contains key material of type %s for type url %s", zzbVar.zzb().zzb().name(), zzbVar.zzb().zzf()));
            }
        }
        zzcdVar.zza(this.zza);
    }

    public final void zza(zzcd zzcdVar, zzbg zzbgVar) throws GeneralSecurityException, IOException {
        zzcdVar.zza(zza(this.zza, zzbgVar, new byte[0]));
    }

    public final zzvg zzb() {
        return this.zza;
    }

    public final zzvj zzc() {
        return zzcx.zza(this.zza);
    }
}
