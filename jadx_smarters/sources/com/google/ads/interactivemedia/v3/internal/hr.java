package com.google.ads.interactivemedia.v3.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
final class hr extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ hs f23184a;

    public /* synthetic */ hr(hs hsVar) {
        this.f23184a = hsVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        final hs hsVar = this.f23184a;
        hsVar.f23186b.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.hq
            @Override // java.lang.Runnable
            public final void run() {
                hsVar.h();
            }
        });
    }
}
