package com.google.android.gms.internal.p001firebaseauthapi;

import java.lang.Enum;
import java.security.GeneralSecurityException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzmi<E extends Enum<E>, O> {
    private final Map<E, O> zza;
    private final Map<O, E> zzb;

    private zzmi(Map<E, O> map, Map<O, E> map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public static <E extends Enum<E>, O> zzml<E, O> zza() {
        return new zzml<>();
    }

    public final E zza(O o9) throws GeneralSecurityException {
        E e9 = this.zzb.get(o9);
        if (e9 != null) {
            return e9;
        }
        throw new GeneralSecurityException("Unable to convert object enum: " + String.valueOf(o9));
    }

    public final O zza(E e9) throws GeneralSecurityException {
        O o9 = this.zza.get(e9);
        if (o9 != null) {
            return o9;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: " + String.valueOf(e9));
    }
}
