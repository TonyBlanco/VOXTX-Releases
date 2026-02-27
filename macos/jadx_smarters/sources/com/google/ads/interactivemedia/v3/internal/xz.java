package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* JADX INFO: loaded from: classes3.dex */
final class xz implements DisplayManager.DisplayListener, xx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DisplayManager f25129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private xv f25130b;

    private xz(DisplayManager displayManager) {
        this.f25129a = displayManager;
    }

    public static xx c(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            return new xz(displayManager);
        }
        return null;
    }

    private final Display d() {
        return this.f25129a.getDisplay(0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.xx
    public final void a() {
        this.f25129a.unregisterDisplayListener(this);
        this.f25130b = null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.xx
    public final void b(xv xvVar) {
        this.f25130b = xvVar;
        this.f25129a.registerDisplayListener(this, cq.A());
        xvVar.a(d());
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i9) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i9) {
        xv xvVar = this.f25130b;
        if (xvVar == null || i9 != 0) {
            return;
        }
        xvVar.a(d());
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i9) {
    }
}
