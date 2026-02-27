package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class P extends FrameLayout {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Rect f15415l = new Rect();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15416a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f15417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f15418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f15421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f15422h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15423i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Paint f15424j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15425k;

    public P(Context context, int i9, boolean z9, float f9, float f10, int i10) {
        super(context);
        this.f15420f = 1;
        this.f15421g = f9;
        this.f15422h = f10;
        a(i9, z9, i10);
    }

    public static boolean b() {
        return N.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r4, boolean r5, int r6) {
        /*
            r3 = this;
            boolean r0 = r3.f15416a
            if (r0 != 0) goto L4c
            r0 = 1
            r3.f15416a = r0
            r3.f15423i = r6
            r1 = 0
            if (r6 <= 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            r3.f15419e = r2
            r3.f15420f = r4
            r2 = 2
            if (r4 == r2) goto L25
            r2 = 3
            if (r4 == r2) goto L1a
            goto L2a
        L1a:
            float r4 = r3.f15421g
            float r2 = r3.f15422h
            java.lang.Object r4 = androidx.leanback.widget.N.a(r3, r4, r2, r6)
        L22:
            r3.f15417c = r4
            goto L2a
        L25:
            java.lang.Object r4 = androidx.leanback.widget.X.a(r3)
            goto L22
        L2a:
            if (r5 == 0) goto L45
            r3.setWillNotDraw(r1)
            r3.f15425k = r1
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r3.f15424j = r4
            int r5 = r3.f15425k
            r4.setColor(r5)
            android.graphics.Paint r4 = r3.f15424j
            android.graphics.Paint$Style r5 = android.graphics.Paint.Style.FILL
            r4.setStyle(r5)
            goto L4b
        L45:
            r3.setWillNotDraw(r0)
            r4 = 0
            r3.f15424j = r4
        L4b:
            return
        L4c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.P.a(int, boolean, int):void");
    }

    public void c(View view) {
        if (!this.f15416a || this.f15418d != null) {
            throw new IllegalStateException();
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams.width, layoutParams.height);
            layoutParams.width = layoutParams.width == -1 ? -1 : -2;
            layoutParams.height = layoutParams.height == -1 ? -1 : -2;
            setLayoutParams(layoutParams);
            addView(view, layoutParams2);
        } else {
            addView(view);
        }
        if (this.f15419e && this.f15420f != 3) {
            H.a(this, true);
        }
        this.f15418d = view;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f15424j == null || this.f15425k == 0) {
            return;
        }
        canvas.drawRect(this.f15418d.getLeft(), this.f15418d.getTop(), this.f15418d.getRight(), this.f15418d.getBottom(), this.f15424j);
    }

    public int getShadowType() {
        return this.f15420f;
    }

    public View getWrappedView() {
        return this.f15418d;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        View view;
        super.onLayout(z9, i9, i10, i11, i12);
        if (!z9 || (view = this.f15418d) == null) {
            return;
        }
        Rect rect = f15415l;
        rect.left = (int) view.getPivotX();
        rect.top = (int) this.f15418d.getPivotY();
        offsetDescendantRectToMyCoords(this.f15418d, rect);
        setPivotX(rect.left);
        setPivotY(rect.top);
    }

    public void setOverlayColor(int i9) {
        Paint paint = this.f15424j;
        if (paint == null || i9 == this.f15425k) {
            return;
        }
        this.f15425k = i9;
        paint.setColor(i9);
        invalidate();
    }

    public void setShadowFocusLevel(float f9) {
        Object obj = this.f15417c;
        if (obj != null) {
            Q.k(obj, this.f15420f, f9);
        }
    }
}
