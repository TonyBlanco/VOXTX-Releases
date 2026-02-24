package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zau;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC1354b0 extends zau {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1356c0 f26585a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC1354b0(C1356c0 c1356c0, Looper looper) {
        super(looper);
        this.f26585a = c1356c0;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i9 = message.what;
        if (i9 == 1) {
            ((AbstractC1352a0) message.obj).b(this.f26585a);
        } else {
            if (i9 == 2) {
                throw ((RuntimeException) message.obj);
            }
            Log.w("GACStateManager", "Unknown message id: " + i9);
        }
    }
}
