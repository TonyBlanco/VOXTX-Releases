package Z6;

import Y6.v;
import Y6.x;
import android.content.Context;
import android.os.Handler;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f11369n = "g";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f11370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f11371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f11372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Handler f11373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m f11374e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Handler f11377h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11375f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f11376g = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i f11378i = new i();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Runnable f11379j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Runnable f11380k = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Runnable f11381l = new c();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Runnable f11382m = new d();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.d(g.f11369n, "Opening camera");
                g.this.f11372c.l();
            } catch (Exception e9) {
                g.this.t(e9);
                Log.e(g.f11369n, "Failed to open camera", e9);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.d(g.f11369n, "Configuring camera");
                g.this.f11372c.e();
                if (g.this.f11373d != null) {
                    g.this.f11373d.obtainMessage(B6.k.f716j, g.this.o()).sendToTarget();
                }
            } catch (Exception e9) {
                g.this.t(e9);
                Log.e(g.f11369n, "Failed to configure camera", e9);
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.d(g.f11369n, "Starting preview");
                g.this.f11372c.s(g.this.f11371b);
                g.this.f11372c.u();
            } catch (Exception e9) {
                g.this.t(e9);
                Log.e(g.f11369n, "Failed to start preview", e9);
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.d(g.f11369n, "Closing camera");
                g.this.f11372c.v();
                g.this.f11372c.d();
            } catch (Exception e9) {
                Log.e(g.f11369n, "Failed to close camera", e9);
            }
            g.this.f11376g = true;
            g.this.f11373d.sendEmptyMessage(B6.k.f709c);
            g.this.f11370a.b();
        }
    }

    public g(Context context) {
        x.a();
        this.f11370a = k.d();
        h hVar = new h(context);
        this.f11372c = hVar;
        hVar.o(this.f11378i);
        this.f11377h = new Handler();
    }

    public void A(final boolean z9) {
        x.a();
        if (this.f11375f) {
            this.f11370a.c(new Runnable() { // from class: Z6.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11365a.s(z9);
                }
            });
        }
    }

    public void B() {
        x.a();
        C();
        this.f11370a.c(this.f11381l);
    }

    public final void C() {
        if (!this.f11375f) {
            throw new IllegalStateException("CameraInstance is not open");
        }
    }

    public void l() {
        x.a();
        if (this.f11375f) {
            this.f11370a.c(this.f11382m);
        } else {
            this.f11376g = true;
        }
        this.f11375f = false;
    }

    public void m() {
        x.a();
        C();
        this.f11370a.c(this.f11380k);
    }

    public m n() {
        return this.f11374e;
    }

    public final v o() {
        return this.f11372c.h();
    }

    public boolean p() {
        return this.f11376g;
    }

    public final /* synthetic */ void q(p pVar) {
        this.f11372c.m(pVar);
    }

    public final /* synthetic */ void r(final p pVar) {
        if (this.f11375f) {
            this.f11370a.c(new Runnable() { // from class: Z6.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11367a.q(pVar);
                }
            });
        } else {
            Log.d(f11369n, "Camera is closed, not requesting preview");
        }
    }

    public final /* synthetic */ void s(boolean z9) {
        this.f11372c.t(z9);
    }

    public final void t(Exception exc) {
        Handler handler = this.f11373d;
        if (handler != null) {
            handler.obtainMessage(B6.k.f710d, exc).sendToTarget();
        }
    }

    public void u() {
        x.a();
        this.f11375f = true;
        this.f11376g = false;
        this.f11370a.e(this.f11379j);
    }

    public void v(final p pVar) {
        this.f11377h.post(new Runnable() { // from class: Z6.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f11363a.r(pVar);
            }
        });
    }

    public void w(i iVar) {
        if (this.f11375f) {
            return;
        }
        this.f11378i = iVar;
        this.f11372c.o(iVar);
    }

    public void x(m mVar) {
        this.f11374e = mVar;
        this.f11372c.q(mVar);
    }

    public void y(Handler handler) {
        this.f11373d = handler;
    }

    public void z(j jVar) {
        this.f11371b = jVar;
    }
}
