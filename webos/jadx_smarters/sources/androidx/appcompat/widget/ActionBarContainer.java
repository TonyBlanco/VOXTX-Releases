package androidx.appcompat.widget;

import P.L;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import c.f;
import c.j;
import k.C2107b;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f13876a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f13877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f13878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f13879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f13880f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f13881g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable f13882h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f13883i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f13884j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13885k;

    public static class a {
        public static void a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        L.w0(this, new C2107b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f18046a);
        this.f13880f = typedArrayObtainStyledAttributes.getDrawable(j.f18052b);
        this.f13881g = typedArrayObtainStyledAttributes.getDrawable(j.f18063d);
        this.f13885k = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f18093j, -1);
        boolean z9 = true;
        if (getId() == f.f17842H) {
            this.f13883i = true;
            this.f13882h = typedArrayObtainStyledAttributes.getDrawable(j.f18058c);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f13883i ? this.f13880f != null || this.f13881g != null : this.f13882h != null) {
            z9 = false;
        }
        setWillNotDraw(z9);
    }

    public final int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f13880f;
        if (drawable != null && drawable.isStateful()) {
            this.f13880f.setState(getDrawableState());
        }
        Drawable drawable2 = this.f13881g;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f13881g.setState(getDrawableState());
        }
        Drawable drawable3 = this.f13882h;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f13882h.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f13877c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f13880f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f13881g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f13882h;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f13878d = findViewById(f.f17851a);
        this.f13879e = findViewById(f.f17856f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f13876a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z9, i9, i10, i11, i12);
        View view2 = this.f13877c;
        boolean z10 = true;
        boolean z11 = false;
        boolean z12 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (view2 != null && view2.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view2.getLayoutParams();
            int measuredHeight2 = measuredHeight - view2.getMeasuredHeight();
            int i13 = layoutParams.bottomMargin;
            view2.layout(i9, measuredHeight2 - i13, i11, measuredHeight - i13);
        }
        if (this.f13883i) {
            Drawable drawable3 = this.f13882h;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z10 = false;
            }
        } else {
            if (this.f13880f != null) {
                if (this.f13878d.getVisibility() == 0) {
                    drawable2 = this.f13880f;
                    left = this.f13878d.getLeft();
                    top = this.f13878d.getTop();
                    right = this.f13878d.getRight();
                    view = this.f13878d;
                } else {
                    View view3 = this.f13879e;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f13880f.setBounds(0, 0, 0, 0);
                        z11 = true;
                    } else {
                        drawable2 = this.f13880f;
                        left = this.f13879e.getLeft();
                        top = this.f13879e.getTop();
                        right = this.f13879e.getRight();
                        view = this.f13879e;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z11 = true;
            }
            this.f13884j = z12;
            if (!z12 || (drawable = this.f13881g) == null) {
                z10 = z11;
            } else {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            }
        }
        if (z10) {
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f13878d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L1c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L1c
            int r0 = r3.f13885k
            if (r0 < 0) goto L1c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L1c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f13878d
            if (r4 != 0) goto L24
            return
        L24:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f13877c
            if (r0 == 0) goto L6f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L6f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L6f
            android.view.View r0 = r3.f13878d
            boolean r0 = r3.b(r0)
            if (r0 != 0) goto L47
            android.view.View r0 = r3.f13878d
        L42:
            int r0 = r3.a(r0)
            goto L53
        L47:
            android.view.View r0 = r3.f13879e
            boolean r0 = r3.b(r0)
            if (r0 != 0) goto L52
            android.view.View r0 = r3.f13879e
            goto L42
        L52:
            r0 = 0
        L53:
            if (r4 != r1) goto L5a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L5d
        L5a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L5d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f13877c
            int r1 = r3.a(r1)
            int r0 = r0 + r1
            int r4 = java.lang.Math.min(r0, r4)
            r3.setMeasuredDimension(r5, r4)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f13880f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f13880f);
        }
        this.f13880f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f13878d;
            if (view != null) {
                this.f13880f.setBounds(view.getLeft(), this.f13878d.getTop(), this.f13878d.getRight(), this.f13878d.getBottom());
            }
        }
        boolean z9 = false;
        if (!this.f13883i ? !(this.f13880f != null || this.f13881g != null) : this.f13882h == null) {
            z9 = true;
        }
        setWillNotDraw(z9);
        invalidate();
        a.a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f13882h;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f13882h);
        }
        this.f13882h = drawable;
        boolean z9 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f13883i && (drawable2 = this.f13882h) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f13883i ? !(this.f13880f != null || this.f13881g != null) : this.f13882h == null) {
            z9 = true;
        }
        setWillNotDraw(z9);
        invalidate();
        a.a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f13881g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f13881g);
        }
        this.f13881g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f13884j && (drawable2 = this.f13881g) != null) {
                drawable2.setBounds(this.f13877c.getLeft(), this.f13877c.getTop(), this.f13877c.getRight(), this.f13877c.getBottom());
            }
        }
        boolean z9 = false;
        if (!this.f13883i ? !(this.f13880f != null || this.f13881g != null) : this.f13882h == null) {
            z9 = true;
        }
        setWillNotDraw(z9);
        invalidate();
        a.a(this);
    }

    public void setTabContainer(c cVar) {
        View view = this.f13877c;
        if (view != null) {
            removeView(view);
        }
        this.f13877c = cVar;
    }

    public void setTransitioning(boolean z9) {
        this.f13876a = z9;
        setDescendantFocusability(z9 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
        super.setVisibility(i9);
        boolean z9 = i9 == 0;
        Drawable drawable = this.f13880f;
        if (drawable != null) {
            drawable.setVisible(z9, false);
        }
        Drawable drawable2 = this.f13881g;
        if (drawable2 != null) {
            drawable2.setVisible(z9, false);
        }
        Drawable drawable3 = this.f13882h;
        if (drawable3 != null) {
            drawable3.setVisible(z9, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i9) {
        if (i9 != 0) {
            return super.startActionModeForChild(view, callback, i9);
        }
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f13880f && !this.f13883i) || (drawable == this.f13881g && this.f13884j) || ((drawable == this.f13882h && this.f13883i) || super.verifyDrawable(drawable));
    }
}
