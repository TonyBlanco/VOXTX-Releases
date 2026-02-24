package androidx.mediarouter.app;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import c.AbstractC1238a;
import k.C2125u;

/* JADX INFO: loaded from: classes.dex */
class MediaRouteVolumeSlider extends C2125u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f16020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f16022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f16024g;

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1238a.f17735L);
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f16020c = i.h(context);
    }

    public void a(int i9) {
        b(i9, i9);
    }

    public void b(int i9, int i10) {
        if (this.f16023f != i9) {
            if (Color.alpha(i9) != 255) {
                Log.e("MediaRouteVolumeSlider", "Volume slider progress and thumb color cannot be translucent: #" + Integer.toHexString(i9));
            }
            this.f16023f = i9;
        }
        if (this.f16024g != i10) {
            if (Color.alpha(i10) != 255) {
                Log.e("MediaRouteVolumeSlider", "Volume slider background color cannot be translucent: #" + Integer.toHexString(i10));
            }
            this.f16024g = i10;
        }
    }

    public void c(boolean z9) {
        if (this.f16021d == z9) {
            return;
        }
        this.f16021d = z9;
        super.setThumb(z9 ? null : this.f16022e);
    }

    @Override // k.C2125u, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int i9 = isEnabled() ? 255 : (int) (this.f16020c * 255.0f);
        Drawable drawable = this.f16022e;
        int i10 = this.f16023f;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(i10, mode);
        this.f16022e.setAlpha(i9);
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) getProgressDrawable();
            Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.progress);
            layerDrawable.findDrawableByLayerId(R.id.background).setColorFilter(this.f16024g, mode);
            progressDrawable = drawableFindDrawableByLayerId;
        }
        progressDrawable.setColorFilter(this.f16023f, mode);
        progressDrawable.setAlpha(i9);
    }

    @Override // android.widget.AbsSeekBar
    public void setThumb(Drawable drawable) {
        this.f16022e = drawable;
        if (this.f16021d) {
            drawable = null;
        }
        super.setThumb(drawable);
    }
}
