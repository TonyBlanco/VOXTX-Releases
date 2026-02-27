package com.google.android.recaptcha.internal;

import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzn {

    @NotNull
    public static final zzm zza = new zzm(null);
    private final long zzb = System.currentTimeMillis();

    @NotNull
    private final zzdk zzc = zzdk.zzb();

    public final long zza(@NotNull TimeUnit timeUnit) {
        return this.zzc.zza(timeUnit);
    }

    public final long zzb() {
        return this.zzb;
    }
}
