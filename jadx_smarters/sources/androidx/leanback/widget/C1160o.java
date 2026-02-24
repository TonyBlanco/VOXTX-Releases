package androidx.leanback.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.leanback.widget.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1160o extends G {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f15737g = new int[2];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Rect f15738h = new Rect();

    @Override // androidx.leanback.widget.G
    public void d(View view) {
        b().addView(view);
    }

    @Override // androidx.leanback.widget.G
    public void e(View view) {
        int measuredWidth;
        int width = b().getWidth() - b().getPaddingRight();
        int paddingLeft = b().getPaddingLeft();
        view.measure(0, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z9 = P.L.E(view) == 1;
        if (!z9 && this.f15735e + view.getMeasuredWidth() > width) {
            measuredWidth = width - view.getMeasuredWidth();
            marginLayoutParams.leftMargin = measuredWidth;
        } else if (z9 && this.f15735e < paddingLeft) {
            marginLayoutParams.leftMargin = paddingLeft;
        } else if (z9) {
            width = this.f15736f;
            measuredWidth = width - view.getMeasuredWidth();
            marginLayoutParams.leftMargin = measuredWidth;
        } else {
            measuredWidth = this.f15735e;
            marginLayoutParams.leftMargin = measuredWidth;
        }
        view.requestLayout();
    }

    public void k(HorizontalGridView horizontalGridView, View view, Object obj) {
        ViewGroup viewGroupB = b();
        horizontalGridView.C1(view, this.f15737g);
        this.f15738h.set(0, 0, view.getWidth(), view.getHeight());
        viewGroupB.offsetDescendantRectToMyCoords(view, this.f15738h);
        Rect rect = this.f15738h;
        int i9 = rect.left;
        int i10 = this.f15737g[0];
        this.f15735e = i9 - i10;
        this.f15736f = rect.right - i10;
        f(obj);
    }
}
