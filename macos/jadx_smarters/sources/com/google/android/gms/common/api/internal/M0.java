package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zau;

/* JADX INFO: loaded from: classes3.dex */
public final class M0 extends zau {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O0 f26497a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0(O0 o02, Looper looper) {
        super(looper);
        this.f26497a = o02;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i9 = message.what;
        if (i9 != 0) {
            if (i9 == 1) {
                RuntimeException runtimeException = (RuntimeException) message.obj;
                Log.e("TransformedResultImpl", "Runtime exception on the transformation worker thread: ".concat(String.valueOf(runtimeException.getMessage())));
                throw runtimeException;
            }
            Log.e("TransformedResultImpl", "TransformationResultHandler received unknown message type: " + i9);
            return;
        }
        com.google.android.gms.common.api.f fVar = (com.google.android.gms.common.api.f) message.obj;
        synchronized (this.f26497a.f26502c) {
            try {
                O0 o02 = (O0) com.google.android.gms.common.internal.r.m(this.f26497a.f26500a);
                if (fVar == null) {
                    o02.h(new Status(13, "Transform returned null"));
                } else {
                    o02.g(fVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
