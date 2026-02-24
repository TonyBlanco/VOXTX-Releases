package com.google.android.gms.internal.location;

import J4.AbstractC0665y;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzf extends AbstractC0665y {
    public zzf(GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ h createFailedResult(Status status) {
        return status;
    }
}
