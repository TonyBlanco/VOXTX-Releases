package com.google.ads.interactivemedia.v3.internal;

import android.media.AudioTrack;

/* JADX INFO: loaded from: classes3.dex */
final class kf extends AudioTrack.StreamEventCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ kg f23440a;

    public kf(kg kgVar) {
        this.f23440a = kgVar;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i9) {
        if (audioTrack.equals(this.f23440a.f23441a.f23490u)) {
            kh khVar = this.f23440a.f23441a;
            if (khVar.f23487r == null || !khVar.f23467U) {
                return;
            }
            khVar.f23487r.b();
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        if (audioTrack.equals(this.f23440a.f23441a.f23490u)) {
            kh khVar = this.f23440a.f23441a;
            if (khVar.f23487r == null || !khVar.f23467U) {
                return;
            }
            khVar.f23487r.b();
        }
    }
}
