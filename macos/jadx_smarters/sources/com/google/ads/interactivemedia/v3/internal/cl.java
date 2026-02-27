package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes3.dex */
final class cl implements bu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Message f22628a;

    private cl() {
    }

    public /* synthetic */ cl(byte[] bArr) {
    }

    private final void d() {
        this.f22628a = null;
        cm.k(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bu
    public final void a() {
        Message message = this.f22628a;
        af.s(message);
        message.sendToTarget();
        d();
    }

    public final boolean b(Handler handler) {
        Message message = this.f22628a;
        af.s(message);
        boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        d();
        return zSendMessageAtFrontOfQueue;
    }

    public final void c(Message message) {
        this.f22628a = message;
    }
}
