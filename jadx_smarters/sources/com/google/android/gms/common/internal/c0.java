package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.common.zzi;
import w4.C2914b;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends zzi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC1404c f26787a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(AbstractC1404c abstractC1404c, Looper looper) {
        super(looper);
        this.f26787a = abstractC1404c;
    }

    public static final void a(Message message) {
        d0 d0Var = (d0) message.obj;
        d0Var.b();
        d0Var.e();
    }

    public static final boolean b(Message message) {
        int i9 = message.what;
        return i9 == 2 || i9 == 1 || i9 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f26787a.zzd.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i9 = message.what;
        if ((i9 == 1 || i9 == 7 || ((i9 == 4 && !this.f26787a.enableLocalFallback()) || message.what == 5)) && !this.f26787a.isConnecting()) {
            a(message);
            return;
        }
        int i10 = message.what;
        if (i10 == 4) {
            this.f26787a.zzB = new C2914b(message.arg2);
            if (AbstractC1404c.zzo(this.f26787a)) {
                AbstractC1404c abstractC1404c = this.f26787a;
                if (!abstractC1404c.zzC) {
                    abstractC1404c.a(3, null);
                    return;
                }
            }
            AbstractC1404c abstractC1404c2 = this.f26787a;
            C2914b c2914b = abstractC1404c2.zzB != null ? abstractC1404c2.zzB : new C2914b(8);
            this.f26787a.zzc.c(c2914b);
            this.f26787a.onConnectionFailed(c2914b);
            return;
        }
        if (i10 == 5) {
            AbstractC1404c abstractC1404c3 = this.f26787a;
            C2914b c2914b2 = abstractC1404c3.zzB != null ? abstractC1404c3.zzB : new C2914b(8);
            this.f26787a.zzc.c(c2914b2);
            this.f26787a.onConnectionFailed(c2914b2);
            return;
        }
        if (i10 == 3) {
            Object obj = message.obj;
            C2914b c2914b3 = new C2914b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f26787a.zzc.c(c2914b3);
            this.f26787a.onConnectionFailed(c2914b3);
            return;
        }
        if (i10 == 6) {
            this.f26787a.a(5, null);
            AbstractC1404c abstractC1404c4 = this.f26787a;
            if (abstractC1404c4.zzw != null) {
                abstractC1404c4.zzw.onConnectionSuspended(message.arg2);
            }
            this.f26787a.onConnectionSuspended(message.arg2);
            AbstractC1404c.zzn(this.f26787a, 5, 1, null);
            return;
        }
        if (i10 == 2 && !this.f26787a.isConnected()) {
            a(message);
            return;
        }
        if (b(message)) {
            ((d0) message.obj).c();
            return;
        }
        Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
    }
}
