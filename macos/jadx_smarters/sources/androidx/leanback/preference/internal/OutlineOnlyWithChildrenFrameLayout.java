package androidx.leanback.preference.internal;

import android.content.Context;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class OutlineOnlyWithChildrenFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewOutlineProvider f15296a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewOutlineProvider f15297c;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            (OutlineOnlyWithChildrenFrameLayout.this.getChildCount() > 0 ? OutlineOnlyWithChildrenFrameLayout.this.f15297c : ViewOutlineProvider.BACKGROUND).getOutline(view, outline);
        }
    }

    public OutlineOnlyWithChildrenFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        super.onLayout(z9, i9, i10, i11, i12);
        invalidateOutline();
    }

    @Override // android.view.View
    public void setOutlineProvider(ViewOutlineProvider viewOutlineProvider) {
        this.f15297c = viewOutlineProvider;
        if (this.f15296a == null) {
            this.f15296a = new a();
        }
        super.setOutlineProvider(this.f15296a);
    }
}
