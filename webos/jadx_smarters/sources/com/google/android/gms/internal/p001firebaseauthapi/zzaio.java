package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaio {
    static final zzaio zza = new zzaio(true);
    private static volatile boolean zzb = false;
    private static boolean zzc = true;
    private final Map<zzair, zzajc.zzd<?, ?>> zzd;

    public zzaio() {
        this.zzd = new HashMap();
    }

    private zzaio(boolean z9) {
        this.zzd = Collections.emptyMap();
    }

    public static zzaio zza() {
        return zza;
    }

    public final <ContainingType extends zzakn> zzajc.zzd<ContainingType, ?> zza(ContainingType containingtype, int i9) {
        return (zzajc.zzd) this.zzd.get(new zzair(containingtype, i9));
    }
}
