package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
final class vy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Spatializer f24927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f24928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f24929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Spatializer.OnSpatializerStateChangedListener f24930d;

    private vy(Spatializer spatializer) {
        this.f24927a = spatializer;
        this.f24928b = spatializer.getImmersiveAudioLevel() != 0;
    }

    public static vy a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return new vy(audioManager.getSpatializer());
    }

    public final void b(wd wdVar, Looper looper) {
        if (this.f24930d == null && this.f24929c == null) {
            this.f24930d = new vx(wdVar);
            Handler handler = new Handler(looper);
            this.f24929c = handler;
            this.f24927a.addOnSpatializerStateChangedListener(new vw(handler, 0), this.f24930d);
        }
    }

    public final void c() {
        Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener = this.f24930d;
        if (onSpatializerStateChangedListener == null || this.f24929c == null) {
            return;
        }
        this.f24927a.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
        Handler handler = this.f24929c;
        int i9 = cq.f22640a;
        handler.removeCallbacksAndMessages(null);
        this.f24929c = null;
        this.f24930d = null;
    }

    public final boolean d(C1295f c1295f, C1333s c1333s) {
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(cq.f(("audio/eac3-joc".equals(c1333s.f24467l) && c1333s.f24480y == 16) ? 12 : c1333s.f24480y));
        int i9 = c1333s.f24481z;
        if (i9 != -1) {
            channelMask.setSampleRate(i9);
        }
        return this.f24927a.canBeSpatialized(c1295f.a().f22760a, channelMask.build());
    }

    public final boolean e() {
        return this.f24927a.isAvailable();
    }

    public final boolean f() {
        return this.f24927a.isEnabled();
    }

    public final boolean g() {
        return this.f24928b;
    }
}
