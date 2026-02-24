package com.nst.iptvsmarterstvbox.miscelleneious;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.VideoView;

/* JADX INFO: loaded from: classes.dex */
public class FullScreenVideoView extends VideoView {
    public FullScreenVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.VideoView, android.view.SurfaceView, android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        setMeasuredDimension(i9, i10);
    }
}
