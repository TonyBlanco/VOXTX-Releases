package com.wang.avi;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import com.amazonaws.services.s3.model.InstructionFileId;
import d8.AbstractC1715a;
import d8.AbstractC1716b;
import d8.AbstractC1717c;
import e8.C1749a;

/* JADX INFO: loaded from: classes4.dex */
public class AVLoadingIndicatorView extends View {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C1749a f39218o = new C1749a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f39219a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f39220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f39221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f39222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Runnable f39223f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Runnable f39224g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f39225h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f39226i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f39227j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f39228k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AbstractC1715a f39229l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f39230m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f39231n;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AVLoadingIndicatorView.this.f39220c = false;
            AVLoadingIndicatorView.this.f39219a = -1L;
            AVLoadingIndicatorView.this.setVisibility(8);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AVLoadingIndicatorView.this.f39221d = false;
            if (AVLoadingIndicatorView.this.f39222e) {
                return;
            }
            AVLoadingIndicatorView.this.f39219a = System.currentTimeMillis();
            AVLoadingIndicatorView.this.setVisibility(0);
        }
    }

    public AVLoadingIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39219a = -1L;
        this.f39220c = false;
        this.f39221d = false;
        this.f39222e = false;
        this.f39223f = new a();
        this.f39224g = new b();
        g(context, attributeSet, 0, AbstractC1716b.f39855a);
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f9, float f10) {
        super.drawableHotspotChanged(f9, f10);
        AbstractC1715a abstractC1715a = this.f39229l;
        if (abstractC1715a != null) {
            abstractC1715a.setHotspot(f9, f10);
        }
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        l();
    }

    public void e(Canvas canvas) {
        AbstractC1715a abstractC1715a = this.f39229l;
        if (abstractC1715a != null) {
            int iSave = canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            abstractC1715a.draw(canvas);
            canvas.restoreToCount(iSave);
            if (this.f39231n) {
                abstractC1715a.start();
                this.f39231n = false;
            }
        }
    }

    public void f() {
        this.f39222e = true;
        removeCallbacks(this.f39224g);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j9 = this.f39219a;
        long j10 = jCurrentTimeMillis - j9;
        if (j10 >= 500 || j9 == -1) {
            setVisibility(8);
        } else {
            if (this.f39220c) {
                return;
            }
            postDelayed(this.f39223f, 500 - j10);
            this.f39220c = true;
        }
    }

    public final void g(Context context, AttributeSet attributeSet, int i9, int i10) {
        this.f39225h = 24;
        this.f39226i = 48;
        this.f39227j = 24;
        this.f39228k = 48;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1717c.f39856a, i9, i10);
        this.f39225h = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC1717c.f39862g, this.f39225h);
        this.f39226i = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC1717c.f39860e, this.f39226i);
        this.f39227j = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC1717c.f39861f, this.f39227j);
        this.f39228k = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC1717c.f39859d, this.f39228k);
        String string = typedArrayObtainStyledAttributes.getString(AbstractC1717c.f39858c);
        this.f39230m = typedArrayObtainStyledAttributes.getColor(AbstractC1717c.f39857b, -1);
        setIndicator(string);
        if (this.f39229l == null) {
            setIndicator(f39218o);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public AbstractC1715a getIndicator() {
        return this.f39229l;
    }

    public final void h() {
        removeCallbacks(this.f39223f);
        removeCallbacks(this.f39224g);
    }

    public void i() {
        if (getVisibility() != 0) {
            return;
        }
        if (this.f39229l instanceof Animatable) {
            this.f39231n = true;
        }
        postInvalidate();
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (!verifyDrawable(drawable)) {
            super.invalidateDrawable(drawable);
            return;
        }
        Rect bounds = drawable.getBounds();
        int scrollX = getScrollX() + getPaddingLeft();
        int scrollY = getScrollY() + getPaddingTop();
        invalidate(bounds.left + scrollX, bounds.top + scrollY, bounds.right + scrollX, bounds.bottom + scrollY);
    }

    public void j() {
        AbstractC1715a abstractC1715a = this.f39229l;
        if (abstractC1715a instanceof Animatable) {
            abstractC1715a.stop();
            this.f39231n = false;
        }
        postInvalidate();
    }

    public final void k(int i9, int i10) {
        int i11;
        int paddingRight = i9 - (getPaddingRight() + getPaddingLeft());
        int paddingTop = i10 - (getPaddingTop() + getPaddingBottom());
        if (this.f39229l != null) {
            float intrinsicWidth = r0.getIntrinsicWidth() / this.f39229l.getIntrinsicHeight();
            float f9 = paddingRight;
            float f10 = paddingTop;
            float f11 = f9 / f10;
            int i12 = 0;
            if (intrinsicWidth == f11) {
                i11 = 0;
            } else if (f11 > intrinsicWidth) {
                int i13 = (int) (f10 * intrinsicWidth);
                int i14 = (paddingRight - i13) / 2;
                i12 = i14;
                paddingRight = i13 + i14;
                i11 = 0;
            } else {
                int i15 = (int) (f9 * (1.0f / intrinsicWidth));
                int i16 = (paddingTop - i15) / 2;
                int i17 = i15 + i16;
                i11 = i16;
                paddingTop = i17;
            }
            this.f39229l.setBounds(i12, i11, paddingRight, paddingTop);
        }
    }

    public final void l() {
        int[] drawableState = getDrawableState();
        AbstractC1715a abstractC1715a = this.f39229l;
        if (abstractC1715a == null || !abstractC1715a.isStateful()) {
            return;
        }
        this.f39229l.setState(drawableState);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        i();
        h();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        j();
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        e(canvas);
    }

    @Override // android.view.View
    public synchronized void onMeasure(int i9, int i10) {
        int iMax;
        int iMax2;
        try {
            AbstractC1715a abstractC1715a = this.f39229l;
            if (abstractC1715a != null) {
                iMax2 = Math.max(this.f39225h, Math.min(this.f39226i, abstractC1715a.getIntrinsicWidth()));
                iMax = Math.max(this.f39227j, Math.min(this.f39228k, abstractC1715a.getIntrinsicHeight()));
            } else {
                iMax = 0;
                iMax2 = 0;
            }
            l();
            setMeasuredDimension(View.resolveSizeAndState(iMax2 + getPaddingLeft() + getPaddingRight(), i9, 0), View.resolveSizeAndState(iMax + getPaddingTop() + getPaddingBottom(), i10, 0));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        k(i9, i10);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i9) {
        super.onVisibilityChanged(view, i9);
        if (i9 == 8 || i9 == 4) {
            j();
        } else {
            i();
        }
    }

    public void setIndicator(AbstractC1715a abstractC1715a) {
        AbstractC1715a abstractC1715a2 = this.f39229l;
        if (abstractC1715a2 != abstractC1715a) {
            if (abstractC1715a2 != null) {
                abstractC1715a2.setCallback(null);
                unscheduleDrawable(this.f39229l);
            }
            this.f39229l = abstractC1715a;
            setIndicatorColor(this.f39230m);
            if (abstractC1715a != null) {
                abstractC1715a.setCallback(this);
            }
            postInvalidate();
        }
    }

    public void setIndicator(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (!str.contains(InstructionFileId.DOT)) {
            sb.append(getClass().getPackage().getName());
            sb.append(".indicators");
            sb.append(InstructionFileId.DOT);
        }
        sb.append(str);
        try {
            setIndicator((AbstractC1715a) Class.forName(sb.toString()).newInstance());
        } catch (ClassNotFoundException unused) {
            Log.e("AVLoadingIndicatorView", "Didn't find your class , check the name again !");
        } catch (IllegalAccessException e9) {
            e = e9;
            e.printStackTrace();
        } catch (InstantiationException e10) {
            e = e10;
            e.printStackTrace();
        }
    }

    public void setIndicatorColor(int i9) {
        this.f39230m = i9;
        this.f39229l.i(i9);
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
        if (getVisibility() != i9) {
            super.setVisibility(i9);
            if (i9 == 8 || i9 == 4) {
                j();
            } else {
                i();
            }
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f39229l || super.verifyDrawable(drawable);
    }
}
