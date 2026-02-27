package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzms {
    private static final zzgr zza = new zzmr();

    public static int zza(int i9) {
        if (i9 != 1) {
            return i9 - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
