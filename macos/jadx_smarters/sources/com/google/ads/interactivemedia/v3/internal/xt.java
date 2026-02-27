package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

/* JADX INFO: loaded from: classes3.dex */
public final class xt extends Surface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f25122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f25123c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25124a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final xs f25125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f25126e;

    public /* synthetic */ xt(xs xsVar, SurfaceTexture surfaceTexture, boolean z9) {
        super(surfaceTexture);
        this.f25125d = xsVar;
        this.f25124a = z9;
    }

    public static xt a(Context context, boolean z9) {
        boolean z10 = true;
        if (z9 && !b(context)) {
            z10 = false;
        }
        af.w(z10);
        return new xs().a(z9 ? f25122b : 0);
    }

    public static synchronized boolean b(Context context) {
        String strEglQueryString;
        int i9;
        String strEglQueryString2;
        try {
            if (!f25123c) {
                int i10 = cq.f22640a;
                if (i10 >= 24 && ((i10 >= 26 || !("samsung".equals(cq.f22642c) || "XT1650".equals(cq.f22643d))) && ((i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content")))) {
                    i9 = 2;
                    if (i10 >= 17 && (strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString2.contains("EGL_KHR_surfaceless_context")) {
                        i9 = 1;
                    }
                } else {
                    i9 = 0;
                }
                f25122b = i9;
                f25123c = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f25122b != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f25125d) {
            try {
                if (!this.f25126e) {
                    this.f25125d.b();
                    this.f25126e = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
