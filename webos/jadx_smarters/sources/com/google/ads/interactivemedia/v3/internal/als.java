package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.signals.SecureSignalsCollectSignalsCallback;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
final class als implements SecureSignalsCollectSignalsCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f20151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ alt f20152b;

    public als(alt altVar, TaskCompletionSource taskCompletionSource) {
        this.f20152b = altVar;
        this.f20151a = taskCompletionSource;
    }

    @Override // com.google.ads.interactivemedia.v3.api.signals.SecureSignalsCollectSignalsCallback
    public final void onFailure(Exception exc) {
        this.f20151a.trySetException(exc);
    }

    @Override // com.google.ads.interactivemedia.v3.api.signals.SecureSignalsCollectSignalsCallback
    public final void onSuccess(String str) {
        this.f20151a.trySetResult(com.google.ads.interactivemedia.v3.impl.data.bw.createBy3rdPartyData(this.f20152b.f20153a.getVersion(), this.f20152b.f20153a.getSDKVersion(), this.f20152b.e(), str));
    }
}
