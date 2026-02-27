package androidx.leanback.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class ScaleFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f15496a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f15497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f15498d;

    public ScaleFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScaleFrameLayout(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f15496a = 1.0f;
        this.f15497c = 1.0f;
        this.f15498d = 1.0f;
    }

    public static int a(int i9, float f9) {
        return f9 == 1.0f ? i9 : View.MeasureSpec.makeMeasureSpec((int) ((View.MeasureSpec.getSize(i9) / f9) + 0.5f), View.MeasureSpec.getMode(i9));
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i9, layoutParams);
        view.setScaleX(this.f15498d);
        view.setScaleY(this.f15498d);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i9, ViewGroup.LayoutParams layoutParams, boolean z9) {
        boolean zAddViewInLayout = super.addViewInLayout(view, i9, layoutParams, z9);
        if (zAddViewInLayout) {
            view.setScaleX(this.f15498d);
            view.setScaleY(this.f15498d);
        }
        return zAddViewInLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d1  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.ScaleFrameLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        float f9 = this.f15496a;
        if (f9 == 1.0f && this.f15497c == 1.0f) {
            super.onMeasure(i9, i10);
        } else {
            super.onMeasure(a(i9, f9), a(i10, this.f15497c));
            setMeasuredDimension((int) ((getMeasuredWidth() * this.f15496a) + 0.5f), (int) ((getMeasuredHeight() * this.f15497c) + 0.5f));
        }
    }

    public void setChildScale(float f9) {
        if (this.f15498d != f9) {
            this.f15498d = f9;
            for (int i9 = 0; i9 < getChildCount(); i9++) {
                getChildAt(i9).setScaleX(f9);
                getChildAt(i9).setScaleY(f9);
            }
        }
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        throw new UnsupportedOperationException();
    }

    public void setLayoutScaleX(float f9) {
        if (f9 != this.f15496a) {
            this.f15496a = f9;
            requestLayout();
        }
    }

    public void setLayoutScaleY(float f9) {
        if (f9 != this.f15497c) {
            this.f15497c = f9;
            requestLayout();
        }
    }
}
