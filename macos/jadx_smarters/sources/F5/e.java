package f5;

import P.AbstractC0976s;
import P.L;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40779a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f40780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f40781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f40782e;

    public e(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f40781d = false;
        d(context, attributeSet);
    }

    public static int a(int i9, int i10, int i11) {
        return i10 != Integer.MIN_VALUE ? i10 != 1073741824 ? i11 : i9 : Math.min(i11, i9);
    }

    public int b(View view) {
        Object tag = view.getTag(R4.f.f8766F);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    public boolean c() {
        return this.f40781d;
    }

    public final void d(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R4.l.f9136g2, 0, 0);
        this.f40779a = typedArrayObtainStyledAttributes.getDimensionPixelSize(R4.l.f9154i2, 0);
        this.f40780c = typedArrayObtainStyledAttributes.getDimensionPixelSize(R4.l.f9145h2, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public int getItemSpacing() {
        return this.f40780c;
    }

    public int getLineSpacing() {
        return this.f40779a;
    }

    public int getRowCount() {
        return this.f40782e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        int iA;
        int iB;
        if (getChildCount() == 0) {
            this.f40782e = 0;
            return;
        }
        this.f40782e = 1;
        boolean z10 = L.E(this) == 1;
        int paddingRight = z10 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z10 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i13 = (i11 - i9) - paddingLeft;
        int measuredWidth = paddingRight;
        int i14 = paddingTop;
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R4.f.f8766F, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    iB = AbstractC0976s.b(marginLayoutParams);
                    iA = AbstractC0976s.a(marginLayoutParams);
                } else {
                    iA = 0;
                    iB = 0;
                }
                int measuredWidth2 = measuredWidth + iB + childAt.getMeasuredWidth();
                if (!this.f40781d && measuredWidth2 > i13) {
                    i14 = this.f40779a + paddingTop;
                    this.f40782e++;
                    measuredWidth = paddingRight;
                }
                childAt.setTag(R4.f.f8766F, Integer.valueOf(this.f40782e - 1));
                int i16 = measuredWidth + iB;
                int measuredWidth3 = childAt.getMeasuredWidth() + i16;
                int measuredHeight = childAt.getMeasuredHeight() + i14;
                if (z10) {
                    i16 = i13 - measuredWidth3;
                    measuredWidth3 = (i13 - measuredWidth) - iB;
                }
                childAt.layout(i16, i14, measuredWidth3, measuredHeight);
                measuredWidth += iB + iA + childAt.getMeasuredWidth() + this.f40780c;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        int paddingLeft;
        int size = View.MeasureSpec.getSize(i9);
        int mode = View.MeasureSpec.getMode(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i10);
        int i13 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : a.e.API_PRIORITY_OTHER;
        int paddingLeft2 = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i13 - getPaddingRight();
        int i14 = paddingTop;
        int i15 = 0;
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i9, i10);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i11 = marginLayoutParams.leftMargin;
                    i12 = marginLayoutParams.rightMargin;
                } else {
                    i11 = 0;
                    i12 = 0;
                }
                int i17 = paddingLeft2;
                if (paddingLeft2 + i11 + childAt.getMeasuredWidth() <= paddingRight || c()) {
                    paddingLeft = i17;
                } else {
                    paddingLeft = getPaddingLeft();
                    i14 = this.f40779a + paddingTop;
                }
                int measuredWidth = paddingLeft + i11 + childAt.getMeasuredWidth();
                int measuredHeight = i14 + childAt.getMeasuredHeight();
                if (measuredWidth > i15) {
                    i15 = measuredWidth;
                }
                paddingLeft2 = paddingLeft + i11 + i12 + childAt.getMeasuredWidth() + this.f40780c;
                if (i16 == getChildCount() - 1) {
                    i15 += i12;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(a(size, mode, i15 + getPaddingRight()), a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    public void setItemSpacing(int i9) {
        this.f40780c = i9;
    }

    public void setLineSpacing(int i9) {
        this.f40779a = i9;
    }

    public void setSingleLine(boolean z9) {
        this.f40781d = z9;
    }
}
