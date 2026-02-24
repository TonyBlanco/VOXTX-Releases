package com.google.android.gms.internal.common;

import org.jspecify.nullness.NullMarked;

/* JADX INFO: loaded from: classes3.dex */
@NullMarked
public final class zzs {
    public static int zza(int i9, int i10, String str) {
        String strZza;
        if (i9 >= 0 && i9 < i10) {
            return i9;
        }
        if (i9 < 0) {
            strZza = zzy.zza("%s (%s) must not be negative", "index", Integer.valueOf(i9));
        } else {
            if (i10 < 0) {
                throw new IllegalArgumentException("negative size: " + i10);
            }
            strZza = zzy.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i9), Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzb(int i9, int i10, String str) {
        if (i9 < 0 || i9 > i10) {
            throw new IndexOutOfBoundsException(zzd(i9, i10, "index"));
        }
        return i9;
    }

    public static void zzc(int i9, int i10, int i11) {
        if (i9 < 0 || i10 < i9 || i10 > i11) {
            throw new IndexOutOfBoundsException((i9 < 0 || i9 > i11) ? zzd(i9, i11, "start index") : (i10 < 0 || i10 > i11) ? zzd(i10, i11, "end index") : zzy.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i9)));
        }
    }

    private static String zzd(int i9, int i10, String str) {
        if (i9 < 0) {
            return zzy.zza("%s (%s) must not be negative", str, Integer.valueOf(i9));
        }
        if (i10 >= 0) {
            return zzy.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i9), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException("negative size: " + i10);
    }
}
