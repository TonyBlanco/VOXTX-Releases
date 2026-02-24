package com.google.android.exoplayer2.ui;

import a4.AbstractC1110y;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.exoplayer2.ui.f;
import d4.AbstractC1684a;
import d4.k0;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import okio.Segment;

/* JADX INFO: loaded from: classes3.dex */
public class b extends View implements f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final float f25947A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f25948B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f25949C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f25950D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Rect f25951E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public ValueAnimator f25952F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public float f25953G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f25954H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f25955I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public long f25956J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public long f25957K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public long f25958L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public long f25959M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f25960N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public long[] f25961O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean[] f25962P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f25963a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f25964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f25965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f25966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f25967f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f25968g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f25969h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Paint f25970i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Paint f25971j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Paint f25972k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Drawable f25973l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f25974m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f25975n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f25976o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f25977p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f25978q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f25979r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f25980s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f25981t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f25982u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final StringBuilder f25983v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Formatter f25984w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Runnable f25985x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final CopyOnWriteArraySet f25986y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Point f25987z;

    public b(Context context, AttributeSet attributeSet, int i9, AttributeSet attributeSet2) {
        this(context, attributeSet, i9, attributeSet2, 0);
    }

    public b(Context context, AttributeSet attributeSet, int i9, AttributeSet attributeSet2, int i10) {
        int i11;
        int iMax;
        super(context, attributeSet, i9);
        this.f25963a = new Rect();
        this.f25964c = new Rect();
        this.f25965d = new Rect();
        this.f25966e = new Rect();
        Paint paint = new Paint();
        this.f25967f = paint;
        Paint paint2 = new Paint();
        this.f25968g = paint2;
        Paint paint3 = new Paint();
        this.f25969h = paint3;
        Paint paint4 = new Paint();
        this.f25970i = paint4;
        Paint paint5 = new Paint();
        this.f25971j = paint5;
        Paint paint6 = new Paint();
        this.f25972k = paint6;
        paint6.setAntiAlias(true);
        this.f25986y = new CopyOnWriteArraySet();
        this.f25987z = new Point();
        float f9 = context.getResources().getDisplayMetrics().density;
        this.f25947A = f9;
        this.f25982u = e(f9, -50);
        int iE = e(f9, 4);
        int iE2 = e(f9, 26);
        int iE3 = e(f9, 4);
        int iE4 = e(f9, 12);
        int iE5 = e(f9, 0);
        int iE6 = e(f9, 16);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, AbstractC1110y.f11776c, i9, i10);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(AbstractC1110y.f11798n);
                this.f25973l = drawable;
                if (drawable != null) {
                    q(drawable);
                    iE2 = Math.max(drawable.getMinimumHeight(), iE2);
                }
                this.f25974m = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC1110y.f11784g, iE);
                this.f25975n = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC1110y.f11802p, iE2);
                this.f25976o = typedArrayObtainStyledAttributes.getInt(AbstractC1110y.f11782f, 0);
                this.f25977p = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC1110y.f11780e, iE3);
                this.f25978q = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC1110y.f11800o, iE4);
                this.f25979r = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC1110y.f11794l, iE5);
                this.f25980s = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC1110y.f11796m, iE6);
                int i12 = typedArrayObtainStyledAttributes.getInt(AbstractC1110y.f11790j, -1);
                int i13 = typedArrayObtainStyledAttributes.getInt(AbstractC1110y.f11792k, -1);
                int i14 = typedArrayObtainStyledAttributes.getInt(AbstractC1110y.f11786h, -855638017);
                int i15 = typedArrayObtainStyledAttributes.getInt(AbstractC1110y.f11804q, 872415231);
                int i16 = typedArrayObtainStyledAttributes.getInt(AbstractC1110y.f11778d, -1291845888);
                int i17 = typedArrayObtainStyledAttributes.getInt(AbstractC1110y.f11788i, 872414976);
                paint.setColor(i12);
                paint6.setColor(i13);
                paint2.setColor(i14);
                paint3.setColor(i15);
                paint4.setColor(i16);
                paint5.setColor(i17);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            this.f25974m = iE;
            this.f25975n = iE2;
            this.f25976o = 0;
            this.f25977p = iE3;
            this.f25978q = iE4;
            this.f25979r = iE5;
            this.f25980s = iE6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f25973l = null;
        }
        StringBuilder sb = new StringBuilder();
        this.f25983v = sb;
        this.f25984w = new Formatter(sb, Locale.getDefault());
        this.f25985x = new Runnable() { // from class: a4.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f11619a.k();
            }
        };
        Drawable drawable2 = this.f25973l;
        if (drawable2 != null) {
            iMax = drawable2.getMinimumWidth();
            i11 = 1;
        } else {
            i11 = 1;
            iMax = Math.max(this.f25979r, Math.max(this.f25978q, this.f25980s));
        }
        this.f25981t = (iMax + i11) / 2;
        this.f25953G = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f25952F = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: a4.g
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f11620a.l(valueAnimator2);
            }
        });
        this.f25957K = -9223372036854775807L;
        this.f25949C = -9223372036854775807L;
        this.f25948B = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static int e(float f9, int i9) {
        return (int) ((i9 * f9) + 0.5f);
    }

    private long getPositionIncrement() {
        long j9 = this.f25949C;
        if (j9 != -9223372036854775807L) {
            return j9;
        }
        long j10 = this.f25957K;
        if (j10 == -9223372036854775807L) {
            return 0L;
        }
        return j10 / ((long) this.f25948B);
    }

    private String getProgressText() {
        return k0.m0(this.f25983v, this.f25984w, this.f25958L);
    }

    private long getScrubberPosition() {
        if (this.f25964c.width() <= 0 || this.f25957K == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.f25966e.width()) * this.f25957K) / ((long) this.f25964c.width());
    }

    public static int n(float f9, int i9) {
        return (int) (i9 / f9);
    }

    public static boolean r(Drawable drawable, int i9) {
        return k0.f39777a >= 23 && drawable.setLayoutDirection(i9);
    }

    @Override // com.google.android.exoplayer2.ui.f
    public void a(f.a aVar) {
        AbstractC1684a.e(aVar);
        this.f25986y.add(aVar);
    }

    @Override // com.google.android.exoplayer2.ui.f
    public void b(long[] jArr, boolean[] zArr, int i9) {
        AbstractC1684a.a(i9 == 0 || !(jArr == null || zArr == null));
        this.f25960N = i9;
        this.f25961O = jArr;
        this.f25962P = zArr;
        x();
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        y();
    }

    public final void f(Canvas canvas) {
        if (this.f25957K <= 0) {
            return;
        }
        Rect rect = this.f25966e;
        int iR = k0.r(rect.right, rect.left, this.f25964c.right);
        int iCenterY = this.f25966e.centerY();
        if (this.f25973l == null) {
            canvas.drawCircle(iR, iCenterY, (int) ((((this.f25955I || isFocused()) ? this.f25980s : isEnabled() ? this.f25978q : this.f25979r) * this.f25953G) / 2.0f), this.f25972k);
            return;
        }
        int intrinsicWidth = ((int) (r2.getIntrinsicWidth() * this.f25953G)) / 2;
        int intrinsicHeight = ((int) (this.f25973l.getIntrinsicHeight() * this.f25953G)) / 2;
        this.f25973l.setBounds(iR - intrinsicWidth, iCenterY - intrinsicHeight, iR + intrinsicWidth, iCenterY + intrinsicHeight);
        this.f25973l.draw(canvas);
    }

    public final void g(Canvas canvas) {
        int iHeight = this.f25964c.height();
        int iCenterY = this.f25964c.centerY() - (iHeight / 2);
        int i9 = iHeight + iCenterY;
        if (this.f25957K <= 0) {
            Rect rect = this.f25964c;
            canvas.drawRect(rect.left, iCenterY, rect.right, i9, this.f25969h);
            return;
        }
        Rect rect2 = this.f25965d;
        int i10 = rect2.left;
        int i11 = rect2.right;
        int iMax = Math.max(Math.max(this.f25964c.left, i11), this.f25966e.right);
        int i12 = this.f25964c.right;
        if (iMax < i12) {
            canvas.drawRect(iMax, iCenterY, i12, i9, this.f25969h);
        }
        int iMax2 = Math.max(i10, this.f25966e.right);
        if (i11 > iMax2) {
            canvas.drawRect(iMax2, iCenterY, i11, i9, this.f25968g);
        }
        if (this.f25966e.width() > 0) {
            Rect rect3 = this.f25966e;
            canvas.drawRect(rect3.left, iCenterY, rect3.right, i9, this.f25967f);
        }
        if (this.f25960N == 0) {
            return;
        }
        long[] jArr = (long[]) AbstractC1684a.e(this.f25961O);
        boolean[] zArr = (boolean[]) AbstractC1684a.e(this.f25962P);
        int i13 = this.f25977p / 2;
        for (int i14 = 0; i14 < this.f25960N; i14++) {
            int iWidth = ((int) ((((long) this.f25964c.width()) * k0.s(jArr[i14], 0L, this.f25957K)) / this.f25957K)) - i13;
            Rect rect4 = this.f25964c;
            canvas.drawRect(rect4.left + Math.min(rect4.width() - this.f25977p, Math.max(0, iWidth)), iCenterY, r10 + this.f25977p, i9, zArr[i14] ? this.f25971j : this.f25970i);
        }
    }

    @Override // com.google.android.exoplayer2.ui.f
    public long getPreferredUpdateDelay() {
        int iN = n(this.f25947A, this.f25964c.width());
        if (iN != 0) {
            long j9 = this.f25957K;
            if (j9 != 0 && j9 != -9223372036854775807L) {
                return j9 / ((long) iN);
            }
        }
        return Long.MAX_VALUE;
    }

    public void h(long j9) {
        if (this.f25952F.isStarted()) {
            this.f25952F.cancel();
        }
        this.f25952F.setFloatValues(this.f25953G, 0.0f);
        this.f25952F.setDuration(j9);
        this.f25952F.start();
    }

    public void i(boolean z9) {
        if (this.f25952F.isStarted()) {
            this.f25952F.cancel();
        }
        this.f25954H = z9;
        this.f25953G = 0.0f;
        invalidate(this.f25963a);
    }

    public final boolean j(float f9, float f10) {
        return this.f25963a.contains((int) f9, (int) f10);
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f25973l;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final /* synthetic */ void k() {
        w(false);
    }

    public final /* synthetic */ void l(ValueAnimator valueAnimator) {
        this.f25953G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate(this.f25963a);
    }

    public final void m(float f9) {
        Rect rect = this.f25966e;
        Rect rect2 = this.f25964c;
        rect.right = k0.r((int) f9, rect2.left, rect2.right);
    }

    public final Point o(MotionEvent motionEvent) {
        this.f25987z.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.f25987z;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        g(canvas);
        f(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z9, int i9, Rect rect) {
        super.onFocusChanged(z9, i9, rect);
        if (!this.f25955I || z9) {
            return;
        }
        w(false);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f25957K <= 0) {
            return;
        }
        if (k0.f39777a >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(Segment.SIZE);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L30
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L27
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L27;
                default: goto L12;
            }
        L12:
            goto L30
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.p(r0)
            if (r0 == 0) goto L30
            java.lang.Runnable r5 = r4.f25985x
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.f25985x
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L27:
            boolean r0 = r4.f25955I
            if (r0 == 0) goto L30
            r5 = 0
            r4.w(r5)
            return r3
        L30:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.b.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        int paddingBottom;
        int iMax;
        int i13 = i11 - i9;
        int i14 = i12 - i10;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i13 - getPaddingRight();
        int i15 = this.f25954H ? 0 : this.f25981t;
        if (this.f25976o == 1) {
            paddingBottom = (i14 - getPaddingBottom()) - this.f25975n;
            int paddingBottom2 = i14 - getPaddingBottom();
            int i16 = this.f25974m;
            iMax = (paddingBottom2 - i16) - Math.max(i15 - (i16 / 2), 0);
        } else {
            paddingBottom = (i14 - this.f25975n) / 2;
            iMax = (i14 - this.f25974m) / 2;
        }
        this.f25963a.set(paddingLeft, paddingBottom, paddingRight, this.f25975n + paddingBottom);
        Rect rect = this.f25964c;
        Rect rect2 = this.f25963a;
        rect.set(rect2.left + i15, iMax, rect2.right - i15, this.f25974m + iMax);
        if (k0.f39777a >= 29) {
            s(i13, i14);
        }
        x();
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == 0) {
            size = this.f25975n;
        } else if (mode != 1073741824) {
            size = Math.min(this.f25975n, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i9), size);
        y();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i9) {
        Drawable drawable = this.f25973l;
        if (drawable == null || !r(drawable, i9)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L6e
            long r2 = r7.f25957K
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L10
            goto L6e
        L10:
            android.graphics.Point r0 = r7.o(r8)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L5b
            r5 = 3
            if (r3 == r4) goto L4c
            r6 = 2
            if (r3 == r6) goto L28
            if (r3 == r5) goto L4c
            goto L6e
        L28:
            boolean r8 = r7.f25955I
            if (r8 == 0) goto L6e
            int r8 = r7.f25982u
            if (r0 >= r8) goto L3a
            int r8 = r7.f25950D
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r8 = r8 + r2
            float r8 = (float) r8
        L36:
            r7.m(r8)
            goto L3e
        L3a:
            r7.f25950D = r2
            float r8 = (float) r2
            goto L36
        L3e:
            long r0 = r7.getScrubberPosition()
            r7.z(r0)
        L45:
            r7.x()
            r7.invalidate()
            return r4
        L4c:
            boolean r0 = r7.f25955I
            if (r0 == 0) goto L6e
            int r8 = r8.getAction()
            if (r8 != r5) goto L57
            r1 = 1
        L57:
            r7.w(r1)
            return r4
        L5b:
            float r8 = (float) r2
            float r0 = (float) r0
            boolean r0 = r7.j(r8, r0)
            if (r0 == 0) goto L6e
            r7.m(r8)
            long r0 = r7.getScrubberPosition()
            r7.v(r0)
            goto L45
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.b.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean p(long j9) {
        long j10 = this.f25957K;
        if (j10 <= 0) {
            return false;
        }
        long j11 = this.f25955I ? this.f25956J : this.f25958L;
        long jS = k0.s(j11 + j9, 0L, j10);
        if (jS == j11) {
            return false;
        }
        if (this.f25955I) {
            z(jS);
        } else {
            v(jS);
        }
        x();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean performAccessibilityAction(int r7, android.os.Bundle r8) {
        /*
            r6 = this;
            boolean r8 = super.performAccessibilityAction(r7, r8)
            r0 = 1
            if (r8 == 0) goto L8
            return r0
        L8:
            long r1 = r6.f25957K
            r3 = 0
            r8 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L12
            return r8
        L12:
            r1 = 8192(0x2000, float:1.148E-41)
            if (r7 != r1) goto L25
            long r1 = r6.getPositionIncrement()
            long r1 = -r1
            boolean r7 = r6.p(r1)
            if (r7 == 0) goto L34
        L21:
            r6.w(r8)
            goto L34
        L25:
            r1 = 4096(0x1000, float:5.74E-42)
            if (r7 != r1) goto L39
            long r1 = r6.getPositionIncrement()
            boolean r7 = r6.p(r1)
            if (r7 == 0) goto L34
            goto L21
        L34:
            r7 = 4
            r6.sendAccessibilityEvent(r7)
            return r0
        L39:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.b.performAccessibilityAction(int, android.os.Bundle):boolean");
    }

    public final boolean q(Drawable drawable) {
        return k0.f39777a >= 23 && r(drawable, getLayoutDirection());
    }

    public final void s(int i9, int i10) {
        Rect rect = this.f25951E;
        if (rect != null && rect.width() == i9 && this.f25951E.height() == i10) {
            return;
        }
        Rect rect2 = new Rect(0, 0, i9, i10);
        this.f25951E = rect2;
        setSystemGestureExclusionRects(Collections.singletonList(rect2));
    }

    public void setAdMarkerColor(int i9) {
        this.f25970i.setColor(i9);
        invalidate(this.f25963a);
    }

    public void setBufferedColor(int i9) {
        this.f25968g.setColor(i9);
        invalidate(this.f25963a);
    }

    @Override // com.google.android.exoplayer2.ui.f
    public void setBufferedPosition(long j9) {
        if (this.f25959M == j9) {
            return;
        }
        this.f25959M = j9;
        x();
    }

    @Override // com.google.android.exoplayer2.ui.f
    public void setDuration(long j9) {
        if (this.f25957K == j9) {
            return;
        }
        this.f25957K = j9;
        if (this.f25955I && j9 == -9223372036854775807L) {
            w(true);
        }
        x();
    }

    @Override // android.view.View, com.google.android.exoplayer2.ui.f
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        if (!this.f25955I || z9) {
            return;
        }
        w(true);
    }

    public void setKeyCountIncrement(int i9) {
        AbstractC1684a.a(i9 > 0);
        this.f25948B = i9;
        this.f25949C = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j9) {
        AbstractC1684a.a(j9 > 0);
        this.f25948B = -1;
        this.f25949C = j9;
    }

    public void setPlayedAdMarkerColor(int i9) {
        this.f25971j.setColor(i9);
        invalidate(this.f25963a);
    }

    public void setPlayedColor(int i9) {
        this.f25967f.setColor(i9);
        invalidate(this.f25963a);
    }

    @Override // com.google.android.exoplayer2.ui.f
    public void setPosition(long j9) {
        if (this.f25958L == j9) {
            return;
        }
        this.f25958L = j9;
        setContentDescription(getProgressText());
        x();
    }

    public void setScrubberColor(int i9) {
        this.f25972k.setColor(i9);
        invalidate(this.f25963a);
    }

    public void setUnplayedColor(int i9) {
        this.f25969h.setColor(i9);
        invalidate(this.f25963a);
    }

    public void t() {
        if (this.f25952F.isStarted()) {
            this.f25952F.cancel();
        }
        this.f25954H = false;
        this.f25953G = 1.0f;
        invalidate(this.f25963a);
    }

    public void u(long j9) {
        if (this.f25952F.isStarted()) {
            this.f25952F.cancel();
        }
        this.f25954H = false;
        this.f25952F.setFloatValues(this.f25953G, 1.0f);
        this.f25952F.setDuration(j9);
        this.f25952F.start();
    }

    public final void v(long j9) {
        this.f25956J = j9;
        this.f25955I = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.f25986y.iterator();
        while (it.hasNext()) {
            ((f.a) it.next()).D(this, j9);
        }
    }

    public final void w(boolean z9) {
        removeCallbacks(this.f25985x);
        this.f25955I = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.f25986y.iterator();
        while (it.hasNext()) {
            ((f.a) it.next()).C(this, this.f25956J, z9);
        }
    }

    public final void x() {
        this.f25965d.set(this.f25964c);
        this.f25966e.set(this.f25964c);
        long j9 = this.f25955I ? this.f25956J : this.f25958L;
        if (this.f25957K > 0) {
            int iWidth = (int) ((((long) this.f25964c.width()) * this.f25959M) / this.f25957K);
            Rect rect = this.f25965d;
            Rect rect2 = this.f25964c;
            rect.right = Math.min(rect2.left + iWidth, rect2.right);
            int iWidth2 = (int) ((((long) this.f25964c.width()) * j9) / this.f25957K);
            Rect rect3 = this.f25966e;
            Rect rect4 = this.f25964c;
            rect3.right = Math.min(rect4.left + iWidth2, rect4.right);
        } else {
            Rect rect5 = this.f25965d;
            int i9 = this.f25964c.left;
            rect5.right = i9;
            this.f25966e.right = i9;
        }
        invalidate(this.f25963a);
    }

    public final void y() {
        Drawable drawable = this.f25973l;
        if (drawable != null && drawable.isStateful() && this.f25973l.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void z(long j9) {
        if (this.f25956J == j9) {
            return;
        }
        this.f25956J = j9;
        Iterator it = this.f25986y.iterator();
        while (it.hasNext()) {
            ((f.a) it.next()).o(this, j9);
        }
    }
}
