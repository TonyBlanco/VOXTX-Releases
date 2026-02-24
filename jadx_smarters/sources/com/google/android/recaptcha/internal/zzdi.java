package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdi {
    public static void zza(boolean z9) {
        if (!z9) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzb(boolean z9, Object obj) {
        if (!z9) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzc(boolean z9, String str, char c9) {
        if (!z9) {
            throw new IllegalArgumentException(zzdl.zza(str, Character.valueOf(c9)));
        }
    }

    public static void zzd(int i9, int i10, int i11) {
        if (i9 < 0 || i10 < i9 || i10 > i11) {
            throw new IndexOutOfBoundsException((i9 < 0 || i9 > i11) ? zzf(i9, i11, "start index") : (i10 < 0 || i10 > i11) ? zzf(i10, i11, "end index") : zzdl.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i9)));
        }
    }

    public static void zze(boolean z9, Object obj) {
        if (!z9) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zzf(int i9, int i10, String str) {
        return i9 < 0 ? zzdl.zza("%s (%s) must not be negative", str, Integer.valueOf(i9)) : zzdl.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i9), Integer.valueOf(i10));
    }
}
