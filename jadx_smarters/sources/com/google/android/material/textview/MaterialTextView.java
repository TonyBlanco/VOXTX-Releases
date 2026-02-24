package com.google.android.material.textview;

import R4.b;
import R4.l;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import i5.AbstractC1892b;
import i5.AbstractC1893c;
import p5.AbstractC2451a;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i9) {
        this(context, attributeSet, i9, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i9, int i10) {
        int iT;
        super(AbstractC2451a.c(context, attributeSet, i9, i10), attributeSet, i9);
        Context context2 = getContext();
        if (s(context2)) {
            Resources.Theme theme = context2.getTheme();
            if (v(context2, theme, attributeSet, i9, i10) || (iT = t(theme, attributeSet, i9, i10)) == -1) {
                return;
            }
            r(theme, iT);
        }
    }

    public static boolean s(Context context) {
        return AbstractC1892b.b(context, b.f8662H, true);
    }

    public static int t(Resources.Theme theme, AttributeSet attributeSet, int i9, int i10) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, l.f9027T3, i9, i10);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(l.f9035U3, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int u(Context context, TypedArray typedArray, int... iArr) {
        int iC = -1;
        for (int i9 = 0; i9 < iArr.length && iC < 0; i9++) {
            iC = AbstractC1893c.c(context, typedArray, iArr[i9], -1);
        }
        return iC;
    }

    public static boolean v(Context context, Resources.Theme theme, AttributeSet attributeSet, int i9, int i10) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, l.f9027T3, i9, i10);
        int iU = u(context, typedArrayObtainStyledAttributes, l.f9043V3, l.f9051W3);
        typedArrayObtainStyledAttributes.recycle();
        return iU != -1;
    }

    public final void r(Resources.Theme theme, int i9) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i9, l.f8995P3);
        int iU = u(getContext(), typedArrayObtainStyledAttributes, l.f9011R3, l.f9019S3);
        typedArrayObtainStyledAttributes.recycle();
        if (iU >= 0) {
            setLineHeight(iU);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(Context context, int i9) {
        super.setTextAppearance(context, i9);
        if (s(context)) {
            r(context.getTheme(), i9);
        }
    }
}
