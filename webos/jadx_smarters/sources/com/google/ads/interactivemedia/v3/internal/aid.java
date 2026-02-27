package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.app.Application;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.IBinder;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class aid implements ajs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ajx f19821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f19822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f19823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private aic f19824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Activity f19825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f19826f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.ads.interactivemedia.v3.impl.data.ag f19827g;

    public aid(String str, ajx ajxVar, View view) {
        com.google.ads.interactivemedia.v3.impl.data.ag agVar = new com.google.ads.interactivemedia.v3.impl.data.ag();
        this.f19822b = str;
        this.f19821a = ajxVar;
        this.f19823c = view;
        this.f19827g = agVar;
        this.f19825e = null;
        this.f19824d = null;
        this.f19826f = false;
    }

    private static int l(int i9, float f9) {
        return (int) Math.ceil(i9 / f9);
    }

    private final DisplayMetrics m() {
        return this.f19823c.getContext().getResources().getDisplayMetrics();
    }

    private static com.google.ads.interactivemedia.v3.impl.data.ay n(com.google.ads.interactivemedia.v3.impl.data.ay ayVar, float f9) {
        com.google.ads.interactivemedia.v3.impl.data.ax axVarBuilder = com.google.ads.interactivemedia.v3.impl.data.ay.builder();
        axVarBuilder.left(l(ayVar.left(), f9));
        axVarBuilder.top(l(ayVar.top(), f9));
        axVarBuilder.height(l(ayVar.height(), f9));
        axVarBuilder.width(l(ayVar.width(), f9));
        return axVarBuilder.build();
    }

    public final com.google.ads.interactivemedia.v3.impl.data.b c(String str, String str2, String str3) {
        com.google.ads.interactivemedia.v3.impl.data.ay ayVarN = n(com.google.ads.interactivemedia.v3.impl.data.ay.builder().locationOnScreenOfView(this.f19823c).build(), m().density);
        Rect rect = new Rect();
        boolean globalVisibleRect = this.f19823c.getGlobalVisibleRect(rect);
        IBinder windowToken = this.f19823c.getWindowToken();
        if (!globalVisibleRect || windowToken == null || !this.f19823c.isShown()) {
            rect.set(0, 0, 0, 0);
        }
        com.google.ads.interactivemedia.v3.impl.data.ax axVarBuilder = com.google.ads.interactivemedia.v3.impl.data.ay.builder();
        axVarBuilder.left(rect.left);
        axVarBuilder.top(rect.top);
        axVarBuilder.height(rect.height());
        axVarBuilder.width(rect.width());
        com.google.ads.interactivemedia.v3.impl.data.ay ayVarN2 = n(axVarBuilder.build(), m().density);
        boolean z9 = (this.f19823c.getGlobalVisibleRect(new Rect()) && this.f19823c.isShown()) ? false : true;
        AudioManager audioManager = (AudioManager) this.f19823c.getContext().getSystemService("audio");
        double streamVolume = audioManager != null ? ((double) audioManager.getStreamVolume(3)) / ((double) audioManager.getStreamMaxVolume(3)) : 0.0d;
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.google.ads.interactivemedia.v3.impl.data.a aVarBuilder = com.google.ads.interactivemedia.v3.impl.data.b.builder();
        aVarBuilder.queryId(str);
        aVarBuilder.eventId(str2);
        aVarBuilder.appState(str3);
        aVarBuilder.nativeTime(jCurrentTimeMillis);
        aVarBuilder.nativeVolume(streamVolume);
        aVarBuilder.nativeViewHidden(z9);
        aVarBuilder.nativeViewBounds(ayVarN);
        aVarBuilder.nativeViewVisibleBounds(ayVarN2);
        return aVarBuilder.build();
    }

    public final void f() {
        this.f19821a.d(this, this.f19822b);
    }

    public final void g() {
        this.f19821a.m(this.f19822b);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajs
    public final void h(String str, String str2) {
        this.f19821a.o(new ajr(ajp.activityMonitor, ajq.viewability, this.f19822b, c(str, str2, "")));
    }

    public final void i() {
        Application applicationA;
        if (!this.f19826f || (applicationA = com.google.ads.interactivemedia.v3.impl.data.k.a(this.f19823c.getContext())) == null) {
            return;
        }
        aic aicVar = new aic(this);
        this.f19824d = aicVar;
        applicationA.registerActivityLifecycleCallbacks(aicVar);
    }

    public final void j(boolean z9) {
        this.f19826f = z9;
    }

    public final void k() {
        aic aicVar;
        Application applicationA = com.google.ads.interactivemedia.v3.impl.data.k.a(this.f19823c.getContext());
        if (applicationA == null || (aicVar = this.f19824d) == null) {
            return;
        }
        applicationA.unregisterActivityLifecycleCallbacks(aicVar);
    }
}
