package T4;

import P.AbstractC0974p;
import P.L;
import P.X;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f9530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f9531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9533g;

    public c() {
        this.f9530d = new Rect();
        this.f9531e = new Rect();
        this.f9532f = 0;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9530d = new Rect();
        this.f9531e = new Rect();
        this.f9532f = 0;
    }

    public static int N(int i9) {
        if (i9 == 0) {
            return 8388659;
        }
        return i9;
    }

    @Override // T4.d
    public void F(CoordinatorLayout coordinatorLayout, View view, int i9) {
        int bottom;
        View viewH = H(coordinatorLayout.s(view));
        if (viewH != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
            Rect rect = this.f9530d;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, viewH.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((coordinatorLayout.getHeight() + viewH.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
            X lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && L.B(coordinatorLayout) && !L.B(view)) {
                rect.left += lastWindowInsets.i();
                rect.right -= lastWindowInsets.j();
            }
            Rect rect2 = this.f9531e;
            AbstractC0974p.a(N(fVar.f14497c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i9);
            int I9 = I(viewH);
            view.layout(rect2.left, rect2.top - I9, rect2.right, rect2.bottom - I9);
            bottom = rect2.top - viewH.getBottom();
        } else {
            super.F(coordinatorLayout, view, i9);
            bottom = 0;
        }
        this.f9532f = bottom;
    }

    public abstract View H(List list);

    public final int I(View view) {
        if (this.f9533g == 0) {
            return 0;
        }
        float fJ = J(view);
        int i9 = this.f9533g;
        return J.a.b((int) (fJ * i9), 0, i9);
    }

    public abstract float J(View view);

    public final int K() {
        return this.f9533g;
    }

    public int L(View view) {
        return view.getMeasuredHeight();
    }

    public final int M() {
        return this.f9532f;
    }

    public final void O(int i9) {
        this.f9533g = i9;
    }

    public boolean P() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i9, int i10, int i11, int i12) {
        View viewH;
        X lastWindowInsets;
        int i13 = view.getLayoutParams().height;
        if ((i13 != -1 && i13 != -2) || (viewH = H(coordinatorLayout.s(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i11);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (L.B(viewH) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.k() + lastWindowInsets.h();
        }
        int iL = size + L(viewH);
        int measuredHeight = viewH.getMeasuredHeight();
        if (P()) {
            view.setTranslationY(-measuredHeight);
        } else {
            iL -= measuredHeight;
        }
        coordinatorLayout.K(view, i9, i10, View.MeasureSpec.makeMeasureSpec(iL, i13 == -1 ? 1073741824 : Integer.MIN_VALUE), i12);
        return true;
    }
}
