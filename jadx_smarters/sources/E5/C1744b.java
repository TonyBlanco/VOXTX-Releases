package e5;

import O.h;
import R4.c;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import j5.AbstractC2100b;
import java.util.ArrayList;
import k5.InterfaceC2149b;
import l5.C2198g;
import l5.k;

/* JADX INFO: renamed from: e5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1744b extends com.google.android.material.floatingactionbutton.a {

    /* JADX INFO: renamed from: e5.b$a */
    public static class a extends C2198g {
        public a(k kVar) {
            super(kVar);
        }

        @Override // l5.C2198g, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    public C1744b(FloatingActionButton floatingActionButton, InterfaceC2149b interfaceC2149b) {
        super(floatingActionButton, interfaceC2149b);
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void A(int[] iArr) {
        FloatingActionButton floatingActionButton;
        if (Build.VERSION.SDK_INT == 21) {
            float f9 = 0.0f;
            if (this.f27434w.isEnabled()) {
                this.f27434w.setElevation(this.f27419h);
                if (this.f27434w.isPressed()) {
                    floatingActionButton = this.f27434w;
                    f9 = this.f27421j;
                } else if (this.f27434w.isFocused() || this.f27434w.isHovered()) {
                    floatingActionButton = this.f27434w;
                    f9 = this.f27420i;
                }
                floatingActionButton.setTranslationZ(f9);
            }
            this.f27434w.setElevation(0.0f);
            floatingActionButton = this.f27434w;
            floatingActionButton.setTranslationZ(f9);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void B(float f9, float f10, float f11) {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 == 21) {
            this.f27434w.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.f27403E, f0(f9, f11));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.f27404F, f0(f9, f10));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.f27405G, f0(f9, f10));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.f27406H, f0(f9, f10));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f27434w, "elevation", f9).setDuration(0L));
            if (i9 >= 22 && i9 <= 24) {
                FloatingActionButton floatingActionButton = this.f27434w;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f27434w, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(com.google.android.material.floatingactionbutton.a.f27402D);
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.f27407I, animatorSet);
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.f27408J, f0(0.0f, 0.0f));
            this.f27434w.setStateListAnimator(stateListAnimator);
        }
        if (V()) {
            b0();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public boolean G() {
        return false;
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void R(ColorStateList colorStateList) {
        Drawable drawable = this.f27414c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(AbstractC2100b.d(colorStateList));
        } else {
            super.R(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public boolean V() {
        return this.f27435x.c() || !X();
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void Z() {
    }

    public C1743a e0(int i9, ColorStateList colorStateList) {
        Context context = this.f27434w.getContext();
        C1743a c1743a = new C1743a((k) h.f(this.f27412a));
        c1743a.e(E.b.getColor(context, c.f8696e), E.b.getColor(context, c.f8695d), E.b.getColor(context, c.f8693b), E.b.getColor(context, c.f8694c));
        c1743a.d(i9);
        c1743a.c(colorStateList);
        return c1743a;
    }

    public final Animator f0(float f9, float f10) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f27434w, "elevation", f9).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f27434w, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f10).setDuration(100L));
        animatorSet.setInterpolator(com.google.android.material.floatingactionbutton.a.f27402D);
        return animatorSet;
    }

    public C2198g g0() {
        return new a((k) h.f(this.f27412a));
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public float j() {
        return this.f27434w.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void o(Rect rect) {
        if (this.f27435x.c()) {
            super.o(rect);
        } else {
            int sizeDimension = !X() ? (this.f27422k - this.f27434w.getSizeDimension()) / 2 : 0;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void t(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i9) {
        Drawable layerDrawable;
        C2198g c2198gG0 = g0();
        this.f27413b = c2198gG0;
        c2198gG0.setTintList(colorStateList);
        if (mode != null) {
            this.f27413b.setTintMode(mode);
        }
        this.f27413b.L(this.f27434w.getContext());
        if (i9 > 0) {
            this.f27415d = e0(i9, colorStateList);
            layerDrawable = new LayerDrawable(new Drawable[]{(Drawable) h.f(this.f27415d), (Drawable) h.f(this.f27413b)});
        } else {
            this.f27415d = null;
            layerDrawable = this.f27413b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(AbstractC2100b.d(colorStateList2), layerDrawable, null);
        this.f27414c = rippleDrawable;
        this.f27416e = rippleDrawable;
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void w() {
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void y() {
        b0();
    }
}
