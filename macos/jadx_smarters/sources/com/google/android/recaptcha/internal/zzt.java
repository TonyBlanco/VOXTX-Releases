package com.google.android.recaptcha.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzt extends Exception {

    @Nullable
    private final Throwable zza;

    @NotNull
    private final zzmi zzb;

    @NotNull
    private final int zzc;

    @NotNull
    private final int zzd;

    public zzt(@NotNull int i9, @NotNull int i10, @Nullable Throwable th) {
        this.zzc = i9;
        this.zzd = i10;
        this.zza = th;
        zzmi zzmiVarZzf = zzmj.zzf();
        zzmiVarZzf.zze(i10);
        zzmiVarZzf.zzp(i9);
        this.zzb = zzmiVarZzf;
    }

    @Override // java.lang.Throwable
    @Nullable
    public final Throwable getCause() {
        return this.zza;
    }

    @NotNull
    public final zzmi zza() {
        return this.zzb;
    }
}
