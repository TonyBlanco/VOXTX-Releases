package com.google.android.recaptcha.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcl implements zzby {

    @NotNull
    public static final zzcl zza = new zzcl();

    private zzcl() {
    }

    @Override // com.google.android.recaptcha.internal.zzby
    public final void zza(int i9, @NotNull zzbl zzblVar, @NotNull Object... objArr) throws zzt {
        if (objArr.length != 1) {
            throw new zzt(4, 3, null);
        }
        Object obj = objArr[0];
        if (true != (obj instanceof Byte)) {
            obj = null;
        }
        Byte b9 = (Byte) obj;
        if (b9 == null) {
            throw new zzt(4, 5, null);
        }
        zzblVar.zzh(b9.byteValue());
    }
}
