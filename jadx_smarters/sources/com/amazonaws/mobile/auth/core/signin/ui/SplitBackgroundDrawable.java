package com.amazonaws.mobile.auth.core.signin.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class SplitBackgroundDrawable extends Drawable {
    private static final int DEFAULT_BACKGROUND_COLOR = -1;
    private int distanceFromTopToSplitPoint;
    private Paint paint;
    private int topBackgroundColor;

    public SplitBackgroundDrawable(int i9) {
        this.distanceFromTopToSplitPoint = -1;
        this.paint = new Paint();
        this.topBackgroundColor = -1;
        setSplitPointDistanceFromTop(i9);
    }

    public SplitBackgroundDrawable(int i9, int i10) {
        this.distanceFromTopToSplitPoint = -1;
        this.paint = new Paint();
        this.topBackgroundColor = i10;
        setSplitPointDistanceFromTop(i9);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.paint.setColor(this.topBackgroundColor);
        float fHeight = this.distanceFromTopToSplitPoint < bounds.height() ? this.distanceFromTopToSplitPoint : bounds.height();
        canvas.drawRect(0.0f, 0.0f, bounds.width(), fHeight, this.paint);
        this.paint.setColor(-1);
        canvas.drawRect(0.0f, fHeight, bounds.width(), bounds.height(), this.paint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i9) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setSplitPointDistanceFromTop(int i9) {
        this.distanceFromTopToSplitPoint = i9;
        invalidateSelf();
    }
}
