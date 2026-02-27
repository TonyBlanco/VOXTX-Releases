package x2;

import android.animation.ValueAnimator;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import v2.AbstractC2870a;
import v2.AbstractC2871b;
import v2.AbstractC2872c;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends Drawable implements ValueAnimator.AnimatorUpdateListener, Animatable, Drawable.Callback {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f51897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f51898f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f51899g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f51900h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f51901i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f51902j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f51903k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f51904l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f51905m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f51906n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ValueAnimator f51907o;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Rect f51887t = new Rect();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Property f51888u = new c("rotateX");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Property f51889v = new d("rotate");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Property f51890w = new e("rotateY");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Property f51891x = new C0478f("translateX");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Property f51892y = new g("translateY");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Property f51893z = new h("translateXPercentage");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final Property f51882A = new i("translateYPercentage");

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final Property f51883B = new j("scaleX");

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final Property f51884C = new k("scaleY");

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final Property f51885D = new a("scale");

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final Property f51886E = new b("alpha");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f51894a = 1.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f51895c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f51896d = 1.0f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f51908p = 255;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Rect f51909q = f51887t;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Camera f51910r = new Camera();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Matrix f51911s = new Matrix();

    public static class a extends AbstractC2871b {
        public a(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Float get(f fVar) {
            return Float.valueOf(fVar.j());
        }

        @Override // v2.AbstractC2871b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(f fVar, float f9) {
            fVar.C(f9);
        }
    }

    public static class b extends AbstractC2872c {
        public b(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer get(f fVar) {
            return Integer.valueOf(fVar.getAlpha());
        }

        @Override // v2.AbstractC2872c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(f fVar, int i9) {
            fVar.setAlpha(i9);
        }
    }

    public static class c extends AbstractC2872c {
        public c(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer get(f fVar) {
            return Integer.valueOf(fVar.h());
        }

        @Override // v2.AbstractC2872c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(f fVar, int i9) {
            fVar.A(i9);
        }
    }

    public static class d extends AbstractC2872c {
        public d(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer get(f fVar) {
            return Integer.valueOf(fVar.g());
        }

        @Override // v2.AbstractC2872c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(f fVar, int i9) {
            fVar.z(i9);
        }
    }

    public static class e extends AbstractC2872c {
        public e(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer get(f fVar) {
            return Integer.valueOf(fVar.i());
        }

        @Override // v2.AbstractC2872c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(f fVar, int i9) {
            fVar.B(i9);
        }
    }

    /* JADX INFO: renamed from: x2.f$f, reason: collision with other inner class name */
    public static class C0478f extends AbstractC2872c {
        public C0478f(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer get(f fVar) {
            return Integer.valueOf(fVar.m());
        }

        @Override // v2.AbstractC2872c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(f fVar, int i9) {
            fVar.F(i9);
        }
    }

    public static class g extends AbstractC2872c {
        public g(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer get(f fVar) {
            return Integer.valueOf(fVar.o());
        }

        @Override // v2.AbstractC2872c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(f fVar, int i9) {
            fVar.H(i9);
        }
    }

    public static class h extends AbstractC2871b {
        public h(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Float get(f fVar) {
            return Float.valueOf(fVar.n());
        }

        @Override // v2.AbstractC2871b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(f fVar, float f9) {
            fVar.G(f9);
        }
    }

    public static class i extends AbstractC2871b {
        public i(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Float get(f fVar) {
            return Float.valueOf(fVar.p());
        }

        @Override // v2.AbstractC2871b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(f fVar, float f9) {
            fVar.I(f9);
        }
    }

    public static class j extends AbstractC2871b {
        public j(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Float get(f fVar) {
            return Float.valueOf(fVar.k());
        }

        @Override // v2.AbstractC2871b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(f fVar, float f9) {
            fVar.D(f9);
        }
    }

    public static class k extends AbstractC2871b {
        public k(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Float get(f fVar) {
            return Float.valueOf(fVar.l());
        }

        @Override // v2.AbstractC2871b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(f fVar, float f9) {
            fVar.E(f9);
        }
    }

    public void A(int i9) {
        this.f51900h = i9;
    }

    public void B(int i9) {
        this.f51901i = i9;
    }

    public void C(float f9) {
        this.f51894a = f9;
        D(f9);
        E(f9);
    }

    public void D(float f9) {
        this.f51895c = f9;
    }

    public void E(float f9) {
        this.f51896d = f9;
    }

    public void F(int i9) {
        this.f51902j = i9;
    }

    public void G(float f9) {
        this.f51905m = f9;
    }

    public void H(int i9) {
        this.f51903k = i9;
    }

    public void I(float f9) {
        this.f51906n = f9;
    }

    public Rect a(Rect rect) {
        int iMin = Math.min(rect.width(), rect.height());
        int iCenterX = rect.centerX();
        int iCenterY = rect.centerY();
        int i9 = iMin / 2;
        return new Rect(iCenterX - i9, iCenterY - i9, iCenterX + i9, iCenterY + i9);
    }

    public abstract void b(Canvas canvas);

    public abstract int c();

    public Rect d() {
        return this.f51909q;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int iM = m();
        if (iM == 0) {
            iM = (int) (getBounds().width() * n());
        }
        int iO = o();
        if (iO == 0) {
            iO = (int) (getBounds().height() * p());
        }
        canvas.translate(iM, iO);
        canvas.scale(k(), l(), e(), f());
        canvas.rotate(g(), e(), f());
        if (h() != 0 || i() != 0) {
            this.f51910r.save();
            this.f51910r.rotateX(h());
            this.f51910r.rotateY(i());
            this.f51910r.getMatrix(this.f51911s);
            this.f51911s.preTranslate(-e(), -f());
            this.f51911s.postTranslate(e(), f());
            this.f51910r.restore();
            canvas.concat(this.f51911s);
        }
        b(canvas);
    }

    public float e() {
        return this.f51897e;
    }

    public float f() {
        return this.f51898f;
    }

    public int g() {
        return this.f51904l;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f51908p;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public int h() {
        return this.f51900h;
    }

    public int i() {
        return this.f51901i;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return AbstractC2870a.a(this.f51907o);
    }

    public float j() {
        return this.f51894a;
    }

    public float k() {
        return this.f51895c;
    }

    public float l() {
        return this.f51896d;
    }

    public int m() {
        return this.f51902j;
    }

    public float n() {
        return this.f51905m;
    }

    public int o() {
        return this.f51903k;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        w(rect);
    }

    public float p() {
        return this.f51906n;
    }

    public ValueAnimator q() {
        if (this.f51907o == null) {
            this.f51907o = r();
        }
        ValueAnimator valueAnimator = this.f51907o;
        if (valueAnimator != null) {
            valueAnimator.addUpdateListener(this);
            this.f51907o.setStartDelay(this.f51899g);
        }
        return this.f51907o;
    }

    public abstract ValueAnimator r();

    public void s() {
        this.f51894a = 1.0f;
        this.f51900h = 0;
        this.f51901i = 0;
        this.f51902j = 0;
        this.f51903k = 0;
        this.f51904l = 0;
        this.f51905m = 0.0f;
        this.f51906n = 0.0f;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j9) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i9) {
        this.f51908p = i9;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (AbstractC2870a.c(this.f51907o)) {
            return;
        }
        ValueAnimator valueAnimatorQ = q();
        this.f51907o = valueAnimatorQ;
        if (valueAnimatorQ == null) {
            return;
        }
        AbstractC2870a.d(valueAnimatorQ);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (AbstractC2870a.c(this.f51907o)) {
            this.f51907o.removeAllUpdateListeners();
            this.f51907o.end();
            s();
        }
    }

    public f t(int i9) {
        this.f51899g = i9;
        return this;
    }

    public abstract void u(int i9);

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    public void v(int i9, int i10, int i11, int i12) {
        this.f51909q = new Rect(i9, i10, i11, i12);
        x(d().centerX());
        y(d().centerY());
    }

    public void w(Rect rect) {
        v(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void x(float f9) {
        this.f51897e = f9;
    }

    public void y(float f9) {
        this.f51898f = f9;
    }

    public void z(int i9) {
        this.f51904l = i9;
    }
}
