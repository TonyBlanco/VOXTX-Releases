package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import i5.AbstractC1892b;
import i5.AbstractC1893c;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f27270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f27271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f27272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f27273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f27274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f27275f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f27276g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f27277h;

    public c(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC1892b.d(context, R4.b.f8687v, i.class.getCanonicalName()), R4.l.f9164j3);
        this.f27270a = b.a(context, typedArrayObtainStyledAttributes.getResourceId(R4.l.f9191m3, 0));
        this.f27276g = b.a(context, typedArrayObtainStyledAttributes.getResourceId(R4.l.f9173k3, 0));
        this.f27271b = b.a(context, typedArrayObtainStyledAttributes.getResourceId(R4.l.f9182l3, 0));
        this.f27272c = b.a(context, typedArrayObtainStyledAttributes.getResourceId(R4.l.f9200n3, 0));
        ColorStateList colorStateListA = AbstractC1893c.a(context, typedArrayObtainStyledAttributes, R4.l.f9209o3);
        this.f27273d = b.a(context, typedArrayObtainStyledAttributes.getResourceId(R4.l.f9227q3, 0));
        this.f27274e = b.a(context, typedArrayObtainStyledAttributes.getResourceId(R4.l.f9218p3, 0));
        this.f27275f = b.a(context, typedArrayObtainStyledAttributes.getResourceId(R4.l.f9236r3, 0));
        Paint paint = new Paint();
        this.f27277h = paint;
        paint.setColor(colorStateListA.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
