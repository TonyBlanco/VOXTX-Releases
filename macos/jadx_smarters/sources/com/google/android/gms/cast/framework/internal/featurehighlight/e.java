package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f26345a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f26346c;

    public e(h hVar, Runnable runnable) {
        this.f26346c = hVar;
        this.f26345a = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f26346c.setVisibility(8);
        this.f26346c.f26355h = null;
        this.f26345a.run();
    }
}
