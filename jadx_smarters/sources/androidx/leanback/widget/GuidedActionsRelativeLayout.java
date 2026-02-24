package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import g0.AbstractC1801f;

/* JADX INFO: loaded from: classes.dex */
class GuidedActionsRelativeLayout extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f15354a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15355c;

    public GuidedActionsRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GuidedActionsRelativeLayout(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f15355c = false;
        this.f15354a = GuidanceStylingRelativeLayout.a(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        super.onLayout(z9, i9, i10, i11, i12);
        this.f15355c = false;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        View viewFindViewById;
        int size = View.MeasureSpec.getSize(i10);
        if (size > 0 && (viewFindViewById = findViewById(AbstractC1801f.f41025i)) != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams();
            if (marginLayoutParams.topMargin < 0 && !this.f15355c) {
                this.f15355c = true;
            }
            if (this.f15355c) {
                marginLayoutParams.topMargin = (int) ((this.f15354a * size) / 100.0f);
            }
        }
        super.onMeasure(i9, i10);
    }
}
