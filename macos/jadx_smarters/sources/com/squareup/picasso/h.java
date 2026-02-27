package com.squareup.picasso;

import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class h implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f39079a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f39080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC1611e f39081d;

    public h(x xVar, ImageView imageView, InterfaceC1611e interfaceC1611e) {
        this.f39079a = xVar;
        this.f39080c = new WeakReference(imageView);
        this.f39081d = interfaceC1611e;
        imageView.getViewTreeObserver().addOnPreDrawListener(this);
    }

    public void a() {
        this.f39081d = null;
        ImageView imageView = (ImageView) this.f39080c.get();
        if (imageView == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        ImageView imageView = (ImageView) this.f39080c.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width > 0 && height > 0) {
            viewTreeObserver.removeOnPreDrawListener(this);
            this.f39079a.l().k(width, height).h(imageView, this.f39081d);
        }
        return true;
    }
}
