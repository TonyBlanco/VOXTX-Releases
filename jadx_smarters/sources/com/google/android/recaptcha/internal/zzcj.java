package com.google.android.recaptcha.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcj implements zzby {

    @NotNull
    public static final zzcj zza = new zzcj();

    private zzcj() {
    }

    @Override // com.google.android.recaptcha.internal.zzby
    public final void zza(int i9, @NotNull zzbl zzblVar, @NotNull Object... objArr) throws zzt {
        if (objArr.length != 1) {
            throw new zzt(4, 3, null);
        }
        zzblVar.zzc().zzf(i9, objArr[0]);
    }
}
