package com.google.ads.interactivemedia.v3.internal;

import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
final class el implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ en f22788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f22789b;

    public el(en enVar, Handler handler) {
        this.f22788a = enVar;
        this.f22789b = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i9) {
        this.f22789b.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.ek
            @Override // java.lang.Runnable
            public final void run() {
                el elVar = this.f22786a;
                en.c(elVar.f22788a, i9);
            }
        });
    }
}
