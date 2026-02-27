package com.nst.iptvsmarterstvbox;

import a7.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public class MaxHeightLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f28037a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f28038c;

    public MaxHeightLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28037a = 0.6f;
        this.f28038c = 0.0f;
        c(context, attributeSet);
        b();
    }

    public final int a(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getHeight();
    }

    public final void b() {
        float f9 = this.f28038c;
        this.f28038c = f9 <= 0.0f ? this.f28037a * a(getContext()) : Math.min(f9, this.f28037a * a(getContext()));
    }

    public final void c(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f13470e);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i9 = 0; i9 < indexCount; i9++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i9);
            if (index == l.f13472g) {
                this.f28037a = typedArrayObtainStyledAttributes.getFloat(index, 0.6f);
            } else if (index == l.f13471f) {
                this.f28038c = typedArrayObtainStyledAttributes.getDimension(index, 0.0f);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == 1073741824) {
            float f9 = size;
            float f10 = this.f28038c;
            if (f9 > f10) {
                size = (int) f10;
            }
        }
        if (mode == 0) {
            float f11 = size;
            float f12 = this.f28038c;
            if (f11 > f12) {
                size = (int) f12;
            }
        }
        if (mode == Integer.MIN_VALUE) {
            float f13 = size;
            float f14 = this.f28038c;
            if (f13 > f14) {
                size = (int) f14;
            }
        }
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(size, mode));
    }
}
