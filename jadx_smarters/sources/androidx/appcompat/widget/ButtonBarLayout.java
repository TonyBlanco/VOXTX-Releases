package androidx.appcompat.widget;

import P.L;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import c.f;
import c.j;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f13975a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13977d;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13977d = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f17982N0);
        L.q0(this, context, j.f17982N0, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        this.f13975a = typedArrayObtainStyledAttributes.getBoolean(j.f17987O0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f13975a);
        }
    }

    private void setStacked(boolean z9) {
        if (this.f13976c != z9) {
            if (!z9 || this.f13975a) {
                this.f13976c = z9;
                setOrientation(z9 ? 1 : 0);
                setGravity(z9 ? 8388613 : 80);
                View viewFindViewById = findViewById(f.f17841G);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z9 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    public final int a(int i9) {
        int childCount = getChildCount();
        while (i9 < childCount) {
            if (getChildAt(i9).getVisibility() == 0) {
                return i9;
            }
            i9++;
        }
        return -1;
    }

    public final boolean b() {
        return this.f13976c;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        int iMakeMeasureSpec;
        boolean z9;
        int size = View.MeasureSpec.getSize(i9);
        int paddingBottom = 0;
        if (this.f13975a) {
            if (size > this.f13977d && b()) {
                setStacked(false);
            }
            this.f13977d = size;
        }
        if (b() || View.MeasureSpec.getMode(i9) != 1073741824) {
            iMakeMeasureSpec = i9;
            z9 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z9 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i10);
        if (this.f13975a && !b() && (getMeasuredWidthAndState() & DefaultRenderer.BACKGROUND_COLOR) == 16777216) {
            setStacked(true);
            z9 = true;
        }
        if (z9) {
            super.onMeasure(i9, i10);
        }
        int iA = a(0);
        if (iA >= 0) {
            View childAt = getChildAt(iA);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (b()) {
                int iA2 = a(iA + 1);
                if (iA2 >= 0) {
                    paddingTop += getChildAt(iA2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                paddingBottom = paddingTop;
            } else {
                paddingBottom = paddingTop + getPaddingBottom();
            }
        }
        if (L.F(this) != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i10 == 0) {
                super.onMeasure(i9, i10);
            }
        }
    }

    public void setAllowStacking(boolean z9) {
        if (this.f13975a != z9) {
            this.f13975a = z9;
            if (!z9 && b()) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
