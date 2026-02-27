package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzvg;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcj<P> {
    private final Class<P> zza;
    private ConcurrentMap<zzck, List<zzcl<P>>> zzb;
    private final List<zzcl<P>> zzc;
    private zzcl<P> zzd;
    private zzrn zze;

    private zzcj(Class<P> cls) {
        this.zzb = new ConcurrentHashMap();
        this.zzc = new ArrayList();
        this.zza = cls;
        this.zze = zzrn.zza;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.internal.p001firebaseauthapi.zzcj<P> zza(P r13, P r14, com.google.android.gms.internal.firebase-auth-api.zzvg.zzb r15, boolean r16) throws java.security.GeneralSecurityException {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzcj.zza(java.lang.Object, java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzvg$zzb, boolean):com.google.android.gms.internal.firebase-auth-api.zzcj");
    }

    public final zzcg<P> zza() throws GeneralSecurityException {
        ConcurrentMap<zzck, List<zzcl<P>>> concurrentMap = this.zzb;
        if (concurrentMap == null) {
            throw new IllegalStateException("build cannot be called twice");
        }
        zzcg<P> zzcgVar = new zzcg<>(concurrentMap, this.zzc, this.zzd, this.zze, this.zza);
        this.zzb = null;
        return zzcgVar;
    }

    public final zzcj<P> zza(zzrn zzrnVar) {
        if (this.zzb == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }
        this.zze = zzrnVar;
        return this;
    }

    public final zzcj<P> zza(P p9, P p10, zzvg.zzb zzbVar) throws GeneralSecurityException {
        return zza(p9, p10, zzbVar, false);
    }

    public final zzcj<P> zzb(P p9, P p10, zzvg.zzb zzbVar) throws GeneralSecurityException {
        return zza(p9, p10, zzbVar, true);
    }
}
