package mbanje.kurt.fabbutton;

import M8.e;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import mbanje.kurt.fabbutton.CircleImageView;
import mbanje.kurt.fabbutton.a;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: loaded from: classes4.dex */
public class ProgressRingView extends View implements a.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f44833a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Paint f44834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f44835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RectF f44836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f44837f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f44838g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f44839h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f44840i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f44841j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f44842k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f44843l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f44844m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f44845n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f44846o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f44847p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f44848q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f44849r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f44850s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f44851t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ValueAnimator f44852u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ValueAnimator f44853v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AnimatorSet f44854w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public CircleImageView.b f44855x;

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f44856a = false;

        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f44856a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f44856a) {
                return;
            }
            ProgressRingView.this.c();
        }
    }

    public ProgressRingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44833a = ProgressRingView.class.getSimpleName();
        this.f44835d = 0;
        this.f44837f = 0.14f;
        this.f44839h = 0.14f;
        this.f44849r = DefaultRenderer.BACKGROUND_COLOR;
        b(attributeSet, 0);
    }

    @Override // mbanje.kurt.fabbutton.a.g
    public void a(float f9, float f10, float f11, float f12) {
        CircleImageView.b bVar;
        if (f9 != -1.0f) {
            this.f44844m = f9;
        }
        if (f10 != -1.0f) {
            this.f44845n = f10;
        }
        if (f11 != -1.0f) {
            this.f44850s = f11;
        }
        if (f12 != -1.0f) {
            this.f44851t = f12;
            if (Math.round(f12) != 100 || (bVar = this.f44855x) == null) {
                return;
            }
            bVar.a();
        }
    }

    public void b(AttributeSet attributeSet, int i9) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.f5227a, i9, 0);
        this.f44842k = typedArrayObtainStyledAttributes.getFloat(e.f5230d, 0.0f);
        this.f44849r = typedArrayObtainStyledAttributes.getColor(e.f5240n, this.f44849r);
        this.f44843l = typedArrayObtainStyledAttributes.getFloat(e.f5229c, 100.0f);
        this.f44840i = typedArrayObtainStyledAttributes.getBoolean(e.f5231e, false);
        this.f44841j = typedArrayObtainStyledAttributes.getBoolean(e.f5237k, true);
        this.f44848q = typedArrayObtainStyledAttributes.getInteger(e.f5232f, 4000);
        this.f44839h = typedArrayObtainStyledAttributes.getFloat(e.f5241o, this.f44839h);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.f44834c = paint;
        paint.setColor(this.f44849r);
        this.f44834c.setStyle(Paint.Style.STROKE);
        this.f44834c.setStrokeCap(Paint.Cap.BUTT);
        if (this.f44841j) {
            e();
        }
    }

    public void c() {
        int i9 = 0;
        f(false);
        boolean z9 = this.f44840i;
        this.f44850s = -90.0f;
        if (!z9) {
            ValueAnimator valueAnimatorC = mbanje.kurt.fabbutton.a.c(this, -90.0f, 270.0f, this);
            this.f44852u = valueAnimatorC;
            valueAnimatorC.start();
            this.f44851t = 0.0f;
            ValueAnimator valueAnimatorB = mbanje.kurt.fabbutton.a.b(this, 0.0f, this.f44842k, this);
            this.f44853v = valueAnimatorB;
            valueAnimatorB.start();
            return;
        }
        this.f44844m = 15.0f;
        this.f44854w = new AnimatorSet();
        AnimatorSet animatorSet = null;
        while (i9 < 4) {
            AnimatorSet animatorSetA = mbanje.kurt.fabbutton.a.a(this, i9, this.f44848q, this);
            AnimatorSet.Builder builderPlay = this.f44854w.play(animatorSetA);
            if (animatorSet != null) {
                builderPlay.after(animatorSet);
            }
            i9++;
            animatorSet = animatorSetA;
        }
        this.f44854w.addListener(new a());
        this.f44854w.start();
    }

    public void d(int i9, boolean z9) {
        if (z9) {
            i9 = Math.round(this.f44838g * this.f44839h);
        }
        this.f44846o = i9;
        int i10 = this.f44846o;
        this.f44847p = i10 / 2;
        this.f44834c.setStrokeWidth(i10);
        g();
    }

    public void e() {
        c();
    }

    public void f(boolean z9) {
        ValueAnimator valueAnimator = this.f44852u;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f44852u.cancel();
        }
        ValueAnimator valueAnimator2 = this.f44853v;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.f44853v.cancel();
        }
        AnimatorSet animatorSet = this.f44854w;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f44854w.cancel();
        }
        if (z9) {
            d(0, false);
        } else {
            d(0, true);
        }
        invalidate();
    }

    public final void g() {
        int i9 = this.f44847p;
        int i10 = this.f44835d;
        this.f44836e = new RectF(i9, i9, i10 - i9, i10 - i9);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f9 = ((isInEditMode() ? this.f44842k : this.f44851t) / this.f44843l) * 360.0f;
        if (this.f44840i) {
            canvas.drawArc(this.f44836e, this.f44850s + this.f44845n, this.f44844m, false, this.f44834c);
        } else {
            canvas.drawArc(this.f44836e, this.f44850s, f9, false, this.f44834c);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        int iMin = Math.min(i9, i10);
        this.f44835d = iMin;
        this.f44838g = iMin / 2;
        d(-1, true);
    }

    public void setAnimDuration(int i9) {
        this.f44848q = i9;
    }

    public void setAutostartanim(boolean z9) {
        this.f44841j = z9;
    }

    public void setFabViewListener(CircleImageView.b bVar) {
        this.f44855x = bVar;
    }

    public void setIndeterminate(boolean z9) {
        this.f44840i = z9;
    }

    public void setMaxProgress(float f9) {
        this.f44843l = f9;
    }

    public void setProgress(float f9) {
        this.f44842k = f9;
        if (!this.f44840i) {
            ValueAnimator valueAnimator = this.f44853v;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f44853v.cancel();
            }
            ValueAnimator valueAnimatorB = mbanje.kurt.fabbutton.a.b(this, this.f44851t, f9, this);
            this.f44853v = valueAnimatorB;
            valueAnimatorB.start();
        }
        invalidate();
    }

    public void setProgressColor(int i9) {
        this.f44849r = i9;
        this.f44834c.setColor(i9);
    }

    public void setRingWidthRatio(float f9) {
        this.f44839h = f9;
    }
}
