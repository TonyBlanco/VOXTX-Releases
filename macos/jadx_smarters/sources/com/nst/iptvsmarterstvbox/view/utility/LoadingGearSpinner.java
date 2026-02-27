package com.nst.iptvsmarterstvbox.view.utility;

import a7.e;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes4.dex */
public class LoadingGearSpinner extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f37690a = e.f11995d0;

    public LoadingGearSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a() {
        clearAnimation();
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(1000L);
        rotateAnimation.setRepeatCount(-1);
        startAnimation(rotateAnimation);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setImageResource(f37690a);
        a();
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i9) {
        if (i9 == 0) {
            a();
        } else {
            clearAnimation();
        }
        super.setVisibility(i9);
    }
}
