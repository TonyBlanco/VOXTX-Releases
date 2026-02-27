package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vw implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f24924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f24925b;

    public /* synthetic */ vw(Handler handler, int i9) {
        this.f24925b = i9;
        this.f24924a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i9 = this.f24925b;
        this.f24924a.post(runnable);
    }
}
