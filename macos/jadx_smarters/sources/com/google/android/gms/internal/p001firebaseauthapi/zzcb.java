package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzvg;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcb {
    private final zzvg.zza zza;

    private zzcb(zzvg.zza zzaVar) {
        this.zza = zzaVar;
    }

    private final synchronized int zza(zzvb zzvbVar, boolean z9) throws GeneralSecurityException {
        zzvg.zzb zzbVarZza;
        zzbVarZza = zza(zzvbVar);
        this.zza.zza(zzbVarZza);
        return zzbVarZza.zza();
    }

    public static zzcb zza(zzbx zzbxVar) {
        return new zzcb(zzbxVar.zzb().zzn());
    }

    private final synchronized zzvg.zzb zza(zzuy zzuyVar, zzvs zzvsVar) throws GeneralSecurityException {
        int iZzc;
        iZzc = zzc();
        if (zzvsVar == zzvs.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return (zzvg.zzb) ((zzajc) zzvg.zzb.zzd().zza(zzuyVar).zza(iZzc).zza(zzuz.ENABLED).zza(zzvsVar).zzf());
    }

    private final synchronized zzvg.zzb zza(zzvb zzvbVar) throws GeneralSecurityException {
        return zza(zzct.zza(zzvbVar), zzvbVar.zzd());
    }

    public static zzcb zzb() {
        return new zzcb(zzvg.zzc());
    }

    private final synchronized boolean zzb(int i9) {
        Iterator<zzvg.zzb> it = this.zza.zzb().iterator();
        while (it.hasNext()) {
            if (it.next().zza() == i9) {
                return true;
            }
        }
        return false;
    }

    private final synchronized int zzc() {
        int iZza;
        do {
            iZza = zzpf.zza();
        } while (zzb(iZza));
        return iZza;
    }

    public final synchronized zzbx zza() throws GeneralSecurityException {
        return zzbx.zza((zzvg) ((zzajc) this.zza.zzf()));
    }

    public final synchronized zzcb zza(int i9) throws GeneralSecurityException {
        for (int i10 = 0; i10 < this.zza.zza(); i10++) {
            zzvg.zzb zzbVarZzb = this.zza.zzb(i10);
            if (zzbVarZzb.zza() == i9) {
                if (!zzbVarZzb.zzc().equals(zzuz.ENABLED)) {
                    throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i9);
                }
                this.zza.zza(i9);
            }
        }
        throw new GeneralSecurityException("key not found: " + i9);
        return this;
    }

    public final synchronized zzcb zza(zzbu zzbuVar) throws GeneralSecurityException {
        zza(zzbuVar.zza(), false);
        return this;
    }
}
