package com.google.android.recaptcha.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcq {

    @NotNull
    public static final zzcp zza = new zzcp(null);
    private int zzb;

    public zzcq(short s9, short s10) {
        this.zzb = Math.abs((int) s9);
    }

    public final short zza() {
        int i9 = ((this.zzb * 4391) + 277) % 32779;
        this.zzb = i9;
        return (short) (i9 % 255);
    }
}
