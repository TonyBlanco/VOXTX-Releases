package com.google.ads.interactivemedia.v3.internal;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
final class kg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ kh f23441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f23442b = new Handler(Looper.myLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AudioTrack.StreamEventCallback f23443c = new kf(this);

    public kg(kh khVar) {
        this.f23441a = khVar;
    }

    public final void a(AudioTrack audioTrack) {
        audioTrack.registerStreamEventCallback(new vw(this.f23442b, 1), this.f23443c);
    }

    public final void b(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f23443c);
        this.f23442b.removeCallbacksAndMessages(null);
    }
}
