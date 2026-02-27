package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zau;

/* JADX INFO: loaded from: classes3.dex */
public final class W extends zau {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y f26543a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(Y y9, Looper looper) {
        super(looper);
        this.f26543a = y9;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i9 = message.what;
        if (i9 == 1) {
            Y.r(this.f26543a);
            return;
        }
        if (i9 == 2) {
            Y.q(this.f26543a);
            return;
        }
        Log.w("GoogleApiClientImpl", "Unknown message id: " + i9);
    }
}
