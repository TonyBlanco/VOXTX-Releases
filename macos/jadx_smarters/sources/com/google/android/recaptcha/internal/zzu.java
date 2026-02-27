package com.google.android.recaptcha.internal;

import android.content.Context;
import android.os.Build;
import org.jetbrains.annotations.NotNull;
import w4.C2921i;

/* JADX INFO: loaded from: classes3.dex */
public final class zzu {

    @NotNull
    public static final zzu zza = new zzu();

    @NotNull
    private static final String zzb = String.valueOf(Build.VERSION.SDK_INT);

    @NotNull
    private static final C2921i zzc = C2921i.h();

    private zzu() {
    }

    @NotNull
    public static final String zza(@NotNull Context context) {
        int i9 = zzc.i(context);
        return (i9 == 1 || i9 == 3 || i9 == 9) ? "ANDROID_OFFPLAY" : "ANDROID_ONPLAY";
    }

    @NotNull
    public static final String zzb() {
        return zzb;
    }
}
