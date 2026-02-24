package d4;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import d4.AbstractC1704v;

/* JADX INFO: renamed from: d4.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC1697n implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f39793h = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f39794a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f39795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EGLDisplay f39796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EGLContext f39797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EGLSurface f39798f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SurfaceTexture f39799g;

    /* JADX INFO: renamed from: d4.n$a */
    public interface a {
    }

    public RunnableC1697n(Handler handler) {
        this(handler, null);
    }

    public RunnableC1697n(Handler handler, a aVar) {
        this.f39794a = handler;
        this.f39795c = new int[1];
    }

    public static EGLConfig a(EGLDisplay eGLDisplay) throws AbstractC1704v.a {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f39793h, 0, eGLConfigArr, 0, 1, iArr, 0);
        AbstractC1704v.c(zEglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null, k0.D("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        return eGLConfigArr[0];
    }

    public static EGLContext b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i9) throws AbstractC1704v.a {
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i9 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        AbstractC1704v.c(eGLContextEglCreateContext != null, "eglCreateContext failed");
        return eGLContextEglCreateContext;
    }

    public static EGLSurface c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i9) throws AbstractC1704v.a {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        if (i9 == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i9 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            AbstractC1704v.c(eGLSurfaceEglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        AbstractC1704v.c(EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext), "eglMakeCurrent failed");
        return eGLSurfaceEglCreatePbufferSurface;
    }

    public static void e(int[] iArr) throws AbstractC1704v.a {
        GLES20.glGenTextures(1, iArr, 0);
        AbstractC1704v.b();
    }

    public static EGLDisplay f() throws AbstractC1704v.a {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        AbstractC1704v.c(eGLDisplayEglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        AbstractC1704v.c(EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        return eGLDisplayEglGetDisplay;
    }

    public final void d() {
    }

    public SurfaceTexture g() {
        return (SurfaceTexture) AbstractC1684a.e(this.f39799g);
    }

    public void h(int i9) throws AbstractC1704v.a {
        EGLDisplay eGLDisplayF = f();
        this.f39796d = eGLDisplayF;
        EGLConfig eGLConfigA = a(eGLDisplayF);
        EGLContext eGLContextB = b(this.f39796d, eGLConfigA, i9);
        this.f39797e = eGLContextB;
        this.f39798f = c(this.f39796d, eGLConfigA, eGLContextB, i9);
        e(this.f39795c);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f39795c[0]);
        this.f39799g = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void i() {
        this.f39794a.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f39799g;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f39795c, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f39796d;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f39796d;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f39798f;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f39796d, this.f39798f);
            }
            EGLContext eGLContext = this.f39797e;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f39796d, eGLContext);
            }
            if (k0.f39777a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f39796d;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f39796d);
            }
            this.f39796d = null;
            this.f39797e = null;
            this.f39798f = null;
            this.f39799g = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f39794a.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        d();
        SurfaceTexture surfaceTexture = this.f39799g;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
