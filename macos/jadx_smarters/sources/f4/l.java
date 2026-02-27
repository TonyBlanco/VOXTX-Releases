package f4;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.WindowManager;
import d4.AbstractC1684a;
import d4.AbstractC1704v;
import d4.k0;
import f4.d;
import f4.m;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends GLSurfaceView {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f40667n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f40668a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SensorManager f40669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Sensor f40670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f40671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f40672f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f40673g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f40674h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SurfaceTexture f40675i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Surface f40676j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f40677k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f40678l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f40679m;

    public final class a implements GLSurfaceView.Renderer, m.a, d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f40680a;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float[] f40683e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float[] f40684f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float[] f40685g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f40686h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f40687i;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float[] f40681c = new float[16];

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float[] f40682d = new float[16];

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final float[] f40688j = new float[16];

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final float[] f40689k = new float[16];

        public a(i iVar) {
            float[] fArr = new float[16];
            this.f40683e = fArr;
            float[] fArr2 = new float[16];
            this.f40684f = fArr2;
            float[] fArr3 = new float[16];
            this.f40685g = fArr3;
            this.f40680a = iVar;
            AbstractC1704v.j(fArr);
            AbstractC1704v.j(fArr2);
            AbstractC1704v.j(fArr3);
            this.f40687i = 3.1415927f;
        }

        @Override // f4.d.a
        public synchronized void a(float[] fArr, float f9) {
            float[] fArr2 = this.f40683e;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.f40687i = -f9;
            d();
        }

        @Override // f4.m.a
        public synchronized void b(PointF pointF) {
            this.f40686h = pointF.y;
            d();
            Matrix.setRotateM(this.f40685g, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        public final float c(float f9) {
            if (f9 > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f9))) * 2.0d);
            }
            return 90.0f;
        }

        public final void d() {
            Matrix.setRotateM(this.f40684f, 0, -this.f40686h, (float) Math.cos(this.f40687i), (float) Math.sin(this.f40687i), 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f40689k, 0, this.f40683e, 0, this.f40685g, 0);
                Matrix.multiplyMM(this.f40688j, 0, this.f40684f, 0, this.f40689k, 0);
            }
            Matrix.multiplyMM(this.f40682d, 0, this.f40681c, 0, this.f40688j, 0);
            this.f40680a.e(this.f40682d, false);
        }

        @Override // f4.m.a
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return l.this.performClick();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i9, int i10) {
            GLES20.glViewport(0, 0, i9, i10);
            float f9 = i9 / i10;
            Matrix.perspectiveM(this.f40681c, 0, c(f9), f9, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            l.this.g(this.f40680a.f());
        }
    }

    public interface b {
        void A(Surface surface);

        void z(Surface surface);
    }

    public l(Context context) {
        this(context, null);
    }

    public l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40668a = new CopyOnWriteArrayList();
        this.f40672f = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) AbstractC1684a.e(context.getSystemService("sensor"));
        this.f40669c = sensorManager;
        Sensor defaultSensor = k0.f39777a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f40670d = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        i iVar = new i();
        this.f40674h = iVar;
        a aVar = new a(iVar);
        m mVar = new m(context, aVar, 25.0f);
        this.f40673g = mVar;
        this.f40671e = new d(((WindowManager) AbstractC1684a.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), mVar, aVar);
        this.f40677k = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(mVar);
    }

    public static void h(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    public void d(b bVar) {
        this.f40668a.add(bVar);
    }

    public final /* synthetic */ void e() {
        Surface surface = this.f40676j;
        if (surface != null) {
            Iterator it = this.f40668a.iterator();
            while (it.hasNext()) {
                ((b) it.next()).z(surface);
            }
        }
        h(this.f40675i, surface);
        this.f40675i = null;
        this.f40676j = null;
    }

    public final /* synthetic */ void f(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.f40675i;
        Surface surface = this.f40676j;
        Surface surface2 = new Surface(surfaceTexture);
        this.f40675i = surfaceTexture;
        this.f40676j = surface2;
        Iterator it = this.f40668a.iterator();
        while (it.hasNext()) {
            ((b) it.next()).A(surface2);
        }
        h(surfaceTexture2, surface);
    }

    public final void g(final SurfaceTexture surfaceTexture) {
        this.f40672f.post(new Runnable() { // from class: f4.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f40664a.f(surfaceTexture);
            }
        });
    }

    public InterfaceC1773a getCameraMotionListener() {
        return this.f40674h;
    }

    public e4.m getVideoFrameMetadataListener() {
        return this.f40674h;
    }

    public Surface getVideoSurface() {
        return this.f40676j;
    }

    public void i(b bVar) {
        this.f40668a.remove(bVar);
    }

    public final void j() {
        boolean z9 = this.f40677k && this.f40678l;
        Sensor sensor = this.f40670d;
        if (sensor == null || z9 == this.f40679m) {
            return;
        }
        if (z9) {
            this.f40669c.registerListener(this.f40671e, sensor, 0);
        } else {
            this.f40669c.unregisterListener(this.f40671e);
        }
        this.f40679m = z9;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40672f.post(new Runnable() { // from class: f4.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f40666a.e();
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.f40678l = false;
        j();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.f40678l = true;
        j();
    }

    public void setDefaultStereoMode(int i9) {
        this.f40674h.h(i9);
    }

    public void setUseSensorRotation(boolean z9) {
        this.f40677k = z9;
        j();
    }
}
