package P;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class H implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f6738a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewTreeObserver f6739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Runnable f6740d;

    public H(View view, Runnable runnable) {
        this.f6738a = view;
        this.f6739c = view.getViewTreeObserver();
        this.f6740d = runnable;
    }

    public static H a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        H h9 = new H(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(h9);
        view.addOnAttachStateChangeListener(h9);
        return h9;
    }

    public void b() {
        (this.f6739c.isAlive() ? this.f6739c : this.f6738a.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f6738a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f6740d.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f6739c = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
