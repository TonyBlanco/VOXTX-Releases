package com.google.android.recaptcha.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzca implements zzby {

    @NotNull
    public static final zzca zza = new zzca();

    private zzca() {
    }

    @Override // com.google.android.recaptcha.internal.zzby
    public final void zza(int i9, @NotNull zzbl zzblVar, @NotNull Object... objArr) throws zzt {
        if (objArr.length != 1) {
            throw new zzt(4, 3, null);
        }
        Object objZza = objArr[0];
        if (true != (objZza instanceof Object)) {
            objZza = null;
        }
        if (objZza == null) {
            throw new zzt(4, 5, null);
        }
        try {
            if (objZza instanceof String) {
                objZza = zzbx.zza(this, (String) objZza, zzblVar.zza());
            }
            zzblVar.zzc().zzf(i9, zzbk.zza(objZza));
        } catch (Exception e9) {
            throw new zzt(6, 8, e9);
        }
    }
}
