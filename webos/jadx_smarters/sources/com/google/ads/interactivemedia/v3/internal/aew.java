package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class aew extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final aev f19409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f19410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f19411c;

    public aew(Context context) {
        super(context, null);
        this.f19411c = 0;
        this.f19409a = new aev(this);
    }

    public final void a(float f9) {
        if (this.f19410b != f9) {
            this.f19410b = f9;
            requestLayout();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        if (this.f19410b <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f9 = measuredWidth;
        float f10 = measuredHeight;
        float f11 = (this.f19410b / (f9 / f10)) - 1.0f;
        if (Math.abs(f11) <= 0.01f) {
            this.f19409a.a();
            return;
        }
        if (f11 > 0.0f) {
            measuredHeight = (int) (f9 / this.f19410b);
        } else {
            measuredWidth = (int) (f10 * this.f19410b);
        }
        this.f19409a.a();
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }
}
