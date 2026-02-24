package com.google.ads.interactivemedia.v3.internal;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
public final class br implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f22140a = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f22141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f22142c = new int[1];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private EGLDisplay f22143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private EGLContext f22144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private EGLSurface f22145f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private SurfaceTexture f22146g;

    public br(Handler handler) {
        this.f22141b = handler;
    }

    public final SurfaceTexture a() {
        SurfaceTexture surfaceTexture = this.f22146g;
        af.s(surfaceTexture);
        return surfaceTexture;
    }

    public final void b(int i9) throws bs {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        bt.a(eGLDisplayEglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        bt.a(EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        this.f22143d = eGLDisplayEglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, f22140a, 0, eGLConfigArr, 0, 1, iArr2, 0);
        bt.a(zEglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null, cq.H("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]));
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f22143d, eGLConfig, EGL14.EGL_NO_CONTEXT, i9 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        bt.a(eGLContextEglCreateContext != null, "eglCreateContext failed");
        this.f22144e = eGLContextEglCreateContext;
        EGLDisplay eGLDisplay = this.f22143d;
        if (i9 == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i9 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            bt.a(eGLSurfaceEglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        bt.a(EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext), "eglMakeCurrent failed");
        this.f22145f = eGLSurfaceEglCreatePbufferSurface;
        GLES20.glGenTextures(1, this.f22142c, 0);
        StringBuilder sb = new StringBuilder();
        boolean z9 = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z9) {
                sb.append('\n');
            }
            sb.append("glError: ");
            sb.append(GLU.gluErrorString(iGlGetError));
            z9 = true;
        }
        if (z9) {
            throw new bs(sb.toString());
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f22142c[0]);
        this.f22146g = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    public final void c() {
        this.f22141b.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f22146g;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f22142c, 0);
            }
            EGLDisplay eGLDisplay = this.f22143d;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f22143d;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f22145f;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f22143d, this.f22145f);
            }
            EGLContext eGLContext = this.f22144e;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f22143d, eGLContext);
            }
            if (cq.f22640a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f22143d;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f22143d);
            }
            this.f22143d = null;
            this.f22144e = null;
            this.f22145f = null;
            this.f22146g = null;
        } catch (Throwable th) {
            EGLDisplay eGLDisplay4 = this.f22143d;
            if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay5 = this.f22143d;
                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface4 = this.f22145f;
            if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f22143d, this.f22145f);
            }
            EGLContext eGLContext2 = this.f22144e;
            if (eGLContext2 != null) {
                EGL14.eglDestroyContext(this.f22143d, eGLContext2);
            }
            if (cq.f22640a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay6 = this.f22143d;
            if (eGLDisplay6 != null && !eGLDisplay6.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f22143d);
            }
            this.f22143d = null;
            this.f22144e = null;
            this.f22145f = null;
            this.f22146g = null;
            throw th;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f22141b.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f22146g;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
