package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f26343a;

    public c(h hVar, Runnable runnable) {
        this.f26343a = hVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f26343a.k();
        this.f26343a.removeOnLayoutChangeListener(this);
    }
}
