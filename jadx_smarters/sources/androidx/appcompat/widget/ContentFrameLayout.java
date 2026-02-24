package androidx.appcompat.widget;

import P.L;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TypedValue f13978a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f13979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TypedValue f13980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TypedValue f13981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TypedValue f13982f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TypedValue f13983g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f13984h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f13985i;

    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f13984h = new Rect();
    }

    public void a(int i9, int i10, int i11, int i12) {
        this.f13984h.set(i9, i10, i11, i12);
        if (L.W(this)) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f13982f == null) {
            this.f13982f = new TypedValue();
        }
        return this.f13982f;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f13983g == null) {
            this.f13983g = new TypedValue();
        }
        return this.f13983g;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f13980d == null) {
            this.f13980d = new TypedValue();
        }
        return this.f13980d;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f13981e == null) {
            this.f13981e = new TypedValue();
        }
        return this.f13981e;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f13978a == null) {
            this.f13978a = new TypedValue();
        }
        return this.f13978a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f13979c == null) {
            this.f13979c = new TypedValue();
        }
        return this.f13979c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f13985i;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f13985i;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00db  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.f13985i = aVar;
    }
}
