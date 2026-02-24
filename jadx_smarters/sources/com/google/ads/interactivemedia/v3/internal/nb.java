package com.google.ads.interactivemedia.v3.internal;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"HandlerLeak"})
final class nb extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ nj f23858a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb(nj njVar, Looper looper) {
        super(looper);
        this.f23858a = njVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        byte[] bArr = (byte[]) message.obj;
        if (bArr == null) {
            return;
        }
        for (my myVar : this.f23858a.f23878j) {
            if (myVar.n(bArr)) {
                myVar.i(message.what);
                return;
            }
        }
    }
}
