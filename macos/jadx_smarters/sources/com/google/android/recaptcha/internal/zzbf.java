package com.google.android.recaptcha.internal;

import java.util.List;
import l8.s;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbf implements zzbi {

    @NotNull
    private final zzdo zza;

    public zzbf() {
        this(1);
    }

    public zzbf(int i9) {
        this.zza = zzdo.zza(i9);
    }

    @NotNull
    public final List zwk() {
        return zza();
    }

    @NotNull
    public final List zza() {
        return s.L(this.zza);
    }

    public final boolean zzb(@NotNull List list) {
        this.zza.add(list);
        return true;
    }
}
