package com.nst.iptvsmarterstvbox.view.utility;

import a7.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;
import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes4.dex */
public class ListViewMaxHeight extends ListView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37689a;

    public ListViewMaxHeight(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ListViewMaxHeight(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        if (attributeSet == null) {
            this.f37689a = 0;
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, l.f13468c);
        this.f37689a = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f13469d, a.e.API_PRIORITY_OTHER);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        int i11 = this.f37689a;
        if (i11 > 0 && i11 < size) {
            i10 = View.MeasureSpec.makeMeasureSpec(this.f37689a, View.MeasureSpec.getMode(i10));
        }
        super.onMeasure(i9, i10);
    }
}
