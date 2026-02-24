package com.google.android.gms.internal.cast;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.BasePendingResult;
import o4.C2328e;
import t4.C2775b;

/* JADX INFO: loaded from: classes3.dex */
final class zzbp extends BasePendingResult {
    private final zzbq zza;

    public zzbp(zzbq zzbqVar) {
        super(null);
        this.zza = zzbqVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final h createFailedResult(Status status) {
        C2775b c2775b = C2328e.f45868o;
        return status;
    }
}
