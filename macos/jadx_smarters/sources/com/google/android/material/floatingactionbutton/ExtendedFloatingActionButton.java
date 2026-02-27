package com.google.android.material.floatingactionbutton;

import P.L;
import R4.k;
import R4.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import d.AbstractC1617D;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f27374u = k.f8864r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Property f27375v = new a(Float.class, "width");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Property f27376w = new b(Float.class, "height");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Property f27377x = new c(Float.class, "paddingStart");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Property f27378y = new d(Float.class, "paddingEnd");

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Rect f27379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f27380b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f27381c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f27380b = false;
            this.f27381c = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f8961L1);
            this.f27380b = typedArrayObtainStyledAttributes.getBoolean(l.f8969M1, false);
            this.f27381c = typedArrayObtainStyledAttributes.getBoolean(l.f8977N1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public static boolean G(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        public void E(ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (this.f27381c) {
                ExtendedFloatingActionButton.m(extendedFloatingActionButton);
            } else {
                ExtendedFloatingActionButton.n(extendedFloatingActionButton);
            }
            ExtendedFloatingActionButton.l(extendedFloatingActionButton, null, null);
        }

        public boolean F(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.b(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        public boolean H(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            }
            if (!G(view)) {
                return false;
            }
            M(view, extendedFloatingActionButton);
            return false;
        }

        public boolean I(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i9) {
            List listS = coordinatorLayout.s(extendedFloatingActionButton);
            int size = listS.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) listS.get(i10);
                if (!(view instanceof AppBarLayout)) {
                    if (G(view) && M(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.J(extendedFloatingActionButton, i9);
            return true;
        }

        public final boolean J(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            throw null;
        }

        public void K(ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (this.f27381c) {
                ExtendedFloatingActionButton.j(extendedFloatingActionButton);
            } else {
                ExtendedFloatingActionButton.k(extendedFloatingActionButton);
            }
            ExtendedFloatingActionButton.l(extendedFloatingActionButton, null, null);
        }

        public final boolean L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!J(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f27379a == null) {
                this.f27379a = new Rect();
            }
            Rect rect = this.f27379a;
            f5.c.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                K(extendedFloatingActionButton);
                return true;
            }
            E(extendedFloatingActionButton);
            return true;
        }

        public final boolean M(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (J(view, extendedFloatingActionButton)) {
                throw null;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean b(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            AbstractC1617D.a(view);
            return F(coordinatorLayout, null, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void g(CoordinatorLayout.f fVar) {
            if (fVar.f14502h == 0) {
                fVar.f14502h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            AbstractC1617D.a(view);
            return H(coordinatorLayout, null, view2);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i9) {
            AbstractC1617D.a(view);
            return I(coordinatorLayout, null, i9);
        }
    }

    public class a extends Property {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f9) {
            view.getLayoutParams().width = f9.intValue();
            view.requestLayout();
        }
    }

    public class b extends Property {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f9) {
            view.getLayoutParams().height = f9.intValue();
            view.requestLayout();
        }
    }

    public class c extends Property {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(L.J(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f9) {
            L.F0(view, f9.intValue(), view.getPaddingTop(), L.I(view), view.getPaddingBottom());
        }
    }

    public class d extends Property {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(L.I(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f9) {
            L.F0(view, L.J(view), view.getPaddingTop(), f9.intValue(), view.getPaddingBottom());
        }
    }

    public static abstract class e {
    }

    public static /* synthetic */ com.google.android.material.floatingactionbutton.b j(ExtendedFloatingActionButton extendedFloatingActionButton) {
        throw null;
    }

    public static /* synthetic */ com.google.android.material.floatingactionbutton.b k(ExtendedFloatingActionButton extendedFloatingActionButton) {
        throw null;
    }

    public static /* synthetic */ void l(ExtendedFloatingActionButton extendedFloatingActionButton, com.google.android.material.floatingactionbutton.b bVar, e eVar) {
        throw null;
    }

    public static /* synthetic */ com.google.android.material.floatingactionbutton.b m(ExtendedFloatingActionButton extendedFloatingActionButton) {
        throw null;
    }

    public static /* synthetic */ com.google.android.material.floatingactionbutton.b n(ExtendedFloatingActionButton extendedFloatingActionButton) {
        throw null;
    }
}
