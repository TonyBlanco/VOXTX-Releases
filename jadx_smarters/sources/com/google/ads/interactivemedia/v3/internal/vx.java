package com.google.ads.interactivemedia.v3.internal;

import android.media.Spatializer;

/* JADX INFO: loaded from: classes3.dex */
final class vx implements Spatializer.OnSpatializerStateChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ wd f24926a;

    public vx(wd wdVar) {
        this.f24926a = wdVar;
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z9) {
        this.f24926a.q();
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z9) {
        this.f24926a.q();
    }
}
