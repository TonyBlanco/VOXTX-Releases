package com.google.android.gms.internal.common;

import org.jspecify.nullness.NullMarked;

/* JADX INFO: loaded from: classes3.dex */
@NullMarked
public final class zzah {
    public static Object[] zza(Object[] objArr, int i9) {
        for (int i10 = 0; i10 < i9; i10++) {
            if (objArr[i10] == null) {
                throw new NullPointerException("at index " + i10);
            }
        }
        return objArr;
    }
}
