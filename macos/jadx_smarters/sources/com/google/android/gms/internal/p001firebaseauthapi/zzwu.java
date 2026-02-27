package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
final class zzwu<JcePrimitiveT> implements zzwy<JcePrimitiveT> {
    private final zzxb<JcePrimitiveT> zza;

    private zzwu(zzxb<JcePrimitiveT> zzxbVar) {
        this.zza = zzxbVar;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzwy
    public final JcePrimitiveT zza(String str) throws GeneralSecurityException {
        return this.zza.zza(str, null);
    }
}
