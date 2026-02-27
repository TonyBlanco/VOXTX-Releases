package com.google.ads.interactivemedia.v3.internal;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"HandlerLeak"})
final class mu extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ my f23815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f23816b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu(my myVar, Looper looper) {
        super(looper);
        this.f23815a = myVar;
    }

    public final void a(int i9, Object obj, boolean z9) {
        obtainMessage(i9, new mv(sw.a(), z9, SystemClock.elapsedRealtime(), obj)).sendToTarget();
    }

    public final synchronized void b() {
        removeCallbacksAndMessages(null);
        this.f23816b = true;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object objB;
        mv mvVar = (mv) message.obj;
        try {
            int i9 = message.what;
            if (i9 == 0) {
                objB = this.f23815a.f23824b.b((zo) mvVar.f23820d);
            } else {
                if (i9 != 1) {
                    throw new RuntimeException();
                }
                my myVar = this.f23815a;
                objB = myVar.f23824b.c(myVar.f23825c, (aeq) mvVar.f23820d);
            }
        } catch (ok e9) {
            mv mvVar2 = (mv) message.obj;
            if (mvVar2.f23818b) {
                int i10 = mvVar2.f23821e + 1;
                mvVar2.f23821e = i10;
                if (i10 <= ws.c(3)) {
                    int i11 = sw.f24552a;
                    SystemClock.elapsedRealtime();
                    SystemClock.elapsedRealtime();
                    long jE = ws.e(new bdz(e9.getCause() instanceof IOException ? (IOException) e9.getCause() : new mx(e9.getCause()), mvVar2.f23821e));
                    if (jE != -9223372036854775807L) {
                        synchronized (this) {
                            try {
                                if (!this.f23816b) {
                                    sendMessageDelayed(Message.obtain(message), jE);
                                    return;
                                }
                            } finally {
                            }
                        }
                    }
                }
            }
            objB = e9;
        } catch (Exception e10) {
            cd.f("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e10);
            objB = e10;
        }
        long j9 = mvVar.f23817a;
        synchronized (this) {
            try {
                if (!this.f23816b) {
                    this.f23815a.f23826d.obtainMessage(message.what, Pair.create(mvVar.f23820d, objB)).sendToTarget();
                }
            } finally {
            }
        }
    }
}
