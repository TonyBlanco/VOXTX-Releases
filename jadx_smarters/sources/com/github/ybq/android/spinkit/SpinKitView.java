package com.github.ybq.android.spinkit;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import u2.AbstractC2845a;
import u2.AbstractC2846b;
import u2.AbstractC2847c;
import u2.AbstractC2848d;
import u2.EnumC2849e;
import x2.f;

/* JADX INFO: loaded from: classes.dex */
public class SpinKitView extends ProgressBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EnumC2849e f18594a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f18596d;

    public SpinKitView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2845a.f51191a);
    }

    public SpinKitView(Context context, AttributeSet attributeSet, int i9) {
        this(context, attributeSet, i9, AbstractC2846b.f51192a);
    }

    public SpinKitView(Context context, AttributeSet attributeSet, int i9, int i10) {
        super(context, attributeSet, i9, i10);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2847c.f51193a, i9, i10);
        this.f18594a = EnumC2849e.values()[typedArrayObtainStyledAttributes.getInt(AbstractC2847c.f51195c, 0)];
        this.f18595c = typedArrayObtainStyledAttributes.getColor(AbstractC2847c.f51194b, -1);
        typedArrayObtainStyledAttributes.recycle();
        a();
        setIndeterminate(true);
    }

    public final void a() {
        f fVarA = AbstractC2848d.a(this.f18594a);
        fVarA.u(this.f18595c);
        setIndeterminateDrawable(fVarA);
    }

    @Override // android.widget.ProgressBar
    public f getIndeterminateDrawable() {
        return this.f18596d;
    }

    @Override // android.view.View
    public void onScreenStateChanged(int i9) {
        f fVar;
        super.onScreenStateChanged(i9);
        if (i9 != 0 || (fVar = this.f18596d) == null) {
            return;
        }
        fVar.stop();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        if (z9 && this.f18596d != null && getVisibility() == 0) {
            this.f18596d.start();
        }
    }

    public void setColor(int i9) {
        this.f18595c = i9;
        f fVar = this.f18596d;
        if (fVar != null) {
            fVar.u(i9);
        }
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (!(drawable instanceof f)) {
            throw new IllegalArgumentException("this d must be instanceof Sprite");
        }
        setIndeterminateDrawable((f) drawable);
    }

    public void setIndeterminateDrawable(f fVar) {
        super.setIndeterminateDrawable((Drawable) fVar);
        this.f18596d = fVar;
        if (fVar.c() == 0) {
            this.f18596d.u(this.f18595c);
        }
        onSizeChanged(getWidth(), getHeight(), getWidth(), getHeight());
        if (getVisibility() == 0) {
            this.f18596d.start();
        }
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        super.unscheduleDrawable(drawable);
        if (drawable instanceof f) {
            ((f) drawable).stop();
        }
    }
}
