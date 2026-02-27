package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.signals.SecureSignalsInitializeCallback;

/* JADX INFO: loaded from: classes3.dex */
final class alr implements SecureSignalsInitializeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ alt f20150a;

    public alr(alt altVar) {
        this.f20150a = altVar;
    }

    @Override // com.google.ads.interactivemedia.v3.api.signals.SecureSignalsInitializeCallback
    public final void onFailure(Exception exc) {
        this.f20150a.f20156d.trySetException(exc);
    }

    @Override // com.google.ads.interactivemedia.v3.api.signals.SecureSignalsInitializeCallback
    public final void onSuccess() {
        this.f20150a.f20156d.trySetResult(null);
    }
}
