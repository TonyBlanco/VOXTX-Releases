package T;

import P.L;
import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f9453s = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f9456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Runnable f9457e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9460h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9461i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f9465m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f9466n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f9467o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f9468p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f9469q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f9470r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0119a f9454a = new C0119a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Interpolator f9455c = new AccelerateInterpolator();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f9458f = {0.0f, 0.0f};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f9459g = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float[] f9462j = {0.0f, 0.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float[] f9463k = {0.0f, 0.0f};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float[] f9464l = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: T.a$a, reason: collision with other inner class name */
    public static class C0119a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f9472b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f9473c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f9474d;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f9480j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f9481k;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f9475e = Long.MIN_VALUE;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f9479i = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f9476f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f9477g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f9478h = 0;

        public void a() {
            if (this.f9476f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fG = g(e(jCurrentAnimationTimeMillis));
            long j9 = jCurrentAnimationTimeMillis - this.f9476f;
            this.f9476f = jCurrentAnimationTimeMillis;
            float f9 = j9 * fG;
            this.f9477g = (int) (this.f9473c * f9);
            this.f9478h = (int) (f9 * this.f9474d);
        }

        public int b() {
            return this.f9477g;
        }

        public int c() {
            return this.f9478h;
        }

        public int d() {
            float f9 = this.f9473c;
            return (int) (f9 / Math.abs(f9));
        }

        public final float e(long j9) {
            if (j9 < this.f9475e) {
                return 0.0f;
            }
            long j10 = this.f9479i;
            if (j10 < 0 || j9 < j10) {
                return a.e((j9 - r0) / this.f9471a, 0.0f, 1.0f) * 0.5f;
            }
            float f9 = this.f9480j;
            return (1.0f - f9) + (f9 * a.e((j9 - j10) / this.f9481k, 0.0f, 1.0f));
        }

        public int f() {
            float f9 = this.f9474d;
            return (int) (f9 / Math.abs(f9));
        }

        public final float g(float f9) {
            return ((-4.0f) * f9 * f9) + (f9 * 4.0f);
        }

        public boolean h() {
            return this.f9479i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f9479i + ((long) this.f9481k);
        }

        public void i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f9481k = a.f((int) (jCurrentAnimationTimeMillis - this.f9475e), 0, this.f9472b);
            this.f9480j = e(jCurrentAnimationTimeMillis);
            this.f9479i = jCurrentAnimationTimeMillis;
        }

        public void j(int i9) {
            this.f9472b = i9;
        }

        public void k(int i9) {
            this.f9471a = i9;
        }

        public void l(float f9, float f10) {
            this.f9473c = f9;
            this.f9474d = f10;
        }

        public void m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f9475e = jCurrentAnimationTimeMillis;
            this.f9479i = -1L;
            this.f9476f = jCurrentAnimationTimeMillis;
            this.f9480j = 0.5f;
            this.f9477g = 0;
            this.f9478h = 0;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f9468p) {
                if (aVar.f9466n) {
                    aVar.f9466n = false;
                    aVar.f9454a.m();
                }
                C0119a c0119a = a.this.f9454a;
                if (c0119a.h() || !a.this.u()) {
                    a.this.f9468p = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f9467o) {
                    aVar2.f9467o = false;
                    aVar2.c();
                }
                c0119a.a();
                a.this.j(c0119a.b(), c0119a.c());
                L.k0(a.this.f9456d, this);
            }
        }
    }

    public a(View view) {
        this.f9456d = view;
        float f9 = Resources.getSystem().getDisplayMetrics().density;
        float f10 = (int) ((1575.0f * f9) + 0.5f);
        o(f10, f10);
        float f11 = (int) ((f9 * 315.0f) + 0.5f);
        p(f11, f11);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f9453s);
        r(500);
        q(500);
    }

    public static float e(float f9, float f10, float f11) {
        return f9 > f11 ? f11 : f9 < f10 ? f10 : f9;
    }

    public static int f(int i9, int i10, int i11) {
        return i9 > i11 ? i11 : i9 < i10 ? i10 : i9;
    }

    public abstract boolean a(int i9);

    public abstract boolean b(int i9);

    public void c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f9456d.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public final float d(int i9, float f9, float f10, float f11) {
        float fH = h(this.f9458f[i9], f10, this.f9459g[i9], f9);
        if (fH == 0.0f) {
            return 0.0f;
        }
        float f12 = this.f9462j[i9];
        float f13 = this.f9463k[i9];
        float f14 = this.f9464l[i9];
        float f15 = f12 * f11;
        return fH > 0.0f ? e(fH * f15, f13, f14) : -e((-fH) * f15, f13, f14);
    }

    public final float g(float f9, float f10) {
        if (f10 == 0.0f) {
            return 0.0f;
        }
        int i9 = this.f9460h;
        if (i9 == 0 || i9 == 1) {
            if (f9 < f10) {
                if (f9 >= 0.0f) {
                    return 1.0f - (f9 / f10);
                }
                if (this.f9468p && i9 == 1) {
                    return 1.0f;
                }
            }
        } else if (i9 == 2 && f9 < 0.0f) {
            return f9 / (-f10);
        }
        return 0.0f;
    }

    public final float h(float f9, float f10, float f11, float f12) {
        float interpolation;
        float fE = e(f9 * f10, 0.0f, f11);
        float fG = g(f10 - f12, fE) - g(f12, fE);
        if (fG < 0.0f) {
            interpolation = -this.f9455c.getInterpolation(-fG);
        } else {
            if (fG <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f9455c.getInterpolation(fG);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    public final void i() {
        if (this.f9466n) {
            this.f9468p = false;
        } else {
            this.f9454a.i();
        }
    }

    public abstract void j(int i9, int i10);

    public a k(int i9) {
        this.f9461i = i9;
        return this;
    }

    public a l(int i9) {
        this.f9460h = i9;
        return this;
    }

    public a m(boolean z9) {
        if (this.f9469q && !z9) {
            i();
        }
        this.f9469q = z9;
        return this;
    }

    public a n(float f9, float f10) {
        float[] fArr = this.f9459g;
        fArr[0] = f9;
        fArr[1] = f10;
        return this;
    }

    public a o(float f9, float f10) {
        float[] fArr = this.f9464l;
        fArr[0] = f9 / 1000.0f;
        fArr[1] = f10 / 1000.0f;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f9469q
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.i()
            goto L58
        L1a:
            r5.f9467o = r2
            r5.f9465m = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f9456d
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f9456d
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            T.a$a r7 = r5.f9454a
            r7.l(r0, r6)
            boolean r6 = r5.f9468p
            if (r6 != 0) goto L58
            boolean r6 = r5.u()
            if (r6 == 0) goto L58
            r5.v()
        L58:
            boolean r6 = r5.f9470r
            if (r6 == 0) goto L61
            boolean r6 = r5.f9468p
            if (r6 == 0) goto L61
            r1 = 1
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: T.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(float f9, float f10) {
        float[] fArr = this.f9463k;
        fArr[0] = f9 / 1000.0f;
        fArr[1] = f10 / 1000.0f;
        return this;
    }

    public a q(int i9) {
        this.f9454a.j(i9);
        return this;
    }

    public a r(int i9) {
        this.f9454a.k(i9);
        return this;
    }

    public a s(float f9, float f10) {
        float[] fArr = this.f9458f;
        fArr[0] = f9;
        fArr[1] = f10;
        return this;
    }

    public a t(float f9, float f10) {
        float[] fArr = this.f9462j;
        fArr[0] = f9 / 1000.0f;
        fArr[1] = f10 / 1000.0f;
        return this;
    }

    public boolean u() {
        C0119a c0119a = this.f9454a;
        int iF = c0119a.f();
        int iD = c0119a.d();
        return (iF != 0 && b(iF)) || (iD != 0 && a(iD));
    }

    public final void v() {
        int i9;
        if (this.f9457e == null) {
            this.f9457e = new b();
        }
        this.f9468p = true;
        this.f9466n = true;
        if (this.f9465m || (i9 = this.f9461i) <= 0) {
            this.f9457e.run();
        } else {
            L.l0(this.f9456d, this.f9457e, i9);
        }
        this.f9465m = true;
    }
}
