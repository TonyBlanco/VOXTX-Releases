package com.chaos.view;

import F.h;
import P.L;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import k.C2115j;
import org.achartengine.renderer.DefaultRenderer;
import r2.C2656a;
import r2.e;

/* JADX INFO: loaded from: classes.dex */
public class PinView extends C2115j {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final InputFilter[] f18516K = new InputFilter[0];

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final int[] f18517L = {R.attr.state_selected};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public c f18518A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f18519B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f18520C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public float f18521D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f18522E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f18523F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f18524G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public Drawable f18525H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f18526I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public String f18527J;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18528h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18529i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f18530j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f18531k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f18532l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f18533m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Paint f18534n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextPaint f18535o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ColorStateList f18536p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f18537q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f18538r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Rect f18539s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final RectF f18540t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final RectF f18541u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Path f18542v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final PointF f18543w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ValueAnimator f18544x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f18545y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f18546z;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            PinView.this.f18535o.setTextSize(PinView.this.getTextSize() * fFloatValue);
            PinView.this.f18535o.setAlpha((int) (255.0f * fFloatValue));
            PinView.this.postInvalidate();
        }
    }

    public class b extends d {
        public b() {
            super(null);
        }

        @Override // com.chaos.view.PinView.d, android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            menu.removeItem(R.id.autofill);
            return true;
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f18549a;

        public c() {
        }

        public /* synthetic */ c(PinView pinView, a aVar) {
            this();
        }

        public final void b() {
            if (this.f18549a) {
                return;
            }
            PinView.this.removeCallbacks(this);
            this.f18549a = true;
        }

        public void c() {
            this.f18549a = false;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f18549a) {
                return;
            }
            PinView.this.removeCallbacks(this);
            if (PinView.this.C()) {
                PinView.this.w(!r0.f18520C);
                PinView.this.postDelayed(this, 500L);
            }
        }
    }

    public static class d implements ActionMode.Callback {
        public d() {
        }

        public /* synthetic */ d(a aVar) {
            this();
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }
    }

    public PinView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, r2.c.f49632a);
    }

    public PinView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        TextPaint textPaint = new TextPaint();
        this.f18535o = textPaint;
        this.f18537q = DefaultRenderer.BACKGROUND_COLOR;
        this.f18539s = new Rect();
        this.f18540t = new RectF();
        this.f18541u = new RectF();
        this.f18542v = new Path();
        this.f18543w = new PointF();
        this.f18545y = false;
        Resources resources = getResources();
        Paint paint = new Paint(1);
        this.f18534n = paint;
        paint.setStyle(Paint.Style.STROKE);
        textPaint.set(getPaint());
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, e.f49640D, i9, 0);
        this.f18528h = typedArrayObtainStyledAttributes.getInt(e.f49653Q, 0);
        this.f18529i = typedArrayObtainStyledAttributes.getInt(e.f49646J, 4);
        this.f18531k = (int) typedArrayObtainStyledAttributes.getDimension(e.f49647K, resources.getDimensionPixelSize(r2.d.f49635c));
        this.f18530j = (int) typedArrayObtainStyledAttributes.getDimension(e.f49650N, resources.getDimensionPixelSize(r2.d.f49635c));
        this.f18533m = typedArrayObtainStyledAttributes.getDimensionPixelSize(e.f49649M, resources.getDimensionPixelSize(r2.d.f49636d));
        this.f18532l = (int) typedArrayObtainStyledAttributes.getDimension(e.f49648L, 0.0f);
        this.f18538r = (int) typedArrayObtainStyledAttributes.getDimension(e.f49652P, resources.getDimensionPixelSize(r2.d.f49634b));
        this.f18536p = typedArrayObtainStyledAttributes.getColorStateList(e.f49651O);
        this.f18519B = typedArrayObtainStyledAttributes.getBoolean(e.f49642F, true);
        this.f18523F = typedArrayObtainStyledAttributes.getColor(e.f49643G, getCurrentTextColor());
        this.f18522E = typedArrayObtainStyledAttributes.getDimensionPixelSize(e.f49644H, resources.getDimensionPixelSize(r2.d.f49633a));
        this.f18525H = typedArrayObtainStyledAttributes.getDrawable(e.f49641E);
        this.f18526I = typedArrayObtainStyledAttributes.getBoolean(e.f49645I, false);
        typedArrayObtainStyledAttributes.recycle();
        ColorStateList colorStateList = this.f18536p;
        if (colorStateList != null) {
            this.f18537q = colorStateList.getDefaultColor();
        }
        G();
        i();
        setMaxLength(this.f18529i);
        paint.setStrokeWidth(this.f18538r);
        B();
        setTransformationMethod(null);
        j();
        this.f18546z = x(getInputType());
    }

    private void setMaxLength(int i9) {
        if (i9 >= 0) {
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(i9)});
        } else {
            setFilters(f18516K);
        }
    }

    public static boolean x(int i9) {
        int i10 = i9 & 4095;
        return i10 == 129 || i10 == 225 || i10 == 18;
    }

    public final void A() {
        c cVar = this.f18518A;
        if (cVar != null) {
            cVar.c();
            y();
        }
    }

    public final void B() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.5f, 1.0f);
        this.f18544x = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(150L);
        this.f18544x.setInterpolator(new DecelerateInterpolator());
        this.f18544x.addUpdateListener(new a());
    }

    public final boolean C() {
        return isCursorVisible() && isFocused();
    }

    public final void D() {
        c cVar = this.f18518A;
        if (cVar != null) {
            cVar.b();
            w(false);
        }
    }

    public final void E() {
        RectF rectF = this.f18540t;
        float fAbs = rectF.left + (Math.abs(rectF.width()) / 2.0f);
        RectF rectF2 = this.f18540t;
        this.f18543w.set(fAbs, rectF2.top + (Math.abs(rectF2.height()) / 2.0f));
    }

    public final void F() {
        ColorStateList colorStateList = this.f18536p;
        int colorForState = colorStateList != null ? colorStateList.getColorForState(getDrawableState(), 0) : getCurrentTextColor();
        if (colorForState != this.f18537q) {
            this.f18537q = colorForState;
            invalidate();
        }
    }

    public final void G() {
        float fK = k(2.0f) * 2;
        this.f18521D = ((float) this.f18531k) - getTextSize() > fK ? getTextSize() + fK : getTextSize();
    }

    public final void H(int i9) {
        float f9 = this.f18538r / 2.0f;
        int scrollX = getScrollX() + L.J(this);
        int i10 = this.f18533m;
        int i11 = this.f18530j;
        float f10 = scrollX + ((i10 + i11) * i9) + f9;
        if (i10 == 0 && i9 > 0) {
            f10 -= this.f18538r * i9;
        }
        float scrollY = getScrollY() + getPaddingTop() + f9;
        this.f18540t.set(f10, scrollY, (i11 + f10) - this.f18538r, (this.f18531k + scrollY) - this.f18538r);
    }

    public final void I() {
        this.f18534n.setColor(this.f18537q);
        this.f18534n.setStyle(Paint.Style.STROKE);
        this.f18534n.setStrokeWidth(this.f18538r);
        getPaint().setColor(getCurrentTextColor());
    }

    public final void J(int i9) {
        boolean z9;
        boolean z10;
        if (this.f18533m != 0) {
            z9 = true;
        } else {
            boolean z11 = i9 == 0 && i9 != this.f18529i - 1;
            if (i9 != this.f18529i - 1 || i9 == 0) {
                z9 = z11;
                z10 = false;
                RectF rectF = this.f18540t;
                int i10 = this.f18532l;
                K(rectF, i10, i10, z9, z10);
            }
            z9 = z11;
        }
        z10 = true;
        RectF rectF2 = this.f18540t;
        int i102 = this.f18532l;
        K(rectF2, i102, i102, z9, z10);
    }

    public final void K(RectF rectF, float f9, float f10, boolean z9, boolean z10) {
        L(rectF, f9, f10, z9, z10, z10, z9);
    }

    public final void L(RectF rectF, float f9, float f10, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.f18542v.reset();
        float f11 = rectF.left;
        float f12 = rectF.top;
        float f13 = (rectF.right - f11) - (f9 * 2.0f);
        float f14 = (rectF.bottom - f12) - (2.0f * f10);
        this.f18542v.moveTo(f11, f12 + f10);
        if (z9) {
            float f15 = -f10;
            this.f18542v.rQuadTo(0.0f, f15, f9, f15);
        } else {
            this.f18542v.rLineTo(0.0f, -f10);
            this.f18542v.rLineTo(f9, 0.0f);
        }
        this.f18542v.rLineTo(f13, 0.0f);
        Path path = this.f18542v;
        if (z10) {
            path.rQuadTo(f9, 0.0f, f9, f10);
        } else {
            path.rLineTo(f9, 0.0f);
            this.f18542v.rLineTo(0.0f, f10);
        }
        this.f18542v.rLineTo(0.0f, f14);
        Path path2 = this.f18542v;
        if (z11) {
            path2.rQuadTo(0.0f, f10, -f9, f10);
        } else {
            path2.rLineTo(0.0f, f10);
            this.f18542v.rLineTo(-f9, 0.0f);
        }
        this.f18542v.rLineTo(-f13, 0.0f);
        Path path3 = this.f18542v;
        float f16 = -f9;
        if (z12) {
            path3.rQuadTo(f16, 0.0f, f16, -f10);
        } else {
            path3.rLineTo(f16, 0.0f);
            this.f18542v.rLineTo(0.0f, -f10);
        }
        this.f18542v.rLineTo(0.0f, -f14);
        this.f18542v.close();
    }

    @Override // k.C2115j, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        ColorStateList colorStateList = this.f18536p;
        if (colorStateList == null || colorStateList.isStateful()) {
            F();
        }
    }

    public int getCurrentLineColor() {
        return this.f18537q;
    }

    public int getCursorColor() {
        return this.f18523F;
    }

    public int getCursorWidth() {
        return this.f18522E;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public MovementMethod getDefaultMovementMethod() {
        return C2656a.a();
    }

    public int getItemCount() {
        return this.f18529i;
    }

    public int getItemHeight() {
        return this.f18531k;
    }

    public int getItemRadius() {
        return this.f18532l;
    }

    public int getItemSpacing() {
        return this.f18533m;
    }

    public int getItemWidth() {
        return this.f18530j;
    }

    public ColorStateList getLineColors() {
        return this.f18536p;
    }

    public int getLineWidth() {
        return this.f18538r;
    }

    public final void i() {
        int i9 = this.f18528h;
        if (i9 == 1) {
            if (this.f18532l > this.f18538r / 2.0f) {
                throw new IllegalArgumentException("The itemRadius can not be greater than lineWidth when viewType is line");
            }
        } else if (i9 == 0) {
            if (this.f18532l > this.f18530j / 2.0f) {
                throw new IllegalArgumentException("The itemRadius can not be greater than itemWidth");
            }
        }
    }

    @Override // android.widget.TextView
    public boolean isCursorVisible() {
        return this.f18519B;
    }

    @Override // android.widget.TextView
    public boolean isSuggestionsEnabled() {
        return false;
    }

    public final void j() {
        setCustomSelectionActionModeCallback(new d(null));
        if (Build.VERSION.SDK_INT >= 26) {
            setCustomInsertionActionModeCallback(new b());
        }
    }

    public final int k(float f9) {
        return (int) ((f9 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final void l(Canvas canvas, int i9) {
        Paint paintV = v(i9);
        PointF pointF = this.f18543w;
        canvas.drawCircle(pointF.x, pointF.y, paintV.getTextSize() / 2.0f, paintV);
    }

    public final void m(Canvas canvas) {
        if (this.f18520C) {
            PointF pointF = this.f18543w;
            float f9 = pointF.x;
            float f10 = pointF.y - (this.f18521D / 2.0f);
            int color = this.f18534n.getColor();
            float strokeWidth = this.f18534n.getStrokeWidth();
            this.f18534n.setColor(this.f18523F);
            this.f18534n.setStrokeWidth(this.f18522E);
            canvas.drawLine(f9, f10, f9, f10 + this.f18521D, this.f18534n);
            this.f18534n.setColor(color);
            this.f18534n.setStrokeWidth(strokeWidth);
        }
    }

    public final void n(Canvas canvas, int i9) {
        Paint paintV = v(i9);
        paintV.setColor(getCurrentHintTextColor());
        t(canvas, paintV, getHint(), i9);
    }

    public final void o(Canvas canvas, boolean z9) {
        if (this.f18525H == null) {
            return;
        }
        float f9 = this.f18538r / 2.0f;
        this.f18525H.setBounds(Math.round(this.f18540t.left - f9), Math.round(this.f18540t.top - f9), Math.round(this.f18540t.right + f9), Math.round(this.f18540t.bottom + f9));
        this.f18525H.setState(z9 ? f18517L : getDrawableState());
        this.f18525H.draw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        A();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        D();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        I();
        r(canvas);
        canvas.restore();
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z9, int i9, Rect rect) {
        super.onFocusChanged(z9, i9, rect);
        if (z9) {
            z();
            y();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i9, int i10) {
        int mode = View.MeasureSpec.getMode(i9);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        int i11 = this.f18531k;
        if (mode != 1073741824) {
            int i12 = this.f18529i;
            size = L.J(this) + ((i12 - 1) * this.f18533m) + (i12 * this.f18530j) + L.I(this);
            if (this.f18533m == 0) {
                size -= (this.f18529i - 1) * this.f18538r;
            }
        }
        if (mode2 != 1073741824) {
            size2 = getPaddingBottom() + i11 + getPaddingTop();
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.widget.TextView, android.view.View
    public void onScreenStateChanged(int i9) {
        super.onScreenStateChanged(i9);
        if (i9 == 0) {
            D();
        } else {
            if (i9 != 1) {
                return;
            }
            A();
        }
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i9, int i10) {
        super.onSelectionChanged(i9, i10);
        if (i10 != getText().length()) {
            z();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        ValueAnimator valueAnimator;
        if (i9 != charSequence.length()) {
            z();
        }
        y();
        if (this.f18545y && i11 - i10 > 0 && (valueAnimator = this.f18544x) != null) {
            valueAnimator.end();
            this.f18544x.start();
        }
        TransformationMethod transformationMethod = getTransformationMethod();
        this.f18527J = transformationMethod == null ? getText().toString() : transformationMethod.getTransformation(getText(), this).toString();
    }

    public final void p(Canvas canvas, int i9) {
        if (!this.f18526I || i9 >= getText().length()) {
            canvas.drawPath(this.f18542v, this.f18534n);
        }
    }

    public final void q(Canvas canvas, int i9) {
        boolean z9;
        boolean z10;
        int i10;
        if (!this.f18526I || i9 >= getText().length()) {
            if (this.f18533m == 0 && (i10 = this.f18529i) > 1) {
                if (i9 != 0) {
                    z9 = false;
                    if (i9 == i10 - 1) {
                    }
                    this.f18534n.setStyle(Paint.Style.FILL);
                    this.f18534n.setStrokeWidth(this.f18538r / 10.0f);
                    float f9 = this.f18538r / 2.0f;
                    RectF rectF = this.f18541u;
                    RectF rectF2 = this.f18540t;
                    float f10 = rectF2.left - f9;
                    float f11 = rectF2.bottom;
                    rectF.set(f10, f11 - f9, rectF2.right + f9, f11 + f9);
                    RectF rectF3 = this.f18541u;
                    int i11 = this.f18532l;
                    K(rectF3, i11, i11, z9, z10);
                    canvas.drawPath(this.f18542v, this.f18534n);
                }
                z9 = true;
                z10 = false;
                this.f18534n.setStyle(Paint.Style.FILL);
                this.f18534n.setStrokeWidth(this.f18538r / 10.0f);
                float f92 = this.f18538r / 2.0f;
                RectF rectF4 = this.f18541u;
                RectF rectF22 = this.f18540t;
                float f102 = rectF22.left - f92;
                float f112 = rectF22.bottom;
                rectF4.set(f102, f112 - f92, rectF22.right + f92, f112 + f92);
                RectF rectF32 = this.f18541u;
                int i112 = this.f18532l;
                K(rectF32, i112, i112, z9, z10);
                canvas.drawPath(this.f18542v, this.f18534n);
            }
            z9 = true;
            z10 = true;
            this.f18534n.setStyle(Paint.Style.FILL);
            this.f18534n.setStrokeWidth(this.f18538r / 10.0f);
            float f922 = this.f18538r / 2.0f;
            RectF rectF42 = this.f18541u;
            RectF rectF222 = this.f18540t;
            float f1022 = rectF222.left - f922;
            float f1122 = rectF222.bottom;
            rectF42.set(f1022, f1122 - f922, rectF222.right + f922, f1122 + f922);
            RectF rectF322 = this.f18541u;
            int i1122 = this.f18532l;
            K(rectF322, i1122, i1122, z9, z10);
            canvas.drawPath(this.f18542v, this.f18534n);
        }
    }

    public final void r(Canvas canvas) {
        int length = getText().length();
        int i9 = 0;
        while (i9 < this.f18529i) {
            boolean z9 = isFocused() && length == i9;
            this.f18534n.setColor(z9 ? u(f18517L) : this.f18537q);
            H(i9);
            E();
            canvas.save();
            if (this.f18528h == 0) {
                J(i9);
                canvas.clipPath(this.f18542v);
            }
            o(canvas, z9);
            canvas.restore();
            if (z9) {
                m(canvas);
            }
            int i10 = this.f18528h;
            if (i10 == 0) {
                p(canvas, i9);
            } else if (i10 == 1) {
                q(canvas, i9);
            }
            if (this.f18527J.length() > i9) {
                if (getTransformationMethod() == null && this.f18546z) {
                    l(canvas, i9);
                } else {
                    s(canvas, i9);
                }
            } else if (!TextUtils.isEmpty(getHint()) && getHint().length() == this.f18529i) {
                n(canvas, i9);
            }
            i9++;
        }
        if (isFocused() && getText().length() != this.f18529i && this.f18528h == 0) {
            int length2 = getText().length();
            H(length2);
            E();
            J(length2);
            this.f18534n.setColor(u(f18517L));
            p(canvas, length2);
        }
    }

    public final void s(Canvas canvas, int i9) {
        t(canvas, v(i9), this.f18527J, i9);
    }

    public void setAnimationEnable(boolean z9) {
        this.f18545y = z9;
    }

    public void setCursorColor(int i9) {
        this.f18523F = i9;
        if (isCursorVisible()) {
            w(true);
        }
    }

    @Override // android.widget.TextView
    public void setCursorVisible(boolean z9) {
        if (this.f18519B != z9) {
            this.f18519B = z9;
            w(z9);
            y();
        }
    }

    public void setCursorWidth(int i9) {
        this.f18522E = i9;
        if (isCursorVisible()) {
            w(true);
        }
    }

    public void setHideLineWhenFilled(boolean z9) {
        this.f18526I = z9;
    }

    @Override // android.widget.TextView
    public void setInputType(int i9) {
        super.setInputType(i9);
        this.f18546z = x(getInputType());
    }

    public void setItemBackground(Drawable drawable) {
        this.f18524G = 0;
        this.f18525H = drawable;
        invalidate();
    }

    public void setItemBackgroundColor(int i9) {
        Drawable drawable = this.f18525H;
        if (!(drawable instanceof ColorDrawable)) {
            setItemBackground(new ColorDrawable(i9));
        } else {
            ((ColorDrawable) drawable.mutate()).setColor(i9);
            this.f18524G = 0;
        }
    }

    public void setItemBackgroundResources(int i9) {
        if (i9 == 0 || this.f18524G == i9) {
            Drawable drawableF = h.f(getResources(), i9, getContext().getTheme());
            this.f18525H = drawableF;
            setItemBackground(drawableF);
            this.f18524G = i9;
        }
    }

    public void setItemCount(int i9) {
        this.f18529i = i9;
        setMaxLength(i9);
        requestLayout();
    }

    public void setItemHeight(int i9) {
        this.f18531k = i9;
        G();
        requestLayout();
    }

    public void setItemRadius(int i9) {
        this.f18532l = i9;
        i();
        requestLayout();
    }

    public void setItemSpacing(int i9) {
        this.f18533m = i9;
        requestLayout();
    }

    public void setItemWidth(int i9) {
        this.f18530j = i9;
        i();
        requestLayout();
    }

    public void setLineColor(int i9) {
        this.f18536p = ColorStateList.valueOf(i9);
        F();
    }

    public void setLineColor(ColorStateList colorStateList) {
        colorStateList.getClass();
        this.f18536p = colorStateList;
        F();
    }

    public void setLineWidth(int i9) {
        this.f18538r = i9;
        i();
        requestLayout();
    }

    public void setPasswordHidden(boolean z9) {
        this.f18546z = z9;
        requestLayout();
    }

    @Override // android.widget.TextView
    public void setTextSize(float f9) {
        super.setTextSize(f9);
        G();
    }

    @Override // android.widget.TextView
    public void setTextSize(int i9, float f9) {
        super.setTextSize(i9, f9);
        G();
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        super.setTypeface(typeface);
        TextPaint textPaint = this.f18535o;
        if (textPaint != null) {
            textPaint.set(getPaint());
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i9) {
        super.setTypeface(typeface, i9);
    }

    public final void t(Canvas canvas, Paint paint, CharSequence charSequence, int i9) {
        int i10 = i9 + 1;
        paint.getTextBounds(charSequence.toString(), i9, i10, this.f18539s);
        PointF pointF = this.f18543w;
        float f9 = pointF.x;
        float f10 = pointF.y;
        float fAbs = f9 - (Math.abs(this.f18539s.width()) / 2.0f);
        Rect rect = this.f18539s;
        canvas.drawText(charSequence, i9, i10, fAbs - rect.left, (f10 + (Math.abs(rect.height()) / 2.0f)) - this.f18539s.bottom, paint);
    }

    public final int u(int... iArr) {
        ColorStateList colorStateList = this.f18536p;
        return colorStateList != null ? colorStateList.getColorForState(iArr, this.f18537q) : this.f18537q;
    }

    public final Paint v(int i9) {
        if (!this.f18545y || i9 != getText().length() - 1) {
            return getPaint();
        }
        this.f18535o.setColor(getPaint().getColor());
        return this.f18535o;
    }

    public final void w(boolean z9) {
        if (this.f18520C != z9) {
            this.f18520C = z9;
            invalidate();
        }
    }

    public final void y() {
        if (!C()) {
            c cVar = this.f18518A;
            if (cVar != null) {
                removeCallbacks(cVar);
                return;
            }
            return;
        }
        if (this.f18518A == null) {
            this.f18518A = new c(this, null);
        }
        removeCallbacks(this.f18518A);
        this.f18520C = false;
        postDelayed(this.f18518A, 500L);
    }

    public final void z() {
        setSelection(getText().length());
    }
}
