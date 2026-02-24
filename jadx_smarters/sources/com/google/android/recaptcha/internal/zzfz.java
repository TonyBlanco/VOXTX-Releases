package com.google.android.recaptcha.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfz {
    static final zzfz zza = new zzfz(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc;
    private final Map zzd;

    public zzfz() {
        this.zzd = new HashMap();
    }

    public zzfz(boolean z9) {
        this.zzd = Collections.emptyMap();
    }

    public final zzgm zza(zzhy zzhyVar, int i9) {
        return (zzgm) this.zzd.get(new zzfy(zzhyVar, i9));
    }
}
