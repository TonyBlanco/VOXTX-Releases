package com.google.android.gms.internal.p001firebaseauthapi;

import java.lang.Enum;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzml<E extends Enum<E>, O> {
    private Map<E, O> zza;
    private Map<O, E> zzb;

    private zzml() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zzmi<E, O> zza() {
        return new zzmi<>(Collections.unmodifiableMap(this.zza), Collections.unmodifiableMap(this.zzb));
    }

    public final zzml<E, O> zza(E e9, O o9) {
        this.zza.put(e9, o9);
        this.zzb.put(o9, e9);
        return this;
    }
}
