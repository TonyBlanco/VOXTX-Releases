package com.google.android.material.snackbar;

import P.L;
import R4.d;
import R4.f;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f27496a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Button f27497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27498d;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static void a(View view, int i9, int i10) {
        if (L.Y(view)) {
            L.F0(view, L.J(view), i9, L.I(view), i10);
        } else {
            view.setPadding(view.getPaddingLeft(), i9, view.getPaddingRight(), i10);
        }
    }

    public final boolean b(int i9, int i10, int i11) {
        boolean z9;
        if (i9 != getOrientation()) {
            setOrientation(i9);
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f27496a.getPaddingTop() == i10 && this.f27496a.getPaddingBottom() == i11) {
            return z9;
        }
        a(this.f27496a, i10, i11);
        return true;
    }

    public Button getActionView() {
        return this.f27497c;
    }

    public TextView getMessageView() {
        return this.f27496a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f27496a = (TextView) findViewById(f.f8769I);
        this.f27497c = (Button) findViewById(f.f8768H);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(d.f8734g);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(d.f8733f);
        boolean z9 = this.f27496a.getLayout().getLineCount() > 1;
        if (!z9 || this.f27498d <= 0 || this.f27497c.getMeasuredWidth() <= this.f27498d) {
            if (!z9) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!b(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!b(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i9, i10);
    }

    public void setMaxInlineActionWidth(int i9) {
        this.f27498d = i9;
    }
}
