package com.google.android.recaptcha.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzck implements zzby {

    @NotNull
    public static final zzck zza = new zzck();

    private zzck() {
    }

    @Override // com.google.android.recaptcha.internal.zzby
    public final void zza(int i9, @NotNull zzbl zzblVar, @NotNull Object... objArr) throws zzt {
        if (objArr.length != 1) {
            throw new zzt(4, 3, null);
        }
        Object obj = objArr[0];
        if (true != (obj instanceof String)) {
            obj = null;
        }
        String str = (String) obj;
        if (str == null) {
            throw new zzt(4, 5, null);
        }
        zzblVar.zzf(str);
    }
}
