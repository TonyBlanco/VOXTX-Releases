package com.google.ads.interactivemedia.v3.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
final class eh extends BroadcastReceiver implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ej f22781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ei f22782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f22783c;

    public eh(ej ejVar, Handler handler, ei eiVar) {
        this.f22781a = ejVar;
        this.f22783c = handler;
        this.f22782b = eiVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f22783c.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
