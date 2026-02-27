package e4;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f40363a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f40364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f40365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f40366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Surface f40367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f40368f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f40369g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f40370h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f40371i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f40372j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f40373k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f40374l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f40375m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f40376n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f40377o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f40378p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f40379q;

    public static final class a {
        public static void a(Surface surface, float f9) {
            try {
                surface.setFrameRate(f9, f9 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e9) {
                AbstractC1681B.e("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e9);
            }
        }
    }

    public interface b {

        public interface a {
            void a(Display display);
        }

        void a(a aVar);

        void b();
    }

    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WindowManager f40380a;

        public c(WindowManager windowManager) {
            this.f40380a = windowManager;
        }

        public static b c(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new c(windowManager);
            }
            return null;
        }

        @Override // e4.o.b
        public void a(b.a aVar) {
            aVar.a(this.f40380a.getDefaultDisplay());
        }

        @Override // e4.o.b
        public void b() {
        }
    }

    public static final class d implements b, DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DisplayManager f40381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public b.a f40382b;

        public d(DisplayManager displayManager) {
            this.f40381a = displayManager;
        }

        public static b d(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                return new d(displayManager);
            }
            return null;
        }

        @Override // e4.o.b
        public void a(b.a aVar) {
            this.f40382b = aVar;
            this.f40381a.registerDisplayListener(this, k0.x());
            aVar.a(c());
        }

        @Override // e4.o.b
        public void b() {
            this.f40381a.unregisterDisplayListener(this);
            this.f40382b = null;
        }

        public final Display c() {
            return this.f40381a.getDisplay(0);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i9) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i9) {
            b.a aVar = this.f40382b;
            if (aVar == null || i9 != 0) {
                return;
            }
            aVar.a(c());
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i9) {
        }
    }

    public static final class e implements Choreographer.FrameCallback, Handler.Callback {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final e f40383g = new e();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile long f40384a = -9223372036854775807L;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Handler f40385c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final HandlerThread f40386d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Choreographer f40387e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f40388f;

        public e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f40386d = handlerThread;
            handlerThread.start();
            Handler handlerW = k0.w(handlerThread.getLooper(), this);
            this.f40385c = handlerW;
            handlerW.sendEmptyMessage(0);
        }

        public static e d() {
            return f40383g;
        }

        public void a() {
            this.f40385c.sendEmptyMessage(1);
        }

        public final void b() {
            Choreographer choreographer = this.f40387e;
            if (choreographer != null) {
                int i9 = this.f40388f + 1;
                this.f40388f = i9;
                if (i9 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        public final void c() {
            try {
                this.f40387e = Choreographer.getInstance();
            } catch (RuntimeException e9) {
                AbstractC1681B.k("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e9);
            }
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j9) {
            this.f40384a = j9;
            ((Choreographer) AbstractC1684a.e(this.f40387e)).postFrameCallbackDelayed(this, 500L);
        }

        public void e() {
            this.f40385c.sendEmptyMessage(2);
        }

        public final void f() {
            Choreographer choreographer = this.f40387e;
            if (choreographer != null) {
                int i9 = this.f40388f - 1;
                this.f40388f = i9;
                if (i9 == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f40384a = -9223372036854775807L;
                }
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i9 = message.what;
            if (i9 == 0) {
                c();
                return true;
            }
            if (i9 == 1) {
                b();
                return true;
            }
            if (i9 != 2) {
                return false;
            }
            f();
            return true;
        }
    }

    public o(Context context) {
        b bVarF = f(context);
        this.f40364b = bVarF;
        this.f40365c = bVarF != null ? e.d() : null;
        this.f40373k = -9223372036854775807L;
        this.f40374l = -9223372036854775807L;
        this.f40368f = -1.0f;
        this.f40371i = 1.0f;
        this.f40372j = 0;
    }

    public static boolean c(long j9, long j10) {
        return Math.abs(j9 - j10) <= 20000000;
    }

    public static long e(long j9, long j10, long j11) {
        long j12;
        long j13 = j10 + (((j9 - j10) / j11) * j11);
        if (j9 <= j13) {
            j12 = j13 - j11;
        } else {
            j13 = j11 + j13;
            j12 = j13;
        }
        return j13 - j9 < j9 - j12 ? j13 : j12;
    }

    public static b f(Context context) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        b bVarD = k0.f39777a >= 17 ? d.d(applicationContext) : null;
        return bVarD == null ? c.c(applicationContext) : bVarD;
    }

    public long b(long j9) {
        long j10;
        if (this.f40378p == -1 || !this.f40363a.e()) {
            j10 = j9;
        } else {
            long jA = this.f40379q + ((long) ((this.f40363a.a() * (this.f40375m - this.f40378p)) / this.f40371i));
            if (c(j9, jA)) {
                j10 = jA;
            } else {
                n();
                j10 = j9;
            }
        }
        this.f40376n = this.f40375m;
        this.f40377o = j10;
        e eVar = this.f40365c;
        if (eVar == null || this.f40373k == -9223372036854775807L) {
            return j10;
        }
        long j11 = eVar.f40384a;
        return j11 == -9223372036854775807L ? j10 : e(j10, j11, this.f40373k) - this.f40374l;
    }

    public final void d() {
        Surface surface;
        if (k0.f39777a < 30 || (surface = this.f40367e) == null || this.f40372j == Integer.MIN_VALUE || this.f40370h == 0.0f) {
            return;
        }
        this.f40370h = 0.0f;
        a.a(surface, 0.0f);
    }

    public void g(float f9) {
        this.f40368f = f9;
        this.f40363a.g();
        q();
    }

    public void h(long j9) {
        long j10 = this.f40376n;
        if (j10 != -1) {
            this.f40378p = j10;
            this.f40379q = this.f40377o;
        }
        this.f40375m++;
        this.f40363a.f(j9 * 1000);
        q();
    }

    public void i(float f9) {
        this.f40371i = f9;
        n();
        r(false);
    }

    public void j() {
        n();
    }

    public void k() {
        this.f40366d = true;
        n();
        if (this.f40364b != null) {
            ((e) AbstractC1684a.e(this.f40365c)).a();
            this.f40364b.a(new b.a() { // from class: e4.n
                @Override // e4.o.b.a
                public final void a(Display display) {
                    this.f40362a.p(display);
                }
            });
        }
        r(false);
    }

    public void l() {
        this.f40366d = false;
        b bVar = this.f40364b;
        if (bVar != null) {
            bVar.b();
            ((e) AbstractC1684a.e(this.f40365c)).e();
        }
        d();
    }

    public void m(Surface surface) {
        if (surface instanceof j) {
            surface = null;
        }
        if (this.f40367e == surface) {
            return;
        }
        d();
        this.f40367e = surface;
        r(true);
    }

    public final void n() {
        this.f40375m = 0L;
        this.f40378p = -1L;
        this.f40376n = -1L;
    }

    public void o(int i9) {
        if (this.f40372j == i9) {
            return;
        }
        this.f40372j = i9;
        r(true);
    }

    public final void p(Display display) {
        long j9;
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.f40373k = refreshRate;
            j9 = (refreshRate * 80) / 100;
        } else {
            AbstractC1681B.j("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j9 = -9223372036854775807L;
            this.f40373k = -9223372036854775807L;
        }
        this.f40374l = j9;
    }

    public final void q() {
        if (k0.f39777a < 30 || this.f40367e == null) {
            return;
        }
        float fB = this.f40363a.e() ? this.f40363a.b() : this.f40368f;
        float f9 = this.f40369g;
        if (fB == f9) {
            return;
        }
        if (fB != -1.0f && f9 != -1.0f) {
            if (Math.abs(fB - this.f40369g) < ((!this.f40363a.e() || this.f40363a.d() < 5000000000L) ? 1.0f : 0.02f)) {
                return;
            }
        } else if (fB == -1.0f && this.f40363a.c() < 30) {
            return;
        }
        this.f40369g = fB;
        r(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(boolean r4) {
        /*
            r3 = this;
            int r0 = d4.k0.f39777a
            r1 = 30
            if (r0 < r1) goto L31
            android.view.Surface r0 = r3.f40367e
            if (r0 == 0) goto L31
            int r1 = r3.f40372j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L11
            goto L31
        L11:
            boolean r1 = r3.f40366d
            if (r1 == 0) goto L22
            float r1 = r3.f40369g
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L22
            float r2 = r3.f40371i
            float r1 = r1 * r2
            goto L23
        L22:
            r1 = 0
        L23:
            if (r4 != 0) goto L2c
            float r4 = r3.f40370h
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L2c
            return
        L2c:
            r3.f40370h = r1
            e4.o.a.a(r0, r1)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.o.r(boolean):void");
    }
}
