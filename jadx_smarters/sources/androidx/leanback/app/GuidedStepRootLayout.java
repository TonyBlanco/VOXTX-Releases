package androidx.leanback.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.leanback.widget.a0;

/* JADX INFO: loaded from: classes.dex */
class GuidedStepRootLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15258a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15259c;

    public GuidedStepRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15258a = false;
        this.f15259c = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i9) {
        View viewFocusSearch = super.focusSearch(view, i9);
        if ((i9 != 17 && i9 != 66) || a0.a(this, viewFocusSearch)) {
            return viewFocusSearch;
        }
        if (getLayoutDirection() != 0 ? i9 != 66 : i9 != 17) {
            if (!this.f15259c) {
                return view;
            }
        } else if (!this.f15258a) {
            return view;
        }
        return viewFocusSearch;
    }
}
