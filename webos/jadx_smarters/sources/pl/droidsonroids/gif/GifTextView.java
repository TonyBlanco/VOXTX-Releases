package pl.droidsonroids.gif;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.TextView;
import java.io.IOException;
import pl.droidsonroids.gif.e;

/* JADX INFO: loaded from: classes4.dex */
public class GifTextView extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e.b f46703a;

    public GifTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(attributeSet, 0, 0);
    }

    public static void d(Drawable[] drawableArr, boolean z9) {
        for (Drawable drawable : drawableArr) {
            if (drawable != null) {
                drawable.setVisible(z9, false);
            }
        }
    }

    private void setCompoundDrawablesVisible(boolean z9) {
        d(getCompoundDrawables(), z9);
        d(getCompoundDrawablesRelative(), z9);
    }

    public final void a() {
        if (this.f46703a.f46731b < 0) {
            return;
        }
        for (Drawable drawable : getCompoundDrawables()) {
            e.a(this.f46703a.f46731b, drawable);
        }
        for (Drawable drawable2 : getCompoundDrawablesRelative()) {
            e.a(this.f46703a.f46731b, drawable2);
        }
        e.a(this.f46703a.f46731b, getBackground());
    }

    public final Drawable b(int i9) {
        if (i9 == 0) {
            return null;
        }
        Resources resources = getResources();
        String resourceTypeName = resources.getResourceTypeName(i9);
        if (!isInEditMode() && e.f46727a.contains(resourceTypeName)) {
            try {
                return new a(resources, i9);
            } catch (Resources.NotFoundException | IOException unused) {
            }
        }
        return resources.getDrawable(i9, getContext().getTheme());
    }

    public final void c(AttributeSet attributeSet, int i9, int i10) {
        if (attributeSet != null) {
            Drawable drawableB = b(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableLeft", 0));
            Drawable drawableB2 = b(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableTop", 0));
            Drawable drawableB3 = b(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableRight", 0));
            Drawable drawableB4 = b(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableBottom", 0));
            Drawable drawableB5 = b(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableStart", 0));
            Drawable drawableB6 = b(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableEnd", 0));
            if (getLayoutDirection() == 0) {
                if (drawableB5 != null) {
                    drawableB = drawableB5;
                }
                if (drawableB6 == null) {
                    drawableB6 = drawableB3;
                }
            } else {
                if (drawableB5 != null) {
                    drawableB3 = drawableB5;
                }
                if (drawableB6 == null) {
                    drawableB6 = drawableB;
                }
                drawableB = drawableB3;
            }
            setCompoundDrawablesRelativeWithIntrinsicBounds(drawableB, drawableB2, drawableB6, drawableB4);
            setBackground(b(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "background", 0)));
            this.f46703a = new e.b(this, attributeSet, i9, i10);
            a();
        }
        this.f46703a = new e.b();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setCompoundDrawablesVisible(true);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setCompoundDrawablesVisible(false);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        Drawable[] compoundDrawables = getCompoundDrawables();
        dVar.a(compoundDrawables[0], 0);
        dVar.a(compoundDrawables[1], 1);
        dVar.a(compoundDrawables[2], 2);
        dVar.a(compoundDrawables[3], 3);
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        dVar.a(compoundDrawablesRelative[0], 4);
        dVar.a(compoundDrawablesRelative[2], 5);
        dVar.a(getBackground(), 6);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        Drawable[] drawableArr = new Drawable[7];
        if (this.f46703a.f46730a) {
            Drawable[] compoundDrawables = getCompoundDrawables();
            System.arraycopy(compoundDrawables, 0, drawableArr, 0, compoundDrawables.length);
            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
            drawableArr[4] = compoundDrawablesRelative[0];
            drawableArr[5] = compoundDrawablesRelative[2];
            drawableArr[6] = getBackground();
        }
        return new d(super.onSaveInstanceState(), drawableArr);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i9) {
        setBackground(b(i9));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i9, int i10, int i11, int i12) {
        setCompoundDrawablesRelativeWithIntrinsicBounds(b(i9), b(i10), b(i11), b(i12));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i9, int i10, int i11, int i12) {
        setCompoundDrawablesWithIntrinsicBounds(b(i9), b(i10), b(i11), b(i12));
    }

    public void setFreezesAnimation(boolean z9) {
        this.f46703a.f46730a = z9;
    }
}
