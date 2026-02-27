package com.google.android.material.bottomappbar;

import P.L;
import R4.k;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import d.AbstractC1617D;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BottomAppBar extends Toolbar implements CoordinatorLayout.b {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final int f27028V = k.f8858l;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Rect f27029e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public WeakReference f27030f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f27031g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final View.OnLayoutChangeListener f27032h;

        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                AbstractC1617D.a(Behavior.this.f27030f.get());
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.f27032h = new a();
            this.f27029e = new Rect();
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f27032h = new a();
            this.f27029e = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i9, int i10) {
            AbstractC1617D.a(view);
            return O(coordinatorLayout, null, view2, view3, i9, i10);
        }

        public boolean N(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i9) {
            this.f27030f = new WeakReference(bottomAppBar);
            View viewT = BottomAppBar.T(bottomAppBar);
            if (viewT != null && !L.W(viewT)) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) viewT.getLayoutParams();
                fVar.f14498d = 49;
                this.f27031g = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                if (viewT instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) viewT;
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(R4.a.f8652b);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(R4.a.f8651a);
                    }
                    floatingActionButton.addOnLayoutChangeListener(this.f27032h);
                    BottomAppBar.U(bottomAppBar, floatingActionButton);
                }
                BottomAppBar.S(bottomAppBar);
            }
            coordinatorLayout.J(bottomAppBar, i9);
            return super.l(coordinatorLayout, bottomAppBar, i9);
        }

        public boolean O(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i9, int i10) {
            throw null;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i9) {
            AbstractC1617D.a(view);
            return N(coordinatorLayout, null, i9);
        }
    }

    public static /* synthetic */ void S(BottomAppBar bottomAppBar) {
        throw null;
    }

    public static /* synthetic */ View T(BottomAppBar bottomAppBar) {
        throw null;
    }

    public static /* synthetic */ void U(BottomAppBar bottomAppBar, FloatingActionButton floatingActionButton) {
        throw null;
    }
}
