package com.google.android.recaptcha.internal;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes3.dex */
final class zzih {
    public static final /* synthetic */ int zza = 0;
    private static final zzih zzb = new zzih();
    private final ConcurrentMap zzd = new ConcurrentHashMap();
    private final zzim zzc = new zzhq();

    private zzih() {
    }

    public static zzih zza() {
        return zzb;
    }

    public final zzil zzb(Class cls) {
        zzgw.zzc(cls, "messageType");
        zzil zzilVarZza = (zzil) this.zzd.get(cls);
        if (zzilVarZza == null) {
            zzilVarZza = this.zzc.zza(cls);
            zzgw.zzc(cls, "messageType");
            zzgw.zzc(zzilVarZza, "schema");
            zzil zzilVar = (zzil) this.zzd.putIfAbsent(cls, zzilVarZza);
            if (zzilVar != null) {
                return zzilVar;
            }
        }
        return zzilVarZza;
    }
}
