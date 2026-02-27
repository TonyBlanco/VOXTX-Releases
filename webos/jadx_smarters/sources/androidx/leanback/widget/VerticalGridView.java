package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public class VerticalGridView extends AbstractC1147b {
    public VerticalGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VerticalGridView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f15622M0.q4(1);
        F1(context, attributeSet);
    }

    public void F1(Context context, AttributeSet attributeSet) {
        D1(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g0.l.f41118k0);
        setColumnWidth(typedArrayObtainStyledAttributes);
        setNumColumns(typedArrayObtainStyledAttributes.getInt(g0.l.f41122m0, 1));
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setColumnWidth(int i9) {
        this.f15622M0.s4(i9);
        requestLayout();
    }

    public void setColumnWidth(TypedArray typedArray) {
        if (typedArray.peekValue(g0.l.f41120l0) != null) {
            setColumnWidth(typedArray.getLayoutDimension(g0.l.f41120l0, 0));
        }
    }

    public void setNumColumns(int i9) {
        this.f15622M0.m4(i9);
        requestLayout();
    }
}
