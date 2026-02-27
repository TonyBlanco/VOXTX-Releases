package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import o4.AbstractC2338o;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f26362a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f26366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f26367f;

    public i(h hVar) {
        this.f26367f = hVar;
        Resources resources = hVar.getResources();
        this.f26363b = resources.getDimensionPixelSize(AbstractC2338o.f45897d);
        this.f26364c = resources.getDimensionPixelOffset(AbstractC2338o.f45896c);
        this.f26365d = resources.getDimensionPixelSize(AbstractC2338o.f45900g);
        this.f26366e = resources.getDimensionPixelSize(AbstractC2338o.f45899f);
    }

    public final void a(Rect rect, Rect rect2) {
        View viewB = this.f26367f.b();
        if (rect.isEmpty() || rect2.isEmpty()) {
            viewB.layout(0, 0, 0, 0);
        } else {
            int iCenterY = rect.centerY();
            int iCenterX = rect.centerX();
            int iCenterY2 = rect2.centerY();
            int iHeight = rect.height();
            int i9 = this.f26363b;
            int iMax = Math.max(i9 + i9, iHeight) / 2;
            int i10 = this.f26364c;
            int i11 = iCenterY + iMax + i10;
            if (iCenterY < iCenterY2) {
                c(viewB, rect2.width(), rect2.bottom - i11);
                int iB = b(viewB, rect2.left, rect2.right, viewB.getMeasuredWidth(), iCenterX);
                viewB.layout(iB, i11, viewB.getMeasuredWidth() + iB, viewB.getMeasuredHeight() + i11);
            } else {
                int i12 = (iCenterY - iMax) - i10;
                c(viewB, rect2.width(), i12 - rect2.top);
                int iB2 = b(viewB, rect2.left, rect2.right, viewB.getMeasuredWidth(), iCenterX);
                viewB.layout(iB2, i12 - viewB.getMeasuredHeight(), viewB.getMeasuredWidth() + iB2, i12);
            }
        }
        this.f26362a.set(viewB.getLeft(), viewB.getTop(), viewB.getRight(), viewB.getBottom());
        this.f26367f.f().f(rect, this.f26362a);
        this.f26367f.d().b(rect);
    }

    public final int b(View view, int i9, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i13 = i12 - i9;
        int i14 = i10 - i12;
        int i15 = i12 - (i11 / 2);
        int i16 = i13 <= i14 ? i15 + this.f26366e : i15 - this.f26366e;
        int i17 = marginLayoutParams.leftMargin;
        if (i16 - i17 < i9) {
            return i9 + i17;
        }
        int i18 = marginLayoutParams.rightMargin;
        return (i16 + i11) + i18 > i10 ? (i10 - i11) - i18 : i16;
    }

    public final void c(View view, int i9, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(View.MeasureSpec.makeMeasureSpec(Math.min((i9 - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, this.f26365d), 1073741824), View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE));
    }
}
