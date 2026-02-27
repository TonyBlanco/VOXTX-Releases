package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class avh {
    public static int e(int i9, int i10) {
        int i11 = i9 + (i9 >> 1) + 1;
        if (i11 < i10) {
            int iHighestOneBit = Integer.highestOneBit(i10 - 1);
            i11 = iHighestOneBit + iHighestOneBit;
        }
        return i11 < 0 ? a.e.API_PRIORITY_OTHER : i11;
    }

    public abstract void b(Object obj);
}
