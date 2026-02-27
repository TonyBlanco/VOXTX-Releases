package com.amazonaws.internal;

import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes.dex */
public class DynamoDBBackoffStrategy extends CustomBackoffStrategy {
    public static final CustomBackoffStrategy DEFAULT = new DynamoDBBackoffStrategy();

    @Override // com.amazonaws.internal.CustomBackoffStrategy
    public int getBackoffPeriod(int i9) {
        if (i9 <= 0) {
            return 0;
        }
        int iPow = ((int) Math.pow(2.0d, i9 - 1)) * 50;
        return iPow < 0 ? a.e.API_PRIORITY_OTHER : iPow;
    }
}
