package com.google.android.gms.internal.cast;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes3.dex */
final class zztx {
    private static final zztx zza = new zztx();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzub zzb = new zzth();

    private zztx() {
    }

    public static zztx zza() {
        return zza;
    }

    public final zzua zzb(Class cls) {
        zzsq.zzc(cls, "messageType");
        zzua zzuaVarZza = (zzua) this.zzc.get(cls);
        if (zzuaVarZza == null) {
            zzuaVarZza = this.zzb.zza(cls);
            zzsq.zzc(cls, "messageType");
            zzsq.zzc(zzuaVarZza, "schema");
            zzua zzuaVar = (zzua) this.zzc.putIfAbsent(cls, zzuaVarZza);
            if (zzuaVar != null) {
                return zzuaVar;
            }
        }
        return zzuaVarZza;
    }
}
