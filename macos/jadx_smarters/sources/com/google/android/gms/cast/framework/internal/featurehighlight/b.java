package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f26341a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f26342c;

    public b(h hVar, View view, boolean z9, g gVar) {
        this.f26341a = view;
        this.f26342c = gVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (this.f26341a.getParent() != null) {
            this.f26341a.performClick();
        }
        this.f26342c.zzb();
        return true;
    }
}
