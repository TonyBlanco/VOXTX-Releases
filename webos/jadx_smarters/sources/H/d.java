package H;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends Drawable implements Drawable.Callback, c, b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final PorterDuff.Mode f2373h = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2374a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f2375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f f2377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2378f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f2379g;

    public d(f fVar, Resources resources) {
        this.f2377e = fVar;
        e(resources);
    }

    public d(Drawable drawable) {
        this.f2377e = d();
        b(drawable);
    }

    @Override // H.c
    public final Drawable a() {
        return this.f2379g;
    }

    @Override // H.c
    public final void b(Drawable drawable) {
        Drawable drawable2 = this.f2379g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2379g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            f fVar = this.f2377e;
            if (fVar != null) {
                fVar.f2382b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public abstract boolean c();

    public final f d() {
        return new f(this.f2377e);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f2379g.draw(canvas);
    }

    public final void e(Resources resources) {
        Drawable.ConstantState constantState;
        f fVar = this.f2377e;
        if (fVar == null || (constantState = fVar.f2382b) == null) {
            return;
        }
        b(constantState.newDrawable(resources));
    }

    public final boolean f(int[] iArr) {
        if (!c()) {
            return false;
        }
        f fVar = this.f2377e;
        ColorStateList colorStateList = fVar.f2383c;
        PorterDuff.Mode mode = fVar.f2384d;
        if (colorStateList == null || mode == null) {
            this.f2376d = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f2376d || colorForState != this.f2374a || mode != this.f2375c) {
                setColorFilter(colorForState, mode);
                this.f2374a = colorForState;
                this.f2375c = mode;
                this.f2376d = true;
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        f fVar = this.f2377e;
        return changingConfigurations | (fVar != null ? fVar.getChangingConfigurations() : 0) | this.f2379g.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        f fVar = this.f2377e;
        if (fVar == null || !fVar.a()) {
            return null;
        }
        this.f2377e.f2381a = getChangingConfigurations();
        return this.f2377e;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f2379g.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f2379g.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f2379g.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        return a.f(this.f2379g);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f2379g.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f2379g.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f2379g.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f2379g.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f2379g.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f2379g.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return a.h(this.f2379g);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        f fVar;
        ColorStateList colorStateList = (!c() || (fVar = this.f2377e) == null) ? null : fVar.f2383c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f2379g.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f2379g.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f2378f && super.mutate() == this) {
            this.f2377e = d();
            Drawable drawable = this.f2379g;
            if (drawable != null) {
                drawable.mutate();
            }
            f fVar = this.f2377e;
            if (fVar != null) {
                Drawable drawable2 = this.f2379g;
                fVar.f2382b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f2378f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2379g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i9) {
        return a.m(this.f2379g, i9);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i9) {
        return this.f2379g.setLevel(i9);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j9) {
        scheduleSelf(runnable, j9);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i9) {
        this.f2379g.setAlpha(i9);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z9) {
        a.j(this.f2379g, z9);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i9) {
        this.f2379g.setChangingConfigurations(i9);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2379g.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z9) {
        this.f2379g.setDither(z9);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z9) {
        this.f2379g.setFilterBitmap(z9);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return f(iArr) || this.f2379g.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i9) {
        setTintList(ColorStateList.valueOf(i9));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f2377e.f2383c = colorStateList;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f2377e.f2384d = mode;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z9, boolean z10) {
        return super.setVisible(z9, z10) || this.f2379g.setVisible(z9, z10);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
