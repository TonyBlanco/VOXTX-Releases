package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* JADX INFO: loaded from: classes3.dex */
final class ya implements Choreographer.FrameCallback, Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ya f25131b = new ya();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile long f25132a = -9223372036854775807L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f25133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HandlerThread f25134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Choreographer f25135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f25136f;

    private ya() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.f25134d = handlerThread;
        handlerThread.start();
        Handler handlerZ = cq.z(handlerThread.getLooper(), this);
        this.f25133c = handlerZ;
        handlerZ.sendEmptyMessage(0);
    }

    public static ya a() {
        return f25131b;
    }

    public final void b() {
        this.f25133c.sendEmptyMessage(1);
    }

    public final void c() {
        this.f25133c.sendEmptyMessage(2);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j9) {
        this.f25132a = j9;
        Choreographer choreographer = this.f25135e;
        af.s(choreographer);
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i9 = message.what;
        if (i9 == 0) {
            try {
                this.f25135e = Choreographer.getInstance();
            } catch (RuntimeException e9) {
                cd.f("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e9);
            }
            return true;
        }
        if (i9 == 1) {
            Choreographer choreographer = this.f25135e;
            if (choreographer != null) {
                int i10 = this.f25136f + 1;
                this.f25136f = i10;
                if (i10 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i9 != 2) {
            return false;
        }
        Choreographer choreographer2 = this.f25135e;
        if (choreographer2 != null) {
            int i11 = this.f25136f - 1;
            this.f25136f = i11;
            if (i11 == 0) {
                choreographer2.removeFrameCallback(this);
                this.f25132a = -9223372036854775807L;
            }
        }
        return true;
    }
}
