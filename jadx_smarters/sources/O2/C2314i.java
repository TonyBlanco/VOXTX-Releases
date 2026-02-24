package o2;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import e2.AbstractC1732b;

/* JADX INFO: renamed from: o2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2314i extends AbstractC1732b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractC1732b f45755a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f45756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f45757d;

    /* JADX INFO: renamed from: o2.i$a */
    public static class a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f45758a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f45759b;

        public a(Drawable.ConstantState constantState, int i9) {
            this.f45758a = constantState;
            this.f45759b = i9;
        }

        public a(a aVar) {
            this(aVar.f45758a, aVar.f45759b);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return newDrawable(null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C2314i(this, null, resources);
        }
    }

    public C2314i(AbstractC1732b abstractC1732b, int i9) {
        this(new a(abstractC1732b.getConstantState(), i9), abstractC1732b, null);
    }

    public C2314i(a aVar, AbstractC1732b abstractC1732b, Resources resources) {
        this.f45756c = aVar;
        if (abstractC1732b != null) {
            this.f45755a = abstractC1732b;
        } else {
            Drawable.ConstantState constantState = aVar.f45758a;
            this.f45755a = (AbstractC1732b) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
        }
    }

    @Override // e2.AbstractC1732b
    public boolean b() {
        return this.f45755a.b();
    }

    @Override // e2.AbstractC1732b
    public void c(int i9) {
        this.f45755a.c(i9);
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.f45755a.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f45755a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f45755a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.Callback getCallback() {
        return this.f45755a.getCallback();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.f45755a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f45756c;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f45755a.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f45756c.f45759b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f45756c.f45759b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f45755a.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f45755a.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f45755a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f45755a.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        super.invalidateSelf();
        this.f45755a.invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f45755a.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f45757d && super.mutate() == this) {
            this.f45755a = (AbstractC1732b) this.f45755a.mutate();
            this.f45756c = new a(this.f45756c);
            this.f45757d = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j9) {
        super.scheduleSelf(runnable, j9);
        this.f45755a.scheduleSelf(runnable, j9);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i9) {
        this.f45755a.setAlpha(i9);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i9, int i10, int i11, int i12) {
        super.setBounds(i9, i10, i11, i12);
        this.f45755a.setBounds(i9, i10, i11, i12);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(Rect rect) {
        super.setBounds(rect);
        this.f45755a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i9) {
        this.f45755a.setChangingConfigurations(i9);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i9, PorterDuff.Mode mode) {
        this.f45755a.setColorFilter(i9, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f45755a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z9) {
        this.f45755a.setDither(z9);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z9) {
        this.f45755a.setFilterBitmap(z9);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z9, boolean z10) {
        return this.f45755a.setVisible(z9, z10);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f45755a.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f45755a.stop();
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        super.unscheduleSelf(runnable);
        this.f45755a.unscheduleSelf(runnable);
    }
}
