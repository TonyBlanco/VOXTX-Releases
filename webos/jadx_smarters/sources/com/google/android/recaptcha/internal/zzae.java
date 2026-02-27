package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzae {

    @NotNull
    private final String zza;
    private final long zzb;
    private final int zzc;

    public zzae(@NotNull String str, long j9, int i9) {
        this.zza = str;
        this.zzb = j9;
        this.zzc = i9;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof zzae)) {
            return false;
        }
        zzae zzaeVar = (zzae) obj;
        return l.a(zzaeVar.zza, this.zza) && zzaeVar.zzb == this.zzb && zzaeVar.zzc == this.zzc;
    }

    public final int zza() {
        return this.zzc;
    }

    public final long zzb() {
        return this.zzb;
    }

    @NotNull
    public final String zzc() {
        return this.zza;
    }
}
