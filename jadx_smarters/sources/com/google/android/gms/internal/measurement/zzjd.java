package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class zzjd {
    public static Object zza(Object obj, int i9) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i9);
    }

    public static Object[] zzb(Object[] objArr, int i9) {
        for (int i10 = 0; i10 < i9; i10++) {
            zza(objArr[i10], i10);
        }
        return objArr;
    }
}
