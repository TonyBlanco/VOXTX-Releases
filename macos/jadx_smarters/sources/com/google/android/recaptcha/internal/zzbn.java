package com.google.android.recaptcha.internal;

import B8.h;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbn {

    @NotNull
    private final zzbm zza;
    private byte zzb;

    @NotNull
    private final HashMap zzc;

    public zzbn() {
        zzbm zzbmVar = new zzbm();
        this.zza = zzbmVar;
        this.zzb = (byte) h.k(new B8.c(1, 127), z8.c.f52855a);
        HashMap map = new HashMap();
        this.zzc = map;
        zzbmVar.zze(173, map);
    }

    public final byte zza() {
        return this.zzb;
    }

    @NotNull
    public final zzbm zzb() {
        return this.zza;
    }

    public final void zzc() {
        this.zza.zzd();
        this.zza.zze(173, this.zzc);
    }

    public final void zzd(byte b9) {
        this.zzb = b9;
    }

    public final void zze(@NotNull int i9, @NotNull Object obj) {
        this.zzc.put(1, obj);
    }
}
