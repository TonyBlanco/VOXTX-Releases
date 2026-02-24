package com.google.android.material.transformation;

import P.L;
import S4.c;
import S4.f;
import S4.g;
import S4.h;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f27814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RectF f27815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f27816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f27817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f27818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f27819h;

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f27820a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f27821c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f27822d;

        public a(boolean z9, View view, View view2) {
            this.f27820a = z9;
            this.f27821c = view;
            this.f27822d = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f27820a) {
                return;
            }
            this.f27821c.setVisibility(4);
            this.f27822d.setAlpha(1.0f);
            this.f27822d.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f27820a) {
                this.f27821c.setVisibility(0);
                this.f27822d.setAlpha(0.0f);
                this.f27822d.setVisibility(4);
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f f27824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public h f27825b;
    }

    public FabTransformationBehavior() {
        this.f27814c = new Rect();
        this.f27815d = new RectF();
        this.f27816e = new RectF();
        this.f27817f = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27814c = new Rect();
        this.f27815d = new RectF();
        this.f27816e = new RectF();
        this.f27817f = new int[2];
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public AnimatorSet J(View view, View view2, boolean z9, boolean z10) {
        b bVarZ = Z(view2.getContext(), z9);
        if (z9) {
            this.f27818g = view.getTranslationX();
            this.f27819h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        V(view, view2, z9, z10, bVarZ, arrayList, arrayList2);
        RectF rectF = this.f27815d;
        Y(view, view2, z9, z10, bVarZ, arrayList, arrayList2, rectF);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        U(view, view2, z9, bVarZ, arrayList);
        X(view, view2, z9, z10, bVarZ, arrayList, arrayList2);
        W(view, view2, z9, z10, bVarZ, fWidth, fHeight, arrayList, arrayList2);
        T(view, view2, z9, z10, bVarZ, arrayList, arrayList2);
        S(view, view2, z9, z10, bVarZ, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        S4.b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z9, view2, view));
        int size = arrayList2.size();
        for (int i9 = 0; i9 < size; i9++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i9));
        }
        return animatorSet;
    }

    public final ViewGroup K(View view) {
        View viewFindViewById = view.findViewById(R4.f.f8761A);
        return viewFindViewById != null ? a0(viewFindViewById) : a0(view);
    }

    public final void L(View view, b bVar, g gVar, g gVar2, float f9, float f10, float f11, float f12, RectF rectF) {
        float fQ = Q(bVar, gVar, f9, f11);
        float fQ2 = Q(bVar, gVar2, f10, f12);
        Rect rect = this.f27814c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f27815d;
        rectF2.set(rect);
        RectF rectF3 = this.f27816e;
        R(view, rectF3);
        rectF3.offset(fQ, fQ2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    public final void M(View view, RectF rectF) {
        R(view, rectF);
        rectF.offset(this.f27818g, this.f27819h);
    }

    public final Pair N(float f9, float f10, boolean z9, b bVar) {
        g gVarE;
        f fVar;
        String str;
        if (f9 == 0.0f || f10 == 0.0f) {
            gVarE = bVar.f27824a.e("translationXLinear");
            fVar = bVar.f27824a;
            str = "translationYLinear";
        } else if ((!z9 || f10 >= 0.0f) && (z9 || f10 <= 0.0f)) {
            gVarE = bVar.f27824a.e("translationXCurveDownwards");
            fVar = bVar.f27824a;
            str = "translationYCurveDownwards";
        } else {
            gVarE = bVar.f27824a.e("translationXCurveUpwards");
            fVar = bVar.f27824a;
            str = "translationYCurveUpwards";
        }
        return new Pair(gVarE, fVar.e(str));
    }

    public final float O(View view, View view2, h hVar) {
        float fCenterX;
        float fCenterX2;
        float f9;
        RectF rectF = this.f27815d;
        RectF rectF2 = this.f27816e;
        M(view, rectF);
        R(view2, rectF2);
        int i9 = hVar.f9426a & 7;
        if (i9 == 1) {
            fCenterX = rectF2.centerX();
            fCenterX2 = rectF.centerX();
        } else if (i9 == 3) {
            fCenterX = rectF2.left;
            fCenterX2 = rectF.left;
        } else {
            if (i9 != 5) {
                f9 = 0.0f;
                return f9 + hVar.f9427b;
            }
            fCenterX = rectF2.right;
            fCenterX2 = rectF.right;
        }
        f9 = fCenterX - fCenterX2;
        return f9 + hVar.f9427b;
    }

    public final float P(View view, View view2, h hVar) {
        float fCenterY;
        float fCenterY2;
        float f9;
        RectF rectF = this.f27815d;
        RectF rectF2 = this.f27816e;
        M(view, rectF);
        R(view2, rectF2);
        int i9 = hVar.f9426a & 112;
        if (i9 == 16) {
            fCenterY = rectF2.centerY();
            fCenterY2 = rectF.centerY();
        } else if (i9 == 48) {
            fCenterY = rectF2.top;
            fCenterY2 = rectF.top;
        } else {
            if (i9 != 80) {
                f9 = 0.0f;
                return f9 + hVar.f9428c;
            }
            fCenterY = rectF2.bottom;
            fCenterY2 = rectF.bottom;
        }
        f9 = fCenterY - fCenterY2;
        return f9 + hVar.f9428c;
    }

    public final float Q(b bVar, g gVar, float f9, float f10) {
        long jC = gVar.c();
        long jD = gVar.d();
        g gVarE = bVar.f27824a.e("expansion");
        return S4.a.a(f9, f10, gVar.e().getInterpolation((((gVarE.c() + gVarE.d()) + 17) - jC) / jD));
    }

    public final void R(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f27817f);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public final void S(View view, View view2, boolean z9, boolean z10, b bVar, List list, List list2) {
        ViewGroup viewGroupK;
        ObjectAnimator objectAnimatorOfFloat;
        if ((view2 instanceof ViewGroup) && (viewGroupK = K(view2)) != null) {
            if (z9) {
                if (!z10) {
                    c.f9414a.set(viewGroupK, Float.valueOf(0.0f));
                }
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupK, (Property<ViewGroup, Float>) c.f9414a, 1.0f);
            } else {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupK, (Property<ViewGroup, Float>) c.f9414a, 0.0f);
            }
            bVar.f27824a.e("contentFade").a(objectAnimatorOfFloat);
            list.add(objectAnimatorOfFloat);
        }
    }

    public final void T(View view, View view2, boolean z9, boolean z10, b bVar, List list, List list2) {
    }

    public final void U(View view, View view2, boolean z9, b bVar, List list) {
        float fO = O(view, view2, bVar.f27825b);
        float fP = P(view, view2, bVar.f27825b);
        Pair pairN = N(fO, fP, z9, bVar);
        g gVar = (g) pairN.first;
        g gVar2 = (g) pairN.second;
        Property property = View.TRANSLATION_X;
        if (!z9) {
            fO = this.f27818g;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fO);
        Property property2 = View.TRANSLATION_Y;
        if (!z9) {
            fP = this.f27819h;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fP);
        gVar.a(objectAnimatorOfFloat);
        gVar2.a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    public final void V(View view, View view2, boolean z9, boolean z10, b bVar, List list, List list2) {
        ObjectAnimator objectAnimatorOfFloat;
        float fY = L.y(view2) - L.y(view);
        if (z9) {
            if (!z10) {
                view2.setTranslationZ(-fY);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -fY);
        }
        bVar.f27824a.e("elevation").a(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    public final void W(View view, View view2, boolean z9, boolean z10, b bVar, float f9, float f10, List list, List list2) {
    }

    public final void X(View view, View view2, boolean z9, boolean z10, b bVar, List list, List list2) {
    }

    public final void Y(View view, View view2, boolean z9, boolean z10, b bVar, List list, List list2, RectF rectF) {
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        float fO = O(view, view2, bVar.f27825b);
        float fP = P(view, view2, bVar.f27825b);
        Pair pairN = N(fO, fP, z9, bVar);
        g gVar = (g) pairN.first;
        g gVar2 = (g) pairN.second;
        if (z9) {
            if (!z10) {
                view2.setTranslationX(-fO);
                view2.setTranslationY(-fP);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            L(view2, bVar, gVar, gVar2, -fO, -fP, 0.0f, 0.0f, rectF);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fO);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fP);
        }
        gVar.a(objectAnimatorOfFloat);
        gVar2.a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    public abstract b Z(Context context, boolean z9);

    public final ViewGroup a0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        if (fVar.f14502h == 0) {
            fVar.f14502h = 80;
        }
    }
}
