package com.google.android.gms.internal.cast;

import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes3.dex */
public class zzfc {
    public static int zza(int i9, int i10) {
        if (i10 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int i11 = i9 + (i9 >> 1) + 1;
        if (i11 < i10) {
            int iHighestOneBit = Integer.highestOneBit(i10 - 1);
            i11 = iHighestOneBit + iHighestOneBit;
        }
        return i11 < 0 ? a.e.API_PRIORITY_OTHER : i11;
    }
}
