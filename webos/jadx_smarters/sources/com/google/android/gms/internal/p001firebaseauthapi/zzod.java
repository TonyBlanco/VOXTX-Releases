package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzbt;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzod<KeyT extends zzbt, PrimitiveT> {
    private final Class<KeyT> zza;
    private final Class<PrimitiveT> zzb;

    private zzod(Class<KeyT> cls, Class<PrimitiveT> cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static <KeyT extends zzbt, PrimitiveT> zzod<KeyT, PrimitiveT> zza(zzof<KeyT, PrimitiveT> zzofVar, Class<KeyT> cls, Class<PrimitiveT> cls2) {
        return new zzog(cls, cls2, zzofVar);
    }

    public final Class<KeyT> zza() {
        return this.zza;
    }

    public abstract PrimitiveT zza(KeyT keyt) throws GeneralSecurityException;

    public final Class<PrimitiveT> zzb() {
        return this.zzb;
    }
}
