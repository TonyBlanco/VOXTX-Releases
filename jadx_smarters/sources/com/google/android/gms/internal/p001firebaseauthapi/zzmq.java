package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzif;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class zzmq {
    private static final Logger zza = Logger.getLogger(zzmq.class.getName());
    private final ConcurrentMap<String, zza> zzb;
    private final ConcurrentMap<String, Boolean> zzc;

    public interface zza {
        zzbs<?> zza();

        <P> zzbs<P> zza(Class<P> cls) throws GeneralSecurityException;

        Class<?> zzb();

        Set<Class<?>> zzc();
    }

    public zzmq() {
        this.zzb = new ConcurrentHashMap();
        this.zzc = new ConcurrentHashMap();
    }

    public zzmq(zzmq zzmqVar) {
        this.zzb = new ConcurrentHashMap(zzmqVar.zzb);
        this.zzc = new ConcurrentHashMap(zzmqVar.zzc);
    }

    private static <KeyProtoT extends zzakn> zza zza(zznb<KeyProtoT> zznbVar) {
        return new zzmt(zznbVar);
    }

    private final synchronized void zza(zza zzaVar, boolean z9, boolean z10) throws GeneralSecurityException {
        try {
            String strZza = zzaVar.zza().zza();
            if (z10 && this.zzc.containsKey(strZza) && !this.zzc.get(strZza).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type " + strZza);
            }
            zza zzaVar2 = this.zzb.get(strZza);
            if (zzaVar2 != null && !zzaVar2.zzb().equals(zzaVar.zzb())) {
                zza.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type " + strZza);
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", strZza, zzaVar2.zzb().getName(), zzaVar.zzb().getName()));
            }
            if (z9) {
                this.zzb.put(strZza, zzaVar);
            } else {
                this.zzb.putIfAbsent(strZza, zzaVar);
            }
            this.zzc.put(strZza, Boolean.valueOf(z10));
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized zza zzc(String str) throws GeneralSecurityException {
        if (!this.zzb.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return this.zzb.get(str);
    }

    public final zzbs<?> zza(String str) throws GeneralSecurityException {
        return zzc(str).zza();
    }

    public final <P> zzbs<P> zza(String str, Class<P> cls) throws GeneralSecurityException {
        zza zzaVarZzc = zzc(str);
        if (zzaVarZzc.zzc().contains(cls)) {
            return zzaVarZzc.zza(cls);
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(zzaVarZzc.zzb());
        Set<Class<?>> setZzc = zzaVarZzc.zzc();
        StringBuilder sb = new StringBuilder();
        boolean z9 = true;
        for (Class<?> cls2 : setZzc) {
            if (!z9) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z9 = false;
        }
        throw new GeneralSecurityException("Primitive type " + name + " not supported by key manager of type " + strValueOf + ", supported primitives: " + sb.toString());
    }

    public final synchronized <KeyProtoT extends zzakn> void zza(zznb<KeyProtoT> zznbVar, boolean z9) throws GeneralSecurityException {
        if (!zznbVar.zzb().zza()) {
            throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zznbVar.getClass()) + " as it is not FIPS compatible.");
        }
        zza(zza(zznbVar), false, true);
    }

    public final synchronized <KeyProtoT extends zzakn, PublicKeyProtoT extends zzakn> void zza(zzop<KeyProtoT, PublicKeyProtoT> zzopVar, zznb<PublicKeyProtoT> zznbVar, boolean z9) throws GeneralSecurityException {
        zzif.zza zzaVarZzb = zzopVar.zzb();
        zzif.zza zzaVarZzb2 = zznbVar.zzb();
        if (!zzaVarZzb.zza()) {
            throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zzopVar.getClass()) + " as it is not FIPS compatible.");
        }
        if (!zzaVarZzb2.zza()) {
            throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zznbVar.getClass()) + " as it is not FIPS compatible.");
        }
        zza((zza) new zzms(zzopVar, zznbVar), true, true);
        zza(zza(zznbVar), false, false);
    }

    public final boolean zzb(String str) {
        return this.zzc.get(str).booleanValue();
    }
}
