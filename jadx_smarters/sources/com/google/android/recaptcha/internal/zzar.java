package com.google.android.recaptcha.internal;

import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzar {

    @NotNull
    public static final zzar zza = new zzar();

    private zzar() {
    }

    @NotNull
    public static final zzlg zza(@NotNull zzn zznVar, @NotNull zzn zznVar2) {
        zzlf zzlfVarZzf = zzlg.zzf();
        zzlfVarZzf.zzp(zzka.zzb(zznVar.zzb()));
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        zzlfVarZzf.zzq(zzjy.zzb(zznVar.zza(timeUnit)));
        zzlfVarZzf.zzd(zzka.zzb(zznVar2.zzb()));
        zzlfVarZzf.zze(zzjy.zzb(zznVar2.zza(timeUnit)));
        return (zzlg) zzlfVarZzf.zzj();
    }
}
