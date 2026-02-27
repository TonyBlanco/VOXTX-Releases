package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class zzws<JcePrimitiveT> implements zzwy<JcePrimitiveT> {
    private final zzxb<JcePrimitiveT> zza;

    private zzws(zzxb<JcePrimitiveT> zzxbVar) {
        this.zza = zzxbVar;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzwy
    public final JcePrimitiveT zza(String str) throws GeneralSecurityException {
        Iterator<Provider> it = zzwt.zza("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, it.next());
            } catch (Exception e9) {
                if (exc == null) {
                    exc = e9;
                }
            }
        }
        return this.zza.zza(str, null);
    }
}
