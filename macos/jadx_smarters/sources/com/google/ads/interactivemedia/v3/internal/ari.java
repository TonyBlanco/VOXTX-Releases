package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
final class ari extends aqw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f20571a;

    public ari(TaskCompletionSource taskCompletionSource) {
        this.f20571a = taskCompletionSource;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqx
    public final void b(int i9) {
        this.f20571a.trySetException(new arf(i9));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqx
    public final void c(arc arcVar) {
        this.f20571a.trySetResult(arcVar.a());
    }
}
