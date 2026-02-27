package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzpy implements zzcp<zzpz, zzpz> {
    private static final zzpy zza = new zzpy();

    private zzpy() {
    }

    public static void zzc() throws GeneralSecurityException {
        zzct.zza(zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzcp
    public final Class<zzpz> zza() {
        return zzpz.class;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzcp
    public final /* synthetic */ zzpz zza(zzcg<zzpz> zzcgVar) throws GeneralSecurityException {
        if (zzcgVar == null) {
            throw new GeneralSecurityException("primitive set must be non-null");
        }
        if (zzcgVar.zza() == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator<List<zzcl<zzpz>>> it = zzcgVar.zzd().iterator();
        while (it.hasNext()) {
            Iterator<zzcl<zzpz>> it2 = it.next().iterator();
            while (it2.hasNext()) {
                it2.next().zze();
            }
        }
        return new zzqb(zzcgVar);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzcp
    public final Class<zzpz> zzb() {
        return zzpz.class;
    }
}
