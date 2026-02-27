package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class GuidedActionItemContainer extends AbstractC1168x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15353e;

    public GuidedActionItemContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GuidedActionItemContainer(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f15353e = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i9) {
        if (this.f15353e || !a0.a(this, view)) {
            return super.focusSearch(view, i9);
        }
        View viewFocusSearch = super.focusSearch(view, i9);
        if (a0.a(this, viewFocusSearch)) {
            return viewFocusSearch;
        }
        return null;
    }
}
