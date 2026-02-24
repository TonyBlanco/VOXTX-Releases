package com.google.android.exoplayer2.ui;

import a4.AbstractC1110y;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f25797a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f25798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25799d;

    public interface b {
    }

    public final class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f25800a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f25801c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f25802d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f25803e;

        public c() {
        }

        public void a(float f9, float f10, boolean z9) {
            this.f25800a = f9;
            this.f25801c = f10;
            this.f25802d = z9;
            if (this.f25803e) {
                return;
            }
            this.f25803e = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f25803e = false;
            AspectRatioFrameLayout.a(AspectRatioFrameLayout.this);
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25799d = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC1110y.f11772a, 0, 0);
            try {
                this.f25799d = typedArrayObtainStyledAttributes.getInt(AbstractC1110y.f11774b, 0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.f25797a = new c();
    }

    public static /* synthetic */ b a(AspectRatioFrameLayout aspectRatioFrameLayout) {
        aspectRatioFrameLayout.getClass();
        return null;
    }

    public int getResizeMode() {
        return this.f25799d;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            super.onMeasure(r9, r10)
            float r9 = r8.f25798c
            r10 = 0
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 > 0) goto Lb
            return
        Lb:
            int r9 = r8.getMeasuredWidth()
            int r0 = r8.getMeasuredHeight()
            float r1 = (float) r9
            float r2 = (float) r0
            float r3 = r1 / r2
            float r4 = r8.f25798c
            float r4 = r4 / r3
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r5
            float r5 = java.lang.Math.abs(r4)
            r6 = 1008981770(0x3c23d70a, float:0.01)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L31
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout$c r9 = r8.f25797a
            float r10 = r8.f25798c
            r0 = 0
            r9.a(r10, r3, r0)
            return
        L31:
            int r5 = r8.f25799d
            r6 = 1
            if (r5 == 0) goto L4e
            if (r5 == r6) goto L49
            r7 = 2
            if (r5 == r7) goto L43
            r7 = 4
            if (r5 == r7) goto L3f
            goto L53
        L3f:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 <= 0) goto L49
        L43:
            float r9 = r8.f25798c
            float r2 = r2 * r9
            int r9 = (int) r2
            goto L53
        L49:
            float r10 = r8.f25798c
            float r1 = r1 / r10
            int r0 = (int) r1
            goto L53
        L4e:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 <= 0) goto L43
            goto L49
        L53:
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout$c r10 = r8.f25797a
            float r1 = r8.f25798c
            r10.a(r1, r3, r6)
            r10 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r10)
            super.onMeasure(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.AspectRatioFrameLayout.onMeasure(int, int):void");
    }

    public void setAspectRatio(float f9) {
        if (this.f25798c != f9) {
            this.f25798c = f9;
            requestLayout();
        }
    }

    public void setAspectRatioListener(b bVar) {
    }

    public void setResizeMode(int i9) {
        if (this.f25799d != i9) {
            this.f25799d = i9;
            requestLayout();
        }
    }
}
