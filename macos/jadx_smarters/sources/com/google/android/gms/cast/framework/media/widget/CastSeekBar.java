package com.google.android.gms.cast.framework.media.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.common.internal.AbstractC1418q;
import java.util.ArrayList;
import java.util.List;
import o4.AbstractC2336m;
import o4.AbstractC2338o;
import o4.AbstractC2343u;
import o4.AbstractC2344v;
import s4.AbstractC2713e;
import s4.C2712d;
import s4.C2714f;
import s4.C2716h;

/* JADX INFO: loaded from: classes3.dex */
public class CastSeekBar extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C2714f f26369a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f26370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f26371d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C2712d f26372e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f26373f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AbstractC2713e f26374g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f26375h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f26376i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f26377j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f26378k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f26379l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Paint f26380m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f26381n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f26382o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f26383p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f26384q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int[] f26385r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Point f26386s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Runnable f26387t;

    public CastSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CastSeekBar(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f26373f = new ArrayList();
        setAccessibilityDelegate(new C2716h(this, null));
        Paint paint = new Paint(1);
        this.f26380m = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f26375h = context.getResources().getDimension(AbstractC2338o.f45906m);
        this.f26376i = context.getResources().getDimension(AbstractC2338o.f45905l);
        this.f26377j = context.getResources().getDimension(AbstractC2338o.f45907n) / 2.0f;
        this.f26378k = context.getResources().getDimension(AbstractC2338o.f45908o) / 2.0f;
        this.f26379l = context.getResources().getDimension(AbstractC2338o.f45904k);
        C2714f c2714f = new C2714f();
        this.f26369a = c2714f;
        c2714f.f49949b = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC2344v.f46049b, AbstractC2336m.f45890a, AbstractC2343u.f46025a);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(AbstractC2344v.f46068u, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(AbstractC2344v.f46069v, 0);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(AbstractC2344v.f46071x, 0);
        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(AbstractC2344v.f46050c, 0);
        this.f26381n = context.getResources().getColor(resourceId);
        this.f26382o = context.getResources().getColor(resourceId2);
        this.f26383p = context.getResources().getColor(resourceId3);
        this.f26384q = context.getResources().getColor(resourceId4);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void d(List list) {
        if (AbstractC1418q.b(this.f26373f, list)) {
            return;
        }
        this.f26373f = list == null ? null : new ArrayList(list);
        postInvalidate();
    }

    public final void e(C2714f c2714f) {
        if (this.f26370c) {
            return;
        }
        C2714f c2714f2 = new C2714f();
        c2714f2.f49948a = c2714f.f49948a;
        c2714f2.f49949b = c2714f.f49949b;
        c2714f2.f49950c = c2714f.f49950c;
        c2714f2.f49951d = c2714f.f49951d;
        c2714f2.f49952e = c2714f.f49952e;
        c2714f2.f49953f = c2714f.f49953f;
        this.f26369a = c2714f2;
        this.f26371d = null;
        AbstractC2713e abstractC2713e = this.f26374g;
        if (abstractC2713e != null) {
            abstractC2713e.a(this, getProgress(), false);
        }
        postInvalidate();
    }

    public final int f(int i9) {
        return (int) ((((double) i9) / ((double) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))) * ((double) this.f26369a.f49949b));
    }

    public final void g(Canvas canvas, int i9, int i10, int i11, int i12, int i13) {
        this.f26380m.setColor(i13);
        float f9 = this.f26377j;
        float f10 = i11;
        float f11 = i10 / f10;
        float f12 = i9 / f10;
        float f13 = i12;
        canvas.drawRect(f12 * f13, -f9, f11 * f13, f9, this.f26380m);
    }

    public int getMaxProgress() {
        return this.f26369a.f49949b;
    }

    public int getProgress() {
        Integer num = this.f26371d;
        return num != null ? num.intValue() : this.f26369a.f49948a;
    }

    public final void h(int i9) {
        C2714f c2714f = this.f26369a;
        if (c2714f.f49953f) {
            int i10 = c2714f.f49951d;
            this.f26371d = Integer.valueOf(Math.min(Math.max(i9, i10), c2714f.f49952e));
            AbstractC2713e abstractC2713e = this.f26374g;
            if (abstractC2713e != null) {
                abstractC2713e.a(this, getProgress(), true);
            }
            Runnable runnable = this.f26387t;
            if (runnable == null) {
                this.f26387t = new Runnable() { // from class: s4.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49942a.sendAccessibilityEvent(4);
                    }
                };
            } else {
                removeCallbacks(runnable);
            }
            postDelayed(this.f26387t, 200L);
            postInvalidate();
        }
    }

    public final void i() {
        this.f26370c = true;
        AbstractC2713e abstractC2713e = this.f26374g;
        if (abstractC2713e != null) {
            abstractC2713e.b(this);
        }
    }

    public final void j() {
        this.f26370c = false;
        AbstractC2713e abstractC2713e = this.f26374g;
        if (abstractC2713e != null) {
            abstractC2713e.c(this);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        Runnable runnable = this.f26387t;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x010e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDraw(android.graphics.Canvas r16) {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.media.widget.CastSeekBar.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public synchronized void onMeasure(int i9, int i10) {
        setMeasuredDimension(View.resolveSizeAndState((int) (this.f26375h + getPaddingLeft() + getPaddingRight()), i9, 0), View.resolveSizeAndState((int) (this.f26376i + getPaddingTop() + getPaddingBottom()), i10, 0));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || !this.f26369a.f49953f) {
            return false;
        }
        if (this.f26386s == null) {
            this.f26386s = new Point();
        }
        if (this.f26385r == null) {
            this.f26385r = new int[2];
        }
        getLocationOnScreen(this.f26385r);
        this.f26386s.set((((int) motionEvent.getRawX()) - this.f26385r[0]) - getPaddingLeft(), ((int) motionEvent.getRawY()) - this.f26385r[1]);
        int action = motionEvent.getAction();
        if (action == 0) {
            i();
            h(f(this.f26386s.x));
            return true;
        }
        if (action == 1) {
            h(f(this.f26386s.x));
            j();
            return true;
        }
        if (action == 2) {
            h(f(this.f26386s.x));
            return true;
        }
        if (action != 3) {
            return false;
        }
        this.f26370c = false;
        this.f26371d = null;
        AbstractC2713e abstractC2713e = this.f26374g;
        if (abstractC2713e != null) {
            abstractC2713e.a(this, getProgress(), true);
            this.f26374g.c(this);
        }
        postInvalidate();
        return true;
    }
}
