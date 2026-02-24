package com.google.android.material.timepicker;

import P.L;
import R4.f;
import R4.h;
import R4.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import l5.C2198g;
import l5.i;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends ConstraintLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public C2198g f27796A;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Runnable f27797y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f27798z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.x();
        }
    }

    public c(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        LayoutInflater.from(context).inflate(h.f8813h, this);
        L.w0(this, t());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f9282w4, i9, 0);
        this.f27798z = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f9291x4, 0);
        this.f27797y = new a();
        typedArrayObtainStyledAttributes.recycle();
    }

    public static boolean w(View view) {
        return "skip".equals(view.getTag());
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void addView(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i9, layoutParams);
        if (view.getId() == -1) {
            view.setId(L.m());
        }
        y();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        x();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        y();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i9) {
        this.f27796A.W(ColorStateList.valueOf(i9));
    }

    public final Drawable t() {
        C2198g c2198g = new C2198g();
        this.f27796A = c2198g;
        c2198g.U(new i(0.5f));
        this.f27796A.W(ColorStateList.valueOf(-1));
        return this.f27796A;
    }

    public int u() {
        return this.f27798z;
    }

    public void v(int i9) {
        this.f27798z = i9;
        x();
    }

    public void x() {
        int childCount = getChildCount();
        int i9 = 1;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (w(getChildAt(i10))) {
                i9++;
            }
        }
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.g(this);
        float f9 = 0.0f;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getId() != f.f8778b && !w(childAt)) {
                cVar.h(childAt.getId(), f.f8778b, this.f27798z, f9);
                f9 += 360.0f / (childCount - i9);
            }
        }
        cVar.c(this);
    }

    public final void y() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f27797y);
            handler.post(this.f27797y);
        }
    }
}
