package L0;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends Drawable implements H.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f3900a;

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f3900a;
        if (drawable != null) {
            H.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        Drawable drawable = this.f3900a;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        Drawable drawable = this.f3900a;
        return drawable != null ? drawable.getCurrent() : super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        Drawable drawable = this.f3900a;
        return drawable != null ? drawable.getMinimumHeight() : super.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        Drawable drawable = this.f3900a;
        return drawable != null ? drawable.getMinimumWidth() : super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f3900a;
        return drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        Drawable drawable = this.f3900a;
        return drawable != null ? drawable.getState() : super.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        Drawable drawable = this.f3900a;
        return drawable != null ? drawable.getTransparentRegion() : super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        Drawable drawable = this.f3900a;
        if (drawable != null) {
            H.a.i(drawable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i9) {
        Drawable drawable = this.f3900a;
        return drawable != null ? drawable.setLevel(i9) : super.onLevelChange(i9);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i9) {
        Drawable drawable = this.f3900a;
        if (drawable != null) {
            drawable.setChangingConfigurations(i9);
        } else {
            super.setChangingConfigurations(i9);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i9, PorterDuff.Mode mode) {
        Drawable drawable = this.f3900a;
        if (drawable != null) {
            drawable.setColorFilter(i9, mode);
        } else {
            super.setColorFilter(i9, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z9) {
        Drawable drawable = this.f3900a;
        if (drawable != null) {
            drawable.setFilterBitmap(z9);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f9, float f10) {
        Drawable drawable = this.f3900a;
        if (drawable != null) {
            H.a.k(drawable, f9, f10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i9, int i10, int i11, int i12) {
        Drawable drawable = this.f3900a;
        if (drawable != null) {
            H.a.l(drawable, i9, i10, i11, i12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        Drawable drawable = this.f3900a;
        return drawable != null ? drawable.setState(iArr) : super.setState(iArr);
    }
}
