package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1403b {
    public static com.google.android.gms.common.api.b a(Status status) {
        return status.K() ? new com.google.android.gms.common.api.g(status) : new com.google.android.gms.common.api.b(status);
    }
}
