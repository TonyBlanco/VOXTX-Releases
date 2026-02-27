package x0;

import K0.AbstractC0683n;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.k;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: x0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2949e extends AbstractC2945a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final WeakReference f51873f;

    public C2949e(Toolbar toolbar, C2946b c2946b) {
        super(toolbar.getContext(), c2946b);
        this.f51873f = new WeakReference(toolbar);
    }

    @Override // x0.AbstractC2945a, androidx.navigation.NavController.b
    public void a(NavController navController, k kVar, Bundle bundle) {
        if (((Toolbar) this.f51873f.get()) == null) {
            navController.x(this);
        } else {
            super.a(navController, kVar, bundle);
        }
    }

    @Override // x0.AbstractC2945a
    public void c(Drawable drawable, int i9) {
        Toolbar toolbar = (Toolbar) this.f51873f.get();
        if (toolbar != null) {
            boolean z9 = drawable == null && toolbar.getNavigationIcon() != null;
            toolbar.setNavigationIcon(drawable);
            toolbar.setNavigationContentDescription(i9);
            if (z9) {
                AbstractC0683n.a(toolbar);
            }
        }
    }

    @Override // x0.AbstractC2945a
    public void d(CharSequence charSequence) {
        ((Toolbar) this.f51873f.get()).setTitle(charSequence);
    }
}
