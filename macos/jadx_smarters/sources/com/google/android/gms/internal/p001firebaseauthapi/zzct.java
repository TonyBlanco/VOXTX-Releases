package com.google.android.gms.internal.p001firebaseauthapi;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class zzct {
    private static final Logger zza = Logger.getLogger(zzct.class.getName());
    private static final AtomicReference<zzmq> zzb = new AtomicReference<>(new zzmq());
    private static final ConcurrentMap<String, Object> zzc = new ConcurrentHashMap();
    private static final Set<Class<?>> zzd;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(zzbg.class);
        hashSet.add(zzbp.class);
        hashSet.add(zzcv.class);
        hashSet.add(zzbr.class);
        hashSet.add(zzbo.class);
        hashSet.add(zzce.class);
        hashSet.add(zzrx.class);
        hashSet.add(zzcr.class);
        hashSet.add(zzcq.class);
        zzd = Collections.unmodifiableSet(hashSet);
    }

    private zzct() {
    }

    @Deprecated
    private static <P> zzbs<P> zza(String str) throws GeneralSecurityException {
        return (zzbs<P>) zzb.get().zza(str);
    }

    public static synchronized zzuy zza(zzvb zzvbVar) throws GeneralSecurityException {
        zzbs<?> zzbsVarZza;
        AtomicReference<zzmq> atomicReference = zzb;
        zzbsVarZza = atomicReference.get().zza(zzvbVar.zzf());
        if (!atomicReference.get().zzb(zzvbVar.zzf())) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + zzvbVar.zzf());
        }
        return zzbsVarZza.zza(zzvbVar.zze());
    }

    public static zzuy zza(String str, zzahp zzahpVar) throws GeneralSecurityException {
        zzbs zzbsVarZza = zza(str);
        if (zzbsVarZza instanceof zzco) {
            return ((zzco) zzbsVarZza).zzc(zzahpVar);
        }
        throw new GeneralSecurityException("manager for key type " + str + " is not a PrivateKeyManager");
    }

    public static Class<?> zza(Class<?> cls) {
        try {
            return zznr.zza().zza(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static <B, P> P zza(zzcg<B> zzcgVar, Class<P> cls) throws GeneralSecurityException {
        return (P) zznr.zza().zza(zzcgVar, cls);
    }

    @Deprecated
    public static <P> P zza(zzuy zzuyVar) throws GeneralSecurityException {
        String strZzf = zzuyVar.zzf();
        return (P) zza(strZzf).zzb(zzuyVar.zze());
    }

    public static <P> P zza(zzuy zzuyVar, Class<P> cls) throws GeneralSecurityException {
        return (P) zza(zzuyVar.zzf(), zzuyVar.zze(), cls);
    }

    public static <P> P zza(String str, zzahp zzahpVar, Class<P> cls) throws GeneralSecurityException {
        return zzb.get().zza(str, cls).zzb(zzahpVar);
    }

    public static <P> P zza(String str, byte[] bArr, Class<P> cls) throws GeneralSecurityException {
        return (P) zza(str, zzahp.zza(bArr), cls);
    }

    public static synchronized <B, P> void zza(zzcp<B, P> zzcpVar) throws GeneralSecurityException {
        zznr.zza().zza(zzcpVar);
    }

    public static synchronized <KeyProtoT extends zzakn> void zza(zznb<KeyProtoT> zznbVar, boolean z9) throws GeneralSecurityException {
        AtomicReference<zzmq> atomicReference = zzb;
        zzmq zzmqVar = new zzmq(atomicReference.get());
        zzmqVar.zza((zznb) zznbVar, true);
        atomicReference.set(zzmqVar);
    }

    public static synchronized <KeyProtoT extends zzakn, PublicKeyProtoT extends zzakn> void zza(zzop<KeyProtoT, PublicKeyProtoT> zzopVar, zznb<PublicKeyProtoT> zznbVar, boolean z9) throws GeneralSecurityException {
        AtomicReference<zzmq> atomicReference = zzb;
        zzmq zzmqVar = new zzmq(atomicReference.get());
        zzmqVar.zza((zzop) zzopVar, (zznb) zznbVar, true);
        atomicReference.set(zzmqVar);
    }
}
