package com.google.android.material.snackbar;

import P.L;
import R4.d;
import R4.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import f5.w;
import i5.AbstractC1893c;
import p5.AbstractC2451a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseTransientBottomBar {

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final a f27485j = new a(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean E(View view) {
            return this.f27485j.a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f27485j.b(coordinatorLayout, view, motionEvent);
            return super.k(coordinatorLayout, view, motionEvent);
        }
    }

    public static class a {
        public a(SwipeDismissBehavior swipeDismissBehavior) {
            swipeDismissBehavior.K(0.1f);
            swipeDismissBehavior.J(0.6f);
            swipeDismissBehavior.L(0);
        }

        public boolean a(View view) {
            return view instanceof b;
        }

        public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.C(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    com.google.android.material.snackbar.a.b().e(null);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                com.google.android.material.snackbar.a.b().f(null);
            }
        }
    }

    public static class b extends FrameLayout {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final View.OnTouchListener f27486k = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f27487a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f27488c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f27489d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f27490e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f27491f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ColorStateList f27492g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public PorterDuff.Mode f27493h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Rect f27494i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f27495j;

        public class a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            super(AbstractC2451a.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, l.f9028T4);
            if (typedArrayObtainStyledAttributes.hasValue(l.f9085a5)) {
                L.A0(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f9085a5, 0));
            }
            this.f27487a = typedArrayObtainStyledAttributes.getInt(l.f9052W4, 0);
            this.f27488c = typedArrayObtainStyledAttributes.getFloat(l.f9060X4, 1.0f);
            setBackgroundTintList(AbstractC1893c.a(context2, typedArrayObtainStyledAttributes, l.f9068Y4));
            setBackgroundTintMode(w.f(typedArrayObtainStyledAttributes.getInt(l.f9076Z4, -1), PorterDuff.Mode.SRC_IN));
            this.f27489d = typedArrayObtainStyledAttributes.getFloat(l.f9044V4, 1.0f);
            this.f27490e = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f9036U4, -1);
            this.f27491f = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f9094b5, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(f27486k);
            setFocusable(true);
            if (getBackground() == null) {
                L.w0(this, a());
            }
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar baseTransientBottomBar) {
        }

        public final Drawable a() {
            float dimension = getResources().getDimension(d.f8723V);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(Z4.a.i(this, R4.b.f8678m, R4.b.f8675j, getBackgroundOverlayColorAlpha()));
            if (this.f27492g == null) {
                return H.a.r(gradientDrawable);
            }
            Drawable drawableR = H.a.r(gradientDrawable);
            H.a.o(drawableR, this.f27492g);
            return drawableR;
        }

        public final void b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f27494i = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        public float getActionTextColorAlpha() {
            return this.f27489d;
        }

        public int getAnimationMode() {
            return this.f27487a;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f27488c;
        }

        public int getMaxInlineActionWidth() {
            return this.f27491f;
        }

        public int getMaxWidth() {
            return this.f27490e;
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            L.p0(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
            super.onLayout(z9, i9, i10, i11, i12);
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i9, int i10) {
            super.onMeasure(i9, i10);
            if (this.f27490e > 0) {
                int measuredWidth = getMeasuredWidth();
                int i11 = this.f27490e;
                if (measuredWidth > i11) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), i10);
                }
            }
        }

        public void setAnimationMode(int i9) {
            this.f27487a = i9;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f27492g != null) {
                drawable = H.a.r(drawable.mutate());
                H.a.o(drawable, this.f27492g);
                H.a.p(drawable, this.f27493h);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f27492g = colorStateList;
            if (getBackground() != null) {
                Drawable drawableR = H.a.r(getBackground().mutate());
                H.a.o(drawableR, colorStateList);
                H.a.p(drawableR, this.f27493h);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f27493h = mode;
            if (getBackground() != null) {
                Drawable drawableR = H.a.r(getBackground().mutate());
                H.a.p(drawableR, mode);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.f27495j || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            b((ViewGroup.MarginLayoutParams) layoutParams);
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f27486k);
            super.setOnClickListener(onClickListener);
        }
    }
}
