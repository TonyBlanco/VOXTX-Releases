package com.google.ads.interactivemedia.v3.internal;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"HandlerLeak"})
final class mw extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ my f23822a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw(my myVar, Looper looper) {
        super(looper);
        this.f23822a = myVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i9 = message.what;
        if (i9 == 0) {
            my.g(this.f23822a, obj, obj2);
        } else {
            if (i9 != 1) {
                return;
            }
            my.f(this.f23822a, obj, obj2);
        }
    }
}
