package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes3.dex */
final class qu extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ qw f24288a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu(qw qwVar, Looper looper) {
        super(looper);
        this.f24288a = qwVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        qw.a(this.f24288a, message);
    }
}
