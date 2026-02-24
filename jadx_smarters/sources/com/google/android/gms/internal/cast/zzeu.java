package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeu {
    public static int zza(int i9, int i10, String str) {
        String strZzb;
        if (i9 >= 0 && i9 < i10) {
            return i9;
        }
        if (i9 < 0) {
            strZzb = zzew.zzb("%s (%s) must not be negative", "index", Integer.valueOf(i9));
        } else {
            if (i10 < 0) {
                throw new IllegalArgumentException("negative size: " + i10);
            }
            strZzb = zzew.zzb("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i9), Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException(strZzb);
    }

    public static int zzb(int i9, int i10, String str) {
        if (i9 < 0 || i9 > i10) {
            throw new IndexOutOfBoundsException(zze(i9, i10, "index"));
        }
        return i9;
    }

    public static Object zzc(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static void zzd(int i9, int i10, int i11) {
        if (i9 < 0 || i10 < i9 || i10 > i11) {
            throw new IndexOutOfBoundsException((i9 < 0 || i9 > i11) ? zze(i9, i11, "start index") : (i10 < 0 || i10 > i11) ? zze(i10, i11, "end index") : zzew.zzb("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i9)));
        }
    }

    private static String zze(int i9, int i10, String str) {
        if (i9 < 0) {
            return zzew.zzb("%s (%s) must not be negative", str, Integer.valueOf(i9));
        }
        if (i10 >= 0) {
            return zzew.zzb("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i9), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException("negative size: " + i10);
    }
}
