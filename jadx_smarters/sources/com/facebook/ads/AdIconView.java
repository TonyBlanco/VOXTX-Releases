package com.facebook.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Deprecated
public class AdIconView extends MediaView {
    public AdIconView(Context context) {
        super(context);
    }

    public AdIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AdIconView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
    }

    @TargetApi(21)
    public AdIconView(Context context, AttributeSet attributeSet, int i9, int i10) {
        super(context, attributeSet, i9, i10);
    }
}
