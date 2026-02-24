package io.supercharge.shimmerlayout;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Shader;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import i8.AbstractC1903a;
import i8.AbstractC1904b;

/* JADX INFO: loaded from: classes4.dex */
public class ShimmerLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41932a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Rect f41933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Paint f41934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ValueAnimator f41935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bitmap f41936f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bitmap f41937g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Canvas f41938h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f41939i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f41940j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f41941k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f41942l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f41943m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f41944n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f41945o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f41946p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ViewTreeObserver.OnPreDrawListener f41947q;

    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            ShimmerLayout.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ShimmerLayout.this.n();
            return true;
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f41949a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f41950c;

        public b(int i9, int i10) {
            this.f41949a = i9;
            this.f41950c = i10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ShimmerLayout.this.f41932a = this.f41949a + ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (ShimmerLayout.this.f41932a + this.f41950c >= 0) {
                ShimmerLayout.this.invalidate();
            }
        }
    }

    public ShimmerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShimmerLayout(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        setWillNotDraw(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC1904b.f41920a, 0, 0);
        try {
            this.f41944n = typedArrayObtainStyledAttributes.getInteger(AbstractC1904b.f41921b, 20);
            this.f41942l = typedArrayObtainStyledAttributes.getInteger(AbstractC1904b.f41922c, 1500);
            this.f41943m = typedArrayObtainStyledAttributes.getColor(AbstractC1904b.f41924e, i(AbstractC1903a.f41919a));
            this.f41941k = typedArrayObtainStyledAttributes.getBoolean(AbstractC1904b.f41923d, false);
            this.f41945o = typedArrayObtainStyledAttributes.getFloat(AbstractC1904b.f41926g, 0.5f);
            this.f41946p = typedArrayObtainStyledAttributes.getFloat(AbstractC1904b.f41925f, 0.1f);
            this.f41939i = typedArrayObtainStyledAttributes.getBoolean(AbstractC1904b.f41927h, false);
            typedArrayObtainStyledAttributes.recycle();
            setMaskWidth(this.f41945o);
            setGradientCenterColorWidth(this.f41946p);
            setShimmerAngle(this.f41944n);
            if (this.f41941k && getVisibility() == 0) {
                n();
            }
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private float[] getGradientColorDistribution() {
        float[] fArr = {0.0f, 0.5f - (f / 2.0f), (f / 2.0f) + 0.5f, 1.0f};
        float f9 = this.f41946p;
        return fArr;
    }

    private Bitmap getMaskBitmap() {
        if (this.f41937g == null) {
            this.f41937g = e(this.f41933c.width(), getHeight());
        }
        return this.f41937g;
    }

    private Animator getShimmerAnimation() {
        ValueAnimator valueAnimator = this.f41935e;
        if (valueAnimator != null) {
            return valueAnimator;
        }
        if (this.f41933c == null) {
            this.f41933c = c();
        }
        int width = getWidth();
        int i9 = getWidth() > this.f41933c.width() ? -width : -this.f41933c.width();
        int iWidth = this.f41933c.width();
        int i10 = width - i9;
        ValueAnimator valueAnimatorOfInt = this.f41939i ? ValueAnimator.ofInt(i10, 0) : ValueAnimator.ofInt(0, i10);
        this.f41935e = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(this.f41942l);
        this.f41935e.setRepeatCount(-1);
        this.f41935e.addUpdateListener(new b(i9, iWidth));
        return this.f41935e;
    }

    public final Rect c() {
        return new Rect(0, 0, d(), getHeight());
    }

    public final int d() {
        return (int) ((((double) ((getWidth() / 2) * this.f41945o)) / Math.cos(Math.toRadians(Math.abs(this.f41944n)))) + (((double) getHeight()) * Math.tan(Math.toRadians(Math.abs(this.f41944n)))));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!this.f41940j || getWidth() <= 0 || getHeight() <= 0) {
            super.dispatchDraw(canvas);
        } else {
            g(canvas);
        }
    }

    public final Bitmap e(int i9, int i10) {
        try {
            return Bitmap.createBitmap(i9, i10, Bitmap.Config.ALPHA_8);
        } catch (OutOfMemoryError unused) {
            System.gc();
            return null;
        }
    }

    public final void f() {
        if (this.f41934d != null) {
            return;
        }
        int iJ = j(this.f41943m);
        float width = (getWidth() / 2) * this.f41945o;
        float height = this.f41944n >= 0 ? getHeight() : 0.0f;
        float fCos = ((float) Math.cos(Math.toRadians(this.f41944n))) * width;
        float fSin = height + (((float) Math.sin(Math.toRadians(this.f41944n))) * width);
        int i9 = this.f41943m;
        int[] iArr = {iJ, i9, i9, iJ};
        float[] gradientColorDistribution = getGradientColorDistribution();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        ComposeShader composeShader = new ComposeShader(new LinearGradient(0.0f, height, fCos, fSin, iArr, gradientColorDistribution, tileMode), new BitmapShader(this.f41936f, tileMode, tileMode), PorterDuff.Mode.DST_IN);
        Paint paint = new Paint();
        this.f41934d = paint;
        paint.setAntiAlias(true);
        this.f41934d.setDither(true);
        this.f41934d.setFilterBitmap(true);
        this.f41934d.setShader(composeShader);
    }

    public final void g(Canvas canvas) {
        super.dispatchDraw(canvas);
        Bitmap maskBitmap = getMaskBitmap();
        this.f41936f = maskBitmap;
        if (maskBitmap == null) {
            return;
        }
        if (this.f41938h == null) {
            this.f41938h = new Canvas(this.f41936f);
        }
        this.f41938h.drawColor(0, PorterDuff.Mode.CLEAR);
        this.f41938h.save();
        this.f41938h.translate(-this.f41932a, 0.0f);
        super.dispatchDraw(this.f41938h);
        this.f41938h.restore();
        h(canvas);
        this.f41936f = null;
    }

    public final void h(Canvas canvas) {
        f();
        canvas.save();
        canvas.translate(this.f41932a, 0.0f);
        Rect rect = this.f41933c;
        canvas.drawRect(rect.left, 0.0f, rect.width(), this.f41933c.height(), this.f41934d);
        canvas.restore();
    }

    public final int i(int i9) {
        return Build.VERSION.SDK_INT >= 23 ? getContext().getColor(i9) : getResources().getColor(i9);
    }

    public final int j(int i9) {
        return Color.argb(0, Color.red(i9), Color.green(i9), Color.blue(i9));
    }

    public final void k() {
        this.f41938h = null;
        Bitmap bitmap = this.f41937g;
        if (bitmap != null) {
            bitmap.recycle();
            this.f41937g = null;
        }
    }

    public final void l() {
        if (this.f41940j) {
            m();
            n();
        }
    }

    public final void m() {
        ValueAnimator valueAnimator = this.f41935e;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f41935e.removeAllUpdateListeners();
        }
        this.f41935e = null;
        this.f41934d = null;
        this.f41940j = false;
        k();
    }

    public void n() {
        if (this.f41940j) {
            return;
        }
        if (getWidth() == 0) {
            this.f41947q = new a();
            getViewTreeObserver().addOnPreDrawListener(this.f41947q);
        } else {
            getShimmerAnimation().start();
            this.f41940j = true;
        }
    }

    public void o() {
        if (this.f41947q != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f41947q);
        }
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m();
        super.onDetachedFromWindow();
    }

    public void setAnimationReversed(boolean z9) {
        this.f41939i = z9;
        l();
    }

    public void setGradientCenterColorWidth(float f9) {
        if (f9 <= 0.0f || 1.0f <= f9) {
            throw new IllegalArgumentException(String.format("gradientCenterColorWidth value must be higher than %d and less than %d", (byte) 0, (byte) 1));
        }
        this.f41946p = f9;
        l();
    }

    public void setMaskWidth(float f9) {
        if (f9 <= 0.0f || 1.0f < f9) {
            throw new IllegalArgumentException(String.format("maskWidth value must be higher than %d and less or equal to %d", (byte) 0, (byte) 1));
        }
        this.f41945o = f9;
        l();
    }

    public void setShimmerAngle(int i9) {
        if (i9 < -45 || 45 < i9) {
            throw new IllegalArgumentException(String.format("shimmerAngle value must be between %d and %d", (byte) -45, (byte) 45));
        }
        this.f41944n = i9;
        l();
    }

    public void setShimmerAnimationDuration(int i9) {
        this.f41942l = i9;
        l();
    }

    public void setShimmerColor(int i9) {
        this.f41943m = i9;
        l();
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
        super.setVisibility(i9);
        if (i9 != 0) {
            o();
        } else if (this.f41941k) {
            n();
        }
    }
}
