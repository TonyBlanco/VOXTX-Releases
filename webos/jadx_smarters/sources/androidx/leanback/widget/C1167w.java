package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import g0.AbstractC1801f;

/* JADX INFO: renamed from: androidx.leanback.widget.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1167w extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HorizontalGridView f15821a;

    public C1167w(Context context) {
        this(context, null);
    }

    public C1167w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1167w(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        LayoutInflater.from(context).inflate(g0.h.f41048a, this);
        HorizontalGridView horizontalGridView = (HorizontalGridView) findViewById(AbstractC1801f.f41040x);
        this.f15821a = horizontalGridView;
        horizontalGridView.setHasFixedSize(false);
        setOrientation(1);
        setDescendantFocusability(262144);
    }

    public HorizontalGridView getGridView() {
        return this.f15821a;
    }
}
