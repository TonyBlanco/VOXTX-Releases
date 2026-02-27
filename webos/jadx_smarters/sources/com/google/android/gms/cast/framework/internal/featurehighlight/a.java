package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f26340a;

    public a(h hVar) {
        this.f26340a = hVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        float x9 = motionEvent.getX();
        float y9 = motionEvent.getY();
        h hVar = this.f26340a;
        if (hVar.f26359l == null) {
            return true;
        }
        if (hVar.f26351d.contains(Math.round(x9), Math.round(y9)) && this.f26340a.f26352e.g(x9, y9)) {
            return true;
        }
        this.f26340a.f26359l.zza();
        return true;
    }
}
