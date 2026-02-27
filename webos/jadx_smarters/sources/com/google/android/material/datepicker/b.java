package com.google.android.material.datepicker;

import P.L;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import i5.AbstractC1893c;
import l5.C2198g;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f27264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorStateList f27265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorStateList f27266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ColorStateList f27267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f27268e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l5.k f27269f;

    public b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i9, l5.k kVar, Rect rect) {
        O.h.c(rect.left);
        O.h.c(rect.top);
        O.h.c(rect.right);
        O.h.c(rect.bottom);
        this.f27264a = rect;
        this.f27265b = colorStateList2;
        this.f27266c = colorStateList;
        this.f27267d = colorStateList3;
        this.f27268e = i9;
        this.f27269f = kVar;
    }

    public static b a(Context context, int i9) {
        O.h.a(i9 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i9, R4.l.f9245s3);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(R4.l.f9254t3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(R4.l.f9272v3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(R4.l.f9263u3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(R4.l.f9281w3, 0));
        ColorStateList colorStateListA = AbstractC1893c.a(context, typedArrayObtainStyledAttributes, R4.l.f9290x3);
        ColorStateList colorStateListA2 = AbstractC1893c.a(context, typedArrayObtainStyledAttributes, R4.l.f8891C3);
        ColorStateList colorStateListA3 = AbstractC1893c.a(context, typedArrayObtainStyledAttributes, R4.l.f8873A3);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R4.l.f8882B3, 0);
        l5.k kVarM = l5.k.b(context, typedArrayObtainStyledAttributes.getResourceId(R4.l.f9299y3, 0), typedArrayObtainStyledAttributes.getResourceId(R4.l.f9308z3, 0)).m();
        typedArrayObtainStyledAttributes.recycle();
        return new b(colorStateListA, colorStateListA2, colorStateListA3, dimensionPixelSize, kVarM, rect);
    }

    public void b(TextView textView) {
        C2198g c2198g = new C2198g();
        C2198g c2198g2 = new C2198g();
        c2198g.setShapeAppearanceModel(this.f27269f);
        c2198g2.setShapeAppearanceModel(this.f27269f);
        c2198g.W(this.f27266c);
        c2198g.b0(this.f27268e, this.f27267d);
        textView.setTextColor(this.f27265b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f27265b.withAlpha(30), c2198g, c2198g2);
        Rect rect = this.f27264a;
        L.w0(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
