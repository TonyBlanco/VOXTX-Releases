package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zzef {
    public static void zza(boolean z9, String str, long j9, long j10) {
        if (z9) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + j9 + ", " + j10 + ")");
    }

    public static void zzb(boolean z9) {
        if (!z9) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
