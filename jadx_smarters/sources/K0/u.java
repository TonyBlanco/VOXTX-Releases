package K0;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* JADX INFO: loaded from: classes.dex */
public class u implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroupOverlay f3575a;

    public u(ViewGroup viewGroup) {
        this.f3575a = viewGroup.getOverlay();
    }

    @Override // K0.z
    public void a(Drawable drawable) {
        this.f3575a.add(drawable);
    }

    @Override // K0.z
    public void b(Drawable drawable) {
        this.f3575a.remove(drawable);
    }

    @Override // K0.v
    public void c(View view) {
        this.f3575a.add(view);
    }

    @Override // K0.v
    public void d(View view) {
        this.f3575a.remove(view);
    }
}
