package mbanje.kurt.fabbutton;

import M8.e;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: loaded from: classes4.dex */
public class CircleImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f44798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f44799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f44800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f44801h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f44802i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Paint f44803j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f44804k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f44805l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f44806m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Paint f44807n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f44808o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f44809p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Drawable[] f44810q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TransitionDrawable f44811r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f44812s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ObjectAnimator f44813t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f44814u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f44815v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f44816w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f44817x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f44818y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f44819z;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (CircleImageView.this.f44804k != null) {
                CircleImageView.this.f44804k.b(CircleImageView.this.f44801h);
            }
        }
    }

    public interface b {
        void a();

        void b(boolean z9);
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44805l = 75;
        this.f44809p = 0.14f;
        this.f44810q = new Drawable[2];
        this.f44814u = 3.5f;
        this.f44815v = 0.0f;
        this.f44816w = 10.0f;
        this.f44817x = 100;
        this.f44819z = true;
        e(context, attributeSet);
    }

    public final void e(Context context, AttributeSet attributeSet) {
        setFocusable(false);
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        setClickable(true);
        Paint paint = new Paint(1);
        this.f44803j = paint;
        paint.setStyle(Paint.Style.FILL);
        int i9 = getResources().getDisplayMetrics().densityDpi;
        this.f44816w = i9 <= 240 ? 1.0f : i9 <= 320 ? 3.0f : 10.0f;
        Paint paint2 = new Paint(1);
        this.f44807n = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        setWillNotDraw(false);
        setLayerType(1, null);
        int color = DefaultRenderer.BACKGROUND_COLOR;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.f5227a);
            color = typedArrayObtainStyledAttributes.getColor(e.f5236j, DefaultRenderer.BACKGROUND_COLOR);
            this.f44809p = typedArrayObtainStyledAttributes.getFloat(e.f5241o, this.f44809p);
            this.f44816w = typedArrayObtainStyledAttributes.getFloat(e.f5235i, this.f44816w);
            this.f44814u = typedArrayObtainStyledAttributes.getFloat(e.f5234h, this.f44814u);
            this.f44815v = typedArrayObtainStyledAttributes.getFloat(e.f5233g, this.f44815v);
            setShowShadow(typedArrayObtainStyledAttributes.getBoolean(e.f5243q, true));
            typedArrayObtainStyledAttributes.recycle();
        }
        setColor(color);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "currentRingWidth", 0.0f, 0.0f);
        this.f44813t = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(200L);
        this.f44813t.addListener(new a());
    }

    public void f(int i9, int i10) {
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), i9);
        if (!this.f44818y) {
            setImageBitmap(bitmapDecodeResource);
        } else {
            g(new BitmapDrawable(getResources(), bitmapDecodeResource), new BitmapDrawable(getResources(), BitmapFactory.decodeResource(getResources(), i10)));
        }
    }

    public final void g(Drawable drawable, Drawable drawable2) {
        Drawable[] drawableArr = this.f44810q;
        drawableArr[0] = drawable;
        drawableArr[1] = drawable2;
        TransitionDrawable transitionDrawable = new TransitionDrawable(this.f44810q);
        this.f44811r = transitionDrawable;
        transitionDrawable.setCrossFadeEnabled(true);
        setImageDrawable(this.f44811r);
    }

    public float getCurrentRingWidth() {
        return this.f44808o;
    }

    public void h(boolean z9, boolean z10) {
        if (z9) {
            this.f44811r.startTransition(500);
        }
        if (z10) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "currentRingWidth", 0.0f, 0.0f);
            objectAnimatorOfFloat.setFloatValues(1.0f);
            objectAnimatorOfFloat.setDuration(200L);
            objectAnimatorOfFloat.start();
        }
    }

    public void i(boolean z9) {
        this.f44801h = z9;
        if (z9) {
            this.f44813t.setFloatValues(this.f44808o, this.f44812s);
        } else {
            this.f44813t.setFloatValues(this.f44812s, 0.0f);
        }
        this.f44813t.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        canvas.drawCircle(this.f44799f, this.f44798e, this.f44806m + this.f44808o, this.f44807n);
        canvas.drawCircle(this.f44799f, this.f44798e, this.f44802i, this.f44803j);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        this.f44799f = i9 / 2;
        this.f44798e = i10 / 2;
        int iMin = Math.min(i9, i10) / 2;
        this.f44800g = iMin;
        int iRound = Math.round(iMin * this.f44809p);
        this.f44812s = iRound;
        this.f44802i = this.f44800g - iRound;
        this.f44807n.setStrokeWidth(iRound);
        this.f44807n.setAlpha(75);
        this.f44806m = this.f44802i - (this.f44812s / 2);
    }

    public void setColor(int i9) {
        this.f44803j.setColor(i9);
        this.f44807n.setColor(i9);
        this.f44807n.setAlpha(75);
        invalidate();
    }

    public void setCurrentRingWidth(float f9) {
        this.f44808o = f9;
        invalidate();
    }

    public void setFabViewListener(b bVar) {
        this.f44804k = bVar;
    }

    public void setRingWidthRatio(float f9) {
        this.f44809p = f9;
    }

    public void setShowEndBitmap(boolean z9) {
        this.f44818y = z9;
    }

    public void setShowShadow(boolean z9) {
        if (z9) {
            this.f44803j.setShadowLayer(this.f44816w, this.f44815v, this.f44814u, Color.argb(this.f44817x, 0, 0, 0));
        } else {
            this.f44803j.clearShadowLayer();
        }
        invalidate();
    }
}
