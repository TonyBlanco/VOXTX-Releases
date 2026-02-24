package com.google.android.material.timepicker;

import P.C0959a;
import P.L;
import Q.C;
import R4.f;
import R4.h;
import R4.k;
import R4.l;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.timepicker.ClockHandView;
import e.AbstractC1726a;
import i5.AbstractC1893c;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
class ClockFaceView extends c implements ClockHandView.c {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final ClockHandView f27750B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Rect f27751C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final RectF f27752D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final SparseArray f27753E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final C0959a f27754F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int[] f27755G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final float[] f27756H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final int f27757I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final int f27758J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final int f27759K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final int f27760L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public String[] f27761M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public float f27762N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final ColorStateList f27763O;

    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.v(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f27750B.g()) - ClockFaceView.this.f27757I);
            return true;
        }
    }

    public class b extends C0959a {
        public b() {
        }

        @Override // P.C0959a
        public void g(View view, C c9) {
            super.g(view, c9);
            int iIntValue = ((Integer) view.getTag(f.f8790n)).intValue();
            if (iIntValue > 0) {
                c9.v0((View) ClockFaceView.this.f27753E.get(iIntValue - 1));
            }
            c9.a0(C.c.a(0, 1, iIntValue, 1, false, view.isSelected()));
            c9.Y(true);
            c9.b(C.a.f7404i);
        }

        @Override // P.C0959a
        public boolean j(View view, int i9, Bundle bundle) {
            if (i9 != 16) {
                return super.j(view, i9, bundle);
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            float x9 = view.getX() + (view.getWidth() / 2.0f);
            float height = (view.getHeight() / 2.0f) + view.getY();
            ClockFaceView.this.f27750B.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, x9, height, 0));
            ClockFaceView.this.f27750B.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, x9, height, 0));
            return true;
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R4.b.f8688w);
    }

    public ClockFaceView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f27751C = new Rect();
        this.f27752D = new RectF();
        this.f27753E = new SparseArray();
        this.f27756H = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f9225q1, i9, k.f8867u);
        Resources resources = getResources();
        ColorStateList colorStateListA = AbstractC1893c.a(context, typedArrayObtainStyledAttributes, l.f9243s1);
        this.f27763O = colorStateListA;
        LayoutInflater.from(context).inflate(h.f8812g, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(f.f8785i);
        this.f27750B = clockHandView;
        this.f27757I = resources.getDimensionPixelSize(R4.d.f8739l);
        int colorForState = colorStateListA.getColorForState(new int[]{R.attr.state_selected}, colorStateListA.getDefaultColor());
        this.f27755G = new int[]{colorForState, colorForState, colorStateListA.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = AbstractC1726a.a(context, R4.c.f8697f).getDefaultColor();
        ColorStateList colorStateListA2 = AbstractC1893c.a(context, typedArrayObtainStyledAttributes, l.f9234r1);
        setBackgroundColor(colorStateListA2 != null ? colorStateListA2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f27754F = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        F(strArr, 0);
        this.f27758J = resources.getDimensionPixelSize(R4.d.f8752y);
        this.f27759K = resources.getDimensionPixelSize(R4.d.f8753z);
        this.f27760L = resources.getDimensionPixelSize(R4.d.f8741n);
    }

    public static float E(float f9, float f10, float f11) {
        return Math.max(Math.max(f9, f10), f11);
    }

    public final void C() {
        RectF rectFD = this.f27750B.d();
        for (int i9 = 0; i9 < this.f27753E.size(); i9++) {
            TextView textView = (TextView) this.f27753E.get(i9);
            if (textView != null) {
                textView.getDrawingRect(this.f27751C);
                offsetDescendantRectToMyCoords(textView, this.f27751C);
                textView.setSelected(rectFD.contains(this.f27751C.centerX(), this.f27751C.centerY()));
                textView.getPaint().setShader(D(rectFD, this.f27751C, textView));
                textView.invalidate();
            }
        }
    }

    public final RadialGradient D(RectF rectF, Rect rect, TextView textView) {
        this.f27752D.set(rect);
        this.f27752D.offset(textView.getPaddingLeft(), textView.getPaddingTop());
        if (RectF.intersects(rectF, this.f27752D)) {
            return new RadialGradient(rectF.centerX() - this.f27752D.left, rectF.centerY() - this.f27752D.top, rectF.width() * 0.5f, this.f27755G, this.f27756H, Shader.TileMode.CLAMP);
        }
        return null;
    }

    public void F(String[] strArr, int i9) {
        this.f27761M = strArr;
        G(i9);
    }

    public final void G(int i9) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = this.f27753E.size();
        for (int i10 = 0; i10 < Math.max(this.f27761M.length, size); i10++) {
            TextView textView = (TextView) this.f27753E.get(i10);
            if (i10 >= this.f27761M.length) {
                removeView(textView);
                this.f27753E.remove(i10);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(h.f8811f, (ViewGroup) this, false);
                    this.f27753E.put(i10, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.f27761M[i10]);
                textView.setTag(f.f8790n, Integer.valueOf(i10));
                L.s0(textView, this.f27754F);
                textView.setTextColor(this.f27763O);
                if (i9 != 0) {
                    textView.setContentDescription(getResources().getString(i9, this.f27761M[i10]));
                }
            }
        }
    }

    @Override // com.google.android.material.timepicker.ClockHandView.c
    public void a(float f9, boolean z9) {
        if (Math.abs(this.f27762N - f9) > 0.001f) {
            this.f27762N = f9;
            C();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C.y0(accessibilityNodeInfo).Z(C.b.a(1, this.f27761M.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        super.onLayout(z9, i9, i10, i11, i12);
        C();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iE = (int) (this.f27760L / E(this.f27758J / displayMetrics.heightPixels, this.f27759K / displayMetrics.widthPixels, 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iE, 1073741824);
        setMeasuredDimension(iE, iE);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    @Override // com.google.android.material.timepicker.c
    public void v(int i9) {
        if (i9 != u()) {
            super.v(i9);
            this.f27750B.j(u());
        }
    }
}
