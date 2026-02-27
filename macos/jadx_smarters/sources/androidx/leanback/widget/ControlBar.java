package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class ControlBar extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15340a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15342d;

    public ControlBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15341c = -1;
        this.f15342d = true;
    }

    public int a() {
        if (this.f15342d) {
            return getChildCount() / 2;
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i9, int i10) {
        int iA;
        if (i9 != 33 && i9 != 130) {
            super.addFocusables(arrayList, i9, i10);
            return;
        }
        int i11 = this.f15341c;
        if (i11 >= 0 && i11 < getChildCount()) {
            iA = this.f15341c;
        } else if (getChildCount() <= 0) {
            return;
        } else {
            iA = a();
        }
        arrayList.add(getChildAt(iA));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        if (this.f15340a <= 0) {
            return;
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < getChildCount() - 1) {
            View childAt = getChildAt(i11);
            i11++;
            View childAt2 = getChildAt(i11);
            int measuredWidth = this.f15340a - ((childAt.getMeasuredWidth() + childAt2.getMeasuredWidth()) / 2);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
            int marginStart = measuredWidth - layoutParams.getMarginStart();
            layoutParams.setMarginStart(measuredWidth);
            childAt2.setLayoutParams(layoutParams);
            i12 += marginStart;
        }
        setMeasuredDimension(getMeasuredWidth() + i12, getMeasuredHeight());
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i9, Rect rect) {
        if (getChildCount() > 0) {
            int i10 = this.f15341c;
            if (getChildAt((i10 < 0 || i10 >= getChildCount()) ? a() : this.f15341c).requestFocus(i9, rect)) {
                return true;
            }
        }
        return super.onRequestFocusInDescendants(i9, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        this.f15341c = indexOfChild(view);
    }
}
