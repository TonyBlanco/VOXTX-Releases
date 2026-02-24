package com.nst.iptvsmarterstvbox.view.utility;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.viewpager.widget.ViewPager;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes4.dex */
public class NonSwipeableViewPager extends ViewPager {

    public class a extends Scroller {
        public a(Context context) {
            super(context, new DecelerateInterpolator());
        }

        @Override // android.widget.Scroller
        public void startScroll(int i9, int i10, int i11, int i12, int i13) {
            super.startScroll(i9, i10, i11, i12, 350);
        }
    }

    public NonSwipeableViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        R();
    }

    public final void R() {
        try {
            Field declaredField = ViewPager.class.getDeclaredField("k");
            declaredField.setAccessible(true);
            declaredField.set(this, new a(getContext()));
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean o(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
