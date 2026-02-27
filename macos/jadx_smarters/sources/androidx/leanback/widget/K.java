package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import g0.AbstractC1801f;

/* JADX INFO: loaded from: classes.dex */
public final class K extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewGroup f15370a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f15371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15372d;

    public K(Context context) {
        this(context, null, 0);
    }

    public K(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f15372d = true;
        setOrientation(1);
        LayoutInflater.from(context).inflate(g0.h.f41054g, this);
        this.f15370a = (ViewGroup) findViewById(AbstractC1801f.f41029m);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
    }

    public void a(View view) {
        if (this.f15370a.indexOfChild(view) < 0) {
            this.f15370a.addView(view, 0);
        }
    }

    public void b(View view) {
        addView(view);
    }

    public void c(int i9) {
        Drawable drawable = this.f15371c;
        if (!(drawable instanceof ColorDrawable)) {
            setForeground(new ColorDrawable(i9));
        } else {
            ((ColorDrawable) drawable.mutate()).setColor(i9);
            invalidate();
        }
    }

    public void d(boolean z9) {
        this.f15370a.setVisibility(z9 ? 0 : 8);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f15371c;
        if (drawable != null) {
            if (this.f15372d) {
                this.f15372d = false;
                drawable.setBounds(0, 0, getWidth(), getHeight());
            }
            this.f15371c.draw(canvas);
        }
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f15371c;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        this.f15372d = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        this.f15371c = drawable;
        setWillNotDraw(drawable == null);
        invalidate();
    }
}
