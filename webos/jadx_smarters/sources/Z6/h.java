package Z6;

import Y6.v;
import Y6.w;
import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f11387n = "h";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Camera f11388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Camera.CameraInfo f11389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Z6.a f11390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public B6.b f11391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f11393f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m f11395h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public v f11396i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public v f11397j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Context f11399l;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i f11394g = new i();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f11398k = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a f11400m = new a();

    public final class a implements Camera.PreviewCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public p f11401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public v f11402b;

        public a() {
        }

        public void a(p pVar) {
            this.f11401a = pVar;
        }

        public void b(v vVar) {
            this.f11402b = vVar;
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
            Exception e9;
            v vVar = this.f11402b;
            p pVar = this.f11401a;
            if (vVar == null || pVar == null) {
                Log.d(h.f11387n, "Got preview callback, but no handler or resolution available");
                if (pVar == null) {
                    return;
                } else {
                    e9 = new Exception("No resolution available");
                }
            } else {
                try {
                    if (bArr == null) {
                        throw new NullPointerException("No preview data received");
                    }
                    w wVar = new w(bArr, vVar.f10736a, vVar.f10737c, camera.getParameters().getPreviewFormat(), h.this.f());
                    if (h.this.f11389b.facing == 1) {
                        wVar.e(true);
                    }
                    pVar.b(wVar);
                    return;
                } catch (RuntimeException e10) {
                    e9 = e10;
                    Log.e(h.f11387n, "Camera preview failed", e9);
                }
            }
            pVar.a(e9);
        }
    }

    public h(Context context) {
        this.f11399l = context;
    }

    public static List i(Camera.Parameters parameters) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList();
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                new v(previewSize.width, previewSize.height);
                arrayList.add(new v(previewSize.width, previewSize.height));
            }
            return arrayList;
        }
        for (Camera.Size size : supportedPreviewSizes) {
            arrayList.add(new v(size.width, size.height));
        }
        return arrayList;
    }

    public final int c() {
        int iC = this.f11395h.c();
        int i9 = 0;
        if (iC != 0) {
            if (iC == 1) {
                i9 = 90;
            } else if (iC == 2) {
                i9 = 180;
            } else if (iC == 3) {
                i9 = 270;
            }
        }
        Camera.CameraInfo cameraInfo = this.f11389b;
        int i10 = cameraInfo.facing;
        int i11 = cameraInfo.orientation;
        int i12 = (i10 == 1 ? 360 - ((i11 + i9) % 360) : (i11 - i9) + 360) % 360;
        Log.i(f11387n, "Camera Display Orientation: " + i12);
        return i12;
    }

    public void d() {
        Camera camera = this.f11388a;
        if (camera != null) {
            camera.release();
            this.f11388a = null;
        }
    }

    public void e() {
        if (this.f11388a == null) {
            throw new RuntimeException("Camera not open");
        }
        r();
    }

    public int f() {
        return this.f11398k;
    }

    public final Camera.Parameters g() {
        Camera.Parameters parameters = this.f11388a.getParameters();
        String str = this.f11393f;
        if (str == null) {
            this.f11393f = parameters.flatten();
        } else {
            parameters.unflatten(str);
        }
        return parameters;
    }

    public v h() {
        if (this.f11397j == null) {
            return null;
        }
        return j() ? this.f11397j.b() : this.f11397j;
    }

    public boolean j() {
        int i9 = this.f11398k;
        if (i9 != -1) {
            return i9 % 180 != 0;
        }
        throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
    }

    public boolean k() {
        String flashMode;
        Camera.Parameters parameters = this.f11388a.getParameters();
        if (parameters == null || (flashMode = parameters.getFlashMode()) == null) {
            return false;
        }
        return "on".equals(flashMode) || "torch".equals(flashMode);
    }

    public void l() {
        Camera cameraB = C6.a.b(this.f11394g.b());
        this.f11388a = cameraB;
        if (cameraB == null) {
            throw new RuntimeException("Failed to open camera");
        }
        int iA = C6.a.a(this.f11394g.b());
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        this.f11389b = cameraInfo;
        Camera.getCameraInfo(iA, cameraInfo);
    }

    public void m(p pVar) {
        Camera camera = this.f11388a;
        if (camera == null || !this.f11392e) {
            return;
        }
        this.f11400m.a(pVar);
        camera.setOneShotPreviewCallback(this.f11400m);
    }

    public final void n(int i9) {
        this.f11388a.setDisplayOrientation(i9);
    }

    public void o(i iVar) {
        this.f11394g = iVar;
    }

    public final void p(boolean z9) {
        Camera.Parameters parametersG = g();
        if (parametersG == null) {
            Log.w(f11387n, "Device error: no camera parameters are available. Proceeding without configuration.");
            return;
        }
        String str = f11387n;
        Log.i(str, "Initial camera parameters: " + parametersG.flatten());
        if (z9) {
            Log.w(str, "In camera config safe mode -- most settings will not be honored");
        }
        c.g(parametersG, this.f11394g.a(), z9);
        if (!z9) {
            c.k(parametersG, false);
            if (this.f11394g.h()) {
                c.i(parametersG);
            }
            if (this.f11394g.e()) {
                c.c(parametersG);
            }
            if (this.f11394g.g()) {
                c.l(parametersG);
                c.h(parametersG);
                c.j(parametersG);
            }
        }
        List listI = i(parametersG);
        if (listI.size() == 0) {
            this.f11396i = null;
        } else {
            v vVarA = this.f11395h.a(listI, j());
            this.f11396i = vVarA;
            parametersG.setPreviewSize(vVarA.f10736a, vVarA.f10737c);
        }
        if (Build.DEVICE.equals("glass-1")) {
            c.e(parametersG);
        }
        Log.i(str, "Final camera parameters: " + parametersG.flatten());
        this.f11388a.setParameters(parametersG);
    }

    public void q(m mVar) {
        this.f11395h = mVar;
    }

    public final void r() {
        try {
            int iC = c();
            this.f11398k = iC;
            n(iC);
        } catch (Exception unused) {
            Log.w(f11387n, "Failed to set rotation.");
        }
        try {
            p(false);
        } catch (Exception unused2) {
            try {
                p(true);
            } catch (Exception unused3) {
                Log.w(f11387n, "Camera rejected even safe-mode parameters! No configuration");
            }
        }
        Camera.Size previewSize = this.f11388a.getParameters().getPreviewSize();
        if (previewSize == null) {
            this.f11397j = this.f11396i;
        } else {
            this.f11397j = new v(previewSize.width, previewSize.height);
        }
        this.f11400m.b(this.f11397j);
    }

    public void s(j jVar) throws IOException {
        jVar.a(this.f11388a);
    }

    public void t(boolean z9) {
        if (this.f11388a != null) {
            try {
                if (z9 != k()) {
                    Z6.a aVar = this.f11390c;
                    if (aVar != null) {
                        aVar.j();
                    }
                    Camera.Parameters parameters = this.f11388a.getParameters();
                    c.k(parameters, z9);
                    if (this.f11394g.f()) {
                        c.d(parameters, z9);
                    }
                    this.f11388a.setParameters(parameters);
                    Z6.a aVar2 = this.f11390c;
                    if (aVar2 != null) {
                        aVar2.i();
                    }
                }
            } catch (RuntimeException e9) {
                Log.e(f11387n, "Failed to set torch", e9);
            }
        }
    }

    public void u() {
        Camera camera = this.f11388a;
        if (camera == null || this.f11392e) {
            return;
        }
        camera.startPreview();
        this.f11392e = true;
        this.f11390c = new Z6.a(this.f11388a, this.f11394g);
        B6.b bVar = new B6.b(this.f11399l, this, this.f11394g);
        this.f11391d = bVar;
        bVar.d();
    }

    public void v() {
        Z6.a aVar = this.f11390c;
        if (aVar != null) {
            aVar.j();
            this.f11390c = null;
        }
        B6.b bVar = this.f11391d;
        if (bVar != null) {
            bVar.e();
            this.f11391d = null;
        }
        Camera camera = this.f11388a;
        if (camera == null || !this.f11392e) {
            return;
        }
        camera.stopPreview();
        this.f11400m.a(null);
        this.f11392e = false;
    }
}
