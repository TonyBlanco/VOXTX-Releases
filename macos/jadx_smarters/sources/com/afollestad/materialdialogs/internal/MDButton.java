package com.afollestad.materialdialogs.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import d1.EnumC1649a;
import d1.c;
import e1.AbstractC1730a;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AppCompatCustomView"})
public class MDButton extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18329a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public EnumC1649a f18330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f18332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f18333f;

    public MDButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18329a = false;
        a(context);
    }

    public final void a(Context context) {
        this.f18331d = context.getResources().getDimensionPixelSize(c.f39472d);
        this.f18330c = EnumC1649a.END;
    }

    public void b(boolean z9, boolean z10) {
        if (this.f18329a != z9 || z10) {
            setGravity(z9 ? this.f18330c.getGravityInt() | 16 : 17);
            setTextAlignment(z9 ? this.f18330c.getTextAlignment() : 4);
            AbstractC1730a.c(this, z9 ? this.f18332e : this.f18333f);
            if (z9) {
                setPadding(this.f18331d, getPaddingTop(), this.f18331d, getPaddingBottom());
            }
            this.f18329a = z9;
        }
    }

    public void setAllCapsCompat(boolean z9) {
        setAllCaps(z9);
    }

    public void setDefaultSelector(Drawable drawable) {
        this.f18333f = drawable;
        if (this.f18329a) {
            return;
        }
        b(false, true);
    }

    public void setStackedGravity(EnumC1649a enumC1649a) {
        this.f18330c = enumC1649a;
    }

    public void setStackedSelector(Drawable drawable) {
        this.f18332e = drawable;
        if (this.f18329a) {
            b(true, true);
        }
    }
}
