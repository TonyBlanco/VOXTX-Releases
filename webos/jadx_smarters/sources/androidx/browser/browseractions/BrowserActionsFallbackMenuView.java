package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import o.AbstractC2300a;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14235a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14236c;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14235a = getResources().getDimensionPixelOffset(AbstractC2300a.f45702b);
        this.f14236c = getResources().getDimensionPixelOffset(AbstractC2300a.f45701a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f14235a * 2), this.f14236c), 1073741824), i10);
    }
}
