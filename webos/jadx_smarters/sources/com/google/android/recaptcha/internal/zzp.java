package com.google.android.recaptcha.internal;

import G8.AbstractC0579k;
import G8.C0562b0;
import G8.L;
import G8.M;
import G8.W0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzp {

    @NotNull
    public static final zzp zza = new zzp();

    @NotNull
    private static final L zzb = M.b();

    @NotNull
    private static final L zzc;

    @NotNull
    private static final L zzd;

    static {
        L lA = M.a(W0.d("reCaptcha"));
        AbstractC0579k.d(lA, null, null, new zzo(null), 3, null);
        zzc = lA;
        zzd = M.a(C0562b0.b());
    }

    private zzp() {
    }

    @NotNull
    public static final L zza() {
        return zzd;
    }

    @NotNull
    public static final L zzb() {
        return zzb;
    }

    @NotNull
    public static final L zzc() {
        return zzc;
    }
}
