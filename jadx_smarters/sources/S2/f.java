package s2;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import io.supercharge.shimmerlayout.ShimmerLayout;

/* JADX INFO: loaded from: classes.dex */
public class f extends RecyclerView.D {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ShimmerLayout f49889t;

    public f(LayoutInflater layoutInflater, ViewGroup viewGroup, int i9) {
        super(layoutInflater.inflate(b.f49865b, viewGroup, false));
        ShimmerLayout shimmerLayout = (ShimmerLayout) this.f16733a;
        this.f49889t = shimmerLayout;
        layoutInflater.inflate(i9, (ViewGroup) shimmerLayout, true);
    }

    public void P() {
        this.f49889t.n();
    }

    public void Q(boolean z9) {
        this.f49889t.setAnimationReversed(z9);
    }

    public final void R(Drawable drawable) {
        this.f49889t.setBackground(drawable);
    }

    public void S(int i9) {
        this.f49889t.setShimmerAngle(i9);
    }

    public void T(int i9) {
        this.f49889t.setShimmerAnimationDuration(i9);
    }

    public void U(int i9) {
        this.f49889t.setShimmerColor(i9);
    }

    public void V(Drawable drawable) {
        if (drawable != null) {
            R(drawable);
        }
    }
}
