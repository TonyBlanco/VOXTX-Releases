package com.google.android.material.transformation;

import P.L;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import d5.InterfaceC1709a;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27807a;

    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f27808a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f27809c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1709a f27810d;

        public a(View view, int i9, InterfaceC1709a interfaceC1709a) {
            this.f27808a = view;
            this.f27809c = i9;
            this.f27810d = interfaceC1709a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f27808a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f27807a == this.f27809c) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                InterfaceC1709a interfaceC1709a = this.f27810d;
                expandableBehavior.H((View) interfaceC1709a, this.f27808a, interfaceC1709a.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f27807a = 0;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27807a = 0;
    }

    public final boolean F(boolean z9) {
        if (!z9) {
            return this.f27807a == 1;
        }
        int i9 = this.f27807a;
        return i9 == 0 || i9 == 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InterfaceC1709a G(CoordinatorLayout coordinatorLayout, View view) {
        List listS = coordinatorLayout.s(view);
        int size = listS.size();
        for (int i9 = 0; i9 < size; i9++) {
            View view2 = (View) listS.get(i9);
            if (e(coordinatorLayout, view, view2)) {
                return (InterfaceC1709a) view2;
            }
        }
        return null;
    }

    public abstract boolean H(View view, View view2, boolean z9, boolean z10);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean e(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        InterfaceC1709a interfaceC1709a = (InterfaceC1709a) view2;
        if (!F(interfaceC1709a.a())) {
            return false;
        }
        this.f27807a = interfaceC1709a.a() ? 1 : 2;
        return H((View) interfaceC1709a, view, interfaceC1709a.a(), true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i9) {
        InterfaceC1709a interfaceC1709aG;
        if (L.W(view) || (interfaceC1709aG = G(coordinatorLayout, view)) == null || !F(interfaceC1709aG.a())) {
            return false;
        }
        int i10 = interfaceC1709aG.a() ? 1 : 2;
        this.f27807a = i10;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i10, interfaceC1709aG));
        return false;
    }
}
