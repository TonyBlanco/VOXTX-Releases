package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzkn {
    static final zzkn zza = new zzkn(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc;
    private static volatile zzkn zzd;
    private final Map zze;

    public zzkn() {
        this.zze = new HashMap();
    }

    public zzkn(boolean z9) {
        this.zze = Collections.emptyMap();
    }

    public static zzkn zza() {
        zzkn zzknVar = zzd;
        if (zzknVar != null) {
            return zzknVar;
        }
        synchronized (zzkn.class) {
            try {
                zzkn zzknVar2 = zzd;
                if (zzknVar2 != null) {
                    return zzknVar2;
                }
                zzkn zzknVarZzb = zzkv.zzb(zzkn.class);
                zzd = zzknVarZzb;
                return zzknVarZzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzkz zzb(zzmi zzmiVar, int i9) {
        return (zzkz) this.zze.get(new zzkm(zzmiVar, i9));
    }
}
