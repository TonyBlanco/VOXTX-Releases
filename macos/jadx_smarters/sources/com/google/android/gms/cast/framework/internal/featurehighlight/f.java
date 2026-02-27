package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f26347a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f26348c;

    public f(h hVar, Runnable runnable) {
        this.f26348c = hVar;
        this.f26347a = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f26348c.setVisibility(8);
        this.f26348c.f26355h = null;
        this.f26347a.run();
    }
}
