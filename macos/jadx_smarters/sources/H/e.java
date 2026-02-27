package H;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class e extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Method f2380i;

    public e(f fVar, Resources resources) {
        super(fVar, resources);
        g();
    }

    public e(Drawable drawable) {
        super(drawable);
        g();
    }

    @Override // H.d
    public boolean c() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f2379g;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    public final void g() {
        if (f2380i == null) {
            try {
                f2380i = Drawable.class.getDeclaredMethod("isProjected", null);
            } catch (Exception e9) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e9);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.f2379g.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f2379g.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f2379g;
        if (drawable == null || (method = f2380i) == null) {
            return false;
        }
        try {
            return ((Boolean) method.invoke(drawable, null)).booleanValue();
        } catch (Exception e9) {
            Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e9);
            return false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f9, float f10) {
        this.f2379g.setHotspot(f9, f10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i9, int i10, int i11, int i12) {
        this.f2379g.setHotspotBounds(i9, i10, i11, i12);
    }

    @Override // H.d, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // H.d, android.graphics.drawable.Drawable
    public void setTint(int i9) {
        if (c()) {
            super.setTint(i9);
        } else {
            this.f2379g.setTint(i9);
        }
    }

    @Override // H.d, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (c()) {
            super.setTintList(colorStateList);
        } else {
            this.f2379g.setTintList(colorStateList);
        }
    }

    @Override // H.d, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (c()) {
            super.setTintMode(mode);
        } else {
            this.f2379g.setTintMode(mode);
        }
    }
}
