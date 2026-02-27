package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes3.dex */
public class zzam<E> {
    public static int zza(int i9, int i10) {
        if (i10 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int iHighestOneBit = i9 + (i9 >> 1) + 1;
        if (iHighestOneBit < i10) {
            iHighestOneBit = Integer.highestOneBit(i10 - 1) << 1;
        }
        return iHighestOneBit < 0 ? a.e.API_PRIORITY_OTHER : iHighestOneBit;
    }
}
