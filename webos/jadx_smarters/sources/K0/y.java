package K0;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* JADX INFO: loaded from: classes.dex */
public class y implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewOverlay f3577a;

    public y(View view) {
        this.f3577a = view.getOverlay();
    }

    @Override // K0.z
    public void a(Drawable drawable) {
        this.f3577a.add(drawable);
    }

    @Override // K0.z
    public void b(Drawable drawable) {
        this.f3577a.remove(drawable);
    }
}
