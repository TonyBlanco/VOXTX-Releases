package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import g0.AbstractC1798c;

/* JADX INFO: loaded from: classes.dex */
public class ThumbsBar extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15586a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15590f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15591g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SparseArray f15592h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15593i;

    public ThumbsBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ThumbsBar(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f15586a = -1;
        this.f15592h = new SparseArray();
        this.f15593i = false;
        this.f15587c = context.getResources().getDimensionPixelSize(AbstractC1798c.f40991s);
        this.f15588d = context.getResources().getDimensionPixelSize(AbstractC1798c.f40989q);
        this.f15590f = context.getResources().getDimensionPixelSize(AbstractC1798c.f40985m);
        this.f15589e = context.getResources().getDimensionPixelSize(AbstractC1798c.f40984l);
        this.f15591g = context.getResources().getDimensionPixelSize(AbstractC1798c.f40990r);
    }

    public static int c(int i9, int i10) {
        return ((i9 + i10) - 1) / i10;
    }

    public final int a(int i9) {
        int iC = c(i9 - this.f15589e, this.f15587c + this.f15591g);
        if (iC < 2) {
            iC = 2;
        } else if ((iC & 1) != 0) {
            iC++;
        }
        return iC + 1;
    }

    public View b(ViewGroup viewGroup) {
        return new ImageView(viewGroup.getContext());
    }

    public final void d() {
        int i9;
        while (getChildCount() > this.f15586a) {
            removeView(getChildAt(getChildCount() - 1));
        }
        while (getChildCount() < this.f15586a) {
            addView(b(this), new LinearLayout.LayoutParams(this.f15587c, this.f15588d));
        }
        int heroIndex = getHeroIndex();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (heroIndex == i10) {
                layoutParams.width = this.f15589e;
                i9 = this.f15590f;
            } else {
                layoutParams.width = this.f15587c;
                i9 = this.f15588d;
            }
            layoutParams.height = i9;
            childAt.setLayoutParams(layoutParams);
        }
    }

    public int getHeroIndex() {
        return getChildCount() / 2;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        super.onLayout(z9, i9, i10, i11, i12);
        int heroIndex = getHeroIndex();
        View childAt = getChildAt(heroIndex);
        int width = (getWidth() / 2) - (childAt.getMeasuredWidth() / 2);
        int width2 = (getWidth() / 2) + (childAt.getMeasuredWidth() / 2);
        childAt.layout(width, getPaddingTop(), width2, getPaddingTop() + childAt.getMeasuredHeight());
        int paddingTop = getPaddingTop() + (childAt.getMeasuredHeight() / 2);
        for (int i13 = heroIndex - 1; i13 >= 0; i13--) {
            int i14 = width - this.f15591g;
            View childAt2 = getChildAt(i13);
            childAt2.layout(i14 - childAt2.getMeasuredWidth(), paddingTop - (childAt2.getMeasuredHeight() / 2), i14, (childAt2.getMeasuredHeight() / 2) + paddingTop);
            width = i14 - childAt2.getMeasuredWidth();
        }
        while (true) {
            heroIndex++;
            if (heroIndex >= this.f15586a) {
                return;
            }
            int i15 = width2 + this.f15591g;
            View childAt3 = getChildAt(heroIndex);
            childAt3.layout(i15, paddingTop - (childAt3.getMeasuredHeight() / 2), childAt3.getMeasuredWidth() + i15, (childAt3.getMeasuredHeight() / 2) + paddingTop);
            width2 = i15 + childAt3.getMeasuredWidth();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        int iA;
        super.onMeasure(i9, i10);
        int measuredWidth = getMeasuredWidth();
        if (this.f15593i || this.f15586a == (iA = a(measuredWidth))) {
            return;
        }
        this.f15586a = iA;
        d();
    }

    public void setNumberOfThumbs(int i9) {
        this.f15593i = true;
        this.f15586a = i9;
        d();
    }

    public void setThumbSpace(int i9) {
        this.f15591g = i9;
        requestLayout();
    }
}
